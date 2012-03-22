package org.nightlabs.jjqb.xtext.jpql.parser.antlr.internal; 

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
import org.nightlabs.jjqb.xtext.jpql.services.JPQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalJPQLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_66", "KEYWORD_64", "KEYWORD_65", "KEYWORD_63", "KEYWORD_62", "KEYWORD_61", "KEYWORD_52", "KEYWORD_53", "KEYWORD_54", "KEYWORD_55", "KEYWORD_56", "KEYWORD_57", "KEYWORD_58", "KEYWORD_59", "KEYWORD_60", "KEYWORD_41", "KEYWORD_42", "KEYWORD_43", "KEYWORD_44", "KEYWORD_45", "KEYWORD_46", "KEYWORD_47", "KEYWORD_48", "KEYWORD_49", "KEYWORD_50", "KEYWORD_51", "KEYWORD_31", "KEYWORD_32", "KEYWORD_33", "KEYWORD_34", "KEYWORD_35", "KEYWORD_36", "KEYWORD_37", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=70;
    public static final int RULE_ANY_OTHER=76;
    public static final int KEYWORD_56=14;
    public static final int KEYWORD_19=41;
    public static final int KEYWORD_55=13;
    public static final int KEYWORD_54=12;
    public static final int KEYWORD_17=61;
    public static final int KEYWORD_18=40;
    public static final int KEYWORD_53=11;
    public static final int KEYWORD_52=10;
    public static final int KEYWORD_15=59;
    public static final int KEYWORD_51=29;
    public static final int KEYWORD_16=60;
    public static final int KEYWORD_50=28;
    public static final int KEYWORD_13=57;
    public static final int KEYWORD_14=58;
    public static final int KEYWORD_11=55;
    public static final int EOF=-1;
    public static final int KEYWORD_12=56;
    public static final int KEYWORD_10=54;
    public static final int KEYWORD_59=17;
    public static final int KEYWORD_58=16;
    public static final int KEYWORD_57=15;
    public static final int KEYWORD_6=67;
    public static final int KEYWORD_7=68;
    public static final int KEYWORD_8=69;
    public static final int KEYWORD_9=53;
    public static final int KEYWORD_28=50;
    public static final int KEYWORD_65=6;
    public static final int KEYWORD_29=51;
    public static final int KEYWORD_64=5;
    public static final int RULE_INT=71;
    public static final int KEYWORD_66=4;
    public static final int KEYWORD_24=46;
    public static final int KEYWORD_61=9;
    public static final int KEYWORD_25=47;
    public static final int KEYWORD_60=18;
    public static final int KEYWORD_26=48;
    public static final int KEYWORD_63=7;
    public static final int KEYWORD_27=49;
    public static final int KEYWORD_62=8;
    public static final int KEYWORD_20=42;
    public static final int KEYWORD_21=43;
    public static final int KEYWORD_22=44;
    public static final int KEYWORD_23=45;
    public static final int KEYWORD_30=52;
    public static final int KEYWORD_1=62;
    public static final int KEYWORD_34=33;
    public static final int KEYWORD_5=66;
    public static final int KEYWORD_33=32;
    public static final int KEYWORD_4=65;
    public static final int KEYWORD_32=31;
    public static final int KEYWORD_3=64;
    public static final int KEYWORD_31=30;
    public static final int KEYWORD_2=63;
    public static final int KEYWORD_38=37;
    public static final int KEYWORD_37=36;
    public static final int RULE_SL_COMMENT=74;
    public static final int KEYWORD_36=35;
    public static final int KEYWORD_35=34;
    public static final int RULE_ML_COMMENT=73;
    public static final int KEYWORD_39=38;
    public static final int RULE_STRING=72;
    public static final int KEYWORD_41=19;
    public static final int KEYWORD_40=39;
    public static final int KEYWORD_43=21;
    public static final int KEYWORD_42=20;
    public static final int KEYWORD_45=23;
    public static final int KEYWORD_44=22;
    public static final int KEYWORD_47=25;
    public static final int RULE_WS=75;
    public static final int KEYWORD_46=24;
    public static final int KEYWORD_49=27;
    public static final int KEYWORD_48=26;

    // delegates
    // delegators


        public InternalJPQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJPQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJPQLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g"; }



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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:68:1: entryRuleJPQLQuery returns [EObject current=null] : iv_ruleJPQLQuery= ruleJPQLQuery EOF ;
    public final EObject entryRuleJPQLQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJPQLQuery = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:69:2: (iv_ruleJPQLQuery= ruleJPQLQuery EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:70:2: iv_ruleJPQLQuery= ruleJPQLQuery EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:77:1: ruleJPQLQuery returns [EObject current=null] : (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement ) ;
    public final EObject ruleJPQLQuery() throws RecognitionException {
        EObject current = null;

        EObject this_SelectStatement_0 = null;

        EObject this_UpdateStatement_1 = null;

        EObject this_DeleteStatement_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:80:28: ( (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:81:1: (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:81:1: (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement )
            int alt1=3;
            switch ( input.LA(1) ) {
            case KEYWORD_59:
            case KEYWORD_32:
                {
                alt1=1;
                }
                break;
            case KEYWORD_60:
                {
                alt1=2;
                }
                break;
            case KEYWORD_53:
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:82:2: this_SelectStatement_0= ruleSelectStatement
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:95:2: this_UpdateStatement_1= ruleUpdateStatement
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:108:2: this_DeleteStatement_2= ruleDeleteStatement
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:127:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:128:2: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:129:2: iv_ruleSelectStatement= ruleSelectStatement EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:136:1: ruleSelectStatement returns [EObject current=null] : ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_groupByClause_3_0= ruleGroupByClause ) )? ( (lv_orderByClause_4_0= ruleOrderByClause ) )? ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_selectClause_0_0 = null;

        EObject lv_fromClause_1_0 = null;

        EObject lv_whereClause_2_0 = null;

        EObject lv_groupByClause_3_0 = null;

        EObject lv_orderByClause_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:139:28: ( ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_groupByClause_3_0= ruleGroupByClause ) )? ( (lv_orderByClause_4_0= ruleOrderByClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:140:1: ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_groupByClause_3_0= ruleGroupByClause ) )? ( (lv_orderByClause_4_0= ruleOrderByClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:140:1: ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_groupByClause_3_0= ruleGroupByClause ) )? ( (lv_orderByClause_4_0= ruleOrderByClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:140:2: ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_groupByClause_3_0= ruleGroupByClause ) )? ( (lv_orderByClause_4_0= ruleOrderByClause ) )?
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:140:2: ( (lv_selectClause_0_0= ruleSelectClause ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==KEYWORD_59) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:141:1: (lv_selectClause_0_0= ruleSelectClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:141:1: (lv_selectClause_0_0= ruleSelectClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:142:3: lv_selectClause_0_0= ruleSelectClause
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:158:3: ( (lv_fromClause_1_0= ruleFromClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:159:1: (lv_fromClause_1_0= ruleFromClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:159:1: (lv_fromClause_1_0= ruleFromClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:160:3: lv_fromClause_1_0= ruleFromClause
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:176:2: ( (lv_whereClause_2_0= ruleWhereClause ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_51) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:177:1: (lv_whereClause_2_0= ruleWhereClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:177:1: (lv_whereClause_2_0= ruleWhereClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:178:3: lv_whereClause_2_0= ruleWhereClause
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:194:3: ( (lv_groupByClause_3_0= ruleGroupByClause ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==KEYWORD_45) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:195:1: (lv_groupByClause_3_0= ruleGroupByClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:195:1: (lv_groupByClause_3_0= ruleGroupByClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:196:3: lv_groupByClause_3_0= ruleGroupByClause
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:212:3: ( (lv_orderByClause_4_0= ruleOrderByClause ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==KEYWORD_48) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:213:1: (lv_orderByClause_4_0= ruleOrderByClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:213:1: (lv_orderByClause_4_0= ruleOrderByClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:214:3: lv_orderByClause_4_0= ruleOrderByClause
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:238:1: entryRuleGroupByClause returns [EObject current=null] : iv_ruleGroupByClause= ruleGroupByClause EOF ;
    public final EObject entryRuleGroupByClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupByClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:239:2: (iv_ruleGroupByClause= ruleGroupByClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:240:2: iv_ruleGroupByClause= ruleGroupByClause EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:247:1: ruleGroupByClause returns [EObject current=null] : (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_13 ( (lv_grouping_2_0= ruleAliasAttributeExpression ) ) (otherlv_3= KEYWORD_3 ( (lv_grouping_4_0= ruleAliasAttributeExpression ) ) )* ( (lv_havingClause_5_0= ruleHavingClause ) )? ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:250:28: ( (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_13 ( (lv_grouping_2_0= ruleAliasAttributeExpression ) ) (otherlv_3= KEYWORD_3 ( (lv_grouping_4_0= ruleAliasAttributeExpression ) ) )* ( (lv_havingClause_5_0= ruleHavingClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:251:1: (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_13 ( (lv_grouping_2_0= ruleAliasAttributeExpression ) ) (otherlv_3= KEYWORD_3 ( (lv_grouping_4_0= ruleAliasAttributeExpression ) ) )* ( (lv_havingClause_5_0= ruleHavingClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:251:1: (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_13 ( (lv_grouping_2_0= ruleAliasAttributeExpression ) ) (otherlv_3= KEYWORD_3 ( (lv_grouping_4_0= ruleAliasAttributeExpression ) ) )* ( (lv_havingClause_5_0= ruleHavingClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:252:2: otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_13 ( (lv_grouping_2_0= ruleAliasAttributeExpression ) ) (otherlv_3= KEYWORD_3 ( (lv_grouping_4_0= ruleAliasAttributeExpression ) ) )* ( (lv_havingClause_5_0= ruleHavingClause ) )?
            {
            otherlv_0=(Token)match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleGroupByClause454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGroupByClauseAccess().getGROUPKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleGroupByClause466); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGroupByClauseAccess().getBYKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:261:1: ( (lv_grouping_2_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:262:1: (lv_grouping_2_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:262:1: (lv_grouping_2_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:263:3: lv_grouping_2_0= ruleAliasAttributeExpression
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:279:2: (otherlv_3= KEYWORD_3 ( (lv_grouping_4_0= ruleAliasAttributeExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==KEYWORD_3) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:280:2: otherlv_3= KEYWORD_3 ( (lv_grouping_4_0= ruleAliasAttributeExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleGroupByClause500); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getGroupByClauseAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:284:1: ( (lv_grouping_4_0= ruleAliasAttributeExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:285:1: (lv_grouping_4_0= ruleAliasAttributeExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:285:1: (lv_grouping_4_0= ruleAliasAttributeExpression )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:286:3: lv_grouping_4_0= ruleAliasAttributeExpression
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:302:4: ( (lv_havingClause_5_0= ruleHavingClause ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KEYWORD_55) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:303:1: (lv_havingClause_5_0= ruleHavingClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:303:1: (lv_havingClause_5_0= ruleHavingClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:304:3: lv_havingClause_5_0= ruleHavingClause
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:328:1: entryRuleHavingClause returns [EObject current=null] : iv_ruleHavingClause= ruleHavingClause EOF ;
    public final EObject entryRuleHavingClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHavingClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:329:2: (iv_ruleHavingClause= ruleHavingClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:330:2: iv_ruleHavingClause= ruleHavingClause EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:337:1: ruleHavingClause returns [EObject current=null] : (otherlv_0= KEYWORD_55 ( (lv_having_1_0= ruleOrExpression ) ) ) ;
    public final EObject ruleHavingClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_having_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:340:28: ( (otherlv_0= KEYWORD_55 ( (lv_having_1_0= ruleOrExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:341:1: (otherlv_0= KEYWORD_55 ( (lv_having_1_0= ruleOrExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:341:1: (otherlv_0= KEYWORD_55 ( (lv_having_1_0= ruleOrExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:342:2: otherlv_0= KEYWORD_55 ( (lv_having_1_0= ruleOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleHavingClause627); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getHavingClauseAccess().getHAVINGKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:346:1: ( (lv_having_1_0= ruleOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:347:1: (lv_having_1_0= ruleOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:347:1: (lv_having_1_0= ruleOrExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:348:3: lv_having_1_0= ruleOrExpression
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:372:1: entryRuleOrderByClause returns [EObject current=null] : iv_ruleOrderByClause= ruleOrderByClause EOF ;
    public final EObject entryRuleOrderByClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderByClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:373:2: (iv_ruleOrderByClause= ruleOrderByClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:374:2: iv_ruleOrderByClause= ruleOrderByClause EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:381:1: ruleOrderByClause returns [EObject current=null] : (otherlv_0= KEYWORD_48 otherlv_1= KEYWORD_13 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* ) ;
    public final EObject ruleOrderByClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ordering_2_0 = null;

        EObject lv_ordering_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:384:28: ( (otherlv_0= KEYWORD_48 otherlv_1= KEYWORD_13 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:385:1: (otherlv_0= KEYWORD_48 otherlv_1= KEYWORD_13 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:385:1: (otherlv_0= KEYWORD_48 otherlv_1= KEYWORD_13 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:386:2: otherlv_0= KEYWORD_48 otherlv_1= KEYWORD_13 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleOrderByClause730); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOrderByClauseAccess().getORDERKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleOrderByClause742); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOrderByClauseAccess().getBYKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:395:1: ( (lv_ordering_2_0= ruleOrderBySpec ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:396:1: (lv_ordering_2_0= ruleOrderBySpec )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:396:1: (lv_ordering_2_0= ruleOrderBySpec )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:397:3: lv_ordering_2_0= ruleOrderBySpec
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:413:2: (otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==KEYWORD_3) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:414:2: otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderBySpec ) )
            	    {
            	    otherlv_3=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleOrderByClause776); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getOrderByClauseAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:418:1: ( (lv_ordering_4_0= ruleOrderBySpec ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:419:1: (lv_ordering_4_0= ruleOrderBySpec )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:419:1: (lv_ordering_4_0= ruleOrderBySpec )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:420:3: lv_ordering_4_0= ruleOrderBySpec
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:444:1: entryRuleOrderBySpec returns [EObject current=null] : iv_ruleOrderBySpec= ruleOrderBySpec EOF ;
    public final EObject entryRuleOrderBySpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderBySpec = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:445:2: (iv_ruleOrderBySpec= ruleOrderBySpec EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:446:2: iv_ruleOrderBySpec= ruleOrderBySpec EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:453:1: ruleOrderBySpec returns [EObject current=null] : (this_AliasAttributeExpression_0= ruleAliasAttributeExpression ( (lv_direction_1_0= ruleOrderByDirection ) ) ) ;
    public final EObject ruleOrderBySpec() throws RecognitionException {
        EObject current = null;

        EObject this_AliasAttributeExpression_0 = null;

        Enumerator lv_direction_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:456:28: ( (this_AliasAttributeExpression_0= ruleAliasAttributeExpression ( (lv_direction_1_0= ruleOrderByDirection ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:457:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression ( (lv_direction_1_0= ruleOrderByDirection ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:457:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression ( (lv_direction_1_0= ruleOrderByDirection ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:458:2: this_AliasAttributeExpression_0= ruleAliasAttributeExpression ( (lv_direction_1_0= ruleOrderByDirection ) )
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:469:1: ( (lv_direction_1_0= ruleOrderByDirection ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:470:1: (lv_direction_1_0= ruleOrderByDirection )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:470:1: (lv_direction_1_0= ruleOrderByDirection )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:471:3: lv_direction_1_0= ruleOrderByDirection
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:495:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:496:2: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:497:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:504:1: ruleUpdateStatement returns [EObject current=null] : ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ) ;
    public final EObject ruleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_updateClause_0_0 = null;

        EObject lv_setClause_1_0 = null;

        EObject lv_whereClause_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:507:28: ( ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:508:1: ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:508:1: ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:508:2: ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )?
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:508:2: ( (lv_updateClause_0_0= ruleUpdateClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:509:1: (lv_updateClause_0_0= ruleUpdateClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:509:1: (lv_updateClause_0_0= ruleUpdateClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:510:3: lv_updateClause_0_0= ruleUpdateClause
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:526:2: ( (lv_setClause_1_0= ruleSetClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:527:1: (lv_setClause_1_0= ruleSetClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:527:1: (lv_setClause_1_0= ruleSetClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:528:3: lv_setClause_1_0= ruleSetClause
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:544:2: ( (lv_whereClause_2_0= ruleWhereClause ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KEYWORD_51) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:545:1: (lv_whereClause_2_0= ruleWhereClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:545:1: (lv_whereClause_2_0= ruleWhereClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:546:3: lv_whereClause_2_0= ruleWhereClause
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:570:1: entryRuleUpdateClause returns [EObject current=null] : iv_ruleUpdateClause= ruleUpdateClause EOF ;
    public final EObject entryRuleUpdateClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:571:2: (iv_ruleUpdateClause= ruleUpdateClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:572:2: iv_ruleUpdateClause= ruleUpdateClause EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:579:1: ruleUpdateClause returns [EObject current=null] : (otherlv_0= KEYWORD_60 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) ;
    public final EObject ruleUpdateClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_fromEntries_1_0 = null;

        EObject lv_fromEntries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:582:28: ( (otherlv_0= KEYWORD_60 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:583:1: (otherlv_0= KEYWORD_60 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:583:1: (otherlv_0= KEYWORD_60 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:584:2: otherlv_0= KEYWORD_60 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleUpdateClause1130); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUpdateClauseAccess().getUPDATEKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:588:1: ( (lv_fromEntries_1_0= ruleFromEntry ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:589:1: (lv_fromEntries_1_0= ruleFromEntry )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:589:1: (lv_fromEntries_1_0= ruleFromEntry )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:590:3: lv_fromEntries_1_0= ruleFromEntry
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:606:2: (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==KEYWORD_3) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:607:2: otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleUpdateClause1164); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getUpdateClauseAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:611:1: ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:612:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:612:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:613:3: lv_fromEntries_3_0= ruleFromEntry
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:637:1: entryRuleSetClause returns [EObject current=null] : iv_ruleSetClause= ruleSetClause EOF ;
    public final EObject entryRuleSetClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:638:2: (iv_ruleSetClause= ruleSetClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:639:2: iv_ruleSetClause= ruleSetClause EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:646:1: ruleSetClause returns [EObject current=null] : (otherlv_0= KEYWORD_29 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )* ) ;
    public final EObject ruleSetClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:649:28: ( (otherlv_0= KEYWORD_29 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:650:1: (otherlv_0= KEYWORD_29 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:650:1: (otherlv_0= KEYWORD_29 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:651:2: otherlv_0= KEYWORD_29 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleSetClause1269); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSetClauseAccess().getSETKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:655:1: ( (lv_items_1_0= ruleUpdateItem ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:656:1: (lv_items_1_0= ruleUpdateItem )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:656:1: (lv_items_1_0= ruleUpdateItem )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:657:3: lv_items_1_0= ruleUpdateItem
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:673:2: (otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==KEYWORD_3) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:674:2: otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleSetClause1303); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSetClauseAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:678:1: ( (lv_items_3_0= ruleUpdateItem ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:679:1: (lv_items_3_0= ruleUpdateItem )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:679:1: (lv_items_3_0= ruleUpdateItem )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:680:3: lv_items_3_0= ruleUpdateItem
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:704:1: entryRuleUpdateItem returns [EObject current=null] : iv_ruleUpdateItem= ruleUpdateItem EOF ;
    public final EObject entryRuleUpdateItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateItem = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:705:2: (iv_ruleUpdateItem= ruleUpdateItem EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:706:2: iv_ruleUpdateItem= ruleUpdateItem EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:713:1: ruleUpdateItem returns [EObject current=null] : ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_7 ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleUpdateItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_alias_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:716:28: ( ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_7 ( (lv_value_2_0= ruleValue ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:717:1: ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_7 ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:717:1: ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_7 ( (lv_value_2_0= ruleValue ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:717:2: ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_7 ( (lv_value_2_0= ruleValue ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:717:2: ( (lv_alias_0_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:718:1: (lv_alias_0_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:718:1: (lv_alias_0_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:719:3: lv_alias_0_0= ruleAliasAttributeExpression
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

            otherlv_1=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleUpdateItem1429); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUpdateItemAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:740:1: ( (lv_value_2_0= ruleValue ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:741:1: (lv_value_2_0= ruleValue )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:741:1: (lv_value_2_0= ruleValue )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:742:3: lv_value_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateItemAccess().getValueValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleUpdateItem1449);
            lv_value_2_0=ruleValue();

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
                      		"Value");
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:766:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:767:2: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:768:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:775:1: ruleDeleteStatement returns [EObject current=null] : ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_deleteClause_0_0 = null;

        EObject lv_whereClause_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:778:28: ( ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:779:1: ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:779:1: ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:779:2: ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )?
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:779:2: ( (lv_deleteClause_0_0= ruleDeleteClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:780:1: (lv_deleteClause_0_0= ruleDeleteClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:780:1: (lv_deleteClause_0_0= ruleDeleteClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:781:3: lv_deleteClause_0_0= ruleDeleteClause
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:797:2: ( (lv_whereClause_1_0= ruleWhereClause ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==KEYWORD_51) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:798:1: (lv_whereClause_1_0= ruleWhereClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:798:1: (lv_whereClause_1_0= ruleWhereClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:799:3: lv_whereClause_1_0= ruleWhereClause
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:823:1: entryRuleDeleteClause returns [EObject current=null] : iv_ruleDeleteClause= ruleDeleteClause EOF ;
    public final EObject entryRuleDeleteClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:824:2: (iv_ruleDeleteClause= ruleDeleteClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:825:2: iv_ruleDeleteClause= ruleDeleteClause EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:832:1: ruleDeleteClause returns [EObject current=null] : (otherlv_0= KEYWORD_53 ( (lv_fromClause_1_0= ruleFromClause ) ) ) ;
    public final EObject ruleDeleteClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_fromClause_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:835:28: ( (otherlv_0= KEYWORD_53 ( (lv_fromClause_1_0= ruleFromClause ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:836:1: (otherlv_0= KEYWORD_53 ( (lv_fromClause_1_0= ruleFromClause ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:836:1: (otherlv_0= KEYWORD_53 ( (lv_fromClause_1_0= ruleFromClause ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:837:2: otherlv_0= KEYWORD_53 ( (lv_fromClause_1_0= ruleFromClause ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleDeleteClause1645); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDeleteClauseAccess().getDELETEKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:841:1: ( (lv_fromClause_1_0= ruleFromClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:842:1: (lv_fromClause_1_0= ruleFromClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:842:1: (lv_fromClause_1_0= ruleFromClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:843:3: lv_fromClause_1_0= ruleFromClause
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:867:1: entryRuleSelectClause returns [EObject current=null] : iv_ruleSelectClause= ruleSelectClause EOF ;
    public final EObject entryRuleSelectClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:868:2: (iv_ruleSelectClause= ruleSelectClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:869:2: iv_ruleSelectClause= ruleSelectClause EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:876:1: ruleSelectClause returns [EObject current=null] : (otherlv_0= KEYWORD_59 ( (lv_isDistinct_1_0= KEYWORD_62 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* ) ;
    public final EObject ruleSelectClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isDistinct_1_0=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:879:28: ( (otherlv_0= KEYWORD_59 ( (lv_isDistinct_1_0= KEYWORD_62 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:880:1: (otherlv_0= KEYWORD_59 ( (lv_isDistinct_1_0= KEYWORD_62 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:880:1: (otherlv_0= KEYWORD_59 ( (lv_isDistinct_1_0= KEYWORD_62 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:881:2: otherlv_0= KEYWORD_59 ( (lv_isDistinct_1_0= KEYWORD_62 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_ruleSelectClause1748); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSelectClauseAccess().getSELECTKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:885:1: ( (lv_isDistinct_1_0= KEYWORD_62 ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==KEYWORD_62) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:886:1: (lv_isDistinct_1_0= KEYWORD_62 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:886:1: (lv_isDistinct_1_0= KEYWORD_62 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:887:3: lv_isDistinct_1_0= KEYWORD_62
                    {
                    lv_isDistinct_1_0=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleSelectClause1766); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:901:3: ( (lv_expressions_2_0= ruleSelectExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:902:1: (lv_expressions_2_0= ruleSelectExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:902:1: (lv_expressions_2_0= ruleSelectExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:903:3: lv_expressions_2_0= ruleSelectExpression
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:919:2: (otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==KEYWORD_3) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:920:2: otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleSelectClause1813); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getSelectClauseAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:924:1: ( (lv_expressions_4_0= ruleSelectExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:925:1: (lv_expressions_4_0= ruleSelectExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:925:1: (lv_expressions_4_0= ruleSelectExpression )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:926:3: lv_expressions_4_0= ruleSelectExpression
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:950:1: entryRuleSelectExpression returns [EObject current=null] : iv_ruleSelectExpression= ruleSelectExpression EOF ;
    public final EObject entryRuleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:951:2: (iv_ruleSelectExpression= ruleSelectExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:952:2: iv_ruleSelectExpression= ruleSelectExpression EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:959:1: ruleSelectExpression returns [EObject current=null] : (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression ) ;
    public final EObject ruleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AliasAttributeExpression_0 = null;

        EObject this_SelectAggregateExpression_1 = null;

        EObject this_SelectConstructorExpression_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:962:28: ( (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:963:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:963:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt15=1;
                }
                break;
            case KEYWORD_41:
            case KEYWORD_23:
            case KEYWORD_24:
            case KEYWORD_25:
            case KEYWORD_30:
                {
                alt15=2;
                }
                break;
            case KEYWORD_27:
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:964:2: this_AliasAttributeExpression_0= ruleAliasAttributeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectExpressionAccess().getAliasAttributeExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSelectExpression1930);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:977:2: this_SelectAggregateExpression_1= ruleSelectAggregateExpression
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:990:2: this_SelectConstructorExpression_2= ruleSelectConstructorExpression
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1009:1: entryRuleSelectAggregateExpression returns [EObject current=null] : iv_ruleSelectAggregateExpression= ruleSelectAggregateExpression EOF ;
    public final EObject entryRuleSelectAggregateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectAggregateExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1010:2: (iv_ruleSelectAggregateExpression= ruleSelectAggregateExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1011:2: iv_ruleSelectAggregateExpression= ruleSelectAggregateExpression EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1018:1: ruleSelectAggregateExpression returns [EObject current=null] : (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate ) ;
    public final EObject ruleSelectAggregateExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AvgAggregate_0 = null;

        EObject this_MaxAggregate_1 = null;

        EObject this_MinAggregate_2 = null;

        EObject this_SumAggregate_3 = null;

        EObject this_CountAggregate_4 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1021:28: ( (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1022:1: (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1022:1: (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate )
            int alt16=5;
            switch ( input.LA(1) ) {
            case KEYWORD_23:
                {
                alt16=1;
                }
                break;
            case KEYWORD_24:
                {
                alt16=2;
                }
                break;
            case KEYWORD_25:
                {
                alt16=3;
                }
                break;
            case KEYWORD_30:
                {
                alt16=4;
                }
                break;
            case KEYWORD_41:
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1023:2: this_AvgAggregate_0= ruleAvgAggregate
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1036:2: this_MaxAggregate_1= ruleMaxAggregate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getMaxAggregateParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMaxAggregate_in_ruleSelectAggregateExpression2114);
                    this_MaxAggregate_1=ruleMaxAggregate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_MaxAggregate_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1049:2: this_MinAggregate_2= ruleMinAggregate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getMinAggregateParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMinAggregate_in_ruleSelectAggregateExpression2144);
                    this_MinAggregate_2=ruleMinAggregate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_MinAggregate_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1062:2: this_SumAggregate_3= ruleSumAggregate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getSumAggregateParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSumAggregate_in_ruleSelectAggregateExpression2174);
                    this_SumAggregate_3=ruleSumAggregate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_SumAggregate_3;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1075:2: this_CountAggregate_4= ruleCountAggregate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getCountAggregateParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCountAggregate_in_ruleSelectAggregateExpression2204);
                    this_CountAggregate_4=ruleCountAggregate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_CountAggregate_4;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1094:1: entryRuleAvgAggregate returns [EObject current=null] : iv_ruleAvgAggregate= ruleAvgAggregate EOF ;
    public final EObject entryRuleAvgAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvgAggregate = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1095:2: (iv_ruleAvgAggregate= ruleAvgAggregate EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1096:2: iv_ruleAvgAggregate= ruleAvgAggregate EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1103:1: ruleAvgAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_23 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleAvgAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1106:28: ( (otherlv_0= KEYWORD_23 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1107:1: (otherlv_0= KEYWORD_23 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1107:1: (otherlv_0= KEYWORD_23 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1108:2: otherlv_0= KEYWORD_23 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleAvgAggregate2286); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAvgAggregateAccess().getAVGKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleAvgAggregate2298); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAvgAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1117:1: ( (lv_isDistinct_2_0= KEYWORD_62 ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==KEYWORD_62) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1118:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1118:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1119:3: lv_isDistinct_2_0= KEYWORD_62
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleAvgAggregate2316); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1133:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1134:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1134:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1135:3: lv_item_3_0= ruleAliasAttributeExpression
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


    // $ANTLR start "entryRuleMaxAggregate"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1164:1: entryRuleMaxAggregate returns [EObject current=null] : iv_ruleMaxAggregate= ruleMaxAggregate EOF ;
    public final EObject entryRuleMaxAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxAggregate = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1165:2: (iv_ruleMaxAggregate= ruleMaxAggregate EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1166:2: iv_ruleMaxAggregate= ruleMaxAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaxAggregateRule()); 
            }
            pushFollow(FOLLOW_ruleMaxAggregate_in_entryRuleMaxAggregate2396);
            iv_ruleMaxAggregate=ruleMaxAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaxAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxAggregate2406); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1173:1: ruleMaxAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_24 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleMaxAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1176:28: ( (otherlv_0= KEYWORD_24 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1177:1: (otherlv_0= KEYWORD_24 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1177:1: (otherlv_0= KEYWORD_24 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1178:2: otherlv_0= KEYWORD_24 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleMaxAggregate2444); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMaxAggregateAccess().getMAXKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleMaxAggregate2456); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMaxAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1187:1: ( (lv_isDistinct_2_0= KEYWORD_62 ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KEYWORD_62) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1188:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1188:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1189:3: lv_isDistinct_2_0= KEYWORD_62
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleMaxAggregate2474); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1203:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1204:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1204:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1205:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaxAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleMaxAggregate2507);
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

            otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleMaxAggregate2520); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1234:1: entryRuleMinAggregate returns [EObject current=null] : iv_ruleMinAggregate= ruleMinAggregate EOF ;
    public final EObject entryRuleMinAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinAggregate = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1235:2: (iv_ruleMinAggregate= ruleMinAggregate EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1236:2: iv_ruleMinAggregate= ruleMinAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinAggregateRule()); 
            }
            pushFollow(FOLLOW_ruleMinAggregate_in_entryRuleMinAggregate2554);
            iv_ruleMinAggregate=ruleMinAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinAggregate2564); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1243:1: ruleMinAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_25 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleMinAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1246:28: ( (otherlv_0= KEYWORD_25 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1247:1: (otherlv_0= KEYWORD_25 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1247:1: (otherlv_0= KEYWORD_25 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1248:2: otherlv_0= KEYWORD_25 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleMinAggregate2602); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMinAggregateAccess().getMINKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleMinAggregate2614); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMinAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1257:1: ( (lv_isDistinct_2_0= KEYWORD_62 ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KEYWORD_62) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1258:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1258:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1259:3: lv_isDistinct_2_0= KEYWORD_62
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleMinAggregate2632); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1273:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1274:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1274:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1275:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleMinAggregate2665);
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

            otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleMinAggregate2678); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1304:1: entryRuleSumAggregate returns [EObject current=null] : iv_ruleSumAggregate= ruleSumAggregate EOF ;
    public final EObject entryRuleSumAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumAggregate = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1305:2: (iv_ruleSumAggregate= ruleSumAggregate EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1306:2: iv_ruleSumAggregate= ruleSumAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumAggregateRule()); 
            }
            pushFollow(FOLLOW_ruleSumAggregate_in_entryRuleSumAggregate2712);
            iv_ruleSumAggregate=ruleSumAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumAggregate2722); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1313:1: ruleSumAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_30 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleSumAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1316:28: ( (otherlv_0= KEYWORD_30 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1317:1: (otherlv_0= KEYWORD_30 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1317:1: (otherlv_0= KEYWORD_30 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1318:2: otherlv_0= KEYWORD_30 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleSumAggregate2760); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSumAggregateAccess().getSUMKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleSumAggregate2772); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSumAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1327:1: ( (lv_isDistinct_2_0= KEYWORD_62 ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KEYWORD_62) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1328:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1328:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1329:3: lv_isDistinct_2_0= KEYWORD_62
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleSumAggregate2790); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1343:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1344:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1344:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1345:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSumAggregate2823);
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

            otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleSumAggregate2836); if (state.failed) return current;
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


    // $ANTLR start "entryRuleCountAggregate"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1374:1: entryRuleCountAggregate returns [EObject current=null] : iv_ruleCountAggregate= ruleCountAggregate EOF ;
    public final EObject entryRuleCountAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountAggregate = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1375:2: (iv_ruleCountAggregate= ruleCountAggregate EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1376:2: iv_ruleCountAggregate= ruleCountAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCountAggregateRule()); 
            }
            pushFollow(FOLLOW_ruleCountAggregate_in_entryRuleCountAggregate2870);
            iv_ruleCountAggregate=ruleCountAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCountAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCountAggregate2880); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1383:1: ruleCountAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_41 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleCountAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1386:28: ( (otherlv_0= KEYWORD_41 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1387:1: (otherlv_0= KEYWORD_41 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1387:1: (otherlv_0= KEYWORD_41 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1388:2: otherlv_0= KEYWORD_41 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleCountAggregate2918); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCountAggregateAccess().getCOUNTKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleCountAggregate2930); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCountAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1397:1: ( (lv_isDistinct_2_0= KEYWORD_62 ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KEYWORD_62) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1398:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1398:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1399:3: lv_isDistinct_2_0= KEYWORD_62
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleCountAggregate2948); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1413:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1414:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1414:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1415:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCountAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleCountAggregate2981);
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

            otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleCountAggregate2994); if (state.failed) return current;
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


    // $ANTLR start "entryRuleSelectConstructorExpression"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1444:1: entryRuleSelectConstructorExpression returns [EObject current=null] : iv_ruleSelectConstructorExpression= ruleSelectConstructorExpression EOF ;
    public final EObject entryRuleSelectConstructorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectConstructorExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1445:2: (iv_ruleSelectConstructorExpression= ruleSelectConstructorExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1446:2: iv_ruleSelectConstructorExpression= ruleSelectConstructorExpression EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1453:1: ruleSelectConstructorExpression returns [EObject current=null] : (otherlv_0= KEYWORD_27 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2 ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1456:28: ( (otherlv_0= KEYWORD_27 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1457:1: (otherlv_0= KEYWORD_27 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1457:1: (otherlv_0= KEYWORD_27 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1458:2: otherlv_0= KEYWORD_27 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleSelectConstructorExpression3076); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSelectConstructorExpressionAccess().getNEWKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1462:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1463:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1463:1: (lv_name_1_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1464:3: lv_name_1_0= RULE_ID
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1485:1: ( (lv_items_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1486:1: (lv_items_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1486:1: (lv_items_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1487:3: lv_items_3_0= ruleAliasAttributeExpression
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1503:2: (otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==KEYWORD_3) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1504:2: otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleSelectConstructorExpression3144); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getSelectConstructorExpressionAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1508:1: ( (lv_items_5_0= ruleAliasAttributeExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1509:1: (lv_items_5_0= ruleAliasAttributeExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1509:1: (lv_items_5_0= ruleAliasAttributeExpression )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1510:3: lv_items_5_0= ruleAliasAttributeExpression
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1539:1: entryRuleFromClause returns [EObject current=null] : iv_ruleFromClause= ruleFromClause EOF ;
    public final EObject entryRuleFromClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1540:2: (iv_ruleFromClause= ruleFromClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1541:2: iv_ruleFromClause= ruleFromClause EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1548:1: ruleFromClause returns [EObject current=null] : (otherlv_0= KEYWORD_32 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) ;
    public final EObject ruleFromClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_fromEntries_1_0 = null;

        EObject lv_fromEntries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1551:28: ( (otherlv_0= KEYWORD_32 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1552:1: (otherlv_0= KEYWORD_32 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1552:1: (otherlv_0= KEYWORD_32 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1553:2: otherlv_0= KEYWORD_32 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleFromClause3261); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFromClauseAccess().getFROMKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1557:1: ( (lv_fromEntries_1_0= ruleFromClass ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1558:1: (lv_fromEntries_1_0= ruleFromClass )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1558:1: (lv_fromEntries_1_0= ruleFromClass )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1559:3: lv_fromEntries_1_0= ruleFromClass
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1575:2: (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==KEYWORD_3) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1576:2: otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleFromClause3295); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFromClauseAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1580:1: ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1581:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1581:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1582:3: lv_fromEntries_3_0= ruleFromEntry
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1606:1: entryRuleFromEntry returns [EObject current=null] : iv_ruleFromEntry= ruleFromEntry EOF ;
    public final EObject entryRuleFromEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromEntry = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1607:2: (iv_ruleFromEntry= ruleFromEntry EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1608:2: iv_ruleFromEntry= ruleFromEntry EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1615:1: ruleFromEntry returns [EObject current=null] : (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection ) ;
    public final EObject ruleFromEntry() throws RecognitionException {
        EObject current = null;

        EObject this_FromClass_0 = null;

        EObject this_FromCollection_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1618:28: ( (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1619:1: (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1619:1: (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==KEYWORD_14) ) {
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1620:2: this_FromClass_0= ruleFromClass
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1633:2: this_FromCollection_1= ruleFromCollection
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1652:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1653:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1654:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1661:1: ruleVariableDeclaration returns [EObject current=null] : ( (otherlv_0= KEYWORD_12 )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1664:28: ( ( (otherlv_0= KEYWORD_12 )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1665:1: ( (otherlv_0= KEYWORD_12 )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1665:1: ( (otherlv_0= KEYWORD_12 )? ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1665:2: (otherlv_0= KEYWORD_12 )? ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1665:2: (otherlv_0= KEYWORD_12 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==KEYWORD_12) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1666:2: otherlv_0= KEYWORD_12
                    {
                    otherlv_0=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleVariableDeclaration3525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getASKeyword_0());
                          
                    }

                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1670:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1671:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1671:1: (lv_name_1_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1672:3: lv_name_1_0= RULE_ID
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1696:1: entryRuleFromClass returns [EObject current=null] : iv_ruleFromClass= ruleFromClass EOF ;
    public final EObject entryRuleFromClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClass = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1697:2: (iv_ruleFromClass= ruleFromClass EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1698:2: iv_ruleFromClass= ruleFromClass EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1705:1: ruleFromClass returns [EObject current=null] : (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar ) ;
    public final EObject ruleFromClass() throws RecognitionException {
        EObject current = null;

        EObject this_FromClassId_0 = null;

        EObject this_FromClassVar_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1708:28: ( (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1709:1: (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1709:1: (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1710:2: this_FromClassId_0= ruleFromClassId
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1723:2: this_FromClassVar_1= ruleFromClassVar
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1742:1: entryRuleQualifiedIdentifier returns [String current=null] : iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF ;
    public final String entryRuleQualifiedIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedIdentifier = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1743:1: (iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1744:2: iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1751:1: ruleQualifiedIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= KEYWORD_4 this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1755:6: ( (this_ID_0= RULE_ID (kw= KEYWORD_4 this_ID_2= RULE_ID )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1756:1: (this_ID_0= RULE_ID (kw= KEYWORD_4 this_ID_2= RULE_ID )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1756:1: (this_ID_0= RULE_ID (kw= KEYWORD_4 this_ID_2= RULE_ID )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1756:6: this_ID_0= RULE_ID (kw= KEYWORD_4 this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier3759); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1763:1: (kw= KEYWORD_4 this_ID_2= RULE_ID )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==KEYWORD_4) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1764:2: kw= KEYWORD_4 this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleQualifiedIdentifier3778); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1784:1: entryRuleFromClassId returns [EObject current=null] : iv_ruleFromClassId= ruleFromClassId EOF ;
    public final EObject entryRuleFromClassId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClassId = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1785:2: (iv_ruleFromClassId= ruleFromClassId EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1786:2: iv_ruleFromClassId= ruleFromClassId EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1793:1: ruleFromClassId returns [EObject current=null] : ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ;
    public final EObject ruleFromClassId() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1796:28: ( ( (lv_type_0_0= ruleQualifiedIdentifier ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1797:1: ( (lv_type_0_0= ruleQualifiedIdentifier ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1797:1: ( (lv_type_0_0= ruleQualifiedIdentifier ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1798:1: (lv_type_0_0= ruleQualifiedIdentifier )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1798:1: (lv_type_0_0= ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1799:3: lv_type_0_0= ruleQualifiedIdentifier
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1823:1: entryRuleFromClassVar returns [EObject current=null] : iv_ruleFromClassVar= ruleFromClassVar EOF ;
    public final EObject entryRuleFromClassVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClassVar = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1824:2: (iv_ruleFromClassVar= ruleFromClassVar EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1825:2: iv_ruleFromClassVar= ruleFromClassVar EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1832:1: ruleFromClassVar returns [EObject current=null] : ( ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* ) ;
    public final EObject ruleFromClassVar() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_joins_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1835:28: ( ( ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1836:1: ( ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1836:1: ( ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1836:2: ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )*
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1836:2: ( (lv_type_0_0= ruleQualifiedIdentifier ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1837:1: (lv_type_0_0= ruleQualifiedIdentifier )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1837:1: (lv_type_0_0= ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1838:3: lv_type_0_0= ruleQualifiedIdentifier
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1854:2: ( (lv_variable_1_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1855:1: (lv_variable_1_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1855:1: (lv_variable_1_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1856:3: lv_variable_1_0= ruleVariableDeclaration
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1872:2: ( (lv_joins_2_0= ruleFromJoin ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==KEYWORD_46||(LA28_0>=KEYWORD_33 && LA28_0<=KEYWORD_34)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1873:1: (lv_joins_2_0= ruleFromJoin )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1873:1: (lv_joins_2_0= ruleFromJoin )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1874:3: lv_joins_2_0= ruleFromJoin
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1898:1: entryRuleFromCollection returns [EObject current=null] : iv_ruleFromCollection= ruleFromCollection EOF ;
    public final EObject entryRuleFromCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromCollection = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1899:2: (iv_ruleFromCollection= ruleFromCollection EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1900:2: iv_ruleFromCollection= ruleFromCollection EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1907:1: ruleFromCollection returns [EObject current=null] : (otherlv_0= KEYWORD_14 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleFromCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_path_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1910:28: ( (otherlv_0= KEYWORD_14 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1911:1: (otherlv_0= KEYWORD_14 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1911:1: (otherlv_0= KEYWORD_14 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1912:2: otherlv_0= KEYWORD_14 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleFromCollection4110); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFromCollectionAccess().getINKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleFromCollection4122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFromCollectionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1921:1: ( (lv_path_2_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1922:1: (lv_path_2_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1922:1: (lv_path_2_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1923:3: lv_path_2_0= ruleAliasAttributeExpression
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1944:1: ( (lv_variable_4_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1945:1: (lv_variable_4_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1945:1: (lv_variable_4_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1946:3: lv_variable_4_0= ruleVariableDeclaration
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1970:1: entryRuleFromJoin returns [EObject current=null] : iv_ruleFromJoin= ruleFromJoin EOF ;
    public final EObject entryRuleFromJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromJoin = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1971:2: (iv_ruleFromJoin= ruleFromJoin EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1972:2: iv_ruleFromJoin= ruleFromJoin EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1979:1: ruleFromJoin returns [EObject current=null] : (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin ) ;
    public final EObject ruleFromJoin() throws RecognitionException {
        EObject current = null;

        EObject this_Join_0 = null;

        EObject this_LeftJoin_1 = null;

        EObject this_InnerJoin_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1982:28: ( (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1983:1: (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1983:1: (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin )
            int alt29=3;
            switch ( input.LA(1) ) {
            case KEYWORD_33:
                {
                alt29=1;
                }
                break;
            case KEYWORD_34:
                {
                alt29=2;
                }
                break;
            case KEYWORD_46:
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1984:2: this_Join_0= ruleJoin
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1997:2: this_LeftJoin_1= ruleLeftJoin
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2010:2: this_InnerJoin_2= ruleInnerJoin
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2029:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2030:2: (iv_ruleJoin= ruleJoin EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2031:2: iv_ruleJoin= ruleJoin EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2038:1: ruleJoin returns [EObject current=null] : (otherlv_0= KEYWORD_33 ( (lv_isFetch_1_0= KEYWORD_44 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isFetch_1_0=null;
        EObject lv_path_2_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2041:28: ( (otherlv_0= KEYWORD_33 ( (lv_isFetch_1_0= KEYWORD_44 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2042:1: (otherlv_0= KEYWORD_33 ( (lv_isFetch_1_0= KEYWORD_44 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2042:1: (otherlv_0= KEYWORD_33 ( (lv_isFetch_1_0= KEYWORD_44 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2043:2: otherlv_0= KEYWORD_33 ( (lv_isFetch_1_0= KEYWORD_44 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleJoin4412); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJoinAccess().getJOINKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2047:1: ( (lv_isFetch_1_0= KEYWORD_44 ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==KEYWORD_44) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2048:1: (lv_isFetch_1_0= KEYWORD_44 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2048:1: (lv_isFetch_1_0= KEYWORD_44 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2049:3: lv_isFetch_1_0= KEYWORD_44
                    {
                    lv_isFetch_1_0=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleJoin4430); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2063:3: ( (lv_path_2_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2064:1: (lv_path_2_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2064:1: (lv_path_2_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2065:3: lv_path_2_0= ruleAliasAttributeExpression
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2081:2: ( (lv_variable_3_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2082:1: (lv_variable_3_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2082:1: (lv_variable_3_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2083:3: lv_variable_3_0= ruleVariableDeclaration
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2107:1: entryRuleLeftJoin returns [EObject current=null] : iv_ruleLeftJoin= ruleLeftJoin EOF ;
    public final EObject entryRuleLeftJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftJoin = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2108:2: (iv_ruleLeftJoin= ruleLeftJoin EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2109:2: iv_ruleLeftJoin= ruleLeftJoin EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2116:1: ruleLeftJoin returns [EObject current=null] : (otherlv_0= KEYWORD_34 ( (lv_isOuter_1_0= KEYWORD_49 ) )? otherlv_2= KEYWORD_33 ( (lv_isFetch_3_0= KEYWORD_44 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2119:28: ( (otherlv_0= KEYWORD_34 ( (lv_isOuter_1_0= KEYWORD_49 ) )? otherlv_2= KEYWORD_33 ( (lv_isFetch_3_0= KEYWORD_44 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2120:1: (otherlv_0= KEYWORD_34 ( (lv_isOuter_1_0= KEYWORD_49 ) )? otherlv_2= KEYWORD_33 ( (lv_isFetch_3_0= KEYWORD_44 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2120:1: (otherlv_0= KEYWORD_34 ( (lv_isOuter_1_0= KEYWORD_49 ) )? otherlv_2= KEYWORD_33 ( (lv_isFetch_3_0= KEYWORD_44 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2121:2: otherlv_0= KEYWORD_34 ( (lv_isOuter_1_0= KEYWORD_49 ) )? otherlv_2= KEYWORD_33 ( (lv_isFetch_3_0= KEYWORD_44 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleLeftJoin4567); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLeftJoinAccess().getLEFTKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2125:1: ( (lv_isOuter_1_0= KEYWORD_49 ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==KEYWORD_49) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2126:1: (lv_isOuter_1_0= KEYWORD_49 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2126:1: (lv_isOuter_1_0= KEYWORD_49 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2127:3: lv_isOuter_1_0= KEYWORD_49
                    {
                    lv_isOuter_1_0=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleLeftJoin4585); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleLeftJoin4610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLeftJoinAccess().getJOINKeyword_2());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2146:1: ( (lv_isFetch_3_0= KEYWORD_44 ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==KEYWORD_44) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2147:1: (lv_isFetch_3_0= KEYWORD_44 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2147:1: (lv_isFetch_3_0= KEYWORD_44 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2148:3: lv_isFetch_3_0= KEYWORD_44
                    {
                    lv_isFetch_3_0=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleLeftJoin4628); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2162:3: ( (lv_path_4_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2163:1: (lv_path_4_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2163:1: (lv_path_4_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2164:3: lv_path_4_0= ruleAliasAttributeExpression
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2180:2: ( (lv_variable_5_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2181:1: (lv_variable_5_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2181:1: (lv_variable_5_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2182:3: lv_variable_5_0= ruleVariableDeclaration
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2206:1: entryRuleInnerJoin returns [EObject current=null] : iv_ruleInnerJoin= ruleInnerJoin EOF ;
    public final EObject entryRuleInnerJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerJoin = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2207:2: (iv_ruleInnerJoin= ruleInnerJoin EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2208:2: iv_ruleInnerJoin= ruleInnerJoin EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2215:1: ruleInnerJoin returns [EObject current=null] : (otherlv_0= KEYWORD_46 otherlv_1= KEYWORD_33 ( (lv_isFetch_2_0= KEYWORD_44 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleInnerJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isFetch_2_0=null;
        EObject lv_path_3_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2218:28: ( (otherlv_0= KEYWORD_46 otherlv_1= KEYWORD_33 ( (lv_isFetch_2_0= KEYWORD_44 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2219:1: (otherlv_0= KEYWORD_46 otherlv_1= KEYWORD_33 ( (lv_isFetch_2_0= KEYWORD_44 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2219:1: (otherlv_0= KEYWORD_46 otherlv_1= KEYWORD_33 ( (lv_isFetch_2_0= KEYWORD_44 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2220:2: otherlv_0= KEYWORD_46 otherlv_1= KEYWORD_33 ( (lv_isFetch_2_0= KEYWORD_44 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleInnerJoin4765); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInnerJoinAccess().getINNERKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleInnerJoin4777); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInnerJoinAccess().getJOINKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2229:1: ( (lv_isFetch_2_0= KEYWORD_44 ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==KEYWORD_44) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2230:1: (lv_isFetch_2_0= KEYWORD_44 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2230:1: (lv_isFetch_2_0= KEYWORD_44 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2231:3: lv_isFetch_2_0= KEYWORD_44
                    {
                    lv_isFetch_2_0=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleInnerJoin4795); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2245:3: ( (lv_path_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2246:1: (lv_path_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2246:1: (lv_path_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2247:3: lv_path_3_0= ruleAliasAttributeExpression
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2263:2: ( (lv_variable_4_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2264:1: (lv_variable_4_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2264:1: (lv_variable_4_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2265:3: lv_variable_4_0= ruleVariableDeclaration
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2289:1: entryRuleWhereClause returns [EObject current=null] : iv_ruleWhereClause= ruleWhereClause EOF ;
    public final EObject entryRuleWhereClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2290:2: (iv_ruleWhereClause= ruleWhereClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2291:2: iv_ruleWhereClause= ruleWhereClause EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2298:1: ruleWhereClause returns [EObject current=null] : (otherlv_0= KEYWORD_51 ( (lv_whereEntry_1_0= ruleOrExpression ) ) ) ;
    public final EObject ruleWhereClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_whereEntry_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2301:28: ( (otherlv_0= KEYWORD_51 ( (lv_whereEntry_1_0= ruleOrExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2302:1: (otherlv_0= KEYWORD_51 ( (lv_whereEntry_1_0= ruleOrExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2302:1: (otherlv_0= KEYWORD_51 ( (lv_whereEntry_1_0= ruleOrExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2303:2: otherlv_0= KEYWORD_51 ( (lv_whereEntry_1_0= ruleOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleWhereClause4932); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhereClauseAccess().getWHEREKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2307:1: ( (lv_whereEntry_1_0= ruleOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2308:1: (lv_whereEntry_1_0= ruleOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2308:1: (lv_whereEntry_1_0= ruleOrExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2309:3: lv_whereEntry_1_0= ruleOrExpression
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2333:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2334:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2335:2: iv_ruleOrExpression= ruleOrExpression EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2342:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2345:28: ( (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2346:1: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2346:1: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2347:2: this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )?
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2358:1: ( () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==KEYWORD_17) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2358:2: () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2358:2: ()
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2359:2: 
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

                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2367:2: (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==KEYWORD_17) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2368:2: otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleOrExpression5073); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getORKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2372:1: ( (lv_entries_3_0= ruleAndExpression ) )
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2373:1: (lv_entries_3_0= ruleAndExpression )
                    	    {
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2373:1: (lv_entries_3_0= ruleAndExpression )
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2374:3: lv_entries_3_0= ruleAndExpression
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2398:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2399:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2400:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2407:1: ruleAndExpression returns [EObject current=null] : (this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ConcreteExpression_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2410:28: ( (this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2411:1: (this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2411:1: (this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2412:2: this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getConcreteExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConcreteExpression_in_ruleAndExpression5192);
            this_ConcreteExpression_0=ruleConcreteExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ConcreteExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2423:1: ( () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==KEYWORD_20) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2423:2: () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2423:2: ()
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2424:2: 
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

                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2432:2: (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==KEYWORD_20) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2433:2: otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleAndExpression5218); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getANDKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2437:1: ( (lv_entries_3_0= ruleConcreteExpression ) )
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2438:1: (lv_entries_3_0= ruleConcreteExpression )
                    	    {
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2438:1: (lv_entries_3_0= ruleConcreteExpression )
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2439:3: lv_entries_3_0= ruleConcreteExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getEntriesConcreteExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleConcreteExpression_in_ruleAndExpression5238);
                    	    lv_entries_3_0=ruleConcreteExpression();

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
                    	              		"ConcreteExpression");
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


    // $ANTLR start "entryRuleConcreteExpression"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2463:1: entryRuleConcreteExpression returns [EObject current=null] : iv_ruleConcreteExpression= ruleConcreteExpression EOF ;
    public final EObject entryRuleConcreteExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2464:2: (iv_ruleConcreteExpression= ruleConcreteExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2465:2: iv_ruleConcreteExpression= ruleConcreteExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcreteExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConcreteExpression_in_entryRuleConcreteExpression5277);
            iv_ruleConcreteExpression=ruleConcreteExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcreteExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcreteExpression5287); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2472:1: ruleConcreteExpression returns [EObject current=null] : (this_ParExpression_0= ruleParExpression | this_ComparisonOperatorExpression_1= ruleComparisonOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression ) ;
    public final EObject ruleConcreteExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ParExpression_0 = null;

        EObject this_ComparisonOperatorExpression_1 = null;

        EObject this_ExistsExpression_2 = null;

        EObject this_AllExpression_3 = null;

        EObject this_AnyExpression_4 = null;

        EObject this_SomeExpression_5 = null;

        EObject this_CollectionExpression_6 = null;

        EObject this_NullComparisonExpression_7 = null;

        EObject this_EmptyComparisonExpression_8 = null;

        EObject this_LikeExpression_9 = null;

        EObject this_InExpression_10 = null;

        EObject this_BetweenExpression_11 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2475:28: ( (this_ParExpression_0= ruleParExpression | this_ComparisonOperatorExpression_1= ruleComparisonOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2476:1: (this_ParExpression_0= ruleParExpression | this_ComparisonOperatorExpression_1= ruleComparisonOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2476:1: (this_ParExpression_0= ruleParExpression | this_ComparisonOperatorExpression_1= ruleComparisonOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression )
            int alt38=12;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2477:2: this_ParExpression_0= ruleParExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getParExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParExpression_in_ruleConcreteExpression5337);
                    this_ParExpression_0=ruleParExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ParExpression_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2490:2: this_ComparisonOperatorExpression_1= ruleComparisonOperatorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getComparisonOperatorExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComparisonOperatorExpression_in_ruleConcreteExpression5367);
                    this_ComparisonOperatorExpression_1=ruleComparisonOperatorExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ComparisonOperatorExpression_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2503:2: this_ExistsExpression_2= ruleExistsExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getExistsExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExistsExpression_in_ruleConcreteExpression5397);
                    this_ExistsExpression_2=ruleExistsExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ExistsExpression_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2516:2: this_AllExpression_3= ruleAllExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getAllExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAllExpression_in_ruleConcreteExpression5427);
                    this_AllExpression_3=ruleAllExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_AllExpression_3;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2529:2: this_AnyExpression_4= ruleAnyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getAnyExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnyExpression_in_ruleConcreteExpression5457);
                    this_AnyExpression_4=ruleAnyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_AnyExpression_4;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2542:2: this_SomeExpression_5= ruleSomeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getSomeExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSomeExpression_in_ruleConcreteExpression5487);
                    this_SomeExpression_5=ruleSomeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_SomeExpression_5;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2555:2: this_CollectionExpression_6= ruleCollectionExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getCollectionExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCollectionExpression_in_ruleConcreteExpression5517);
                    this_CollectionExpression_6=ruleCollectionExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_CollectionExpression_6;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2568:2: this_NullComparisonExpression_7= ruleNullComparisonExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getNullComparisonExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullComparisonExpression_in_ruleConcreteExpression5547);
                    this_NullComparisonExpression_7=ruleNullComparisonExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_NullComparisonExpression_7;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2581:2: this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getEmptyComparisonExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEmptyComparisonExpression_in_ruleConcreteExpression5577);
                    this_EmptyComparisonExpression_8=ruleEmptyComparisonExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EmptyComparisonExpression_8;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2594:2: this_LikeExpression_9= ruleLikeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getLikeExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLikeExpression_in_ruleConcreteExpression5607);
                    this_LikeExpression_9=ruleLikeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_LikeExpression_9;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2607:2: this_InExpression_10= ruleInExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getInExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInExpression_in_ruleConcreteExpression5637);
                    this_InExpression_10=ruleInExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_InExpression_10;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2620:2: this_BetweenExpression_11= ruleBetweenExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getBetweenExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBetweenExpression_in_ruleConcreteExpression5667);
                    this_BetweenExpression_11=ruleBetweenExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BetweenExpression_11;
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


    // $ANTLR start "entryRuleParExpression"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2639:1: entryRuleParExpression returns [EObject current=null] : iv_ruleParExpression= ruleParExpression EOF ;
    public final EObject entryRuleParExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2640:2: (iv_ruleParExpression= ruleParExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2641:2: iv_ruleParExpression= ruleParExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParExpression_in_entryRuleParExpression5701);
            iv_ruleParExpression=ruleParExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParExpression5711); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParExpression"


    // $ANTLR start "ruleParExpression"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2648:1: ruleParExpression returns [EObject current=null] : (otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2 ) ;
    public final EObject ruleParExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ExpressionTerm_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2651:28: ( (otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2652:1: (otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2652:1: (otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2653:2: otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleParExpression5749); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParExpressionAccess().getExpressionTermParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionTerm_in_ruleParExpression5773);
            this_ExpressionTerm_1=ruleExpressionTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ExpressionTerm_1;
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleParExpression5785); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParExpressionAccess().getRightParenthesisKeyword_2());
                  
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
    // $ANTLR end "ruleParExpression"


    // $ANTLR start "entryRuleComparisonOperatorExpression"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2682:1: entryRuleComparisonOperatorExpression returns [EObject current=null] : iv_ruleComparisonOperatorExpression= ruleComparisonOperatorExpression EOF ;
    public final EObject entryRuleComparisonOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonOperatorExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2683:2: (iv_ruleComparisonOperatorExpression= ruleComparisonOperatorExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2684:2: iv_ruleComparisonOperatorExpression= ruleComparisonOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleComparisonOperatorExpression_in_entryRuleComparisonOperatorExpression5819);
            iv_ruleComparisonOperatorExpression=ruleComparisonOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonOperatorExpression5829); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2691:1: ruleComparisonOperatorExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_right_2_0= ruleExpressionTerm ) ) ) ;
    public final EObject ruleComparisonOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2694:28: ( ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_right_2_0= ruleExpressionTerm ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2695:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_right_2_0= ruleExpressionTerm ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2695:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_right_2_0= ruleExpressionTerm ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2695:2: ( (lv_left_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_right_2_0= ruleExpressionTerm ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2695:2: ( (lv_left_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2696:1: (lv_left_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2696:1: (lv_left_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2697:3: lv_left_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComparisonOperatorExpressionAccess().getLeftVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleComparisonOperatorExpression5875);
            lv_left_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getComparisonOperatorExpressionRule());
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2713:2: ( (lv_operator_1_0= ruleComparisonOperator ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2714:1: (lv_operator_1_0= ruleComparisonOperator )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2714:1: (lv_operator_1_0= ruleComparisonOperator )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2715:3: lv_operator_1_0= ruleComparisonOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComparisonOperatorExpressionAccess().getOperatorComparisonOperatorEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleComparisonOperator_in_ruleComparisonOperatorExpression5896);
            lv_operator_1_0=ruleComparisonOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getComparisonOperatorExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_1_0, 
                      		"ComparisonOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2731:2: ( (lv_right_2_0= ruleExpressionTerm ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2732:1: (lv_right_2_0= ruleExpressionTerm )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2732:1: (lv_right_2_0= ruleExpressionTerm )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2733:3: lv_right_2_0= ruleExpressionTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComparisonOperatorExpressionAccess().getRightExpressionTermParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpressionTerm_in_ruleComparisonOperatorExpression5917);
            lv_right_2_0=ruleExpressionTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getComparisonOperatorExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_2_0, 
                      		"ExpressionTerm");
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
    // $ANTLR end "ruleComparisonOperatorExpression"


    // $ANTLR start "entryRuleExistsExpression"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2757:1: entryRuleExistsExpression returns [EObject current=null] : iv_ruleExistsExpression= ruleExistsExpression EOF ;
    public final EObject entryRuleExistsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistsExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2758:2: (iv_ruleExistsExpression= ruleExistsExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2759:2: iv_ruleExistsExpression= ruleExistsExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExistsExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExistsExpression_in_entryRuleExistsExpression5952);
            iv_ruleExistsExpression=ruleExistsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExistsExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExistsExpression5962); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2766:1: ruleExistsExpression returns [EObject current=null] : ( ( (lv_isNot_0_0= KEYWORD_28 ) )? otherlv_1= KEYWORD_54 ( (lv_right_2_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleExistsExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_0_0=null;
        Token otherlv_1=null;
        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2769:28: ( ( ( (lv_isNot_0_0= KEYWORD_28 ) )? otherlv_1= KEYWORD_54 ( (lv_right_2_0= ruleQueryExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2770:1: ( ( (lv_isNot_0_0= KEYWORD_28 ) )? otherlv_1= KEYWORD_54 ( (lv_right_2_0= ruleQueryExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2770:1: ( ( (lv_isNot_0_0= KEYWORD_28 ) )? otherlv_1= KEYWORD_54 ( (lv_right_2_0= ruleQueryExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2770:2: ( (lv_isNot_0_0= KEYWORD_28 ) )? otherlv_1= KEYWORD_54 ( (lv_right_2_0= ruleQueryExpression ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2770:2: ( (lv_isNot_0_0= KEYWORD_28 ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==KEYWORD_28) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2771:1: (lv_isNot_0_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2771:1: (lv_isNot_0_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2772:3: lv_isNot_0_0= KEYWORD_28
                    {
                    lv_isNot_0_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleExistsExpression6006); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isNot_0_0, grammarAccess.getExistsExpressionAccess().getIsNotNOTKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExistsExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "isNot", true, "NOT");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleExistsExpression6031); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExistsExpressionAccess().getEXISTSKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2791:1: ( (lv_right_2_0= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2792:1: (lv_right_2_0= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2792:1: (lv_right_2_0= ruleQueryExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2793:3: lv_right_2_0= ruleQueryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExistsExpressionAccess().getRightQueryExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleExistsExpression6051);
            lv_right_2_0=ruleQueryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExistsExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_2_0, 
                      		"QueryExpression");
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2817:1: entryRuleAllExpression returns [EObject current=null] : iv_ruleAllExpression= ruleAllExpression EOF ;
    public final EObject entryRuleAllExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2818:2: (iv_ruleAllExpression= ruleAllExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2819:2: iv_ruleAllExpression= ruleAllExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAllExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAllExpression_in_entryRuleAllExpression6086);
            iv_ruleAllExpression=ruleAllExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAllExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllExpression6096); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2826:1: ruleAllExpression returns [EObject current=null] : (otherlv_0= KEYWORD_19 ( (lv_right_1_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleAllExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2829:28: ( (otherlv_0= KEYWORD_19 ( (lv_right_1_0= ruleQueryExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2830:1: (otherlv_0= KEYWORD_19 ( (lv_right_1_0= ruleQueryExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2830:1: (otherlv_0= KEYWORD_19 ( (lv_right_1_0= ruleQueryExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2831:2: otherlv_0= KEYWORD_19 ( (lv_right_1_0= ruleQueryExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleAllExpression6134); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAllExpressionAccess().getALLKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2835:1: ( (lv_right_1_0= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2836:1: (lv_right_1_0= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2836:1: (lv_right_1_0= ruleQueryExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2837:3: lv_right_1_0= ruleQueryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAllExpressionAccess().getRightQueryExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleAllExpression6154);
            lv_right_1_0=ruleQueryExpression();

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
                      		"QueryExpression");
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2861:1: entryRuleAnyExpression returns [EObject current=null] : iv_ruleAnyExpression= ruleAnyExpression EOF ;
    public final EObject entryRuleAnyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2862:2: (iv_ruleAnyExpression= ruleAnyExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2863:2: iv_ruleAnyExpression= ruleAnyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAnyExpression_in_entryRuleAnyExpression6189);
            iv_ruleAnyExpression=ruleAnyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnyExpression6199); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2870:1: ruleAnyExpression returns [EObject current=null] : (otherlv_0= KEYWORD_21 ( (lv_right_1_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleAnyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2873:28: ( (otherlv_0= KEYWORD_21 ( (lv_right_1_0= ruleQueryExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2874:1: (otherlv_0= KEYWORD_21 ( (lv_right_1_0= ruleQueryExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2874:1: (otherlv_0= KEYWORD_21 ( (lv_right_1_0= ruleQueryExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2875:2: otherlv_0= KEYWORD_21 ( (lv_right_1_0= ruleQueryExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleAnyExpression6237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnyExpressionAccess().getANYKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2879:1: ( (lv_right_1_0= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2880:1: (lv_right_1_0= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2880:1: (lv_right_1_0= ruleQueryExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2881:3: lv_right_1_0= ruleQueryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnyExpressionAccess().getRightQueryExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleAnyExpression6257);
            lv_right_1_0=ruleQueryExpression();

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
                      		"QueryExpression");
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2905:1: entryRuleSomeExpression returns [EObject current=null] : iv_ruleSomeExpression= ruleSomeExpression EOF ;
    public final EObject entryRuleSomeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSomeExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2906:2: (iv_ruleSomeExpression= ruleSomeExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2907:2: iv_ruleSomeExpression= ruleSomeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSomeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSomeExpression_in_entryRuleSomeExpression6292);
            iv_ruleSomeExpression=ruleSomeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSomeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSomeExpression6302); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2914:1: ruleSomeExpression returns [EObject current=null] : (otherlv_0= KEYWORD_38 ( (lv_right_1_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleSomeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2917:28: ( (otherlv_0= KEYWORD_38 ( (lv_right_1_0= ruleQueryExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2918:1: (otherlv_0= KEYWORD_38 ( (lv_right_1_0= ruleQueryExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2918:1: (otherlv_0= KEYWORD_38 ( (lv_right_1_0= ruleQueryExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2919:2: otherlv_0= KEYWORD_38 ( (lv_right_1_0= ruleQueryExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleSomeExpression6340); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSomeExpressionAccess().getSOMEKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2923:1: ( (lv_right_1_0= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2924:1: (lv_right_1_0= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2924:1: (lv_right_1_0= ruleQueryExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2925:3: lv_right_1_0= ruleQueryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSomeExpressionAccess().getRightQueryExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleSomeExpression6360);
            lv_right_1_0=ruleQueryExpression();

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
                      		"QueryExpression");
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2949:1: entryRuleCollectionExpression returns [EObject current=null] : iv_ruleCollectionExpression= ruleCollectionExpression EOF ;
    public final EObject entryRuleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2950:2: (iv_ruleCollectionExpression= ruleCollectionExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2951:2: iv_ruleCollectionExpression= ruleCollectionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression6395);
            iv_ruleCollectionExpression=ruleCollectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionExpression6405); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2958:1: ruleCollectionExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_58 (otherlv_3= KEYWORD_16 )? ( (lv_right_4_0= ruleAliasAttributeExpression ) ) ) ;
    public final EObject ruleCollectionExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2961:28: ( ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_58 (otherlv_3= KEYWORD_16 )? ( (lv_right_4_0= ruleAliasAttributeExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2962:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_58 (otherlv_3= KEYWORD_16 )? ( (lv_right_4_0= ruleAliasAttributeExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2962:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_58 (otherlv_3= KEYWORD_16 )? ( (lv_right_4_0= ruleAliasAttributeExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2962:2: ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_58 (otherlv_3= KEYWORD_16 )? ( (lv_right_4_0= ruleAliasAttributeExpression ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2962:2: ( (lv_left_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2963:1: (lv_left_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2963:1: (lv_left_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2964:3: lv_left_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionExpressionAccess().getLeftVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleCollectionExpression6451);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2980:2: ( (lv_isNot_1_0= KEYWORD_28 ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==KEYWORD_28) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2981:1: (lv_isNot_1_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2981:1: (lv_isNot_1_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2982:3: lv_isNot_1_0= KEYWORD_28
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleCollectionExpression6470); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleCollectionExpression6495); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCollectionExpressionAccess().getMEMBERKeyword_2());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3001:1: (otherlv_3= KEYWORD_16 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==KEYWORD_16) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3002:2: otherlv_3= KEYWORD_16
                    {
                    otherlv_3=(Token)match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleCollectionExpression6508); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCollectionExpressionAccess().getOFKeyword_3());
                          
                    }

                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3006:3: ( (lv_right_4_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3007:1: (lv_right_4_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3007:1: (lv_right_4_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3008:3: lv_right_4_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionExpressionAccess().getRightAliasAttributeExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleCollectionExpression6530);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3032:1: entryRuleNullComparisonExpression returns [EObject current=null] : iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF ;
    public final EObject entryRuleNullComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullComparisonExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3033:2: (iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3034:2: iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullComparisonExpression_in_entryRuleNullComparisonExpression6565);
            iv_ruleNullComparisonExpression=ruleNullComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullComparisonExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullComparisonExpression6575); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3041:1: ruleNullComparisonExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_36 ) ;
    public final EObject ruleNullComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isNot_2_0=null;
        Token otherlv_3=null;
        EObject lv_left_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3044:28: ( ( ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_36 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3045:1: ( ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_36 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3045:1: ( ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_36 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3045:2: ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_36
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3045:2: ( (lv_left_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3046:1: (lv_left_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3046:1: (lv_left_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3047:3: lv_left_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNullComparisonExpressionAccess().getLeftVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleNullComparisonExpression6621);
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

            otherlv_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleNullComparisonExpression6634); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNullComparisonExpressionAccess().getISKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3068:1: ( (lv_isNot_2_0= KEYWORD_28 ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==KEYWORD_28) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3069:1: (lv_isNot_2_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3069:1: (lv_isNot_2_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3070:3: lv_isNot_2_0= KEYWORD_28
                    {
                    lv_isNot_2_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleNullComparisonExpression6652); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleNullComparisonExpression6677); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3097:1: entryRuleEmptyComparisonExpression returns [EObject current=null] : iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF ;
    public final EObject entryRuleEmptyComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyComparisonExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3098:2: (iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3099:2: iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmptyComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEmptyComparisonExpression_in_entryRuleEmptyComparisonExpression6711);
            iv_ruleEmptyComparisonExpression=ruleEmptyComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmptyComparisonExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmptyComparisonExpression6721); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3106:1: ruleEmptyComparisonExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_42 ) ;
    public final EObject ruleEmptyComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isNot_2_0=null;
        Token otherlv_3=null;
        EObject lv_left_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3109:28: ( ( ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_42 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3110:1: ( ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_42 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3110:1: ( ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_42 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3110:2: ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_42
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3110:2: ( (lv_left_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3111:1: (lv_left_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3111:1: (lv_left_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3112:3: lv_left_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEmptyComparisonExpressionAccess().getLeftVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleEmptyComparisonExpression6767);
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

            otherlv_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleEmptyComparisonExpression6780); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEmptyComparisonExpressionAccess().getISKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3133:1: ( (lv_isNot_2_0= KEYWORD_28 ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==KEYWORD_28) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3134:1: (lv_isNot_2_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3134:1: (lv_isNot_2_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3135:3: lv_isNot_2_0= KEYWORD_28
                    {
                    lv_isNot_2_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleEmptyComparisonExpression6798); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleEmptyComparisonExpression6823); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3162:1: entryRuleLikeExpression returns [EObject current=null] : iv_ruleLikeExpression= ruleLikeExpression EOF ;
    public final EObject entryRuleLikeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLikeExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3163:2: (iv_ruleLikeExpression= ruleLikeExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3164:2: iv_ruleLikeExpression= ruleLikeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLikeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLikeExpression_in_entryRuleLikeExpression6857);
            iv_ruleLikeExpression=ruleLikeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLikeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLikeExpression6867); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3171:1: ruleLikeExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_35 ( (lv_right_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleLikeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        Token lv_right_3_0=null;
        EObject lv_left_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3174:28: ( ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_35 ( (lv_right_3_0= RULE_STRING ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3175:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_35 ( (lv_right_3_0= RULE_STRING ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3175:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_35 ( (lv_right_3_0= RULE_STRING ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3175:2: ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_35 ( (lv_right_3_0= RULE_STRING ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3175:2: ( (lv_left_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3176:1: (lv_left_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3176:1: (lv_left_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3177:3: lv_left_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLikeExpressionAccess().getLeftVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleLikeExpression6913);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3193:2: ( (lv_isNot_1_0= KEYWORD_28 ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==KEYWORD_28) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3194:1: (lv_isNot_1_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3194:1: (lv_isNot_1_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3195:3: lv_isNot_1_0= KEYWORD_28
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleLikeExpression6932); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleLikeExpression6957); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLikeExpressionAccess().getLIKEKeyword_2());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3214:1: ( (lv_right_3_0= RULE_STRING ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3215:1: (lv_right_3_0= RULE_STRING )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3215:1: (lv_right_3_0= RULE_STRING )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3216:3: lv_right_3_0= RULE_STRING
            {
            lv_right_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLikeExpression6973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_right_3_0, grammarAccess.getLikeExpressionAccess().getRightSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLikeExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"right",
                      		lv_right_3_0, 
                      		"STRING");
              	    
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3240:1: entryRuleInExpression returns [EObject current=null] : iv_ruleInExpression= ruleInExpression EOF ;
    public final EObject entryRuleInExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3241:2: (iv_ruleInExpression= ruleInExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3242:2: iv_ruleInExpression= ruleInExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInExpression_in_entryRuleInExpression7013);
            iv_ruleInExpression=ruleInExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInExpression7023); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3249:1: ruleInExpression returns [EObject current=null] : (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression ) ;
    public final EObject ruleInExpression() throws RecognitionException {
        EObject current = null;

        EObject this_InSeqExpression_0 = null;

        EObject this_InQueryExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3252:28: ( (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3253:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3253:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )
            int alt45=2;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3254:2: this_InSeqExpression_0= ruleInSeqExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInExpressionAccess().getInSeqExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInSeqExpression_in_ruleInExpression7073);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3267:2: this_InQueryExpression_1= ruleInQueryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInExpressionAccess().getInQueryExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInQueryExpression_in_ruleInExpression7103);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3286:1: entryRuleInSeqExpression returns [EObject current=null] : iv_ruleInSeqExpression= ruleInSeqExpression EOF ;
    public final EObject entryRuleInSeqExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInSeqExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3287:2: (iv_ruleInSeqExpression= ruleInSeqExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3288:2: iv_ruleInSeqExpression= ruleInSeqExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInSeqExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInSeqExpression_in_entryRuleInSeqExpression7137);
            iv_ruleInSeqExpression=ruleInSeqExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInSeqExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInSeqExpression7147); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3295:1: ruleInSeqExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2 ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3298:28: ( ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3299:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3299:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3299:2: ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3299:2: ( (lv_left_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3300:1: (lv_left_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3300:1: (lv_left_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3301:3: lv_left_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInSeqExpressionAccess().getLeftVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7193);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3317:2: ( (lv_isNot_1_0= KEYWORD_28 ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==KEYWORD_28) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3318:1: (lv_isNot_1_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3318:1: (lv_isNot_1_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3319:3: lv_isNot_1_0= KEYWORD_28
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleInSeqExpression7212); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleInSeqExpression7237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInSeqExpressionAccess().getINKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleInSeqExpression7249); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInSeqExpressionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3343:1: ( (lv_items_4_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3344:1: (lv_items_4_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3344:1: (lv_items_4_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3345:3: lv_items_4_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInSeqExpressionAccess().getItemsVariableParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7269);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3361:2: (otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==KEYWORD_3) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3362:2: otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) )
            	    {
            	    otherlv_5=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleInSeqExpression7283); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getInSeqExpressionAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3366:1: ( (lv_items_6_0= ruleVariable ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3367:1: (lv_items_6_0= ruleVariable )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3367:1: (lv_items_6_0= ruleVariable )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3368:3: lv_items_6_0= ruleVariable
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInSeqExpressionAccess().getItemsVariableParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7303);
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
            	    break loop47;
                }
            } while (true);

            otherlv_7=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleInSeqExpression7318); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3397:1: entryRuleInQueryExpression returns [EObject current=null] : iv_ruleInQueryExpression= ruleInQueryExpression EOF ;
    public final EObject entryRuleInQueryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInQueryExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3398:2: (iv_ruleInQueryExpression= ruleInQueryExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3399:2: iv_ruleInQueryExpression= ruleInQueryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInQueryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInQueryExpression_in_entryRuleInQueryExpression7352);
            iv_ruleInQueryExpression=ruleInQueryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInQueryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInQueryExpression7362); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3406:1: ruleInQueryExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 ( (lv_query_3_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleInQueryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        EObject lv_left_0_0 = null;

        EObject lv_query_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3409:28: ( ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 ( (lv_query_3_0= ruleQueryExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3410:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 ( (lv_query_3_0= ruleQueryExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3410:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 ( (lv_query_3_0= ruleQueryExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3410:2: ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 ( (lv_query_3_0= ruleQueryExpression ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3410:2: ( (lv_left_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3411:1: (lv_left_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3411:1: (lv_left_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3412:3: lv_left_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInQueryExpressionAccess().getLeftVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleInQueryExpression7408);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3428:2: ( (lv_isNot_1_0= KEYWORD_28 ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==KEYWORD_28) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3429:1: (lv_isNot_1_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3429:1: (lv_isNot_1_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3430:3: lv_isNot_1_0= KEYWORD_28
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleInQueryExpression7427); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleInQueryExpression7452); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInQueryExpressionAccess().getINKeyword_2());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3449:1: ( (lv_query_3_0= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3450:1: (lv_query_3_0= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3450:1: (lv_query_3_0= ruleQueryExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3451:3: lv_query_3_0= ruleQueryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInQueryExpressionAccess().getQueryQueryExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleInQueryExpression7472);
            lv_query_3_0=ruleQueryExpression();

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
                      		"QueryExpression");
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3475:1: entryRuleBetweenExpression returns [EObject current=null] : iv_ruleBetweenExpression= ruleBetweenExpression EOF ;
    public final EObject entryRuleBetweenExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBetweenExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3476:2: (iv_ruleBetweenExpression= ruleBetweenExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3477:2: iv_ruleBetweenExpression= ruleBetweenExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBetweenExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBetweenExpression_in_entryRuleBetweenExpression7507);
            iv_ruleBetweenExpression=ruleBetweenExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBetweenExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBetweenExpression7517); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3484:1: ruleBetweenExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_61 ( (lv_min_3_0= ruleValue ) ) otherlv_4= KEYWORD_20 ( (lv_max_5_0= ruleValue ) ) ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3487:28: ( ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_61 ( (lv_min_3_0= ruleValue ) ) otherlv_4= KEYWORD_20 ( (lv_max_5_0= ruleValue ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3488:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_61 ( (lv_min_3_0= ruleValue ) ) otherlv_4= KEYWORD_20 ( (lv_max_5_0= ruleValue ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3488:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_61 ( (lv_min_3_0= ruleValue ) ) otherlv_4= KEYWORD_20 ( (lv_max_5_0= ruleValue ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3488:2: ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_61 ( (lv_min_3_0= ruleValue ) ) otherlv_4= KEYWORD_20 ( (lv_max_5_0= ruleValue ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3488:2: ( (lv_left_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3489:1: (lv_left_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3489:1: (lv_left_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3490:3: lv_left_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBetweenExpressionAccess().getLeftVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleBetweenExpression7563);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3506:2: ( (lv_isNot_1_0= KEYWORD_28 ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==KEYWORD_28) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3507:1: (lv_isNot_1_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3507:1: (lv_isNot_1_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3508:3: lv_isNot_1_0= KEYWORD_28
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleBetweenExpression7582); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleBetweenExpression7607); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBetweenExpressionAccess().getBETWEENKeyword_2());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3527:1: ( (lv_min_3_0= ruleValue ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3528:1: (lv_min_3_0= ruleValue )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3528:1: (lv_min_3_0= ruleValue )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3529:3: lv_min_3_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBetweenExpressionAccess().getMinValueParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleBetweenExpression7627);
            lv_min_3_0=ruleValue();

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
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleBetweenExpression7640); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBetweenExpressionAccess().getANDKeyword_4());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3550:1: ( (lv_max_5_0= ruleValue ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3551:1: (lv_max_5_0= ruleValue )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3551:1: (lv_max_5_0= ruleValue )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3552:3: lv_max_5_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBetweenExpressionAccess().getMaxValueParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleBetweenExpression7660);
            lv_max_5_0=ruleValue();

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
                      		"Value");
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3576:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3577:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3578:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable7695);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable7705); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3585:1: ruleVariable returns [EObject current=null] : (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_AliasAttributeExpression_0 = null;

        EObject this_ParameterExpression_1 = null;

        EObject this_Value_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3588:28: ( (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3589:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3589:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue )
            int alt50=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt50=1;
                }
                break;
            case KEYWORD_5:
                {
                alt50=2;
                }
                break;
            case KEYWORD_43:
            case KEYWORD_36:
            case KEYWORD_40:
            case RULE_INT:
            case RULE_STRING:
                {
                alt50=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3590:2: this_AliasAttributeExpression_0= ruleAliasAttributeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccess().getAliasAttributeExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleVariable7755);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3603:2: this_ParameterExpression_1= ruleParameterExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccess().getParameterExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameterExpression_in_ruleVariable7785);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3616:2: this_Value_2= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccess().getValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleVariable7815);
                    this_Value_2=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_Value_2;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3635:1: entryRuleExpressionTerm returns [EObject current=null] : iv_ruleExpressionTerm= ruleExpressionTerm EOF ;
    public final EObject entryRuleExpressionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionTerm = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3636:2: (iv_ruleExpressionTerm= ruleExpressionTerm EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3637:2: iv_ruleExpressionTerm= ruleExpressionTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionTermRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionTerm_in_entryRuleExpressionTerm7849);
            iv_ruleExpressionTerm=ruleExpressionTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionTerm7859); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3644:1: ruleExpressionTerm returns [EObject current=null] : (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression ) ;
    public final EObject ruleExpressionTerm() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_QueryExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3647:28: ( (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3648:1: (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3648:1: (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==KEYWORD_43||LA51_0==KEYWORD_36||LA51_0==KEYWORD_40||LA51_0==KEYWORD_5||(LA51_0>=RULE_ID && LA51_0<=RULE_STRING)) ) {
                alt51=1;
            }
            else if ( (LA51_0==KEYWORD_1) ) {
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3649:2: this_Variable_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionTermAccess().getVariableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleExpressionTerm7909);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3662:2: this_QueryExpression_1= ruleQueryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionTermAccess().getQueryExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQueryExpression_in_ruleExpressionTerm7939);
                    this_QueryExpression_1=ruleQueryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_QueryExpression_1;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3681:1: entryRuleAliasAttributeExpression returns [EObject current=null] : iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF ;
    public final EObject entryRuleAliasAttributeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasAttributeExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3682:2: (iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3683:2: iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAliasAttributeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_entryRuleAliasAttributeExpression7973);
            iv_ruleAliasAttributeExpression=ruleAliasAttributeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAliasAttributeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAliasAttributeExpression7983); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3690:1: ruleAliasAttributeExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleAliasAttributeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_attributes_2_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3693:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3694:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3694:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3694:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )*
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3694:2: ( (otherlv_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3695:1: (otherlv_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3695:1: (otherlv_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3696:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAliasAttributeExpressionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8032); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getAliasAttributeExpressionAccess().getAliasVariableDeclarationCrossReference_0_0()); 
              	
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3710:2: (otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==KEYWORD_4) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3711:2: otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleAliasAttributeExpression8046); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getAliasAttributeExpressionAccess().getFullStopKeyword_1_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3715:1: ( (lv_attributes_2_0= RULE_ID ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3716:1: (lv_attributes_2_0= RULE_ID )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3716:1: (lv_attributes_2_0= RULE_ID )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3717:3: lv_attributes_2_0= RULE_ID
            	    {
            	    lv_attributes_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8062); if (state.failed) return current;
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
    // $ANTLR end "ruleAliasAttributeExpression"


    // $ANTLR start "entryRuleParameterExpression"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3741:1: entryRuleParameterExpression returns [EObject current=null] : iv_ruleParameterExpression= ruleParameterExpression EOF ;
    public final EObject entryRuleParameterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3742:2: (iv_ruleParameterExpression= ruleParameterExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3743:2: iv_ruleParameterExpression= ruleParameterExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParameterExpression_in_entryRuleParameterExpression8104);
            iv_ruleParameterExpression=ruleParameterExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterExpression8114); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3750:1: ruleParameterExpression returns [EObject current=null] : (otherlv_0= KEYWORD_5 ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameterExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3753:28: ( (otherlv_0= KEYWORD_5 ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3754:1: (otherlv_0= KEYWORD_5 ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3754:1: (otherlv_0= KEYWORD_5 ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3755:2: otherlv_0= KEYWORD_5 ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleParameterExpression8152); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParameterExpressionAccess().getColonKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3759:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3760:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3760:1: (lv_name_1_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3761:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterExpression8168); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getParameterExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterExpressionRule());
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
    // $ANTLR end "ruleParameterExpression"


    // $ANTLR start "entryRuleStringFunction"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3787:1: entryRuleStringFunction returns [EObject current=null] : iv_ruleStringFunction= ruleStringFunction EOF ;
    public final EObject entryRuleStringFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringFunction = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3788:2: (iv_ruleStringFunction= ruleStringFunction EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3789:2: iv_ruleStringFunction= ruleStringFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleStringFunction_in_entryRuleStringFunction8210);
            iv_ruleStringFunction=ruleStringFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunction8220); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringFunction"


    // $ANTLR start "ruleStringFunction"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3796:1: ruleStringFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 ) ;
    public final EObject ruleStringFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3799:28: ( ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3800:1: ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3800:1: ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3800:2: ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3800:2: ( (lv_name_0_0= ruleStringFunctionName ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3801:1: (lv_name_0_0= ruleStringFunctionName )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3801:1: (lv_name_0_0= ruleStringFunctionName )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3802:3: lv_name_0_0= ruleStringFunctionName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringFunctionAccess().getNameStringFunctionNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStringFunctionName_in_ruleStringFunction8266);
            lv_name_0_0=ruleStringFunctionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStringFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"StringFunctionName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleStringFunction8279); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStringFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3823:1: ( (lv_params_2_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3824:1: (lv_params_2_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3824:1: (lv_params_2_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3825:3: lv_params_2_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringFunctionAccess().getParamsVariableParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleStringFunction8299);
            lv_params_2_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStringFunctionRule());
              	        }
                     		add(
                     			current, 
                     			"params",
                      		lv_params_2_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3841:2: (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3842:2: otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) )
            {
            otherlv_3=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleStringFunction8313); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getStringFunctionAccess().getCommaKeyword_3_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3846:1: ( (lv_params_4_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3847:1: (lv_params_4_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3847:1: (lv_params_4_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3848:3: lv_params_4_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringFunctionAccess().getParamsVariableParserRuleCall_3_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleStringFunction8333);
            lv_params_4_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStringFunctionRule());
              	        }
                     		add(
                     			current, 
                     			"params",
                      		lv_params_4_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            otherlv_5=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleStringFunction8347); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleStringFunction"


    // $ANTLR start "entryRuleStringFunctionName"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3877:1: entryRuleStringFunctionName returns [String current=null] : iv_ruleStringFunctionName= ruleStringFunctionName EOF ;
    public final String entryRuleStringFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringFunctionName = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3878:1: (iv_ruleStringFunctionName= ruleStringFunctionName EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3879:2: iv_ruleStringFunctionName= ruleStringFunctionName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringFunctionNameRule()); 
            }
            pushFollow(FOLLOW_ruleStringFunctionName_in_entryRuleStringFunctionName8382);
            iv_ruleStringFunctionName=ruleStringFunctionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringFunctionName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunctionName8393); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringFunctionName"


    // $ANTLR start "ruleStringFunctionName"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3886:1: ruleStringFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_52 | kw= KEYWORD_63 | kw= KEYWORD_47 | kw= KEYWORD_50 | kw= KEYWORD_56 | kw= KEYWORD_57 ) ;
    public final AntlrDatatypeRuleToken ruleStringFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3890:6: ( (kw= KEYWORD_52 | kw= KEYWORD_63 | kw= KEYWORD_47 | kw= KEYWORD_50 | kw= KEYWORD_56 | kw= KEYWORD_57 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3891:1: (kw= KEYWORD_52 | kw= KEYWORD_63 | kw= KEYWORD_47 | kw= KEYWORD_50 | kw= KEYWORD_56 | kw= KEYWORD_57 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3891:1: (kw= KEYWORD_52 | kw= KEYWORD_63 | kw= KEYWORD_47 | kw= KEYWORD_50 | kw= KEYWORD_56 | kw= KEYWORD_57 )
            int alt53=6;
            switch ( input.LA(1) ) {
            case KEYWORD_52:
                {
                alt53=1;
                }
                break;
            case KEYWORD_63:
                {
                alt53=2;
                }
                break;
            case KEYWORD_47:
                {
                alt53=3;
                }
                break;
            case KEYWORD_50:
                {
                alt53=4;
                }
                break;
            case KEYWORD_56:
                {
                alt53=5;
                }
                break;
            case KEYWORD_57:
                {
                alt53=6;
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3892:2: kw= KEYWORD_52
                    {
                    kw=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleStringFunctionName8431); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getCONCATKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3899:2: kw= KEYWORD_63
                    {
                    kw=(Token)match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleStringFunctionName8450); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getSUBSTRINGKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3906:2: kw= KEYWORD_47
                    {
                    kw=(Token)match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleStringFunctionName8469); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getLOWERKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3913:2: kw= KEYWORD_50
                    {
                    kw=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleStringFunctionName8488); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getUPPERKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3920:2: kw= KEYWORD_56
                    {
                    kw=(Token)match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleStringFunctionName8507); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getLENGTHKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3927:2: kw= KEYWORD_57
                    {
                    kw=(Token)match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleStringFunctionName8526); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getLOCATEKeyword_5()); 
                          
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
    // $ANTLR end "ruleStringFunctionName"


    // $ANTLR start "entryRuleNumericFunction"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3940:1: entryRuleNumericFunction returns [EObject current=null] : iv_ruleNumericFunction= ruleNumericFunction EOF ;
    public final EObject entryRuleNumericFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericFunction = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3941:2: (iv_ruleNumericFunction= ruleNumericFunction EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3942:2: iv_ruleNumericFunction= ruleNumericFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericFunction_in_entryRuleNumericFunction8565);
            iv_ruleNumericFunction=ruleNumericFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericFunction8575); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericFunction"


    // $ANTLR start "ruleNumericFunction"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3949:1: ruleNumericFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 ) ;
    public final EObject ruleNumericFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3952:28: ( ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3953:1: ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3953:1: ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3953:2: ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3953:2: ( (lv_name_0_0= ruleNumericFunctionName ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3954:1: (lv_name_0_0= ruleNumericFunctionName )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3954:1: (lv_name_0_0= ruleNumericFunctionName )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3955:3: lv_name_0_0= ruleNumericFunctionName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumericFunctionAccess().getNameNumericFunctionNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumericFunctionName_in_ruleNumericFunction8621);
            lv_name_0_0=ruleNumericFunctionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumericFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"NumericFunctionName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleNumericFunction8634); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNumericFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3976:1: ( (lv_params_2_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3977:1: (lv_params_2_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3977:1: (lv_params_2_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3978:3: lv_params_2_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumericFunctionAccess().getParamsVariableParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleNumericFunction8654);
            lv_params_2_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumericFunctionRule());
              	        }
                     		add(
                     			current, 
                     			"params",
                      		lv_params_2_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3994:2: (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3995:2: otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) )
            {
            otherlv_3=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleNumericFunction8668); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getNumericFunctionAccess().getCommaKeyword_3_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3999:1: ( (lv_params_4_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4000:1: (lv_params_4_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4000:1: (lv_params_4_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4001:3: lv_params_4_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumericFunctionAccess().getParamsVariableParserRuleCall_3_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleNumericFunction8688);
            lv_params_4_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumericFunctionRule());
              	        }
                     		add(
                     			current, 
                     			"params",
                      		lv_params_4_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            otherlv_5=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleNumericFunction8702); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getNumericFunctionAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleNumericFunction"


    // $ANTLR start "entryRuleNumericFunctionName"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4030:1: entryRuleNumericFunctionName returns [String current=null] : iv_ruleNumericFunctionName= ruleNumericFunctionName EOF ;
    public final String entryRuleNumericFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumericFunctionName = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4031:1: (iv_ruleNumericFunctionName= ruleNumericFunctionName EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4032:2: iv_ruleNumericFunctionName= ruleNumericFunctionName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericFunctionNameRule()); 
            }
            pushFollow(FOLLOW_ruleNumericFunctionName_in_entryRuleNumericFunctionName8737);
            iv_ruleNumericFunctionName=ruleNumericFunctionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericFunctionName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericFunctionName8748); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericFunctionName"


    // $ANTLR start "ruleNumericFunctionName"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4039:1: ruleNumericFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_18 | kw= KEYWORD_39 | kw= KEYWORD_26 | kw= KEYWORD_37 ) ;
    public final AntlrDatatypeRuleToken ruleNumericFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4043:6: ( (kw= KEYWORD_18 | kw= KEYWORD_39 | kw= KEYWORD_26 | kw= KEYWORD_37 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4044:1: (kw= KEYWORD_18 | kw= KEYWORD_39 | kw= KEYWORD_26 | kw= KEYWORD_37 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4044:1: (kw= KEYWORD_18 | kw= KEYWORD_39 | kw= KEYWORD_26 | kw= KEYWORD_37 )
            int alt54=4;
            switch ( input.LA(1) ) {
            case KEYWORD_18:
                {
                alt54=1;
                }
                break;
            case KEYWORD_39:
                {
                alt54=2;
                }
                break;
            case KEYWORD_26:
                {
                alt54=3;
                }
                break;
            case KEYWORD_37:
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4045:2: kw= KEYWORD_18
                    {
                    kw=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleNumericFunctionName8786); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumericFunctionNameAccess().getABSKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4052:2: kw= KEYWORD_39
                    {
                    kw=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleNumericFunctionName8805); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumericFunctionNameAccess().getSQRTKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4059:2: kw= KEYWORD_26
                    {
                    kw=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleNumericFunctionName8824); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumericFunctionNameAccess().getMODKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4066:2: kw= KEYWORD_37
                    {
                    kw=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleNumericFunctionName8843); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumericFunctionNameAccess().getSIZEKeyword_3()); 
                          
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
    // $ANTLR end "ruleNumericFunctionName"


    // $ANTLR start "entryRuleValue"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4081:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4082:2: (iv_ruleValue= ruleValue EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4083:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue8884);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue8894); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4090:1: ruleValue returns [EObject current=null] : (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerExpression_0 = null;

        EObject this_StringExpression_1 = null;

        EObject this_NullExpression_2 = null;

        EObject this_BooleanExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4093:28: ( (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4094:1: (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4094:1: (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression )
            int alt55=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt55=1;
                }
                break;
            case RULE_STRING:
                {
                alt55=2;
                }
                break;
            case KEYWORD_36:
                {
                alt55=3;
                }
                break;
            case KEYWORD_43:
            case KEYWORD_40:
                {
                alt55=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4095:2: this_IntegerExpression_0= ruleIntegerExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getIntegerExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerExpression_in_ruleValue8944);
                    this_IntegerExpression_0=ruleIntegerExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_IntegerExpression_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4108:2: this_StringExpression_1= ruleStringExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getStringExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringExpression_in_ruleValue8974);
                    this_StringExpression_1=ruleStringExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_StringExpression_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4121:2: this_NullExpression_2= ruleNullExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getNullExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullExpression_in_ruleValue9004);
                    this_NullExpression_2=ruleNullExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_NullExpression_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4134:2: this_BooleanExpression_3= ruleBooleanExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getBooleanExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleValue9034);
                    this_BooleanExpression_3=ruleBooleanExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BooleanExpression_3;
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleIntegerExpression"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4153:1: entryRuleIntegerExpression returns [EObject current=null] : iv_ruleIntegerExpression= ruleIntegerExpression EOF ;
    public final EObject entryRuleIntegerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4154:2: (iv_ruleIntegerExpression= ruleIntegerExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4155:2: iv_ruleIntegerExpression= ruleIntegerExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerExpression_in_entryRuleIntegerExpression9068);
            iv_ruleIntegerExpression=ruleIntegerExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerExpression9078); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerExpression"


    // $ANTLR start "ruleIntegerExpression"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4162:1: ruleIntegerExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4165:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4166:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4166:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4167:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4167:1: (lv_value_0_0= RULE_INT )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4168:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerExpression9119); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getIntegerExpressionAccess().getValueINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntegerExpressionRule());
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
    // $ANTLR end "ruleIntegerExpression"


    // $ANTLR start "entryRuleStringExpression"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4192:1: entryRuleStringExpression returns [EObject current=null] : iv_ruleStringExpression= ruleStringExpression EOF ;
    public final EObject entryRuleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4193:2: (iv_ruleStringExpression= ruleStringExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4194:2: iv_ruleStringExpression= ruleStringExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleStringExpression_in_entryRuleStringExpression9158);
            iv_ruleStringExpression=ruleStringExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringExpression9168); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringExpression"


    // $ANTLR start "ruleStringExpression"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4201:1: ruleStringExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4204:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4205:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4205:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4206:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4206:1: (lv_value_0_0= RULE_STRING )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4207:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringExpression9209); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getStringExpressionAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringExpressionRule());
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
    // $ANTLR end "ruleStringExpression"


    // $ANTLR start "entryRuleNullExpression"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4231:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4232:2: (iv_ruleNullExpression= ruleNullExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4233:2: iv_ruleNullExpression= ruleNullExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullExpression_in_entryRuleNullExpression9248);
            iv_ruleNullExpression=ruleNullExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullExpression9258); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullExpression"


    // $ANTLR start "ruleNullExpression"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4240:1: ruleNullExpression returns [EObject current=null] : ( (lv_value_0_0= KEYWORD_36 ) ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4243:28: ( ( (lv_value_0_0= KEYWORD_36 ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4244:1: ( (lv_value_0_0= KEYWORD_36 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4244:1: ( (lv_value_0_0= KEYWORD_36 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4245:1: (lv_value_0_0= KEYWORD_36 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4245:1: (lv_value_0_0= KEYWORD_36 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4246:3: lv_value_0_0= KEYWORD_36
            {
            lv_value_0_0=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleNullExpression9301); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_value_0_0, grammarAccess.getNullExpressionAccess().getValueNULLKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNullExpressionRule());
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
    // $ANTLR end "ruleNullExpression"


    // $ANTLR start "entryRuleBooleanExpression"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4268:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4269:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4270:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression9346);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression9356); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4277:1: ruleBooleanExpression returns [EObject current=null] : ( ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) ) ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4280:28: ( ( ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4281:1: ( ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4281:1: ( ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4282:1: ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4282:1: ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4283:1: (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4283:1: (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==KEYWORD_40) ) {
                alt56=1;
            }
            else if ( (LA56_0==KEYWORD_43) ) {
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4284:3: lv_value_0_1= KEYWORD_40
                    {
                    lv_value_0_1=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleBooleanExpression9401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_0_1, grammarAccess.getBooleanExpressionAccess().getValueTRUEKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "value", true, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4297:8: lv_value_0_2= KEYWORD_43
                    {
                    lv_value_0_2=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleBooleanExpression9429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_0_2, grammarAccess.getBooleanExpressionAccess().getValueFALSEKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "value", true, null);
                      	    
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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleQueryExpression"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4321:1: entryRuleQueryExpression returns [EObject current=null] : iv_ruleQueryExpression= ruleQueryExpression EOF ;
    public final EObject entryRuleQueryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4322:2: (iv_ruleQueryExpression= ruleQueryExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4323:2: iv_ruleQueryExpression= ruleQueryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQueryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_entryRuleQueryExpression9477);
            iv_ruleQueryExpression=ruleQueryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQueryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryExpression9487); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQueryExpression"


    // $ANTLR start "ruleQueryExpression"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4330:1: ruleQueryExpression returns [EObject current=null] : (otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2 ) ;
    public final EObject ruleQueryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_SelectStatement_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4333:28: ( (otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4334:1: (otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4334:1: (otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4335:2: otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleQueryExpression9525); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQueryExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQueryExpressionAccess().getSelectStatementParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleQueryExpression9549);
            this_SelectStatement_1=ruleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_SelectStatement_1;
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleQueryExpression9561); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getQueryExpressionAccess().getRightParenthesisKeyword_2());
                  
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
    // $ANTLR end "ruleQueryExpression"


    // $ANTLR start "ruleOrderByDirection"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4364:1: ruleOrderByDirection returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_22 ) | (enumLiteral_1= KEYWORD_31 ) ) ;
    public final Enumerator ruleOrderByDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4366:28: ( ( (enumLiteral_0= KEYWORD_22 ) | (enumLiteral_1= KEYWORD_31 ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4367:1: ( (enumLiteral_0= KEYWORD_22 ) | (enumLiteral_1= KEYWORD_31 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4367:1: ( (enumLiteral_0= KEYWORD_22 ) | (enumLiteral_1= KEYWORD_31 ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==KEYWORD_22) ) {
                alt57=1;
            }
            else if ( (LA57_0==KEYWORD_31) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4367:2: (enumLiteral_0= KEYWORD_22 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4367:2: (enumLiteral_0= KEYWORD_22 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4367:7: enumLiteral_0= KEYWORD_22
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleOrderByDirection9613); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOrderByDirectionAccess().getAscEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOrderByDirectionAccess().getAscEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4373:6: (enumLiteral_1= KEYWORD_31 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4373:6: (enumLiteral_1= KEYWORD_31 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4373:11: enumLiteral_1= KEYWORD_31
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleOrderByDirection9635); if (state.failed) return current;
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


    // $ANTLR start "ruleComparisonOperator"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4383:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_8 ) | (enumLiteral_2= KEYWORD_9 ) | (enumLiteral_3= KEYWORD_11 ) | (enumLiteral_4= KEYWORD_7 ) | (enumLiteral_5= KEYWORD_10 ) ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4385:28: ( ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_8 ) | (enumLiteral_2= KEYWORD_9 ) | (enumLiteral_3= KEYWORD_11 ) | (enumLiteral_4= KEYWORD_7 ) | (enumLiteral_5= KEYWORD_10 ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4386:1: ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_8 ) | (enumLiteral_2= KEYWORD_9 ) | (enumLiteral_3= KEYWORD_11 ) | (enumLiteral_4= KEYWORD_7 ) | (enumLiteral_5= KEYWORD_10 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4386:1: ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_8 ) | (enumLiteral_2= KEYWORD_9 ) | (enumLiteral_3= KEYWORD_11 ) | (enumLiteral_4= KEYWORD_7 ) | (enumLiteral_5= KEYWORD_10 ) )
            int alt58=6;
            switch ( input.LA(1) ) {
            case KEYWORD_6:
                {
                alt58=1;
                }
                break;
            case KEYWORD_8:
                {
                alt58=2;
                }
                break;
            case KEYWORD_9:
                {
                alt58=3;
                }
                break;
            case KEYWORD_11:
                {
                alt58=4;
                }
                break;
            case KEYWORD_7:
                {
                alt58=5;
                }
                break;
            case KEYWORD_10:
                {
                alt58=6;
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4386:2: (enumLiteral_0= KEYWORD_6 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4386:2: (enumLiteral_0= KEYWORD_6 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4386:7: enumLiteral_0= KEYWORD_6
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleComparisonOperator9685); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getLessThenEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getLessThenEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4392:6: (enumLiteral_1= KEYWORD_8 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4392:6: (enumLiteral_1= KEYWORD_8 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4392:11: enumLiteral_1= KEYWORD_8
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleComparisonOperator9707); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getGreaterThenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getGreaterThenEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4398:6: (enumLiteral_2= KEYWORD_9 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4398:6: (enumLiteral_2= KEYWORD_9 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4398:11: enumLiteral_2= KEYWORD_9
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleComparisonOperator9729); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getLessEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getLessEqualEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4404:6: (enumLiteral_3= KEYWORD_11 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4404:6: (enumLiteral_3= KEYWORD_11 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4404:11: enumLiteral_3= KEYWORD_11
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleComparisonOperator9751); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4410:6: (enumLiteral_4= KEYWORD_7 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4410:6: (enumLiteral_4= KEYWORD_7 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4410:11: enumLiteral_4= KEYWORD_7
                    {
                    enumLiteral_4=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleComparisonOperator9773); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4416:6: (enumLiteral_5= KEYWORD_10 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4416:6: (enumLiteral_5= KEYWORD_10 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4416:11: enumLiteral_5= KEYWORD_10
                    {
                    enumLiteral_5=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleComparisonOperator9795); if (state.failed) return current;
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
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA45 dfa45 = new DFA45(this);
    static final String DFA26_eotS =
        "\6\uffff";
    static final String DFA26_eofS =
        "\1\uffff\1\3\3\uffff\1\3";
    static final String DFA26_minS =
        "\1\106\1\27\1\106\2\uffff\1\27";
    static final String DFA26_maxS =
        "\3\106\2\uffff\1\106";
    static final String DFA26_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA26_specialS =
        "\6\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1",
            "\1\3\2\uffff\1\3\2\uffff\1\3\25\uffff\1\3\4\uffff\1\4\6\uffff"+
            "\2\3\1\2\4\uffff\1\4",
            "\1\5",
            "",
            "",
            "\1\3\2\uffff\1\3\2\uffff\1\3\25\uffff\1\3\4\uffff\1\4\6\uffff"+
            "\2\3\1\2\4\uffff\1\4"
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
    static final String DFA38_eotS =
        "\32\uffff";
    static final String DFA38_eofS =
        "\32\uffff";
    static final String DFA38_minS =
        "\1\14\1\uffff\1\11\1\106\5\11\4\uffff\1\106\1\24\1\uffff\1\11\4"+
        "\uffff\2\11\1\24\2\uffff";
    static final String DFA38_maxS =
        "\1\110\1\uffff\1\105\1\106\5\105\4\uffff\1\106\1\62\1\uffff\1\72"+
        "\4\uffff\2\105\1\43\2\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\1\7\uffff\1\3\1\4\1\5\1\6\2\uffff\1\2\1\uffff\1\13\1"+
        "\7\1\12\1\14\3\uffff\1\11\1\10";
    static final String DFA38_specialS =
        "\32\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\11\10\uffff\1\10\15\uffff\1\6\1\uffff\1\14\1\uffff\1\7\1"+
            "\uffff\1\12\1\uffff\1\13\6\uffff\1\11\13\uffff\1\1\3\uffff\1"+
            "\3\3\uffff\1\2\1\4\1\5",
            "",
            "\1\24\6\uffff\1\22\21\uffff\1\23\17\uffff\1\20\2\uffff\3\17"+
            "\2\uffff\1\21\1\16\5\uffff\1\15\1\uffff\3\17",
            "\1\25",
            "\1\24\6\uffff\1\22\21\uffff\1\23\17\uffff\1\20\2\uffff\3\17"+
            "\2\uffff\1\21\1\16\7\uffff\3\17",
            "\1\24\6\uffff\1\22\21\uffff\1\23\17\uffff\1\20\2\uffff\3\17"+
            "\2\uffff\1\21\1\16\7\uffff\3\17",
            "\1\24\6\uffff\1\22\21\uffff\1\23\17\uffff\1\20\2\uffff\3\17"+
            "\2\uffff\1\21\1\16\7\uffff\3\17",
            "\1\24\6\uffff\1\22\21\uffff\1\23\17\uffff\1\20\2\uffff\3\17"+
            "\2\uffff\1\21\1\16\7\uffff\3\17",
            "\1\24\6\uffff\1\22\21\uffff\1\23\17\uffff\1\20\2\uffff\3\17"+
            "\2\uffff\1\21\1\16\7\uffff\3\17",
            "",
            "",
            "",
            "",
            "\1\26",
            "\1\30\16\uffff\1\31\16\uffff\1\27",
            "",
            "\1\24\6\uffff\1\22\21\uffff\1\23\27\uffff\1\21",
            "",
            "",
            "",
            "",
            "\1\24\6\uffff\1\22\21\uffff\1\23\17\uffff\1\20\2\uffff\3\17"+
            "\2\uffff\1\21\1\16\7\uffff\3\17",
            "\1\24\6\uffff\1\22\21\uffff\1\23\17\uffff\1\20\2\uffff\3\17"+
            "\2\uffff\1\21\1\16\5\uffff\1\15\1\uffff\3\17",
            "\1\30\16\uffff\1\31",
            "",
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "2476:1: (this_ParExpression_0= ruleParExpression | this_ComparisonOperatorExpression_1= ruleComparisonOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression )";
        }
    }
    static final String DFA45_eotS =
        "\20\uffff";
    static final String DFA45_eofS =
        "\20\uffff";
    static final String DFA45_minS =
        "\1\25\1\62\1\106\5\62\1\106\1\72\1\76\2\62\1\21\2\uffff";
    static final String DFA45_maxS =
        "\1\110\1\101\1\106\5\72\1\106\1\72\1\76\1\72\1\101\1\110\2\uffff";
    static final String DFA45_acceptS =
        "\16\uffff\1\2\1\1";
    static final String DFA45_specialS =
        "\20\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\7\15\uffff\1\5\3\uffff\1\6\32\uffff\1\2\3\uffff\1\1\1\3\1"+
            "\4",
            "\1\11\7\uffff\1\12\6\uffff\1\10",
            "\1\13",
            "\1\11\7\uffff\1\12",
            "\1\11\7\uffff\1\12",
            "\1\11\7\uffff\1\12",
            "\1\11\7\uffff\1\12",
            "\1\11\7\uffff\1\12",
            "\1\14",
            "\1\12",
            "\1\15",
            "\1\11\7\uffff\1\12",
            "\1\11\7\uffff\1\12\6\uffff\1\10",
            "\1\16\3\uffff\1\17\11\uffff\1\16\3\uffff\1\17\3\uffff\1\17"+
            "\32\uffff\1\17\3\uffff\3\17",
            "",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "3253:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleJPQLQuery_in_entryRuleJPQLQuery73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJPQLQuery83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleJPQLQuery133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_ruleJPQLQuery163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_ruleJPQLQuery193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectStatement237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_ruleSelectStatement283 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleFromClause_in_ruleSelectStatement305 = new BitSet(new long[]{0x0000000024800002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleSelectStatement326 = new BitSet(new long[]{0x0000000004800002L});
    public static final BitSet FOLLOW_ruleGroupByClause_in_ruleSelectStatement348 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOrderByClause_in_ruleSelectStatement370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupByClause_in_entryRuleGroupByClause406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupByClause416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleGroupByClause454 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleGroupByClause466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleGroupByClause486 = new BitSet(new long[]{0x0000000000002002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleGroupByClause500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleGroupByClause520 = new BitSet(new long[]{0x0000000000002002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleHavingClause_in_ruleGroupByClause543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_entryRuleHavingClause579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingClause589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleHavingClause627 = new BitSet(new long[]{0x40040AA800201000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleHavingClause647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderByClause_in_entryRuleOrderByClause682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderByClause692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleOrderByClause730 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleOrderByClause742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_ruleOrderByClause762 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleOrderByClause776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_ruleOrderByClause796 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_entryRuleOrderBySpec833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderBySpec843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleOrderBySpec893 = new BitSet(new long[]{0x0000100040000000L});
    public static final BitSet FOLLOW_ruleOrderByDirection_in_ruleOrderBySpec913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateClause_in_ruleUpdateStatement1004 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleSetClause_in_ruleUpdateStatement1025 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleUpdateStatement1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateClause_in_entryRuleUpdateClause1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateClause1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleUpdateClause1130 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleUpdateClause1150 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleUpdateClause1164 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleUpdateClause1184 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleSetClause_in_entryRuleSetClause1221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetClause1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleSetClause1269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_ruleSetClause1289 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSetClause1303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_ruleSetClause1323 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_entryRuleUpdateItem1360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateItem1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleUpdateItem1416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleUpdateItem1429 = new BitSet(new long[]{0x0000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleValue_in_ruleUpdateItem1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement1484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteStatement1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteClause_in_ruleDeleteStatement1540 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleDeleteStatement1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteClause_in_entryRuleDeleteClause1597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteClause1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleDeleteClause1645 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleFromClause_in_ruleDeleteClause1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_entryRuleSelectClause1700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectClause1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_ruleSelectClause1748 = new BitSet(new long[]{0x0012E00000080100L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleSelectClause1766 = new BitSet(new long[]{0x0012E00000080100L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectClause1799 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSelectClause1813 = new BitSet(new long[]{0x0012E00000080100L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectClause1833 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression1870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectExpression1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectExpression1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAggregateExpression_in_ruleSelectExpression1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstructorExpression_in_ruleSelectExpression1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAggregateExpression_in_entryRuleSelectAggregateExpression2024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectAggregateExpression2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgAggregate_in_ruleSelectAggregateExpression2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxAggregate_in_ruleSelectAggregateExpression2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinAggregate_in_ruleSelectAggregateExpression2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumAggregate_in_ruleSelectAggregateExpression2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountAggregate_in_ruleSelectAggregateExpression2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgAggregate_in_entryRuleAvgAggregate2238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvgAggregate2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleAvgAggregate2286 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleAvgAggregate2298 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleAvgAggregate2316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleAvgAggregate2349 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleAvgAggregate2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxAggregate_in_entryRuleMaxAggregate2396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxAggregate2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleMaxAggregate2444 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleMaxAggregate2456 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleMaxAggregate2474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleMaxAggregate2507 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleMaxAggregate2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinAggregate_in_entryRuleMinAggregate2554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinAggregate2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleMinAggregate2602 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleMinAggregate2614 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleMinAggregate2632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleMinAggregate2665 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleMinAggregate2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumAggregate_in_entryRuleSumAggregate2712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumAggregate2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleSumAggregate2760 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleSumAggregate2772 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleSumAggregate2790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSumAggregate2823 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSumAggregate2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountAggregate_in_entryRuleCountAggregate2870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCountAggregate2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleCountAggregate2918 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleCountAggregate2930 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleCountAggregate2948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleCountAggregate2981 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleCountAggregate2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstructorExpression_in_entryRuleSelectConstructorExpression3028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectConstructorExpression3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleSelectConstructorExpression3076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectConstructorExpression3092 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleSelectConstructorExpression3110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3130 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSelectConstructorExpression3144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3164 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSelectConstructorExpression3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClause_in_entryRuleFromClause3213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClause3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleFromClause3261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFromClass_in_ruleFromClause3281 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleFromClause3295 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleFromClause3315 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleFromEntry_in_entryRuleFromEntry3352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromEntry3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClass_in_ruleFromEntry3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromCollection_in_ruleFromEntry3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleVariableDeclaration3525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClass_in_entryRuleFromClass3583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClass3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassId_in_ruleFromClass3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassVar_in_ruleFromClass3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier3708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedIdentifier3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier3759 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleQualifiedIdentifier3778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier3793 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassId_in_entryRuleFromClassId3839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClassId3849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleFromClassId3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassVar_in_entryRuleFromClassVar3928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClassVar3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleFromClassVar3984 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleFromClassVar4005 = new BitSet(new long[]{0x0000000301000002L});
    public static final BitSet FOLLOW_ruleFromJoin_in_ruleFromClassVar4026 = new BitSet(new long[]{0x0000000301000002L});
    public static final BitSet FOLLOW_ruleFromCollection_in_entryRuleFromCollection4062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromCollection4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleFromCollection4110 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleFromCollection4122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleFromCollection4142 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleFromCollection4155 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleFromCollection4175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromJoin_in_entryRuleFromJoin4210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromJoin4220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_ruleFromJoin4270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftJoin_in_ruleFromJoin4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerJoin_in_ruleFromJoin4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_entryRuleJoin4364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoin4374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleJoin4412 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleJoin4430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleJoin4463 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleJoin4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftJoin_in_entryRuleLeftJoin4519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftJoin4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleLeftJoin4567 = new BitSet(new long[]{0x0000000108000000L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleLeftJoin4585 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleLeftJoin4610 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleLeftJoin4628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleLeftJoin4661 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleLeftJoin4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerJoin_in_entryRuleInnerJoin4717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInnerJoin4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleInnerJoin4765 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleInnerJoin4777 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleInnerJoin4795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleInnerJoin4828 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInnerJoin4849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_entryRuleWhereClause4884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereClause4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleWhereClause4932 = new BitSet(new long[]{0x40040AA800201000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleWhereClause4952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression4987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression5047 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleOrExpression5073 = new BitSet(new long[]{0x40040AA800201000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression5093 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression5132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression5142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteExpression_in_ruleAndExpression5192 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleAndExpression5218 = new BitSet(new long[]{0x40040AA800201000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleConcreteExpression_in_ruleAndExpression5238 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleConcreteExpression_in_entryRuleConcreteExpression5277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcreteExpression5287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParExpression_in_ruleConcreteExpression5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_ruleConcreteExpression5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsExpression_in_ruleConcreteExpression5397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllExpression_in_ruleConcreteExpression5427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyExpression_in_ruleConcreteExpression5457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeExpression_in_ruleConcreteExpression5487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_ruleConcreteExpression5517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullComparisonExpression_in_ruleConcreteExpression5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyComparisonExpression_in_ruleConcreteExpression5577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikeExpression_in_ruleConcreteExpression5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpression_in_ruleConcreteExpression5637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBetweenExpression_in_ruleConcreteExpression5667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParExpression_in_entryRuleParExpression5701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParExpression5711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleParExpression5749 = new BitSet(new long[]{0x4000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_ruleParExpression5773 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleParExpression5785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_entryRuleComparisonOperatorExpression5819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonOperatorExpression5829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleComparisonOperatorExpression5875 = new BitSet(new long[]{0x00E0000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_ruleComparisonOperatorExpression5896 = new BitSet(new long[]{0x4000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_ruleComparisonOperatorExpression5917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsExpression_in_entryRuleExistsExpression5952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExistsExpression5962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleExistsExpression6006 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleExistsExpression6031 = new BitSet(new long[]{0x4000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleExistsExpression6051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllExpression_in_entryRuleAllExpression6086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllExpression6096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleAllExpression6134 = new BitSet(new long[]{0x4000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleAllExpression6154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyExpression_in_entryRuleAnyExpression6189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnyExpression6199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleAnyExpression6237 = new BitSet(new long[]{0x4000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleAnyExpression6257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeExpression_in_entryRuleSomeExpression6292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSomeExpression6302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleSomeExpression6340 = new BitSet(new long[]{0x4000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleSomeExpression6360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression6395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionExpression6405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCollectionExpression6451 = new BitSet(new long[]{0x0004000000010000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleCollectionExpression6470 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleCollectionExpression6495 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleCollectionExpression6508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleCollectionExpression6530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullComparisonExpression_in_entryRuleNullComparisonExpression6565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullComparisonExpression6575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNullComparisonExpression6621 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleNullComparisonExpression6634 = new BitSet(new long[]{0x0004000800000000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleNullComparisonExpression6652 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleNullComparisonExpression6677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyComparisonExpression_in_entryRuleEmptyComparisonExpression6711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmptyComparisonExpression6721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleEmptyComparisonExpression6767 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleEmptyComparisonExpression6780 = new BitSet(new long[]{0x0004000000100000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleEmptyComparisonExpression6798 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleEmptyComparisonExpression6823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikeExpression_in_entryRuleLikeExpression6857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLikeExpression6867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleLikeExpression6913 = new BitSet(new long[]{0x0004000400000000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleLikeExpression6932 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleLikeExpression6957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLikeExpression6973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpression_in_entryRuleInExpression7013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInExpression7023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInSeqExpression_in_ruleInExpression7073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInQueryExpression_in_ruleInExpression7103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInSeqExpression_in_entryRuleInSeqExpression7137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInSeqExpression7147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7193 = new BitSet(new long[]{0x0404000000000000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleInSeqExpression7212 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleInSeqExpression7237 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleInSeqExpression7249 = new BitSet(new long[]{0x0000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7269 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleInSeqExpression7283 = new BitSet(new long[]{0x0000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7303 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleInSeqExpression7318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInQueryExpression_in_entryRuleInQueryExpression7352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInQueryExpression7362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInQueryExpression7408 = new BitSet(new long[]{0x0404000000000000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleInQueryExpression7427 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleInQueryExpression7452 = new BitSet(new long[]{0x4000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleInQueryExpression7472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBetweenExpression_in_entryRuleBetweenExpression7507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBetweenExpression7517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleBetweenExpression7563 = new BitSet(new long[]{0x0004000000000200L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleBetweenExpression7582 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleBetweenExpression7607 = new BitSet(new long[]{0x0000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBetweenExpression7627 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleBetweenExpression7640 = new BitSet(new long[]{0x0000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBetweenExpression7660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable7695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable7705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleVariable7755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_ruleVariable7785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleVariable7815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_entryRuleExpressionTerm7849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionTerm7859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleExpressionTerm7909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleExpressionTerm7939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_entryRuleAliasAttributeExpression7973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAliasAttributeExpression7983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8032 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleAliasAttributeExpression8046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8062 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_entryRuleParameterExpression8104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterExpression8114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleParameterExpression8152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterExpression8168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_entryRuleStringFunction8210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunction8220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunctionName_in_ruleStringFunction8266 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleStringFunction8279 = new BitSet(new long[]{0x0000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunction8299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleStringFunction8313 = new BitSet(new long[]{0x0000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunction8333 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleStringFunction8347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunctionName_in_entryRuleStringFunctionName8382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunctionName8393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleStringFunctionName8431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleStringFunctionName8450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleStringFunctionName8469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleStringFunctionName8488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleStringFunctionName8507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleStringFunctionName8526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFunction_in_entryRuleNumericFunction8565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericFunction8575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFunctionName_in_ruleNumericFunction8621 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleNumericFunction8634 = new BitSet(new long[]{0x0000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNumericFunction8654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleNumericFunction8668 = new BitSet(new long[]{0x0000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNumericFunction8688 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleNumericFunction8702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFunctionName_in_entryRuleNumericFunctionName8737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericFunctionName8748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleNumericFunctionName8786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleNumericFunctionName8805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleNumericFunctionName8824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleNumericFunctionName8843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue8884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue8894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerExpression_in_ruleValue8944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_ruleValue8974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_ruleValue9004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleValue9034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerExpression_in_entryRuleIntegerExpression9068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerExpression9078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerExpression9119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_entryRuleStringExpression9158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringExpression9168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringExpression9209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_entryRuleNullExpression9248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullExpression9258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleNullExpression9301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression9346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression9356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleBooleanExpression9401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleBooleanExpression9429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_entryRuleQueryExpression9477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryExpression9487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleQueryExpression9525 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleQueryExpression9549 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleQueryExpression9561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleOrderByDirection9613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleOrderByDirection9635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleComparisonOperator9685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleComparisonOperator9707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleComparisonOperator9729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleComparisonOperator9751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleComparisonOperator9773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleComparisonOperator9795 = new BitSet(new long[]{0x0000000000000002L});

}