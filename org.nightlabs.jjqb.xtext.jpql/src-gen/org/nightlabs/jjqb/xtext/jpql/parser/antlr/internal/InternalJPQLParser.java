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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:136:1: ruleSelectStatement returns [EObject current=null] : ( ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_groupBy_2_0= ruleGroupClause ) )? ( (lv_having_3_0= ruleHavingClause ) )? ( (lv_order_4_0= ruleOrderClause ) )? ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_selectFromClause_0_0 = null;

        EObject lv_whereClause_1_0 = null;

        EObject lv_groupBy_2_0 = null;

        EObject lv_having_3_0 = null;

        EObject lv_order_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:139:28: ( ( ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_groupBy_2_0= ruleGroupClause ) )? ( (lv_having_3_0= ruleHavingClause ) )? ( (lv_order_4_0= ruleOrderClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:140:1: ( ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_groupBy_2_0= ruleGroupClause ) )? ( (lv_having_3_0= ruleHavingClause ) )? ( (lv_order_4_0= ruleOrderClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:140:1: ( ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_groupBy_2_0= ruleGroupClause ) )? ( (lv_having_3_0= ruleHavingClause ) )? ( (lv_order_4_0= ruleOrderClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:140:2: ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_groupBy_2_0= ruleGroupClause ) )? ( (lv_having_3_0= ruleHavingClause ) )? ( (lv_order_4_0= ruleOrderClause ) )?
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:140:2: ( (lv_selectFromClause_0_0= ruleSelectFromClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:141:1: (lv_selectFromClause_0_0= ruleSelectFromClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:141:1: (lv_selectFromClause_0_0= ruleSelectFromClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:142:3: lv_selectFromClause_0_0= ruleSelectFromClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectStatementAccess().getSelectFromClauseSelectFromClauseParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectFromClause_in_ruleSelectStatement283);
            lv_selectFromClause_0_0=ruleSelectFromClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
              	        }
                     		set(
                     			current, 
                     			"selectFromClause",
                      		lv_selectFromClause_0_0, 
                      		"SelectFromClause");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:158:2: ( (lv_whereClause_1_0= ruleWhereClause ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==KEYWORD_51) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:159:1: (lv_whereClause_1_0= ruleWhereClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:159:1: (lv_whereClause_1_0= ruleWhereClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:160:3: lv_whereClause_1_0= ruleWhereClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getWhereClauseWhereClauseParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleSelectStatement304);
                    lv_whereClause_1_0=ruleWhereClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:176:3: ( (lv_groupBy_2_0= ruleGroupClause ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_45) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:177:1: (lv_groupBy_2_0= ruleGroupClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:177:1: (lv_groupBy_2_0= ruleGroupClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:178:3: lv_groupBy_2_0= ruleGroupClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getGroupByGroupClauseParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupClause_in_ruleSelectStatement326);
                    lv_groupBy_2_0=ruleGroupClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"groupBy",
                              		lv_groupBy_2_0, 
                              		"GroupClause");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:194:3: ( (lv_having_3_0= ruleHavingClause ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==KEYWORD_55) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:195:1: (lv_having_3_0= ruleHavingClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:195:1: (lv_having_3_0= ruleHavingClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:196:3: lv_having_3_0= ruleHavingClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getHavingHavingClauseParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHavingClause_in_ruleSelectStatement348);
                    lv_having_3_0=ruleHavingClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"having",
                              		lv_having_3_0, 
                              		"HavingClause");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:212:3: ( (lv_order_4_0= ruleOrderClause ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==KEYWORD_48) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:213:1: (lv_order_4_0= ruleOrderClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:213:1: (lv_order_4_0= ruleOrderClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:214:3: lv_order_4_0= ruleOrderClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getOrderOrderClauseParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrderClause_in_ruleSelectStatement370);
                    lv_order_4_0=ruleOrderClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"order",
                              		lv_order_4_0, 
                              		"OrderClause");
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


    // $ANTLR start "entryRuleGroupClause"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:238:1: entryRuleGroupClause returns [EObject current=null] : iv_ruleGroupClause= ruleGroupClause EOF ;
    public final EObject entryRuleGroupClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:239:2: (iv_ruleGroupClause= ruleGroupClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:240:2: iv_ruleGroupClause= ruleGroupClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupClauseRule()); 
            }
            pushFollow(FOLLOW_ruleGroupClause_in_entryRuleGroupClause406);
            iv_ruleGroupClause=ruleGroupClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroupClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupClause416); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupClause"


    // $ANTLR start "ruleGroupClause"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:247:1: ruleGroupClause returns [EObject current=null] : (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_13 ( (lv_grouping_2_0= ruleGroupItem ) ) (otherlv_3= KEYWORD_3 ( (lv_grouping_4_0= ruleGroupItem ) ) )* ) ;
    public final EObject ruleGroupClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_grouping_2_0 = null;

        EObject lv_grouping_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:250:28: ( (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_13 ( (lv_grouping_2_0= ruleGroupItem ) ) (otherlv_3= KEYWORD_3 ( (lv_grouping_4_0= ruleGroupItem ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:251:1: (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_13 ( (lv_grouping_2_0= ruleGroupItem ) ) (otherlv_3= KEYWORD_3 ( (lv_grouping_4_0= ruleGroupItem ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:251:1: (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_13 ( (lv_grouping_2_0= ruleGroupItem ) ) (otherlv_3= KEYWORD_3 ( (lv_grouping_4_0= ruleGroupItem ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:252:2: otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_13 ( (lv_grouping_2_0= ruleGroupItem ) ) (otherlv_3= KEYWORD_3 ( (lv_grouping_4_0= ruleGroupItem ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleGroupClause454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGroupClauseAccess().getGROUPKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleGroupClause466); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGroupClauseAccess().getBYKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:261:1: ( (lv_grouping_2_0= ruleGroupItem ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:262:1: (lv_grouping_2_0= ruleGroupItem )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:262:1: (lv_grouping_2_0= ruleGroupItem )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:263:3: lv_grouping_2_0= ruleGroupItem
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupClauseAccess().getGroupingGroupItemParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupItem_in_ruleGroupClause486);
            lv_grouping_2_0=ruleGroupItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGroupClauseRule());
              	        }
                     		add(
                     			current, 
                     			"grouping",
                      		lv_grouping_2_0, 
                      		"GroupItem");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:279:2: (otherlv_3= KEYWORD_3 ( (lv_grouping_4_0= ruleGroupItem ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==KEYWORD_3) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:280:2: otherlv_3= KEYWORD_3 ( (lv_grouping_4_0= ruleGroupItem ) )
            	    {
            	    otherlv_3=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleGroupClause500); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getGroupClauseAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:284:1: ( (lv_grouping_4_0= ruleGroupItem ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:285:1: (lv_grouping_4_0= ruleGroupItem )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:285:1: (lv_grouping_4_0= ruleGroupItem )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:286:3: lv_grouping_4_0= ruleGroupItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroupClauseAccess().getGroupingGroupItemParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGroupItem_in_ruleGroupClause520);
            	    lv_grouping_4_0=ruleGroupItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGroupClauseRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"grouping",
            	              		lv_grouping_4_0, 
            	              		"GroupItem");
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


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupClause"


    // $ANTLR start "entryRuleGroupItem"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:310:1: entryRuleGroupItem returns [EObject current=null] : iv_ruleGroupItem= ruleGroupItem EOF ;
    public final EObject entryRuleGroupItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupItem = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:311:2: (iv_ruleGroupItem= ruleGroupItem EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:312:2: iv_ruleGroupItem= ruleGroupItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupItemRule()); 
            }
            pushFollow(FOLLOW_ruleGroupItem_in_entryRuleGroupItem557);
            iv_ruleGroupItem=ruleGroupItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroupItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupItem567); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupItem"


    // $ANTLR start "ruleGroupItem"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:319:1: ruleGroupItem returns [EObject current=null] : ( (lv_var_0_0= ruleAliasAttributeExpression ) ) ;
    public final EObject ruleGroupItem() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:322:28: ( ( (lv_var_0_0= ruleAliasAttributeExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:323:1: ( (lv_var_0_0= ruleAliasAttributeExpression ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:323:1: ( (lv_var_0_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:324:1: (lv_var_0_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:324:1: (lv_var_0_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:325:3: lv_var_0_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupItemAccess().getVarAliasAttributeExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleGroupItem612);
            lv_var_0_0=ruleAliasAttributeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGroupItemRule());
              	        }
                     		set(
                     			current, 
                     			"var",
                      		lv_var_0_0, 
                      		"AliasAttributeExpression");
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
    // $ANTLR end "ruleGroupItem"


    // $ANTLR start "entryRuleHavingClause"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:349:1: entryRuleHavingClause returns [EObject current=null] : iv_ruleHavingClause= ruleHavingClause EOF ;
    public final EObject entryRuleHavingClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHavingClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:350:2: (iv_ruleHavingClause= ruleHavingClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:351:2: iv_ruleHavingClause= ruleHavingClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHavingClauseRule()); 
            }
            pushFollow(FOLLOW_ruleHavingClause_in_entryRuleHavingClause646);
            iv_ruleHavingClause=ruleHavingClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHavingClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHavingClause656); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:358:1: ruleHavingClause returns [EObject current=null] : (otherlv_0= KEYWORD_55 ( (lv_having_1_0= ruleOrExpression ) ) ) ;
    public final EObject ruleHavingClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_having_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:361:28: ( (otherlv_0= KEYWORD_55 ( (lv_having_1_0= ruleOrExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:362:1: (otherlv_0= KEYWORD_55 ( (lv_having_1_0= ruleOrExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:362:1: (otherlv_0= KEYWORD_55 ( (lv_having_1_0= ruleOrExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:363:2: otherlv_0= KEYWORD_55 ( (lv_having_1_0= ruleOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleHavingClause694); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getHavingClauseAccess().getHAVINGKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:367:1: ( (lv_having_1_0= ruleOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:368:1: (lv_having_1_0= ruleOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:368:1: (lv_having_1_0= ruleOrExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:369:3: lv_having_1_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHavingClauseAccess().getHavingOrExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleHavingClause714);
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


    // $ANTLR start "entryRuleOrderClause"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:393:1: entryRuleOrderClause returns [EObject current=null] : iv_ruleOrderClause= ruleOrderClause EOF ;
    public final EObject entryRuleOrderClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:394:2: (iv_ruleOrderClause= ruleOrderClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:395:2: iv_ruleOrderClause= ruleOrderClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderClauseRule()); 
            }
            pushFollow(FOLLOW_ruleOrderClause_in_entryRuleOrderClause749);
            iv_ruleOrderClause=ruleOrderClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderClause759); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrderClause"


    // $ANTLR start "ruleOrderClause"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:402:1: ruleOrderClause returns [EObject current=null] : (otherlv_0= KEYWORD_48 otherlv_1= KEYWORD_13 ( (lv_ordering_2_0= ruleOrderItem ) ) (otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= KEYWORD_22 ) ) | ( (lv_isDesc_6_0= KEYWORD_31 ) ) )? ) ;
    public final EObject ruleOrderClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_isAsc_5_0=null;
        Token lv_isDesc_6_0=null;
        EObject lv_ordering_2_0 = null;

        EObject lv_ordering_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:405:28: ( (otherlv_0= KEYWORD_48 otherlv_1= KEYWORD_13 ( (lv_ordering_2_0= ruleOrderItem ) ) (otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= KEYWORD_22 ) ) | ( (lv_isDesc_6_0= KEYWORD_31 ) ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:406:1: (otherlv_0= KEYWORD_48 otherlv_1= KEYWORD_13 ( (lv_ordering_2_0= ruleOrderItem ) ) (otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= KEYWORD_22 ) ) | ( (lv_isDesc_6_0= KEYWORD_31 ) ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:406:1: (otherlv_0= KEYWORD_48 otherlv_1= KEYWORD_13 ( (lv_ordering_2_0= ruleOrderItem ) ) (otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= KEYWORD_22 ) ) | ( (lv_isDesc_6_0= KEYWORD_31 ) ) )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:407:2: otherlv_0= KEYWORD_48 otherlv_1= KEYWORD_13 ( (lv_ordering_2_0= ruleOrderItem ) ) (otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= KEYWORD_22 ) ) | ( (lv_isDesc_6_0= KEYWORD_31 ) ) )?
            {
            otherlv_0=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleOrderClause797); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOrderClauseAccess().getORDERKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleOrderClause809); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOrderClauseAccess().getBYKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:416:1: ( (lv_ordering_2_0= ruleOrderItem ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:417:1: (lv_ordering_2_0= ruleOrderItem )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:417:1: (lv_ordering_2_0= ruleOrderItem )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:418:3: lv_ordering_2_0= ruleOrderItem
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderClauseAccess().getOrderingOrderItemParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrderItem_in_ruleOrderClause829);
            lv_ordering_2_0=ruleOrderItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOrderClauseRule());
              	        }
                     		add(
                     			current, 
                     			"ordering",
                      		lv_ordering_2_0, 
                      		"OrderItem");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:434:2: (otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==KEYWORD_3) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:435:2: otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) )
            	    {
            	    otherlv_3=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleOrderClause843); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getOrderClauseAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:439:1: ( (lv_ordering_4_0= ruleOrderItem ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:440:1: (lv_ordering_4_0= ruleOrderItem )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:440:1: (lv_ordering_4_0= ruleOrderItem )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:441:3: lv_ordering_4_0= ruleOrderItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrderClauseAccess().getOrderingOrderItemParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrderItem_in_ruleOrderClause863);
            	    lv_ordering_4_0=ruleOrderItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrderClauseRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ordering",
            	              		lv_ordering_4_0, 
            	              		"OrderItem");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:457:4: ( ( (lv_isAsc_5_0= KEYWORD_22 ) ) | ( (lv_isDesc_6_0= KEYWORD_31 ) ) )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==KEYWORD_22) ) {
                alt8=1;
            }
            else if ( (LA8_0==KEYWORD_31) ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:457:5: ( (lv_isAsc_5_0= KEYWORD_22 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:457:5: ( (lv_isAsc_5_0= KEYWORD_22 ) )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:458:1: (lv_isAsc_5_0= KEYWORD_22 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:458:1: (lv_isAsc_5_0= KEYWORD_22 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:459:3: lv_isAsc_5_0= KEYWORD_22
                    {
                    lv_isAsc_5_0=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleOrderClause885); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isAsc_5_0, grammarAccess.getOrderClauseAccess().getIsAscASCKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOrderClauseRule());
                      	        }
                             		setWithLastConsumed(current, "isAsc", true, "ASC");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:474:6: ( (lv_isDesc_6_0= KEYWORD_31 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:474:6: ( (lv_isDesc_6_0= KEYWORD_31 ) )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:475:1: (lv_isDesc_6_0= KEYWORD_31 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:475:1: (lv_isDesc_6_0= KEYWORD_31 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:476:3: lv_isDesc_6_0= KEYWORD_31
                    {
                    lv_isDesc_6_0=(Token)match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleOrderClause921); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isDesc_6_0, grammarAccess.getOrderClauseAccess().getIsDescDESCKeyword_4_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOrderClauseRule());
                      	        }
                             		setWithLastConsumed(current, "isDesc", true, "DESC");
                      	    
                    }

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
    // $ANTLR end "ruleOrderClause"


    // $ANTLR start "entryRuleOrderItem"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:498:1: entryRuleOrderItem returns [EObject current=null] : iv_ruleOrderItem= ruleOrderItem EOF ;
    public final EObject entryRuleOrderItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderItem = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:499:2: (iv_ruleOrderItem= ruleOrderItem EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:500:2: iv_ruleOrderItem= ruleOrderItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderItemRule()); 
            }
            pushFollow(FOLLOW_ruleOrderItem_in_entryRuleOrderItem969);
            iv_ruleOrderItem=ruleOrderItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderItem979); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrderItem"


    // $ANTLR start "ruleOrderItem"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:507:1: ruleOrderItem returns [EObject current=null] : ( (lv_var_0_0= ruleAliasAttributeExpression ) ) ;
    public final EObject ruleOrderItem() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:510:28: ( ( (lv_var_0_0= ruleAliasAttributeExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:511:1: ( (lv_var_0_0= ruleAliasAttributeExpression ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:511:1: ( (lv_var_0_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:512:1: (lv_var_0_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:512:1: (lv_var_0_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:513:3: lv_var_0_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderItemAccess().getVarAliasAttributeExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleOrderItem1024);
            lv_var_0_0=ruleAliasAttributeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOrderItemRule());
              	        }
                     		set(
                     			current, 
                     			"var",
                      		lv_var_0_0, 
                      		"AliasAttributeExpression");
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
    // $ANTLR end "ruleOrderItem"


    // $ANTLR start "entryRuleUpdateStatement"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:537:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:538:2: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:539:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateStatementRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement1058);
            iv_ruleUpdateStatement=ruleUpdateStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement1068); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:546:1: ruleUpdateStatement returns [EObject current=null] : ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ) ;
    public final EObject ruleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_updateClause_0_0 = null;

        EObject lv_setClause_1_0 = null;

        EObject lv_whereClause_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:549:28: ( ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:550:1: ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:550:1: ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:550:2: ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )?
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:550:2: ( (lv_updateClause_0_0= ruleUpdateClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:551:1: (lv_updateClause_0_0= ruleUpdateClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:551:1: (lv_updateClause_0_0= ruleUpdateClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:552:3: lv_updateClause_0_0= ruleUpdateClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateClauseUpdateClauseParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUpdateClause_in_ruleUpdateStatement1114);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:568:2: ( (lv_setClause_1_0= ruleSetClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:569:1: (lv_setClause_1_0= ruleSetClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:569:1: (lv_setClause_1_0= ruleSetClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:570:3: lv_setClause_1_0= ruleSetClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getSetClauseSetClauseParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSetClause_in_ruleUpdateStatement1135);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:586:2: ( (lv_whereClause_2_0= ruleWhereClause ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KEYWORD_51) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:587:1: (lv_whereClause_2_0= ruleWhereClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:587:1: (lv_whereClause_2_0= ruleWhereClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:588:3: lv_whereClause_2_0= ruleWhereClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getWhereClauseWhereClauseParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleUpdateStatement1156);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:612:1: entryRuleUpdateClause returns [EObject current=null] : iv_ruleUpdateClause= ruleUpdateClause EOF ;
    public final EObject entryRuleUpdateClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:613:2: (iv_ruleUpdateClause= ruleUpdateClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:614:2: iv_ruleUpdateClause= ruleUpdateClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateClauseRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateClause_in_entryRuleUpdateClause1192);
            iv_ruleUpdateClause=ruleUpdateClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateClause1202); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:621:1: ruleUpdateClause returns [EObject current=null] : (otherlv_0= KEYWORD_60 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) ;
    public final EObject ruleUpdateClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_fromEntries_1_0 = null;

        EObject lv_fromEntries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:624:28: ( (otherlv_0= KEYWORD_60 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:625:1: (otherlv_0= KEYWORD_60 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:625:1: (otherlv_0= KEYWORD_60 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:626:2: otherlv_0= KEYWORD_60 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleUpdateClause1240); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUpdateClauseAccess().getUPDATEKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:630:1: ( (lv_fromEntries_1_0= ruleFromEntry ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:631:1: (lv_fromEntries_1_0= ruleFromEntry )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:631:1: (lv_fromEntries_1_0= ruleFromEntry )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:632:3: lv_fromEntries_1_0= ruleFromEntry
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateClauseAccess().getFromEntriesFromEntryParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFromEntry_in_ruleUpdateClause1260);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:648:2: (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==KEYWORD_3) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:649:2: otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleUpdateClause1274); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getUpdateClauseAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:653:1: ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:654:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:654:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:655:3: lv_fromEntries_3_0= ruleFromEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUpdateClauseAccess().getFromEntriesFromEntryParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFromEntry_in_ruleUpdateClause1294);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:679:1: entryRuleSetClause returns [EObject current=null] : iv_ruleSetClause= ruleSetClause EOF ;
    public final EObject entryRuleSetClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:680:2: (iv_ruleSetClause= ruleSetClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:681:2: iv_ruleSetClause= ruleSetClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetClauseRule()); 
            }
            pushFollow(FOLLOW_ruleSetClause_in_entryRuleSetClause1331);
            iv_ruleSetClause=ruleSetClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetClause1341); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:688:1: ruleSetClause returns [EObject current=null] : (otherlv_0= KEYWORD_29 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )* ) ;
    public final EObject ruleSetClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:691:28: ( (otherlv_0= KEYWORD_29 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:692:1: (otherlv_0= KEYWORD_29 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:692:1: (otherlv_0= KEYWORD_29 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:693:2: otherlv_0= KEYWORD_29 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleSetClause1379); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSetClauseAccess().getSETKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:697:1: ( (lv_items_1_0= ruleUpdateItem ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:698:1: (lv_items_1_0= ruleUpdateItem )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:698:1: (lv_items_1_0= ruleUpdateItem )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:699:3: lv_items_1_0= ruleUpdateItem
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSetClauseAccess().getItemsUpdateItemParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUpdateItem_in_ruleSetClause1399);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:715:2: (otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==KEYWORD_3) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:716:2: otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleSetClause1413); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSetClauseAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:720:1: ( (lv_items_3_0= ruleUpdateItem ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:721:1: (lv_items_3_0= ruleUpdateItem )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:721:1: (lv_items_3_0= ruleUpdateItem )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:722:3: lv_items_3_0= ruleUpdateItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSetClauseAccess().getItemsUpdateItemParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUpdateItem_in_ruleSetClause1433);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:746:1: entryRuleUpdateItem returns [EObject current=null] : iv_ruleUpdateItem= ruleUpdateItem EOF ;
    public final EObject entryRuleUpdateItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateItem = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:747:2: (iv_ruleUpdateItem= ruleUpdateItem EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:748:2: iv_ruleUpdateItem= ruleUpdateItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateItemRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateItem_in_entryRuleUpdateItem1470);
            iv_ruleUpdateItem=ruleUpdateItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateItem1480); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:755:1: ruleUpdateItem returns [EObject current=null] : ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_7 ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleUpdateItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_alias_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:758:28: ( ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_7 ( (lv_value_2_0= ruleValue ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:759:1: ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_7 ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:759:1: ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_7 ( (lv_value_2_0= ruleValue ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:759:2: ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_7 ( (lv_value_2_0= ruleValue ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:759:2: ( (lv_alias_0_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:760:1: (lv_alias_0_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:760:1: (lv_alias_0_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:761:3: lv_alias_0_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateItemAccess().getAliasAliasAttributeExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleUpdateItem1526);
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

            otherlv_1=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleUpdateItem1539); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUpdateItemAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:782:1: ( (lv_value_2_0= ruleValue ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:783:1: (lv_value_2_0= ruleValue )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:783:1: (lv_value_2_0= ruleValue )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:784:3: lv_value_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateItemAccess().getValueValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleUpdateItem1559);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:808:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:809:2: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:810:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement1594);
            iv_ruleDeleteStatement=ruleDeleteStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteStatement1604); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:817:1: ruleDeleteStatement returns [EObject current=null] : ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_deleteClause_0_0 = null;

        EObject lv_whereClause_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:820:28: ( ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:821:1: ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:821:1: ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:821:2: ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )?
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:821:2: ( (lv_deleteClause_0_0= ruleDeleteClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:822:1: (lv_deleteClause_0_0= ruleDeleteClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:822:1: (lv_deleteClause_0_0= ruleDeleteClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:823:3: lv_deleteClause_0_0= ruleDeleteClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeleteStatementAccess().getDeleteClauseDeleteClauseParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDeleteClause_in_ruleDeleteStatement1650);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:839:2: ( (lv_whereClause_1_0= ruleWhereClause ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==KEYWORD_51) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:840:1: (lv_whereClause_1_0= ruleWhereClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:840:1: (lv_whereClause_1_0= ruleWhereClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:841:3: lv_whereClause_1_0= ruleWhereClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeleteStatementAccess().getWhereClauseWhereClauseParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleDeleteStatement1671);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:865:1: entryRuleDeleteClause returns [EObject current=null] : iv_ruleDeleteClause= ruleDeleteClause EOF ;
    public final EObject entryRuleDeleteClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:866:2: (iv_ruleDeleteClause= ruleDeleteClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:867:2: iv_ruleDeleteClause= ruleDeleteClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteClauseRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteClause_in_entryRuleDeleteClause1707);
            iv_ruleDeleteClause=ruleDeleteClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteClause1717); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:874:1: ruleDeleteClause returns [EObject current=null] : (otherlv_0= KEYWORD_53 ( (lv_fromClause_1_0= ruleFromClause ) ) ) ;
    public final EObject ruleDeleteClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_fromClause_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:877:28: ( (otherlv_0= KEYWORD_53 ( (lv_fromClause_1_0= ruleFromClause ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:878:1: (otherlv_0= KEYWORD_53 ( (lv_fromClause_1_0= ruleFromClause ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:878:1: (otherlv_0= KEYWORD_53 ( (lv_fromClause_1_0= ruleFromClause ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:879:2: otherlv_0= KEYWORD_53 ( (lv_fromClause_1_0= ruleFromClause ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleDeleteClause1755); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDeleteClauseAccess().getDELETEKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:883:1: ( (lv_fromClause_1_0= ruleFromClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:884:1: (lv_fromClause_1_0= ruleFromClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:884:1: (lv_fromClause_1_0= ruleFromClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:885:3: lv_fromClause_1_0= ruleFromClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeleteClauseAccess().getFromClauseFromClauseParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFromClause_in_ruleDeleteClause1775);
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


    // $ANTLR start "entryRuleSelectFromClause"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:909:1: entryRuleSelectFromClause returns [EObject current=null] : iv_ruleSelectFromClause= ruleSelectFromClause EOF ;
    public final EObject entryRuleSelectFromClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectFromClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:910:2: (iv_ruleSelectFromClause= ruleSelectFromClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:911:2: iv_ruleSelectFromClause= ruleSelectFromClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectFromClauseRule()); 
            }
            pushFollow(FOLLOW_ruleSelectFromClause_in_entryRuleSelectFromClause1810);
            iv_ruleSelectFromClause=ruleSelectFromClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectFromClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectFromClause1820); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectFromClause"


    // $ANTLR start "ruleSelectFromClause"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:918:1: ruleSelectFromClause returns [EObject current=null] : ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) ) ;
    public final EObject ruleSelectFromClause() throws RecognitionException {
        EObject current = null;

        EObject lv_selectClause_0_0 = null;

        EObject lv_fromClause_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:921:28: ( ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:922:1: ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:922:1: ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:922:2: ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:922:2: ( (lv_selectClause_0_0= ruleSelectClause ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==KEYWORD_59) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:923:1: (lv_selectClause_0_0= ruleSelectClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:923:1: (lv_selectClause_0_0= ruleSelectClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:924:3: lv_selectClause_0_0= ruleSelectClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectFromClauseAccess().getSelectClauseSelectClauseParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectClause_in_ruleSelectFromClause1866);
                    lv_selectClause_0_0=ruleSelectClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectFromClauseRule());
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:940:3: ( (lv_fromClause_1_0= ruleFromClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:941:1: (lv_fromClause_1_0= ruleFromClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:941:1: (lv_fromClause_1_0= ruleFromClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:942:3: lv_fromClause_1_0= ruleFromClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectFromClauseAccess().getFromClauseFromClauseParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFromClause_in_ruleSelectFromClause1888);
            lv_fromClause_1_0=ruleFromClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSelectFromClauseRule());
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
    // $ANTLR end "ruleSelectFromClause"


    // $ANTLR start "entryRuleSelectClause"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:966:1: entryRuleSelectClause returns [EObject current=null] : iv_ruleSelectClause= ruleSelectClause EOF ;
    public final EObject entryRuleSelectClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:967:2: (iv_ruleSelectClause= ruleSelectClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:968:2: iv_ruleSelectClause= ruleSelectClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectClauseRule()); 
            }
            pushFollow(FOLLOW_ruleSelectClause_in_entryRuleSelectClause1923);
            iv_ruleSelectClause=ruleSelectClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectClause1933); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:975:1: ruleSelectClause returns [EObject current=null] : (otherlv_0= KEYWORD_59 ( (lv_isDistinct_1_0= KEYWORD_62 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* ) ;
    public final EObject ruleSelectClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isDistinct_1_0=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:978:28: ( (otherlv_0= KEYWORD_59 ( (lv_isDistinct_1_0= KEYWORD_62 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:979:1: (otherlv_0= KEYWORD_59 ( (lv_isDistinct_1_0= KEYWORD_62 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:979:1: (otherlv_0= KEYWORD_59 ( (lv_isDistinct_1_0= KEYWORD_62 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:980:2: otherlv_0= KEYWORD_59 ( (lv_isDistinct_1_0= KEYWORD_62 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_ruleSelectClause1971); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSelectClauseAccess().getSELECTKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:984:1: ( (lv_isDistinct_1_0= KEYWORD_62 ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KEYWORD_62) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:985:1: (lv_isDistinct_1_0= KEYWORD_62 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:985:1: (lv_isDistinct_1_0= KEYWORD_62 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:986:3: lv_isDistinct_1_0= KEYWORD_62
                    {
                    lv_isDistinct_1_0=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleSelectClause1989); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1000:3: ( (lv_expressions_2_0= ruleSelectExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1001:1: (lv_expressions_2_0= ruleSelectExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1001:1: (lv_expressions_2_0= ruleSelectExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1002:3: lv_expressions_2_0= ruleSelectExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectClauseAccess().getExpressionsSelectExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectClause2022);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1018:2: (otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==KEYWORD_3) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1019:2: otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleSelectClause2036); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getSelectClauseAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1023:1: ( (lv_expressions_4_0= ruleSelectExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1024:1: (lv_expressions_4_0= ruleSelectExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1024:1: (lv_expressions_4_0= ruleSelectExpression )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1025:3: lv_expressions_4_0= ruleSelectExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectClauseAccess().getExpressionsSelectExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectClause2056);
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
            	    break loop15;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1049:1: entryRuleSelectExpression returns [EObject current=null] : iv_ruleSelectExpression= ruleSelectExpression EOF ;
    public final EObject entryRuleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1050:2: (iv_ruleSelectExpression= ruleSelectExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1051:2: iv_ruleSelectExpression= ruleSelectExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression2093);
            iv_ruleSelectExpression=ruleSelectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectExpression2103); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1058:1: ruleSelectExpression returns [EObject current=null] : (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression ) ;
    public final EObject ruleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AliasAttributeExpression_0 = null;

        EObject this_SelectAggregateExpression_1 = null;

        EObject this_SelectConstructorExpression_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1061:28: ( (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1062:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1062:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt16=1;
                }
                break;
            case KEYWORD_41:
            case KEYWORD_23:
            case KEYWORD_24:
            case KEYWORD_25:
            case KEYWORD_30:
                {
                alt16=2;
                }
                break;
            case KEYWORD_27:
                {
                alt16=3;
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1063:2: this_AliasAttributeExpression_0= ruleAliasAttributeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectExpressionAccess().getAliasAttributeExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSelectExpression2153);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1076:2: this_SelectAggregateExpression_1= ruleSelectAggregateExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectExpressionAccess().getSelectAggregateExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectAggregateExpression_in_ruleSelectExpression2183);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1089:2: this_SelectConstructorExpression_2= ruleSelectConstructorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectExpressionAccess().getSelectConstructorExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectConstructorExpression_in_ruleSelectExpression2213);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1108:1: entryRuleSelectAggregateExpression returns [EObject current=null] : iv_ruleSelectAggregateExpression= ruleSelectAggregateExpression EOF ;
    public final EObject entryRuleSelectAggregateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectAggregateExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1109:2: (iv_ruleSelectAggregateExpression= ruleSelectAggregateExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1110:2: iv_ruleSelectAggregateExpression= ruleSelectAggregateExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectAggregateExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectAggregateExpression_in_entryRuleSelectAggregateExpression2247);
            iv_ruleSelectAggregateExpression=ruleSelectAggregateExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectAggregateExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectAggregateExpression2257); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1117:1: ruleSelectAggregateExpression returns [EObject current=null] : (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate ) ;
    public final EObject ruleSelectAggregateExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AvgAggregate_0 = null;

        EObject this_MaxAggregate_1 = null;

        EObject this_MinAggregate_2 = null;

        EObject this_SumAggregate_3 = null;

        EObject this_CountAggregate_4 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1120:28: ( (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1121:1: (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1121:1: (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate )
            int alt17=5;
            switch ( input.LA(1) ) {
            case KEYWORD_23:
                {
                alt17=1;
                }
                break;
            case KEYWORD_24:
                {
                alt17=2;
                }
                break;
            case KEYWORD_25:
                {
                alt17=3;
                }
                break;
            case KEYWORD_30:
                {
                alt17=4;
                }
                break;
            case KEYWORD_41:
                {
                alt17=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1122:2: this_AvgAggregate_0= ruleAvgAggregate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getAvgAggregateParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAvgAggregate_in_ruleSelectAggregateExpression2307);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1135:2: this_MaxAggregate_1= ruleMaxAggregate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getMaxAggregateParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMaxAggregate_in_ruleSelectAggregateExpression2337);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1148:2: this_MinAggregate_2= ruleMinAggregate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getMinAggregateParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMinAggregate_in_ruleSelectAggregateExpression2367);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1161:2: this_SumAggregate_3= ruleSumAggregate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getSumAggregateParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSumAggregate_in_ruleSelectAggregateExpression2397);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1174:2: this_CountAggregate_4= ruleCountAggregate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getCountAggregateParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCountAggregate_in_ruleSelectAggregateExpression2427);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1193:1: entryRuleAvgAggregate returns [EObject current=null] : iv_ruleAvgAggregate= ruleAvgAggregate EOF ;
    public final EObject entryRuleAvgAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvgAggregate = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1194:2: (iv_ruleAvgAggregate= ruleAvgAggregate EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1195:2: iv_ruleAvgAggregate= ruleAvgAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAvgAggregateRule()); 
            }
            pushFollow(FOLLOW_ruleAvgAggregate_in_entryRuleAvgAggregate2461);
            iv_ruleAvgAggregate=ruleAvgAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAvgAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvgAggregate2471); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1202:1: ruleAvgAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_23 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleAvgAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1205:28: ( (otherlv_0= KEYWORD_23 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1206:1: (otherlv_0= KEYWORD_23 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1206:1: (otherlv_0= KEYWORD_23 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1207:2: otherlv_0= KEYWORD_23 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleAvgAggregate2509); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAvgAggregateAccess().getAVGKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleAvgAggregate2521); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAvgAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1216:1: ( (lv_isDistinct_2_0= KEYWORD_62 ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KEYWORD_62) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1217:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1217:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1218:3: lv_isDistinct_2_0= KEYWORD_62
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleAvgAggregate2539); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1232:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1233:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1233:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1234:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAvgAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleAvgAggregate2572);
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

            otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleAvgAggregate2585); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1263:1: entryRuleMaxAggregate returns [EObject current=null] : iv_ruleMaxAggregate= ruleMaxAggregate EOF ;
    public final EObject entryRuleMaxAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxAggregate = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1264:2: (iv_ruleMaxAggregate= ruleMaxAggregate EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1265:2: iv_ruleMaxAggregate= ruleMaxAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaxAggregateRule()); 
            }
            pushFollow(FOLLOW_ruleMaxAggregate_in_entryRuleMaxAggregate2619);
            iv_ruleMaxAggregate=ruleMaxAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaxAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxAggregate2629); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1272:1: ruleMaxAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_24 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleMaxAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1275:28: ( (otherlv_0= KEYWORD_24 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1276:1: (otherlv_0= KEYWORD_24 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1276:1: (otherlv_0= KEYWORD_24 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1277:2: otherlv_0= KEYWORD_24 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleMaxAggregate2667); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMaxAggregateAccess().getMAXKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleMaxAggregate2679); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMaxAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1286:1: ( (lv_isDistinct_2_0= KEYWORD_62 ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KEYWORD_62) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1287:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1287:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1288:3: lv_isDistinct_2_0= KEYWORD_62
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleMaxAggregate2697); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1302:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1303:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1303:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1304:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaxAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleMaxAggregate2730);
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

            otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleMaxAggregate2743); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1333:1: entryRuleMinAggregate returns [EObject current=null] : iv_ruleMinAggregate= ruleMinAggregate EOF ;
    public final EObject entryRuleMinAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinAggregate = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1334:2: (iv_ruleMinAggregate= ruleMinAggregate EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1335:2: iv_ruleMinAggregate= ruleMinAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinAggregateRule()); 
            }
            pushFollow(FOLLOW_ruleMinAggregate_in_entryRuleMinAggregate2777);
            iv_ruleMinAggregate=ruleMinAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinAggregate2787); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1342:1: ruleMinAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_25 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleMinAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1345:28: ( (otherlv_0= KEYWORD_25 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1346:1: (otherlv_0= KEYWORD_25 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1346:1: (otherlv_0= KEYWORD_25 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1347:2: otherlv_0= KEYWORD_25 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleMinAggregate2825); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMinAggregateAccess().getMINKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleMinAggregate2837); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMinAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1356:1: ( (lv_isDistinct_2_0= KEYWORD_62 ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KEYWORD_62) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1357:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1357:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1358:3: lv_isDistinct_2_0= KEYWORD_62
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleMinAggregate2855); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1372:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1373:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1373:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1374:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleMinAggregate2888);
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

            otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleMinAggregate2901); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1403:1: entryRuleSumAggregate returns [EObject current=null] : iv_ruleSumAggregate= ruleSumAggregate EOF ;
    public final EObject entryRuleSumAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumAggregate = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1404:2: (iv_ruleSumAggregate= ruleSumAggregate EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1405:2: iv_ruleSumAggregate= ruleSumAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumAggregateRule()); 
            }
            pushFollow(FOLLOW_ruleSumAggregate_in_entryRuleSumAggregate2935);
            iv_ruleSumAggregate=ruleSumAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumAggregate2945); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1412:1: ruleSumAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_30 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleSumAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1415:28: ( (otherlv_0= KEYWORD_30 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1416:1: (otherlv_0= KEYWORD_30 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1416:1: (otherlv_0= KEYWORD_30 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1417:2: otherlv_0= KEYWORD_30 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleSumAggregate2983); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSumAggregateAccess().getSUMKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleSumAggregate2995); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSumAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1426:1: ( (lv_isDistinct_2_0= KEYWORD_62 ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KEYWORD_62) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1427:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1427:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1428:3: lv_isDistinct_2_0= KEYWORD_62
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleSumAggregate3013); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1442:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1443:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1443:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1444:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSumAggregate3046);
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

            otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleSumAggregate3059); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1473:1: entryRuleCountAggregate returns [EObject current=null] : iv_ruleCountAggregate= ruleCountAggregate EOF ;
    public final EObject entryRuleCountAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountAggregate = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1474:2: (iv_ruleCountAggregate= ruleCountAggregate EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1475:2: iv_ruleCountAggregate= ruleCountAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCountAggregateRule()); 
            }
            pushFollow(FOLLOW_ruleCountAggregate_in_entryRuleCountAggregate3093);
            iv_ruleCountAggregate=ruleCountAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCountAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCountAggregate3103); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1482:1: ruleCountAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_41 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleCountAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1485:28: ( (otherlv_0= KEYWORD_41 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1486:1: (otherlv_0= KEYWORD_41 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1486:1: (otherlv_0= KEYWORD_41 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1487:2: otherlv_0= KEYWORD_41 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleCountAggregate3141); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCountAggregateAccess().getCOUNTKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleCountAggregate3153); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCountAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1496:1: ( (lv_isDistinct_2_0= KEYWORD_62 ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==KEYWORD_62) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1497:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1497:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1498:3: lv_isDistinct_2_0= KEYWORD_62
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleCountAggregate3171); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1512:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1513:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1513:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1514:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCountAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleCountAggregate3204);
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

            otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleCountAggregate3217); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1543:1: entryRuleSelectConstructorExpression returns [EObject current=null] : iv_ruleSelectConstructorExpression= ruleSelectConstructorExpression EOF ;
    public final EObject entryRuleSelectConstructorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectConstructorExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1544:2: (iv_ruleSelectConstructorExpression= ruleSelectConstructorExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1545:2: iv_ruleSelectConstructorExpression= ruleSelectConstructorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectConstructorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectConstructorExpression_in_entryRuleSelectConstructorExpression3251);
            iv_ruleSelectConstructorExpression=ruleSelectConstructorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectConstructorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectConstructorExpression3261); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1552:1: ruleSelectConstructorExpression returns [EObject current=null] : (otherlv_0= KEYWORD_27 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2 ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1555:28: ( (otherlv_0= KEYWORD_27 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1556:1: (otherlv_0= KEYWORD_27 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1556:1: (otherlv_0= KEYWORD_27 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1557:2: otherlv_0= KEYWORD_27 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleSelectConstructorExpression3299); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSelectConstructorExpressionAccess().getNEWKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1561:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1562:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1562:1: (lv_name_1_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1563:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectConstructorExpression3315); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleSelectConstructorExpression3333); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSelectConstructorExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1584:1: ( (lv_items_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1585:1: (lv_items_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1585:1: (lv_items_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1586:3: lv_items_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectConstructorExpressionAccess().getItemsAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3353);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1602:2: (otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==KEYWORD_3) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1603:2: otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleSelectConstructorExpression3367); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getSelectConstructorExpressionAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1607:1: ( (lv_items_5_0= ruleAliasAttributeExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1608:1: (lv_items_5_0= ruleAliasAttributeExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1608:1: (lv_items_5_0= ruleAliasAttributeExpression )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1609:3: lv_items_5_0= ruleAliasAttributeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectConstructorExpressionAccess().getItemsAliasAttributeExpressionParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3387);
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
            	    break loop23;
                }
            } while (true);

            otherlv_6=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleSelectConstructorExpression3402); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1638:1: entryRuleFromClause returns [EObject current=null] : iv_ruleFromClause= ruleFromClause EOF ;
    public final EObject entryRuleFromClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1639:2: (iv_ruleFromClause= ruleFromClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1640:2: iv_ruleFromClause= ruleFromClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromClauseRule()); 
            }
            pushFollow(FOLLOW_ruleFromClause_in_entryRuleFromClause3436);
            iv_ruleFromClause=ruleFromClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClause3446); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1647:1: ruleFromClause returns [EObject current=null] : (otherlv_0= KEYWORD_32 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) ;
    public final EObject ruleFromClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_fromEntries_1_0 = null;

        EObject lv_fromEntries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1650:28: ( (otherlv_0= KEYWORD_32 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1651:1: (otherlv_0= KEYWORD_32 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1651:1: (otherlv_0= KEYWORD_32 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1652:2: otherlv_0= KEYWORD_32 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleFromClause3484); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFromClauseAccess().getFROMKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1656:1: ( (lv_fromEntries_1_0= ruleFromClass ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1657:1: (lv_fromEntries_1_0= ruleFromClass )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1657:1: (lv_fromEntries_1_0= ruleFromClass )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1658:3: lv_fromEntries_1_0= ruleFromClass
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromClauseAccess().getFromEntriesFromClassParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFromClass_in_ruleFromClause3504);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1674:2: (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==KEYWORD_3) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1675:2: otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleFromClause3518); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFromClauseAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1679:1: ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1680:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1680:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1681:3: lv_fromEntries_3_0= ruleFromEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFromClauseAccess().getFromEntriesFromEntryParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFromEntry_in_ruleFromClause3538);
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
    // $ANTLR end "ruleFromClause"


    // $ANTLR start "entryRuleFromEntry"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1705:1: entryRuleFromEntry returns [EObject current=null] : iv_ruleFromEntry= ruleFromEntry EOF ;
    public final EObject entryRuleFromEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromEntry = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1706:2: (iv_ruleFromEntry= ruleFromEntry EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1707:2: iv_ruleFromEntry= ruleFromEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromEntryRule()); 
            }
            pushFollow(FOLLOW_ruleFromEntry_in_entryRuleFromEntry3575);
            iv_ruleFromEntry=ruleFromEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromEntry3585); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1714:1: ruleFromEntry returns [EObject current=null] : (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection ) ;
    public final EObject ruleFromEntry() throws RecognitionException {
        EObject current = null;

        EObject this_FromClass_0 = null;

        EObject this_FromCollection_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1717:28: ( (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1718:1: (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1718:1: (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            else if ( (LA25_0==KEYWORD_14) ) {
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1719:2: this_FromClass_0= ruleFromClass
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromEntryAccess().getFromClassParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFromClass_in_ruleFromEntry3635);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1732:2: this_FromCollection_1= ruleFromCollection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromEntryAccess().getFromCollectionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFromCollection_in_ruleFromEntry3665);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1751:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1752:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1753:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3699);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration3709); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1760:1: ruleVariableDeclaration returns [EObject current=null] : ( (otherlv_0= KEYWORD_12 )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1763:28: ( ( (otherlv_0= KEYWORD_12 )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1764:1: ( (otherlv_0= KEYWORD_12 )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1764:1: ( (otherlv_0= KEYWORD_12 )? ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1764:2: (otherlv_0= KEYWORD_12 )? ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1764:2: (otherlv_0= KEYWORD_12 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==KEYWORD_12) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1765:2: otherlv_0= KEYWORD_12
                    {
                    otherlv_0=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleVariableDeclaration3748); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getASKeyword_0());
                          
                    }

                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1769:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1770:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1770:1: (lv_name_1_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1771:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration3766); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1795:1: entryRuleFromClass returns [EObject current=null] : iv_ruleFromClass= ruleFromClass EOF ;
    public final EObject entryRuleFromClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClass = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1796:2: (iv_ruleFromClass= ruleFromClass EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1797:2: iv_ruleFromClass= ruleFromClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromClassRule()); 
            }
            pushFollow(FOLLOW_ruleFromClass_in_entryRuleFromClass3806);
            iv_ruleFromClass=ruleFromClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClass3816); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1804:1: ruleFromClass returns [EObject current=null] : (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar ) ;
    public final EObject ruleFromClass() throws RecognitionException {
        EObject current = null;

        EObject this_FromClassId_0 = null;

        EObject this_FromClassVar_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1807:28: ( (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1808:1: (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1808:1: (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar )
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1809:2: this_FromClassId_0= ruleFromClassId
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromClassAccess().getFromClassIdParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFromClassId_in_ruleFromClass3866);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1822:2: this_FromClassVar_1= ruleFromClassVar
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromClassAccess().getFromClassVarParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFromClassVar_in_ruleFromClass3896);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1841:1: entryRuleQualifiedIdentifier returns [String current=null] : iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF ;
    public final String entryRuleQualifiedIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedIdentifier = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1842:1: (iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1843:2: iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier3931);
            iv_ruleQualifiedIdentifier=ruleQualifiedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedIdentifier3942); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1850:1: ruleQualifiedIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= KEYWORD_4 this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1854:6: ( (this_ID_0= RULE_ID (kw= KEYWORD_4 this_ID_2= RULE_ID )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1855:1: (this_ID_0= RULE_ID (kw= KEYWORD_4 this_ID_2= RULE_ID )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1855:1: (this_ID_0= RULE_ID (kw= KEYWORD_4 this_ID_2= RULE_ID )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1855:6: this_ID_0= RULE_ID (kw= KEYWORD_4 this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier3982); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1862:1: (kw= KEYWORD_4 this_ID_2= RULE_ID )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==KEYWORD_4) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1863:2: kw= KEYWORD_4 this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleQualifiedIdentifier4001); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier4016); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // $ANTLR end "ruleQualifiedIdentifier"


    // $ANTLR start "entryRuleFromClassId"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1883:1: entryRuleFromClassId returns [EObject current=null] : iv_ruleFromClassId= ruleFromClassId EOF ;
    public final EObject entryRuleFromClassId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClassId = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1884:2: (iv_ruleFromClassId= ruleFromClassId EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1885:2: iv_ruleFromClassId= ruleFromClassId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromClassIdRule()); 
            }
            pushFollow(FOLLOW_ruleFromClassId_in_entryRuleFromClassId4062);
            iv_ruleFromClassId=ruleFromClassId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromClassId; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClassId4072); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1892:1: ruleFromClassId returns [EObject current=null] : ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ;
    public final EObject ruleFromClassId() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1895:28: ( ( (lv_type_0_0= ruleQualifiedIdentifier ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1896:1: ( (lv_type_0_0= ruleQualifiedIdentifier ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1896:1: ( (lv_type_0_0= ruleQualifiedIdentifier ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1897:1: (lv_type_0_0= ruleQualifiedIdentifier )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1897:1: (lv_type_0_0= ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1898:3: lv_type_0_0= ruleQualifiedIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromClassIdAccess().getTypeQualifiedIdentifierParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleFromClassId4117);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1922:1: entryRuleFromClassVar returns [EObject current=null] : iv_ruleFromClassVar= ruleFromClassVar EOF ;
    public final EObject entryRuleFromClassVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClassVar = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1923:2: (iv_ruleFromClassVar= ruleFromClassVar EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1924:2: iv_ruleFromClassVar= ruleFromClassVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromClassVarRule()); 
            }
            pushFollow(FOLLOW_ruleFromClassVar_in_entryRuleFromClassVar4151);
            iv_ruleFromClassVar=ruleFromClassVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromClassVar; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClassVar4161); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1931:1: ruleFromClassVar returns [EObject current=null] : ( ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* ) ;
    public final EObject ruleFromClassVar() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_joins_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1934:28: ( ( ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1935:1: ( ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1935:1: ( ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1935:2: ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )*
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1935:2: ( (lv_type_0_0= ruleQualifiedIdentifier ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1936:1: (lv_type_0_0= ruleQualifiedIdentifier )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1936:1: (lv_type_0_0= ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1937:3: lv_type_0_0= ruleQualifiedIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromClassVarAccess().getTypeQualifiedIdentifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleFromClassVar4207);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1953:2: ( (lv_variable_1_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1954:1: (lv_variable_1_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1954:1: (lv_variable_1_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1955:3: lv_variable_1_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromClassVarAccess().getVariableVariableDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleFromClassVar4228);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1971:2: ( (lv_joins_2_0= ruleFromJoin ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==KEYWORD_46||(LA29_0>=KEYWORD_33 && LA29_0<=KEYWORD_34)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1972:1: (lv_joins_2_0= ruleFromJoin )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1972:1: (lv_joins_2_0= ruleFromJoin )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1973:3: lv_joins_2_0= ruleFromJoin
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFromClassVarAccess().getJoinsFromJoinParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFromJoin_in_ruleFromClassVar4249);
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
    // $ANTLR end "ruleFromClassVar"


    // $ANTLR start "entryRuleFromCollection"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1997:1: entryRuleFromCollection returns [EObject current=null] : iv_ruleFromCollection= ruleFromCollection EOF ;
    public final EObject entryRuleFromCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromCollection = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1998:2: (iv_ruleFromCollection= ruleFromCollection EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1999:2: iv_ruleFromCollection= ruleFromCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromCollectionRule()); 
            }
            pushFollow(FOLLOW_ruleFromCollection_in_entryRuleFromCollection4285);
            iv_ruleFromCollection=ruleFromCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromCollection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromCollection4295); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2006:1: ruleFromCollection returns [EObject current=null] : (otherlv_0= KEYWORD_14 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleFromCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_path_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2009:28: ( (otherlv_0= KEYWORD_14 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2010:1: (otherlv_0= KEYWORD_14 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2010:1: (otherlv_0= KEYWORD_14 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2011:2: otherlv_0= KEYWORD_14 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleFromCollection4333); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFromCollectionAccess().getINKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleFromCollection4345); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFromCollectionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2020:1: ( (lv_path_2_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2021:1: (lv_path_2_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2021:1: (lv_path_2_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2022:3: lv_path_2_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromCollectionAccess().getPathAliasAttributeExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleFromCollection4365);
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

            otherlv_3=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleFromCollection4378); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFromCollectionAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2043:1: ( (lv_variable_4_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2044:1: (lv_variable_4_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2044:1: (lv_variable_4_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2045:3: lv_variable_4_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromCollectionAccess().getVariableVariableDeclarationParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleFromCollection4398);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2069:1: entryRuleFromJoin returns [EObject current=null] : iv_ruleFromJoin= ruleFromJoin EOF ;
    public final EObject entryRuleFromJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromJoin = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2070:2: (iv_ruleFromJoin= ruleFromJoin EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2071:2: iv_ruleFromJoin= ruleFromJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromJoinRule()); 
            }
            pushFollow(FOLLOW_ruleFromJoin_in_entryRuleFromJoin4433);
            iv_ruleFromJoin=ruleFromJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromJoin4443); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2078:1: ruleFromJoin returns [EObject current=null] : (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin ) ;
    public final EObject ruleFromJoin() throws RecognitionException {
        EObject current = null;

        EObject this_Join_0 = null;

        EObject this_LeftJoin_1 = null;

        EObject this_InnerJoin_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2081:28: ( (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2082:1: (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2082:1: (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin )
            int alt30=3;
            switch ( input.LA(1) ) {
            case KEYWORD_33:
                {
                alt30=1;
                }
                break;
            case KEYWORD_34:
                {
                alt30=2;
                }
                break;
            case KEYWORD_46:
                {
                alt30=3;
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2083:2: this_Join_0= ruleJoin
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromJoinAccess().getJoinParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJoin_in_ruleFromJoin4493);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2096:2: this_LeftJoin_1= ruleLeftJoin
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromJoinAccess().getLeftJoinParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLeftJoin_in_ruleFromJoin4523);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2109:2: this_InnerJoin_2= ruleInnerJoin
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromJoinAccess().getInnerJoinParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInnerJoin_in_ruleFromJoin4553);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2128:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2129:2: (iv_ruleJoin= ruleJoin EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2130:2: iv_ruleJoin= ruleJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinRule()); 
            }
            pushFollow(FOLLOW_ruleJoin_in_entryRuleJoin4587);
            iv_ruleJoin=ruleJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoin4597); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2137:1: ruleJoin returns [EObject current=null] : (otherlv_0= KEYWORD_33 ( (lv_isFetch_1_0= KEYWORD_44 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isFetch_1_0=null;
        EObject lv_path_2_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2140:28: ( (otherlv_0= KEYWORD_33 ( (lv_isFetch_1_0= KEYWORD_44 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2141:1: (otherlv_0= KEYWORD_33 ( (lv_isFetch_1_0= KEYWORD_44 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2141:1: (otherlv_0= KEYWORD_33 ( (lv_isFetch_1_0= KEYWORD_44 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2142:2: otherlv_0= KEYWORD_33 ( (lv_isFetch_1_0= KEYWORD_44 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleJoin4635); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJoinAccess().getJOINKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2146:1: ( (lv_isFetch_1_0= KEYWORD_44 ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==KEYWORD_44) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2147:1: (lv_isFetch_1_0= KEYWORD_44 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2147:1: (lv_isFetch_1_0= KEYWORD_44 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2148:3: lv_isFetch_1_0= KEYWORD_44
                    {
                    lv_isFetch_1_0=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleJoin4653); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2162:3: ( (lv_path_2_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2163:1: (lv_path_2_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2163:1: (lv_path_2_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2164:3: lv_path_2_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinAccess().getPathAliasAttributeExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleJoin4686);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2180:2: ( (lv_variable_3_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2181:1: (lv_variable_3_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2181:1: (lv_variable_3_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2182:3: lv_variable_3_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinAccess().getVariableVariableDeclarationParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleJoin4707);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2206:1: entryRuleLeftJoin returns [EObject current=null] : iv_ruleLeftJoin= ruleLeftJoin EOF ;
    public final EObject entryRuleLeftJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftJoin = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2207:2: (iv_ruleLeftJoin= ruleLeftJoin EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2208:2: iv_ruleLeftJoin= ruleLeftJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeftJoinRule()); 
            }
            pushFollow(FOLLOW_ruleLeftJoin_in_entryRuleLeftJoin4742);
            iv_ruleLeftJoin=ruleLeftJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeftJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftJoin4752); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2215:1: ruleLeftJoin returns [EObject current=null] : (otherlv_0= KEYWORD_34 ( (lv_isOuter_1_0= KEYWORD_49 ) )? otherlv_2= KEYWORD_33 ( (lv_isFetch_3_0= KEYWORD_44 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2218:28: ( (otherlv_0= KEYWORD_34 ( (lv_isOuter_1_0= KEYWORD_49 ) )? otherlv_2= KEYWORD_33 ( (lv_isFetch_3_0= KEYWORD_44 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2219:1: (otherlv_0= KEYWORD_34 ( (lv_isOuter_1_0= KEYWORD_49 ) )? otherlv_2= KEYWORD_33 ( (lv_isFetch_3_0= KEYWORD_44 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2219:1: (otherlv_0= KEYWORD_34 ( (lv_isOuter_1_0= KEYWORD_49 ) )? otherlv_2= KEYWORD_33 ( (lv_isFetch_3_0= KEYWORD_44 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2220:2: otherlv_0= KEYWORD_34 ( (lv_isOuter_1_0= KEYWORD_49 ) )? otherlv_2= KEYWORD_33 ( (lv_isFetch_3_0= KEYWORD_44 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleLeftJoin4790); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLeftJoinAccess().getLEFTKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2224:1: ( (lv_isOuter_1_0= KEYWORD_49 ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==KEYWORD_49) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2225:1: (lv_isOuter_1_0= KEYWORD_49 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2225:1: (lv_isOuter_1_0= KEYWORD_49 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2226:3: lv_isOuter_1_0= KEYWORD_49
                    {
                    lv_isOuter_1_0=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleLeftJoin4808); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleLeftJoin4833); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLeftJoinAccess().getJOINKeyword_2());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2245:1: ( (lv_isFetch_3_0= KEYWORD_44 ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==KEYWORD_44) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2246:1: (lv_isFetch_3_0= KEYWORD_44 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2246:1: (lv_isFetch_3_0= KEYWORD_44 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2247:3: lv_isFetch_3_0= KEYWORD_44
                    {
                    lv_isFetch_3_0=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleLeftJoin4851); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2261:3: ( (lv_path_4_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2262:1: (lv_path_4_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2262:1: (lv_path_4_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2263:3: lv_path_4_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLeftJoinAccess().getPathAliasAttributeExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleLeftJoin4884);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2279:2: ( (lv_variable_5_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2280:1: (lv_variable_5_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2280:1: (lv_variable_5_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2281:3: lv_variable_5_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLeftJoinAccess().getVariableVariableDeclarationParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleLeftJoin4905);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2305:1: entryRuleInnerJoin returns [EObject current=null] : iv_ruleInnerJoin= ruleInnerJoin EOF ;
    public final EObject entryRuleInnerJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerJoin = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2306:2: (iv_ruleInnerJoin= ruleInnerJoin EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2307:2: iv_ruleInnerJoin= ruleInnerJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInnerJoinRule()); 
            }
            pushFollow(FOLLOW_ruleInnerJoin_in_entryRuleInnerJoin4940);
            iv_ruleInnerJoin=ruleInnerJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInnerJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInnerJoin4950); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2314:1: ruleInnerJoin returns [EObject current=null] : (otherlv_0= KEYWORD_46 otherlv_1= KEYWORD_33 ( (lv_isFetch_2_0= KEYWORD_44 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleInnerJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isFetch_2_0=null;
        EObject lv_path_3_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2317:28: ( (otherlv_0= KEYWORD_46 otherlv_1= KEYWORD_33 ( (lv_isFetch_2_0= KEYWORD_44 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2318:1: (otherlv_0= KEYWORD_46 otherlv_1= KEYWORD_33 ( (lv_isFetch_2_0= KEYWORD_44 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2318:1: (otherlv_0= KEYWORD_46 otherlv_1= KEYWORD_33 ( (lv_isFetch_2_0= KEYWORD_44 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2319:2: otherlv_0= KEYWORD_46 otherlv_1= KEYWORD_33 ( (lv_isFetch_2_0= KEYWORD_44 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleInnerJoin4988); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInnerJoinAccess().getINNERKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleInnerJoin5000); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInnerJoinAccess().getJOINKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2328:1: ( (lv_isFetch_2_0= KEYWORD_44 ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==KEYWORD_44) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2329:1: (lv_isFetch_2_0= KEYWORD_44 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2329:1: (lv_isFetch_2_0= KEYWORD_44 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2330:3: lv_isFetch_2_0= KEYWORD_44
                    {
                    lv_isFetch_2_0=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleInnerJoin5018); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2344:3: ( (lv_path_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2345:1: (lv_path_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2345:1: (lv_path_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2346:3: lv_path_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInnerJoinAccess().getPathAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleInnerJoin5051);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2362:2: ( (lv_variable_4_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2363:1: (lv_variable_4_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2363:1: (lv_variable_4_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2364:3: lv_variable_4_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInnerJoinAccess().getVariableVariableDeclarationParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInnerJoin5072);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2388:1: entryRuleWhereClause returns [EObject current=null] : iv_ruleWhereClause= ruleWhereClause EOF ;
    public final EObject entryRuleWhereClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2389:2: (iv_ruleWhereClause= ruleWhereClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2390:2: iv_ruleWhereClause= ruleWhereClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhereClauseRule()); 
            }
            pushFollow(FOLLOW_ruleWhereClause_in_entryRuleWhereClause5107);
            iv_ruleWhereClause=ruleWhereClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhereClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhereClause5117); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2397:1: ruleWhereClause returns [EObject current=null] : (otherlv_0= KEYWORD_51 ( (lv_whereEntry_1_0= ruleOrExpression ) ) ) ;
    public final EObject ruleWhereClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_whereEntry_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2400:28: ( (otherlv_0= KEYWORD_51 ( (lv_whereEntry_1_0= ruleOrExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2401:1: (otherlv_0= KEYWORD_51 ( (lv_whereEntry_1_0= ruleOrExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2401:1: (otherlv_0= KEYWORD_51 ( (lv_whereEntry_1_0= ruleOrExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2402:2: otherlv_0= KEYWORD_51 ( (lv_whereEntry_1_0= ruleOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleWhereClause5155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhereClauseAccess().getWHEREKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2406:1: ( (lv_whereEntry_1_0= ruleOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2407:1: (lv_whereEntry_1_0= ruleOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2407:1: (lv_whereEntry_1_0= ruleOrExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2408:3: lv_whereEntry_1_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhereClauseAccess().getWhereEntryOrExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleWhereClause5175);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2432:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2433:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2434:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression5210);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression5220); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2441:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2444:28: ( (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2445:1: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2445:1: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2446:2: this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression5270);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_AndExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2457:1: ( () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==KEYWORD_17) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2457:2: () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2457:2: ()
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2458:2: 
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

                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2466:2: (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==KEYWORD_17) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2467:2: otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleOrExpression5296); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getORKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2471:1: ( (lv_entries_3_0= ruleAndExpression ) )
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2472:1: (lv_entries_3_0= ruleAndExpression )
                    	    {
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2472:1: (lv_entries_3_0= ruleAndExpression )
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2473:3: lv_entries_3_0= ruleAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getEntriesAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression5316);
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
                    	    if ( cnt35 >= 1 ) break loop35;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2497:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2498:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2499:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression5355);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression5365); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2506:1: ruleAndExpression returns [EObject current=null] : (this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ConcreteExpression_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2509:28: ( (this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2510:1: (this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2510:1: (this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2511:2: this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getConcreteExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConcreteExpression_in_ruleAndExpression5415);
            this_ConcreteExpression_0=ruleConcreteExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ConcreteExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2522:1: ( () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==KEYWORD_20) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2522:2: () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2522:2: ()
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2523:2: 
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

                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2531:2: (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==KEYWORD_20) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2532:2: otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleAndExpression5441); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getANDKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2536:1: ( (lv_entries_3_0= ruleConcreteExpression ) )
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2537:1: (lv_entries_3_0= ruleConcreteExpression )
                    	    {
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2537:1: (lv_entries_3_0= ruleConcreteExpression )
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2538:3: lv_entries_3_0= ruleConcreteExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getEntriesConcreteExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleConcreteExpression_in_ruleAndExpression5461);
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
                    	    if ( cnt37 >= 1 ) break loop37;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2562:1: entryRuleConcreteExpression returns [EObject current=null] : iv_ruleConcreteExpression= ruleConcreteExpression EOF ;
    public final EObject entryRuleConcreteExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2563:2: (iv_ruleConcreteExpression= ruleConcreteExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2564:2: iv_ruleConcreteExpression= ruleConcreteExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcreteExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConcreteExpression_in_entryRuleConcreteExpression5500);
            iv_ruleConcreteExpression=ruleConcreteExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcreteExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcreteExpression5510); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2571:1: ruleConcreteExpression returns [EObject current=null] : (this_ParExpression_0= ruleParExpression | this_ComparisonOperatorExpression_1= ruleComparisonOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2574:28: ( (this_ParExpression_0= ruleParExpression | this_ComparisonOperatorExpression_1= ruleComparisonOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2575:1: (this_ParExpression_0= ruleParExpression | this_ComparisonOperatorExpression_1= ruleComparisonOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2575:1: (this_ParExpression_0= ruleParExpression | this_ComparisonOperatorExpression_1= ruleComparisonOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression )
            int alt39=12;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2576:2: this_ParExpression_0= ruleParExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getParExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParExpression_in_ruleConcreteExpression5560);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2589:2: this_ComparisonOperatorExpression_1= ruleComparisonOperatorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getComparisonOperatorExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComparisonOperatorExpression_in_ruleConcreteExpression5590);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2602:2: this_ExistsExpression_2= ruleExistsExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getExistsExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExistsExpression_in_ruleConcreteExpression5620);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2615:2: this_AllExpression_3= ruleAllExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getAllExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAllExpression_in_ruleConcreteExpression5650);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2628:2: this_AnyExpression_4= ruleAnyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getAnyExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnyExpression_in_ruleConcreteExpression5680);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2641:2: this_SomeExpression_5= ruleSomeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getSomeExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSomeExpression_in_ruleConcreteExpression5710);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2654:2: this_CollectionExpression_6= ruleCollectionExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getCollectionExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCollectionExpression_in_ruleConcreteExpression5740);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2667:2: this_NullComparisonExpression_7= ruleNullComparisonExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getNullComparisonExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullComparisonExpression_in_ruleConcreteExpression5770);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2680:2: this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getEmptyComparisonExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEmptyComparisonExpression_in_ruleConcreteExpression5800);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2693:2: this_LikeExpression_9= ruleLikeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getLikeExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLikeExpression_in_ruleConcreteExpression5830);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2706:2: this_InExpression_10= ruleInExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getInExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInExpression_in_ruleConcreteExpression5860);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2719:2: this_BetweenExpression_11= ruleBetweenExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getBetweenExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBetweenExpression_in_ruleConcreteExpression5890);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2738:1: entryRuleParExpression returns [EObject current=null] : iv_ruleParExpression= ruleParExpression EOF ;
    public final EObject entryRuleParExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2739:2: (iv_ruleParExpression= ruleParExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2740:2: iv_ruleParExpression= ruleParExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParExpression_in_entryRuleParExpression5924);
            iv_ruleParExpression=ruleParExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParExpression5934); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2747:1: ruleParExpression returns [EObject current=null] : (otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2 ) ;
    public final EObject ruleParExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ExpressionTerm_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2750:28: ( (otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2751:1: (otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2751:1: (otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2752:2: otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleParExpression5972); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParExpressionAccess().getExpressionTermParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionTerm_in_ruleParExpression5996);
            this_ExpressionTerm_1=ruleExpressionTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ExpressionTerm_1;
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleParExpression6008); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2781:1: entryRuleComparisonOperatorExpression returns [EObject current=null] : iv_ruleComparisonOperatorExpression= ruleComparisonOperatorExpression EOF ;
    public final EObject entryRuleComparisonOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonOperatorExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2782:2: (iv_ruleComparisonOperatorExpression= ruleComparisonOperatorExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2783:2: iv_ruleComparisonOperatorExpression= ruleComparisonOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleComparisonOperatorExpression_in_entryRuleComparisonOperatorExpression6042);
            iv_ruleComparisonOperatorExpression=ruleComparisonOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonOperatorExpression6052); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2790:1: ruleComparisonOperatorExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) ) ) ;
    public final EObject ruleComparisonOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_rhs_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2793:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2794:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2794:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2794:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleComparisonOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2794:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2795:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2795:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2796:3: lv_lhs_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComparisonOperatorExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleComparisonOperatorExpression6098);
            lv_lhs_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getComparisonOperatorExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"lhs",
                      		lv_lhs_0_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2812:2: ( (lv_operator_1_0= ruleComparisonOperator ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2813:1: (lv_operator_1_0= ruleComparisonOperator )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2813:1: (lv_operator_1_0= ruleComparisonOperator )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2814:3: lv_operator_1_0= ruleComparisonOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComparisonOperatorExpressionAccess().getOperatorComparisonOperatorEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleComparisonOperator_in_ruleComparisonOperatorExpression6119);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2830:2: ( (lv_rhs_2_0= ruleExpressionTerm ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2831:1: (lv_rhs_2_0= ruleExpressionTerm )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2831:1: (lv_rhs_2_0= ruleExpressionTerm )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2832:3: lv_rhs_2_0= ruleExpressionTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComparisonOperatorExpressionAccess().getRhsExpressionTermParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpressionTerm_in_ruleComparisonOperatorExpression6140);
            lv_rhs_2_0=ruleExpressionTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getComparisonOperatorExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"rhs",
                      		lv_rhs_2_0, 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2856:1: entryRuleExistsExpression returns [EObject current=null] : iv_ruleExistsExpression= ruleExistsExpression EOF ;
    public final EObject entryRuleExistsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistsExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2857:2: (iv_ruleExistsExpression= ruleExistsExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2858:2: iv_ruleExistsExpression= ruleExistsExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExistsExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExistsExpression_in_entryRuleExistsExpression6175);
            iv_ruleExistsExpression=ruleExistsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExistsExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExistsExpression6185); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2865:1: ruleExistsExpression returns [EObject current=null] : ( ( (lv_isNot_0_0= KEYWORD_28 ) )? otherlv_1= KEYWORD_54 ( (lv_query_2_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleExistsExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_0_0=null;
        Token otherlv_1=null;
        EObject lv_query_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2868:28: ( ( ( (lv_isNot_0_0= KEYWORD_28 ) )? otherlv_1= KEYWORD_54 ( (lv_query_2_0= ruleQueryExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2869:1: ( ( (lv_isNot_0_0= KEYWORD_28 ) )? otherlv_1= KEYWORD_54 ( (lv_query_2_0= ruleQueryExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2869:1: ( ( (lv_isNot_0_0= KEYWORD_28 ) )? otherlv_1= KEYWORD_54 ( (lv_query_2_0= ruleQueryExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2869:2: ( (lv_isNot_0_0= KEYWORD_28 ) )? otherlv_1= KEYWORD_54 ( (lv_query_2_0= ruleQueryExpression ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2869:2: ( (lv_isNot_0_0= KEYWORD_28 ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==KEYWORD_28) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2870:1: (lv_isNot_0_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2870:1: (lv_isNot_0_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2871:3: lv_isNot_0_0= KEYWORD_28
                    {
                    lv_isNot_0_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleExistsExpression6229); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleExistsExpression6254); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExistsExpressionAccess().getEXISTSKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2890:1: ( (lv_query_2_0= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2891:1: (lv_query_2_0= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2891:1: (lv_query_2_0= ruleQueryExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2892:3: lv_query_2_0= ruleQueryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExistsExpressionAccess().getQueryQueryExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleExistsExpression6274);
            lv_query_2_0=ruleQueryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExistsExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"query",
                      		lv_query_2_0, 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2916:1: entryRuleAllExpression returns [EObject current=null] : iv_ruleAllExpression= ruleAllExpression EOF ;
    public final EObject entryRuleAllExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2917:2: (iv_ruleAllExpression= ruleAllExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2918:2: iv_ruleAllExpression= ruleAllExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAllExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAllExpression_in_entryRuleAllExpression6309);
            iv_ruleAllExpression=ruleAllExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAllExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllExpression6319); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2925:1: ruleAllExpression returns [EObject current=null] : (otherlv_0= KEYWORD_19 ( (lv_query_1_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleAllExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_query_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2928:28: ( (otherlv_0= KEYWORD_19 ( (lv_query_1_0= ruleQueryExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2929:1: (otherlv_0= KEYWORD_19 ( (lv_query_1_0= ruleQueryExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2929:1: (otherlv_0= KEYWORD_19 ( (lv_query_1_0= ruleQueryExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2930:2: otherlv_0= KEYWORD_19 ( (lv_query_1_0= ruleQueryExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleAllExpression6357); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAllExpressionAccess().getALLKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2934:1: ( (lv_query_1_0= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2935:1: (lv_query_1_0= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2935:1: (lv_query_1_0= ruleQueryExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2936:3: lv_query_1_0= ruleQueryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAllExpressionAccess().getQueryQueryExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleAllExpression6377);
            lv_query_1_0=ruleQueryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAllExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"query",
                      		lv_query_1_0, 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2960:1: entryRuleAnyExpression returns [EObject current=null] : iv_ruleAnyExpression= ruleAnyExpression EOF ;
    public final EObject entryRuleAnyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2961:2: (iv_ruleAnyExpression= ruleAnyExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2962:2: iv_ruleAnyExpression= ruleAnyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAnyExpression_in_entryRuleAnyExpression6412);
            iv_ruleAnyExpression=ruleAnyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnyExpression6422); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2969:1: ruleAnyExpression returns [EObject current=null] : (otherlv_0= KEYWORD_21 ( (lv_query_1_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleAnyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_query_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2972:28: ( (otherlv_0= KEYWORD_21 ( (lv_query_1_0= ruleQueryExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2973:1: (otherlv_0= KEYWORD_21 ( (lv_query_1_0= ruleQueryExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2973:1: (otherlv_0= KEYWORD_21 ( (lv_query_1_0= ruleQueryExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2974:2: otherlv_0= KEYWORD_21 ( (lv_query_1_0= ruleQueryExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleAnyExpression6460); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnyExpressionAccess().getANYKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2978:1: ( (lv_query_1_0= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2979:1: (lv_query_1_0= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2979:1: (lv_query_1_0= ruleQueryExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2980:3: lv_query_1_0= ruleQueryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnyExpressionAccess().getQueryQueryExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleAnyExpression6480);
            lv_query_1_0=ruleQueryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"query",
                      		lv_query_1_0, 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3004:1: entryRuleSomeExpression returns [EObject current=null] : iv_ruleSomeExpression= ruleSomeExpression EOF ;
    public final EObject entryRuleSomeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSomeExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3005:2: (iv_ruleSomeExpression= ruleSomeExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3006:2: iv_ruleSomeExpression= ruleSomeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSomeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSomeExpression_in_entryRuleSomeExpression6515);
            iv_ruleSomeExpression=ruleSomeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSomeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSomeExpression6525); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3013:1: ruleSomeExpression returns [EObject current=null] : (otherlv_0= KEYWORD_38 ( (lv_query_1_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleSomeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_query_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3016:28: ( (otherlv_0= KEYWORD_38 ( (lv_query_1_0= ruleQueryExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3017:1: (otherlv_0= KEYWORD_38 ( (lv_query_1_0= ruleQueryExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3017:1: (otherlv_0= KEYWORD_38 ( (lv_query_1_0= ruleQueryExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3018:2: otherlv_0= KEYWORD_38 ( (lv_query_1_0= ruleQueryExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleSomeExpression6563); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSomeExpressionAccess().getSOMEKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3022:1: ( (lv_query_1_0= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3023:1: (lv_query_1_0= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3023:1: (lv_query_1_0= ruleQueryExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3024:3: lv_query_1_0= ruleQueryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSomeExpressionAccess().getQueryQueryExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleSomeExpression6583);
            lv_query_1_0=ruleQueryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSomeExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"query",
                      		lv_query_1_0, 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3048:1: entryRuleCollectionExpression returns [EObject current=null] : iv_ruleCollectionExpression= ruleCollectionExpression EOF ;
    public final EObject entryRuleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3049:2: (iv_ruleCollectionExpression= ruleCollectionExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3050:2: iv_ruleCollectionExpression= ruleCollectionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression6618);
            iv_ruleCollectionExpression=ruleCollectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionExpression6628); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3057:1: ruleCollectionExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_58 (otherlv_3= KEYWORD_16 )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) ) ) ;
    public final EObject ruleCollectionExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3060:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_58 (otherlv_3= KEYWORD_16 )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3061:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_58 (otherlv_3= KEYWORD_16 )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3061:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_58 (otherlv_3= KEYWORD_16 )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3061:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_58 (otherlv_3= KEYWORD_16 )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3061:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3062:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3062:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3063:3: lv_lhs_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleCollectionExpression6674);
            lv_lhs_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCollectionExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"lhs",
                      		lv_lhs_0_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3079:2: ( (lv_isNot_1_0= KEYWORD_28 ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==KEYWORD_28) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3080:1: (lv_isNot_1_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3080:1: (lv_isNot_1_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3081:3: lv_isNot_1_0= KEYWORD_28
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleCollectionExpression6693); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleCollectionExpression6718); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCollectionExpressionAccess().getMEMBERKeyword_2());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3100:1: (otherlv_3= KEYWORD_16 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==KEYWORD_16) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3101:2: otherlv_3= KEYWORD_16
                    {
                    otherlv_3=(Token)match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleCollectionExpression6731); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCollectionExpressionAccess().getOFKeyword_3());
                          
                    }

                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3105:3: ( (lv_rhs_4_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3106:1: (lv_rhs_4_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3106:1: (lv_rhs_4_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3107:3: lv_rhs_4_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionExpressionAccess().getRhsAliasAttributeExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleCollectionExpression6753);
            lv_rhs_4_0=ruleAliasAttributeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCollectionExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"rhs",
                      		lv_rhs_4_0, 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3131:1: entryRuleNullComparisonExpression returns [EObject current=null] : iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF ;
    public final EObject entryRuleNullComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullComparisonExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3132:2: (iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3133:2: iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullComparisonExpression_in_entryRuleNullComparisonExpression6788);
            iv_ruleNullComparisonExpression=ruleNullComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullComparisonExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullComparisonExpression6798); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3140:1: ruleNullComparisonExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_36 ) ;
    public final EObject ruleNullComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isNot_2_0=null;
        Token otherlv_3=null;
        EObject lv_lhs_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3143:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_36 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3144:1: ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_36 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3144:1: ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_36 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3144:2: ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_36
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3144:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3145:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3145:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3146:3: lv_lhs_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNullComparisonExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleNullComparisonExpression6844);
            lv_lhs_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNullComparisonExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"lhs",
                      		lv_lhs_0_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleNullComparisonExpression6857); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNullComparisonExpressionAccess().getISKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3167:1: ( (lv_isNot_2_0= KEYWORD_28 ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==KEYWORD_28) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3168:1: (lv_isNot_2_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3168:1: (lv_isNot_2_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3169:3: lv_isNot_2_0= KEYWORD_28
                    {
                    lv_isNot_2_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleNullComparisonExpression6875); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleNullComparisonExpression6900); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3196:1: entryRuleEmptyComparisonExpression returns [EObject current=null] : iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF ;
    public final EObject entryRuleEmptyComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyComparisonExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3197:2: (iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3198:2: iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmptyComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEmptyComparisonExpression_in_entryRuleEmptyComparisonExpression6934);
            iv_ruleEmptyComparisonExpression=ruleEmptyComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmptyComparisonExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmptyComparisonExpression6944); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3205:1: ruleEmptyComparisonExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_42 ) ;
    public final EObject ruleEmptyComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isNot_2_0=null;
        Token otherlv_3=null;
        EObject lv_lhs_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3208:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_42 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3209:1: ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_42 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3209:1: ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_42 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3209:2: ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_42
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3209:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3210:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3210:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3211:3: lv_lhs_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEmptyComparisonExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleEmptyComparisonExpression6990);
            lv_lhs_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEmptyComparisonExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"lhs",
                      		lv_lhs_0_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleEmptyComparisonExpression7003); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEmptyComparisonExpressionAccess().getISKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3232:1: ( (lv_isNot_2_0= KEYWORD_28 ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==KEYWORD_28) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3233:1: (lv_isNot_2_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3233:1: (lv_isNot_2_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3234:3: lv_isNot_2_0= KEYWORD_28
                    {
                    lv_isNot_2_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleEmptyComparisonExpression7021); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleEmptyComparisonExpression7046); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3261:1: entryRuleLikeExpression returns [EObject current=null] : iv_ruleLikeExpression= ruleLikeExpression EOF ;
    public final EObject entryRuleLikeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLikeExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3262:2: (iv_ruleLikeExpression= ruleLikeExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3263:2: iv_ruleLikeExpression= ruleLikeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLikeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLikeExpression_in_entryRuleLikeExpression7080);
            iv_ruleLikeExpression=ruleLikeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLikeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLikeExpression7090); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3270:1: ruleLikeExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_35 ( (lv_pattern_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleLikeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        Token lv_pattern_3_0=null;
        EObject lv_lhs_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3273:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_35 ( (lv_pattern_3_0= RULE_STRING ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3274:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_35 ( (lv_pattern_3_0= RULE_STRING ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3274:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_35 ( (lv_pattern_3_0= RULE_STRING ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3274:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_35 ( (lv_pattern_3_0= RULE_STRING ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3274:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3275:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3275:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3276:3: lv_lhs_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLikeExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleLikeExpression7136);
            lv_lhs_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLikeExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"lhs",
                      		lv_lhs_0_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3292:2: ( (lv_isNot_1_0= KEYWORD_28 ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==KEYWORD_28) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3293:1: (lv_isNot_1_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3293:1: (lv_isNot_1_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3294:3: lv_isNot_1_0= KEYWORD_28
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleLikeExpression7155); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleLikeExpression7180); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLikeExpressionAccess().getLIKEKeyword_2());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3313:1: ( (lv_pattern_3_0= RULE_STRING ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3314:1: (lv_pattern_3_0= RULE_STRING )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3314:1: (lv_pattern_3_0= RULE_STRING )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3315:3: lv_pattern_3_0= RULE_STRING
            {
            lv_pattern_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLikeExpression7196); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_pattern_3_0, grammarAccess.getLikeExpressionAccess().getPatternSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLikeExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"pattern",
                      		lv_pattern_3_0, 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3339:1: entryRuleInExpression returns [EObject current=null] : iv_ruleInExpression= ruleInExpression EOF ;
    public final EObject entryRuleInExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3340:2: (iv_ruleInExpression= ruleInExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3341:2: iv_ruleInExpression= ruleInExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInExpression_in_entryRuleInExpression7236);
            iv_ruleInExpression=ruleInExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInExpression7246); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3348:1: ruleInExpression returns [EObject current=null] : (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression ) ;
    public final EObject ruleInExpression() throws RecognitionException {
        EObject current = null;

        EObject this_InSeqExpression_0 = null;

        EObject this_InQueryExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3351:28: ( (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3352:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3352:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )
            int alt46=2;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3353:2: this_InSeqExpression_0= ruleInSeqExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInExpressionAccess().getInSeqExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInSeqExpression_in_ruleInExpression7296);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3366:2: this_InQueryExpression_1= ruleInQueryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInExpressionAccess().getInQueryExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInQueryExpression_in_ruleInExpression7326);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3385:1: entryRuleInSeqExpression returns [EObject current=null] : iv_ruleInSeqExpression= ruleInSeqExpression EOF ;
    public final EObject entryRuleInSeqExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInSeqExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3386:2: (iv_ruleInSeqExpression= ruleInSeqExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3387:2: iv_ruleInSeqExpression= ruleInSeqExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInSeqExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInSeqExpression_in_entryRuleInSeqExpression7360);
            iv_ruleInSeqExpression=ruleInSeqExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInSeqExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInSeqExpression7370); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3394:1: ruleInSeqExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2 ) ;
    public final EObject ruleInSeqExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_items_4_0 = null;

        EObject lv_items_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3397:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3398:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3398:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3398:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3398:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3399:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3399:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3400:3: lv_lhs_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInSeqExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7416);
            lv_lhs_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInSeqExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"lhs",
                      		lv_lhs_0_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3416:2: ( (lv_isNot_1_0= KEYWORD_28 ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==KEYWORD_28) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3417:1: (lv_isNot_1_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3417:1: (lv_isNot_1_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3418:3: lv_isNot_1_0= KEYWORD_28
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleInSeqExpression7435); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleInSeqExpression7460); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInSeqExpressionAccess().getINKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleInSeqExpression7472); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInSeqExpressionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3442:1: ( (lv_items_4_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3443:1: (lv_items_4_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3443:1: (lv_items_4_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3444:3: lv_items_4_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInSeqExpressionAccess().getItemsVariableParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7492);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3460:2: (otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==KEYWORD_3) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3461:2: otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) )
            	    {
            	    otherlv_5=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleInSeqExpression7506); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getInSeqExpressionAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3465:1: ( (lv_items_6_0= ruleVariable ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3466:1: (lv_items_6_0= ruleVariable )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3466:1: (lv_items_6_0= ruleVariable )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3467:3: lv_items_6_0= ruleVariable
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInSeqExpressionAccess().getItemsVariableParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7526);
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
            	    break loop48;
                }
            } while (true);

            otherlv_7=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleInSeqExpression7541); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3496:1: entryRuleInQueryExpression returns [EObject current=null] : iv_ruleInQueryExpression= ruleInQueryExpression EOF ;
    public final EObject entryRuleInQueryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInQueryExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3497:2: (iv_ruleInQueryExpression= ruleInQueryExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3498:2: iv_ruleInQueryExpression= ruleInQueryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInQueryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInQueryExpression_in_entryRuleInQueryExpression7575);
            iv_ruleInQueryExpression=ruleInQueryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInQueryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInQueryExpression7585); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3505:1: ruleInQueryExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 ( (lv_query_3_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleInQueryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_query_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3508:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 ( (lv_query_3_0= ruleQueryExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3509:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 ( (lv_query_3_0= ruleQueryExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3509:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 ( (lv_query_3_0= ruleQueryExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3509:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 ( (lv_query_3_0= ruleQueryExpression ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3509:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3510:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3510:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3511:3: lv_lhs_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInQueryExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleInQueryExpression7631);
            lv_lhs_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInQueryExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"lhs",
                      		lv_lhs_0_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3527:2: ( (lv_isNot_1_0= KEYWORD_28 ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==KEYWORD_28) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3528:1: (lv_isNot_1_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3528:1: (lv_isNot_1_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3529:3: lv_isNot_1_0= KEYWORD_28
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleInQueryExpression7650); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleInQueryExpression7675); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInQueryExpressionAccess().getINKeyword_2());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3548:1: ( (lv_query_3_0= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3549:1: (lv_query_3_0= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3549:1: (lv_query_3_0= ruleQueryExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3550:3: lv_query_3_0= ruleQueryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInQueryExpressionAccess().getQueryQueryExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleInQueryExpression7695);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3574:1: entryRuleBetweenExpression returns [EObject current=null] : iv_ruleBetweenExpression= ruleBetweenExpression EOF ;
    public final EObject entryRuleBetweenExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBetweenExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3575:2: (iv_ruleBetweenExpression= ruleBetweenExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3576:2: iv_ruleBetweenExpression= ruleBetweenExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBetweenExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBetweenExpression_in_entryRuleBetweenExpression7730);
            iv_ruleBetweenExpression=ruleBetweenExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBetweenExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBetweenExpression7740); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3583:1: ruleBetweenExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_61 ( (lv_min_3_0= ruleValue ) ) otherlv_4= KEYWORD_20 ( (lv_max_5_0= ruleValue ) ) ) ;
    public final EObject ruleBetweenExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_min_3_0 = null;

        EObject lv_max_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3586:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_61 ( (lv_min_3_0= ruleValue ) ) otherlv_4= KEYWORD_20 ( (lv_max_5_0= ruleValue ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3587:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_61 ( (lv_min_3_0= ruleValue ) ) otherlv_4= KEYWORD_20 ( (lv_max_5_0= ruleValue ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3587:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_61 ( (lv_min_3_0= ruleValue ) ) otherlv_4= KEYWORD_20 ( (lv_max_5_0= ruleValue ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3587:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_61 ( (lv_min_3_0= ruleValue ) ) otherlv_4= KEYWORD_20 ( (lv_max_5_0= ruleValue ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3587:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3588:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3588:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3589:3: lv_lhs_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBetweenExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleBetweenExpression7786);
            lv_lhs_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBetweenExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"lhs",
                      		lv_lhs_0_0, 
                      		"Variable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3605:2: ( (lv_isNot_1_0= KEYWORD_28 ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==KEYWORD_28) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3606:1: (lv_isNot_1_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3606:1: (lv_isNot_1_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3607:3: lv_isNot_1_0= KEYWORD_28
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleBetweenExpression7805); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleBetweenExpression7830); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBetweenExpressionAccess().getBETWEENKeyword_2());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3626:1: ( (lv_min_3_0= ruleValue ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3627:1: (lv_min_3_0= ruleValue )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3627:1: (lv_min_3_0= ruleValue )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3628:3: lv_min_3_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBetweenExpressionAccess().getMinValueParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleBetweenExpression7850);
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

            otherlv_4=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleBetweenExpression7863); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBetweenExpressionAccess().getANDKeyword_4());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3649:1: ( (lv_max_5_0= ruleValue ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3650:1: (lv_max_5_0= ruleValue )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3650:1: (lv_max_5_0= ruleValue )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3651:3: lv_max_5_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBetweenExpressionAccess().getMaxValueParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleBetweenExpression7883);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3675:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3676:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3677:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable7918);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable7928); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3684:1: ruleVariable returns [EObject current=null] : (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_AliasAttributeExpression_0 = null;

        EObject this_ParameterExpression_1 = null;

        EObject this_Value_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3687:28: ( (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3688:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3688:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue )
            int alt51=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt51=1;
                }
                break;
            case KEYWORD_5:
                {
                alt51=2;
                }
                break;
            case KEYWORD_43:
            case KEYWORD_36:
            case KEYWORD_40:
            case RULE_INT:
            case RULE_STRING:
                {
                alt51=3;
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3689:2: this_AliasAttributeExpression_0= ruleAliasAttributeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccess().getAliasAttributeExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleVariable7978);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3702:2: this_ParameterExpression_1= ruleParameterExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccess().getParameterExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameterExpression_in_ruleVariable8008);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3715:2: this_Value_2= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccess().getValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleVariable8038);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3734:1: entryRuleExpressionTerm returns [EObject current=null] : iv_ruleExpressionTerm= ruleExpressionTerm EOF ;
    public final EObject entryRuleExpressionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionTerm = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3735:2: (iv_ruleExpressionTerm= ruleExpressionTerm EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3736:2: iv_ruleExpressionTerm= ruleExpressionTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionTermRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionTerm_in_entryRuleExpressionTerm8072);
            iv_ruleExpressionTerm=ruleExpressionTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionTerm8082); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3743:1: ruleExpressionTerm returns [EObject current=null] : (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression ) ;
    public final EObject ruleExpressionTerm() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_QueryExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3746:28: ( (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3747:1: (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3747:1: (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==KEYWORD_43||LA52_0==KEYWORD_36||LA52_0==KEYWORD_40||LA52_0==KEYWORD_5||(LA52_0>=RULE_ID && LA52_0<=RULE_STRING)) ) {
                alt52=1;
            }
            else if ( (LA52_0==KEYWORD_1) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3748:2: this_Variable_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionTermAccess().getVariableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleExpressionTerm8132);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3761:2: this_QueryExpression_1= ruleQueryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionTermAccess().getQueryExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQueryExpression_in_ruleExpressionTerm8162);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3780:1: entryRuleAliasAttributeExpression returns [EObject current=null] : iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF ;
    public final EObject entryRuleAliasAttributeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasAttributeExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3781:2: (iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3782:2: iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAliasAttributeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_entryRuleAliasAttributeExpression8196);
            iv_ruleAliasAttributeExpression=ruleAliasAttributeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAliasAttributeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAliasAttributeExpression8206); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3789:1: ruleAliasAttributeExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleAliasAttributeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_attributes_2_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3792:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3793:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3793:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3793:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )*
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3793:2: ( (otherlv_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3794:1: (otherlv_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3794:1: (otherlv_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3795:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAliasAttributeExpressionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getAliasAttributeExpressionAccess().getAliasVariableDeclarationCrossReference_0_0()); 
              	
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3809:2: (otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==KEYWORD_4) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3810:2: otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleAliasAttributeExpression8269); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getAliasAttributeExpressionAccess().getFullStopKeyword_1_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3814:1: ( (lv_attributes_2_0= RULE_ID ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3815:1: (lv_attributes_2_0= RULE_ID )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3815:1: (lv_attributes_2_0= RULE_ID )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3816:3: lv_attributes_2_0= RULE_ID
            	    {
            	    lv_attributes_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8285); if (state.failed) return current;
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
            	    break loop53;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3840:1: entryRuleParameterExpression returns [EObject current=null] : iv_ruleParameterExpression= ruleParameterExpression EOF ;
    public final EObject entryRuleParameterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3841:2: (iv_ruleParameterExpression= ruleParameterExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3842:2: iv_ruleParameterExpression= ruleParameterExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParameterExpression_in_entryRuleParameterExpression8327);
            iv_ruleParameterExpression=ruleParameterExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterExpression8337); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3849:1: ruleParameterExpression returns [EObject current=null] : (otherlv_0= KEYWORD_5 ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameterExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3852:28: ( (otherlv_0= KEYWORD_5 ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3853:1: (otherlv_0= KEYWORD_5 ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3853:1: (otherlv_0= KEYWORD_5 ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3854:2: otherlv_0= KEYWORD_5 ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleParameterExpression8375); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParameterExpressionAccess().getColonKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3858:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3859:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3859:1: (lv_name_1_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3860:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterExpression8391); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3886:1: entryRuleStringFunction returns [EObject current=null] : iv_ruleStringFunction= ruleStringFunction EOF ;
    public final EObject entryRuleStringFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringFunction = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3887:2: (iv_ruleStringFunction= ruleStringFunction EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3888:2: iv_ruleStringFunction= ruleStringFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleStringFunction_in_entryRuleStringFunction8433);
            iv_ruleStringFunction=ruleStringFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunction8443); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3895:1: ruleStringFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3898:28: ( ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3899:1: ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3899:1: ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3899:2: ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3899:2: ( (lv_name_0_0= ruleStringFunctionName ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3900:1: (lv_name_0_0= ruleStringFunctionName )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3900:1: (lv_name_0_0= ruleStringFunctionName )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3901:3: lv_name_0_0= ruleStringFunctionName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringFunctionAccess().getNameStringFunctionNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStringFunctionName_in_ruleStringFunction8489);
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

            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleStringFunction8502); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStringFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3922:1: ( (lv_params_2_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3923:1: (lv_params_2_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3923:1: (lv_params_2_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3924:3: lv_params_2_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringFunctionAccess().getParamsVariableParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleStringFunction8522);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3940:2: (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3941:2: otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) )
            {
            otherlv_3=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleStringFunction8536); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getStringFunctionAccess().getCommaKeyword_3_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3945:1: ( (lv_params_4_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3946:1: (lv_params_4_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3946:1: (lv_params_4_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3947:3: lv_params_4_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringFunctionAccess().getParamsVariableParserRuleCall_3_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleStringFunction8556);
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

            otherlv_5=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleStringFunction8570); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3976:1: entryRuleStringFunctionName returns [String current=null] : iv_ruleStringFunctionName= ruleStringFunctionName EOF ;
    public final String entryRuleStringFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringFunctionName = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3977:1: (iv_ruleStringFunctionName= ruleStringFunctionName EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3978:2: iv_ruleStringFunctionName= ruleStringFunctionName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringFunctionNameRule()); 
            }
            pushFollow(FOLLOW_ruleStringFunctionName_in_entryRuleStringFunctionName8605);
            iv_ruleStringFunctionName=ruleStringFunctionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringFunctionName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunctionName8616); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3985:1: ruleStringFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_52 | kw= KEYWORD_63 | kw= KEYWORD_47 | kw= KEYWORD_50 | kw= KEYWORD_56 | kw= KEYWORD_57 ) ;
    public final AntlrDatatypeRuleToken ruleStringFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3989:6: ( (kw= KEYWORD_52 | kw= KEYWORD_63 | kw= KEYWORD_47 | kw= KEYWORD_50 | kw= KEYWORD_56 | kw= KEYWORD_57 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3990:1: (kw= KEYWORD_52 | kw= KEYWORD_63 | kw= KEYWORD_47 | kw= KEYWORD_50 | kw= KEYWORD_56 | kw= KEYWORD_57 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3990:1: (kw= KEYWORD_52 | kw= KEYWORD_63 | kw= KEYWORD_47 | kw= KEYWORD_50 | kw= KEYWORD_56 | kw= KEYWORD_57 )
            int alt54=6;
            switch ( input.LA(1) ) {
            case KEYWORD_52:
                {
                alt54=1;
                }
                break;
            case KEYWORD_63:
                {
                alt54=2;
                }
                break;
            case KEYWORD_47:
                {
                alt54=3;
                }
                break;
            case KEYWORD_50:
                {
                alt54=4;
                }
                break;
            case KEYWORD_56:
                {
                alt54=5;
                }
                break;
            case KEYWORD_57:
                {
                alt54=6;
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3991:2: kw= KEYWORD_52
                    {
                    kw=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleStringFunctionName8654); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getCONCATKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3998:2: kw= KEYWORD_63
                    {
                    kw=(Token)match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleStringFunctionName8673); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getSUBSTRINGKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4005:2: kw= KEYWORD_47
                    {
                    kw=(Token)match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleStringFunctionName8692); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getLOWERKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4012:2: kw= KEYWORD_50
                    {
                    kw=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleStringFunctionName8711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getUPPERKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4019:2: kw= KEYWORD_56
                    {
                    kw=(Token)match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleStringFunctionName8730); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getLENGTHKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4026:2: kw= KEYWORD_57
                    {
                    kw=(Token)match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleStringFunctionName8749); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4039:1: entryRuleNumericFunction returns [EObject current=null] : iv_ruleNumericFunction= ruleNumericFunction EOF ;
    public final EObject entryRuleNumericFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericFunction = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4040:2: (iv_ruleNumericFunction= ruleNumericFunction EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4041:2: iv_ruleNumericFunction= ruleNumericFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericFunction_in_entryRuleNumericFunction8788);
            iv_ruleNumericFunction=ruleNumericFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericFunction8798); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4048:1: ruleNumericFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4051:28: ( ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4052:1: ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4052:1: ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4052:2: ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4052:2: ( (lv_name_0_0= ruleNumericFunctionName ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4053:1: (lv_name_0_0= ruleNumericFunctionName )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4053:1: (lv_name_0_0= ruleNumericFunctionName )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4054:3: lv_name_0_0= ruleNumericFunctionName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumericFunctionAccess().getNameNumericFunctionNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumericFunctionName_in_ruleNumericFunction8844);
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

            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleNumericFunction8857); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNumericFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4075:1: ( (lv_params_2_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4076:1: (lv_params_2_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4076:1: (lv_params_2_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4077:3: lv_params_2_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumericFunctionAccess().getParamsVariableParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleNumericFunction8877);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4093:2: (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4094:2: otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) )
            {
            otherlv_3=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleNumericFunction8891); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getNumericFunctionAccess().getCommaKeyword_3_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4098:1: ( (lv_params_4_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4099:1: (lv_params_4_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4099:1: (lv_params_4_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4100:3: lv_params_4_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumericFunctionAccess().getParamsVariableParserRuleCall_3_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleNumericFunction8911);
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

            otherlv_5=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleNumericFunction8925); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4129:1: entryRuleNumericFunctionName returns [String current=null] : iv_ruleNumericFunctionName= ruleNumericFunctionName EOF ;
    public final String entryRuleNumericFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumericFunctionName = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4130:1: (iv_ruleNumericFunctionName= ruleNumericFunctionName EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4131:2: iv_ruleNumericFunctionName= ruleNumericFunctionName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericFunctionNameRule()); 
            }
            pushFollow(FOLLOW_ruleNumericFunctionName_in_entryRuleNumericFunctionName8960);
            iv_ruleNumericFunctionName=ruleNumericFunctionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericFunctionName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericFunctionName8971); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4138:1: ruleNumericFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_18 | kw= KEYWORD_39 | kw= KEYWORD_26 | kw= KEYWORD_37 ) ;
    public final AntlrDatatypeRuleToken ruleNumericFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4142:6: ( (kw= KEYWORD_18 | kw= KEYWORD_39 | kw= KEYWORD_26 | kw= KEYWORD_37 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4143:1: (kw= KEYWORD_18 | kw= KEYWORD_39 | kw= KEYWORD_26 | kw= KEYWORD_37 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4143:1: (kw= KEYWORD_18 | kw= KEYWORD_39 | kw= KEYWORD_26 | kw= KEYWORD_37 )
            int alt55=4;
            switch ( input.LA(1) ) {
            case KEYWORD_18:
                {
                alt55=1;
                }
                break;
            case KEYWORD_39:
                {
                alt55=2;
                }
                break;
            case KEYWORD_26:
                {
                alt55=3;
                }
                break;
            case KEYWORD_37:
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4144:2: kw= KEYWORD_18
                    {
                    kw=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleNumericFunctionName9009); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumericFunctionNameAccess().getABSKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4151:2: kw= KEYWORD_39
                    {
                    kw=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleNumericFunctionName9028); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumericFunctionNameAccess().getSQRTKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4158:2: kw= KEYWORD_26
                    {
                    kw=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleNumericFunctionName9047); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumericFunctionNameAccess().getMODKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4165:2: kw= KEYWORD_37
                    {
                    kw=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleNumericFunctionName9066); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4180:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4181:2: (iv_ruleValue= ruleValue EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4182:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue9107);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue9117); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4189:1: ruleValue returns [EObject current=null] : (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerExpression_0 = null;

        EObject this_StringExpression_1 = null;

        EObject this_NullExpression_2 = null;

        EObject this_BooleanExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4192:28: ( (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4193:1: (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4193:1: (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression )
            int alt56=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt56=1;
                }
                break;
            case RULE_STRING:
                {
                alt56=2;
                }
                break;
            case KEYWORD_36:
                {
                alt56=3;
                }
                break;
            case KEYWORD_43:
            case KEYWORD_40:
                {
                alt56=4;
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4194:2: this_IntegerExpression_0= ruleIntegerExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getIntegerExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerExpression_in_ruleValue9167);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4207:2: this_StringExpression_1= ruleStringExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getStringExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringExpression_in_ruleValue9197);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4220:2: this_NullExpression_2= ruleNullExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getNullExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullExpression_in_ruleValue9227);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4233:2: this_BooleanExpression_3= ruleBooleanExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getBooleanExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleValue9257);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4252:1: entryRuleIntegerExpression returns [EObject current=null] : iv_ruleIntegerExpression= ruleIntegerExpression EOF ;
    public final EObject entryRuleIntegerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4253:2: (iv_ruleIntegerExpression= ruleIntegerExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4254:2: iv_ruleIntegerExpression= ruleIntegerExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerExpression_in_entryRuleIntegerExpression9291);
            iv_ruleIntegerExpression=ruleIntegerExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerExpression9301); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4261:1: ruleIntegerExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4264:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4265:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4265:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4266:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4266:1: (lv_value_0_0= RULE_INT )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4267:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerExpression9342); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4291:1: entryRuleStringExpression returns [EObject current=null] : iv_ruleStringExpression= ruleStringExpression EOF ;
    public final EObject entryRuleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4292:2: (iv_ruleStringExpression= ruleStringExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4293:2: iv_ruleStringExpression= ruleStringExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleStringExpression_in_entryRuleStringExpression9381);
            iv_ruleStringExpression=ruleStringExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringExpression9391); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4300:1: ruleStringExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4303:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4304:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4304:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4305:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4305:1: (lv_value_0_0= RULE_STRING )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4306:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringExpression9432); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4330:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4331:2: (iv_ruleNullExpression= ruleNullExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4332:2: iv_ruleNullExpression= ruleNullExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullExpression_in_entryRuleNullExpression9471);
            iv_ruleNullExpression=ruleNullExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullExpression9481); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4339:1: ruleNullExpression returns [EObject current=null] : ( (lv_value_0_0= KEYWORD_36 ) ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4342:28: ( ( (lv_value_0_0= KEYWORD_36 ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4343:1: ( (lv_value_0_0= KEYWORD_36 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4343:1: ( (lv_value_0_0= KEYWORD_36 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4344:1: (lv_value_0_0= KEYWORD_36 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4344:1: (lv_value_0_0= KEYWORD_36 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4345:3: lv_value_0_0= KEYWORD_36
            {
            lv_value_0_0=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleNullExpression9524); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4367:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4368:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4369:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression9569);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression9579); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4376:1: ruleBooleanExpression returns [EObject current=null] : ( ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) ) ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4379:28: ( ( ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4380:1: ( ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4380:1: ( ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4381:1: ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4381:1: ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4382:1: (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4382:1: (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==KEYWORD_40) ) {
                alt57=1;
            }
            else if ( (LA57_0==KEYWORD_43) ) {
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4383:3: lv_value_0_1= KEYWORD_40
                    {
                    lv_value_0_1=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleBooleanExpression9624); if (state.failed) return current;
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4396:8: lv_value_0_2= KEYWORD_43
                    {
                    lv_value_0_2=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleBooleanExpression9652); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4420:1: entryRuleQueryExpression returns [EObject current=null] : iv_ruleQueryExpression= ruleQueryExpression EOF ;
    public final EObject entryRuleQueryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4421:2: (iv_ruleQueryExpression= ruleQueryExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4422:2: iv_ruleQueryExpression= ruleQueryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQueryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_entryRuleQueryExpression9700);
            iv_ruleQueryExpression=ruleQueryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQueryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryExpression9710); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4429:1: ruleQueryExpression returns [EObject current=null] : (otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2 ) ;
    public final EObject ruleQueryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_SelectStatement_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4432:28: ( (otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4433:1: (otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4433:1: (otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4434:2: otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleQueryExpression9748); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQueryExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQueryExpressionAccess().getSelectStatementParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleQueryExpression9772);
            this_SelectStatement_1=ruleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_SelectStatement_1;
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleQueryExpression9784); if (state.failed) return current;
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


    // $ANTLR start "ruleComparisonOperator"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4463:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_8 ) | (enumLiteral_2= KEYWORD_9 ) | (enumLiteral_3= KEYWORD_11 ) | (enumLiteral_4= KEYWORD_7 ) | (enumLiteral_5= KEYWORD_10 ) ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4465:28: ( ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_8 ) | (enumLiteral_2= KEYWORD_9 ) | (enumLiteral_3= KEYWORD_11 ) | (enumLiteral_4= KEYWORD_7 ) | (enumLiteral_5= KEYWORD_10 ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4466:1: ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_8 ) | (enumLiteral_2= KEYWORD_9 ) | (enumLiteral_3= KEYWORD_11 ) | (enumLiteral_4= KEYWORD_7 ) | (enumLiteral_5= KEYWORD_10 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4466:1: ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_8 ) | (enumLiteral_2= KEYWORD_9 ) | (enumLiteral_3= KEYWORD_11 ) | (enumLiteral_4= KEYWORD_7 ) | (enumLiteral_5= KEYWORD_10 ) )
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4466:2: (enumLiteral_0= KEYWORD_6 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4466:2: (enumLiteral_0= KEYWORD_6 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4466:7: enumLiteral_0= KEYWORD_6
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleComparisonOperator9836); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getLessThenEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getLessThenEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4472:6: (enumLiteral_1= KEYWORD_8 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4472:6: (enumLiteral_1= KEYWORD_8 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4472:11: enumLiteral_1= KEYWORD_8
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleComparisonOperator9858); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getGreaterThenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getGreaterThenEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4478:6: (enumLiteral_2= KEYWORD_9 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4478:6: (enumLiteral_2= KEYWORD_9 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4478:11: enumLiteral_2= KEYWORD_9
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleComparisonOperator9880); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getLessEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getLessEqualEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4484:6: (enumLiteral_3= KEYWORD_11 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4484:6: (enumLiteral_3= KEYWORD_11 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4484:11: enumLiteral_3= KEYWORD_11
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleComparisonOperator9902); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4490:6: (enumLiteral_4= KEYWORD_7 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4490:6: (enumLiteral_4= KEYWORD_7 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4490:11: enumLiteral_4= KEYWORD_7
                    {
                    enumLiteral_4=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleComparisonOperator9924); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4496:6: (enumLiteral_5= KEYWORD_10 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4496:6: (enumLiteral_5= KEYWORD_10 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4496:11: enumLiteral_5= KEYWORD_10
                    {
                    enumLiteral_5=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleComparisonOperator9946); if (state.failed) return current;
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


    protected DFA27 dfa27 = new DFA27(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA46 dfa46 = new DFA46(this);
    static final String DFA27_eotS =
        "\6\uffff";
    static final String DFA27_eofS =
        "\1\uffff\1\4\3\uffff\1\4";
    static final String DFA27_minS =
        "\1\106\1\15\1\106\2\uffff\1\15";
    static final String DFA27_maxS =
        "\3\106\2\uffff\1\106";
    static final String DFA27_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA27_specialS =
        "\6\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1",
            "\1\4\11\uffff\1\4\2\uffff\1\4\2\uffff\1\4\25\uffff\1\4\4\uffff"+
            "\1\3\6\uffff\2\4\1\2\4\uffff\1\3",
            "\1\5",
            "",
            "",
            "\1\4\11\uffff\1\4\2\uffff\1\4\2\uffff\1\4\25\uffff\1\4\4\uffff"+
            "\1\3\6\uffff\2\4\1\2\4\uffff\1\3"
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1808:1: (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar )";
        }
    }
    static final String DFA39_eotS =
        "\32\uffff";
    static final String DFA39_eofS =
        "\32\uffff";
    static final String DFA39_minS =
        "\1\14\1\uffff\1\11\1\106\5\11\4\uffff\1\106\1\24\1\11\5\uffff\2"+
        "\11\1\24\2\uffff";
    static final String DFA39_maxS =
        "\1\110\1\uffff\1\105\1\106\5\105\4\uffff\1\106\1\62\1\72\5\uffff"+
        "\2\105\1\43\2\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\1\7\uffff\1\3\1\4\1\5\1\6\3\uffff\1\13\1\14\1\12\1\7"+
        "\1\2\3\uffff\1\11\1\10";
    static final String DFA39_specialS =
        "\32\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\11\10\uffff\1\10\15\uffff\1\6\1\uffff\1\14\1\uffff\1\7\1"+
            "\uffff\1\12\1\uffff\1\13\6\uffff\1\11\13\uffff\1\1\3\uffff\1"+
            "\3\3\uffff\1\2\1\4\1\5",
            "",
            "\1\21\6\uffff\1\23\21\uffff\1\22\17\uffff\1\17\2\uffff\3\24"+
            "\2\uffff\1\20\1\16\5\uffff\1\15\1\uffff\3\24",
            "\1\25",
            "\1\21\6\uffff\1\23\21\uffff\1\22\17\uffff\1\17\2\uffff\3\24"+
            "\2\uffff\1\20\1\16\7\uffff\3\24",
            "\1\21\6\uffff\1\23\21\uffff\1\22\17\uffff\1\17\2\uffff\3\24"+
            "\2\uffff\1\20\1\16\7\uffff\3\24",
            "\1\21\6\uffff\1\23\21\uffff\1\22\17\uffff\1\17\2\uffff\3\24"+
            "\2\uffff\1\20\1\16\7\uffff\3\24",
            "\1\21\6\uffff\1\23\21\uffff\1\22\17\uffff\1\17\2\uffff\3\24"+
            "\2\uffff\1\20\1\16\7\uffff\3\24",
            "\1\21\6\uffff\1\23\21\uffff\1\22\17\uffff\1\17\2\uffff\3\24"+
            "\2\uffff\1\20\1\16\7\uffff\3\24",
            "",
            "",
            "",
            "",
            "\1\26",
            "\1\30\16\uffff\1\31\16\uffff\1\27",
            "\1\21\6\uffff\1\23\21\uffff\1\22\27\uffff\1\20",
            "",
            "",
            "",
            "",
            "",
            "\1\21\6\uffff\1\23\21\uffff\1\22\17\uffff\1\17\2\uffff\3\24"+
            "\2\uffff\1\20\1\16\7\uffff\3\24",
            "\1\21\6\uffff\1\23\21\uffff\1\22\17\uffff\1\17\2\uffff\3\24"+
            "\2\uffff\1\20\1\16\5\uffff\1\15\1\uffff\3\24",
            "\1\30\16\uffff\1\31",
            "",
            ""
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "2575:1: (this_ParExpression_0= ruleParExpression | this_ComparisonOperatorExpression_1= ruleComparisonOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression )";
        }
    }
    static final String DFA46_eotS =
        "\20\uffff";
    static final String DFA46_eofS =
        "\20\uffff";
    static final String DFA46_minS =
        "\1\25\1\62\1\106\5\62\1\106\1\72\1\76\2\62\1\21\2\uffff";
    static final String DFA46_maxS =
        "\1\110\1\101\1\106\5\72\1\106\1\72\1\76\1\72\1\101\1\110\2\uffff";
    static final String DFA46_acceptS =
        "\16\uffff\1\1\1\2";
    static final String DFA46_specialS =
        "\20\uffff}>";
    static final String[] DFA46_transitionS = {
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
            "\1\17\3\uffff\1\16\11\uffff\1\17\3\uffff\1\16\3\uffff\1\16"+
            "\32\uffff\1\16\3\uffff\3\16",
            "",
            ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "3352:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleJPQLQuery_in_entryRuleJPQLQuery73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJPQLQuery83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleJPQLQuery133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_ruleJPQLQuery163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_ruleJPQLQuery193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectStatement237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectFromClause_in_ruleSelectStatement283 = new BitSet(new long[]{0x0000000024802002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleSelectStatement304 = new BitSet(new long[]{0x0000000004802002L});
    public static final BitSet FOLLOW_ruleGroupClause_in_ruleSelectStatement326 = new BitSet(new long[]{0x0000000004002002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_ruleSelectStatement348 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOrderClause_in_ruleSelectStatement370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupClause_in_entryRuleGroupClause406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupClause416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleGroupClause454 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleGroupClause466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleGroupItem_in_ruleGroupClause486 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleGroupClause500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleGroupItem_in_ruleGroupClause520 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleGroupItem_in_entryRuleGroupItem557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupItem567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleGroupItem612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_entryRuleHavingClause646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingClause656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleHavingClause694 = new BitSet(new long[]{0x40040AA800201000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleHavingClause714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderClause_in_entryRuleOrderClause749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderClause759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleOrderClause797 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleOrderClause809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleOrderItem_in_ruleOrderClause829 = new BitSet(new long[]{0x0000100040000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleOrderClause843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleOrderItem_in_ruleOrderClause863 = new BitSet(new long[]{0x0000100040000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleOrderClause885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleOrderClause921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderItem_in_entryRuleOrderItem969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderItem979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleOrderItem1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement1058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateClause_in_ruleUpdateStatement1114 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleSetClause_in_ruleUpdateStatement1135 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleUpdateStatement1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateClause_in_entryRuleUpdateClause1192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateClause1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleUpdateClause1240 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleUpdateClause1260 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleUpdateClause1274 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleUpdateClause1294 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleSetClause_in_entryRuleSetClause1331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetClause1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleSetClause1379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_ruleSetClause1399 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSetClause1413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_ruleSetClause1433 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_entryRuleUpdateItem1470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateItem1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleUpdateItem1526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleUpdateItem1539 = new BitSet(new long[]{0x0000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleValue_in_ruleUpdateItem1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement1594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteStatement1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteClause_in_ruleDeleteStatement1650 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleDeleteStatement1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteClause_in_entryRuleDeleteClause1707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteClause1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleDeleteClause1755 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleFromClause_in_ruleDeleteClause1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectFromClause_in_entryRuleSelectFromClause1810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectFromClause1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_ruleSelectFromClause1866 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleFromClause_in_ruleSelectFromClause1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_entryRuleSelectClause1923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectClause1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_ruleSelectClause1971 = new BitSet(new long[]{0x0012E00000080100L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleSelectClause1989 = new BitSet(new long[]{0x0012E00000080100L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectClause2022 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSelectClause2036 = new BitSet(new long[]{0x0012E00000080100L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectClause2056 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression2093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectExpression2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectExpression2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAggregateExpression_in_ruleSelectExpression2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstructorExpression_in_ruleSelectExpression2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAggregateExpression_in_entryRuleSelectAggregateExpression2247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectAggregateExpression2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgAggregate_in_ruleSelectAggregateExpression2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxAggregate_in_ruleSelectAggregateExpression2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinAggregate_in_ruleSelectAggregateExpression2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumAggregate_in_ruleSelectAggregateExpression2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountAggregate_in_ruleSelectAggregateExpression2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgAggregate_in_entryRuleAvgAggregate2461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvgAggregate2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleAvgAggregate2509 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleAvgAggregate2521 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleAvgAggregate2539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleAvgAggregate2572 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleAvgAggregate2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxAggregate_in_entryRuleMaxAggregate2619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxAggregate2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleMaxAggregate2667 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleMaxAggregate2679 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleMaxAggregate2697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleMaxAggregate2730 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleMaxAggregate2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinAggregate_in_entryRuleMinAggregate2777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinAggregate2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleMinAggregate2825 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleMinAggregate2837 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleMinAggregate2855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleMinAggregate2888 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleMinAggregate2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumAggregate_in_entryRuleSumAggregate2935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumAggregate2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleSumAggregate2983 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleSumAggregate2995 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleSumAggregate3013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSumAggregate3046 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSumAggregate3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountAggregate_in_entryRuleCountAggregate3093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCountAggregate3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleCountAggregate3141 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleCountAggregate3153 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleCountAggregate3171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleCountAggregate3204 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleCountAggregate3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstructorExpression_in_entryRuleSelectConstructorExpression3251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectConstructorExpression3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleSelectConstructorExpression3299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectConstructorExpression3315 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleSelectConstructorExpression3333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3353 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSelectConstructorExpression3367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3387 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSelectConstructorExpression3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClause_in_entryRuleFromClause3436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClause3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleFromClause3484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFromClass_in_ruleFromClause3504 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleFromClause3518 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleFromClause3538 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleFromEntry_in_entryRuleFromEntry3575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromEntry3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClass_in_ruleFromEntry3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromCollection_in_ruleFromEntry3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration3709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleVariableDeclaration3748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClass_in_entryRuleFromClass3806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClass3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassId_in_ruleFromClass3866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassVar_in_ruleFromClass3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier3931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedIdentifier3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier3982 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleQualifiedIdentifier4001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier4016 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassId_in_entryRuleFromClassId4062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClassId4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleFromClassId4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassVar_in_entryRuleFromClassVar4151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClassVar4161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleFromClassVar4207 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleFromClassVar4228 = new BitSet(new long[]{0x0000000301000002L});
    public static final BitSet FOLLOW_ruleFromJoin_in_ruleFromClassVar4249 = new BitSet(new long[]{0x0000000301000002L});
    public static final BitSet FOLLOW_ruleFromCollection_in_entryRuleFromCollection4285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromCollection4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleFromCollection4333 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleFromCollection4345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleFromCollection4365 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleFromCollection4378 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleFromCollection4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromJoin_in_entryRuleFromJoin4433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromJoin4443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_ruleFromJoin4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftJoin_in_ruleFromJoin4523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerJoin_in_ruleFromJoin4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_entryRuleJoin4587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoin4597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleJoin4635 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleJoin4653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleJoin4686 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleJoin4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftJoin_in_entryRuleLeftJoin4742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftJoin4752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleLeftJoin4790 = new BitSet(new long[]{0x0000000108000000L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleLeftJoin4808 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleLeftJoin4833 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleLeftJoin4851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleLeftJoin4884 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleLeftJoin4905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerJoin_in_entryRuleInnerJoin4940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInnerJoin4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleInnerJoin4988 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleInnerJoin5000 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleInnerJoin5018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleInnerJoin5051 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInnerJoin5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_entryRuleWhereClause5107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereClause5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleWhereClause5155 = new BitSet(new long[]{0x40040AA800201000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleWhereClause5175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression5210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression5220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression5270 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleOrExpression5296 = new BitSet(new long[]{0x40040AA800201000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression5316 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression5355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression5365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteExpression_in_ruleAndExpression5415 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleAndExpression5441 = new BitSet(new long[]{0x40040AA800201000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleConcreteExpression_in_ruleAndExpression5461 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleConcreteExpression_in_entryRuleConcreteExpression5500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcreteExpression5510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParExpression_in_ruleConcreteExpression5560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_ruleConcreteExpression5590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsExpression_in_ruleConcreteExpression5620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllExpression_in_ruleConcreteExpression5650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyExpression_in_ruleConcreteExpression5680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeExpression_in_ruleConcreteExpression5710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_ruleConcreteExpression5740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullComparisonExpression_in_ruleConcreteExpression5770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyComparisonExpression_in_ruleConcreteExpression5800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikeExpression_in_ruleConcreteExpression5830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpression_in_ruleConcreteExpression5860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBetweenExpression_in_ruleConcreteExpression5890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParExpression_in_entryRuleParExpression5924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParExpression5934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleParExpression5972 = new BitSet(new long[]{0x4000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_ruleParExpression5996 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleParExpression6008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_entryRuleComparisonOperatorExpression6042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonOperatorExpression6052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleComparisonOperatorExpression6098 = new BitSet(new long[]{0x00E0000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_ruleComparisonOperatorExpression6119 = new BitSet(new long[]{0x4000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_ruleComparisonOperatorExpression6140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsExpression_in_entryRuleExistsExpression6175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExistsExpression6185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleExistsExpression6229 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleExistsExpression6254 = new BitSet(new long[]{0x4000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleExistsExpression6274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllExpression_in_entryRuleAllExpression6309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllExpression6319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleAllExpression6357 = new BitSet(new long[]{0x4000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleAllExpression6377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyExpression_in_entryRuleAnyExpression6412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnyExpression6422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleAnyExpression6460 = new BitSet(new long[]{0x4000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleAnyExpression6480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeExpression_in_entryRuleSomeExpression6515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSomeExpression6525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleSomeExpression6563 = new BitSet(new long[]{0x4000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleSomeExpression6583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression6618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionExpression6628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCollectionExpression6674 = new BitSet(new long[]{0x0004000000010000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleCollectionExpression6693 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleCollectionExpression6718 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleCollectionExpression6731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleCollectionExpression6753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullComparisonExpression_in_entryRuleNullComparisonExpression6788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullComparisonExpression6798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNullComparisonExpression6844 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleNullComparisonExpression6857 = new BitSet(new long[]{0x0004000800000000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleNullComparisonExpression6875 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleNullComparisonExpression6900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyComparisonExpression_in_entryRuleEmptyComparisonExpression6934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmptyComparisonExpression6944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleEmptyComparisonExpression6990 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleEmptyComparisonExpression7003 = new BitSet(new long[]{0x0004000000100000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleEmptyComparisonExpression7021 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleEmptyComparisonExpression7046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikeExpression_in_entryRuleLikeExpression7080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLikeExpression7090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleLikeExpression7136 = new BitSet(new long[]{0x0004000400000000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleLikeExpression7155 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleLikeExpression7180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLikeExpression7196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpression_in_entryRuleInExpression7236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInExpression7246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInSeqExpression_in_ruleInExpression7296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInQueryExpression_in_ruleInExpression7326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInSeqExpression_in_entryRuleInSeqExpression7360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInSeqExpression7370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7416 = new BitSet(new long[]{0x0404000000000000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleInSeqExpression7435 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleInSeqExpression7460 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleInSeqExpression7472 = new BitSet(new long[]{0x0000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7492 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleInSeqExpression7506 = new BitSet(new long[]{0x0000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7526 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleInSeqExpression7541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInQueryExpression_in_entryRuleInQueryExpression7575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInQueryExpression7585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInQueryExpression7631 = new BitSet(new long[]{0x0404000000000000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleInQueryExpression7650 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleInQueryExpression7675 = new BitSet(new long[]{0x4000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleInQueryExpression7695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBetweenExpression_in_entryRuleBetweenExpression7730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBetweenExpression7740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleBetweenExpression7786 = new BitSet(new long[]{0x0004000000000200L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleBetweenExpression7805 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleBetweenExpression7830 = new BitSet(new long[]{0x0000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBetweenExpression7850 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleBetweenExpression7863 = new BitSet(new long[]{0x0000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBetweenExpression7883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable7918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable7928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleVariable7978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_ruleVariable8008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleVariable8038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_entryRuleExpressionTerm8072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionTerm8082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleExpressionTerm8132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleExpressionTerm8162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_entryRuleAliasAttributeExpression8196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAliasAttributeExpression8206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8255 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleAliasAttributeExpression8269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8285 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_entryRuleParameterExpression8327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterExpression8337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleParameterExpression8375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterExpression8391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_entryRuleStringFunction8433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunction8443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunctionName_in_ruleStringFunction8489 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleStringFunction8502 = new BitSet(new long[]{0x0000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunction8522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleStringFunction8536 = new BitSet(new long[]{0x0000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunction8556 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleStringFunction8570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunctionName_in_entryRuleStringFunctionName8605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunctionName8616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleStringFunctionName8654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleStringFunctionName8673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleStringFunctionName8692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleStringFunctionName8711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleStringFunctionName8730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleStringFunctionName8749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFunction_in_entryRuleNumericFunction8788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericFunction8798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFunctionName_in_ruleNumericFunction8844 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleNumericFunction8857 = new BitSet(new long[]{0x0000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNumericFunction8877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleNumericFunction8891 = new BitSet(new long[]{0x0000008800200000L,0x00000000000001C4L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNumericFunction8911 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleNumericFunction8925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFunctionName_in_entryRuleNumericFunctionName8960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericFunctionName8971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleNumericFunctionName9009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleNumericFunctionName9028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleNumericFunctionName9047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleNumericFunctionName9066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue9107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue9117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerExpression_in_ruleValue9167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_ruleValue9197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_ruleValue9227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleValue9257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerExpression_in_entryRuleIntegerExpression9291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerExpression9301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerExpression9342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_entryRuleStringExpression9381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringExpression9391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringExpression9432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_entryRuleNullExpression9471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullExpression9481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleNullExpression9524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression9569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression9579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleBooleanExpression9624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleBooleanExpression9652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_entryRuleQueryExpression9700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryExpression9710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleQueryExpression9748 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleQueryExpression9772 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleQueryExpression9784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleComparisonOperator9836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleComparisonOperator9858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleComparisonOperator9880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleComparisonOperator9902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleComparisonOperator9924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleComparisonOperator9946 = new BitSet(new long[]{0x0000000000000002L});

}