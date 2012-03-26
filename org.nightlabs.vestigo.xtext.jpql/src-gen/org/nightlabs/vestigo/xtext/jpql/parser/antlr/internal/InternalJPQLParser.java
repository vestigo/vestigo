package org.nightlabs.vestigo.xtext.jpql.parser.antlr.internal; 

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
import org.nightlabs.vestigo.xtext.jpql.services.JPQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalJPQLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_82", "KEYWORD_80", "KEYWORD_81", "KEYWORD_79", "KEYWORD_77", "KEYWORD_78", "KEYWORD_75", "KEYWORD_76", "KEYWORD_64", "KEYWORD_65", "KEYWORD_66", "KEYWORD_67", "KEYWORD_68", "KEYWORD_69", "KEYWORD_70", "KEYWORD_71", "KEYWORD_72", "KEYWORD_73", "KEYWORD_74", "KEYWORD_51", "KEYWORD_52", "KEYWORD_53", "KEYWORD_54", "KEYWORD_55", "KEYWORD_56", "KEYWORD_57", "KEYWORD_58", "KEYWORD_59", "KEYWORD_60", "KEYWORD_61", "KEYWORD_62", "KEYWORD_63", "KEYWORD_37", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_41", "KEYWORD_42", "KEYWORD_43", "KEYWORD_44", "KEYWORD_45", "KEYWORD_46", "KEYWORD_47", "KEYWORD_48", "KEYWORD_49", "KEYWORD_50", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_31", "KEYWORD_32", "KEYWORD_33", "KEYWORD_34", "KEYWORD_35", "KEYWORD_36", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=86;
    public static final int RULE_ANY_OTHER=92;
    public static final int KEYWORD_56=28;
    public static final int KEYWORD_55=27;
    public static final int KEYWORD_54=26;
    public static final int KEYWORD_53=25;
    public static final int KEYWORD_52=24;
    public static final int KEYWORD_51=23;
    public static final int KEYWORD_50=49;
    public static final int EOF=-1;
    public static final int KEYWORD_59=31;
    public static final int KEYWORD_58=30;
    public static final int KEYWORD_57=29;
    public static final int KEYWORD_65=13;
    public static final int KEYWORD_64=12;
    public static final int KEYWORD_67=15;
    public static final int KEYWORD_66=14;
    public static final int KEYWORD_61=33;
    public static final int KEYWORD_60=32;
    public static final int KEYWORD_63=35;
    public static final int KEYWORD_62=34;
    public static final int KEYWORD_69=17;
    public static final int KEYWORD_68=16;
    public static final int KEYWORD_30=57;
    public static final int KEYWORD_34=61;
    public static final int KEYWORD_33=60;
    public static final int KEYWORD_32=59;
    public static final int KEYWORD_31=58;
    public static final int KEYWORD_38=37;
    public static final int KEYWORD_37=36;
    public static final int KEYWORD_36=63;
    public static final int KEYWORD_35=62;
    public static final int RULE_ML_COMMENT=89;
    public static final int KEYWORD_39=38;
    public static final int RULE_STRING=88;
    public static final int KEYWORD_41=40;
    public static final int KEYWORD_40=39;
    public static final int KEYWORD_43=42;
    public static final int KEYWORD_42=41;
    public static final int KEYWORD_45=44;
    public static final int KEYWORD_44=43;
    public static final int KEYWORD_47=46;
    public static final int KEYWORD_46=45;
    public static final int KEYWORD_49=48;
    public static final int KEYWORD_48=47;
    public static final int KEYWORD_19=69;
    public static final int KEYWORD_17=67;
    public static final int KEYWORD_18=68;
    public static final int KEYWORD_15=65;
    public static final int KEYWORD_16=66;
    public static final int KEYWORD_13=85;
    public static final int KEYWORD_14=64;
    public static final int KEYWORD_11=83;
    public static final int KEYWORD_12=84;
    public static final int KEYWORD_10=82;
    public static final int KEYWORD_6=78;
    public static final int KEYWORD_7=79;
    public static final int KEYWORD_8=80;
    public static final int KEYWORD_9=81;
    public static final int KEYWORD_28=55;
    public static final int KEYWORD_29=56;
    public static final int RULE_INT=87;
    public static final int KEYWORD_24=51;
    public static final int KEYWORD_25=52;
    public static final int KEYWORD_26=53;
    public static final int KEYWORD_27=54;
    public static final int KEYWORD_20=70;
    public static final int KEYWORD_21=71;
    public static final int KEYWORD_22=72;
    public static final int KEYWORD_23=50;
    public static final int KEYWORD_79=7;
    public static final int KEYWORD_71=19;
    public static final int KEYWORD_72=20;
    public static final int KEYWORD_73=21;
    public static final int KEYWORD_74=22;
    public static final int KEYWORD_75=10;
    public static final int KEYWORD_76=11;
    public static final int KEYWORD_77=8;
    public static final int KEYWORD_78=9;
    public static final int KEYWORD_1=73;
    public static final int KEYWORD_5=77;
    public static final int KEYWORD_4=76;
    public static final int KEYWORD_70=18;
    public static final int KEYWORD_3=75;
    public static final int KEYWORD_2=74;
    public static final int RULE_SL_COMMENT=90;
    public static final int KEYWORD_82=4;
    public static final int KEYWORD_81=6;
    public static final int KEYWORD_80=5;
    public static final int RULE_WS=91;

    // delegates
    // delegators


        public InternalJPQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJPQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJPQLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     

    	private JPQLGrammarAccess grammarAccess;
    	 	
    	public InternalJPQLParser(TokenStream input, JPQLGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "JPQLQuery";	
    	} 
    	   	   	
    	@Override
    	protected JPQLGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleJPQLQuery"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:68:1: entryRuleJPQLQuery returns [EObject current=null] : iv_ruleJPQLQuery= ruleJPQLQuery EOF ;
    public final EObject entryRuleJPQLQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJPQLQuery = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:69:2: (iv_ruleJPQLQuery= ruleJPQLQuery EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:70:2: iv_ruleJPQLQuery= ruleJPQLQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJPQLQueryRule()); 
            }
            pushFollow(FOLLOW_ruleJPQLQuery_in_entryRuleJPQLQuery73);
            iv_ruleJPQLQuery=ruleJPQLQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJPQLQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJPQLQuery83); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJPQLQuery"


    // $ANTLR start "ruleJPQLQuery"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:77:1: ruleJPQLQuery returns [EObject current=null] : (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement ) ;
    public final EObject ruleJPQLQuery() throws RecognitionException {
        EObject current = null;

        EObject this_SelectStatement_0 = null;

        EObject this_UpdateStatement_1 = null;

        EObject this_DeleteStatement_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:80:28: ( (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:81:1: (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:81:1: (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement )
            int alt1=3;
            switch ( input.LA(1) ) {
            case KEYWORD_73:
            case KEYWORD_39:
                {
                alt1=1;
                }
                break;
            case KEYWORD_74:
                {
                alt1=2;
                }
                break;
            case KEYWORD_65:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:82:2: this_SelectStatement_0= ruleSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJPQLQueryAccess().getSelectStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleJPQLQuery133);
                    this_SelectStatement_0=ruleSelectStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_SelectStatement_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:95:2: this_UpdateStatement_1= ruleUpdateStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJPQLQueryAccess().getUpdateStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUpdateStatement_in_ruleJPQLQuery163);
                    this_UpdateStatement_1=ruleUpdateStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_UpdateStatement_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:108:2: this_DeleteStatement_2= ruleDeleteStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJPQLQueryAccess().getDeleteStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeleteStatement_in_ruleJPQLQuery193);
                    this_DeleteStatement_2=ruleDeleteStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_DeleteStatement_2;
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
    // $ANTLR end "ruleJPQLQuery"


    // $ANTLR start "entryRuleSelectStatement"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:127:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:128:2: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:129:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement227);
            iv_ruleSelectStatement=ruleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectStatement237); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectStatement"


    // $ANTLR start "ruleSelectStatement"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:136:1: ruleSelectStatement returns [EObject current=null] : ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_groupByClause_3_0= ruleGroupByClause ) )? ( (lv_orderByClause_4_0= ruleOrderByClause ) )? ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_selectClause_0_0 = null;

        EObject lv_fromClause_1_0 = null;

        EObject lv_whereClause_2_0 = null;

        EObject lv_groupByClause_3_0 = null;

        EObject lv_orderByClause_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:139:28: ( ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_groupByClause_3_0= ruleGroupByClause ) )? ( (lv_orderByClause_4_0= ruleOrderByClause ) )? ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:140:1: ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_groupByClause_3_0= ruleGroupByClause ) )? ( (lv_orderByClause_4_0= ruleOrderByClause ) )? )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:140:1: ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_groupByClause_3_0= ruleGroupByClause ) )? ( (lv_orderByClause_4_0= ruleOrderByClause ) )? )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:140:2: ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_groupByClause_3_0= ruleGroupByClause ) )? ( (lv_orderByClause_4_0= ruleOrderByClause ) )?
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:140:2: ( (lv_selectClause_0_0= ruleSelectClause ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==KEYWORD_73) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:141:1: (lv_selectClause_0_0= ruleSelectClause )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:141:1: (lv_selectClause_0_0= ruleSelectClause )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:142:3: lv_selectClause_0_0= ruleSelectClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getSelectClauseSelectClauseParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectClause_in_ruleSelectStatement283);
                    lv_selectClause_0_0=ruleSelectClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
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
                    break;

            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:158:3: ( (lv_fromClause_1_0= ruleFromClause ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:159:1: (lv_fromClause_1_0= ruleFromClause )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:159:1: (lv_fromClause_1_0= ruleFromClause )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:160:3: lv_fromClause_1_0= ruleFromClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectStatementAccess().getFromClauseFromClauseParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFromClause_in_ruleSelectStatement305);
            lv_fromClause_1_0=ruleFromClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
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

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:176:2: ( (lv_whereClause_2_0= ruleWhereClause ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_63) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:177:1: (lv_whereClause_2_0= ruleWhereClause )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:177:1: (lv_whereClause_2_0= ruleWhereClause )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:178:3: lv_whereClause_2_0= ruleWhereClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getWhereClauseWhereClauseParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleSelectStatement326);
                    lv_whereClause_2_0=ruleWhereClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
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

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:194:3: ( (lv_groupByClause_3_0= ruleGroupByClause ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==KEYWORD_55) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:195:1: (lv_groupByClause_3_0= ruleGroupByClause )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:195:1: (lv_groupByClause_3_0= ruleGroupByClause )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:196:3: lv_groupByClause_3_0= ruleGroupByClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getGroupByClauseGroupByClauseParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupByClause_in_ruleSelectStatement348);
                    lv_groupByClause_3_0=ruleGroupByClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"groupByClause",
                              		lv_groupByClause_3_0, 
                              		"GroupByClause");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:212:3: ( (lv_orderByClause_4_0= ruleOrderByClause ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==KEYWORD_60) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:213:1: (lv_orderByClause_4_0= ruleOrderByClause )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:213:1: (lv_orderByClause_4_0= ruleOrderByClause )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:214:3: lv_orderByClause_4_0= ruleOrderByClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getOrderByClauseOrderByClauseParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrderByClause_in_ruleSelectStatement370);
                    lv_orderByClause_4_0=ruleOrderByClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"orderByClause",
                              		lv_orderByClause_4_0, 
                              		"OrderByClause");
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
    // $ANTLR end "ruleSelectStatement"


    // $ANTLR start "entryRuleGroupByClause"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:238:1: entryRuleGroupByClause returns [EObject current=null] : iv_ruleGroupByClause= ruleGroupByClause EOF ;
    public final EObject entryRuleGroupByClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupByClause = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:239:2: (iv_ruleGroupByClause= ruleGroupByClause EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:240:2: iv_ruleGroupByClause= ruleGroupByClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupByClauseRule()); 
            }
            pushFollow(FOLLOW_ruleGroupByClause_in_entryRuleGroupByClause406);
            iv_ruleGroupByClause=ruleGroupByClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroupByClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupByClause416); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:247:1: ruleGroupByClause returns [EObject current=null] : (otherlv_0= KEYWORD_55 otherlv_1= KEYWORD_18 ( (lv_grouping_2_0= ruleAliasAttributeExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_grouping_4_0= ruleAliasAttributeExpression ) ) )* ( (lv_havingClause_5_0= ruleHavingClause ) )? ) ;
    public final EObject ruleGroupByClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_grouping_2_0 = null;

        EObject lv_grouping_4_0 = null;

        EObject lv_havingClause_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:250:28: ( (otherlv_0= KEYWORD_55 otherlv_1= KEYWORD_18 ( (lv_grouping_2_0= ruleAliasAttributeExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_grouping_4_0= ruleAliasAttributeExpression ) ) )* ( (lv_havingClause_5_0= ruleHavingClause ) )? ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:251:1: (otherlv_0= KEYWORD_55 otherlv_1= KEYWORD_18 ( (lv_grouping_2_0= ruleAliasAttributeExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_grouping_4_0= ruleAliasAttributeExpression ) ) )* ( (lv_havingClause_5_0= ruleHavingClause ) )? )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:251:1: (otherlv_0= KEYWORD_55 otherlv_1= KEYWORD_18 ( (lv_grouping_2_0= ruleAliasAttributeExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_grouping_4_0= ruleAliasAttributeExpression ) ) )* ( (lv_havingClause_5_0= ruleHavingClause ) )? )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:252:2: otherlv_0= KEYWORD_55 otherlv_1= KEYWORD_18 ( (lv_grouping_2_0= ruleAliasAttributeExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_grouping_4_0= ruleAliasAttributeExpression ) ) )* ( (lv_havingClause_5_0= ruleHavingClause ) )?
            {
            otherlv_0=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleGroupByClause454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGroupByClauseAccess().getGROUPKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleGroupByClause466); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGroupByClauseAccess().getBYKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:261:1: ( (lv_grouping_2_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:262:1: (lv_grouping_2_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:262:1: (lv_grouping_2_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:263:3: lv_grouping_2_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupByClauseAccess().getGroupingAliasAttributeExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleGroupByClause486);
            lv_grouping_2_0=ruleAliasAttributeExpression();

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
                      		"AliasAttributeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:279:2: (otherlv_3= KEYWORD_5 ( (lv_grouping_4_0= ruleAliasAttributeExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==KEYWORD_5) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:280:2: otherlv_3= KEYWORD_5 ( (lv_grouping_4_0= ruleAliasAttributeExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleGroupByClause500); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getGroupByClauseAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:284:1: ( (lv_grouping_4_0= ruleAliasAttributeExpression ) )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:285:1: (lv_grouping_4_0= ruleAliasAttributeExpression )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:285:1: (lv_grouping_4_0= ruleAliasAttributeExpression )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:286:3: lv_grouping_4_0= ruleAliasAttributeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroupByClauseAccess().getGroupingAliasAttributeExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleGroupByClause520);
            	    lv_grouping_4_0=ruleAliasAttributeExpression();

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
            	              		"AliasAttributeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:302:4: ( (lv_havingClause_5_0= ruleHavingClause ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KEYWORD_67) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:303:1: (lv_havingClause_5_0= ruleHavingClause )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:303:1: (lv_havingClause_5_0= ruleHavingClause )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:304:3: lv_havingClause_5_0= ruleHavingClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGroupByClauseAccess().getHavingClauseHavingClauseParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHavingClause_in_ruleGroupByClause543);
                    lv_havingClause_5_0=ruleHavingClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGroupByClauseRule());
                      	        }
                             		set(
                             			current, 
                             			"havingClause",
                              		lv_havingClause_5_0, 
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:328:1: entryRuleHavingClause returns [EObject current=null] : iv_ruleHavingClause= ruleHavingClause EOF ;
    public final EObject entryRuleHavingClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHavingClause = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:329:2: (iv_ruleHavingClause= ruleHavingClause EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:330:2: iv_ruleHavingClause= ruleHavingClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHavingClauseRule()); 
            }
            pushFollow(FOLLOW_ruleHavingClause_in_entryRuleHavingClause579);
            iv_ruleHavingClause=ruleHavingClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHavingClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHavingClause589); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:337:1: ruleHavingClause returns [EObject current=null] : (otherlv_0= KEYWORD_67 ( (lv_having_1_0= ruleOrExpression ) ) ) ;
    public final EObject ruleHavingClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_having_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:340:28: ( (otherlv_0= KEYWORD_67 ( (lv_having_1_0= ruleOrExpression ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:341:1: (otherlv_0= KEYWORD_67 ( (lv_having_1_0= ruleOrExpression ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:341:1: (otherlv_0= KEYWORD_67 ( (lv_having_1_0= ruleOrExpression ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:342:2: otherlv_0= KEYWORD_67 ( (lv_having_1_0= ruleOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_67,FOLLOW_KEYWORD_67_in_ruleHavingClause627); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getHavingClauseAccess().getHAVINGKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:346:1: ( (lv_having_1_0= ruleOrExpression ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:347:1: (lv_having_1_0= ruleOrExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:347:1: (lv_having_1_0= ruleOrExpression )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:348:3: lv_having_1_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHavingClauseAccess().getHavingOrExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleHavingClause647);
            lv_having_1_0=ruleOrExpression();

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
                      		"OrExpression");
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:372:1: entryRuleOrderByClause returns [EObject current=null] : iv_ruleOrderByClause= ruleOrderByClause EOF ;
    public final EObject entryRuleOrderByClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderByClause = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:373:2: (iv_ruleOrderByClause= ruleOrderByClause EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:374:2: iv_ruleOrderByClause= ruleOrderByClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderByClauseRule()); 
            }
            pushFollow(FOLLOW_ruleOrderByClause_in_entryRuleOrderByClause682);
            iv_ruleOrderByClause=ruleOrderByClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderByClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderByClause692); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:381:1: ruleOrderByClause returns [EObject current=null] : (otherlv_0= KEYWORD_60 otherlv_1= KEYWORD_18 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_5 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* ) ;
    public final EObject ruleOrderByClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ordering_2_0 = null;

        EObject lv_ordering_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:384:28: ( (otherlv_0= KEYWORD_60 otherlv_1= KEYWORD_18 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_5 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:385:1: (otherlv_0= KEYWORD_60 otherlv_1= KEYWORD_18 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_5 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:385:1: (otherlv_0= KEYWORD_60 otherlv_1= KEYWORD_18 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_5 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:386:2: otherlv_0= KEYWORD_60 otherlv_1= KEYWORD_18 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_5 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleOrderByClause730); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOrderByClauseAccess().getORDERKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleOrderByClause742); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOrderByClauseAccess().getBYKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:395:1: ( (lv_ordering_2_0= ruleOrderBySpec ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:396:1: (lv_ordering_2_0= ruleOrderBySpec )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:396:1: (lv_ordering_2_0= ruleOrderBySpec )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:397:3: lv_ordering_2_0= ruleOrderBySpec
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderByClauseAccess().getOrderingOrderBySpecParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrderBySpec_in_ruleOrderByClause762);
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

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:413:2: (otherlv_3= KEYWORD_5 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==KEYWORD_5) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:414:2: otherlv_3= KEYWORD_5 ( (lv_ordering_4_0= ruleOrderBySpec ) )
            	    {
            	    otherlv_3=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleOrderByClause776); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getOrderByClauseAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:418:1: ( (lv_ordering_4_0= ruleOrderBySpec ) )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:419:1: (lv_ordering_4_0= ruleOrderBySpec )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:419:1: (lv_ordering_4_0= ruleOrderBySpec )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:420:3: lv_ordering_4_0= ruleOrderBySpec
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrderByClauseAccess().getOrderingOrderBySpecParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrderBySpec_in_ruleOrderByClause796);
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
            	    break loop8;
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
    // $ANTLR end "ruleOrderByClause"


    // $ANTLR start "entryRuleOrderBySpec"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:444:1: entryRuleOrderBySpec returns [EObject current=null] : iv_ruleOrderBySpec= ruleOrderBySpec EOF ;
    public final EObject entryRuleOrderBySpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderBySpec = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:445:2: (iv_ruleOrderBySpec= ruleOrderBySpec EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:446:2: iv_ruleOrderBySpec= ruleOrderBySpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderBySpecRule()); 
            }
            pushFollow(FOLLOW_ruleOrderBySpec_in_entryRuleOrderBySpec833);
            iv_ruleOrderBySpec=ruleOrderBySpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderBySpec; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderBySpec843); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:453:1: ruleOrderBySpec returns [EObject current=null] : (this_AliasAttributeExpression_0= ruleAliasAttributeExpression ( (lv_direction_1_0= ruleOrderByDirection ) ) ) ;
    public final EObject ruleOrderBySpec() throws RecognitionException {
        EObject current = null;

        EObject this_AliasAttributeExpression_0 = null;

        Enumerator lv_direction_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:456:28: ( (this_AliasAttributeExpression_0= ruleAliasAttributeExpression ( (lv_direction_1_0= ruleOrderByDirection ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:457:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression ( (lv_direction_1_0= ruleOrderByDirection ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:457:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression ( (lv_direction_1_0= ruleOrderByDirection ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:458:2: this_AliasAttributeExpression_0= ruleAliasAttributeExpression ( (lv_direction_1_0= ruleOrderByDirection ) )
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrderBySpecAccess().getAliasAttributeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleOrderBySpec893);
            this_AliasAttributeExpression_0=ruleAliasAttributeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_AliasAttributeExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:469:1: ( (lv_direction_1_0= ruleOrderByDirection ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:470:1: (lv_direction_1_0= ruleOrderByDirection )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:470:1: (lv_direction_1_0= ruleOrderByDirection )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:471:3: lv_direction_1_0= ruleOrderByDirection
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderBySpecAccess().getDirectionOrderByDirectionEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrderByDirection_in_ruleOrderBySpec913);
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


    // $ANTLR start "entryRuleUpdateStatement"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:495:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:496:2: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:497:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateStatementRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement948);
            iv_ruleUpdateStatement=ruleUpdateStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement958); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUpdateStatement"


    // $ANTLR start "ruleUpdateStatement"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:504:1: ruleUpdateStatement returns [EObject current=null] : ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ) ;
    public final EObject ruleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_updateClause_0_0 = null;

        EObject lv_setClause_1_0 = null;

        EObject lv_whereClause_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:507:28: ( ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:508:1: ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:508:1: ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:508:2: ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )?
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:508:2: ( (lv_updateClause_0_0= ruleUpdateClause ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:509:1: (lv_updateClause_0_0= ruleUpdateClause )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:509:1: (lv_updateClause_0_0= ruleUpdateClause )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:510:3: lv_updateClause_0_0= ruleUpdateClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateClauseUpdateClauseParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUpdateClause_in_ruleUpdateStatement1004);
            lv_updateClause_0_0=ruleUpdateClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
              	        }
                     		set(
                     			current, 
                     			"updateClause",
                      		lv_updateClause_0_0, 
                      		"UpdateClause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:526:2: ( (lv_setClause_1_0= ruleSetClause ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:527:1: (lv_setClause_1_0= ruleSetClause )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:527:1: (lv_setClause_1_0= ruleSetClause )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:528:3: lv_setClause_1_0= ruleSetClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getSetClauseSetClauseParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSetClause_in_ruleUpdateStatement1025);
            lv_setClause_1_0=ruleSetClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
              	        }
                     		set(
                     			current, 
                     			"setClause",
                      		lv_setClause_1_0, 
                      		"SetClause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:544:2: ( (lv_whereClause_2_0= ruleWhereClause ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KEYWORD_63) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:545:1: (lv_whereClause_2_0= ruleWhereClause )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:545:1: (lv_whereClause_2_0= ruleWhereClause )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:546:3: lv_whereClause_2_0= ruleWhereClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getWhereClauseWhereClauseParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleUpdateStatement1046);
                    lv_whereClause_2_0=ruleWhereClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
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


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUpdateStatement"


    // $ANTLR start "entryRuleUpdateClause"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:570:1: entryRuleUpdateClause returns [EObject current=null] : iv_ruleUpdateClause= ruleUpdateClause EOF ;
    public final EObject entryRuleUpdateClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateClause = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:571:2: (iv_ruleUpdateClause= ruleUpdateClause EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:572:2: iv_ruleUpdateClause= ruleUpdateClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateClauseRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateClause_in_entryRuleUpdateClause1082);
            iv_ruleUpdateClause=ruleUpdateClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateClause1092); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUpdateClause"


    // $ANTLR start "ruleUpdateClause"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:579:1: ruleUpdateClause returns [EObject current=null] : (otherlv_0= KEYWORD_74 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_5 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) ;
    public final EObject ruleUpdateClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_fromEntries_1_0 = null;

        EObject lv_fromEntries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:582:28: ( (otherlv_0= KEYWORD_74 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_5 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:583:1: (otherlv_0= KEYWORD_74 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_5 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:583:1: (otherlv_0= KEYWORD_74 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_5 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:584:2: otherlv_0= KEYWORD_74 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_5 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_74,FOLLOW_KEYWORD_74_in_ruleUpdateClause1130); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUpdateClauseAccess().getUPDATEKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:588:1: ( (lv_fromEntries_1_0= ruleFromEntry ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:589:1: (lv_fromEntries_1_0= ruleFromEntry )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:589:1: (lv_fromEntries_1_0= ruleFromEntry )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:590:3: lv_fromEntries_1_0= ruleFromEntry
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateClauseAccess().getFromEntriesFromEntryParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFromEntry_in_ruleUpdateClause1150);
            lv_fromEntries_1_0=ruleFromEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUpdateClauseRule());
              	        }
                     		add(
                     			current, 
                     			"fromEntries",
                      		lv_fromEntries_1_0, 
                      		"FromEntry");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:606:2: (otherlv_2= KEYWORD_5 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==KEYWORD_5) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:607:2: otherlv_2= KEYWORD_5 ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleUpdateClause1164); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getUpdateClauseAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:611:1: ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:612:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:612:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:613:3: lv_fromEntries_3_0= ruleFromEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUpdateClauseAccess().getFromEntriesFromEntryParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFromEntry_in_ruleUpdateClause1184);
            	    lv_fromEntries_3_0=ruleFromEntry();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUpdateClauseRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fromEntries",
            	              		lv_fromEntries_3_0, 
            	              		"FromEntry");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleUpdateClause"


    // $ANTLR start "entryRuleSetClause"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:637:1: entryRuleSetClause returns [EObject current=null] : iv_ruleSetClause= ruleSetClause EOF ;
    public final EObject entryRuleSetClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetClause = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:638:2: (iv_ruleSetClause= ruleSetClause EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:639:2: iv_ruleSetClause= ruleSetClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetClauseRule()); 
            }
            pushFollow(FOLLOW_ruleSetClause_in_entryRuleSetClause1221);
            iv_ruleSetClause=ruleSetClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetClause1231); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetClause"


    // $ANTLR start "ruleSetClause"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:646:1: ruleSetClause returns [EObject current=null] : (otherlv_0= KEYWORD_35 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_5 ( (lv_items_3_0= ruleUpdateItem ) ) )* ) ;
    public final EObject ruleSetClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:649:28: ( (otherlv_0= KEYWORD_35 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_5 ( (lv_items_3_0= ruleUpdateItem ) ) )* ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:650:1: (otherlv_0= KEYWORD_35 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_5 ( (lv_items_3_0= ruleUpdateItem ) ) )* )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:650:1: (otherlv_0= KEYWORD_35 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_5 ( (lv_items_3_0= ruleUpdateItem ) ) )* )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:651:2: otherlv_0= KEYWORD_35 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_5 ( (lv_items_3_0= ruleUpdateItem ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleSetClause1269); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSetClauseAccess().getSETKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:655:1: ( (lv_items_1_0= ruleUpdateItem ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:656:1: (lv_items_1_0= ruleUpdateItem )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:656:1: (lv_items_1_0= ruleUpdateItem )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:657:3: lv_items_1_0= ruleUpdateItem
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSetClauseAccess().getItemsUpdateItemParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUpdateItem_in_ruleSetClause1289);
            lv_items_1_0=ruleUpdateItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSetClauseRule());
              	        }
                     		add(
                     			current, 
                     			"items",
                      		lv_items_1_0, 
                      		"UpdateItem");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:673:2: (otherlv_2= KEYWORD_5 ( (lv_items_3_0= ruleUpdateItem ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==KEYWORD_5) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:674:2: otherlv_2= KEYWORD_5 ( (lv_items_3_0= ruleUpdateItem ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleSetClause1303); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSetClauseAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:678:1: ( (lv_items_3_0= ruleUpdateItem ) )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:679:1: (lv_items_3_0= ruleUpdateItem )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:679:1: (lv_items_3_0= ruleUpdateItem )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:680:3: lv_items_3_0= ruleUpdateItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSetClauseAccess().getItemsUpdateItemParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUpdateItem_in_ruleSetClause1323);
            	    lv_items_3_0=ruleUpdateItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSetClauseRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"items",
            	              		lv_items_3_0, 
            	              		"UpdateItem");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleSetClause"


    // $ANTLR start "entryRuleUpdateItem"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:704:1: entryRuleUpdateItem returns [EObject current=null] : iv_ruleUpdateItem= ruleUpdateItem EOF ;
    public final EObject entryRuleUpdateItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateItem = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:705:2: (iv_ruleUpdateItem= ruleUpdateItem EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:706:2: iv_ruleUpdateItem= ruleUpdateItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateItemRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateItem_in_entryRuleUpdateItem1360);
            iv_ruleUpdateItem=ruleUpdateItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateItem1370); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUpdateItem"


    // $ANTLR start "ruleUpdateItem"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:713:1: ruleUpdateItem returns [EObject current=null] : ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_11 ( (lv_value_2_0= ruleLiteral ) ) ) ;
    public final EObject ruleUpdateItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_alias_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:716:28: ( ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_11 ( (lv_value_2_0= ruleLiteral ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:717:1: ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_11 ( (lv_value_2_0= ruleLiteral ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:717:1: ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_11 ( (lv_value_2_0= ruleLiteral ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:717:2: ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_11 ( (lv_value_2_0= ruleLiteral ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:717:2: ( (lv_alias_0_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:718:1: (lv_alias_0_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:718:1: (lv_alias_0_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:719:3: lv_alias_0_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateItemAccess().getAliasAliasAttributeExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleUpdateItem1416);
            lv_alias_0_0=ruleAliasAttributeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUpdateItemRule());
              	        }
                     		set(
                     			current, 
                     			"alias",
                      		lv_alias_0_0, 
                      		"AliasAttributeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleUpdateItem1429); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUpdateItemAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:740:1: ( (lv_value_2_0= ruleLiteral ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:741:1: (lv_value_2_0= ruleLiteral )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:741:1: (lv_value_2_0= ruleLiteral )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:742:3: lv_value_2_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateItemAccess().getValueLiteralParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_ruleUpdateItem1449);
            lv_value_2_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUpdateItemRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Literal");
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
    // $ANTLR end "ruleUpdateItem"


    // $ANTLR start "entryRuleDeleteStatement"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:766:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:767:2: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:768:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement1484);
            iv_ruleDeleteStatement=ruleDeleteStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteStatement1494); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeleteStatement"


    // $ANTLR start "ruleDeleteStatement"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:775:1: ruleDeleteStatement returns [EObject current=null] : ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_deleteClause_0_0 = null;

        EObject lv_whereClause_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:778:28: ( ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:779:1: ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:779:1: ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:779:2: ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )?
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:779:2: ( (lv_deleteClause_0_0= ruleDeleteClause ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:780:1: (lv_deleteClause_0_0= ruleDeleteClause )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:780:1: (lv_deleteClause_0_0= ruleDeleteClause )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:781:3: lv_deleteClause_0_0= ruleDeleteClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeleteStatementAccess().getDeleteClauseDeleteClauseParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDeleteClause_in_ruleDeleteStatement1540);
            lv_deleteClause_0_0=ruleDeleteClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeleteStatementRule());
              	        }
                     		set(
                     			current, 
                     			"deleteClause",
                      		lv_deleteClause_0_0, 
                      		"DeleteClause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:797:2: ( (lv_whereClause_1_0= ruleWhereClause ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==KEYWORD_63) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:798:1: (lv_whereClause_1_0= ruleWhereClause )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:798:1: (lv_whereClause_1_0= ruleWhereClause )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:799:3: lv_whereClause_1_0= ruleWhereClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeleteStatementAccess().getWhereClauseWhereClauseParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleDeleteStatement1561);
                    lv_whereClause_1_0=ruleWhereClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDeleteStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"whereClause",
                              		lv_whereClause_1_0, 
                              		"WhereClause");
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
    // $ANTLR end "ruleDeleteStatement"


    // $ANTLR start "entryRuleDeleteClause"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:823:1: entryRuleDeleteClause returns [EObject current=null] : iv_ruleDeleteClause= ruleDeleteClause EOF ;
    public final EObject entryRuleDeleteClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteClause = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:824:2: (iv_ruleDeleteClause= ruleDeleteClause EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:825:2: iv_ruleDeleteClause= ruleDeleteClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteClauseRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteClause_in_entryRuleDeleteClause1597);
            iv_ruleDeleteClause=ruleDeleteClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteClause1607); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeleteClause"


    // $ANTLR start "ruleDeleteClause"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:832:1: ruleDeleteClause returns [EObject current=null] : (otherlv_0= KEYWORD_65 ( (lv_fromClause_1_0= ruleFromClause ) ) ) ;
    public final EObject ruleDeleteClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_fromClause_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:835:28: ( (otherlv_0= KEYWORD_65 ( (lv_fromClause_1_0= ruleFromClause ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:836:1: (otherlv_0= KEYWORD_65 ( (lv_fromClause_1_0= ruleFromClause ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:836:1: (otherlv_0= KEYWORD_65 ( (lv_fromClause_1_0= ruleFromClause ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:837:2: otherlv_0= KEYWORD_65 ( (lv_fromClause_1_0= ruleFromClause ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_ruleDeleteClause1645); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDeleteClauseAccess().getDELETEKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:841:1: ( (lv_fromClause_1_0= ruleFromClause ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:842:1: (lv_fromClause_1_0= ruleFromClause )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:842:1: (lv_fromClause_1_0= ruleFromClause )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:843:3: lv_fromClause_1_0= ruleFromClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeleteClauseAccess().getFromClauseFromClauseParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFromClause_in_ruleDeleteClause1665);
            lv_fromClause_1_0=ruleFromClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeleteClauseRule());
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


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeleteClause"


    // $ANTLR start "entryRuleSelectClause"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:867:1: entryRuleSelectClause returns [EObject current=null] : iv_ruleSelectClause= ruleSelectClause EOF ;
    public final EObject entryRuleSelectClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectClause = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:868:2: (iv_ruleSelectClause= ruleSelectClause EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:869:2: iv_ruleSelectClause= ruleSelectClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectClauseRule()); 
            }
            pushFollow(FOLLOW_ruleSelectClause_in_entryRuleSelectClause1700);
            iv_ruleSelectClause=ruleSelectClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectClause1710); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:876:1: ruleSelectClause returns [EObject current=null] : (otherlv_0= KEYWORD_73 ( (lv_isDistinct_1_0= KEYWORD_77 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* ) ;
    public final EObject ruleSelectClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isDistinct_1_0=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:879:28: ( (otherlv_0= KEYWORD_73 ( (lv_isDistinct_1_0= KEYWORD_77 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:880:1: (otherlv_0= KEYWORD_73 ( (lv_isDistinct_1_0= KEYWORD_77 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:880:1: (otherlv_0= KEYWORD_73 ( (lv_isDistinct_1_0= KEYWORD_77 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:881:2: otherlv_0= KEYWORD_73 ( (lv_isDistinct_1_0= KEYWORD_77 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_expressions_4_0= ruleSelectExpression ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_73,FOLLOW_KEYWORD_73_in_ruleSelectClause1748); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSelectClauseAccess().getSELECTKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:885:1: ( (lv_isDistinct_1_0= KEYWORD_77 ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==KEYWORD_77) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:886:1: (lv_isDistinct_1_0= KEYWORD_77 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:886:1: (lv_isDistinct_1_0= KEYWORD_77 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:887:3: lv_isDistinct_1_0= KEYWORD_77
                    {
                    lv_isDistinct_1_0=(Token)match(input,KEYWORD_77,FOLLOW_KEYWORD_77_in_ruleSelectClause1766); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isDistinct_1_0, grammarAccess.getSelectClauseAccess().getIsDistinctDISTINCTKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSelectClauseRule());
                      	        }
                             		setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:901:3: ( (lv_expressions_2_0= ruleSelectExpression ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:902:1: (lv_expressions_2_0= ruleSelectExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:902:1: (lv_expressions_2_0= ruleSelectExpression )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:903:3: lv_expressions_2_0= ruleSelectExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectClauseAccess().getExpressionsSelectExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectClause1799);
            lv_expressions_2_0=ruleSelectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSelectClauseRule());
              	        }
                     		add(
                     			current, 
                     			"expressions",
                      		lv_expressions_2_0, 
                      		"SelectExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:919:2: (otherlv_3= KEYWORD_5 ( (lv_expressions_4_0= ruleSelectExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==KEYWORD_5) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:920:2: otherlv_3= KEYWORD_5 ( (lv_expressions_4_0= ruleSelectExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleSelectClause1813); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getSelectClauseAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:924:1: ( (lv_expressions_4_0= ruleSelectExpression ) )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:925:1: (lv_expressions_4_0= ruleSelectExpression )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:925:1: (lv_expressions_4_0= ruleSelectExpression )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:926:3: lv_expressions_4_0= ruleSelectExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectClauseAccess().getExpressionsSelectExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectClause1833);
            	    lv_expressions_4_0=ruleSelectExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSelectClauseRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_4_0, 
            	              		"SelectExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleSelectClause"


    // $ANTLR start "entryRuleSelectExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:950:1: entryRuleSelectExpression returns [EObject current=null] : iv_ruleSelectExpression= ruleSelectExpression EOF ;
    public final EObject entryRuleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:951:2: (iv_ruleSelectExpression= ruleSelectExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:952:2: iv_ruleSelectExpression= ruleSelectExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression1870);
            iv_ruleSelectExpression=ruleSelectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectExpression1880); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectExpression"


    // $ANTLR start "ruleSelectExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:959:1: ruleSelectExpression returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression ) ;
    public final EObject ruleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;

        EObject this_SelectAggregateExpression_1 = null;

        EObject this_SelectConstructorExpression_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:962:28: ( (this_OrExpression_0= ruleOrExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:963:1: (this_OrExpression_0= ruleOrExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:963:1: (this_OrExpression_0= ruleOrExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression )
            int alt15=3;
            switch ( input.LA(1) ) {
            case KEYWORD_82:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_79:
            case KEYWORD_64:
            case KEYWORD_66:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_53:
            case KEYWORD_56:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_62:
            case KEYWORD_40:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_23:
            case KEYWORD_24:
            case KEYWORD_26:
            case KEYWORD_29:
            case KEYWORD_32:
            case KEYWORD_34:
            case KEYWORD_1:
            case KEYWORD_4:
            case KEYWORD_6:
            case KEYWORD_9:
            case KEYWORD_13:
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
                {
                alt15=1;
                }
                break;
            case KEYWORD_51:
            case KEYWORD_28:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_36:
                {
                alt15=2;
                }
                break;
            case KEYWORD_33:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:964:2: this_OrExpression_0= ruleOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectExpressionAccess().getOrExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOrExpression_in_ruleSelectExpression1930);
                    this_OrExpression_0=ruleOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_OrExpression_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:977:2: this_SelectAggregateExpression_1= ruleSelectAggregateExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectExpressionAccess().getSelectAggregateExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectAggregateExpression_in_ruleSelectExpression1960);
                    this_SelectAggregateExpression_1=ruleSelectAggregateExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_SelectAggregateExpression_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:990:2: this_SelectConstructorExpression_2= ruleSelectConstructorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectExpressionAccess().getSelectConstructorExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectConstructorExpression_in_ruleSelectExpression1990);
                    this_SelectConstructorExpression_2=ruleSelectConstructorExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_SelectConstructorExpression_2;
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
    // $ANTLR end "ruleSelectExpression"


    // $ANTLR start "entryRuleSelectAggregateExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1009:1: entryRuleSelectAggregateExpression returns [EObject current=null] : iv_ruleSelectAggregateExpression= ruleSelectAggregateExpression EOF ;
    public final EObject entryRuleSelectAggregateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectAggregateExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1010:2: (iv_ruleSelectAggregateExpression= ruleSelectAggregateExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1011:2: iv_ruleSelectAggregateExpression= ruleSelectAggregateExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectAggregateExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectAggregateExpression_in_entryRuleSelectAggregateExpression2024);
            iv_ruleSelectAggregateExpression=ruleSelectAggregateExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectAggregateExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectAggregateExpression2034); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectAggregateExpression"


    // $ANTLR start "ruleSelectAggregateExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1018:1: ruleSelectAggregateExpression returns [EObject current=null] : (this_AvgAggregate_0= ruleAvgAggregate | this_CountAggregate_1= ruleCountAggregate | this_MaxAggregate_2= ruleMaxAggregate | this_MinAggregate_3= ruleMinAggregate | this_SumAggregate_4= ruleSumAggregate ) ;
    public final EObject ruleSelectAggregateExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AvgAggregate_0 = null;

        EObject this_CountAggregate_1 = null;

        EObject this_MaxAggregate_2 = null;

        EObject this_MinAggregate_3 = null;

        EObject this_SumAggregate_4 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1021:28: ( (this_AvgAggregate_0= ruleAvgAggregate | this_CountAggregate_1= ruleCountAggregate | this_MaxAggregate_2= ruleMaxAggregate | this_MinAggregate_3= ruleMinAggregate | this_SumAggregate_4= ruleSumAggregate ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1022:1: (this_AvgAggregate_0= ruleAvgAggregate | this_CountAggregate_1= ruleCountAggregate | this_MaxAggregate_2= ruleMaxAggregate | this_MinAggregate_3= ruleMinAggregate | this_SumAggregate_4= ruleSumAggregate )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1022:1: (this_AvgAggregate_0= ruleAvgAggregate | this_CountAggregate_1= ruleCountAggregate | this_MaxAggregate_2= ruleMaxAggregate | this_MinAggregate_3= ruleMinAggregate | this_SumAggregate_4= ruleSumAggregate )
            int alt16=5;
            switch ( input.LA(1) ) {
            case KEYWORD_28:
                {
                alt16=1;
                }
                break;
            case KEYWORD_51:
                {
                alt16=2;
                }
                break;
            case KEYWORD_30:
                {
                alt16=3;
                }
                break;
            case KEYWORD_31:
                {
                alt16=4;
                }
                break;
            case KEYWORD_36:
                {
                alt16=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1023:2: this_AvgAggregate_0= ruleAvgAggregate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getAvgAggregateParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAvgAggregate_in_ruleSelectAggregateExpression2084);
                    this_AvgAggregate_0=ruleAvgAggregate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_AvgAggregate_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1036:2: this_CountAggregate_1= ruleCountAggregate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getCountAggregateParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCountAggregate_in_ruleSelectAggregateExpression2114);
                    this_CountAggregate_1=ruleCountAggregate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_CountAggregate_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1049:2: this_MaxAggregate_2= ruleMaxAggregate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getMaxAggregateParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMaxAggregate_in_ruleSelectAggregateExpression2144);
                    this_MaxAggregate_2=ruleMaxAggregate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_MaxAggregate_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1062:2: this_MinAggregate_3= ruleMinAggregate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getMinAggregateParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMinAggregate_in_ruleSelectAggregateExpression2174);
                    this_MinAggregate_3=ruleMinAggregate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_MinAggregate_3;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1075:2: this_SumAggregate_4= ruleSumAggregate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getSumAggregateParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSumAggregate_in_ruleSelectAggregateExpression2204);
                    this_SumAggregate_4=ruleSumAggregate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_SumAggregate_4;
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
    // $ANTLR end "ruleSelectAggregateExpression"


    // $ANTLR start "entryRuleAvgAggregate"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1094:1: entryRuleAvgAggregate returns [EObject current=null] : iv_ruleAvgAggregate= ruleAvgAggregate EOF ;
    public final EObject entryRuleAvgAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvgAggregate = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1095:2: (iv_ruleAvgAggregate= ruleAvgAggregate EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1096:2: iv_ruleAvgAggregate= ruleAvgAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAvgAggregateRule()); 
            }
            pushFollow(FOLLOW_ruleAvgAggregate_in_entryRuleAvgAggregate2238);
            iv_ruleAvgAggregate=ruleAvgAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAvgAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvgAggregate2248); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAvgAggregate"


    // $ANTLR start "ruleAvgAggregate"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1103:1: ruleAvgAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_28 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_77 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleAvgAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1106:28: ( (otherlv_0= KEYWORD_28 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_77 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1107:1: (otherlv_0= KEYWORD_28 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_77 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1107:1: (otherlv_0= KEYWORD_28 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_77 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1108:2: otherlv_0= KEYWORD_28 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_77 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleAvgAggregate2286); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAvgAggregateAccess().getAVGKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleAvgAggregate2298); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAvgAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1117:1: ( (lv_isDistinct_2_0= KEYWORD_77 ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==KEYWORD_77) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1118:1: (lv_isDistinct_2_0= KEYWORD_77 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1118:1: (lv_isDistinct_2_0= KEYWORD_77 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1119:3: lv_isDistinct_2_0= KEYWORD_77
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_77,FOLLOW_KEYWORD_77_in_ruleAvgAggregate2316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isDistinct_2_0, grammarAccess.getAvgAggregateAccess().getIsDistinctDISTINCTKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAvgAggregateRule());
                      	        }
                             		setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1133:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1134:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1134:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1135:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAvgAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleAvgAggregate2349);
            lv_item_3_0=ruleAliasAttributeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAvgAggregateRule());
              	        }
                     		set(
                     			current, 
                     			"item",
                      		lv_item_3_0, 
                      		"AliasAttributeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleAvgAggregate2362); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAvgAggregateAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleAvgAggregate"


    // $ANTLR start "entryRuleCountAggregate"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1164:1: entryRuleCountAggregate returns [EObject current=null] : iv_ruleCountAggregate= ruleCountAggregate EOF ;
    public final EObject entryRuleCountAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountAggregate = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1165:2: (iv_ruleCountAggregate= ruleCountAggregate EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1166:2: iv_ruleCountAggregate= ruleCountAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCountAggregateRule()); 
            }
            pushFollow(FOLLOW_ruleCountAggregate_in_entryRuleCountAggregate2396);
            iv_ruleCountAggregate=ruleCountAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCountAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCountAggregate2406); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCountAggregate"


    // $ANTLR start "ruleCountAggregate"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1173:1: ruleCountAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_51 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_77 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleCountAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1176:28: ( (otherlv_0= KEYWORD_51 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_77 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1177:1: (otherlv_0= KEYWORD_51 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_77 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1177:1: (otherlv_0= KEYWORD_51 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_77 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1178:2: otherlv_0= KEYWORD_51 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_77 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleCountAggregate2444); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCountAggregateAccess().getCOUNTKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleCountAggregate2456); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCountAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1187:1: ( (lv_isDistinct_2_0= KEYWORD_77 ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KEYWORD_77) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1188:1: (lv_isDistinct_2_0= KEYWORD_77 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1188:1: (lv_isDistinct_2_0= KEYWORD_77 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1189:3: lv_isDistinct_2_0= KEYWORD_77
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_77,FOLLOW_KEYWORD_77_in_ruleCountAggregate2474); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isDistinct_2_0, grammarAccess.getCountAggregateAccess().getIsDistinctDISTINCTKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCountAggregateRule());
                      	        }
                             		setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1203:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1204:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1204:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1205:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCountAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleCountAggregate2507);
            lv_item_3_0=ruleAliasAttributeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCountAggregateRule());
              	        }
                     		set(
                     			current, 
                     			"item",
                      		lv_item_3_0, 
                      		"AliasAttributeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleCountAggregate2520); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCountAggregateAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleCountAggregate"


    // $ANTLR start "entryRuleMaxAggregate"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1234:1: entryRuleMaxAggregate returns [EObject current=null] : iv_ruleMaxAggregate= ruleMaxAggregate EOF ;
    public final EObject entryRuleMaxAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxAggregate = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1235:2: (iv_ruleMaxAggregate= ruleMaxAggregate EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1236:2: iv_ruleMaxAggregate= ruleMaxAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaxAggregateRule()); 
            }
            pushFollow(FOLLOW_ruleMaxAggregate_in_entryRuleMaxAggregate2554);
            iv_ruleMaxAggregate=ruleMaxAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaxAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxAggregate2564); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaxAggregate"


    // $ANTLR start "ruleMaxAggregate"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1243:1: ruleMaxAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_30 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_77 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleMaxAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1246:28: ( (otherlv_0= KEYWORD_30 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_77 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1247:1: (otherlv_0= KEYWORD_30 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_77 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1247:1: (otherlv_0= KEYWORD_30 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_77 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1248:2: otherlv_0= KEYWORD_30 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_77 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleMaxAggregate2602); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMaxAggregateAccess().getMAXKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleMaxAggregate2614); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMaxAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1257:1: ( (lv_isDistinct_2_0= KEYWORD_77 ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KEYWORD_77) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1258:1: (lv_isDistinct_2_0= KEYWORD_77 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1258:1: (lv_isDistinct_2_0= KEYWORD_77 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1259:3: lv_isDistinct_2_0= KEYWORD_77
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_77,FOLLOW_KEYWORD_77_in_ruleMaxAggregate2632); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isDistinct_2_0, grammarAccess.getMaxAggregateAccess().getIsDistinctDISTINCTKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMaxAggregateRule());
                      	        }
                             		setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1273:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1274:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1274:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1275:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaxAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleMaxAggregate2665);
            lv_item_3_0=ruleAliasAttributeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMaxAggregateRule());
              	        }
                     		set(
                     			current, 
                     			"item",
                      		lv_item_3_0, 
                      		"AliasAttributeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleMaxAggregate2678); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMaxAggregateAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleMaxAggregate"


    // $ANTLR start "entryRuleMinAggregate"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1304:1: entryRuleMinAggregate returns [EObject current=null] : iv_ruleMinAggregate= ruleMinAggregate EOF ;
    public final EObject entryRuleMinAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinAggregate = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1305:2: (iv_ruleMinAggregate= ruleMinAggregate EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1306:2: iv_ruleMinAggregate= ruleMinAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinAggregateRule()); 
            }
            pushFollow(FOLLOW_ruleMinAggregate_in_entryRuleMinAggregate2712);
            iv_ruleMinAggregate=ruleMinAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinAggregate2722); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinAggregate"


    // $ANTLR start "ruleMinAggregate"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1313:1: ruleMinAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_31 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_77 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleMinAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1316:28: ( (otherlv_0= KEYWORD_31 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_77 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1317:1: (otherlv_0= KEYWORD_31 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_77 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1317:1: (otherlv_0= KEYWORD_31 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_77 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1318:2: otherlv_0= KEYWORD_31 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_77 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleMinAggregate2760); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMinAggregateAccess().getMINKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleMinAggregate2772); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMinAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1327:1: ( (lv_isDistinct_2_0= KEYWORD_77 ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KEYWORD_77) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1328:1: (lv_isDistinct_2_0= KEYWORD_77 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1328:1: (lv_isDistinct_2_0= KEYWORD_77 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1329:3: lv_isDistinct_2_0= KEYWORD_77
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_77,FOLLOW_KEYWORD_77_in_ruleMinAggregate2790); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isDistinct_2_0, grammarAccess.getMinAggregateAccess().getIsDistinctDISTINCTKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMinAggregateRule());
                      	        }
                             		setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1343:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1344:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1344:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1345:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleMinAggregate2823);
            lv_item_3_0=ruleAliasAttributeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMinAggregateRule());
              	        }
                     		set(
                     			current, 
                     			"item",
                      		lv_item_3_0, 
                      		"AliasAttributeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleMinAggregate2836); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMinAggregateAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleMinAggregate"


    // $ANTLR start "entryRuleSumAggregate"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1374:1: entryRuleSumAggregate returns [EObject current=null] : iv_ruleSumAggregate= ruleSumAggregate EOF ;
    public final EObject entryRuleSumAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumAggregate = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1375:2: (iv_ruleSumAggregate= ruleSumAggregate EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1376:2: iv_ruleSumAggregate= ruleSumAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumAggregateRule()); 
            }
            pushFollow(FOLLOW_ruleSumAggregate_in_entryRuleSumAggregate2870);
            iv_ruleSumAggregate=ruleSumAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumAggregate2880); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSumAggregate"


    // $ANTLR start "ruleSumAggregate"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1383:1: ruleSumAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_36 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_77 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleSumAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1386:28: ( (otherlv_0= KEYWORD_36 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_77 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1387:1: (otherlv_0= KEYWORD_36 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_77 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1387:1: (otherlv_0= KEYWORD_36 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_77 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1388:2: otherlv_0= KEYWORD_36 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_77 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleSumAggregate2918); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSumAggregateAccess().getSUMKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleSumAggregate2930); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSumAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1397:1: ( (lv_isDistinct_2_0= KEYWORD_77 ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KEYWORD_77) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1398:1: (lv_isDistinct_2_0= KEYWORD_77 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1398:1: (lv_isDistinct_2_0= KEYWORD_77 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1399:3: lv_isDistinct_2_0= KEYWORD_77
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_77,FOLLOW_KEYWORD_77_in_ruleSumAggregate2948); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isDistinct_2_0, grammarAccess.getSumAggregateAccess().getIsDistinctDISTINCTKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSumAggregateRule());
                      	        }
                             		setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1413:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1414:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1414:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1415:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSumAggregate2981);
            lv_item_3_0=ruleAliasAttributeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSumAggregateRule());
              	        }
                     		set(
                     			current, 
                     			"item",
                      		lv_item_3_0, 
                      		"AliasAttributeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleSumAggregate2994); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSumAggregateAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleSumAggregate"


    // $ANTLR start "entryRuleSelectConstructorExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1444:1: entryRuleSelectConstructorExpression returns [EObject current=null] : iv_ruleSelectConstructorExpression= ruleSelectConstructorExpression EOF ;
    public final EObject entryRuleSelectConstructorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectConstructorExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1445:2: (iv_ruleSelectConstructorExpression= ruleSelectConstructorExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1446:2: iv_ruleSelectConstructorExpression= ruleSelectConstructorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectConstructorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectConstructorExpression_in_entryRuleSelectConstructorExpression3028);
            iv_ruleSelectConstructorExpression=ruleSelectConstructorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectConstructorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectConstructorExpression3038); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectConstructorExpression"


    // $ANTLR start "ruleSelectConstructorExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1453:1: ruleSelectConstructorExpression returns [EObject current=null] : (otherlv_0= KEYWORD_33 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_5 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2 ) ;
    public final EObject ruleSelectConstructorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_items_3_0 = null;

        EObject lv_items_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1456:28: ( (otherlv_0= KEYWORD_33 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_5 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1457:1: (otherlv_0= KEYWORD_33 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_5 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1457:1: (otherlv_0= KEYWORD_33 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_5 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1458:2: otherlv_0= KEYWORD_33 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_5 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleSelectConstructorExpression3076); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSelectConstructorExpressionAccess().getNEWKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1462:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1463:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1463:1: (lv_name_1_0= RULE_ID )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1464:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectConstructorExpression3092); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getSelectConstructorExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSelectConstructorExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleSelectConstructorExpression3110); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSelectConstructorExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1485:1: ( (lv_items_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1486:1: (lv_items_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1486:1: (lv_items_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1487:3: lv_items_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectConstructorExpressionAccess().getItemsAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3130);
            lv_items_3_0=ruleAliasAttributeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSelectConstructorExpressionRule());
              	        }
                     		add(
                     			current, 
                     			"items",
                      		lv_items_3_0, 
                      		"AliasAttributeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1503:2: (otherlv_4= KEYWORD_5 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==KEYWORD_5) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1504:2: otherlv_4= KEYWORD_5 ( (lv_items_5_0= ruleAliasAttributeExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleSelectConstructorExpression3144); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getSelectConstructorExpressionAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1508:1: ( (lv_items_5_0= ruleAliasAttributeExpression ) )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1509:1: (lv_items_5_0= ruleAliasAttributeExpression )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1509:1: (lv_items_5_0= ruleAliasAttributeExpression )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1510:3: lv_items_5_0= ruleAliasAttributeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectConstructorExpressionAccess().getItemsAliasAttributeExpressionParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3164);
            	    lv_items_5_0=ruleAliasAttributeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSelectConstructorExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"items",
            	              		lv_items_5_0, 
            	              		"AliasAttributeExpression");
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

            otherlv_6=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleSelectConstructorExpression3179); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSelectConstructorExpressionAccess().getRightParenthesisKeyword_5());
                  
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
    // $ANTLR end "ruleSelectConstructorExpression"


    // $ANTLR start "entryRuleFromClause"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1539:1: entryRuleFromClause returns [EObject current=null] : iv_ruleFromClause= ruleFromClause EOF ;
    public final EObject entryRuleFromClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClause = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1540:2: (iv_ruleFromClause= ruleFromClause EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1541:2: iv_ruleFromClause= ruleFromClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromClauseRule()); 
            }
            pushFollow(FOLLOW_ruleFromClause_in_entryRuleFromClause3213);
            iv_ruleFromClause=ruleFromClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClause3223); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1548:1: ruleFromClause returns [EObject current=null] : (otherlv_0= KEYWORD_39 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_5 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) ;
    public final EObject ruleFromClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_fromEntries_1_0 = null;

        EObject lv_fromEntries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1551:28: ( (otherlv_0= KEYWORD_39 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_5 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1552:1: (otherlv_0= KEYWORD_39 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_5 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1552:1: (otherlv_0= KEYWORD_39 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_5 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1553:2: otherlv_0= KEYWORD_39 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_5 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleFromClause3261); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFromClauseAccess().getFROMKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1557:1: ( (lv_fromEntries_1_0= ruleFromClass ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1558:1: (lv_fromEntries_1_0= ruleFromClass )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1558:1: (lv_fromEntries_1_0= ruleFromClass )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1559:3: lv_fromEntries_1_0= ruleFromClass
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromClauseAccess().getFromEntriesFromClassParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFromClass_in_ruleFromClause3281);
            lv_fromEntries_1_0=ruleFromClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFromClauseRule());
              	        }
                     		add(
                     			current, 
                     			"fromEntries",
                      		lv_fromEntries_1_0, 
                      		"FromClass");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1575:2: (otherlv_2= KEYWORD_5 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==KEYWORD_5) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1576:2: otherlv_2= KEYWORD_5 ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleFromClause3295); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFromClauseAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1580:1: ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1581:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1581:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1582:3: lv_fromEntries_3_0= ruleFromEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFromClauseAccess().getFromEntriesFromEntryParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFromEntry_in_ruleFromClause3315);
            	    lv_fromEntries_3_0=ruleFromEntry();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFromClauseRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fromEntries",
            	              		lv_fromEntries_3_0, 
            	              		"FromEntry");
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
    // $ANTLR end "ruleFromClause"


    // $ANTLR start "entryRuleFromEntry"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1606:1: entryRuleFromEntry returns [EObject current=null] : iv_ruleFromEntry= ruleFromEntry EOF ;
    public final EObject entryRuleFromEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromEntry = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1607:2: (iv_ruleFromEntry= ruleFromEntry EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1608:2: iv_ruleFromEntry= ruleFromEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromEntryRule()); 
            }
            pushFollow(FOLLOW_ruleFromEntry_in_entryRuleFromEntry3352);
            iv_ruleFromEntry=ruleFromEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromEntry3362); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFromEntry"


    // $ANTLR start "ruleFromEntry"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1615:1: ruleFromEntry returns [EObject current=null] : (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection ) ;
    public final EObject ruleFromEntry() throws RecognitionException {
        EObject current = null;

        EObject this_FromClass_0 = null;

        EObject this_FromCollection_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1618:28: ( (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1619:1: (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1619:1: (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==KEYWORD_19) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1620:2: this_FromClass_0= ruleFromClass
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromEntryAccess().getFromClassParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFromClass_in_ruleFromEntry3412);
                    this_FromClass_0=ruleFromClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_FromClass_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1633:2: this_FromCollection_1= ruleFromCollection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromEntryAccess().getFromCollectionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFromCollection_in_ruleFromEntry3442);
                    this_FromCollection_1=ruleFromCollection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_FromCollection_1;
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
    // $ANTLR end "ruleFromEntry"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1652:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1653:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1654:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3476);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration3486); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1661:1: ruleVariableDeclaration returns [EObject current=null] : ( (otherlv_0= KEYWORD_17 )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1664:28: ( ( (otherlv_0= KEYWORD_17 )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1665:1: ( (otherlv_0= KEYWORD_17 )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1665:1: ( (otherlv_0= KEYWORD_17 )? ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1665:2: (otherlv_0= KEYWORD_17 )? ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1665:2: (otherlv_0= KEYWORD_17 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==KEYWORD_17) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1666:2: otherlv_0= KEYWORD_17
                    {
                    otherlv_0=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleVariableDeclaration3525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getASKeyword_0());
                          
                    }

                    }
                    break;

            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1670:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1671:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1671:1: (lv_name_1_0= RULE_ID )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1672:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration3543); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleFromClass"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1696:1: entryRuleFromClass returns [EObject current=null] : iv_ruleFromClass= ruleFromClass EOF ;
    public final EObject entryRuleFromClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClass = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1697:2: (iv_ruleFromClass= ruleFromClass EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1698:2: iv_ruleFromClass= ruleFromClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromClassRule()); 
            }
            pushFollow(FOLLOW_ruleFromClass_in_entryRuleFromClass3583);
            iv_ruleFromClass=ruleFromClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClass3593); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFromClass"


    // $ANTLR start "ruleFromClass"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1705:1: ruleFromClass returns [EObject current=null] : (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar ) ;
    public final EObject ruleFromClass() throws RecognitionException {
        EObject current = null;

        EObject this_FromClassId_0 = null;

        EObject this_FromClassVar_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1708:28: ( (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1709:1: (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1709:1: (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1710:2: this_FromClassId_0= ruleFromClassId
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromClassAccess().getFromClassIdParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFromClassId_in_ruleFromClass3643);
                    this_FromClassId_0=ruleFromClassId();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_FromClassId_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1723:2: this_FromClassVar_1= ruleFromClassVar
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromClassAccess().getFromClassVarParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFromClassVar_in_ruleFromClass3673);
                    this_FromClassVar_1=ruleFromClassVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_FromClassVar_1;
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
    // $ANTLR end "ruleFromClass"


    // $ANTLR start "entryRuleQualifiedIdentifier"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1742:1: entryRuleQualifiedIdentifier returns [String current=null] : iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF ;
    public final String entryRuleQualifiedIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedIdentifier = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1743:1: (iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1744:2: iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier3708);
            iv_ruleQualifiedIdentifier=ruleQualifiedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedIdentifier3719); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1751:1: ruleQualifiedIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= KEYWORD_7 this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1755:6: ( (this_ID_0= RULE_ID (kw= KEYWORD_7 this_ID_2= RULE_ID )* ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1756:1: (this_ID_0= RULE_ID (kw= KEYWORD_7 this_ID_2= RULE_ID )* )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1756:1: (this_ID_0= RULE_ID (kw= KEYWORD_7 this_ID_2= RULE_ID )* )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1756:6: this_ID_0= RULE_ID (kw= KEYWORD_7 this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier3759); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1763:1: (kw= KEYWORD_7 this_ID_2= RULE_ID )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==KEYWORD_7) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1764:2: kw= KEYWORD_7 this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleQualifiedIdentifier3778); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier3793); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // $ANTLR end "ruleQualifiedIdentifier"


    // $ANTLR start "entryRuleFromClassId"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1784:1: entryRuleFromClassId returns [EObject current=null] : iv_ruleFromClassId= ruleFromClassId EOF ;
    public final EObject entryRuleFromClassId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClassId = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1785:2: (iv_ruleFromClassId= ruleFromClassId EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1786:2: iv_ruleFromClassId= ruleFromClassId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromClassIdRule()); 
            }
            pushFollow(FOLLOW_ruleFromClassId_in_entryRuleFromClassId3839);
            iv_ruleFromClassId=ruleFromClassId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromClassId; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClassId3849); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFromClassId"


    // $ANTLR start "ruleFromClassId"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1793:1: ruleFromClassId returns [EObject current=null] : ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ;
    public final EObject ruleFromClassId() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1796:28: ( ( (lv_type_0_0= ruleQualifiedIdentifier ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1797:1: ( (lv_type_0_0= ruleQualifiedIdentifier ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1797:1: ( (lv_type_0_0= ruleQualifiedIdentifier ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1798:1: (lv_type_0_0= ruleQualifiedIdentifier )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1798:1: (lv_type_0_0= ruleQualifiedIdentifier )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1799:3: lv_type_0_0= ruleQualifiedIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromClassIdAccess().getTypeQualifiedIdentifierParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleFromClassId3894);
            lv_type_0_0=ruleQualifiedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFromClassIdRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"QualifiedIdentifier");
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
    // $ANTLR end "ruleFromClassId"


    // $ANTLR start "entryRuleFromClassVar"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1823:1: entryRuleFromClassVar returns [EObject current=null] : iv_ruleFromClassVar= ruleFromClassVar EOF ;
    public final EObject entryRuleFromClassVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClassVar = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1824:2: (iv_ruleFromClassVar= ruleFromClassVar EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1825:2: iv_ruleFromClassVar= ruleFromClassVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromClassVarRule()); 
            }
            pushFollow(FOLLOW_ruleFromClassVar_in_entryRuleFromClassVar3928);
            iv_ruleFromClassVar=ruleFromClassVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromClassVar; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClassVar3938); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFromClassVar"


    // $ANTLR start "ruleFromClassVar"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1832:1: ruleFromClassVar returns [EObject current=null] : ( ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* ) ;
    public final EObject ruleFromClassVar() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_joins_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1835:28: ( ( ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1836:1: ( ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1836:1: ( ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1836:2: ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )*
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1836:2: ( (lv_type_0_0= ruleQualifiedIdentifier ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1837:1: (lv_type_0_0= ruleQualifiedIdentifier )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1837:1: (lv_type_0_0= ruleQualifiedIdentifier )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1838:3: lv_type_0_0= ruleQualifiedIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromClassVarAccess().getTypeQualifiedIdentifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleFromClassVar3984);
            lv_type_0_0=ruleQualifiedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFromClassVarRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"QualifiedIdentifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1854:2: ( (lv_variable_1_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1855:1: (lv_variable_1_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1855:1: (lv_variable_1_0= ruleVariableDeclaration )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1856:3: lv_variable_1_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromClassVarAccess().getVariableVariableDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleFromClassVar4005);
            lv_variable_1_0=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFromClassVarRule());
              	        }
                     		set(
                     			current, 
                     			"variable",
                      		lv_variable_1_0, 
                      		"VariableDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1872:2: ( (lv_joins_2_0= ruleFromJoin ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==KEYWORD_57||(LA28_0>=KEYWORD_41 && LA28_0<=KEYWORD_42)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1873:1: (lv_joins_2_0= ruleFromJoin )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1873:1: (lv_joins_2_0= ruleFromJoin )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1874:3: lv_joins_2_0= ruleFromJoin
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFromClassVarAccess().getJoinsFromJoinParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFromJoin_in_ruleFromClassVar4026);
            	    lv_joins_2_0=ruleFromJoin();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFromClassVarRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"joins",
            	              		lv_joins_2_0, 
            	              		"FromJoin");
            	      	        afterParserOrEnumRuleCall();
            	      	    
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
    // $ANTLR end "ruleFromClassVar"


    // $ANTLR start "entryRuleFromCollection"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1898:1: entryRuleFromCollection returns [EObject current=null] : iv_ruleFromCollection= ruleFromCollection EOF ;
    public final EObject entryRuleFromCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromCollection = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1899:2: (iv_ruleFromCollection= ruleFromCollection EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1900:2: iv_ruleFromCollection= ruleFromCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromCollectionRule()); 
            }
            pushFollow(FOLLOW_ruleFromCollection_in_entryRuleFromCollection4062);
            iv_ruleFromCollection=ruleFromCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromCollection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromCollection4072); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFromCollection"


    // $ANTLR start "ruleFromCollection"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1907:1: ruleFromCollection returns [EObject current=null] : (otherlv_0= KEYWORD_19 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleFromCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_path_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1910:28: ( (otherlv_0= KEYWORD_19 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1911:1: (otherlv_0= KEYWORD_19 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1911:1: (otherlv_0= KEYWORD_19 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1912:2: otherlv_0= KEYWORD_19 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleFromCollection4110); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFromCollectionAccess().getINKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleFromCollection4122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFromCollectionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1921:1: ( (lv_path_2_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1922:1: (lv_path_2_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1922:1: (lv_path_2_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1923:3: lv_path_2_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromCollectionAccess().getPathAliasAttributeExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleFromCollection4142);
            lv_path_2_0=ruleAliasAttributeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFromCollectionRule());
              	        }
                     		set(
                     			current, 
                     			"path",
                      		lv_path_2_0, 
                      		"AliasAttributeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleFromCollection4155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFromCollectionAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1944:1: ( (lv_variable_4_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1945:1: (lv_variable_4_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1945:1: (lv_variable_4_0= ruleVariableDeclaration )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1946:3: lv_variable_4_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromCollectionAccess().getVariableVariableDeclarationParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleFromCollection4175);
            lv_variable_4_0=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFromCollectionRule());
              	        }
                     		set(
                     			current, 
                     			"variable",
                      		lv_variable_4_0, 
                      		"VariableDeclaration");
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
    // $ANTLR end "ruleFromCollection"


    // $ANTLR start "entryRuleFromJoin"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1970:1: entryRuleFromJoin returns [EObject current=null] : iv_ruleFromJoin= ruleFromJoin EOF ;
    public final EObject entryRuleFromJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromJoin = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1971:2: (iv_ruleFromJoin= ruleFromJoin EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1972:2: iv_ruleFromJoin= ruleFromJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromJoinRule()); 
            }
            pushFollow(FOLLOW_ruleFromJoin_in_entryRuleFromJoin4210);
            iv_ruleFromJoin=ruleFromJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromJoin4220); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFromJoin"


    // $ANTLR start "ruleFromJoin"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1979:1: ruleFromJoin returns [EObject current=null] : (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin ) ;
    public final EObject ruleFromJoin() throws RecognitionException {
        EObject current = null;

        EObject this_Join_0 = null;

        EObject this_LeftJoin_1 = null;

        EObject this_InnerJoin_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1982:28: ( (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1983:1: (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1983:1: (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin )
            int alt29=3;
            switch ( input.LA(1) ) {
            case KEYWORD_41:
                {
                alt29=1;
                }
                break;
            case KEYWORD_42:
                {
                alt29=2;
                }
                break;
            case KEYWORD_57:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1984:2: this_Join_0= ruleJoin
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromJoinAccess().getJoinParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJoin_in_ruleFromJoin4270);
                    this_Join_0=ruleJoin();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_Join_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1997:2: this_LeftJoin_1= ruleLeftJoin
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromJoinAccess().getLeftJoinParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLeftJoin_in_ruleFromJoin4300);
                    this_LeftJoin_1=ruleLeftJoin();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LeftJoin_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2010:2: this_InnerJoin_2= ruleInnerJoin
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromJoinAccess().getInnerJoinParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInnerJoin_in_ruleFromJoin4330);
                    this_InnerJoin_2=ruleInnerJoin();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_InnerJoin_2;
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
    // $ANTLR end "ruleFromJoin"


    // $ANTLR start "entryRuleJoin"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2029:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2030:2: (iv_ruleJoin= ruleJoin EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2031:2: iv_ruleJoin= ruleJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinRule()); 
            }
            pushFollow(FOLLOW_ruleJoin_in_entryRuleJoin4364);
            iv_ruleJoin=ruleJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoin4374); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoin"


    // $ANTLR start "ruleJoin"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2038:1: ruleJoin returns [EObject current=null] : (otherlv_0= KEYWORD_41 ( (lv_isFetch_1_0= KEYWORD_54 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isFetch_1_0=null;
        EObject lv_path_2_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2041:28: ( (otherlv_0= KEYWORD_41 ( (lv_isFetch_1_0= KEYWORD_54 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2042:1: (otherlv_0= KEYWORD_41 ( (lv_isFetch_1_0= KEYWORD_54 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2042:1: (otherlv_0= KEYWORD_41 ( (lv_isFetch_1_0= KEYWORD_54 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2043:2: otherlv_0= KEYWORD_41 ( (lv_isFetch_1_0= KEYWORD_54 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleJoin4412); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJoinAccess().getJOINKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2047:1: ( (lv_isFetch_1_0= KEYWORD_54 ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==KEYWORD_54) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2048:1: (lv_isFetch_1_0= KEYWORD_54 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2048:1: (lv_isFetch_1_0= KEYWORD_54 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2049:3: lv_isFetch_1_0= KEYWORD_54
                    {
                    lv_isFetch_1_0=(Token)match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleJoin4430); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isFetch_1_0, grammarAccess.getJoinAccess().getIsFetchFETCHKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getJoinRule());
                      	        }
                             		setWithLastConsumed(current, "isFetch", true, "FETCH");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2063:3: ( (lv_path_2_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2064:1: (lv_path_2_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2064:1: (lv_path_2_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2065:3: lv_path_2_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinAccess().getPathAliasAttributeExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleJoin4463);
            lv_path_2_0=ruleAliasAttributeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJoinRule());
              	        }
                     		set(
                     			current, 
                     			"path",
                      		lv_path_2_0, 
                      		"AliasAttributeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2081:2: ( (lv_variable_3_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2082:1: (lv_variable_3_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2082:1: (lv_variable_3_0= ruleVariableDeclaration )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2083:3: lv_variable_3_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinAccess().getVariableVariableDeclarationParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleJoin4484);
            lv_variable_3_0=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJoinRule());
              	        }
                     		set(
                     			current, 
                     			"variable",
                      		lv_variable_3_0, 
                      		"VariableDeclaration");
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
    // $ANTLR end "ruleJoin"


    // $ANTLR start "entryRuleLeftJoin"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2107:1: entryRuleLeftJoin returns [EObject current=null] : iv_ruleLeftJoin= ruleLeftJoin EOF ;
    public final EObject entryRuleLeftJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftJoin = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2108:2: (iv_ruleLeftJoin= ruleLeftJoin EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2109:2: iv_ruleLeftJoin= ruleLeftJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeftJoinRule()); 
            }
            pushFollow(FOLLOW_ruleLeftJoin_in_entryRuleLeftJoin4519);
            iv_ruleLeftJoin=ruleLeftJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeftJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftJoin4529); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeftJoin"


    // $ANTLR start "ruleLeftJoin"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2116:1: ruleLeftJoin returns [EObject current=null] : (otherlv_0= KEYWORD_42 ( (lv_isOuter_1_0= KEYWORD_61 ) )? otherlv_2= KEYWORD_41 ( (lv_isFetch_3_0= KEYWORD_54 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleLeftJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isOuter_1_0=null;
        Token otherlv_2=null;
        Token lv_isFetch_3_0=null;
        EObject lv_path_4_0 = null;

        EObject lv_variable_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2119:28: ( (otherlv_0= KEYWORD_42 ( (lv_isOuter_1_0= KEYWORD_61 ) )? otherlv_2= KEYWORD_41 ( (lv_isFetch_3_0= KEYWORD_54 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2120:1: (otherlv_0= KEYWORD_42 ( (lv_isOuter_1_0= KEYWORD_61 ) )? otherlv_2= KEYWORD_41 ( (lv_isFetch_3_0= KEYWORD_54 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2120:1: (otherlv_0= KEYWORD_42 ( (lv_isOuter_1_0= KEYWORD_61 ) )? otherlv_2= KEYWORD_41 ( (lv_isFetch_3_0= KEYWORD_54 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2121:2: otherlv_0= KEYWORD_42 ( (lv_isOuter_1_0= KEYWORD_61 ) )? otherlv_2= KEYWORD_41 ( (lv_isFetch_3_0= KEYWORD_54 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleLeftJoin4567); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLeftJoinAccess().getLEFTKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2125:1: ( (lv_isOuter_1_0= KEYWORD_61 ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==KEYWORD_61) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2126:1: (lv_isOuter_1_0= KEYWORD_61 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2126:1: (lv_isOuter_1_0= KEYWORD_61 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2127:3: lv_isOuter_1_0= KEYWORD_61
                    {
                    lv_isOuter_1_0=(Token)match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleLeftJoin4585); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isOuter_1_0, grammarAccess.getLeftJoinAccess().getIsOuterOUTERKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLeftJoinRule());
                      	        }
                             		setWithLastConsumed(current, "isOuter", true, "OUTER");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleLeftJoin4610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLeftJoinAccess().getJOINKeyword_2());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2146:1: ( (lv_isFetch_3_0= KEYWORD_54 ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==KEYWORD_54) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2147:1: (lv_isFetch_3_0= KEYWORD_54 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2147:1: (lv_isFetch_3_0= KEYWORD_54 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2148:3: lv_isFetch_3_0= KEYWORD_54
                    {
                    lv_isFetch_3_0=(Token)match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleLeftJoin4628); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isFetch_3_0, grammarAccess.getLeftJoinAccess().getIsFetchFETCHKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLeftJoinRule());
                      	        }
                             		setWithLastConsumed(current, "isFetch", true, "FETCH");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2162:3: ( (lv_path_4_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2163:1: (lv_path_4_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2163:1: (lv_path_4_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2164:3: lv_path_4_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLeftJoinAccess().getPathAliasAttributeExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleLeftJoin4661);
            lv_path_4_0=ruleAliasAttributeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLeftJoinRule());
              	        }
                     		set(
                     			current, 
                     			"path",
                      		lv_path_4_0, 
                      		"AliasAttributeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2180:2: ( (lv_variable_5_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2181:1: (lv_variable_5_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2181:1: (lv_variable_5_0= ruleVariableDeclaration )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2182:3: lv_variable_5_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLeftJoinAccess().getVariableVariableDeclarationParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleLeftJoin4682);
            lv_variable_5_0=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLeftJoinRule());
              	        }
                     		set(
                     			current, 
                     			"variable",
                      		lv_variable_5_0, 
                      		"VariableDeclaration");
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
    // $ANTLR end "ruleLeftJoin"


    // $ANTLR start "entryRuleInnerJoin"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2206:1: entryRuleInnerJoin returns [EObject current=null] : iv_ruleInnerJoin= ruleInnerJoin EOF ;
    public final EObject entryRuleInnerJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerJoin = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2207:2: (iv_ruleInnerJoin= ruleInnerJoin EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2208:2: iv_ruleInnerJoin= ruleInnerJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInnerJoinRule()); 
            }
            pushFollow(FOLLOW_ruleInnerJoin_in_entryRuleInnerJoin4717);
            iv_ruleInnerJoin=ruleInnerJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInnerJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInnerJoin4727); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInnerJoin"


    // $ANTLR start "ruleInnerJoin"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2215:1: ruleInnerJoin returns [EObject current=null] : (otherlv_0= KEYWORD_57 otherlv_1= KEYWORD_41 ( (lv_isFetch_2_0= KEYWORD_54 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleInnerJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isFetch_2_0=null;
        EObject lv_path_3_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2218:28: ( (otherlv_0= KEYWORD_57 otherlv_1= KEYWORD_41 ( (lv_isFetch_2_0= KEYWORD_54 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2219:1: (otherlv_0= KEYWORD_57 otherlv_1= KEYWORD_41 ( (lv_isFetch_2_0= KEYWORD_54 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2219:1: (otherlv_0= KEYWORD_57 otherlv_1= KEYWORD_41 ( (lv_isFetch_2_0= KEYWORD_54 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2220:2: otherlv_0= KEYWORD_57 otherlv_1= KEYWORD_41 ( (lv_isFetch_2_0= KEYWORD_54 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleInnerJoin4765); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInnerJoinAccess().getINNERKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleInnerJoin4777); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInnerJoinAccess().getJOINKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2229:1: ( (lv_isFetch_2_0= KEYWORD_54 ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==KEYWORD_54) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2230:1: (lv_isFetch_2_0= KEYWORD_54 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2230:1: (lv_isFetch_2_0= KEYWORD_54 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2231:3: lv_isFetch_2_0= KEYWORD_54
                    {
                    lv_isFetch_2_0=(Token)match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleInnerJoin4795); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isFetch_2_0, grammarAccess.getInnerJoinAccess().getIsFetchFETCHKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInnerJoinRule());
                      	        }
                             		setWithLastConsumed(current, "isFetch", true, "FETCH");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2245:3: ( (lv_path_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2246:1: (lv_path_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2246:1: (lv_path_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2247:3: lv_path_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInnerJoinAccess().getPathAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleInnerJoin4828);
            lv_path_3_0=ruleAliasAttributeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInnerJoinRule());
              	        }
                     		set(
                     			current, 
                     			"path",
                      		lv_path_3_0, 
                      		"AliasAttributeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2263:2: ( (lv_variable_4_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2264:1: (lv_variable_4_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2264:1: (lv_variable_4_0= ruleVariableDeclaration )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2265:3: lv_variable_4_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInnerJoinAccess().getVariableVariableDeclarationParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInnerJoin4849);
            lv_variable_4_0=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInnerJoinRule());
              	        }
                     		set(
                     			current, 
                     			"variable",
                      		lv_variable_4_0, 
                      		"VariableDeclaration");
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
    // $ANTLR end "ruleInnerJoin"


    // $ANTLR start "entryRuleWhereClause"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2289:1: entryRuleWhereClause returns [EObject current=null] : iv_ruleWhereClause= ruleWhereClause EOF ;
    public final EObject entryRuleWhereClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereClause = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2290:2: (iv_ruleWhereClause= ruleWhereClause EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2291:2: iv_ruleWhereClause= ruleWhereClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhereClauseRule()); 
            }
            pushFollow(FOLLOW_ruleWhereClause_in_entryRuleWhereClause4884);
            iv_ruleWhereClause=ruleWhereClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhereClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhereClause4894); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2298:1: ruleWhereClause returns [EObject current=null] : (otherlv_0= KEYWORD_63 ( (lv_whereEntry_1_0= ruleOrExpression ) ) ) ;
    public final EObject ruleWhereClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_whereEntry_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2301:28: ( (otherlv_0= KEYWORD_63 ( (lv_whereEntry_1_0= ruleOrExpression ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2302:1: (otherlv_0= KEYWORD_63 ( (lv_whereEntry_1_0= ruleOrExpression ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2302:1: (otherlv_0= KEYWORD_63 ( (lv_whereEntry_1_0= ruleOrExpression ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2303:2: otherlv_0= KEYWORD_63 ( (lv_whereEntry_1_0= ruleOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleWhereClause4932); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhereClauseAccess().getWHEREKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2307:1: ( (lv_whereEntry_1_0= ruleOrExpression ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2308:1: (lv_whereEntry_1_0= ruleOrExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2308:1: (lv_whereEntry_1_0= ruleOrExpression )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2309:3: lv_whereEntry_1_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhereClauseAccess().getWhereEntryOrExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleWhereClause4952);
            lv_whereEntry_1_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhereClauseRule());
              	        }
                     		set(
                     			current, 
                     			"whereEntry",
                      		lv_whereEntry_1_0, 
                      		"OrExpression");
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


    // $ANTLR start "entryRuleOrExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2333:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2334:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2335:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression4987);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression4997); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2342:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_22 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2345:28: ( (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_22 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2346:1: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_22 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2346:1: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_22 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2347:2: this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_22 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression5047);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_AndExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2358:1: ( () (otherlv_2= KEYWORD_22 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==KEYWORD_22) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2358:2: () (otherlv_2= KEYWORD_22 ( (lv_entries_3_0= ruleAndExpression ) ) )+
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2358:2: ()
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2359:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2367:2: (otherlv_2= KEYWORD_22 ( (lv_entries_3_0= ruleAndExpression ) ) )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==KEYWORD_22) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2368:2: otherlv_2= KEYWORD_22 ( (lv_entries_3_0= ruleAndExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleOrExpression5073); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getORKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2372:1: ( (lv_entries_3_0= ruleAndExpression ) )
                    	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2373:1: (lv_entries_3_0= ruleAndExpression )
                    	    {
                    	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2373:1: (lv_entries_3_0= ruleAndExpression )
                    	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2374:3: lv_entries_3_0= ruleAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getEntriesAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression5093);
                    	    lv_entries_3_0=ruleAndExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"entries",
                    	              		lv_entries_3_0, 
                    	              		"AndExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);


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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2398:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2399:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2400:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression5132);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression5142); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2407:1: ruleAndExpression returns [EObject current=null] : (this_ComparisonOperatorExpression_0= ruleComparisonOperatorExpression ( () (otherlv_2= KEYWORD_25 ( (lv_entries_3_0= ruleComparisonOperatorExpression ) ) )+ )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonOperatorExpression_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2410:28: ( (this_ComparisonOperatorExpression_0= ruleComparisonOperatorExpression ( () (otherlv_2= KEYWORD_25 ( (lv_entries_3_0= ruleComparisonOperatorExpression ) ) )+ )? ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2411:1: (this_ComparisonOperatorExpression_0= ruleComparisonOperatorExpression ( () (otherlv_2= KEYWORD_25 ( (lv_entries_3_0= ruleComparisonOperatorExpression ) ) )+ )? )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2411:1: (this_ComparisonOperatorExpression_0= ruleComparisonOperatorExpression ( () (otherlv_2= KEYWORD_25 ( (lv_entries_3_0= ruleComparisonOperatorExpression ) ) )+ )? )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2412:2: this_ComparisonOperatorExpression_0= ruleComparisonOperatorExpression ( () (otherlv_2= KEYWORD_25 ( (lv_entries_3_0= ruleComparisonOperatorExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getComparisonOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparisonOperatorExpression_in_ruleAndExpression5192);
            this_ComparisonOperatorExpression_0=ruleComparisonOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ComparisonOperatorExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2423:1: ( () (otherlv_2= KEYWORD_25 ( (lv_entries_3_0= ruleComparisonOperatorExpression ) ) )+ )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==KEYWORD_25) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2423:2: () (otherlv_2= KEYWORD_25 ( (lv_entries_3_0= ruleComparisonOperatorExpression ) ) )+
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2423:2: ()
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2424:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2432:2: (otherlv_2= KEYWORD_25 ( (lv_entries_3_0= ruleComparisonOperatorExpression ) ) )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==KEYWORD_25) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2433:2: otherlv_2= KEYWORD_25 ( (lv_entries_3_0= ruleComparisonOperatorExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleAndExpression5218); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getANDKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2437:1: ( (lv_entries_3_0= ruleComparisonOperatorExpression ) )
                    	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2438:1: (lv_entries_3_0= ruleComparisonOperatorExpression )
                    	    {
                    	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2438:1: (lv_entries_3_0= ruleComparisonOperatorExpression )
                    	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2439:3: lv_entries_3_0= ruleComparisonOperatorExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getEntriesComparisonOperatorExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleComparisonOperatorExpression_in_ruleAndExpression5238);
                    	    lv_entries_3_0=ruleComparisonOperatorExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"entries",
                    	              		lv_entries_3_0, 
                    	              		"ComparisonOperatorExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt36 >= 1 ) break loop36;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);


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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleComparisonOperatorExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2463:1: entryRuleComparisonOperatorExpression returns [EObject current=null] : iv_ruleComparisonOperatorExpression= ruleComparisonOperatorExpression EOF ;
    public final EObject entryRuleComparisonOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonOperatorExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2464:2: (iv_ruleComparisonOperatorExpression= ruleComparisonOperatorExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2465:2: iv_ruleComparisonOperatorExpression= ruleComparisonOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleComparisonOperatorExpression_in_entryRuleComparisonOperatorExpression5277);
            iv_ruleComparisonOperatorExpression=ruleComparisonOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonOperatorExpression5287); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2472:1: ruleComparisonOperatorExpression returns [EObject current=null] : (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) ) )* ) ;
    public final EObject ruleComparisonOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditionExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2475:28: ( (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) ) )* ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2476:1: (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) ) )* )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2476:1: (this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) ) )* )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2477:2: this_AdditionExpression_0= ruleAdditionExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonOperatorExpressionAccess().getAdditionExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditionExpression_in_ruleComparisonOperatorExpression5337);
            this_AdditionExpression_0=ruleAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_AdditionExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2488:1: ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=KEYWORD_14 && LA38_0<=KEYWORD_16)||(LA38_0>=KEYWORD_10 && LA38_0<=KEYWORD_12)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2488:2: () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_right_3_0= ruleAdditionExpression ) )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2488:2: ()
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2489:2: 
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

            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2497:2: ( (lv_operator_2_0= ruleComparisonOperator ) )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2498:1: (lv_operator_2_0= ruleComparisonOperator )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2498:1: (lv_operator_2_0= ruleComparisonOperator )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2499:3: lv_operator_2_0= ruleComparisonOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonOperatorExpressionAccess().getOperatorComparisonOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparisonOperator_in_ruleComparisonOperatorExpression5370);
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

            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2515:2: ( (lv_right_3_0= ruleAdditionExpression ) )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2516:1: (lv_right_3_0= ruleAdditionExpression )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2516:1: (lv_right_3_0= ruleAdditionExpression )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2517:3: lv_right_3_0= ruleAdditionExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonOperatorExpressionAccess().getRightAdditionExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditionExpression_in_ruleComparisonOperatorExpression5391);
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
            	    break loop38;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2541:1: entryRuleAdditionExpression returns [EObject current=null] : iv_ruleAdditionExpression= ruleAdditionExpression EOF ;
    public final EObject entryRuleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2542:2: (iv_ruleAdditionExpression= ruleAdditionExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2543:2: iv_ruleAdditionExpression= ruleAdditionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression5428);
            iv_ruleAdditionExpression=ruleAdditionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionExpression5438); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2550:1: ruleAdditionExpression returns [EObject current=null] : (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) ) )* ) ;
    public final EObject ruleAdditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicationExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2553:28: ( (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) ) )* ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2554:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) ) )* )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2554:1: (this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) ) )* )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2555:2: this_MultiplicationExpression_0= ruleMultiplicationExpression ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression5488);
            this_MultiplicationExpression_0=ruleMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_MultiplicationExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2566:1: ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==KEYWORD_4||LA39_0==KEYWORD_6) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2566:2: () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_right_3_0= ruleMultiplicationExpression ) )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2566:2: ()
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2567:2: 
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

            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2575:2: ( (lv_operator_2_0= ruleAdditionOperator ) )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2576:1: (lv_operator_2_0= ruleAdditionOperator )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2576:1: (lv_operator_2_0= ruleAdditionOperator )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2577:3: lv_operator_2_0= ruleAdditionOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditionOperator_in_ruleAdditionExpression5521);
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

            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2593:2: ( (lv_right_3_0= ruleMultiplicationExpression ) )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2594:1: (lv_right_3_0= ruleMultiplicationExpression )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2594:1: (lv_right_3_0= ruleMultiplicationExpression )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2595:3: lv_right_3_0= ruleMultiplicationExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionExpressionAccess().getRightMultiplicationExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression5542);
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
    // $ANTLR end "ruleAdditionExpression"


    // $ANTLR start "entryRuleMultiplicationExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2619:1: entryRuleMultiplicationExpression returns [EObject current=null] : iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF ;
    public final EObject entryRuleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2620:2: (iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2621:2: iv_ruleMultiplicationExpression= ruleMultiplicationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression5579);
            iv_ruleMultiplicationExpression=ruleMultiplicationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationExpression5589); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2628:1: ruleMultiplicationExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleMultiplicationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2631:28: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2632:1: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2632:1: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2633:2: this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleMultiplicationExpression5639);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_UnaryExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2644:1: ( () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==KEYWORD_3||LA40_0==KEYWORD_8) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2644:2: () ( (lv_operator_2_0= ruleMultiplicationOperator ) ) ( (lv_right_3_0= ruleUnaryExpression ) )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2644:2: ()
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2645:2: 
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

            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2653:2: ( (lv_operator_2_0= ruleMultiplicationOperator ) )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2654:1: (lv_operator_2_0= ruleMultiplicationOperator )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2654:1: (lv_operator_2_0= ruleMultiplicationOperator )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2655:3: lv_operator_2_0= ruleMultiplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicationExpression5672);
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

            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2671:2: ( (lv_right_3_0= ruleUnaryExpression ) )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2672:1: (lv_right_3_0= ruleUnaryExpression )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2672:1: (lv_right_3_0= ruleUnaryExpression )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2673:3: lv_right_3_0= ruleUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicationExpressionAccess().getRightUnaryExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnaryExpression_in_ruleMultiplicationExpression5693);
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
    // $ANTLR end "ruleMultiplicationExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2697:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2698:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2699:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression5730);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression5740); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2706:1: ruleUnaryExpression returns [EObject current=null] : ( ( (lv_unaryOperator_0_0= ruleUnaryOperator ) )? ( (lv_right_1_0= ruleConcreteExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_unaryOperator_0_0 = null;

        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2709:28: ( ( ( (lv_unaryOperator_0_0= ruleUnaryOperator ) )? ( (lv_right_1_0= ruleConcreteExpression ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2710:1: ( ( (lv_unaryOperator_0_0= ruleUnaryOperator ) )? ( (lv_right_1_0= ruleConcreteExpression ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2710:1: ( ( (lv_unaryOperator_0_0= ruleUnaryOperator ) )? ( (lv_right_1_0= ruleConcreteExpression ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2710:2: ( (lv_unaryOperator_0_0= ruleUnaryOperator ) )? ( (lv_right_1_0= ruleConcreteExpression ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2710:2: ( (lv_unaryOperator_0_0= ruleUnaryOperator ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==KEYWORD_34||LA41_0==KEYWORD_4||LA41_0==KEYWORD_6) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2711:1: (lv_unaryOperator_0_0= ruleUnaryOperator )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2711:1: (lv_unaryOperator_0_0= ruleUnaryOperator )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2712:3: lv_unaryOperator_0_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getUnaryOperatorUnaryOperatorEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleUnaryExpression5786);
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

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2728:3: ( (lv_right_1_0= ruleConcreteExpression ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2729:1: (lv_right_1_0= ruleConcreteExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2729:1: (lv_right_1_0= ruleConcreteExpression )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2730:3: lv_right_1_0= ruleConcreteExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getRightConcreteExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConcreteExpression_in_ruleUnaryExpression5808);
            lv_right_1_0=ruleConcreteExpression();

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
                      		"ConcreteExpression");
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


    // $ANTLR start "entryRuleConcreteExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2754:1: entryRuleConcreteExpression returns [EObject current=null] : iv_ruleConcreteExpression= ruleConcreteExpression EOF ;
    public final EObject entryRuleConcreteExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2755:2: (iv_ruleConcreteExpression= ruleConcreteExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2756:2: iv_ruleConcreteExpression= ruleConcreteExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcreteExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConcreteExpression_in_entryRuleConcreteExpression5843);
            iv_ruleConcreteExpression=ruleConcreteExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcreteExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcreteExpression5853); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcreteExpression"


    // $ANTLR start "ruleConcreteExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2763:1: ruleConcreteExpression returns [EObject current=null] : (this_ParenthesesExpression_0= ruleParenthesesExpression | this_ExistsExpression_1= ruleExistsExpression | this_AllExpression_2= ruleAllExpression | this_AnyExpression_3= ruleAnyExpression | this_SomeExpression_4= ruleSomeExpression | this_CollectionExpression_5= ruleCollectionExpression | this_NullComparisonExpression_6= ruleNullComparisonExpression | this_EmptyComparisonExpression_7= ruleEmptyComparisonExpression | this_LikeExpression_8= ruleLikeExpression | this_InExpression_9= ruleInExpression | this_BetweenExpression_10= ruleBetweenExpression | this_FunctionExpression_11= ruleFunctionExpression | this_AliasAttributeExpression_12= ruleAliasAttributeExpression | this_Literal_13= ruleLiteral | this_ParameterExpression_14= ruleParameterExpression ) ;
    public final EObject ruleConcreteExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ParenthesesExpression_0 = null;

        EObject this_ExistsExpression_1 = null;

        EObject this_AllExpression_2 = null;

        EObject this_AnyExpression_3 = null;

        EObject this_SomeExpression_4 = null;

        EObject this_CollectionExpression_5 = null;

        EObject this_NullComparisonExpression_6 = null;

        EObject this_EmptyComparisonExpression_7 = null;

        EObject this_LikeExpression_8 = null;

        EObject this_InExpression_9 = null;

        EObject this_BetweenExpression_10 = null;

        EObject this_FunctionExpression_11 = null;

        EObject this_AliasAttributeExpression_12 = null;

        EObject this_Literal_13 = null;

        EObject this_ParameterExpression_14 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2766:28: ( (this_ParenthesesExpression_0= ruleParenthesesExpression | this_ExistsExpression_1= ruleExistsExpression | this_AllExpression_2= ruleAllExpression | this_AnyExpression_3= ruleAnyExpression | this_SomeExpression_4= ruleSomeExpression | this_CollectionExpression_5= ruleCollectionExpression | this_NullComparisonExpression_6= ruleNullComparisonExpression | this_EmptyComparisonExpression_7= ruleEmptyComparisonExpression | this_LikeExpression_8= ruleLikeExpression | this_InExpression_9= ruleInExpression | this_BetweenExpression_10= ruleBetweenExpression | this_FunctionExpression_11= ruleFunctionExpression | this_AliasAttributeExpression_12= ruleAliasAttributeExpression | this_Literal_13= ruleLiteral | this_ParameterExpression_14= ruleParameterExpression ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2767:1: (this_ParenthesesExpression_0= ruleParenthesesExpression | this_ExistsExpression_1= ruleExistsExpression | this_AllExpression_2= ruleAllExpression | this_AnyExpression_3= ruleAnyExpression | this_SomeExpression_4= ruleSomeExpression | this_CollectionExpression_5= ruleCollectionExpression | this_NullComparisonExpression_6= ruleNullComparisonExpression | this_EmptyComparisonExpression_7= ruleEmptyComparisonExpression | this_LikeExpression_8= ruleLikeExpression | this_InExpression_9= ruleInExpression | this_BetweenExpression_10= ruleBetweenExpression | this_FunctionExpression_11= ruleFunctionExpression | this_AliasAttributeExpression_12= ruleAliasAttributeExpression | this_Literal_13= ruleLiteral | this_ParameterExpression_14= ruleParameterExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2767:1: (this_ParenthesesExpression_0= ruleParenthesesExpression | this_ExistsExpression_1= ruleExistsExpression | this_AllExpression_2= ruleAllExpression | this_AnyExpression_3= ruleAnyExpression | this_SomeExpression_4= ruleSomeExpression | this_CollectionExpression_5= ruleCollectionExpression | this_NullComparisonExpression_6= ruleNullComparisonExpression | this_EmptyComparisonExpression_7= ruleEmptyComparisonExpression | this_LikeExpression_8= ruleLikeExpression | this_InExpression_9= ruleInExpression | this_BetweenExpression_10= ruleBetweenExpression | this_FunctionExpression_11= ruleFunctionExpression | this_AliasAttributeExpression_12= ruleAliasAttributeExpression | this_Literal_13= ruleLiteral | this_ParameterExpression_14= ruleParameterExpression )
            int alt42=15;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2768:2: this_ParenthesesExpression_0= ruleParenthesesExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getParenthesesExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesesExpression_in_ruleConcreteExpression5903);
                    this_ParenthesesExpression_0=ruleParenthesesExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ParenthesesExpression_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2781:2: this_ExistsExpression_1= ruleExistsExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getExistsExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExistsExpression_in_ruleConcreteExpression5933);
                    this_ExistsExpression_1=ruleExistsExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ExistsExpression_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2794:2: this_AllExpression_2= ruleAllExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getAllExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAllExpression_in_ruleConcreteExpression5963);
                    this_AllExpression_2=ruleAllExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_AllExpression_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2807:2: this_AnyExpression_3= ruleAnyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getAnyExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnyExpression_in_ruleConcreteExpression5993);
                    this_AnyExpression_3=ruleAnyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_AnyExpression_3;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2820:2: this_SomeExpression_4= ruleSomeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getSomeExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSomeExpression_in_ruleConcreteExpression6023);
                    this_SomeExpression_4=ruleSomeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_SomeExpression_4;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2833:2: this_CollectionExpression_5= ruleCollectionExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getCollectionExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCollectionExpression_in_ruleConcreteExpression6053);
                    this_CollectionExpression_5=ruleCollectionExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_CollectionExpression_5;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2846:2: this_NullComparisonExpression_6= ruleNullComparisonExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getNullComparisonExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullComparisonExpression_in_ruleConcreteExpression6083);
                    this_NullComparisonExpression_6=ruleNullComparisonExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_NullComparisonExpression_6;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2859:2: this_EmptyComparisonExpression_7= ruleEmptyComparisonExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getEmptyComparisonExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEmptyComparisonExpression_in_ruleConcreteExpression6113);
                    this_EmptyComparisonExpression_7=ruleEmptyComparisonExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EmptyComparisonExpression_7;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2872:2: this_LikeExpression_8= ruleLikeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getLikeExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLikeExpression_in_ruleConcreteExpression6143);
                    this_LikeExpression_8=ruleLikeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LikeExpression_8;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2885:2: this_InExpression_9= ruleInExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getInExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInExpression_in_ruleConcreteExpression6173);
                    this_InExpression_9=ruleInExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_InExpression_9;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2898:2: this_BetweenExpression_10= ruleBetweenExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getBetweenExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBetweenExpression_in_ruleConcreteExpression6203);
                    this_BetweenExpression_10=ruleBetweenExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BetweenExpression_10;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2911:2: this_FunctionExpression_11= ruleFunctionExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getFunctionExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionExpression_in_ruleConcreteExpression6233);
                    this_FunctionExpression_11=ruleFunctionExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_FunctionExpression_11;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2924:2: this_AliasAttributeExpression_12= ruleAliasAttributeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getAliasAttributeExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleConcreteExpression6263);
                    this_AliasAttributeExpression_12=ruleAliasAttributeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_AliasAttributeExpression_12;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2937:2: this_Literal_13= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getLiteralParserRuleCall_13()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleConcreteExpression6293);
                    this_Literal_13=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_Literal_13;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2950:2: this_ParameterExpression_14= ruleParameterExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getParameterExpressionParserRuleCall_14()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameterExpression_in_ruleConcreteExpression6323);
                    this_ParameterExpression_14=ruleParameterExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ParameterExpression_14;
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
    // $ANTLR end "ruleConcreteExpression"


    // $ANTLR start "entryRuleParenthesesExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2969:1: entryRuleParenthesesExpression returns [EObject current=null] : iv_ruleParenthesesExpression= ruleParenthesesExpression EOF ;
    public final EObject entryRuleParenthesesExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesesExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2970:2: (iv_ruleParenthesesExpression= ruleParenthesesExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2971:2: iv_ruleParenthesesExpression= ruleParenthesesExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesesExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesesExpression_in_entryRuleParenthesesExpression6357);
            iv_ruleParenthesesExpression=ruleParenthesesExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesesExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesesExpression6367); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2978:1: ruleParenthesesExpression returns [EObject current=null] : (otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2 ) ;
    public final EObject ruleParenthesesExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ExpressionTerm_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2981:28: ( (otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2982:1: (otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2982:1: (otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2983:2: otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleParenthesesExpression6405); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesesExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesesExpressionAccess().getExpressionTermParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionTerm_in_ruleParenthesesExpression6429);
            this_ExpressionTerm_1=ruleExpressionTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ExpressionTerm_1;
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleParenthesesExpression6441); if (state.failed) return current;
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


    // $ANTLR start "entryRuleExistsExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3012:1: entryRuleExistsExpression returns [EObject current=null] : iv_ruleExistsExpression= ruleExistsExpression EOF ;
    public final EObject entryRuleExistsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistsExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3013:2: (iv_ruleExistsExpression= ruleExistsExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3014:2: iv_ruleExistsExpression= ruleExistsExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExistsExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExistsExpression_in_entryRuleExistsExpression6475);
            iv_ruleExistsExpression=ruleExistsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExistsExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExistsExpression6485); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistsExpression"


    // $ANTLR start "ruleExistsExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3021:1: ruleExistsExpression returns [EObject current=null] : (otherlv_0= KEYWORD_66 ( (lv_right_1_0= ruleSubquery ) ) ) ;
    public final EObject ruleExistsExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3024:28: ( (otherlv_0= KEYWORD_66 ( (lv_right_1_0= ruleSubquery ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3025:1: (otherlv_0= KEYWORD_66 ( (lv_right_1_0= ruleSubquery ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3025:1: (otherlv_0= KEYWORD_66 ( (lv_right_1_0= ruleSubquery ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3026:2: otherlv_0= KEYWORD_66 ( (lv_right_1_0= ruleSubquery ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_66,FOLLOW_KEYWORD_66_in_ruleExistsExpression6523); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExistsExpressionAccess().getEXISTSKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3030:1: ( (lv_right_1_0= ruleSubquery ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3031:1: (lv_right_1_0= ruleSubquery )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3031:1: (lv_right_1_0= ruleSubquery )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3032:3: lv_right_1_0= ruleSubquery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExistsExpressionAccess().getRightSubqueryParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSubquery_in_ruleExistsExpression6543);
            lv_right_1_0=ruleSubquery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExistsExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_1_0, 
                      		"Subquery");
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
    // $ANTLR end "ruleExistsExpression"


    // $ANTLR start "entryRuleAllExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3056:1: entryRuleAllExpression returns [EObject current=null] : iv_ruleAllExpression= ruleAllExpression EOF ;
    public final EObject entryRuleAllExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3057:2: (iv_ruleAllExpression= ruleAllExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3058:2: iv_ruleAllExpression= ruleAllExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAllExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAllExpression_in_entryRuleAllExpression6578);
            iv_ruleAllExpression=ruleAllExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAllExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllExpression6588); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAllExpression"


    // $ANTLR start "ruleAllExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3065:1: ruleAllExpression returns [EObject current=null] : (otherlv_0= KEYWORD_24 ( (lv_right_1_0= ruleSubquery ) ) ) ;
    public final EObject ruleAllExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3068:28: ( (otherlv_0= KEYWORD_24 ( (lv_right_1_0= ruleSubquery ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3069:1: (otherlv_0= KEYWORD_24 ( (lv_right_1_0= ruleSubquery ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3069:1: (otherlv_0= KEYWORD_24 ( (lv_right_1_0= ruleSubquery ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3070:2: otherlv_0= KEYWORD_24 ( (lv_right_1_0= ruleSubquery ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleAllExpression6626); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAllExpressionAccess().getALLKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3074:1: ( (lv_right_1_0= ruleSubquery ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3075:1: (lv_right_1_0= ruleSubquery )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3075:1: (lv_right_1_0= ruleSubquery )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3076:3: lv_right_1_0= ruleSubquery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAllExpressionAccess().getRightSubqueryParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSubquery_in_ruleAllExpression6646);
            lv_right_1_0=ruleSubquery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAllExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_1_0, 
                      		"Subquery");
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
    // $ANTLR end "ruleAllExpression"


    // $ANTLR start "entryRuleAnyExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3100:1: entryRuleAnyExpression returns [EObject current=null] : iv_ruleAnyExpression= ruleAnyExpression EOF ;
    public final EObject entryRuleAnyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3101:2: (iv_ruleAnyExpression= ruleAnyExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3102:2: iv_ruleAnyExpression= ruleAnyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAnyExpression_in_entryRuleAnyExpression6681);
            iv_ruleAnyExpression=ruleAnyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnyExpression6691); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnyExpression"


    // $ANTLR start "ruleAnyExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3109:1: ruleAnyExpression returns [EObject current=null] : (otherlv_0= KEYWORD_26 ( (lv_right_1_0= ruleSubquery ) ) ) ;
    public final EObject ruleAnyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3112:28: ( (otherlv_0= KEYWORD_26 ( (lv_right_1_0= ruleSubquery ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3113:1: (otherlv_0= KEYWORD_26 ( (lv_right_1_0= ruleSubquery ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3113:1: (otherlv_0= KEYWORD_26 ( (lv_right_1_0= ruleSubquery ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3114:2: otherlv_0= KEYWORD_26 ( (lv_right_1_0= ruleSubquery ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleAnyExpression6729); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnyExpressionAccess().getANYKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3118:1: ( (lv_right_1_0= ruleSubquery ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3119:1: (lv_right_1_0= ruleSubquery )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3119:1: (lv_right_1_0= ruleSubquery )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3120:3: lv_right_1_0= ruleSubquery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnyExpressionAccess().getRightSubqueryParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSubquery_in_ruleAnyExpression6749);
            lv_right_1_0=ruleSubquery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_1_0, 
                      		"Subquery");
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
    // $ANTLR end "ruleAnyExpression"


    // $ANTLR start "entryRuleSomeExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3144:1: entryRuleSomeExpression returns [EObject current=null] : iv_ruleSomeExpression= ruleSomeExpression EOF ;
    public final EObject entryRuleSomeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSomeExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3145:2: (iv_ruleSomeExpression= ruleSomeExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3146:2: iv_ruleSomeExpression= ruleSomeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSomeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSomeExpression_in_entryRuleSomeExpression6784);
            iv_ruleSomeExpression=ruleSomeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSomeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSomeExpression6794); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSomeExpression"


    // $ANTLR start "ruleSomeExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3153:1: ruleSomeExpression returns [EObject current=null] : (otherlv_0= KEYWORD_46 ( (lv_right_1_0= ruleSubquery ) ) ) ;
    public final EObject ruleSomeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3156:28: ( (otherlv_0= KEYWORD_46 ( (lv_right_1_0= ruleSubquery ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3157:1: (otherlv_0= KEYWORD_46 ( (lv_right_1_0= ruleSubquery ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3157:1: (otherlv_0= KEYWORD_46 ( (lv_right_1_0= ruleSubquery ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3158:2: otherlv_0= KEYWORD_46 ( (lv_right_1_0= ruleSubquery ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleSomeExpression6832); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSomeExpressionAccess().getSOMEKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3162:1: ( (lv_right_1_0= ruleSubquery ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3163:1: (lv_right_1_0= ruleSubquery )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3163:1: (lv_right_1_0= ruleSubquery )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3164:3: lv_right_1_0= ruleSubquery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSomeExpressionAccess().getRightSubqueryParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSubquery_in_ruleSomeExpression6852);
            lv_right_1_0=ruleSubquery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSomeExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_1_0, 
                      		"Subquery");
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
    // $ANTLR end "ruleSomeExpression"


    // $ANTLR start "entryRuleCollectionExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3188:1: entryRuleCollectionExpression returns [EObject current=null] : iv_ruleCollectionExpression= ruleCollectionExpression EOF ;
    public final EObject entryRuleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3189:2: (iv_ruleCollectionExpression= ruleCollectionExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3190:2: iv_ruleCollectionExpression= ruleCollectionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression6887);
            iv_ruleCollectionExpression=ruleCollectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionExpression6897); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionExpression"


    // $ANTLR start "ruleCollectionExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3197:1: ruleCollectionExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_34 ) )? otherlv_2= KEYWORD_70 (otherlv_3= KEYWORD_21 )? ( (lv_right_4_0= ruleAliasAttributeExpression ) ) ) ;
    public final EObject ruleCollectionExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3200:28: ( ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_34 ) )? otherlv_2= KEYWORD_70 (otherlv_3= KEYWORD_21 )? ( (lv_right_4_0= ruleAliasAttributeExpression ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3201:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_34 ) )? otherlv_2= KEYWORD_70 (otherlv_3= KEYWORD_21 )? ( (lv_right_4_0= ruleAliasAttributeExpression ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3201:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_34 ) )? otherlv_2= KEYWORD_70 (otherlv_3= KEYWORD_21 )? ( (lv_right_4_0= ruleAliasAttributeExpression ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3201:2: ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_34 ) )? otherlv_2= KEYWORD_70 (otherlv_3= KEYWORD_21 )? ( (lv_right_4_0= ruleAliasAttributeExpression ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3201:2: ( (lv_left_0_0= ruleVariable ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3202:1: (lv_left_0_0= ruleVariable )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3202:1: (lv_left_0_0= ruleVariable )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3203:3: lv_left_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionExpressionAccess().getLeftVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleCollectionExpression6943);
            lv_left_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCollectionExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3219:2: ( (lv_isNot_1_0= KEYWORD_34 ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==KEYWORD_34) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3220:1: (lv_isNot_1_0= KEYWORD_34 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3220:1: (lv_isNot_1_0= KEYWORD_34 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3221:3: lv_isNot_1_0= KEYWORD_34
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleCollectionExpression6962); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isNot_1_0, grammarAccess.getCollectionExpressionAccess().getIsNotNOTKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCollectionExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "isNot", true, "NOT");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,KEYWORD_70,FOLLOW_KEYWORD_70_in_ruleCollectionExpression6987); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCollectionExpressionAccess().getMEMBERKeyword_2());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3240:1: (otherlv_3= KEYWORD_21 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==KEYWORD_21) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3241:2: otherlv_3= KEYWORD_21
                    {
                    otherlv_3=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleCollectionExpression7000); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCollectionExpressionAccess().getOFKeyword_3());
                          
                    }

                    }
                    break;

            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3245:3: ( (lv_right_4_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3246:1: (lv_right_4_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3246:1: (lv_right_4_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3247:3: lv_right_4_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionExpressionAccess().getRightAliasAttributeExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleCollectionExpression7022);
            lv_right_4_0=ruleAliasAttributeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCollectionExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_4_0, 
                      		"AliasAttributeExpression");
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
    // $ANTLR end "ruleCollectionExpression"


    // $ANTLR start "entryRuleNullComparisonExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3271:1: entryRuleNullComparisonExpression returns [EObject current=null] : iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF ;
    public final EObject entryRuleNullComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullComparisonExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3272:2: (iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3273:2: iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullComparisonExpression_in_entryRuleNullComparisonExpression7057);
            iv_ruleNullComparisonExpression=ruleNullComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullComparisonExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullComparisonExpression7067); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullComparisonExpression"


    // $ANTLR start "ruleNullComparisonExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3280:1: ruleNullComparisonExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_20 ( (lv_isNot_2_0= KEYWORD_34 ) )? otherlv_3= KEYWORD_44 ) ;
    public final EObject ruleNullComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isNot_2_0=null;
        Token otherlv_3=null;
        EObject lv_left_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3283:28: ( ( ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_20 ( (lv_isNot_2_0= KEYWORD_34 ) )? otherlv_3= KEYWORD_44 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3284:1: ( ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_20 ( (lv_isNot_2_0= KEYWORD_34 ) )? otherlv_3= KEYWORD_44 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3284:1: ( ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_20 ( (lv_isNot_2_0= KEYWORD_34 ) )? otherlv_3= KEYWORD_44 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3284:2: ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_20 ( (lv_isNot_2_0= KEYWORD_34 ) )? otherlv_3= KEYWORD_44
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3284:2: ( (lv_left_0_0= ruleVariable ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3285:1: (lv_left_0_0= ruleVariable )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3285:1: (lv_left_0_0= ruleVariable )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3286:3: lv_left_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNullComparisonExpressionAccess().getLeftVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleNullComparisonExpression7113);
            lv_left_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNullComparisonExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleNullComparisonExpression7126); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNullComparisonExpressionAccess().getISKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3307:1: ( (lv_isNot_2_0= KEYWORD_34 ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==KEYWORD_34) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3308:1: (lv_isNot_2_0= KEYWORD_34 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3308:1: (lv_isNot_2_0= KEYWORD_34 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3309:3: lv_isNot_2_0= KEYWORD_34
                    {
                    lv_isNot_2_0=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleNullComparisonExpression7144); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isNot_2_0, grammarAccess.getNullComparisonExpressionAccess().getIsNotNOTKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNullComparisonExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "isNot", true, "NOT");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleNullComparisonExpression7169); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getNullComparisonExpressionAccess().getNULLKeyword_3());
                  
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
    // $ANTLR end "ruleNullComparisonExpression"


    // $ANTLR start "entryRuleEmptyComparisonExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3336:1: entryRuleEmptyComparisonExpression returns [EObject current=null] : iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF ;
    public final EObject entryRuleEmptyComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyComparisonExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3337:2: (iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3338:2: iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmptyComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEmptyComparisonExpression_in_entryRuleEmptyComparisonExpression7203);
            iv_ruleEmptyComparisonExpression=ruleEmptyComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmptyComparisonExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmptyComparisonExpression7213); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmptyComparisonExpression"


    // $ANTLR start "ruleEmptyComparisonExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3345:1: ruleEmptyComparisonExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_20 ( (lv_isNot_2_0= KEYWORD_34 ) )? otherlv_3= KEYWORD_52 ) ;
    public final EObject ruleEmptyComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isNot_2_0=null;
        Token otherlv_3=null;
        EObject lv_left_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3348:28: ( ( ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_20 ( (lv_isNot_2_0= KEYWORD_34 ) )? otherlv_3= KEYWORD_52 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3349:1: ( ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_20 ( (lv_isNot_2_0= KEYWORD_34 ) )? otherlv_3= KEYWORD_52 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3349:1: ( ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_20 ( (lv_isNot_2_0= KEYWORD_34 ) )? otherlv_3= KEYWORD_52 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3349:2: ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_20 ( (lv_isNot_2_0= KEYWORD_34 ) )? otherlv_3= KEYWORD_52
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3349:2: ( (lv_left_0_0= ruleVariable ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3350:1: (lv_left_0_0= ruleVariable )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3350:1: (lv_left_0_0= ruleVariable )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3351:3: lv_left_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEmptyComparisonExpressionAccess().getLeftVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleEmptyComparisonExpression7259);
            lv_left_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEmptyComparisonExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleEmptyComparisonExpression7272); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEmptyComparisonExpressionAccess().getISKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3372:1: ( (lv_isNot_2_0= KEYWORD_34 ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==KEYWORD_34) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3373:1: (lv_isNot_2_0= KEYWORD_34 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3373:1: (lv_isNot_2_0= KEYWORD_34 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3374:3: lv_isNot_2_0= KEYWORD_34
                    {
                    lv_isNot_2_0=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleEmptyComparisonExpression7290); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isNot_2_0, grammarAccess.getEmptyComparisonExpressionAccess().getIsNotNOTKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEmptyComparisonExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "isNot", true, "NOT");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleEmptyComparisonExpression7315); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEmptyComparisonExpressionAccess().getEMPTYKeyword_3());
                  
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
    // $ANTLR end "ruleEmptyComparisonExpression"


    // $ANTLR start "entryRuleLikeExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3401:1: entryRuleLikeExpression returns [EObject current=null] : iv_ruleLikeExpression= ruleLikeExpression EOF ;
    public final EObject entryRuleLikeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLikeExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3402:2: (iv_ruleLikeExpression= ruleLikeExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3403:2: iv_ruleLikeExpression= ruleLikeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLikeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLikeExpression_in_entryRuleLikeExpression7349);
            iv_ruleLikeExpression=ruleLikeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLikeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLikeExpression7359); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLikeExpression"


    // $ANTLR start "ruleLikeExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3410:1: ruleLikeExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_34 ) )? otherlv_2= KEYWORD_43 ( (lv_right_3_0= ruleStringLiteral ) ) ) ;
    public final EObject ruleLikeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3413:28: ( ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_34 ) )? otherlv_2= KEYWORD_43 ( (lv_right_3_0= ruleStringLiteral ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3414:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_34 ) )? otherlv_2= KEYWORD_43 ( (lv_right_3_0= ruleStringLiteral ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3414:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_34 ) )? otherlv_2= KEYWORD_43 ( (lv_right_3_0= ruleStringLiteral ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3414:2: ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_34 ) )? otherlv_2= KEYWORD_43 ( (lv_right_3_0= ruleStringLiteral ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3414:2: ( (lv_left_0_0= ruleVariable ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3415:1: (lv_left_0_0= ruleVariable )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3415:1: (lv_left_0_0= ruleVariable )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3416:3: lv_left_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLikeExpressionAccess().getLeftVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleLikeExpression7405);
            lv_left_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLikeExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3432:2: ( (lv_isNot_1_0= KEYWORD_34 ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==KEYWORD_34) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3433:1: (lv_isNot_1_0= KEYWORD_34 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3433:1: (lv_isNot_1_0= KEYWORD_34 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3434:3: lv_isNot_1_0= KEYWORD_34
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleLikeExpression7424); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isNot_1_0, grammarAccess.getLikeExpressionAccess().getIsNotNOTKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLikeExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "isNot", true, "NOT");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleLikeExpression7449); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLikeExpressionAccess().getLIKEKeyword_2());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3453:1: ( (lv_right_3_0= ruleStringLiteral ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3454:1: (lv_right_3_0= ruleStringLiteral )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3454:1: (lv_right_3_0= ruleStringLiteral )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3455:3: lv_right_3_0= ruleStringLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLikeExpressionAccess().getRightStringLiteralParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_ruleLikeExpression7469);
            lv_right_3_0=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLikeExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_3_0, 
                      		"StringLiteral");
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
    // $ANTLR end "ruleLikeExpression"


    // $ANTLR start "entryRuleInExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3479:1: entryRuleInExpression returns [EObject current=null] : iv_ruleInExpression= ruleInExpression EOF ;
    public final EObject entryRuleInExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3480:2: (iv_ruleInExpression= ruleInExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3481:2: iv_ruleInExpression= ruleInExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInExpression_in_entryRuleInExpression7504);
            iv_ruleInExpression=ruleInExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInExpression7514); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInExpression"


    // $ANTLR start "ruleInExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3488:1: ruleInExpression returns [EObject current=null] : (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression ) ;
    public final EObject ruleInExpression() throws RecognitionException {
        EObject current = null;

        EObject this_InSeqExpression_0 = null;

        EObject this_InQueryExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3491:28: ( (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3492:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3492:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )
            int alt48=2;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3493:2: this_InSeqExpression_0= ruleInSeqExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInExpressionAccess().getInSeqExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInSeqExpression_in_ruleInExpression7564);
                    this_InSeqExpression_0=ruleInSeqExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_InSeqExpression_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3506:2: this_InQueryExpression_1= ruleInQueryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInExpressionAccess().getInQueryExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInQueryExpression_in_ruleInExpression7594);
                    this_InQueryExpression_1=ruleInQueryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_InQueryExpression_1;
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
    // $ANTLR end "ruleInExpression"


    // $ANTLR start "entryRuleInSeqExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3525:1: entryRuleInSeqExpression returns [EObject current=null] : iv_ruleInSeqExpression= ruleInSeqExpression EOF ;
    public final EObject entryRuleInSeqExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInSeqExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3526:2: (iv_ruleInSeqExpression= ruleInSeqExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3527:2: iv_ruleInSeqExpression= ruleInSeqExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInSeqExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInSeqExpression_in_entryRuleInSeqExpression7628);
            iv_ruleInSeqExpression=ruleInSeqExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInSeqExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInSeqExpression7638); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInSeqExpression"


    // $ANTLR start "ruleInSeqExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3534:1: ruleInSeqExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_34 ) )? otherlv_2= KEYWORD_19 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_5 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2 ) ;
    public final EObject ruleInSeqExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_left_0_0 = null;

        EObject lv_items_4_0 = null;

        EObject lv_items_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3537:28: ( ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_34 ) )? otherlv_2= KEYWORD_19 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_5 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3538:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_34 ) )? otherlv_2= KEYWORD_19 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_5 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3538:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_34 ) )? otherlv_2= KEYWORD_19 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_5 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3538:2: ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_34 ) )? otherlv_2= KEYWORD_19 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_5 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3538:2: ( (lv_left_0_0= ruleVariable ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3539:1: (lv_left_0_0= ruleVariable )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3539:1: (lv_left_0_0= ruleVariable )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3540:3: lv_left_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInSeqExpressionAccess().getLeftVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7684);
            lv_left_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInSeqExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3556:2: ( (lv_isNot_1_0= KEYWORD_34 ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==KEYWORD_34) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3557:1: (lv_isNot_1_0= KEYWORD_34 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3557:1: (lv_isNot_1_0= KEYWORD_34 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3558:3: lv_isNot_1_0= KEYWORD_34
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleInSeqExpression7703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isNot_1_0, grammarAccess.getInSeqExpressionAccess().getIsNotNOTKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInSeqExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "isNot", true, "NOT");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleInSeqExpression7728); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInSeqExpressionAccess().getINKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleInSeqExpression7740); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInSeqExpressionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3582:1: ( (lv_items_4_0= ruleVariable ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3583:1: (lv_items_4_0= ruleVariable )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3583:1: (lv_items_4_0= ruleVariable )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3584:3: lv_items_4_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInSeqExpressionAccess().getItemsVariableParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7760);
            lv_items_4_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInSeqExpressionRule());
              	        }
                     		add(
                     			current, 
                     			"items",
                      		lv_items_4_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3600:2: (otherlv_5= KEYWORD_5 ( (lv_items_6_0= ruleVariable ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==KEYWORD_5) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3601:2: otherlv_5= KEYWORD_5 ( (lv_items_6_0= ruleVariable ) )
            	    {
            	    otherlv_5=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleInSeqExpression7774); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getInSeqExpressionAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3605:1: ( (lv_items_6_0= ruleVariable ) )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3606:1: (lv_items_6_0= ruleVariable )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3606:1: (lv_items_6_0= ruleVariable )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3607:3: lv_items_6_0= ruleVariable
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInSeqExpressionAccess().getItemsVariableParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7794);
            	    lv_items_6_0=ruleVariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInSeqExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"items",
            	              		lv_items_6_0, 
            	              		"Variable");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_7=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleInSeqExpression7809); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getInSeqExpressionAccess().getRightParenthesisKeyword_6());
                  
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
    // $ANTLR end "ruleInSeqExpression"


    // $ANTLR start "entryRuleInQueryExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3636:1: entryRuleInQueryExpression returns [EObject current=null] : iv_ruleInQueryExpression= ruleInQueryExpression EOF ;
    public final EObject entryRuleInQueryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInQueryExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3637:2: (iv_ruleInQueryExpression= ruleInQueryExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3638:2: iv_ruleInQueryExpression= ruleInQueryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInQueryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInQueryExpression_in_entryRuleInQueryExpression7843);
            iv_ruleInQueryExpression=ruleInQueryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInQueryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInQueryExpression7853); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInQueryExpression"


    // $ANTLR start "ruleInQueryExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3645:1: ruleInQueryExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_34 ) )? otherlv_2= KEYWORD_19 ( (lv_query_3_0= ruleSubquery ) ) ) ;
    public final EObject ruleInQueryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        EObject lv_left_0_0 = null;

        EObject lv_query_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3648:28: ( ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_34 ) )? otherlv_2= KEYWORD_19 ( (lv_query_3_0= ruleSubquery ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3649:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_34 ) )? otherlv_2= KEYWORD_19 ( (lv_query_3_0= ruleSubquery ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3649:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_34 ) )? otherlv_2= KEYWORD_19 ( (lv_query_3_0= ruleSubquery ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3649:2: ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_34 ) )? otherlv_2= KEYWORD_19 ( (lv_query_3_0= ruleSubquery ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3649:2: ( (lv_left_0_0= ruleVariable ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3650:1: (lv_left_0_0= ruleVariable )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3650:1: (lv_left_0_0= ruleVariable )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3651:3: lv_left_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInQueryExpressionAccess().getLeftVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleInQueryExpression7899);
            lv_left_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInQueryExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3667:2: ( (lv_isNot_1_0= KEYWORD_34 ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==KEYWORD_34) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3668:1: (lv_isNot_1_0= KEYWORD_34 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3668:1: (lv_isNot_1_0= KEYWORD_34 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3669:3: lv_isNot_1_0= KEYWORD_34
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleInQueryExpression7918); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isNot_1_0, grammarAccess.getInQueryExpressionAccess().getIsNotNOTKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInQueryExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "isNot", true, "NOT");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleInQueryExpression7943); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInQueryExpressionAccess().getINKeyword_2());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3688:1: ( (lv_query_3_0= ruleSubquery ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3689:1: (lv_query_3_0= ruleSubquery )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3689:1: (lv_query_3_0= ruleSubquery )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3690:3: lv_query_3_0= ruleSubquery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInQueryExpressionAccess().getQuerySubqueryParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSubquery_in_ruleInQueryExpression7963);
            lv_query_3_0=ruleSubquery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInQueryExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"query",
                      		lv_query_3_0, 
                      		"Subquery");
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
    // $ANTLR end "ruleInQueryExpression"


    // $ANTLR start "entryRuleBetweenExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3714:1: entryRuleBetweenExpression returns [EObject current=null] : iv_ruleBetweenExpression= ruleBetweenExpression EOF ;
    public final EObject entryRuleBetweenExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBetweenExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3715:2: (iv_ruleBetweenExpression= ruleBetweenExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3716:2: iv_ruleBetweenExpression= ruleBetweenExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBetweenExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBetweenExpression_in_entryRuleBetweenExpression7998);
            iv_ruleBetweenExpression=ruleBetweenExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBetweenExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBetweenExpression8008); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBetweenExpression"


    // $ANTLR start "ruleBetweenExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3723:1: ruleBetweenExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_34 ) )? otherlv_2= KEYWORD_75 ( (lv_min_3_0= ruleLiteral ) ) otherlv_4= KEYWORD_25 ( (lv_max_5_0= ruleLiteral ) ) ) ;
    public final EObject ruleBetweenExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_left_0_0 = null;

        EObject lv_min_3_0 = null;

        EObject lv_max_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3726:28: ( ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_34 ) )? otherlv_2= KEYWORD_75 ( (lv_min_3_0= ruleLiteral ) ) otherlv_4= KEYWORD_25 ( (lv_max_5_0= ruleLiteral ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3727:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_34 ) )? otherlv_2= KEYWORD_75 ( (lv_min_3_0= ruleLiteral ) ) otherlv_4= KEYWORD_25 ( (lv_max_5_0= ruleLiteral ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3727:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_34 ) )? otherlv_2= KEYWORD_75 ( (lv_min_3_0= ruleLiteral ) ) otherlv_4= KEYWORD_25 ( (lv_max_5_0= ruleLiteral ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3727:2: ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_34 ) )? otherlv_2= KEYWORD_75 ( (lv_min_3_0= ruleLiteral ) ) otherlv_4= KEYWORD_25 ( (lv_max_5_0= ruleLiteral ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3727:2: ( (lv_left_0_0= ruleVariable ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3728:1: (lv_left_0_0= ruleVariable )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3728:1: (lv_left_0_0= ruleVariable )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3729:3: lv_left_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBetweenExpressionAccess().getLeftVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleBetweenExpression8054);
            lv_left_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBetweenExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3745:2: ( (lv_isNot_1_0= KEYWORD_34 ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==KEYWORD_34) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3746:1: (lv_isNot_1_0= KEYWORD_34 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3746:1: (lv_isNot_1_0= KEYWORD_34 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3747:3: lv_isNot_1_0= KEYWORD_34
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleBetweenExpression8073); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isNot_1_0, grammarAccess.getBetweenExpressionAccess().getIsNotNOTKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBetweenExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "isNot", true, "NOT");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,KEYWORD_75,FOLLOW_KEYWORD_75_in_ruleBetweenExpression8098); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBetweenExpressionAccess().getBETWEENKeyword_2());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3766:1: ( (lv_min_3_0= ruleLiteral ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3767:1: (lv_min_3_0= ruleLiteral )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3767:1: (lv_min_3_0= ruleLiteral )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3768:3: lv_min_3_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBetweenExpressionAccess().getMinLiteralParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_ruleBetweenExpression8118);
            lv_min_3_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBetweenExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"min",
                      		lv_min_3_0, 
                      		"Literal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleBetweenExpression8131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBetweenExpressionAccess().getANDKeyword_4());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3789:1: ( (lv_max_5_0= ruleLiteral ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3790:1: (lv_max_5_0= ruleLiteral )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3790:1: (lv_max_5_0= ruleLiteral )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3791:3: lv_max_5_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBetweenExpressionAccess().getMaxLiteralParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_ruleBetweenExpression8151);
            lv_max_5_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBetweenExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"max",
                      		lv_max_5_0, 
                      		"Literal");
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
    // $ANTLR end "ruleBetweenExpression"


    // $ANTLR start "entryRuleVariable"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3815:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3816:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3817:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable8186);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable8196); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3824:1: ruleVariable returns [EObject current=null] : (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Literal_2= ruleLiteral ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_AliasAttributeExpression_0 = null;

        EObject this_ParameterExpression_1 = null;

        EObject this_Literal_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3827:28: ( (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Literal_2= ruleLiteral ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3828:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Literal_2= ruleLiteral )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3828:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Literal_2= ruleLiteral )
            int alt53=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt53=1;
                }
                break;
            case KEYWORD_9:
            case KEYWORD_13:
                {
                alt53=2;
                }
                break;
            case KEYWORD_53:
            case KEYWORD_44:
            case KEYWORD_49:
            case RULE_INT:
            case RULE_STRING:
                {
                alt53=3;
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3829:2: this_AliasAttributeExpression_0= ruleAliasAttributeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccess().getAliasAttributeExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleVariable8246);
                    this_AliasAttributeExpression_0=ruleAliasAttributeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_AliasAttributeExpression_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3842:2: this_ParameterExpression_1= ruleParameterExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccess().getParameterExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameterExpression_in_ruleVariable8276);
                    this_ParameterExpression_1=ruleParameterExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ParameterExpression_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3855:2: this_Literal_2= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccess().getLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleVariable8306);
                    this_Literal_2=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_Literal_2;
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpressionTerm"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3874:1: entryRuleExpressionTerm returns [EObject current=null] : iv_ruleExpressionTerm= ruleExpressionTerm EOF ;
    public final EObject entryRuleExpressionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionTerm = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3875:2: (iv_ruleExpressionTerm= ruleExpressionTerm EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3876:2: iv_ruleExpressionTerm= ruleExpressionTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionTermRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionTerm_in_entryRuleExpressionTerm8340);
            iv_ruleExpressionTerm=ruleExpressionTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionTerm8350); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionTerm"


    // $ANTLR start "ruleExpressionTerm"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3883:1: ruleExpressionTerm returns [EObject current=null] : (this_Variable_0= ruleVariable | this_Subquery_1= ruleSubquery ) ;
    public final EObject ruleExpressionTerm() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_Subquery_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3886:28: ( (this_Variable_0= ruleVariable | this_Subquery_1= ruleSubquery ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3887:1: (this_Variable_0= ruleVariable | this_Subquery_1= ruleSubquery )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3887:1: (this_Variable_0= ruleVariable | this_Subquery_1= ruleSubquery )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==KEYWORD_53||LA54_0==KEYWORD_44||LA54_0==KEYWORD_49||LA54_0==KEYWORD_9||(LA54_0>=KEYWORD_13 && LA54_0<=RULE_STRING)) ) {
                alt54=1;
            }
            else if ( (LA54_0==KEYWORD_1) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3888:2: this_Variable_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionTermAccess().getVariableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleExpressionTerm8400);
                    this_Variable_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_Variable_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3901:2: this_Subquery_1= ruleSubquery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionTermAccess().getSubqueryParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubquery_in_ruleExpressionTerm8430);
                    this_Subquery_1=ruleSubquery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_Subquery_1;
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
    // $ANTLR end "ruleExpressionTerm"


    // $ANTLR start "entryRuleAliasAttributeExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3920:1: entryRuleAliasAttributeExpression returns [EObject current=null] : iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF ;
    public final EObject entryRuleAliasAttributeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasAttributeExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3921:2: (iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3922:2: iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAliasAttributeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_entryRuleAliasAttributeExpression8464);
            iv_ruleAliasAttributeExpression=ruleAliasAttributeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAliasAttributeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAliasAttributeExpression8474); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAliasAttributeExpression"


    // $ANTLR start "ruleAliasAttributeExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3929:1: ruleAliasAttributeExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_7 ( (lv_attributes_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleAliasAttributeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_attributes_2_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3932:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_7 ( (lv_attributes_2_0= RULE_ID ) ) )* ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3933:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_7 ( (lv_attributes_2_0= RULE_ID ) ) )* )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3933:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_7 ( (lv_attributes_2_0= RULE_ID ) ) )* )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3933:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_7 ( (lv_attributes_2_0= RULE_ID ) ) )*
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3933:2: ( (otherlv_0= RULE_ID ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3934:1: (otherlv_0= RULE_ID )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3934:1: (otherlv_0= RULE_ID )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3935:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAliasAttributeExpressionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8523); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getAliasAttributeExpressionAccess().getAliasVariableDeclarationCrossReference_0_0()); 
              	
            }

            }


            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3949:2: (otherlv_1= KEYWORD_7 ( (lv_attributes_2_0= RULE_ID ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==KEYWORD_7) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3950:2: otherlv_1= KEYWORD_7 ( (lv_attributes_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleAliasAttributeExpression8537); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getAliasAttributeExpressionAccess().getFullStopKeyword_1_0());
            	          
            	    }
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3954:1: ( (lv_attributes_2_0= RULE_ID ) )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3955:1: (lv_attributes_2_0= RULE_ID )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3955:1: (lv_attributes_2_0= RULE_ID )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3956:3: lv_attributes_2_0= RULE_ID
            	    {
            	    lv_attributes_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8553); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_attributes_2_0, grammarAccess.getAliasAttributeExpressionAccess().getAttributesIDTerminalRuleCall_1_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getAliasAttributeExpressionRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_2_0, 
            	              		"ID");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // $ANTLR end "ruleAliasAttributeExpression"


    // $ANTLR start "entryRuleParameterExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3980:1: entryRuleParameterExpression returns [EObject current=null] : iv_ruleParameterExpression= ruleParameterExpression EOF ;
    public final EObject entryRuleParameterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3981:2: (iv_ruleParameterExpression= ruleParameterExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3982:2: iv_ruleParameterExpression= ruleParameterExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParameterExpression_in_entryRuleParameterExpression8595);
            iv_ruleParameterExpression=ruleParameterExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterExpression8605); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterExpression"


    // $ANTLR start "ruleParameterExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3989:1: ruleParameterExpression returns [EObject current=null] : ( (otherlv_0= KEYWORD_9 ( (lv_name_1_0= ruleParameterName ) ) ) | (otherlv_2= KEYWORD_13 ( (lv_index_3_0= RULE_INT ) ) ) ) ;
    public final EObject ruleParameterExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_index_3_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3992:28: ( ( (otherlv_0= KEYWORD_9 ( (lv_name_1_0= ruleParameterName ) ) ) | (otherlv_2= KEYWORD_13 ( (lv_index_3_0= RULE_INT ) ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3993:1: ( (otherlv_0= KEYWORD_9 ( (lv_name_1_0= ruleParameterName ) ) ) | (otherlv_2= KEYWORD_13 ( (lv_index_3_0= RULE_INT ) ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3993:1: ( (otherlv_0= KEYWORD_9 ( (lv_name_1_0= ruleParameterName ) ) ) | (otherlv_2= KEYWORD_13 ( (lv_index_3_0= RULE_INT ) ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==KEYWORD_9) ) {
                alt56=1;
            }
            else if ( (LA56_0==KEYWORD_13) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3993:2: (otherlv_0= KEYWORD_9 ( (lv_name_1_0= ruleParameterName ) ) )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3993:2: (otherlv_0= KEYWORD_9 ( (lv_name_1_0= ruleParameterName ) ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3994:2: otherlv_0= KEYWORD_9 ( (lv_name_1_0= ruleParameterName ) )
                    {
                    otherlv_0=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleParameterExpression8644); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getParameterExpressionAccess().getColonKeyword_0_0());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3998:1: ( (lv_name_1_0= ruleParameterName ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3999:1: (lv_name_1_0= ruleParameterName )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3999:1: (lv_name_1_0= ruleParameterName )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4000:3: lv_name_1_0= ruleParameterName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterExpressionAccess().getNameParameterNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterName_in_ruleParameterExpression8664);
                    lv_name_1_0=ruleParameterName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParameterExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"ParameterName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4017:6: (otherlv_2= KEYWORD_13 ( (lv_index_3_0= RULE_INT ) ) )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4017:6: (otherlv_2= KEYWORD_13 ( (lv_index_3_0= RULE_INT ) ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4018:2: otherlv_2= KEYWORD_13 ( (lv_index_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleParameterExpression8685); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getParameterExpressionAccess().getQuestionMarkKeyword_1_0());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4022:1: ( (lv_index_3_0= RULE_INT ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4023:1: (lv_index_3_0= RULE_INT )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4023:1: (lv_index_3_0= RULE_INT )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4024:3: lv_index_3_0= RULE_INT
                    {
                    lv_index_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleParameterExpression8701); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_index_3_0, grammarAccess.getParameterExpressionAccess().getIndexINTTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getParameterExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"index",
                              		lv_index_3_0, 
                              		"INT");
                      	    
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
    // $ANTLR end "ruleParameterExpression"


    // $ANTLR start "entryRuleFunctionExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4048:1: entryRuleFunctionExpression returns [EObject current=null] : iv_ruleFunctionExpression= ruleFunctionExpression EOF ;
    public final EObject entryRuleFunctionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4049:2: (iv_ruleFunctionExpression= ruleFunctionExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4050:2: iv_ruleFunctionExpression= ruleFunctionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionExpression_in_entryRuleFunctionExpression8742);
            iv_ruleFunctionExpression=ruleFunctionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionExpression8752); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionExpression"


    // $ANTLR start "ruleFunctionExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4057:1: ruleFunctionExpression returns [EObject current=null] : (this_ArithmeticFunctionExpression_0= ruleArithmeticFunctionExpression | this_CollectionFunctionExpression_1= ruleCollectionFunctionExpression | this_StringFunctionExpression_2= ruleStringFunctionExpression | this_TemporalFunctionExpression_3= ruleTemporalFunctionExpression ) ;
    public final EObject ruleFunctionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ArithmeticFunctionExpression_0 = null;

        EObject this_CollectionFunctionExpression_1 = null;

        EObject this_StringFunctionExpression_2 = null;

        EObject this_TemporalFunctionExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4060:28: ( (this_ArithmeticFunctionExpression_0= ruleArithmeticFunctionExpression | this_CollectionFunctionExpression_1= ruleCollectionFunctionExpression | this_StringFunctionExpression_2= ruleStringFunctionExpression | this_TemporalFunctionExpression_3= ruleTemporalFunctionExpression ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4061:1: (this_ArithmeticFunctionExpression_0= ruleArithmeticFunctionExpression | this_CollectionFunctionExpression_1= ruleCollectionFunctionExpression | this_StringFunctionExpression_2= ruleStringFunctionExpression | this_TemporalFunctionExpression_3= ruleTemporalFunctionExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4061:1: (this_ArithmeticFunctionExpression_0= ruleArithmeticFunctionExpression | this_CollectionFunctionExpression_1= ruleCollectionFunctionExpression | this_StringFunctionExpression_2= ruleStringFunctionExpression | this_TemporalFunctionExpression_3= ruleTemporalFunctionExpression )
            int alt57=4;
            switch ( input.LA(1) ) {
            case KEYWORD_47:
            case KEYWORD_23:
            case KEYWORD_32:
                {
                alt57=1;
                }
                break;
            case KEYWORD_56:
            case KEYWORD_45:
                {
                alt57=2;
                }
                break;
            case KEYWORD_79:
            case KEYWORD_64:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_58:
            case KEYWORD_62:
            case KEYWORD_48:
                {
                alt57=3;
                }
                break;
            case KEYWORD_82:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_59:
            case KEYWORD_40:
            case KEYWORD_50:
            case KEYWORD_29:
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4062:2: this_ArithmeticFunctionExpression_0= ruleArithmeticFunctionExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFunctionExpressionAccess().getArithmeticFunctionExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArithmeticFunctionExpression_in_ruleFunctionExpression8802);
                    this_ArithmeticFunctionExpression_0=ruleArithmeticFunctionExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ArithmeticFunctionExpression_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4075:2: this_CollectionFunctionExpression_1= ruleCollectionFunctionExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFunctionExpressionAccess().getCollectionFunctionExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCollectionFunctionExpression_in_ruleFunctionExpression8832);
                    this_CollectionFunctionExpression_1=ruleCollectionFunctionExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_CollectionFunctionExpression_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4088:2: this_StringFunctionExpression_2= ruleStringFunctionExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFunctionExpressionAccess().getStringFunctionExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringFunctionExpression_in_ruleFunctionExpression8862);
                    this_StringFunctionExpression_2=ruleStringFunctionExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_StringFunctionExpression_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4101:2: this_TemporalFunctionExpression_3= ruleTemporalFunctionExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFunctionExpressionAccess().getTemporalFunctionExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTemporalFunctionExpression_in_ruleFunctionExpression8892);
                    this_TemporalFunctionExpression_3=ruleTemporalFunctionExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_TemporalFunctionExpression_3;
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
    // $ANTLR end "ruleFunctionExpression"


    // $ANTLR start "entryRuleStringFunctionExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4120:1: entryRuleStringFunctionExpression returns [EObject current=null] : iv_ruleStringFunctionExpression= ruleStringFunctionExpression EOF ;
    public final EObject entryRuleStringFunctionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringFunctionExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4121:2: (iv_ruleStringFunctionExpression= ruleStringFunctionExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4122:2: iv_ruleStringFunctionExpression= ruleStringFunctionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringFunctionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleStringFunctionExpression_in_entryRuleStringFunctionExpression8926);
            iv_ruleStringFunctionExpression=ruleStringFunctionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringFunctionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunctionExpression8936); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringFunctionExpression"


    // $ANTLR start "ruleStringFunctionExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4129:1: ruleStringFunctionExpression returns [EObject current=null] : ( ( ( (lv_name_0_0= KEYWORD_64 ) ) otherlv_1= KEYWORD_1 ( (lv_fields_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_5 ( (lv_fields_4_0= ruleVariable ) ) )* otherlv_5= KEYWORD_2 ) | ( ( (lv_name_6_0= KEYWORD_79 ) ) otherlv_7= KEYWORD_1 ( (lv_field_8_0= ruleVariable ) ) otherlv_9= KEYWORD_5 ( (lv_startPos_10_0= ruleVariable ) ) (otherlv_11= KEYWORD_5 ( (lv_length_12_0= ruleVariable ) ) )? otherlv_13= KEYWORD_2 ) | ( ( (lv_name_14_0= KEYWORD_48 ) ) otherlv_15= KEYWORD_1 ( (lv_trimSpec_16_0= ruleTrimSpec ) )? ( (lv_trimChar_17_0= ruleVariable ) )? (otherlv_18= KEYWORD_39 )? ( (lv_field_19_0= ruleVariable ) ) otherlv_20= KEYWORD_2 ) | ( ( (lv_name_21_0= KEYWORD_58 ) ) otherlv_22= KEYWORD_1 ( (lv_field_23_0= ruleVariable ) ) otherlv_24= KEYWORD_2 ) | ( ( (lv_name_25_0= KEYWORD_62 ) ) otherlv_26= KEYWORD_1 ( (lv_field_27_0= ruleVariable ) ) otherlv_28= KEYWORD_2 ) | ( ( (lv_name_29_0= KEYWORD_68 ) ) otherlv_30= KEYWORD_1 ( (lv_field_31_0= ruleVariable ) ) otherlv_32= KEYWORD_2 ) | ( ( (lv_name_33_0= KEYWORD_69 ) ) otherlv_34= KEYWORD_1 ( (lv_fields_35_0= ruleVariable ) ) otherlv_36= KEYWORD_5 ( (lv_fields_37_0= ruleVariable ) ) (otherlv_38= KEYWORD_5 ( (lv_startPos_39_0= ruleVariable ) ) )? otherlv_40= KEYWORD_2 ) ) ;
    public final EObject ruleStringFunctionExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_name_14_0=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token lv_name_21_0=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token lv_name_25_0=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token lv_name_29_0=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token lv_name_33_0=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        EObject lv_fields_2_0 = null;

        EObject lv_fields_4_0 = null;

        EObject lv_field_8_0 = null;

        EObject lv_startPos_10_0 = null;

        EObject lv_length_12_0 = null;

        Enumerator lv_trimSpec_16_0 = null;

        EObject lv_trimChar_17_0 = null;

        EObject lv_field_19_0 = null;

        EObject lv_field_23_0 = null;

        EObject lv_field_27_0 = null;

        EObject lv_field_31_0 = null;

        EObject lv_fields_35_0 = null;

        EObject lv_fields_37_0 = null;

        EObject lv_startPos_39_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4132:28: ( ( ( ( (lv_name_0_0= KEYWORD_64 ) ) otherlv_1= KEYWORD_1 ( (lv_fields_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_5 ( (lv_fields_4_0= ruleVariable ) ) )* otherlv_5= KEYWORD_2 ) | ( ( (lv_name_6_0= KEYWORD_79 ) ) otherlv_7= KEYWORD_1 ( (lv_field_8_0= ruleVariable ) ) otherlv_9= KEYWORD_5 ( (lv_startPos_10_0= ruleVariable ) ) (otherlv_11= KEYWORD_5 ( (lv_length_12_0= ruleVariable ) ) )? otherlv_13= KEYWORD_2 ) | ( ( (lv_name_14_0= KEYWORD_48 ) ) otherlv_15= KEYWORD_1 ( (lv_trimSpec_16_0= ruleTrimSpec ) )? ( (lv_trimChar_17_0= ruleVariable ) )? (otherlv_18= KEYWORD_39 )? ( (lv_field_19_0= ruleVariable ) ) otherlv_20= KEYWORD_2 ) | ( ( (lv_name_21_0= KEYWORD_58 ) ) otherlv_22= KEYWORD_1 ( (lv_field_23_0= ruleVariable ) ) otherlv_24= KEYWORD_2 ) | ( ( (lv_name_25_0= KEYWORD_62 ) ) otherlv_26= KEYWORD_1 ( (lv_field_27_0= ruleVariable ) ) otherlv_28= KEYWORD_2 ) | ( ( (lv_name_29_0= KEYWORD_68 ) ) otherlv_30= KEYWORD_1 ( (lv_field_31_0= ruleVariable ) ) otherlv_32= KEYWORD_2 ) | ( ( (lv_name_33_0= KEYWORD_69 ) ) otherlv_34= KEYWORD_1 ( (lv_fields_35_0= ruleVariable ) ) otherlv_36= KEYWORD_5 ( (lv_fields_37_0= ruleVariable ) ) (otherlv_38= KEYWORD_5 ( (lv_startPos_39_0= ruleVariable ) ) )? otherlv_40= KEYWORD_2 ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4133:1: ( ( ( (lv_name_0_0= KEYWORD_64 ) ) otherlv_1= KEYWORD_1 ( (lv_fields_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_5 ( (lv_fields_4_0= ruleVariable ) ) )* otherlv_5= KEYWORD_2 ) | ( ( (lv_name_6_0= KEYWORD_79 ) ) otherlv_7= KEYWORD_1 ( (lv_field_8_0= ruleVariable ) ) otherlv_9= KEYWORD_5 ( (lv_startPos_10_0= ruleVariable ) ) (otherlv_11= KEYWORD_5 ( (lv_length_12_0= ruleVariable ) ) )? otherlv_13= KEYWORD_2 ) | ( ( (lv_name_14_0= KEYWORD_48 ) ) otherlv_15= KEYWORD_1 ( (lv_trimSpec_16_0= ruleTrimSpec ) )? ( (lv_trimChar_17_0= ruleVariable ) )? (otherlv_18= KEYWORD_39 )? ( (lv_field_19_0= ruleVariable ) ) otherlv_20= KEYWORD_2 ) | ( ( (lv_name_21_0= KEYWORD_58 ) ) otherlv_22= KEYWORD_1 ( (lv_field_23_0= ruleVariable ) ) otherlv_24= KEYWORD_2 ) | ( ( (lv_name_25_0= KEYWORD_62 ) ) otherlv_26= KEYWORD_1 ( (lv_field_27_0= ruleVariable ) ) otherlv_28= KEYWORD_2 ) | ( ( (lv_name_29_0= KEYWORD_68 ) ) otherlv_30= KEYWORD_1 ( (lv_field_31_0= ruleVariable ) ) otherlv_32= KEYWORD_2 ) | ( ( (lv_name_33_0= KEYWORD_69 ) ) otherlv_34= KEYWORD_1 ( (lv_fields_35_0= ruleVariable ) ) otherlv_36= KEYWORD_5 ( (lv_fields_37_0= ruleVariable ) ) (otherlv_38= KEYWORD_5 ( (lv_startPos_39_0= ruleVariable ) ) )? otherlv_40= KEYWORD_2 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4133:1: ( ( ( (lv_name_0_0= KEYWORD_64 ) ) otherlv_1= KEYWORD_1 ( (lv_fields_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_5 ( (lv_fields_4_0= ruleVariable ) ) )* otherlv_5= KEYWORD_2 ) | ( ( (lv_name_6_0= KEYWORD_79 ) ) otherlv_7= KEYWORD_1 ( (lv_field_8_0= ruleVariable ) ) otherlv_9= KEYWORD_5 ( (lv_startPos_10_0= ruleVariable ) ) (otherlv_11= KEYWORD_5 ( (lv_length_12_0= ruleVariable ) ) )? otherlv_13= KEYWORD_2 ) | ( ( (lv_name_14_0= KEYWORD_48 ) ) otherlv_15= KEYWORD_1 ( (lv_trimSpec_16_0= ruleTrimSpec ) )? ( (lv_trimChar_17_0= ruleVariable ) )? (otherlv_18= KEYWORD_39 )? ( (lv_field_19_0= ruleVariable ) ) otherlv_20= KEYWORD_2 ) | ( ( (lv_name_21_0= KEYWORD_58 ) ) otherlv_22= KEYWORD_1 ( (lv_field_23_0= ruleVariable ) ) otherlv_24= KEYWORD_2 ) | ( ( (lv_name_25_0= KEYWORD_62 ) ) otherlv_26= KEYWORD_1 ( (lv_field_27_0= ruleVariable ) ) otherlv_28= KEYWORD_2 ) | ( ( (lv_name_29_0= KEYWORD_68 ) ) otherlv_30= KEYWORD_1 ( (lv_field_31_0= ruleVariable ) ) otherlv_32= KEYWORD_2 ) | ( ( (lv_name_33_0= KEYWORD_69 ) ) otherlv_34= KEYWORD_1 ( (lv_fields_35_0= ruleVariable ) ) otherlv_36= KEYWORD_5 ( (lv_fields_37_0= ruleVariable ) ) (otherlv_38= KEYWORD_5 ( (lv_startPos_39_0= ruleVariable ) ) )? otherlv_40= KEYWORD_2 ) )
            int alt64=7;
            switch ( input.LA(1) ) {
            case KEYWORD_64:
                {
                alt64=1;
                }
                break;
            case KEYWORD_79:
                {
                alt64=2;
                }
                break;
            case KEYWORD_48:
                {
                alt64=3;
                }
                break;
            case KEYWORD_58:
                {
                alt64=4;
                }
                break;
            case KEYWORD_62:
                {
                alt64=5;
                }
                break;
            case KEYWORD_68:
                {
                alt64=6;
                }
                break;
            case KEYWORD_69:
                {
                alt64=7;
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4133:2: ( ( (lv_name_0_0= KEYWORD_64 ) ) otherlv_1= KEYWORD_1 ( (lv_fields_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_5 ( (lv_fields_4_0= ruleVariable ) ) )* otherlv_5= KEYWORD_2 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4133:2: ( ( (lv_name_0_0= KEYWORD_64 ) ) otherlv_1= KEYWORD_1 ( (lv_fields_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_5 ( (lv_fields_4_0= ruleVariable ) ) )* otherlv_5= KEYWORD_2 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4133:3: ( (lv_name_0_0= KEYWORD_64 ) ) otherlv_1= KEYWORD_1 ( (lv_fields_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_5 ( (lv_fields_4_0= ruleVariable ) ) )* otherlv_5= KEYWORD_2
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4133:3: ( (lv_name_0_0= KEYWORD_64 ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4134:1: (lv_name_0_0= KEYWORD_64 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4134:1: (lv_name_0_0= KEYWORD_64 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4135:3: lv_name_0_0= KEYWORD_64
                    {
                    lv_name_0_0=(Token)match(input,KEYWORD_64,FOLLOW_KEYWORD_64_in_ruleStringFunctionExpression8981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_0, grammarAccess.getStringFunctionExpressionAccess().getNameCONCATKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStringFunctionExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_0, "CONCAT");
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleStringFunctionExpression9005); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStringFunctionExpressionAccess().getLeftParenthesisKeyword_0_1());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4154:1: ( (lv_fields_2_0= ruleVariable ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4155:1: (lv_fields_2_0= ruleVariable )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4155:1: (lv_fields_2_0= ruleVariable )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4156:3: lv_fields_2_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStringFunctionExpressionAccess().getFieldsVariableParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleStringFunctionExpression9025);
                    lv_fields_2_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStringFunctionExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"fields",
                              		lv_fields_2_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4172:2: (otherlv_3= KEYWORD_5 ( (lv_fields_4_0= ruleVariable ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==KEYWORD_5) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4173:2: otherlv_3= KEYWORD_5 ( (lv_fields_4_0= ruleVariable ) )
                    	    {
                    	    otherlv_3=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStringFunctionExpression9039); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getStringFunctionExpressionAccess().getCommaKeyword_0_3_0());
                    	          
                    	    }
                    	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4177:1: ( (lv_fields_4_0= ruleVariable ) )
                    	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4178:1: (lv_fields_4_0= ruleVariable )
                    	    {
                    	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4178:1: (lv_fields_4_0= ruleVariable )
                    	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4179:3: lv_fields_4_0= ruleVariable
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStringFunctionExpressionAccess().getFieldsVariableParserRuleCall_0_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleVariable_in_ruleStringFunctionExpression9059);
                    	    lv_fields_4_0=ruleVariable();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getStringFunctionExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"fields",
                    	              		lv_fields_4_0, 
                    	              		"Variable");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleStringFunctionExpression9074); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getStringFunctionExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4201:6: ( ( (lv_name_6_0= KEYWORD_79 ) ) otherlv_7= KEYWORD_1 ( (lv_field_8_0= ruleVariable ) ) otherlv_9= KEYWORD_5 ( (lv_startPos_10_0= ruleVariable ) ) (otherlv_11= KEYWORD_5 ( (lv_length_12_0= ruleVariable ) ) )? otherlv_13= KEYWORD_2 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4201:6: ( ( (lv_name_6_0= KEYWORD_79 ) ) otherlv_7= KEYWORD_1 ( (lv_field_8_0= ruleVariable ) ) otherlv_9= KEYWORD_5 ( (lv_startPos_10_0= ruleVariable ) ) (otherlv_11= KEYWORD_5 ( (lv_length_12_0= ruleVariable ) ) )? otherlv_13= KEYWORD_2 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4201:7: ( (lv_name_6_0= KEYWORD_79 ) ) otherlv_7= KEYWORD_1 ( (lv_field_8_0= ruleVariable ) ) otherlv_9= KEYWORD_5 ( (lv_startPos_10_0= ruleVariable ) ) (otherlv_11= KEYWORD_5 ( (lv_length_12_0= ruleVariable ) ) )? otherlv_13= KEYWORD_2
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4201:7: ( (lv_name_6_0= KEYWORD_79 ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4202:1: (lv_name_6_0= KEYWORD_79 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4202:1: (lv_name_6_0= KEYWORD_79 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4203:3: lv_name_6_0= KEYWORD_79
                    {
                    lv_name_6_0=(Token)match(input,KEYWORD_79,FOLLOW_KEYWORD_79_in_ruleStringFunctionExpression9100); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_6_0, grammarAccess.getStringFunctionExpressionAccess().getNameSUBSTRINGKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStringFunctionExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_6_0, "SUBSTRING");
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleStringFunctionExpression9124); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getStringFunctionExpressionAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4222:1: ( (lv_field_8_0= ruleVariable ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4223:1: (lv_field_8_0= ruleVariable )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4223:1: (lv_field_8_0= ruleVariable )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4224:3: lv_field_8_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStringFunctionExpressionAccess().getFieldVariableParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleStringFunctionExpression9144);
                    lv_field_8_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStringFunctionExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"field",
                              		lv_field_8_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStringFunctionExpression9157); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getStringFunctionExpressionAccess().getCommaKeyword_1_3());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4245:1: ( (lv_startPos_10_0= ruleVariable ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4246:1: (lv_startPos_10_0= ruleVariable )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4246:1: (lv_startPos_10_0= ruleVariable )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4247:3: lv_startPos_10_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStringFunctionExpressionAccess().getStartPosVariableParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleStringFunctionExpression9177);
                    lv_startPos_10_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStringFunctionExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"startPos",
                              		lv_startPos_10_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4263:2: (otherlv_11= KEYWORD_5 ( (lv_length_12_0= ruleVariable ) ) )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==KEYWORD_5) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4264:2: otherlv_11= KEYWORD_5 ( (lv_length_12_0= ruleVariable ) )
                            {
                            otherlv_11=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStringFunctionExpression9191); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getStringFunctionExpressionAccess().getCommaKeyword_1_5_0());
                                  
                            }
                            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4268:1: ( (lv_length_12_0= ruleVariable ) )
                            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4269:1: (lv_length_12_0= ruleVariable )
                            {
                            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4269:1: (lv_length_12_0= ruleVariable )
                            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4270:3: lv_length_12_0= ruleVariable
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStringFunctionExpressionAccess().getLengthVariableParserRuleCall_1_5_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVariable_in_ruleStringFunctionExpression9211);
                            lv_length_12_0=ruleVariable();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStringFunctionExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"length",
                                      		lv_length_12_0, 
                                      		"Variable");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleStringFunctionExpression9226); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getStringFunctionExpressionAccess().getRightParenthesisKeyword_1_6());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4292:6: ( ( (lv_name_14_0= KEYWORD_48 ) ) otherlv_15= KEYWORD_1 ( (lv_trimSpec_16_0= ruleTrimSpec ) )? ( (lv_trimChar_17_0= ruleVariable ) )? (otherlv_18= KEYWORD_39 )? ( (lv_field_19_0= ruleVariable ) ) otherlv_20= KEYWORD_2 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4292:6: ( ( (lv_name_14_0= KEYWORD_48 ) ) otherlv_15= KEYWORD_1 ( (lv_trimSpec_16_0= ruleTrimSpec ) )? ( (lv_trimChar_17_0= ruleVariable ) )? (otherlv_18= KEYWORD_39 )? ( (lv_field_19_0= ruleVariable ) ) otherlv_20= KEYWORD_2 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4292:7: ( (lv_name_14_0= KEYWORD_48 ) ) otherlv_15= KEYWORD_1 ( (lv_trimSpec_16_0= ruleTrimSpec ) )? ( (lv_trimChar_17_0= ruleVariable ) )? (otherlv_18= KEYWORD_39 )? ( (lv_field_19_0= ruleVariable ) ) otherlv_20= KEYWORD_2
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4292:7: ( (lv_name_14_0= KEYWORD_48 ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4293:1: (lv_name_14_0= KEYWORD_48 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4293:1: (lv_name_14_0= KEYWORD_48 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4294:3: lv_name_14_0= KEYWORD_48
                    {
                    lv_name_14_0=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleStringFunctionExpression9252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_14_0, grammarAccess.getStringFunctionExpressionAccess().getNameTRIMKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStringFunctionExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_14_0, "TRIM");
                      	    
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleStringFunctionExpression9276); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getStringFunctionExpressionAccess().getLeftParenthesisKeyword_2_1());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4313:1: ( (lv_trimSpec_16_0= ruleTrimSpec ) )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==KEYWORD_78||LA60_0==KEYWORD_76||LA60_0==KEYWORD_37) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4314:1: (lv_trimSpec_16_0= ruleTrimSpec )
                            {
                            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4314:1: (lv_trimSpec_16_0= ruleTrimSpec )
                            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4315:3: lv_trimSpec_16_0= ruleTrimSpec
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStringFunctionExpressionAccess().getTrimSpecTrimSpecEnumRuleCall_2_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleTrimSpec_in_ruleStringFunctionExpression9296);
                            lv_trimSpec_16_0=ruleTrimSpec();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStringFunctionExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"trimSpec",
                                      		lv_trimSpec_16_0, 
                                      		"TrimSpec");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4331:3: ( (lv_trimChar_17_0= ruleVariable ) )?
                    int alt61=2;
                    alt61 = dfa61.predict(input);
                    switch (alt61) {
                        case 1 :
                            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4332:1: (lv_trimChar_17_0= ruleVariable )
                            {
                            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4332:1: (lv_trimChar_17_0= ruleVariable )
                            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4333:3: lv_trimChar_17_0= ruleVariable
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStringFunctionExpressionAccess().getTrimCharVariableParserRuleCall_2_3_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVariable_in_ruleStringFunctionExpression9318);
                            lv_trimChar_17_0=ruleVariable();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStringFunctionExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"trimChar",
                                      		lv_trimChar_17_0, 
                                      		"Variable");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4349:3: (otherlv_18= KEYWORD_39 )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==KEYWORD_39) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4350:2: otherlv_18= KEYWORD_39
                            {
                            otherlv_18=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleStringFunctionExpression9333); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_18, grammarAccess.getStringFunctionExpressionAccess().getFROMKeyword_2_4());
                                  
                            }

                            }
                            break;

                    }

                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4354:3: ( (lv_field_19_0= ruleVariable ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4355:1: (lv_field_19_0= ruleVariable )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4355:1: (lv_field_19_0= ruleVariable )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4356:3: lv_field_19_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStringFunctionExpressionAccess().getFieldVariableParserRuleCall_2_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleStringFunctionExpression9355);
                    lv_field_19_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStringFunctionExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"field",
                              		lv_field_19_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_20=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleStringFunctionExpression9368); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getStringFunctionExpressionAccess().getRightParenthesisKeyword_2_6());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4378:6: ( ( (lv_name_21_0= KEYWORD_58 ) ) otherlv_22= KEYWORD_1 ( (lv_field_23_0= ruleVariable ) ) otherlv_24= KEYWORD_2 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4378:6: ( ( (lv_name_21_0= KEYWORD_58 ) ) otherlv_22= KEYWORD_1 ( (lv_field_23_0= ruleVariable ) ) otherlv_24= KEYWORD_2 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4378:7: ( (lv_name_21_0= KEYWORD_58 ) ) otherlv_22= KEYWORD_1 ( (lv_field_23_0= ruleVariable ) ) otherlv_24= KEYWORD_2
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4378:7: ( (lv_name_21_0= KEYWORD_58 ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4379:1: (lv_name_21_0= KEYWORD_58 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4379:1: (lv_name_21_0= KEYWORD_58 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4380:3: lv_name_21_0= KEYWORD_58
                    {
                    lv_name_21_0=(Token)match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleStringFunctionExpression9394); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_21_0, grammarAccess.getStringFunctionExpressionAccess().getNameLOWERKeyword_3_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStringFunctionExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_21_0, "LOWER");
                      	    
                    }

                    }


                    }

                    otherlv_22=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleStringFunctionExpression9418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getStringFunctionExpressionAccess().getLeftParenthesisKeyword_3_1());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4399:1: ( (lv_field_23_0= ruleVariable ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4400:1: (lv_field_23_0= ruleVariable )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4400:1: (lv_field_23_0= ruleVariable )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4401:3: lv_field_23_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStringFunctionExpressionAccess().getFieldVariableParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleStringFunctionExpression9438);
                    lv_field_23_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStringFunctionExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"field",
                              		lv_field_23_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_24=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleStringFunctionExpression9451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getStringFunctionExpressionAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4423:6: ( ( (lv_name_25_0= KEYWORD_62 ) ) otherlv_26= KEYWORD_1 ( (lv_field_27_0= ruleVariable ) ) otherlv_28= KEYWORD_2 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4423:6: ( ( (lv_name_25_0= KEYWORD_62 ) ) otherlv_26= KEYWORD_1 ( (lv_field_27_0= ruleVariable ) ) otherlv_28= KEYWORD_2 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4423:7: ( (lv_name_25_0= KEYWORD_62 ) ) otherlv_26= KEYWORD_1 ( (lv_field_27_0= ruleVariable ) ) otherlv_28= KEYWORD_2
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4423:7: ( (lv_name_25_0= KEYWORD_62 ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4424:1: (lv_name_25_0= KEYWORD_62 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4424:1: (lv_name_25_0= KEYWORD_62 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4425:3: lv_name_25_0= KEYWORD_62
                    {
                    lv_name_25_0=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleStringFunctionExpression9477); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_25_0, grammarAccess.getStringFunctionExpressionAccess().getNameUPPERKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStringFunctionExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_25_0, "UPPER");
                      	    
                    }

                    }


                    }

                    otherlv_26=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleStringFunctionExpression9501); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getStringFunctionExpressionAccess().getLeftParenthesisKeyword_4_1());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4444:1: ( (lv_field_27_0= ruleVariable ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4445:1: (lv_field_27_0= ruleVariable )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4445:1: (lv_field_27_0= ruleVariable )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4446:3: lv_field_27_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStringFunctionExpressionAccess().getFieldVariableParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleStringFunctionExpression9521);
                    lv_field_27_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStringFunctionExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"field",
                              		lv_field_27_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_28=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleStringFunctionExpression9534); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_28, grammarAccess.getStringFunctionExpressionAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4468:6: ( ( (lv_name_29_0= KEYWORD_68 ) ) otherlv_30= KEYWORD_1 ( (lv_field_31_0= ruleVariable ) ) otherlv_32= KEYWORD_2 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4468:6: ( ( (lv_name_29_0= KEYWORD_68 ) ) otherlv_30= KEYWORD_1 ( (lv_field_31_0= ruleVariable ) ) otherlv_32= KEYWORD_2 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4468:7: ( (lv_name_29_0= KEYWORD_68 ) ) otherlv_30= KEYWORD_1 ( (lv_field_31_0= ruleVariable ) ) otherlv_32= KEYWORD_2
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4468:7: ( (lv_name_29_0= KEYWORD_68 ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4469:1: (lv_name_29_0= KEYWORD_68 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4469:1: (lv_name_29_0= KEYWORD_68 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4470:3: lv_name_29_0= KEYWORD_68
                    {
                    lv_name_29_0=(Token)match(input,KEYWORD_68,FOLLOW_KEYWORD_68_in_ruleStringFunctionExpression9560); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_29_0, grammarAccess.getStringFunctionExpressionAccess().getNameLENGTHKeyword_5_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStringFunctionExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_29_0, "LENGTH");
                      	    
                    }

                    }


                    }

                    otherlv_30=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleStringFunctionExpression9584); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_30, grammarAccess.getStringFunctionExpressionAccess().getLeftParenthesisKeyword_5_1());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4489:1: ( (lv_field_31_0= ruleVariable ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4490:1: (lv_field_31_0= ruleVariable )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4490:1: (lv_field_31_0= ruleVariable )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4491:3: lv_field_31_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStringFunctionExpressionAccess().getFieldVariableParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleStringFunctionExpression9604);
                    lv_field_31_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStringFunctionExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"field",
                              		lv_field_31_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_32=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleStringFunctionExpression9617); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getStringFunctionExpressionAccess().getRightParenthesisKeyword_5_3());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4513:6: ( ( (lv_name_33_0= KEYWORD_69 ) ) otherlv_34= KEYWORD_1 ( (lv_fields_35_0= ruleVariable ) ) otherlv_36= KEYWORD_5 ( (lv_fields_37_0= ruleVariable ) ) (otherlv_38= KEYWORD_5 ( (lv_startPos_39_0= ruleVariable ) ) )? otherlv_40= KEYWORD_2 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4513:6: ( ( (lv_name_33_0= KEYWORD_69 ) ) otherlv_34= KEYWORD_1 ( (lv_fields_35_0= ruleVariable ) ) otherlv_36= KEYWORD_5 ( (lv_fields_37_0= ruleVariable ) ) (otherlv_38= KEYWORD_5 ( (lv_startPos_39_0= ruleVariable ) ) )? otherlv_40= KEYWORD_2 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4513:7: ( (lv_name_33_0= KEYWORD_69 ) ) otherlv_34= KEYWORD_1 ( (lv_fields_35_0= ruleVariable ) ) otherlv_36= KEYWORD_5 ( (lv_fields_37_0= ruleVariable ) ) (otherlv_38= KEYWORD_5 ( (lv_startPos_39_0= ruleVariable ) ) )? otherlv_40= KEYWORD_2
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4513:7: ( (lv_name_33_0= KEYWORD_69 ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4514:1: (lv_name_33_0= KEYWORD_69 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4514:1: (lv_name_33_0= KEYWORD_69 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4515:3: lv_name_33_0= KEYWORD_69
                    {
                    lv_name_33_0=(Token)match(input,KEYWORD_69,FOLLOW_KEYWORD_69_in_ruleStringFunctionExpression9643); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_33_0, grammarAccess.getStringFunctionExpressionAccess().getNameLOCATEKeyword_6_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStringFunctionExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_33_0, "LOCATE");
                      	    
                    }

                    }


                    }

                    otherlv_34=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleStringFunctionExpression9667); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_34, grammarAccess.getStringFunctionExpressionAccess().getLeftParenthesisKeyword_6_1());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4534:1: ( (lv_fields_35_0= ruleVariable ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4535:1: (lv_fields_35_0= ruleVariable )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4535:1: (lv_fields_35_0= ruleVariable )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4536:3: lv_fields_35_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStringFunctionExpressionAccess().getFieldsVariableParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleStringFunctionExpression9687);
                    lv_fields_35_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStringFunctionExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"fields",
                              		lv_fields_35_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_36=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStringFunctionExpression9700); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_36, grammarAccess.getStringFunctionExpressionAccess().getCommaKeyword_6_3());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4557:1: ( (lv_fields_37_0= ruleVariable ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4558:1: (lv_fields_37_0= ruleVariable )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4558:1: (lv_fields_37_0= ruleVariable )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4559:3: lv_fields_37_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStringFunctionExpressionAccess().getFieldsVariableParserRuleCall_6_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleStringFunctionExpression9720);
                    lv_fields_37_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStringFunctionExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"fields",
                              		lv_fields_37_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4575:2: (otherlv_38= KEYWORD_5 ( (lv_startPos_39_0= ruleVariable ) ) )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==KEYWORD_5) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4576:2: otherlv_38= KEYWORD_5 ( (lv_startPos_39_0= ruleVariable ) )
                            {
                            otherlv_38=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStringFunctionExpression9734); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_38, grammarAccess.getStringFunctionExpressionAccess().getCommaKeyword_6_5_0());
                                  
                            }
                            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4580:1: ( (lv_startPos_39_0= ruleVariable ) )
                            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4581:1: (lv_startPos_39_0= ruleVariable )
                            {
                            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4581:1: (lv_startPos_39_0= ruleVariable )
                            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4582:3: lv_startPos_39_0= ruleVariable
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStringFunctionExpressionAccess().getStartPosVariableParserRuleCall_6_5_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVariable_in_ruleStringFunctionExpression9754);
                            lv_startPos_39_0=ruleVariable();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStringFunctionExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"startPos",
                                      		lv_startPos_39_0, 
                                      		"Variable");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_40=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleStringFunctionExpression9769); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_40, grammarAccess.getStringFunctionExpressionAccess().getRightParenthesisKeyword_6_6());
                          
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
    // $ANTLR end "ruleStringFunctionExpression"


    // $ANTLR start "entryRuleArithmeticFunctionExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4611:1: entryRuleArithmeticFunctionExpression returns [EObject current=null] : iv_ruleArithmeticFunctionExpression= ruleArithmeticFunctionExpression EOF ;
    public final EObject entryRuleArithmeticFunctionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticFunctionExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4612:2: (iv_ruleArithmeticFunctionExpression= ruleArithmeticFunctionExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4613:2: iv_ruleArithmeticFunctionExpression= ruleArithmeticFunctionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticFunctionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleArithmeticFunctionExpression_in_entryRuleArithmeticFunctionExpression9804);
            iv_ruleArithmeticFunctionExpression=ruleArithmeticFunctionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticFunctionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmeticFunctionExpression9814); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmeticFunctionExpression"


    // $ANTLR start "ruleArithmeticFunctionExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4620:1: ruleArithmeticFunctionExpression returns [EObject current=null] : ( ( ( (lv_name_0_0= KEYWORD_23 ) ) otherlv_1= KEYWORD_1 ( (lv_field_2_0= ruleVariable ) ) otherlv_3= KEYWORD_2 ) | ( ( (lv_name_4_0= KEYWORD_47 ) ) otherlv_5= KEYWORD_1 ( (lv_field_6_0= ruleVariable ) ) otherlv_7= KEYWORD_2 ) | ( ( (lv_name_8_0= KEYWORD_32 ) ) otherlv_9= KEYWORD_1 ( (lv_fields_10_0= ruleVariable ) ) otherlv_11= KEYWORD_5 ( (lv_fields_12_0= ruleVariable ) )+ otherlv_13= KEYWORD_2 ) ) ;
    public final EObject ruleArithmeticFunctionExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_field_2_0 = null;

        EObject lv_field_6_0 = null;

        EObject lv_fields_10_0 = null;

        EObject lv_fields_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4623:28: ( ( ( ( (lv_name_0_0= KEYWORD_23 ) ) otherlv_1= KEYWORD_1 ( (lv_field_2_0= ruleVariable ) ) otherlv_3= KEYWORD_2 ) | ( ( (lv_name_4_0= KEYWORD_47 ) ) otherlv_5= KEYWORD_1 ( (lv_field_6_0= ruleVariable ) ) otherlv_7= KEYWORD_2 ) | ( ( (lv_name_8_0= KEYWORD_32 ) ) otherlv_9= KEYWORD_1 ( (lv_fields_10_0= ruleVariable ) ) otherlv_11= KEYWORD_5 ( (lv_fields_12_0= ruleVariable ) )+ otherlv_13= KEYWORD_2 ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4624:1: ( ( ( (lv_name_0_0= KEYWORD_23 ) ) otherlv_1= KEYWORD_1 ( (lv_field_2_0= ruleVariable ) ) otherlv_3= KEYWORD_2 ) | ( ( (lv_name_4_0= KEYWORD_47 ) ) otherlv_5= KEYWORD_1 ( (lv_field_6_0= ruleVariable ) ) otherlv_7= KEYWORD_2 ) | ( ( (lv_name_8_0= KEYWORD_32 ) ) otherlv_9= KEYWORD_1 ( (lv_fields_10_0= ruleVariable ) ) otherlv_11= KEYWORD_5 ( (lv_fields_12_0= ruleVariable ) )+ otherlv_13= KEYWORD_2 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4624:1: ( ( ( (lv_name_0_0= KEYWORD_23 ) ) otherlv_1= KEYWORD_1 ( (lv_field_2_0= ruleVariable ) ) otherlv_3= KEYWORD_2 ) | ( ( (lv_name_4_0= KEYWORD_47 ) ) otherlv_5= KEYWORD_1 ( (lv_field_6_0= ruleVariable ) ) otherlv_7= KEYWORD_2 ) | ( ( (lv_name_8_0= KEYWORD_32 ) ) otherlv_9= KEYWORD_1 ( (lv_fields_10_0= ruleVariable ) ) otherlv_11= KEYWORD_5 ( (lv_fields_12_0= ruleVariable ) )+ otherlv_13= KEYWORD_2 ) )
            int alt66=3;
            switch ( input.LA(1) ) {
            case KEYWORD_23:
                {
                alt66=1;
                }
                break;
            case KEYWORD_47:
                {
                alt66=2;
                }
                break;
            case KEYWORD_32:
                {
                alt66=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4624:2: ( ( (lv_name_0_0= KEYWORD_23 ) ) otherlv_1= KEYWORD_1 ( (lv_field_2_0= ruleVariable ) ) otherlv_3= KEYWORD_2 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4624:2: ( ( (lv_name_0_0= KEYWORD_23 ) ) otherlv_1= KEYWORD_1 ( (lv_field_2_0= ruleVariable ) ) otherlv_3= KEYWORD_2 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4624:3: ( (lv_name_0_0= KEYWORD_23 ) ) otherlv_1= KEYWORD_1 ( (lv_field_2_0= ruleVariable ) ) otherlv_3= KEYWORD_2
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4624:3: ( (lv_name_0_0= KEYWORD_23 ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4625:1: (lv_name_0_0= KEYWORD_23 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4625:1: (lv_name_0_0= KEYWORD_23 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4626:3: lv_name_0_0= KEYWORD_23
                    {
                    lv_name_0_0=(Token)match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleArithmeticFunctionExpression9859); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_0, grammarAccess.getArithmeticFunctionExpressionAccess().getNameABSKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArithmeticFunctionExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_0, "ABS");
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleArithmeticFunctionExpression9883); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getArithmeticFunctionExpressionAccess().getLeftParenthesisKeyword_0_1());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4645:1: ( (lv_field_2_0= ruleVariable ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4646:1: (lv_field_2_0= ruleVariable )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4646:1: (lv_field_2_0= ruleVariable )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4647:3: lv_field_2_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArithmeticFunctionExpressionAccess().getFieldVariableParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleArithmeticFunctionExpression9903);
                    lv_field_2_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArithmeticFunctionExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"field",
                              		lv_field_2_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleArithmeticFunctionExpression9916); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getArithmeticFunctionExpressionAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4669:6: ( ( (lv_name_4_0= KEYWORD_47 ) ) otherlv_5= KEYWORD_1 ( (lv_field_6_0= ruleVariable ) ) otherlv_7= KEYWORD_2 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4669:6: ( ( (lv_name_4_0= KEYWORD_47 ) ) otherlv_5= KEYWORD_1 ( (lv_field_6_0= ruleVariable ) ) otherlv_7= KEYWORD_2 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4669:7: ( (lv_name_4_0= KEYWORD_47 ) ) otherlv_5= KEYWORD_1 ( (lv_field_6_0= ruleVariable ) ) otherlv_7= KEYWORD_2
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4669:7: ( (lv_name_4_0= KEYWORD_47 ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4670:1: (lv_name_4_0= KEYWORD_47 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4670:1: (lv_name_4_0= KEYWORD_47 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4671:3: lv_name_4_0= KEYWORD_47
                    {
                    lv_name_4_0=(Token)match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleArithmeticFunctionExpression9942); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_4_0, grammarAccess.getArithmeticFunctionExpressionAccess().getNameSQRTKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArithmeticFunctionExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_4_0, "SQRT");
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleArithmeticFunctionExpression9966); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getArithmeticFunctionExpressionAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4690:1: ( (lv_field_6_0= ruleVariable ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4691:1: (lv_field_6_0= ruleVariable )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4691:1: (lv_field_6_0= ruleVariable )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4692:3: lv_field_6_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArithmeticFunctionExpressionAccess().getFieldVariableParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleArithmeticFunctionExpression9986);
                    lv_field_6_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArithmeticFunctionExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"field",
                              		lv_field_6_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleArithmeticFunctionExpression9999); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getArithmeticFunctionExpressionAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4714:6: ( ( (lv_name_8_0= KEYWORD_32 ) ) otherlv_9= KEYWORD_1 ( (lv_fields_10_0= ruleVariable ) ) otherlv_11= KEYWORD_5 ( (lv_fields_12_0= ruleVariable ) )+ otherlv_13= KEYWORD_2 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4714:6: ( ( (lv_name_8_0= KEYWORD_32 ) ) otherlv_9= KEYWORD_1 ( (lv_fields_10_0= ruleVariable ) ) otherlv_11= KEYWORD_5 ( (lv_fields_12_0= ruleVariable ) )+ otherlv_13= KEYWORD_2 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4714:7: ( (lv_name_8_0= KEYWORD_32 ) ) otherlv_9= KEYWORD_1 ( (lv_fields_10_0= ruleVariable ) ) otherlv_11= KEYWORD_5 ( (lv_fields_12_0= ruleVariable ) )+ otherlv_13= KEYWORD_2
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4714:7: ( (lv_name_8_0= KEYWORD_32 ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4715:1: (lv_name_8_0= KEYWORD_32 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4715:1: (lv_name_8_0= KEYWORD_32 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4716:3: lv_name_8_0= KEYWORD_32
                    {
                    lv_name_8_0=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleArithmeticFunctionExpression10025); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_8_0, grammarAccess.getArithmeticFunctionExpressionAccess().getNameMODKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArithmeticFunctionExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_8_0, "MOD");
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleArithmeticFunctionExpression10049); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getArithmeticFunctionExpressionAccess().getLeftParenthesisKeyword_2_1());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4735:1: ( (lv_fields_10_0= ruleVariable ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4736:1: (lv_fields_10_0= ruleVariable )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4736:1: (lv_fields_10_0= ruleVariable )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4737:3: lv_fields_10_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArithmeticFunctionExpressionAccess().getFieldsVariableParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleArithmeticFunctionExpression10069);
                    lv_fields_10_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArithmeticFunctionExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"fields",
                              		lv_fields_10_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleArithmeticFunctionExpression10082); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getArithmeticFunctionExpressionAccess().getCommaKeyword_2_3());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4758:1: ( (lv_fields_12_0= ruleVariable ) )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==KEYWORD_53||LA65_0==KEYWORD_44||LA65_0==KEYWORD_49||LA65_0==KEYWORD_9||(LA65_0>=KEYWORD_13 && LA65_0<=RULE_STRING)) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4759:1: (lv_fields_12_0= ruleVariable )
                    	    {
                    	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4759:1: (lv_fields_12_0= ruleVariable )
                    	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4760:3: lv_fields_12_0= ruleVariable
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getArithmeticFunctionExpressionAccess().getFieldsVariableParserRuleCall_2_4_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleVariable_in_ruleArithmeticFunctionExpression10102);
                    	    lv_fields_12_0=ruleVariable();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getArithmeticFunctionExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"fields",
                    	              		lv_fields_12_0, 
                    	              		"Variable");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt65 >= 1 ) break loop65;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(65, input);
                                throw eee;
                        }
                        cnt65++;
                    } while (true);

                    otherlv_13=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleArithmeticFunctionExpression10116); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getArithmeticFunctionExpressionAccess().getRightParenthesisKeyword_2_5());
                          
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
    // $ANTLR end "ruleArithmeticFunctionExpression"


    // $ANTLR start "entryRuleCollectionFunctionExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4789:1: entryRuleCollectionFunctionExpression returns [EObject current=null] : iv_ruleCollectionFunctionExpression= ruleCollectionFunctionExpression EOF ;
    public final EObject entryRuleCollectionFunctionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionFunctionExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4790:2: (iv_ruleCollectionFunctionExpression= ruleCollectionFunctionExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4791:2: iv_ruleCollectionFunctionExpression= ruleCollectionFunctionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionFunctionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCollectionFunctionExpression_in_entryRuleCollectionFunctionExpression10151);
            iv_ruleCollectionFunctionExpression=ruleCollectionFunctionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionFunctionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionFunctionExpression10161); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionFunctionExpression"


    // $ANTLR start "ruleCollectionFunctionExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4798:1: ruleCollectionFunctionExpression returns [EObject current=null] : ( ( ( (lv_name_0_0= KEYWORD_56 ) ) otherlv_1= KEYWORD_1 ( (lv_field_2_0= ruleVariable ) ) otherlv_3= KEYWORD_2 ) | ( ( (lv_name_4_0= KEYWORD_45 ) ) otherlv_5= KEYWORD_1 ( (lv_field_6_0= ruleVariable ) ) otherlv_7= KEYWORD_2 ) ) ;
    public final EObject ruleCollectionFunctionExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_field_2_0 = null;

        EObject lv_field_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4801:28: ( ( ( ( (lv_name_0_0= KEYWORD_56 ) ) otherlv_1= KEYWORD_1 ( (lv_field_2_0= ruleVariable ) ) otherlv_3= KEYWORD_2 ) | ( ( (lv_name_4_0= KEYWORD_45 ) ) otherlv_5= KEYWORD_1 ( (lv_field_6_0= ruleVariable ) ) otherlv_7= KEYWORD_2 ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4802:1: ( ( ( (lv_name_0_0= KEYWORD_56 ) ) otherlv_1= KEYWORD_1 ( (lv_field_2_0= ruleVariable ) ) otherlv_3= KEYWORD_2 ) | ( ( (lv_name_4_0= KEYWORD_45 ) ) otherlv_5= KEYWORD_1 ( (lv_field_6_0= ruleVariable ) ) otherlv_7= KEYWORD_2 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4802:1: ( ( ( (lv_name_0_0= KEYWORD_56 ) ) otherlv_1= KEYWORD_1 ( (lv_field_2_0= ruleVariable ) ) otherlv_3= KEYWORD_2 ) | ( ( (lv_name_4_0= KEYWORD_45 ) ) otherlv_5= KEYWORD_1 ( (lv_field_6_0= ruleVariable ) ) otherlv_7= KEYWORD_2 ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==KEYWORD_56) ) {
                alt67=1;
            }
            else if ( (LA67_0==KEYWORD_45) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4802:2: ( ( (lv_name_0_0= KEYWORD_56 ) ) otherlv_1= KEYWORD_1 ( (lv_field_2_0= ruleVariable ) ) otherlv_3= KEYWORD_2 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4802:2: ( ( (lv_name_0_0= KEYWORD_56 ) ) otherlv_1= KEYWORD_1 ( (lv_field_2_0= ruleVariable ) ) otherlv_3= KEYWORD_2 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4802:3: ( (lv_name_0_0= KEYWORD_56 ) ) otherlv_1= KEYWORD_1 ( (lv_field_2_0= ruleVariable ) ) otherlv_3= KEYWORD_2
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4802:3: ( (lv_name_0_0= KEYWORD_56 ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4803:1: (lv_name_0_0= KEYWORD_56 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4803:1: (lv_name_0_0= KEYWORD_56 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4804:3: lv_name_0_0= KEYWORD_56
                    {
                    lv_name_0_0=(Token)match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleCollectionFunctionExpression10206); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_0, grammarAccess.getCollectionFunctionExpressionAccess().getNameINDEXKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCollectionFunctionExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_0, "INDEX");
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleCollectionFunctionExpression10230); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCollectionFunctionExpressionAccess().getLeftParenthesisKeyword_0_1());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4823:1: ( (lv_field_2_0= ruleVariable ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4824:1: (lv_field_2_0= ruleVariable )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4824:1: (lv_field_2_0= ruleVariable )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4825:3: lv_field_2_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionFunctionExpressionAccess().getFieldVariableParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleCollectionFunctionExpression10250);
                    lv_field_2_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectionFunctionExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"field",
                              		lv_field_2_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleCollectionFunctionExpression10263); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCollectionFunctionExpressionAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4847:6: ( ( (lv_name_4_0= KEYWORD_45 ) ) otherlv_5= KEYWORD_1 ( (lv_field_6_0= ruleVariable ) ) otherlv_7= KEYWORD_2 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4847:6: ( ( (lv_name_4_0= KEYWORD_45 ) ) otherlv_5= KEYWORD_1 ( (lv_field_6_0= ruleVariable ) ) otherlv_7= KEYWORD_2 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4847:7: ( (lv_name_4_0= KEYWORD_45 ) ) otherlv_5= KEYWORD_1 ( (lv_field_6_0= ruleVariable ) ) otherlv_7= KEYWORD_2
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4847:7: ( (lv_name_4_0= KEYWORD_45 ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4848:1: (lv_name_4_0= KEYWORD_45 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4848:1: (lv_name_4_0= KEYWORD_45 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4849:3: lv_name_4_0= KEYWORD_45
                    {
                    lv_name_4_0=(Token)match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleCollectionFunctionExpression10289); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_4_0, grammarAccess.getCollectionFunctionExpressionAccess().getNameSIZEKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCollectionFunctionExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_4_0, "SIZE");
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleCollectionFunctionExpression10313); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getCollectionFunctionExpressionAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4868:1: ( (lv_field_6_0= ruleVariable ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4869:1: (lv_field_6_0= ruleVariable )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4869:1: (lv_field_6_0= ruleVariable )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4870:3: lv_field_6_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionFunctionExpressionAccess().getFieldVariableParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleCollectionFunctionExpression10333);
                    lv_field_6_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectionFunctionExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"field",
                              		lv_field_6_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleCollectionFunctionExpression10346); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getCollectionFunctionExpressionAccess().getRightParenthesisKeyword_1_3());
                          
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
    // $ANTLR end "ruleCollectionFunctionExpression"


    // $ANTLR start "entryRuleTemporalFunctionExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4899:1: entryRuleTemporalFunctionExpression returns [EObject current=null] : iv_ruleTemporalFunctionExpression= ruleTemporalFunctionExpression EOF ;
    public final EObject entryRuleTemporalFunctionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalFunctionExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4900:2: (iv_ruleTemporalFunctionExpression= ruleTemporalFunctionExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4901:2: iv_ruleTemporalFunctionExpression= ruleTemporalFunctionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemporalFunctionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTemporalFunctionExpression_in_entryRuleTemporalFunctionExpression10381);
            iv_ruleTemporalFunctionExpression=ruleTemporalFunctionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemporalFunctionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalFunctionExpression10391); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemporalFunctionExpression"


    // $ANTLR start "ruleTemporalFunctionExpression"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4908:1: ruleTemporalFunctionExpression returns [EObject current=null] : ( ( ( (lv_name_0_0= KEYWORD_80 ) ) (otherlv_1= KEYWORD_1 otherlv_2= KEYWORD_2 )? ) | ( ( (lv_name_3_0= KEYWORD_81 ) ) (otherlv_4= KEYWORD_1 otherlv_5= KEYWORD_2 )? ) | ( ( (lv_name_6_0= KEYWORD_82 ) ) (otherlv_7= KEYWORD_1 otherlv_8= KEYWORD_2 )? ) | ( ( (lv_name_9_0= KEYWORD_50 ) ) otherlv_10= KEYWORD_1 ( (lv_field_11_0= ruleVariable ) ) otherlv_12= KEYWORD_2 ) | ( ( (lv_name_13_0= KEYWORD_59 ) ) otherlv_14= KEYWORD_1 ( (lv_field_15_0= ruleVariable ) ) otherlv_16= KEYWORD_2 ) | ( ( (lv_name_17_0= KEYWORD_29 ) ) otherlv_18= KEYWORD_1 ( (lv_field_19_0= ruleVariable ) ) otherlv_20= KEYWORD_2 ) | ( ( (lv_name_21_0= KEYWORD_40 ) ) otherlv_22= KEYWORD_1 ( (lv_field_23_0= ruleVariable ) ) otherlv_24= KEYWORD_2 ) | ( ( (lv_name_25_0= KEYWORD_71 ) ) otherlv_26= KEYWORD_1 ( (lv_field_27_0= ruleVariable ) ) otherlv_28= KEYWORD_2 ) | ( ( (lv_name_29_0= KEYWORD_72 ) ) otherlv_30= KEYWORD_1 ( (lv_field_31_0= ruleVariable ) ) otherlv_32= KEYWORD_2 ) ) ;
    public final EObject ruleTemporalFunctionExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token lv_name_13_0=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token lv_name_17_0=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token lv_name_21_0=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token lv_name_25_0=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token lv_name_29_0=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        EObject lv_field_11_0 = null;

        EObject lv_field_15_0 = null;

        EObject lv_field_19_0 = null;

        EObject lv_field_23_0 = null;

        EObject lv_field_27_0 = null;

        EObject lv_field_31_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4911:28: ( ( ( ( (lv_name_0_0= KEYWORD_80 ) ) (otherlv_1= KEYWORD_1 otherlv_2= KEYWORD_2 )? ) | ( ( (lv_name_3_0= KEYWORD_81 ) ) (otherlv_4= KEYWORD_1 otherlv_5= KEYWORD_2 )? ) | ( ( (lv_name_6_0= KEYWORD_82 ) ) (otherlv_7= KEYWORD_1 otherlv_8= KEYWORD_2 )? ) | ( ( (lv_name_9_0= KEYWORD_50 ) ) otherlv_10= KEYWORD_1 ( (lv_field_11_0= ruleVariable ) ) otherlv_12= KEYWORD_2 ) | ( ( (lv_name_13_0= KEYWORD_59 ) ) otherlv_14= KEYWORD_1 ( (lv_field_15_0= ruleVariable ) ) otherlv_16= KEYWORD_2 ) | ( ( (lv_name_17_0= KEYWORD_29 ) ) otherlv_18= KEYWORD_1 ( (lv_field_19_0= ruleVariable ) ) otherlv_20= KEYWORD_2 ) | ( ( (lv_name_21_0= KEYWORD_40 ) ) otherlv_22= KEYWORD_1 ( (lv_field_23_0= ruleVariable ) ) otherlv_24= KEYWORD_2 ) | ( ( (lv_name_25_0= KEYWORD_71 ) ) otherlv_26= KEYWORD_1 ( (lv_field_27_0= ruleVariable ) ) otherlv_28= KEYWORD_2 ) | ( ( (lv_name_29_0= KEYWORD_72 ) ) otherlv_30= KEYWORD_1 ( (lv_field_31_0= ruleVariable ) ) otherlv_32= KEYWORD_2 ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4912:1: ( ( ( (lv_name_0_0= KEYWORD_80 ) ) (otherlv_1= KEYWORD_1 otherlv_2= KEYWORD_2 )? ) | ( ( (lv_name_3_0= KEYWORD_81 ) ) (otherlv_4= KEYWORD_1 otherlv_5= KEYWORD_2 )? ) | ( ( (lv_name_6_0= KEYWORD_82 ) ) (otherlv_7= KEYWORD_1 otherlv_8= KEYWORD_2 )? ) | ( ( (lv_name_9_0= KEYWORD_50 ) ) otherlv_10= KEYWORD_1 ( (lv_field_11_0= ruleVariable ) ) otherlv_12= KEYWORD_2 ) | ( ( (lv_name_13_0= KEYWORD_59 ) ) otherlv_14= KEYWORD_1 ( (lv_field_15_0= ruleVariable ) ) otherlv_16= KEYWORD_2 ) | ( ( (lv_name_17_0= KEYWORD_29 ) ) otherlv_18= KEYWORD_1 ( (lv_field_19_0= ruleVariable ) ) otherlv_20= KEYWORD_2 ) | ( ( (lv_name_21_0= KEYWORD_40 ) ) otherlv_22= KEYWORD_1 ( (lv_field_23_0= ruleVariable ) ) otherlv_24= KEYWORD_2 ) | ( ( (lv_name_25_0= KEYWORD_71 ) ) otherlv_26= KEYWORD_1 ( (lv_field_27_0= ruleVariable ) ) otherlv_28= KEYWORD_2 ) | ( ( (lv_name_29_0= KEYWORD_72 ) ) otherlv_30= KEYWORD_1 ( (lv_field_31_0= ruleVariable ) ) otherlv_32= KEYWORD_2 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4912:1: ( ( ( (lv_name_0_0= KEYWORD_80 ) ) (otherlv_1= KEYWORD_1 otherlv_2= KEYWORD_2 )? ) | ( ( (lv_name_3_0= KEYWORD_81 ) ) (otherlv_4= KEYWORD_1 otherlv_5= KEYWORD_2 )? ) | ( ( (lv_name_6_0= KEYWORD_82 ) ) (otherlv_7= KEYWORD_1 otherlv_8= KEYWORD_2 )? ) | ( ( (lv_name_9_0= KEYWORD_50 ) ) otherlv_10= KEYWORD_1 ( (lv_field_11_0= ruleVariable ) ) otherlv_12= KEYWORD_2 ) | ( ( (lv_name_13_0= KEYWORD_59 ) ) otherlv_14= KEYWORD_1 ( (lv_field_15_0= ruleVariable ) ) otherlv_16= KEYWORD_2 ) | ( ( (lv_name_17_0= KEYWORD_29 ) ) otherlv_18= KEYWORD_1 ( (lv_field_19_0= ruleVariable ) ) otherlv_20= KEYWORD_2 ) | ( ( (lv_name_21_0= KEYWORD_40 ) ) otherlv_22= KEYWORD_1 ( (lv_field_23_0= ruleVariable ) ) otherlv_24= KEYWORD_2 ) | ( ( (lv_name_25_0= KEYWORD_71 ) ) otherlv_26= KEYWORD_1 ( (lv_field_27_0= ruleVariable ) ) otherlv_28= KEYWORD_2 ) | ( ( (lv_name_29_0= KEYWORD_72 ) ) otherlv_30= KEYWORD_1 ( (lv_field_31_0= ruleVariable ) ) otherlv_32= KEYWORD_2 ) )
            int alt71=9;
            switch ( input.LA(1) ) {
            case KEYWORD_80:
                {
                alt71=1;
                }
                break;
            case KEYWORD_81:
                {
                alt71=2;
                }
                break;
            case KEYWORD_82:
                {
                alt71=3;
                }
                break;
            case KEYWORD_50:
                {
                alt71=4;
                }
                break;
            case KEYWORD_59:
                {
                alt71=5;
                }
                break;
            case KEYWORD_29:
                {
                alt71=6;
                }
                break;
            case KEYWORD_40:
                {
                alt71=7;
                }
                break;
            case KEYWORD_71:
                {
                alt71=8;
                }
                break;
            case KEYWORD_72:
                {
                alt71=9;
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4912:2: ( ( (lv_name_0_0= KEYWORD_80 ) ) (otherlv_1= KEYWORD_1 otherlv_2= KEYWORD_2 )? )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4912:2: ( ( (lv_name_0_0= KEYWORD_80 ) ) (otherlv_1= KEYWORD_1 otherlv_2= KEYWORD_2 )? )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4912:3: ( (lv_name_0_0= KEYWORD_80 ) ) (otherlv_1= KEYWORD_1 otherlv_2= KEYWORD_2 )?
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4912:3: ( (lv_name_0_0= KEYWORD_80 ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4913:1: (lv_name_0_0= KEYWORD_80 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4913:1: (lv_name_0_0= KEYWORD_80 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4914:3: lv_name_0_0= KEYWORD_80
                    {
                    lv_name_0_0=(Token)match(input,KEYWORD_80,FOLLOW_KEYWORD_80_in_ruleTemporalFunctionExpression10436); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_0, grammarAccess.getTemporalFunctionExpressionAccess().getNameCURRENT_DATEKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTemporalFunctionExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_0, "CURRENT_DATE");
                      	    
                    }

                    }


                    }

                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4928:2: (otherlv_1= KEYWORD_1 otherlv_2= KEYWORD_2 )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==KEYWORD_1) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4929:2: otherlv_1= KEYWORD_1 otherlv_2= KEYWORD_2
                            {
                            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleTemporalFunctionExpression10461); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getTemporalFunctionExpressionAccess().getLeftParenthesisKeyword_0_1_0());
                                  
                            }
                            otherlv_2=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleTemporalFunctionExpression10473); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getTemporalFunctionExpressionAccess().getRightParenthesisKeyword_0_1_1());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4939:6: ( ( (lv_name_3_0= KEYWORD_81 ) ) (otherlv_4= KEYWORD_1 otherlv_5= KEYWORD_2 )? )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4939:6: ( ( (lv_name_3_0= KEYWORD_81 ) ) (otherlv_4= KEYWORD_1 otherlv_5= KEYWORD_2 )? )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4939:7: ( (lv_name_3_0= KEYWORD_81 ) ) (otherlv_4= KEYWORD_1 otherlv_5= KEYWORD_2 )?
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4939:7: ( (lv_name_3_0= KEYWORD_81 ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4940:1: (lv_name_3_0= KEYWORD_81 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4940:1: (lv_name_3_0= KEYWORD_81 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4941:3: lv_name_3_0= KEYWORD_81
                    {
                    lv_name_3_0=(Token)match(input,KEYWORD_81,FOLLOW_KEYWORD_81_in_ruleTemporalFunctionExpression10501); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_3_0, grammarAccess.getTemporalFunctionExpressionAccess().getNameCURRENT_TIMEKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTemporalFunctionExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_3_0, "CURRENT_TIME");
                      	    
                    }

                    }


                    }

                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4955:2: (otherlv_4= KEYWORD_1 otherlv_5= KEYWORD_2 )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==KEYWORD_1) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4956:2: otherlv_4= KEYWORD_1 otherlv_5= KEYWORD_2
                            {
                            otherlv_4=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleTemporalFunctionExpression10526); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getTemporalFunctionExpressionAccess().getLeftParenthesisKeyword_1_1_0());
                                  
                            }
                            otherlv_5=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleTemporalFunctionExpression10538); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getTemporalFunctionExpressionAccess().getRightParenthesisKeyword_1_1_1());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4966:6: ( ( (lv_name_6_0= KEYWORD_82 ) ) (otherlv_7= KEYWORD_1 otherlv_8= KEYWORD_2 )? )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4966:6: ( ( (lv_name_6_0= KEYWORD_82 ) ) (otherlv_7= KEYWORD_1 otherlv_8= KEYWORD_2 )? )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4966:7: ( (lv_name_6_0= KEYWORD_82 ) ) (otherlv_7= KEYWORD_1 otherlv_8= KEYWORD_2 )?
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4966:7: ( (lv_name_6_0= KEYWORD_82 ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4967:1: (lv_name_6_0= KEYWORD_82 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4967:1: (lv_name_6_0= KEYWORD_82 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4968:3: lv_name_6_0= KEYWORD_82
                    {
                    lv_name_6_0=(Token)match(input,KEYWORD_82,FOLLOW_KEYWORD_82_in_ruleTemporalFunctionExpression10566); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_6_0, grammarAccess.getTemporalFunctionExpressionAccess().getNameCURRENT_TIMESTAMPKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTemporalFunctionExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_6_0, "CURRENT_TIMESTAMP");
                      	    
                    }

                    }


                    }

                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4982:2: (otherlv_7= KEYWORD_1 otherlv_8= KEYWORD_2 )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==KEYWORD_1) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4983:2: otherlv_7= KEYWORD_1 otherlv_8= KEYWORD_2
                            {
                            otherlv_7=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleTemporalFunctionExpression10591); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getTemporalFunctionExpressionAccess().getLeftParenthesisKeyword_2_1_0());
                                  
                            }
                            otherlv_8=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleTemporalFunctionExpression10603); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getTemporalFunctionExpressionAccess().getRightParenthesisKeyword_2_1_1());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4993:6: ( ( (lv_name_9_0= KEYWORD_50 ) ) otherlv_10= KEYWORD_1 ( (lv_field_11_0= ruleVariable ) ) otherlv_12= KEYWORD_2 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4993:6: ( ( (lv_name_9_0= KEYWORD_50 ) ) otherlv_10= KEYWORD_1 ( (lv_field_11_0= ruleVariable ) ) otherlv_12= KEYWORD_2 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4993:7: ( (lv_name_9_0= KEYWORD_50 ) ) otherlv_10= KEYWORD_1 ( (lv_field_11_0= ruleVariable ) ) otherlv_12= KEYWORD_2
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4993:7: ( (lv_name_9_0= KEYWORD_50 ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4994:1: (lv_name_9_0= KEYWORD_50 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4994:1: (lv_name_9_0= KEYWORD_50 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4995:3: lv_name_9_0= KEYWORD_50
                    {
                    lv_name_9_0=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleTemporalFunctionExpression10631); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_9_0, grammarAccess.getTemporalFunctionExpressionAccess().getNameYEARKeyword_3_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTemporalFunctionExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_9_0, "YEAR");
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleTemporalFunctionExpression10655); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getTemporalFunctionExpressionAccess().getLeftParenthesisKeyword_3_1());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5014:1: ( (lv_field_11_0= ruleVariable ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5015:1: (lv_field_11_0= ruleVariable )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5015:1: (lv_field_11_0= ruleVariable )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5016:3: lv_field_11_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemporalFunctionExpressionAccess().getFieldVariableParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleTemporalFunctionExpression10675);
                    lv_field_11_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTemporalFunctionExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"field",
                              		lv_field_11_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleTemporalFunctionExpression10688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getTemporalFunctionExpressionAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5038:6: ( ( (lv_name_13_0= KEYWORD_59 ) ) otherlv_14= KEYWORD_1 ( (lv_field_15_0= ruleVariable ) ) otherlv_16= KEYWORD_2 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5038:6: ( ( (lv_name_13_0= KEYWORD_59 ) ) otherlv_14= KEYWORD_1 ( (lv_field_15_0= ruleVariable ) ) otherlv_16= KEYWORD_2 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5038:7: ( (lv_name_13_0= KEYWORD_59 ) ) otherlv_14= KEYWORD_1 ( (lv_field_15_0= ruleVariable ) ) otherlv_16= KEYWORD_2
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5038:7: ( (lv_name_13_0= KEYWORD_59 ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5039:1: (lv_name_13_0= KEYWORD_59 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5039:1: (lv_name_13_0= KEYWORD_59 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5040:3: lv_name_13_0= KEYWORD_59
                    {
                    lv_name_13_0=(Token)match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_ruleTemporalFunctionExpression10714); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_13_0, grammarAccess.getTemporalFunctionExpressionAccess().getNameMONTHKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTemporalFunctionExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_13_0, "MONTH");
                      	    
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleTemporalFunctionExpression10738); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getTemporalFunctionExpressionAccess().getLeftParenthesisKeyword_4_1());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5059:1: ( (lv_field_15_0= ruleVariable ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5060:1: (lv_field_15_0= ruleVariable )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5060:1: (lv_field_15_0= ruleVariable )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5061:3: lv_field_15_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemporalFunctionExpressionAccess().getFieldVariableParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleTemporalFunctionExpression10758);
                    lv_field_15_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTemporalFunctionExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"field",
                              		lv_field_15_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_16=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleTemporalFunctionExpression10771); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getTemporalFunctionExpressionAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5083:6: ( ( (lv_name_17_0= KEYWORD_29 ) ) otherlv_18= KEYWORD_1 ( (lv_field_19_0= ruleVariable ) ) otherlv_20= KEYWORD_2 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5083:6: ( ( (lv_name_17_0= KEYWORD_29 ) ) otherlv_18= KEYWORD_1 ( (lv_field_19_0= ruleVariable ) ) otherlv_20= KEYWORD_2 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5083:7: ( (lv_name_17_0= KEYWORD_29 ) ) otherlv_18= KEYWORD_1 ( (lv_field_19_0= ruleVariable ) ) otherlv_20= KEYWORD_2
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5083:7: ( (lv_name_17_0= KEYWORD_29 ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5084:1: (lv_name_17_0= KEYWORD_29 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5084:1: (lv_name_17_0= KEYWORD_29 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5085:3: lv_name_17_0= KEYWORD_29
                    {
                    lv_name_17_0=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleTemporalFunctionExpression10797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_17_0, grammarAccess.getTemporalFunctionExpressionAccess().getNameDAYKeyword_5_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTemporalFunctionExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_17_0, "DAY");
                      	    
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleTemporalFunctionExpression10821); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getTemporalFunctionExpressionAccess().getLeftParenthesisKeyword_5_1());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5104:1: ( (lv_field_19_0= ruleVariable ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5105:1: (lv_field_19_0= ruleVariable )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5105:1: (lv_field_19_0= ruleVariable )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5106:3: lv_field_19_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemporalFunctionExpressionAccess().getFieldVariableParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleTemporalFunctionExpression10841);
                    lv_field_19_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTemporalFunctionExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"field",
                              		lv_field_19_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_20=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleTemporalFunctionExpression10854); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getTemporalFunctionExpressionAccess().getRightParenthesisKeyword_5_3());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5128:6: ( ( (lv_name_21_0= KEYWORD_40 ) ) otherlv_22= KEYWORD_1 ( (lv_field_23_0= ruleVariable ) ) otherlv_24= KEYWORD_2 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5128:6: ( ( (lv_name_21_0= KEYWORD_40 ) ) otherlv_22= KEYWORD_1 ( (lv_field_23_0= ruleVariable ) ) otherlv_24= KEYWORD_2 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5128:7: ( (lv_name_21_0= KEYWORD_40 ) ) otherlv_22= KEYWORD_1 ( (lv_field_23_0= ruleVariable ) ) otherlv_24= KEYWORD_2
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5128:7: ( (lv_name_21_0= KEYWORD_40 ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5129:1: (lv_name_21_0= KEYWORD_40 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5129:1: (lv_name_21_0= KEYWORD_40 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5130:3: lv_name_21_0= KEYWORD_40
                    {
                    lv_name_21_0=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleTemporalFunctionExpression10880); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_21_0, grammarAccess.getTemporalFunctionExpressionAccess().getNameHOURKeyword_6_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTemporalFunctionExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_21_0, "HOUR");
                      	    
                    }

                    }


                    }

                    otherlv_22=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleTemporalFunctionExpression10904); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getTemporalFunctionExpressionAccess().getLeftParenthesisKeyword_6_1());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5149:1: ( (lv_field_23_0= ruleVariable ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5150:1: (lv_field_23_0= ruleVariable )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5150:1: (lv_field_23_0= ruleVariable )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5151:3: lv_field_23_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemporalFunctionExpressionAccess().getFieldVariableParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleTemporalFunctionExpression10924);
                    lv_field_23_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTemporalFunctionExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"field",
                              		lv_field_23_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_24=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleTemporalFunctionExpression10937); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getTemporalFunctionExpressionAccess().getRightParenthesisKeyword_6_3());
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5173:6: ( ( (lv_name_25_0= KEYWORD_71 ) ) otherlv_26= KEYWORD_1 ( (lv_field_27_0= ruleVariable ) ) otherlv_28= KEYWORD_2 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5173:6: ( ( (lv_name_25_0= KEYWORD_71 ) ) otherlv_26= KEYWORD_1 ( (lv_field_27_0= ruleVariable ) ) otherlv_28= KEYWORD_2 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5173:7: ( (lv_name_25_0= KEYWORD_71 ) ) otherlv_26= KEYWORD_1 ( (lv_field_27_0= ruleVariable ) ) otherlv_28= KEYWORD_2
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5173:7: ( (lv_name_25_0= KEYWORD_71 ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5174:1: (lv_name_25_0= KEYWORD_71 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5174:1: (lv_name_25_0= KEYWORD_71 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5175:3: lv_name_25_0= KEYWORD_71
                    {
                    lv_name_25_0=(Token)match(input,KEYWORD_71,FOLLOW_KEYWORD_71_in_ruleTemporalFunctionExpression10963); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_25_0, grammarAccess.getTemporalFunctionExpressionAccess().getNameMINUTEKeyword_7_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTemporalFunctionExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_25_0, "MINUTE");
                      	    
                    }

                    }


                    }

                    otherlv_26=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleTemporalFunctionExpression10987); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getTemporalFunctionExpressionAccess().getLeftParenthesisKeyword_7_1());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5194:1: ( (lv_field_27_0= ruleVariable ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5195:1: (lv_field_27_0= ruleVariable )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5195:1: (lv_field_27_0= ruleVariable )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5196:3: lv_field_27_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemporalFunctionExpressionAccess().getFieldVariableParserRuleCall_7_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleTemporalFunctionExpression11007);
                    lv_field_27_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTemporalFunctionExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"field",
                              		lv_field_27_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_28=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleTemporalFunctionExpression11020); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_28, grammarAccess.getTemporalFunctionExpressionAccess().getRightParenthesisKeyword_7_3());
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5218:6: ( ( (lv_name_29_0= KEYWORD_72 ) ) otherlv_30= KEYWORD_1 ( (lv_field_31_0= ruleVariable ) ) otherlv_32= KEYWORD_2 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5218:6: ( ( (lv_name_29_0= KEYWORD_72 ) ) otherlv_30= KEYWORD_1 ( (lv_field_31_0= ruleVariable ) ) otherlv_32= KEYWORD_2 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5218:7: ( (lv_name_29_0= KEYWORD_72 ) ) otherlv_30= KEYWORD_1 ( (lv_field_31_0= ruleVariable ) ) otherlv_32= KEYWORD_2
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5218:7: ( (lv_name_29_0= KEYWORD_72 ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5219:1: (lv_name_29_0= KEYWORD_72 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5219:1: (lv_name_29_0= KEYWORD_72 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5220:3: lv_name_29_0= KEYWORD_72
                    {
                    lv_name_29_0=(Token)match(input,KEYWORD_72,FOLLOW_KEYWORD_72_in_ruleTemporalFunctionExpression11046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_29_0, grammarAccess.getTemporalFunctionExpressionAccess().getNameSECONDKeyword_8_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTemporalFunctionExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_29_0, "SECOND");
                      	    
                    }

                    }


                    }

                    otherlv_30=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleTemporalFunctionExpression11070); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_30, grammarAccess.getTemporalFunctionExpressionAccess().getLeftParenthesisKeyword_8_1());
                          
                    }
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5239:1: ( (lv_field_31_0= ruleVariable ) )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5240:1: (lv_field_31_0= ruleVariable )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5240:1: (lv_field_31_0= ruleVariable )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5241:3: lv_field_31_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemporalFunctionExpressionAccess().getFieldVariableParserRuleCall_8_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleTemporalFunctionExpression11090);
                    lv_field_31_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTemporalFunctionExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"field",
                              		lv_field_31_0, 
                              		"Variable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_32=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleTemporalFunctionExpression11103); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getTemporalFunctionExpressionAccess().getRightParenthesisKeyword_8_3());
                          
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
    // $ANTLR end "ruleTemporalFunctionExpression"


    // $ANTLR start "entryRuleParameterName"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5270:1: entryRuleParameterName returns [String current=null] : iv_ruleParameterName= ruleParameterName EOF ;
    public final String entryRuleParameterName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterName = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5271:1: (iv_ruleParameterName= ruleParameterName EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5272:2: iv_ruleParameterName= ruleParameterName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterNameRule()); 
            }
            pushFollow(FOLLOW_ruleParameterName_in_entryRuleParameterName11139);
            iv_ruleParameterName=ruleParameterName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterName11150); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5279:1: ruleParameterName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleParameterName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5283:6: (this_ID_0= RULE_ID )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5284:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterName11189); if (state.failed) return current;
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


    // $ANTLR start "entryRuleLiteral"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5299:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5300:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5301:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral11232);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral11242); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5308:1: ruleLiteral returns [EObject current=null] : (this_IntegerLiteral_0= ruleIntegerLiteral | this_FloatLiteral_1= ruleFloatLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral | this_BooleanLiteral_4= ruleBooleanLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerLiteral_0 = null;

        EObject this_FloatLiteral_1 = null;

        EObject this_StringLiteral_2 = null;

        EObject this_NullLiteral_3 = null;

        EObject this_BooleanLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5311:28: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_FloatLiteral_1= ruleFloatLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral | this_BooleanLiteral_4= ruleBooleanLiteral ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5312:1: (this_IntegerLiteral_0= ruleIntegerLiteral | this_FloatLiteral_1= ruleFloatLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral | this_BooleanLiteral_4= ruleBooleanLiteral )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5312:1: (this_IntegerLiteral_0= ruleIntegerLiteral | this_FloatLiteral_1= ruleFloatLiteral | this_StringLiteral_2= ruleStringLiteral | this_NullLiteral_3= ruleNullLiteral | this_BooleanLiteral_4= ruleBooleanLiteral )
            int alt72=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA72_1 = input.LA(2);

                if ( (LA72_1==KEYWORD_7) ) {
                    alt72=2;
                }
                else if ( (LA72_1==EOF||LA72_1==KEYWORD_75||LA72_1==KEYWORD_70||LA72_1==KEYWORD_53||LA72_1==KEYWORD_55||LA72_1==KEYWORD_60||LA72_1==KEYWORD_63||LA72_1==KEYWORD_39||(LA72_1>=KEYWORD_43 && LA72_1<=KEYWORD_44)||LA72_1==KEYWORD_49||LA72_1==KEYWORD_25||LA72_1==KEYWORD_34||(LA72_1>=KEYWORD_14 && LA72_1<=KEYWORD_16)||(LA72_1>=KEYWORD_19 && LA72_1<=KEYWORD_20)||LA72_1==KEYWORD_22||(LA72_1>=KEYWORD_2 && LA72_1<=KEYWORD_6)||(LA72_1>=KEYWORD_8 && LA72_1<=RULE_STRING)) ) {
                    alt72=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt72=3;
                }
                break;
            case KEYWORD_44:
                {
                alt72=4;
                }
                break;
            case KEYWORD_53:
            case KEYWORD_49:
                {
                alt72=5;
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5313:2: this_IntegerLiteral_0= ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleLiteral11292);
                    this_IntegerLiteral_0=ruleIntegerLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_IntegerLiteral_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5326:2: this_FloatLiteral_1= ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatLiteral_in_ruleLiteral11322);
                    this_FloatLiteral_1=ruleFloatLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_FloatLiteral_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5339:2: this_StringLiteral_2= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral11352);
                    this_StringLiteral_2=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_StringLiteral_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5352:2: this_NullLiteral_3= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteral11382);
                    this_NullLiteral_3=ruleNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_NullLiteral_3;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5365:2: this_BooleanLiteral_4= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral11412);
                    this_BooleanLiteral_4=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BooleanLiteral_4;
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


    // $ANTLR start "entryRuleIntegerLiteral"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5384:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5385:2: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5386:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral11446);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral11456); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5393:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5396:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5397:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5397:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5398:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5398:1: (lv_value_0_0= RULE_INT )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5399:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerLiteral11497); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntegerLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"INT");
              	    
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
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleFloatLiteral"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5423:1: entryRuleFloatLiteral returns [EObject current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final EObject entryRuleFloatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatLiteral = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5424:2: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5425:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral11536);
            iv_ruleFloatLiteral=ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatLiteral11546); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatLiteral"


    // $ANTLR start "ruleFloatLiteral"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5432:1: ruleFloatLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleFloat ) ) ;
    public final EObject ruleFloatLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5435:28: ( ( (lv_value_0_0= ruleFloat ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5436:1: ( (lv_value_0_0= ruleFloat ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5436:1: ( (lv_value_0_0= ruleFloat ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5437:1: (lv_value_0_0= ruleFloat )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5437:1: (lv_value_0_0= ruleFloat )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5438:3: lv_value_0_0= ruleFloat
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFloatLiteralAccess().getValueFloatParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFloat_in_ruleFloatLiteral11591);
            lv_value_0_0=ruleFloat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFloatLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"Float");
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
    // $ANTLR end "ruleFloatLiteral"


    // $ANTLR start "entryRuleFloat"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5462:1: entryRuleFloat returns [EObject current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final EObject entryRuleFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloat = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5463:2: (iv_ruleFloat= ruleFloat EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5464:2: iv_ruleFloat= ruleFloat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatRule()); 
            }
            pushFollow(FOLLOW_ruleFloat_in_entryRuleFloat11625);
            iv_ruleFloat=ruleFloat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloat; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloat11635); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5471:1: ruleFloat returns [EObject current=null] : ( ( (lv_integerValue_0_0= RULE_INT ) ) otherlv_1= KEYWORD_7 ( (lv_fractionValue_2_0= RULE_INT ) ) ) ;
    public final EObject ruleFloat() throws RecognitionException {
        EObject current = null;

        Token lv_integerValue_0_0=null;
        Token otherlv_1=null;
        Token lv_fractionValue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5474:28: ( ( ( (lv_integerValue_0_0= RULE_INT ) ) otherlv_1= KEYWORD_7 ( (lv_fractionValue_2_0= RULE_INT ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5475:1: ( ( (lv_integerValue_0_0= RULE_INT ) ) otherlv_1= KEYWORD_7 ( (lv_fractionValue_2_0= RULE_INT ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5475:1: ( ( (lv_integerValue_0_0= RULE_INT ) ) otherlv_1= KEYWORD_7 ( (lv_fractionValue_2_0= RULE_INT ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5475:2: ( (lv_integerValue_0_0= RULE_INT ) ) otherlv_1= KEYWORD_7 ( (lv_fractionValue_2_0= RULE_INT ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5475:2: ( (lv_integerValue_0_0= RULE_INT ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5476:1: (lv_integerValue_0_0= RULE_INT )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5476:1: (lv_integerValue_0_0= RULE_INT )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5477:3: lv_integerValue_0_0= RULE_INT
            {
            lv_integerValue_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloat11677); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_integerValue_0_0, grammarAccess.getFloatAccess().getIntegerValueINTTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFloatRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"integerValue",
                      		lv_integerValue_0_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleFloat11695); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFloatAccess().getFullStopKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5498:1: ( (lv_fractionValue_2_0= RULE_INT ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5499:1: (lv_fractionValue_2_0= RULE_INT )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5499:1: (lv_fractionValue_2_0= RULE_INT )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5500:3: lv_fractionValue_2_0= RULE_INT
            {
            lv_fractionValue_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFloat11711); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_fractionValue_2_0, grammarAccess.getFloatAccess().getFractionValueINTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFloatRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"fractionValue",
                      		lv_fractionValue_2_0, 
                      		"INT");
              	    
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
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5524:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5525:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5526:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral11751);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral11761); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5533:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5536:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5537:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5537:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5538:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5538:1: (lv_value_0_0= RULE_STRING )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5539:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral11802); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"STRING");
              	    
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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleNullLiteral"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5563:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5564:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5565:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral11841);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral11851); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5572:1: ruleNullLiteral returns [EObject current=null] : ( (lv_value_0_0= KEYWORD_44 ) ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5575:28: ( ( (lv_value_0_0= KEYWORD_44 ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5576:1: ( (lv_value_0_0= KEYWORD_44 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5576:1: ( (lv_value_0_0= KEYWORD_44 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5577:1: (lv_value_0_0= KEYWORD_44 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5577:1: (lv_value_0_0= KEYWORD_44 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5578:3: lv_value_0_0= KEYWORD_44
            {
            lv_value_0_0=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleNullLiteral11894); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_value_0_0, grammarAccess.getNullLiteralAccess().getValueNULLKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNullLiteralRule());
              	        }
                     		setWithLastConsumed(current, "value", lv_value_0_0, "NULL");
              	    
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
    // $ANTLR end "ruleNullLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5600:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5601:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5602:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral11939);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral11949); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5609:1: ruleBooleanLiteral returns [EObject current=null] : ( ( (lv_value_0_1= KEYWORD_49 | lv_value_0_2= KEYWORD_53 ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5612:28: ( ( ( (lv_value_0_1= KEYWORD_49 | lv_value_0_2= KEYWORD_53 ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5613:1: ( ( (lv_value_0_1= KEYWORD_49 | lv_value_0_2= KEYWORD_53 ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5613:1: ( ( (lv_value_0_1= KEYWORD_49 | lv_value_0_2= KEYWORD_53 ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5614:1: ( (lv_value_0_1= KEYWORD_49 | lv_value_0_2= KEYWORD_53 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5614:1: ( (lv_value_0_1= KEYWORD_49 | lv_value_0_2= KEYWORD_53 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5615:1: (lv_value_0_1= KEYWORD_49 | lv_value_0_2= KEYWORD_53 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5615:1: (lv_value_0_1= KEYWORD_49 | lv_value_0_2= KEYWORD_53 )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==KEYWORD_49) ) {
                alt73=1;
            }
            else if ( (LA73_0==KEYWORD_53) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5616:3: lv_value_0_1= KEYWORD_49
                    {
                    lv_value_0_1=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleBooleanLiteral11994); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_0_1, grammarAccess.getBooleanLiteralAccess().getValueTRUEKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "value", lv_value_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5629:8: lv_value_0_2= KEYWORD_53
                    {
                    lv_value_0_2=(Token)match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleBooleanLiteral12022); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_0_2, grammarAccess.getBooleanLiteralAccess().getValueFALSEKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "value", lv_value_0_2, null);
                      	    
                    }

                    }
                    break;

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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleSubquery"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5653:1: entryRuleSubquery returns [EObject current=null] : iv_ruleSubquery= ruleSubquery EOF ;
    public final EObject entryRuleSubquery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubquery = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5654:2: (iv_ruleSubquery= ruleSubquery EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5655:2: iv_ruleSubquery= ruleSubquery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubqueryRule()); 
            }
            pushFollow(FOLLOW_ruleSubquery_in_entryRuleSubquery12070);
            iv_ruleSubquery=ruleSubquery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubquery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubquery12080); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5662:1: ruleSubquery returns [EObject current=null] : (otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2 ) ;
    public final EObject ruleSubquery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_SelectStatement_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5665:28: ( (otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5666:1: (otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5666:1: (otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5667:2: otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleSubquery12118); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSubqueryAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubqueryAccess().getSelectStatementParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleSubquery12142);
            this_SelectStatement_1=ruleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_SelectStatement_1;
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleSubquery12154); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSubqueryAccess().getRightParenthesisKeyword_2());
                  
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


    // $ANTLR start "ruleOrderByDirection"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5696:1: ruleOrderByDirection returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_27 ) | (enumLiteral_1= KEYWORD_38 ) ) ;
    public final Enumerator ruleOrderByDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5698:28: ( ( (enumLiteral_0= KEYWORD_27 ) | (enumLiteral_1= KEYWORD_38 ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5699:1: ( (enumLiteral_0= KEYWORD_27 ) | (enumLiteral_1= KEYWORD_38 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5699:1: ( (enumLiteral_0= KEYWORD_27 ) | (enumLiteral_1= KEYWORD_38 ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==KEYWORD_27) ) {
                alt74=1;
            }
            else if ( (LA74_0==KEYWORD_38) ) {
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5699:2: (enumLiteral_0= KEYWORD_27 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5699:2: (enumLiteral_0= KEYWORD_27 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5699:7: enumLiteral_0= KEYWORD_27
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleOrderByDirection12206); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOrderByDirectionAccess().getAscEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOrderByDirectionAccess().getAscEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5705:6: (enumLiteral_1= KEYWORD_38 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5705:6: (enumLiteral_1= KEYWORD_38 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5705:11: enumLiteral_1= KEYWORD_38
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleOrderByDirection12228); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOrderByDirectionAccess().getDescEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOrderByDirectionAccess().getDescEnumLiteralDeclaration_1()); 
                          
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


    // $ANTLR start "ruleTrimSpec"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5715:1: ruleTrimSpec returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_76 ) | (enumLiteral_1= KEYWORD_78 ) | (enumLiteral_2= KEYWORD_37 ) ) ;
    public final Enumerator ruleTrimSpec() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5717:28: ( ( (enumLiteral_0= KEYWORD_76 ) | (enumLiteral_1= KEYWORD_78 ) | (enumLiteral_2= KEYWORD_37 ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5718:1: ( (enumLiteral_0= KEYWORD_76 ) | (enumLiteral_1= KEYWORD_78 ) | (enumLiteral_2= KEYWORD_37 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5718:1: ( (enumLiteral_0= KEYWORD_76 ) | (enumLiteral_1= KEYWORD_78 ) | (enumLiteral_2= KEYWORD_37 ) )
            int alt75=3;
            switch ( input.LA(1) ) {
            case KEYWORD_76:
                {
                alt75=1;
                }
                break;
            case KEYWORD_78:
                {
                alt75=2;
                }
                break;
            case KEYWORD_37:
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5718:2: (enumLiteral_0= KEYWORD_76 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5718:2: (enumLiteral_0= KEYWORD_76 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5718:7: enumLiteral_0= KEYWORD_76
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_76,FOLLOW_KEYWORD_76_in_ruleTrimSpec12278); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTrimSpecAccess().getLeadingEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTrimSpecAccess().getLeadingEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5724:6: (enumLiteral_1= KEYWORD_78 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5724:6: (enumLiteral_1= KEYWORD_78 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5724:11: enumLiteral_1= KEYWORD_78
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_78,FOLLOW_KEYWORD_78_in_ruleTrimSpec12300); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTrimSpecAccess().getTrailingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTrimSpecAccess().getTrailingEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5730:6: (enumLiteral_2= KEYWORD_37 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5730:6: (enumLiteral_2= KEYWORD_37 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5730:11: enumLiteral_2= KEYWORD_37
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleTrimSpec12322); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTrimSpecAccess().getBothEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTrimSpecAccess().getBothEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleTrimSpec"


    // $ANTLR start "ruleUnaryOperator"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5740:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_4 ) | (enumLiteral_1= KEYWORD_6 ) | (enumLiteral_2= KEYWORD_34 ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5742:28: ( ( (enumLiteral_0= KEYWORD_4 ) | (enumLiteral_1= KEYWORD_6 ) | (enumLiteral_2= KEYWORD_34 ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5743:1: ( (enumLiteral_0= KEYWORD_4 ) | (enumLiteral_1= KEYWORD_6 ) | (enumLiteral_2= KEYWORD_34 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5743:1: ( (enumLiteral_0= KEYWORD_4 ) | (enumLiteral_1= KEYWORD_6 ) | (enumLiteral_2= KEYWORD_34 ) )
            int alt76=3;
            switch ( input.LA(1) ) {
            case KEYWORD_4:
                {
                alt76=1;
                }
                break;
            case KEYWORD_6:
                {
                alt76=2;
                }
                break;
            case KEYWORD_34:
                {
                alt76=3;
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5743:2: (enumLiteral_0= KEYWORD_4 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5743:2: (enumLiteral_0= KEYWORD_4 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5743:7: enumLiteral_0= KEYWORD_4
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleUnaryOperator12372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5749:6: (enumLiteral_1= KEYWORD_6 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5749:6: (enumLiteral_1= KEYWORD_6 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5749:11: enumLiteral_1= KEYWORD_6
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleUnaryOperator12394); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5755:6: (enumLiteral_2= KEYWORD_34 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5755:6: (enumLiteral_2= KEYWORD_34 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5755:11: enumLiteral_2= KEYWORD_34
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleUnaryOperator12416); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getLogicalNotEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getUnaryOperatorAccess().getLogicalNotEnumLiteralDeclaration_2()); 
                          
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5765:1: ruleAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_4 ) | (enumLiteral_1= KEYWORD_6 ) ) ;
    public final Enumerator ruleAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5767:28: ( ( (enumLiteral_0= KEYWORD_4 ) | (enumLiteral_1= KEYWORD_6 ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5768:1: ( (enumLiteral_0= KEYWORD_4 ) | (enumLiteral_1= KEYWORD_6 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5768:1: ( (enumLiteral_0= KEYWORD_4 ) | (enumLiteral_1= KEYWORD_6 ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==KEYWORD_4) ) {
                alt77=1;
            }
            else if ( (LA77_0==KEYWORD_6) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5768:2: (enumLiteral_0= KEYWORD_4 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5768:2: (enumLiteral_0= KEYWORD_4 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5768:7: enumLiteral_0= KEYWORD_4
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleAdditionOperator12466); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5774:6: (enumLiteral_1= KEYWORD_6 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5774:6: (enumLiteral_1= KEYWORD_6 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5774:11: enumLiteral_1= KEYWORD_6
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleAdditionOperator12488); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5784:1: ruleMultiplicationOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_3 ) | (enumLiteral_1= KEYWORD_8 ) ) ;
    public final Enumerator ruleMultiplicationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5786:28: ( ( (enumLiteral_0= KEYWORD_3 ) | (enumLiteral_1= KEYWORD_8 ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5787:1: ( (enumLiteral_0= KEYWORD_3 ) | (enumLiteral_1= KEYWORD_8 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5787:1: ( (enumLiteral_0= KEYWORD_3 ) | (enumLiteral_1= KEYWORD_8 ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==KEYWORD_3) ) {
                alt78=1;
            }
            else if ( (LA78_0==KEYWORD_8) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5787:2: (enumLiteral_0= KEYWORD_3 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5787:2: (enumLiteral_0= KEYWORD_3 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5787:7: enumLiteral_0= KEYWORD_3
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleMultiplicationOperator12538); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicationOperatorAccess().getMultiplyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicationOperatorAccess().getMultiplyEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5793:6: (enumLiteral_1= KEYWORD_8 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5793:6: (enumLiteral_1= KEYWORD_8 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5793:11: enumLiteral_1= KEYWORD_8
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleMultiplicationOperator12560); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicationOperatorAccess().getDivideEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicationOperatorAccess().getDivideEnumLiteralDeclaration_1()); 
                          
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5803:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_10 ) | (enumLiteral_1= KEYWORD_12 ) | (enumLiteral_2= KEYWORD_14 ) | (enumLiteral_3= KEYWORD_16 ) | (enumLiteral_4= KEYWORD_11 ) | (enumLiteral_5= KEYWORD_15 ) ) ;
    public final Enumerator ruleComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5805:28: ( ( (enumLiteral_0= KEYWORD_10 ) | (enumLiteral_1= KEYWORD_12 ) | (enumLiteral_2= KEYWORD_14 ) | (enumLiteral_3= KEYWORD_16 ) | (enumLiteral_4= KEYWORD_11 ) | (enumLiteral_5= KEYWORD_15 ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5806:1: ( (enumLiteral_0= KEYWORD_10 ) | (enumLiteral_1= KEYWORD_12 ) | (enumLiteral_2= KEYWORD_14 ) | (enumLiteral_3= KEYWORD_16 ) | (enumLiteral_4= KEYWORD_11 ) | (enumLiteral_5= KEYWORD_15 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5806:1: ( (enumLiteral_0= KEYWORD_10 ) | (enumLiteral_1= KEYWORD_12 ) | (enumLiteral_2= KEYWORD_14 ) | (enumLiteral_3= KEYWORD_16 ) | (enumLiteral_4= KEYWORD_11 ) | (enumLiteral_5= KEYWORD_15 ) )
            int alt79=6;
            switch ( input.LA(1) ) {
            case KEYWORD_10:
                {
                alt79=1;
                }
                break;
            case KEYWORD_12:
                {
                alt79=2;
                }
                break;
            case KEYWORD_14:
                {
                alt79=3;
                }
                break;
            case KEYWORD_16:
                {
                alt79=4;
                }
                break;
            case KEYWORD_11:
                {
                alt79=5;
                }
                break;
            case KEYWORD_15:
                {
                alt79=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5806:2: (enumLiteral_0= KEYWORD_10 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5806:2: (enumLiteral_0= KEYWORD_10 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5806:7: enumLiteral_0= KEYWORD_10
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleComparisonOperator12610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getLessThenEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getLessThenEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5812:6: (enumLiteral_1= KEYWORD_12 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5812:6: (enumLiteral_1= KEYWORD_12 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5812:11: enumLiteral_1= KEYWORD_12
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleComparisonOperator12632); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getGreaterThenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getGreaterThenEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5818:6: (enumLiteral_2= KEYWORD_14 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5818:6: (enumLiteral_2= KEYWORD_14 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5818:11: enumLiteral_2= KEYWORD_14
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleComparisonOperator12654); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getLessEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getLessEqualEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5824:6: (enumLiteral_3= KEYWORD_16 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5824:6: (enumLiteral_3= KEYWORD_16 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5824:11: enumLiteral_3= KEYWORD_16
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleComparisonOperator12676); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5830:6: (enumLiteral_4= KEYWORD_11 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5830:6: (enumLiteral_4= KEYWORD_11 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5830:11: enumLiteral_4= KEYWORD_11
                    {
                    enumLiteral_4=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleComparisonOperator12698); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5836:6: (enumLiteral_5= KEYWORD_15 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5836:6: (enumLiteral_5= KEYWORD_15 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:5836:11: enumLiteral_5= KEYWORD_15
                    {
                    enumLiteral_5=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleComparisonOperator12720); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getNotEqualEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getComparisonOperatorAccess().getNotEqualEnumLiteralDeclaration_5()); 
                          
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


    protected DFA26 dfa26 = new DFA26(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA61 dfa61 = new DFA61(this);
    static final String DFA26_eotS =
        "\6\uffff";
    static final String DFA26_eofS =
        "\1\uffff\1\3\3\uffff\1\3";
    static final String DFA26_minS =
        "\1\126\1\33\1\126\2\uffff\1\33";
    static final String DFA26_maxS =
        "\3\126\2\uffff\1\126";
    static final String DFA26_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA26_specialS =
        "\6\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1",
            "\1\3\4\uffff\1\3\2\uffff\1\3\32\uffff\1\3\4\uffff\1\4\6\uffff"+
            "\1\3\2\uffff\1\3\1\uffff\1\2\6\uffff\1\4",
            "\1\5",
            "",
            "",
            "\1\3\4\uffff\1\3\2\uffff\1\3\32\uffff\1\3\4\uffff\1\4\6\uffff"+
            "\1\3\2\uffff\1\3\1\uffff\1\2\6\uffff\1\4"
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1709:1: (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar )";
        }
    }
    static final String DFA42_eotS =
        "\41\uffff";
    static final String DFA42_eofS =
        "\6\uffff\1\25\2\uffff\5\32\11\uffff\2\37\2\uffff\1\25\4\uffff\1"+
        "\32";
    static final String DFA42_minS =
        "\1\4\5\uffff\1\12\1\126\1\127\5\12\1\uffff\1\126\1\12\5\uffff\1"+
        "\30\2\12\1\127\1\uffff\1\12\1\30\3\uffff\1\12";
    static final String DFA42_maxS =
        "\1\130\5\uffff\1\124\1\126\1\127\5\124\1\uffff\1\126\1\105\5\uffff"+
        "\1\75\2\124\1\127\1\uffff\1\124\1\53\3\uffff\1\124";
    static final String DFA42_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\10\uffff\1\14\2\uffff\1\13\1\12\1\11"+
        "\1\6\1\15\4\uffff\1\16\2\uffff\1\10\1\7\1\17\1\uffff";
    static final String DFA42_specialS =
        "\41\uffff}>";
    static final String[] DFA42_transitionS = {
            "\4\16\4\uffff\1\16\1\uffff\1\2\1\uffff\2\16\1\uffff\2\16\4\uffff"+
            "\1\15\2\uffff\1\16\1\uffff\2\16\2\uffff\1\16\4\uffff\1\16\3"+
            "\uffff\1\13\1\16\1\5\2\16\1\14\2\16\1\3\1\uffff\1\4\2\uffff"+
            "\1\16\2\uffff\1\16\15\uffff\1\1\7\uffff\1\7\3\uffff\1\10\1\6"+
            "\1\11\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\21\7\uffff\1\24\10\uffff\1\25\4\uffff\1\25\5\uffff\1\25"+
            "\3\uffff\1\23\11\uffff\1\25\10\uffff\1\20\2\uffff\3\25\2\uffff"+
            "\1\22\1\26\1\uffff\1\25\1\uffff\5\25\1\17\1\25\1\uffff\3\25",
            "\1\27",
            "\1\30",
            "\1\21\7\uffff\1\24\10\uffff\1\32\4\uffff\1\32\5\uffff\1\32"+
            "\3\uffff\1\23\11\uffff\1\32\10\uffff\1\20\2\uffff\3\32\2\uffff"+
            "\1\22\1\26\1\uffff\1\32\1\uffff\5\32\1\31\1\32\1\uffff\3\32",
            "\1\21\7\uffff\1\24\10\uffff\1\32\4\uffff\1\32\5\uffff\1\32"+
            "\3\uffff\1\23\11\uffff\1\32\10\uffff\1\20\2\uffff\3\32\2\uffff"+
            "\1\22\1\26\1\uffff\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\3"+
            "\32",
            "\1\21\7\uffff\1\24\10\uffff\1\32\4\uffff\1\32\5\uffff\1\32"+
            "\3\uffff\1\23\11\uffff\1\32\10\uffff\1\20\2\uffff\3\32\2\uffff"+
            "\1\22\1\26\1\uffff\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\3"+
            "\32",
            "\1\21\7\uffff\1\24\10\uffff\1\32\4\uffff\1\32\5\uffff\1\32"+
            "\3\uffff\1\23\11\uffff\1\32\10\uffff\1\20\2\uffff\3\32\2\uffff"+
            "\1\22\1\26\1\uffff\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\3"+
            "\32",
            "\1\21\7\uffff\1\24\10\uffff\1\32\4\uffff\1\32\5\uffff\1\32"+
            "\3\uffff\1\23\11\uffff\1\32\10\uffff\1\20\2\uffff\3\32\2\uffff"+
            "\1\22\1\26\1\uffff\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\3"+
            "\32",
            "",
            "\1\33",
            "\1\21\7\uffff\1\24\27\uffff\1\23\32\uffff\1\22",
            "",
            "",
            "",
            "",
            "",
            "\1\35\22\uffff\1\36\21\uffff\1\34",
            "\1\21\7\uffff\1\24\10\uffff\1\37\4\uffff\1\37\5\uffff\1\37"+
            "\3\uffff\1\23\11\uffff\1\37\10\uffff\1\20\2\uffff\3\37\2\uffff"+
            "\1\22\1\26\1\uffff\1\37\1\uffff\5\37\1\uffff\1\37\1\uffff\3"+
            "\37",
            "\1\21\7\uffff\1\24\10\uffff\1\37\4\uffff\1\37\5\uffff\1\37"+
            "\3\uffff\1\23\11\uffff\1\37\10\uffff\1\20\2\uffff\3\37\2\uffff"+
            "\1\22\1\26\1\uffff\1\37\1\uffff\5\37\1\uffff\1\37\1\uffff\3"+
            "\37",
            "\1\40",
            "",
            "\1\21\7\uffff\1\24\10\uffff\1\25\4\uffff\1\25\5\uffff\1\25"+
            "\3\uffff\1\23\11\uffff\1\25\10\uffff\1\20\2\uffff\3\25\2\uffff"+
            "\1\22\1\26\1\uffff\1\25\1\uffff\5\25\1\17\1\25\1\uffff\3\25",
            "\1\35\22\uffff\1\36",
            "",
            "",
            "",
            "\1\21\7\uffff\1\24\10\uffff\1\32\4\uffff\1\32\5\uffff\1\32"+
            "\3\uffff\1\23\11\uffff\1\32\10\uffff\1\20\2\uffff\3\32\2\uffff"+
            "\1\22\1\26\1\uffff\1\32\1\uffff\5\32\1\uffff\1\32\1\uffff\3"+
            "\32"
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "2767:1: (this_ParenthesesExpression_0= ruleParenthesesExpression | this_ExistsExpression_1= ruleExistsExpression | this_AllExpression_2= ruleAllExpression | this_AnyExpression_3= ruleAnyExpression | this_SomeExpression_4= ruleSomeExpression | this_CollectionExpression_5= ruleCollectionExpression | this_NullComparisonExpression_6= ruleNullComparisonExpression | this_EmptyComparisonExpression_7= ruleEmptyComparisonExpression | this_LikeExpression_8= ruleLikeExpression | this_InExpression_9= ruleInExpression | this_BetweenExpression_10= ruleBetweenExpression | this_FunctionExpression_11= ruleFunctionExpression | this_AliasAttributeExpression_12= ruleAliasAttributeExpression | this_Literal_13= ruleLiteral | this_ParameterExpression_14= ruleParameterExpression )";
        }
    }
    static final String DFA48_eotS =
        "\24\uffff";
    static final String DFA48_eofS =
        "\24\uffff";
    static final String DFA48_minS =
        "\1\31\1\75\1\126\1\127\5\75\1\126\1\105\1\111\2\75\1\127\1\75\1"+
        "\25\1\75\2\uffff";
    static final String DFA48_maxS =
        "\1\130\1\117\1\126\1\127\1\117\4\105\1\126\1\105\1\111\2\105\1\127"+
        "\1\117\1\130\1\105\2\uffff";
    static final String DFA48_acceptS =
        "\22\uffff\1\2\1\1";
    static final String DFA48_specialS =
        "\24\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\10\21\uffff\1\6\4\uffff\1\7\40\uffff\1\2\3\uffff\1\3\1\1"+
            "\1\4\1\5",
            "\1\12\7\uffff\1\13\11\uffff\1\11",
            "\1\14",
            "\1\15",
            "\1\12\7\uffff\1\13\11\uffff\1\16",
            "\1\12\7\uffff\1\13",
            "\1\12\7\uffff\1\13",
            "\1\12\7\uffff\1\13",
            "\1\12\7\uffff\1\13",
            "\1\17",
            "\1\13",
            "\1\20",
            "\1\12\7\uffff\1\13",
            "\1\12\7\uffff\1\13",
            "\1\21",
            "\1\12\7\uffff\1\13\11\uffff\1\11",
            "\1\22\3\uffff\1\23\14\uffff\1\22\4\uffff\1\23\4\uffff\1\23"+
            "\40\uffff\1\23\3\uffff\4\23",
            "\1\12\7\uffff\1\13",
            "",
            ""
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
            return "3492:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )";
        }
    }
    static final String DFA61_eotS =
        "\21\uffff";
    static final String DFA61_eofS =
        "\21\uffff";
    static final String DFA61_minS =
        "\2\31\1\126\1\127\5\31\1\uffff\1\126\1\uffff\2\31\1\127\2\31";
    static final String DFA61_maxS =
        "\2\130\1\126\1\127\5\130\1\uffff\1\126\1\uffff\2\130\1\127\2\130";
    static final String DFA61_acceptS =
        "\11\uffff\1\2\1\uffff\1\1\5\uffff";
    static final String DFA61_specialS =
        "\21\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\10\14\uffff\1\11\4\uffff\1\6\4\uffff\1\7\40\uffff\1\2\3\uffff"+
            "\1\3\1\1\1\4\1\5",
            "\1\13\14\uffff\1\13\4\uffff\1\13\4\uffff\1\13\31\uffff\1\11"+
            "\4\uffff\1\12\1\uffff\1\13\3\uffff\4\13",
            "\1\14",
            "\1\15",
            "\1\13\14\uffff\1\13\4\uffff\1\13\4\uffff\1\13\31\uffff\1\11"+
            "\4\uffff\1\16\1\uffff\1\13\3\uffff\4\13",
            "\1\13\14\uffff\1\13\4\uffff\1\13\4\uffff\1\13\31\uffff\1\11"+
            "\6\uffff\1\13\3\uffff\4\13",
            "\1\13\14\uffff\1\13\4\uffff\1\13\4\uffff\1\13\31\uffff\1\11"+
            "\6\uffff\1\13\3\uffff\4\13",
            "\1\13\14\uffff\1\13\4\uffff\1\13\4\uffff\1\13\31\uffff\1\11"+
            "\6\uffff\1\13\3\uffff\4\13",
            "\1\13\14\uffff\1\13\4\uffff\1\13\4\uffff\1\13\31\uffff\1\11"+
            "\6\uffff\1\13\3\uffff\4\13",
            "",
            "\1\17",
            "",
            "\1\13\14\uffff\1\13\4\uffff\1\13\4\uffff\1\13\31\uffff\1\11"+
            "\6\uffff\1\13\3\uffff\4\13",
            "\1\13\14\uffff\1\13\4\uffff\1\13\4\uffff\1\13\31\uffff\1\11"+
            "\6\uffff\1\13\3\uffff\4\13",
            "\1\20",
            "\1\13\14\uffff\1\13\4\uffff\1\13\4\uffff\1\13\31\uffff\1\11"+
            "\4\uffff\1\12\1\uffff\1\13\3\uffff\4\13",
            "\1\13\14\uffff\1\13\4\uffff\1\13\4\uffff\1\13\31\uffff\1\11"+
            "\6\uffff\1\13\3\uffff\4\13"
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "4331:3: ( (lv_trimChar_17_0= ruleVariable ) )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleJPQLQuery_in_entryRuleJPQLQuery73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJPQLQuery83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleJPQLQuery133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_ruleJPQLQuery163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_ruleJPQLQuery193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectStatement237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_ruleSelectStatement283 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleFromClause_in_ruleSelectStatement305 = new BitSet(new long[]{0x0000000908000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleSelectStatement326 = new BitSet(new long[]{0x0000000108000002L});
    public static final BitSet FOLLOW_ruleGroupByClause_in_ruleSelectStatement348 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleOrderByClause_in_ruleSelectStatement370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupByClause_in_entryRuleGroupByClause406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupByClause416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleGroupByClause454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleGroupByClause466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleGroupByClause486 = new BitSet(new long[]{0x0000000000008002L,0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleGroupByClause500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleGroupByClause520 = new BitSet(new long[]{0x0000000000008002L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleHavingClause_in_ruleGroupByClause543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_entryRuleHavingClause579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingClause589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_67_in_ruleHavingClause627 = new BitSet(new long[]{0x292FF884D21B50F0L,0x0000000001E25200L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleHavingClause647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderByClause_in_entryRuleOrderByClause682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderByClause692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleOrderByClause730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleOrderByClause742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_ruleOrderByClause762 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleOrderByClause776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_ruleOrderByClause796 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_entryRuleOrderBySpec833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderBySpec843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleOrderBySpec893 = new BitSet(new long[]{0x0040002000000000L});
    public static final BitSet FOLLOW_ruleOrderByDirection_in_ruleOrderBySpec913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateClause_in_ruleUpdateStatement1004 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_ruleSetClause_in_ruleUpdateStatement1025 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleUpdateStatement1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateClause_in_entryRuleUpdateClause1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateClause1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_74_in_ruleUpdateClause1130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400020L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleUpdateClause1150 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleUpdateClause1164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400020L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleUpdateClause1184 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleSetClause_in_entryRuleSetClause1221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetClause1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleSetClause1269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_ruleSetClause1289 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleSetClause1303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_ruleSetClause1323 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_entryRuleUpdateItem1360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateItem1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleUpdateItem1416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleUpdateItem1429 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleUpdateItem1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement1484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteStatement1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteClause_in_ruleDeleteStatement1540 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleDeleteStatement1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteClause_in_entryRuleDeleteClause1597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteClause1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_65_in_ruleDeleteClause1645 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleFromClause_in_ruleDeleteClause1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_entryRuleSelectClause1700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectClause1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_73_in_ruleSelectClause1748 = new BitSet(new long[]{0xBFAFF884D29B51F0L,0x0000000001E25200L});
    public static final BitSet FOLLOW_KEYWORD_77_in_ruleSelectClause1766 = new BitSet(new long[]{0xBFAFF884D29B51F0L,0x0000000001E25200L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectClause1799 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleSelectClause1813 = new BitSet(new long[]{0xBFAFF884D29B51F0L,0x0000000001E25200L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectClause1833 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression1870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectExpression1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleSelectExpression1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAggregateExpression_in_ruleSelectExpression1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstructorExpression_in_ruleSelectExpression1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAggregateExpression_in_entryRuleSelectAggregateExpression2024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectAggregateExpression2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgAggregate_in_ruleSelectAggregateExpression2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountAggregate_in_ruleSelectAggregateExpression2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxAggregate_in_ruleSelectAggregateExpression2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinAggregate_in_ruleSelectAggregateExpression2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumAggregate_in_ruleSelectAggregateExpression2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgAggregate_in_entryRuleAvgAggregate2238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvgAggregate2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleAvgAggregate2286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleAvgAggregate2298 = new BitSet(new long[]{0x0000000000000100L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_77_in_ruleAvgAggregate2316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleAvgAggregate2349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleAvgAggregate2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountAggregate_in_entryRuleCountAggregate2396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCountAggregate2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleCountAggregate2444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleCountAggregate2456 = new BitSet(new long[]{0x0000000000000100L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_77_in_ruleCountAggregate2474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleCountAggregate2507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleCountAggregate2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxAggregate_in_entryRuleMaxAggregate2554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxAggregate2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleMaxAggregate2602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleMaxAggregate2614 = new BitSet(new long[]{0x0000000000000100L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_77_in_ruleMaxAggregate2632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleMaxAggregate2665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleMaxAggregate2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinAggregate_in_entryRuleMinAggregate2712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinAggregate2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleMinAggregate2760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleMinAggregate2772 = new BitSet(new long[]{0x0000000000000100L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_77_in_ruleMinAggregate2790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleMinAggregate2823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleMinAggregate2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumAggregate_in_entryRuleSumAggregate2870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumAggregate2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleSumAggregate2918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleSumAggregate2930 = new BitSet(new long[]{0x0000000000000100L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_77_in_ruleSumAggregate2948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSumAggregate2981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSumAggregate2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstructorExpression_in_entryRuleSelectConstructorExpression3028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectConstructorExpression3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleSelectConstructorExpression3076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectConstructorExpression3092 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleSelectConstructorExpression3110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleSelectConstructorExpression3144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSelectConstructorExpression3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClause_in_entryRuleFromClause3213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClause3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleFromClause3261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleFromClass_in_ruleFromClause3281 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleFromClause3295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400020L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleFromClause3315 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleFromEntry_in_entryRuleFromEntry3352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromEntry3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClass_in_ruleFromEntry3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromCollection_in_ruleFromEntry3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleVariableDeclaration3525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClass_in_entryRuleFromClass3583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClass3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassId_in_ruleFromClass3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassVar_in_ruleFromClass3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier3708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedIdentifier3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier3759 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleQualifiedIdentifier3778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier3793 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleFromClassId_in_entryRuleFromClassId3839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClassId3849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleFromClassId3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassVar_in_entryRuleFromClassVar3928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClassVar3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleFromClassVar3984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400008L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleFromClassVar4005 = new BitSet(new long[]{0x0000030020000002L});
    public static final BitSet FOLLOW_ruleFromJoin_in_ruleFromClassVar4026 = new BitSet(new long[]{0x0000030020000002L});
    public static final BitSet FOLLOW_ruleFromCollection_in_entryRuleFromCollection4062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromCollection4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleFromCollection4110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleFromCollection4122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleFromCollection4142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleFromCollection4155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400008L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleFromCollection4175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromJoin_in_entryRuleFromJoin4210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromJoin4220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_ruleFromJoin4270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftJoin_in_ruleFromJoin4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerJoin_in_ruleFromJoin4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_entryRuleJoin4364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoin4374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleJoin4412 = new BitSet(new long[]{0x0000000004000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleJoin4430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleJoin4463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400008L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleJoin4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftJoin_in_entryRuleLeftJoin4519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftJoin4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleLeftJoin4567 = new BitSet(new long[]{0x0000010200000000L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleLeftJoin4585 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleLeftJoin4610 = new BitSet(new long[]{0x0000000004000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleLeftJoin4628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleLeftJoin4661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400008L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleLeftJoin4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerJoin_in_entryRuleInnerJoin4717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInnerJoin4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleInnerJoin4765 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleInnerJoin4777 = new BitSet(new long[]{0x0000000004000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleInnerJoin4795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleInnerJoin4828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400008L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInnerJoin4849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_entryRuleWhereClause4884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereClause4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleWhereClause4932 = new BitSet(new long[]{0x292FF884D21B50F0L,0x0000000001E25200L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleWhereClause4952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression4987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression5047 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleOrExpression5073 = new BitSet(new long[]{0x292FF884D21B50F0L,0x0000000001E25200L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression5093 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression5132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression5142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_ruleAndExpression5192 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleAndExpression5218 = new BitSet(new long[]{0x292FF884D21B50F0L,0x0000000001E25200L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_ruleAndExpression5238 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_entryRuleComparisonOperatorExpression5277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonOperatorExpression5287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_ruleComparisonOperatorExpression5337 = new BitSet(new long[]{0x0000000000000002L,0x00000000001C0007L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_ruleComparisonOperatorExpression5370 = new BitSet(new long[]{0x292FF884D21B50F0L,0x0000000001E25200L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_ruleComparisonOperatorExpression5391 = new BitSet(new long[]{0x0000000000000002L,0x00000000001C0007L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression5428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionExpression5438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression5488 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditionExpression5521 = new BitSet(new long[]{0x292FF884D21B50F0L,0x0000000001E25200L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression5542 = new BitSet(new long[]{0x0000000000000002L,0x0000000000005000L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression5579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationExpression5589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicationExpression5639 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010800L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicationExpression5672 = new BitSet(new long[]{0x292FF884D21B50F0L,0x0000000001E25200L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicationExpression5693 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010800L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression5730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression5740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleUnaryExpression5786 = new BitSet(new long[]{0x292FF884D21B50F0L,0x0000000001E25200L});
    public static final BitSet FOLLOW_ruleConcreteExpression_in_ruleUnaryExpression5808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteExpression_in_entryRuleConcreteExpression5843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcreteExpression5853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesesExpression_in_ruleConcreteExpression5903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsExpression_in_ruleConcreteExpression5933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllExpression_in_ruleConcreteExpression5963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyExpression_in_ruleConcreteExpression5993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeExpression_in_ruleConcreteExpression6023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_ruleConcreteExpression6053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullComparisonExpression_in_ruleConcreteExpression6083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyComparisonExpression_in_ruleConcreteExpression6113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikeExpression_in_ruleConcreteExpression6143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpression_in_ruleConcreteExpression6173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBetweenExpression_in_ruleConcreteExpression6203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionExpression_in_ruleConcreteExpression6233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleConcreteExpression6263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleConcreteExpression6293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_ruleConcreteExpression6323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesesExpression_in_entryRuleParenthesesExpression6357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesesExpression6367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleParenthesesExpression6405 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20200L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_ruleParenthesesExpression6429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleParenthesesExpression6441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsExpression_in_entryRuleExistsExpression6475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExistsExpression6485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_66_in_ruleExistsExpression6523 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20200L});
    public static final BitSet FOLLOW_ruleSubquery_in_ruleExistsExpression6543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllExpression_in_entryRuleAllExpression6578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllExpression6588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleAllExpression6626 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20200L});
    public static final BitSet FOLLOW_ruleSubquery_in_ruleAllExpression6646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyExpression_in_entryRuleAnyExpression6681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnyExpression6691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleAnyExpression6729 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20200L});
    public static final BitSet FOLLOW_ruleSubquery_in_ruleAnyExpression6749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeExpression_in_entryRuleSomeExpression6784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSomeExpression6794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleSomeExpression6832 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20200L});
    public static final BitSet FOLLOW_ruleSubquery_in_ruleSomeExpression6852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression6887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionExpression6897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCollectionExpression6943 = new BitSet(new long[]{0x2000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleCollectionExpression6962 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_KEYWORD_70_in_ruleCollectionExpression6987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400080L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleCollectionExpression7000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleCollectionExpression7022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullComparisonExpression_in_entryRuleNullComparisonExpression7057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullComparisonExpression7067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNullComparisonExpression7113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleNullComparisonExpression7126 = new BitSet(new long[]{0x2000080000000000L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleNullComparisonExpression7144 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleNullComparisonExpression7169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyComparisonExpression_in_entryRuleEmptyComparisonExpression7203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmptyComparisonExpression7213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleEmptyComparisonExpression7259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleEmptyComparisonExpression7272 = new BitSet(new long[]{0x2000000001000000L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleEmptyComparisonExpression7290 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleEmptyComparisonExpression7315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikeExpression_in_entryRuleLikeExpression7349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLikeExpression7359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleLikeExpression7405 = new BitSet(new long[]{0x2000040000000000L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleLikeExpression7424 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleLikeExpression7449 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLikeExpression7469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpression_in_entryRuleInExpression7504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInExpression7514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInSeqExpression_in_ruleInExpression7564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInQueryExpression_in_ruleInExpression7594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInSeqExpression_in_entryRuleInSeqExpression7628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInSeqExpression7638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7684 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleInSeqExpression7703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleInSeqExpression7728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleInSeqExpression7740 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleInSeqExpression7774 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleInSeqExpression7809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInQueryExpression_in_entryRuleInQueryExpression7843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInQueryExpression7853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInQueryExpression7899 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleInQueryExpression7918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleInQueryExpression7943 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20200L});
    public static final BitSet FOLLOW_ruleSubquery_in_ruleInQueryExpression7963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBetweenExpression_in_entryRuleBetweenExpression7998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBetweenExpression8008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleBetweenExpression8054 = new BitSet(new long[]{0x2000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleBetweenExpression8073 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_75_in_ruleBetweenExpression8098 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleBetweenExpression8118 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleBetweenExpression8131 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleBetweenExpression8151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable8186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable8196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleVariable8246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_ruleVariable8276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleVariable8306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_entryRuleExpressionTerm8340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionTerm8350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleExpressionTerm8400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubquery_in_ruleExpressionTerm8430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_entryRuleAliasAttributeExpression8464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAliasAttributeExpression8474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8523 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleAliasAttributeExpression8537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8553 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_entryRuleParameterExpression8595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterExpression8605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleParameterExpression8644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleParameterName_in_ruleParameterExpression8664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleParameterExpression8685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleParameterExpression8701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionExpression_in_entryRuleFunctionExpression8742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionExpression8752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticFunctionExpression_in_ruleFunctionExpression8802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunctionExpression_in_ruleFunctionExpression8832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunctionExpression_in_ruleFunctionExpression8862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalFunctionExpression_in_ruleFunctionExpression8892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunctionExpression_in_entryRuleStringFunctionExpression8926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunctionExpression8936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_64_in_ruleStringFunctionExpression8981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleStringFunctionExpression9005 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunctionExpression9025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStringFunctionExpression9039 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunctionExpression9059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleStringFunctionExpression9074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_79_in_ruleStringFunctionExpression9100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleStringFunctionExpression9124 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunctionExpression9144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStringFunctionExpression9157 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunctionExpression9177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStringFunctionExpression9191 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunctionExpression9211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleStringFunctionExpression9226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleStringFunctionExpression9252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleStringFunctionExpression9276 = new BitSet(new long[]{0x0001085002000A00L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleTrimSpec_in_ruleStringFunctionExpression9296 = new BitSet(new long[]{0x0001084002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunctionExpression9318 = new BitSet(new long[]{0x0001084002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleStringFunctionExpression9333 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunctionExpression9355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleStringFunctionExpression9368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleStringFunctionExpression9394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleStringFunctionExpression9418 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunctionExpression9438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleStringFunctionExpression9451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleStringFunctionExpression9477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleStringFunctionExpression9501 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunctionExpression9521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleStringFunctionExpression9534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_68_in_ruleStringFunctionExpression9560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleStringFunctionExpression9584 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunctionExpression9604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleStringFunctionExpression9617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_69_in_ruleStringFunctionExpression9643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleStringFunctionExpression9667 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunctionExpression9687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStringFunctionExpression9700 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunctionExpression9720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002400L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStringFunctionExpression9734 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunctionExpression9754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleStringFunctionExpression9769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticFunctionExpression_in_entryRuleArithmeticFunctionExpression9804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticFunctionExpression9814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleArithmeticFunctionExpression9859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleArithmeticFunctionExpression9883 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleArithmeticFunctionExpression9903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleArithmeticFunctionExpression9916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleArithmeticFunctionExpression9942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleArithmeticFunctionExpression9966 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleArithmeticFunctionExpression9986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleArithmeticFunctionExpression9999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleArithmeticFunctionExpression10025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleArithmeticFunctionExpression10049 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleArithmeticFunctionExpression10069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleArithmeticFunctionExpression10082 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleArithmeticFunctionExpression10102 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleArithmeticFunctionExpression10116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionFunctionExpression_in_entryRuleCollectionFunctionExpression10151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionFunctionExpression10161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleCollectionFunctionExpression10206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleCollectionFunctionExpression10230 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCollectionFunctionExpression10250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleCollectionFunctionExpression10263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleCollectionFunctionExpression10289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleCollectionFunctionExpression10313 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCollectionFunctionExpression10333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleCollectionFunctionExpression10346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalFunctionExpression_in_entryRuleTemporalFunctionExpression10381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalFunctionExpression10391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_80_in_ruleTemporalFunctionExpression10436 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleTemporalFunctionExpression10461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleTemporalFunctionExpression10473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_81_in_ruleTemporalFunctionExpression10501 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleTemporalFunctionExpression10526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleTemporalFunctionExpression10538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_82_in_ruleTemporalFunctionExpression10566 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleTemporalFunctionExpression10591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleTemporalFunctionExpression10603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleTemporalFunctionExpression10631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleTemporalFunctionExpression10655 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleTemporalFunctionExpression10675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleTemporalFunctionExpression10688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_ruleTemporalFunctionExpression10714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleTemporalFunctionExpression10738 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleTemporalFunctionExpression10758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleTemporalFunctionExpression10771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleTemporalFunctionExpression10797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleTemporalFunctionExpression10821 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleTemporalFunctionExpression10841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleTemporalFunctionExpression10854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleTemporalFunctionExpression10880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleTemporalFunctionExpression10904 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleTemporalFunctionExpression10924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleTemporalFunctionExpression10937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_71_in_ruleTemporalFunctionExpression10963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleTemporalFunctionExpression10987 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleTemporalFunctionExpression11007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleTemporalFunctionExpression11020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_72_in_ruleTemporalFunctionExpression11046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleTemporalFunctionExpression11070 = new BitSet(new long[]{0x0001080002000000L,0x0000000001E20000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleTemporalFunctionExpression11090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleTemporalFunctionExpression11103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterName_in_entryRuleParameterName11139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterName11150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterName11189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral11232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral11242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleLiteral11292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_ruleLiteral11322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral11352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteral11382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral11412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral11446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral11456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerLiteral11497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral11536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral11546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_in_ruleFloatLiteral11591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloat_in_entryRuleFloat11625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloat11635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloat11677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleFloat11695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFloat11711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral11751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral11761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral11802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral11841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral11851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleNullLiteral11894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral11939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral11949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleBooleanLiteral11994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleBooleanLiteral12022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubquery_in_entryRuleSubquery12070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubquery12080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleSubquery12118 = new BitSet(new long[]{0x0000004000200000L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleSubquery12142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSubquery12154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleOrderByDirection12206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleOrderByDirection12228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_76_in_ruleTrimSpec12278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_78_in_ruleTrimSpec12300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleTrimSpec12322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleUnaryOperator12372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleUnaryOperator12394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleUnaryOperator12416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleAdditionOperator12466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleAdditionOperator12488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleMultiplicationOperator12538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleMultiplicationOperator12560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleComparisonOperator12610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleComparisonOperator12632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleComparisonOperator12654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleComparisonOperator12676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleComparisonOperator12698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleComparisonOperator12720 = new BitSet(new long[]{0x0000000000000002L});

}