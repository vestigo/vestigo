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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_70", "KEYWORD_68", "KEYWORD_69", "KEYWORD_67", "KEYWORD_66", "KEYWORD_65", "KEYWORD_56", "KEYWORD_57", "KEYWORD_58", "KEYWORD_59", "KEYWORD_60", "KEYWORD_61", "KEYWORD_62", "KEYWORD_63", "KEYWORD_64", "KEYWORD_45", "KEYWORD_46", "KEYWORD_47", "KEYWORD_48", "KEYWORD_49", "KEYWORD_50", "KEYWORD_51", "KEYWORD_52", "KEYWORD_53", "KEYWORD_54", "KEYWORD_55", "KEYWORD_35", "KEYWORD_36", "KEYWORD_37", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_41", "KEYWORD_42", "KEYWORD_43", "KEYWORD_44", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_31", "KEYWORD_32", "KEYWORD_33", "KEYWORD_34", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=74;
    public static final int RULE_ANY_OTHER=80;
    public static final int KEYWORD_19=59;
    public static final int KEYWORD_56=10;
    public static final int KEYWORD_55=29;
    public static final int KEYWORD_54=28;
    public static final int KEYWORD_17=57;
    public static final int KEYWORD_53=27;
    public static final int KEYWORD_18=58;
    public static final int KEYWORD_52=26;
    public static final int KEYWORD_15=55;
    public static final int KEYWORD_51=25;
    public static final int KEYWORD_16=56;
    public static final int KEYWORD_50=24;
    public static final int KEYWORD_13=53;
    public static final int KEYWORD_14=54;
    public static final int KEYWORD_11=72;
    public static final int EOF=-1;
    public static final int KEYWORD_12=73;
    public static final int KEYWORD_10=71;
    public static final int KEYWORD_59=13;
    public static final int KEYWORD_58=12;
    public static final int KEYWORD_57=11;
    public static final int KEYWORD_6=67;
    public static final int KEYWORD_7=68;
    public static final int KEYWORD_8=69;
    public static final int KEYWORD_9=70;
    public static final int KEYWORD_28=46;
    public static final int KEYWORD_65=9;
    public static final int KEYWORD_29=47;
    public static final int KEYWORD_64=18;
    public static final int RULE_INT=75;
    public static final int KEYWORD_67=7;
    public static final int KEYWORD_66=8;
    public static final int KEYWORD_61=15;
    public static final int KEYWORD_24=42;
    public static final int KEYWORD_60=14;
    public static final int KEYWORD_25=43;
    public static final int KEYWORD_26=44;
    public static final int KEYWORD_63=17;
    public static final int KEYWORD_62=16;
    public static final int KEYWORD_27=45;
    public static final int KEYWORD_20=60;
    public static final int KEYWORD_21=61;
    public static final int KEYWORD_22=40;
    public static final int KEYWORD_23=41;
    public static final int KEYWORD_69=6;
    public static final int KEYWORD_68=5;
    public static final int KEYWORD_30=48;
    public static final int KEYWORD_1=62;
    public static final int KEYWORD_34=52;
    public static final int KEYWORD_5=66;
    public static final int KEYWORD_33=51;
    public static final int KEYWORD_4=65;
    public static final int KEYWORD_70=4;
    public static final int KEYWORD_32=50;
    public static final int KEYWORD_3=64;
    public static final int KEYWORD_31=49;
    public static final int KEYWORD_2=63;
    public static final int KEYWORD_38=33;
    public static final int KEYWORD_37=32;
    public static final int RULE_SL_COMMENT=78;
    public static final int KEYWORD_36=31;
    public static final int KEYWORD_35=30;
    public static final int RULE_ML_COMMENT=77;
    public static final int KEYWORD_39=34;
    public static final int RULE_STRING=76;
    public static final int KEYWORD_41=36;
    public static final int KEYWORD_40=35;
    public static final int KEYWORD_43=38;
    public static final int KEYWORD_42=37;
    public static final int KEYWORD_45=19;
    public static final int KEYWORD_44=39;
    public static final int KEYWORD_47=21;
    public static final int RULE_WS=79;
    public static final int KEYWORD_46=20;
    public static final int KEYWORD_49=23;
    public static final int KEYWORD_48=22;

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
            case KEYWORD_63:
            case KEYWORD_36:
                {
                alt1=1;
                }
                break;
            case KEYWORD_64:
                {
                alt1=2;
                }
                break;
            case KEYWORD_57:
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

            if ( (LA2_0==KEYWORD_63) ) {
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

            if ( (LA3_0==KEYWORD_55) ) {
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

            if ( (LA4_0==KEYWORD_49) ) {
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

            if ( (LA5_0==KEYWORD_52) ) {
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:247:1: ruleGroupByClause returns [EObject current=null] : (otherlv_0= KEYWORD_49 otherlv_1= KEYWORD_17 ( (lv_grouping_2_0= ruleAliasAttributeExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_grouping_4_0= ruleAliasAttributeExpression ) ) )* ( (lv_havingClause_5_0= ruleHavingClause ) )? ) ;
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
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:250:28: ( (otherlv_0= KEYWORD_49 otherlv_1= KEYWORD_17 ( (lv_grouping_2_0= ruleAliasAttributeExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_grouping_4_0= ruleAliasAttributeExpression ) ) )* ( (lv_havingClause_5_0= ruleHavingClause ) )? ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:251:1: (otherlv_0= KEYWORD_49 otherlv_1= KEYWORD_17 ( (lv_grouping_2_0= ruleAliasAttributeExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_grouping_4_0= ruleAliasAttributeExpression ) ) )* ( (lv_havingClause_5_0= ruleHavingClause ) )? )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:251:1: (otherlv_0= KEYWORD_49 otherlv_1= KEYWORD_17 ( (lv_grouping_2_0= ruleAliasAttributeExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_grouping_4_0= ruleAliasAttributeExpression ) ) )* ( (lv_havingClause_5_0= ruleHavingClause ) )? )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:252:2: otherlv_0= KEYWORD_49 otherlv_1= KEYWORD_17 ( (lv_grouping_2_0= ruleAliasAttributeExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_grouping_4_0= ruleAliasAttributeExpression ) ) )* ( (lv_havingClause_5_0= ruleHavingClause ) )?
            {
            otherlv_0=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleGroupByClause454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGroupByClauseAccess().getGROUPKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleGroupByClause466); if (state.failed) return current;
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

            if ( (LA7_0==KEYWORD_59) ) {
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:337:1: ruleHavingClause returns [EObject current=null] : (otherlv_0= KEYWORD_59 ( (lv_having_1_0= ruleOrExpression ) ) ) ;
    public final EObject ruleHavingClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_having_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:340:28: ( (otherlv_0= KEYWORD_59 ( (lv_having_1_0= ruleOrExpression ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:341:1: (otherlv_0= KEYWORD_59 ( (lv_having_1_0= ruleOrExpression ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:341:1: (otherlv_0= KEYWORD_59 ( (lv_having_1_0= ruleOrExpression ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:342:2: otherlv_0= KEYWORD_59 ( (lv_having_1_0= ruleOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_ruleHavingClause627); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:381:1: ruleOrderByClause returns [EObject current=null] : (otherlv_0= KEYWORD_52 otherlv_1= KEYWORD_17 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_5 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* ) ;
    public final EObject ruleOrderByClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ordering_2_0 = null;

        EObject lv_ordering_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:384:28: ( (otherlv_0= KEYWORD_52 otherlv_1= KEYWORD_17 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_5 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:385:1: (otherlv_0= KEYWORD_52 otherlv_1= KEYWORD_17 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_5 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:385:1: (otherlv_0= KEYWORD_52 otherlv_1= KEYWORD_17 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_5 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )* )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:386:2: otherlv_0= KEYWORD_52 otherlv_1= KEYWORD_17 ( (lv_ordering_2_0= ruleOrderBySpec ) ) (otherlv_3= KEYWORD_5 ( (lv_ordering_4_0= ruleOrderBySpec ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleOrderByClause730); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOrderByClauseAccess().getORDERKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleOrderByClause742); if (state.failed) return current;
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

            if ( (LA9_0==KEYWORD_55) ) {
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:579:1: ruleUpdateClause returns [EObject current=null] : (otherlv_0= KEYWORD_64 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_5 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) ;
    public final EObject ruleUpdateClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_fromEntries_1_0 = null;

        EObject lv_fromEntries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:582:28: ( (otherlv_0= KEYWORD_64 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_5 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:583:1: (otherlv_0= KEYWORD_64 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_5 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:583:1: (otherlv_0= KEYWORD_64 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_5 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:584:2: otherlv_0= KEYWORD_64 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_5 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_64,FOLLOW_KEYWORD_64_in_ruleUpdateClause1130); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:646:1: ruleSetClause returns [EObject current=null] : (otherlv_0= KEYWORD_33 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_5 ( (lv_items_3_0= ruleUpdateItem ) ) )* ) ;
    public final EObject ruleSetClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:649:28: ( (otherlv_0= KEYWORD_33 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_5 ( (lv_items_3_0= ruleUpdateItem ) ) )* ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:650:1: (otherlv_0= KEYWORD_33 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_5 ( (lv_items_3_0= ruleUpdateItem ) ) )* )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:650:1: (otherlv_0= KEYWORD_33 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_5 ( (lv_items_3_0= ruleUpdateItem ) ) )* )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:651:2: otherlv_0= KEYWORD_33 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_5 ( (lv_items_3_0= ruleUpdateItem ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleSetClause1269); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:713:1: ruleUpdateItem returns [EObject current=null] : ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_11 ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleUpdateItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_alias_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:716:28: ( ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_11 ( (lv_value_2_0= ruleValue ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:717:1: ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_11 ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:717:1: ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_11 ( (lv_value_2_0= ruleValue ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:717:2: ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_11 ( (lv_value_2_0= ruleValue ) )
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
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:740:1: ( (lv_value_2_0= ruleValue ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:741:1: (lv_value_2_0= ruleValue )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:741:1: (lv_value_2_0= ruleValue )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:742:3: lv_value_2_0= ruleValue
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

            if ( (LA12_0==KEYWORD_55) ) {
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:832:1: ruleDeleteClause returns [EObject current=null] : (otherlv_0= KEYWORD_57 ( (lv_fromClause_1_0= ruleFromClause ) ) ) ;
    public final EObject ruleDeleteClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_fromClause_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:835:28: ( (otherlv_0= KEYWORD_57 ( (lv_fromClause_1_0= ruleFromClause ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:836:1: (otherlv_0= KEYWORD_57 ( (lv_fromClause_1_0= ruleFromClause ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:836:1: (otherlv_0= KEYWORD_57 ( (lv_fromClause_1_0= ruleFromClause ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:837:2: otherlv_0= KEYWORD_57 ( (lv_fromClause_1_0= ruleFromClause ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleDeleteClause1645); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:876:1: ruleSelectClause returns [EObject current=null] : (otherlv_0= KEYWORD_63 ( (lv_isDistinct_1_0= KEYWORD_66 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* ) ;
    public final EObject ruleSelectClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isDistinct_1_0=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:879:28: ( (otherlv_0= KEYWORD_63 ( (lv_isDistinct_1_0= KEYWORD_66 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:880:1: (otherlv_0= KEYWORD_63 ( (lv_isDistinct_1_0= KEYWORD_66 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:880:1: (otherlv_0= KEYWORD_63 ( (lv_isDistinct_1_0= KEYWORD_66 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:881:2: otherlv_0= KEYWORD_63 ( (lv_isDistinct_1_0= KEYWORD_66 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_expressions_4_0= ruleSelectExpression ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleSelectClause1748); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSelectClauseAccess().getSELECTKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:885:1: ( (lv_isDistinct_1_0= KEYWORD_66 ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==KEYWORD_66) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:886:1: (lv_isDistinct_1_0= KEYWORD_66 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:886:1: (lv_isDistinct_1_0= KEYWORD_66 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:887:3: lv_isDistinct_1_0= KEYWORD_66
                    {
                    lv_isDistinct_1_0=(Token)match(input,KEYWORD_66,FOLLOW_KEYWORD_66_in_ruleSelectClause1766); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:959:1: ruleSelectExpression returns [EObject current=null] : (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression ) ;
    public final EObject ruleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AliasAttributeExpression_0 = null;

        EObject this_SelectAggregateExpression_1 = null;

        EObject this_SelectConstructorExpression_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:962:28: ( (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:963:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:963:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt15=1;
                }
                break;
            case KEYWORD_45:
            case KEYWORD_27:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_34:
                {
                alt15=2;
                }
                break;
            case KEYWORD_31:
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:964:2: this_AliasAttributeExpression_0= ruleAliasAttributeExpression
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
            case KEYWORD_27:
                {
                alt16=1;
                }
                break;
            case KEYWORD_45:
                {
                alt16=2;
                }
                break;
            case KEYWORD_28:
                {
                alt16=3;
                }
                break;
            case KEYWORD_29:
                {
                alt16=4;
                }
                break;
            case KEYWORD_34:
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1103:1: ruleAvgAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_27 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_66 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleAvgAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1106:28: ( (otherlv_0= KEYWORD_27 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_66 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1107:1: (otherlv_0= KEYWORD_27 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_66 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1107:1: (otherlv_0= KEYWORD_27 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_66 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1108:2: otherlv_0= KEYWORD_27 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_66 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleAvgAggregate2286); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAvgAggregateAccess().getAVGKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleAvgAggregate2298); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAvgAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1117:1: ( (lv_isDistinct_2_0= KEYWORD_66 ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==KEYWORD_66) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1118:1: (lv_isDistinct_2_0= KEYWORD_66 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1118:1: (lv_isDistinct_2_0= KEYWORD_66 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1119:3: lv_isDistinct_2_0= KEYWORD_66
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_66,FOLLOW_KEYWORD_66_in_ruleAvgAggregate2316); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1173:1: ruleCountAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_66 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleCountAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1176:28: ( (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_66 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1177:1: (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_66 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1177:1: (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_66 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1178:2: otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_66 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleCountAggregate2444); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCountAggregateAccess().getCOUNTKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleCountAggregate2456); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCountAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1187:1: ( (lv_isDistinct_2_0= KEYWORD_66 ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KEYWORD_66) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1188:1: (lv_isDistinct_2_0= KEYWORD_66 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1188:1: (lv_isDistinct_2_0= KEYWORD_66 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1189:3: lv_isDistinct_2_0= KEYWORD_66
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_66,FOLLOW_KEYWORD_66_in_ruleCountAggregate2474); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1243:1: ruleMaxAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_28 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_66 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleMaxAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1246:28: ( (otherlv_0= KEYWORD_28 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_66 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1247:1: (otherlv_0= KEYWORD_28 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_66 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1247:1: (otherlv_0= KEYWORD_28 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_66 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1248:2: otherlv_0= KEYWORD_28 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_66 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleMaxAggregate2602); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMaxAggregateAccess().getMAXKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleMaxAggregate2614); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMaxAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1257:1: ( (lv_isDistinct_2_0= KEYWORD_66 ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KEYWORD_66) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1258:1: (lv_isDistinct_2_0= KEYWORD_66 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1258:1: (lv_isDistinct_2_0= KEYWORD_66 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1259:3: lv_isDistinct_2_0= KEYWORD_66
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_66,FOLLOW_KEYWORD_66_in_ruleMaxAggregate2632); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1313:1: ruleMinAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_29 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_66 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleMinAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1316:28: ( (otherlv_0= KEYWORD_29 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_66 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1317:1: (otherlv_0= KEYWORD_29 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_66 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1317:1: (otherlv_0= KEYWORD_29 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_66 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1318:2: otherlv_0= KEYWORD_29 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_66 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleMinAggregate2760); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMinAggregateAccess().getMINKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleMinAggregate2772); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMinAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1327:1: ( (lv_isDistinct_2_0= KEYWORD_66 ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KEYWORD_66) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1328:1: (lv_isDistinct_2_0= KEYWORD_66 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1328:1: (lv_isDistinct_2_0= KEYWORD_66 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1329:3: lv_isDistinct_2_0= KEYWORD_66
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_66,FOLLOW_KEYWORD_66_in_ruleMinAggregate2790); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1383:1: ruleSumAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_34 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_66 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleSumAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1386:28: ( (otherlv_0= KEYWORD_34 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_66 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1387:1: (otherlv_0= KEYWORD_34 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_66 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1387:1: (otherlv_0= KEYWORD_34 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_66 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1388:2: otherlv_0= KEYWORD_34 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_66 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleSumAggregate2918); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSumAggregateAccess().getSUMKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleSumAggregate2930); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSumAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1397:1: ( (lv_isDistinct_2_0= KEYWORD_66 ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KEYWORD_66) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1398:1: (lv_isDistinct_2_0= KEYWORD_66 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1398:1: (lv_isDistinct_2_0= KEYWORD_66 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1399:3: lv_isDistinct_2_0= KEYWORD_66
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_66,FOLLOW_KEYWORD_66_in_ruleSumAggregate2948); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1453:1: ruleSelectConstructorExpression returns [EObject current=null] : (otherlv_0= KEYWORD_31 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_5 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2 ) ;
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
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1456:28: ( (otherlv_0= KEYWORD_31 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_5 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1457:1: (otherlv_0= KEYWORD_31 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_5 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1457:1: (otherlv_0= KEYWORD_31 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_5 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1458:2: otherlv_0= KEYWORD_31 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_5 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleSelectConstructorExpression3076); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1548:1: ruleFromClause returns [EObject current=null] : (otherlv_0= KEYWORD_36 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_5 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) ;
    public final EObject ruleFromClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_fromEntries_1_0 = null;

        EObject lv_fromEntries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1551:28: ( (otherlv_0= KEYWORD_36 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_5 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1552:1: (otherlv_0= KEYWORD_36 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_5 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1552:1: (otherlv_0= KEYWORD_36 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_5 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1553:2: otherlv_0= KEYWORD_36 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_5 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleFromClause3261); if (state.failed) return current;
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
            else if ( (LA24_0==KEYWORD_18) ) {
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1661:1: ruleVariableDeclaration returns [EObject current=null] : ( (otherlv_0= KEYWORD_16 )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1664:28: ( ( (otherlv_0= KEYWORD_16 )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1665:1: ( (otherlv_0= KEYWORD_16 )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1665:1: ( (otherlv_0= KEYWORD_16 )? ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1665:2: (otherlv_0= KEYWORD_16 )? ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1665:2: (otherlv_0= KEYWORD_16 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==KEYWORD_16) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1666:2: otherlv_0= KEYWORD_16
                    {
                    otherlv_0=(Token)match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleVariableDeclaration3525); if (state.failed) return current;
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

                if ( (LA28_0==KEYWORD_50||(LA28_0>=KEYWORD_37 && LA28_0<=KEYWORD_38)) ) {
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1907:1: ruleFromCollection returns [EObject current=null] : (otherlv_0= KEYWORD_18 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleFromCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_path_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1910:28: ( (otherlv_0= KEYWORD_18 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1911:1: (otherlv_0= KEYWORD_18 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1911:1: (otherlv_0= KEYWORD_18 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1912:2: otherlv_0= KEYWORD_18 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleFromCollection4110); if (state.failed) return current;
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
            case KEYWORD_37:
                {
                alt29=1;
                }
                break;
            case KEYWORD_38:
                {
                alt29=2;
                }
                break;
            case KEYWORD_50:
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2038:1: ruleJoin returns [EObject current=null] : (otherlv_0= KEYWORD_37 ( (lv_isFetch_1_0= KEYWORD_48 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isFetch_1_0=null;
        EObject lv_path_2_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2041:28: ( (otherlv_0= KEYWORD_37 ( (lv_isFetch_1_0= KEYWORD_48 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2042:1: (otherlv_0= KEYWORD_37 ( (lv_isFetch_1_0= KEYWORD_48 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2042:1: (otherlv_0= KEYWORD_37 ( (lv_isFetch_1_0= KEYWORD_48 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2043:2: otherlv_0= KEYWORD_37 ( (lv_isFetch_1_0= KEYWORD_48 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleJoin4412); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJoinAccess().getJOINKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2047:1: ( (lv_isFetch_1_0= KEYWORD_48 ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==KEYWORD_48) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2048:1: (lv_isFetch_1_0= KEYWORD_48 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2048:1: (lv_isFetch_1_0= KEYWORD_48 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2049:3: lv_isFetch_1_0= KEYWORD_48
                    {
                    lv_isFetch_1_0=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleJoin4430); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2116:1: ruleLeftJoin returns [EObject current=null] : (otherlv_0= KEYWORD_38 ( (lv_isOuter_1_0= KEYWORD_53 ) )? otherlv_2= KEYWORD_37 ( (lv_isFetch_3_0= KEYWORD_48 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) ) ;
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
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2119:28: ( (otherlv_0= KEYWORD_38 ( (lv_isOuter_1_0= KEYWORD_53 ) )? otherlv_2= KEYWORD_37 ( (lv_isFetch_3_0= KEYWORD_48 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2120:1: (otherlv_0= KEYWORD_38 ( (lv_isOuter_1_0= KEYWORD_53 ) )? otherlv_2= KEYWORD_37 ( (lv_isFetch_3_0= KEYWORD_48 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2120:1: (otherlv_0= KEYWORD_38 ( (lv_isOuter_1_0= KEYWORD_53 ) )? otherlv_2= KEYWORD_37 ( (lv_isFetch_3_0= KEYWORD_48 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2121:2: otherlv_0= KEYWORD_38 ( (lv_isOuter_1_0= KEYWORD_53 ) )? otherlv_2= KEYWORD_37 ( (lv_isFetch_3_0= KEYWORD_48 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleLeftJoin4567); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLeftJoinAccess().getLEFTKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2125:1: ( (lv_isOuter_1_0= KEYWORD_53 ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==KEYWORD_53) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2126:1: (lv_isOuter_1_0= KEYWORD_53 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2126:1: (lv_isOuter_1_0= KEYWORD_53 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2127:3: lv_isOuter_1_0= KEYWORD_53
                    {
                    lv_isOuter_1_0=(Token)match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleLeftJoin4585); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleLeftJoin4610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLeftJoinAccess().getJOINKeyword_2());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2146:1: ( (lv_isFetch_3_0= KEYWORD_48 ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==KEYWORD_48) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2147:1: (lv_isFetch_3_0= KEYWORD_48 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2147:1: (lv_isFetch_3_0= KEYWORD_48 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2148:3: lv_isFetch_3_0= KEYWORD_48
                    {
                    lv_isFetch_3_0=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleLeftJoin4628); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2215:1: ruleInnerJoin returns [EObject current=null] : (otherlv_0= KEYWORD_50 otherlv_1= KEYWORD_37 ( (lv_isFetch_2_0= KEYWORD_48 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleInnerJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isFetch_2_0=null;
        EObject lv_path_3_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2218:28: ( (otherlv_0= KEYWORD_50 otherlv_1= KEYWORD_37 ( (lv_isFetch_2_0= KEYWORD_48 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2219:1: (otherlv_0= KEYWORD_50 otherlv_1= KEYWORD_37 ( (lv_isFetch_2_0= KEYWORD_48 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2219:1: (otherlv_0= KEYWORD_50 otherlv_1= KEYWORD_37 ( (lv_isFetch_2_0= KEYWORD_48 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2220:2: otherlv_0= KEYWORD_50 otherlv_1= KEYWORD_37 ( (lv_isFetch_2_0= KEYWORD_48 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleInnerJoin4765); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInnerJoinAccess().getINNERKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleInnerJoin4777); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInnerJoinAccess().getJOINKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2229:1: ( (lv_isFetch_2_0= KEYWORD_48 ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==KEYWORD_48) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2230:1: (lv_isFetch_2_0= KEYWORD_48 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2230:1: (lv_isFetch_2_0= KEYWORD_48 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2231:3: lv_isFetch_2_0= KEYWORD_48
                    {
                    lv_isFetch_2_0=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleInnerJoin4795); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2298:1: ruleWhereClause returns [EObject current=null] : (otherlv_0= KEYWORD_55 ( (lv_whereEntry_1_0= ruleOrExpression ) ) ) ;
    public final EObject ruleWhereClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_whereEntry_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2301:28: ( (otherlv_0= KEYWORD_55 ( (lv_whereEntry_1_0= ruleOrExpression ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2302:1: (otherlv_0= KEYWORD_55 ( (lv_whereEntry_1_0= ruleOrExpression ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2302:1: (otherlv_0= KEYWORD_55 ( (lv_whereEntry_1_0= ruleOrExpression ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2303:2: otherlv_0= KEYWORD_55 ( (lv_whereEntry_1_0= ruleOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleWhereClause4932); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2342:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_21 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2345:28: ( (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_21 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2346:1: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_21 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2346:1: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_21 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2347:2: this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_21 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )?
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
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2358:1: ( () (otherlv_2= KEYWORD_21 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==KEYWORD_21) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2358:2: () (otherlv_2= KEYWORD_21 ( (lv_entries_3_0= ruleAndExpression ) ) )+
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

                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2367:2: (otherlv_2= KEYWORD_21 ( (lv_entries_3_0= ruleAndExpression ) ) )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==KEYWORD_21) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2368:2: otherlv_2= KEYWORD_21 ( (lv_entries_3_0= ruleAndExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleOrExpression5073); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2407:1: ruleAndExpression returns [EObject current=null] : (this_ComparisonOperatorExpression_0= ruleComparisonOperatorExpression ( () (otherlv_2= KEYWORD_24 ( (lv_entries_3_0= ruleComparisonOperatorExpression ) ) )+ )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonOperatorExpression_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2410:28: ( (this_ComparisonOperatorExpression_0= ruleComparisonOperatorExpression ( () (otherlv_2= KEYWORD_24 ( (lv_entries_3_0= ruleComparisonOperatorExpression ) ) )+ )? ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2411:1: (this_ComparisonOperatorExpression_0= ruleComparisonOperatorExpression ( () (otherlv_2= KEYWORD_24 ( (lv_entries_3_0= ruleComparisonOperatorExpression ) ) )+ )? )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2411:1: (this_ComparisonOperatorExpression_0= ruleComparisonOperatorExpression ( () (otherlv_2= KEYWORD_24 ( (lv_entries_3_0= ruleComparisonOperatorExpression ) ) )+ )? )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2412:2: this_ComparisonOperatorExpression_0= ruleComparisonOperatorExpression ( () (otherlv_2= KEYWORD_24 ( (lv_entries_3_0= ruleComparisonOperatorExpression ) ) )+ )?
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
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2423:1: ( () (otherlv_2= KEYWORD_24 ( (lv_entries_3_0= ruleComparisonOperatorExpression ) ) )+ )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==KEYWORD_24) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2423:2: () (otherlv_2= KEYWORD_24 ( (lv_entries_3_0= ruleComparisonOperatorExpression ) ) )+
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

                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2432:2: (otherlv_2= KEYWORD_24 ( (lv_entries_3_0= ruleComparisonOperatorExpression ) ) )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==KEYWORD_24) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2433:2: otherlv_2= KEYWORD_24 ( (lv_entries_3_0= ruleComparisonOperatorExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleAndExpression5218); if (state.failed) return current;
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

                if ( ((LA38_0>=KEYWORD_13 && LA38_0<=KEYWORD_15)||(LA38_0>=KEYWORD_10 && LA38_0<=KEYWORD_12)) ) {
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

            if ( (LA41_0==KEYWORD_32||LA41_0==KEYWORD_4||LA41_0==KEYWORD_6) ) {
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2763:1: ruleConcreteExpression returns [EObject current=null] : (this_ParenthesesExpression_0= ruleParenthesesExpression | this_ExistsExpression_1= ruleExistsExpression | this_AllExpression_2= ruleAllExpression | this_AnyExpression_3= ruleAnyExpression | this_SomeExpression_4= ruleSomeExpression | this_CollectionExpression_5= ruleCollectionExpression | this_NullComparisonExpression_6= ruleNullComparisonExpression | this_EmptyComparisonExpression_7= ruleEmptyComparisonExpression | this_LikeExpression_8= ruleLikeExpression | this_InExpression_9= ruleInExpression | this_BetweenExpression_10= ruleBetweenExpression ) ;
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


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2766:28: ( (this_ParenthesesExpression_0= ruleParenthesesExpression | this_ExistsExpression_1= ruleExistsExpression | this_AllExpression_2= ruleAllExpression | this_AnyExpression_3= ruleAnyExpression | this_SomeExpression_4= ruleSomeExpression | this_CollectionExpression_5= ruleCollectionExpression | this_NullComparisonExpression_6= ruleNullComparisonExpression | this_EmptyComparisonExpression_7= ruleEmptyComparisonExpression | this_LikeExpression_8= ruleLikeExpression | this_InExpression_9= ruleInExpression | this_BetweenExpression_10= ruleBetweenExpression ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2767:1: (this_ParenthesesExpression_0= ruleParenthesesExpression | this_ExistsExpression_1= ruleExistsExpression | this_AllExpression_2= ruleAllExpression | this_AnyExpression_3= ruleAnyExpression | this_SomeExpression_4= ruleSomeExpression | this_CollectionExpression_5= ruleCollectionExpression | this_NullComparisonExpression_6= ruleNullComparisonExpression | this_EmptyComparisonExpression_7= ruleEmptyComparisonExpression | this_LikeExpression_8= ruleLikeExpression | this_InExpression_9= ruleInExpression | this_BetweenExpression_10= ruleBetweenExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2767:1: (this_ParenthesesExpression_0= ruleParenthesesExpression | this_ExistsExpression_1= ruleExistsExpression | this_AllExpression_2= ruleAllExpression | this_AnyExpression_3= ruleAnyExpression | this_SomeExpression_4= ruleSomeExpression | this_CollectionExpression_5= ruleCollectionExpression | this_NullComparisonExpression_6= ruleNullComparisonExpression | this_EmptyComparisonExpression_7= ruleEmptyComparisonExpression | this_LikeExpression_8= ruleLikeExpression | this_InExpression_9= ruleInExpression | this_BetweenExpression_10= ruleBetweenExpression )
            int alt42=11;
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

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2917:1: entryRuleParenthesesExpression returns [EObject current=null] : iv_ruleParenthesesExpression= ruleParenthesesExpression EOF ;
    public final EObject entryRuleParenthesesExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesesExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2918:2: (iv_ruleParenthesesExpression= ruleParenthesesExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2919:2: iv_ruleParenthesesExpression= ruleParenthesesExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesesExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesesExpression_in_entryRuleParenthesesExpression6237);
            iv_ruleParenthesesExpression=ruleParenthesesExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesesExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesesExpression6247); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2926:1: ruleParenthesesExpression returns [EObject current=null] : (otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2 ) ;
    public final EObject ruleParenthesesExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ExpressionTerm_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2929:28: ( (otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2930:1: (otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2930:1: (otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2931:2: otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleParenthesesExpression6285); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesesExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesesExpressionAccess().getExpressionTermParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionTerm_in_ruleParenthesesExpression6309);
            this_ExpressionTerm_1=ruleExpressionTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ExpressionTerm_1;
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleParenthesesExpression6321); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2960:1: entryRuleExistsExpression returns [EObject current=null] : iv_ruleExistsExpression= ruleExistsExpression EOF ;
    public final EObject entryRuleExistsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistsExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2961:2: (iv_ruleExistsExpression= ruleExistsExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2962:2: iv_ruleExistsExpression= ruleExistsExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExistsExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExistsExpression_in_entryRuleExistsExpression6355);
            iv_ruleExistsExpression=ruleExistsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExistsExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExistsExpression6365); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2969:1: ruleExistsExpression returns [EObject current=null] : (otherlv_0= KEYWORD_58 ( (lv_right_1_0= ruleSubquery ) ) ) ;
    public final EObject ruleExistsExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2972:28: ( (otherlv_0= KEYWORD_58 ( (lv_right_1_0= ruleSubquery ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2973:1: (otherlv_0= KEYWORD_58 ( (lv_right_1_0= ruleSubquery ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2973:1: (otherlv_0= KEYWORD_58 ( (lv_right_1_0= ruleSubquery ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2974:2: otherlv_0= KEYWORD_58 ( (lv_right_1_0= ruleSubquery ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleExistsExpression6403); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExistsExpressionAccess().getEXISTSKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2978:1: ( (lv_right_1_0= ruleSubquery ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2979:1: (lv_right_1_0= ruleSubquery )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2979:1: (lv_right_1_0= ruleSubquery )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2980:3: lv_right_1_0= ruleSubquery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExistsExpressionAccess().getRightSubqueryParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSubquery_in_ruleExistsExpression6423);
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3004:1: entryRuleAllExpression returns [EObject current=null] : iv_ruleAllExpression= ruleAllExpression EOF ;
    public final EObject entryRuleAllExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3005:2: (iv_ruleAllExpression= ruleAllExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3006:2: iv_ruleAllExpression= ruleAllExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAllExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAllExpression_in_entryRuleAllExpression6458);
            iv_ruleAllExpression=ruleAllExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAllExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllExpression6468); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3013:1: ruleAllExpression returns [EObject current=null] : (otherlv_0= KEYWORD_23 ( (lv_right_1_0= ruleSubquery ) ) ) ;
    public final EObject ruleAllExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3016:28: ( (otherlv_0= KEYWORD_23 ( (lv_right_1_0= ruleSubquery ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3017:1: (otherlv_0= KEYWORD_23 ( (lv_right_1_0= ruleSubquery ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3017:1: (otherlv_0= KEYWORD_23 ( (lv_right_1_0= ruleSubquery ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3018:2: otherlv_0= KEYWORD_23 ( (lv_right_1_0= ruleSubquery ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleAllExpression6506); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAllExpressionAccess().getALLKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3022:1: ( (lv_right_1_0= ruleSubquery ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3023:1: (lv_right_1_0= ruleSubquery )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3023:1: (lv_right_1_0= ruleSubquery )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3024:3: lv_right_1_0= ruleSubquery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAllExpressionAccess().getRightSubqueryParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSubquery_in_ruleAllExpression6526);
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3048:1: entryRuleAnyExpression returns [EObject current=null] : iv_ruleAnyExpression= ruleAnyExpression EOF ;
    public final EObject entryRuleAnyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3049:2: (iv_ruleAnyExpression= ruleAnyExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3050:2: iv_ruleAnyExpression= ruleAnyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAnyExpression_in_entryRuleAnyExpression6561);
            iv_ruleAnyExpression=ruleAnyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnyExpression6571); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3057:1: ruleAnyExpression returns [EObject current=null] : (otherlv_0= KEYWORD_25 ( (lv_right_1_0= ruleSubquery ) ) ) ;
    public final EObject ruleAnyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3060:28: ( (otherlv_0= KEYWORD_25 ( (lv_right_1_0= ruleSubquery ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3061:1: (otherlv_0= KEYWORD_25 ( (lv_right_1_0= ruleSubquery ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3061:1: (otherlv_0= KEYWORD_25 ( (lv_right_1_0= ruleSubquery ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3062:2: otherlv_0= KEYWORD_25 ( (lv_right_1_0= ruleSubquery ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleAnyExpression6609); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnyExpressionAccess().getANYKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3066:1: ( (lv_right_1_0= ruleSubquery ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3067:1: (lv_right_1_0= ruleSubquery )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3067:1: (lv_right_1_0= ruleSubquery )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3068:3: lv_right_1_0= ruleSubquery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnyExpressionAccess().getRightSubqueryParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSubquery_in_ruleAnyExpression6629);
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3092:1: entryRuleSomeExpression returns [EObject current=null] : iv_ruleSomeExpression= ruleSomeExpression EOF ;
    public final EObject entryRuleSomeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSomeExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3093:2: (iv_ruleSomeExpression= ruleSomeExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3094:2: iv_ruleSomeExpression= ruleSomeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSomeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSomeExpression_in_entryRuleSomeExpression6664);
            iv_ruleSomeExpression=ruleSomeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSomeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSomeExpression6674); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3101:1: ruleSomeExpression returns [EObject current=null] : (otherlv_0= KEYWORD_42 ( (lv_right_1_0= ruleSubquery ) ) ) ;
    public final EObject ruleSomeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3104:28: ( (otherlv_0= KEYWORD_42 ( (lv_right_1_0= ruleSubquery ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3105:1: (otherlv_0= KEYWORD_42 ( (lv_right_1_0= ruleSubquery ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3105:1: (otherlv_0= KEYWORD_42 ( (lv_right_1_0= ruleSubquery ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3106:2: otherlv_0= KEYWORD_42 ( (lv_right_1_0= ruleSubquery ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleSomeExpression6712); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSomeExpressionAccess().getSOMEKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3110:1: ( (lv_right_1_0= ruleSubquery ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3111:1: (lv_right_1_0= ruleSubquery )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3111:1: (lv_right_1_0= ruleSubquery )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3112:3: lv_right_1_0= ruleSubquery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSomeExpressionAccess().getRightSubqueryParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSubquery_in_ruleSomeExpression6732);
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3136:1: entryRuleCollectionExpression returns [EObject current=null] : iv_ruleCollectionExpression= ruleCollectionExpression EOF ;
    public final EObject entryRuleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3137:2: (iv_ruleCollectionExpression= ruleCollectionExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3138:2: iv_ruleCollectionExpression= ruleCollectionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression6767);
            iv_ruleCollectionExpression=ruleCollectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionExpression6777); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3145:1: ruleCollectionExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_32 ) )? otherlv_2= KEYWORD_62 (otherlv_3= KEYWORD_20 )? ( (lv_right_4_0= ruleAliasAttributeExpression ) ) ) ;
    public final EObject ruleCollectionExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3148:28: ( ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_32 ) )? otherlv_2= KEYWORD_62 (otherlv_3= KEYWORD_20 )? ( (lv_right_4_0= ruleAliasAttributeExpression ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3149:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_32 ) )? otherlv_2= KEYWORD_62 (otherlv_3= KEYWORD_20 )? ( (lv_right_4_0= ruleAliasAttributeExpression ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3149:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_32 ) )? otherlv_2= KEYWORD_62 (otherlv_3= KEYWORD_20 )? ( (lv_right_4_0= ruleAliasAttributeExpression ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3149:2: ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_32 ) )? otherlv_2= KEYWORD_62 (otherlv_3= KEYWORD_20 )? ( (lv_right_4_0= ruleAliasAttributeExpression ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3149:2: ( (lv_left_0_0= ruleVariable ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3150:1: (lv_left_0_0= ruleVariable )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3150:1: (lv_left_0_0= ruleVariable )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3151:3: lv_left_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionExpressionAccess().getLeftVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleCollectionExpression6823);
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

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3167:2: ( (lv_isNot_1_0= KEYWORD_32 ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==KEYWORD_32) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3168:1: (lv_isNot_1_0= KEYWORD_32 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3168:1: (lv_isNot_1_0= KEYWORD_32 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3169:3: lv_isNot_1_0= KEYWORD_32
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleCollectionExpression6842); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleCollectionExpression6867); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCollectionExpressionAccess().getMEMBERKeyword_2());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3188:1: (otherlv_3= KEYWORD_20 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==KEYWORD_20) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3189:2: otherlv_3= KEYWORD_20
                    {
                    otherlv_3=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleCollectionExpression6880); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCollectionExpressionAccess().getOFKeyword_3());
                          
                    }

                    }
                    break;

            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3193:3: ( (lv_right_4_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3194:1: (lv_right_4_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3194:1: (lv_right_4_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3195:3: lv_right_4_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionExpressionAccess().getRightAliasAttributeExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleCollectionExpression6902);
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3219:1: entryRuleNullComparisonExpression returns [EObject current=null] : iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF ;
    public final EObject entryRuleNullComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullComparisonExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3220:2: (iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3221:2: iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullComparisonExpression_in_entryRuleNullComparisonExpression6937);
            iv_ruleNullComparisonExpression=ruleNullComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullComparisonExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullComparisonExpression6947); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3228:1: ruleNullComparisonExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_19 ( (lv_isNot_2_0= KEYWORD_32 ) )? otherlv_3= KEYWORD_40 ) ;
    public final EObject ruleNullComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isNot_2_0=null;
        Token otherlv_3=null;
        EObject lv_left_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3231:28: ( ( ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_19 ( (lv_isNot_2_0= KEYWORD_32 ) )? otherlv_3= KEYWORD_40 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3232:1: ( ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_19 ( (lv_isNot_2_0= KEYWORD_32 ) )? otherlv_3= KEYWORD_40 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3232:1: ( ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_19 ( (lv_isNot_2_0= KEYWORD_32 ) )? otherlv_3= KEYWORD_40 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3232:2: ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_19 ( (lv_isNot_2_0= KEYWORD_32 ) )? otherlv_3= KEYWORD_40
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3232:2: ( (lv_left_0_0= ruleVariable ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3233:1: (lv_left_0_0= ruleVariable )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3233:1: (lv_left_0_0= ruleVariable )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3234:3: lv_left_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNullComparisonExpressionAccess().getLeftVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleNullComparisonExpression6993);
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

            otherlv_1=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleNullComparisonExpression7006); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNullComparisonExpressionAccess().getISKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3255:1: ( (lv_isNot_2_0= KEYWORD_32 ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==KEYWORD_32) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3256:1: (lv_isNot_2_0= KEYWORD_32 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3256:1: (lv_isNot_2_0= KEYWORD_32 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3257:3: lv_isNot_2_0= KEYWORD_32
                    {
                    lv_isNot_2_0=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleNullComparisonExpression7024); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleNullComparisonExpression7049); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3284:1: entryRuleEmptyComparisonExpression returns [EObject current=null] : iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF ;
    public final EObject entryRuleEmptyComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyComparisonExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3285:2: (iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3286:2: iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmptyComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEmptyComparisonExpression_in_entryRuleEmptyComparisonExpression7083);
            iv_ruleEmptyComparisonExpression=ruleEmptyComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmptyComparisonExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmptyComparisonExpression7093); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3293:1: ruleEmptyComparisonExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_19 ( (lv_isNot_2_0= KEYWORD_32 ) )? otherlv_3= KEYWORD_46 ) ;
    public final EObject ruleEmptyComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isNot_2_0=null;
        Token otherlv_3=null;
        EObject lv_left_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3296:28: ( ( ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_19 ( (lv_isNot_2_0= KEYWORD_32 ) )? otherlv_3= KEYWORD_46 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3297:1: ( ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_19 ( (lv_isNot_2_0= KEYWORD_32 ) )? otherlv_3= KEYWORD_46 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3297:1: ( ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_19 ( (lv_isNot_2_0= KEYWORD_32 ) )? otherlv_3= KEYWORD_46 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3297:2: ( (lv_left_0_0= ruleVariable ) ) otherlv_1= KEYWORD_19 ( (lv_isNot_2_0= KEYWORD_32 ) )? otherlv_3= KEYWORD_46
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3297:2: ( (lv_left_0_0= ruleVariable ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3298:1: (lv_left_0_0= ruleVariable )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3298:1: (lv_left_0_0= ruleVariable )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3299:3: lv_left_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEmptyComparisonExpressionAccess().getLeftVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleEmptyComparisonExpression7139);
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

            otherlv_1=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleEmptyComparisonExpression7152); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEmptyComparisonExpressionAccess().getISKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3320:1: ( (lv_isNot_2_0= KEYWORD_32 ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==KEYWORD_32) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3321:1: (lv_isNot_2_0= KEYWORD_32 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3321:1: (lv_isNot_2_0= KEYWORD_32 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3322:3: lv_isNot_2_0= KEYWORD_32
                    {
                    lv_isNot_2_0=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleEmptyComparisonExpression7170); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleEmptyComparisonExpression7195); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3349:1: entryRuleLikeExpression returns [EObject current=null] : iv_ruleLikeExpression= ruleLikeExpression EOF ;
    public final EObject entryRuleLikeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLikeExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3350:2: (iv_ruleLikeExpression= ruleLikeExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3351:2: iv_ruleLikeExpression= ruleLikeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLikeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLikeExpression_in_entryRuleLikeExpression7229);
            iv_ruleLikeExpression=ruleLikeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLikeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLikeExpression7239); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3358:1: ruleLikeExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_32 ) )? otherlv_2= KEYWORD_39 ( (lv_right_3_0= ruleStringLiteral ) ) ) ;
    public final EObject ruleLikeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3361:28: ( ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_32 ) )? otherlv_2= KEYWORD_39 ( (lv_right_3_0= ruleStringLiteral ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3362:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_32 ) )? otherlv_2= KEYWORD_39 ( (lv_right_3_0= ruleStringLiteral ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3362:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_32 ) )? otherlv_2= KEYWORD_39 ( (lv_right_3_0= ruleStringLiteral ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3362:2: ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_32 ) )? otherlv_2= KEYWORD_39 ( (lv_right_3_0= ruleStringLiteral ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3362:2: ( (lv_left_0_0= ruleVariable ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3363:1: (lv_left_0_0= ruleVariable )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3363:1: (lv_left_0_0= ruleVariable )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3364:3: lv_left_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLikeExpressionAccess().getLeftVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleLikeExpression7285);
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

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3380:2: ( (lv_isNot_1_0= KEYWORD_32 ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==KEYWORD_32) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3381:1: (lv_isNot_1_0= KEYWORD_32 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3381:1: (lv_isNot_1_0= KEYWORD_32 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3382:3: lv_isNot_1_0= KEYWORD_32
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleLikeExpression7304); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleLikeExpression7329); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLikeExpressionAccess().getLIKEKeyword_2());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3401:1: ( (lv_right_3_0= ruleStringLiteral ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3402:1: (lv_right_3_0= ruleStringLiteral )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3402:1: (lv_right_3_0= ruleStringLiteral )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3403:3: lv_right_3_0= ruleStringLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLikeExpressionAccess().getRightStringLiteralParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_ruleLikeExpression7349);
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3427:1: entryRuleInExpression returns [EObject current=null] : iv_ruleInExpression= ruleInExpression EOF ;
    public final EObject entryRuleInExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3428:2: (iv_ruleInExpression= ruleInExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3429:2: iv_ruleInExpression= ruleInExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInExpression_in_entryRuleInExpression7384);
            iv_ruleInExpression=ruleInExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInExpression7394); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3436:1: ruleInExpression returns [EObject current=null] : (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression ) ;
    public final EObject ruleInExpression() throws RecognitionException {
        EObject current = null;

        EObject this_InSeqExpression_0 = null;

        EObject this_InQueryExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3439:28: ( (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3440:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3440:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )
            int alt48=2;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3441:2: this_InSeqExpression_0= ruleInSeqExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInExpressionAccess().getInSeqExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInSeqExpression_in_ruleInExpression7444);
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3454:2: this_InQueryExpression_1= ruleInQueryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInExpressionAccess().getInQueryExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInQueryExpression_in_ruleInExpression7474);
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3473:1: entryRuleInSeqExpression returns [EObject current=null] : iv_ruleInSeqExpression= ruleInSeqExpression EOF ;
    public final EObject entryRuleInSeqExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInSeqExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3474:2: (iv_ruleInSeqExpression= ruleInSeqExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3475:2: iv_ruleInSeqExpression= ruleInSeqExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInSeqExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInSeqExpression_in_entryRuleInSeqExpression7508);
            iv_ruleInSeqExpression=ruleInSeqExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInSeqExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInSeqExpression7518); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3482:1: ruleInSeqExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_32 ) )? otherlv_2= KEYWORD_18 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_5 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2 ) ;
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
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3485:28: ( ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_32 ) )? otherlv_2= KEYWORD_18 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_5 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3486:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_32 ) )? otherlv_2= KEYWORD_18 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_5 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3486:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_32 ) )? otherlv_2= KEYWORD_18 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_5 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3486:2: ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_32 ) )? otherlv_2= KEYWORD_18 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_5 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3486:2: ( (lv_left_0_0= ruleVariable ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3487:1: (lv_left_0_0= ruleVariable )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3487:1: (lv_left_0_0= ruleVariable )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3488:3: lv_left_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInSeqExpressionAccess().getLeftVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7564);
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

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3504:2: ( (lv_isNot_1_0= KEYWORD_32 ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==KEYWORD_32) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3505:1: (lv_isNot_1_0= KEYWORD_32 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3505:1: (lv_isNot_1_0= KEYWORD_32 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3506:3: lv_isNot_1_0= KEYWORD_32
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleInSeqExpression7583); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleInSeqExpression7608); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInSeqExpressionAccess().getINKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleInSeqExpression7620); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInSeqExpressionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3530:1: ( (lv_items_4_0= ruleVariable ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3531:1: (lv_items_4_0= ruleVariable )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3531:1: (lv_items_4_0= ruleVariable )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3532:3: lv_items_4_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInSeqExpressionAccess().getItemsVariableParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7640);
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

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3548:2: (otherlv_5= KEYWORD_5 ( (lv_items_6_0= ruleVariable ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==KEYWORD_5) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3549:2: otherlv_5= KEYWORD_5 ( (lv_items_6_0= ruleVariable ) )
            	    {
            	    otherlv_5=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleInSeqExpression7654); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getInSeqExpressionAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3553:1: ( (lv_items_6_0= ruleVariable ) )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3554:1: (lv_items_6_0= ruleVariable )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3554:1: (lv_items_6_0= ruleVariable )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3555:3: lv_items_6_0= ruleVariable
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInSeqExpressionAccess().getItemsVariableParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7674);
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

            otherlv_7=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleInSeqExpression7689); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3584:1: entryRuleInQueryExpression returns [EObject current=null] : iv_ruleInQueryExpression= ruleInQueryExpression EOF ;
    public final EObject entryRuleInQueryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInQueryExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3585:2: (iv_ruleInQueryExpression= ruleInQueryExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3586:2: iv_ruleInQueryExpression= ruleInQueryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInQueryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInQueryExpression_in_entryRuleInQueryExpression7723);
            iv_ruleInQueryExpression=ruleInQueryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInQueryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInQueryExpression7733); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3593:1: ruleInQueryExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_32 ) )? otherlv_2= KEYWORD_18 ( (lv_query_3_0= ruleSubquery ) ) ) ;
    public final EObject ruleInQueryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        EObject lv_left_0_0 = null;

        EObject lv_query_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3596:28: ( ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_32 ) )? otherlv_2= KEYWORD_18 ( (lv_query_3_0= ruleSubquery ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3597:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_32 ) )? otherlv_2= KEYWORD_18 ( (lv_query_3_0= ruleSubquery ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3597:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_32 ) )? otherlv_2= KEYWORD_18 ( (lv_query_3_0= ruleSubquery ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3597:2: ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_32 ) )? otherlv_2= KEYWORD_18 ( (lv_query_3_0= ruleSubquery ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3597:2: ( (lv_left_0_0= ruleVariable ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3598:1: (lv_left_0_0= ruleVariable )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3598:1: (lv_left_0_0= ruleVariable )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3599:3: lv_left_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInQueryExpressionAccess().getLeftVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleInQueryExpression7779);
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

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3615:2: ( (lv_isNot_1_0= KEYWORD_32 ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==KEYWORD_32) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3616:1: (lv_isNot_1_0= KEYWORD_32 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3616:1: (lv_isNot_1_0= KEYWORD_32 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3617:3: lv_isNot_1_0= KEYWORD_32
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleInQueryExpression7798); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleInQueryExpression7823); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInQueryExpressionAccess().getINKeyword_2());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3636:1: ( (lv_query_3_0= ruleSubquery ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3637:1: (lv_query_3_0= ruleSubquery )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3637:1: (lv_query_3_0= ruleSubquery )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3638:3: lv_query_3_0= ruleSubquery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInQueryExpressionAccess().getQuerySubqueryParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSubquery_in_ruleInQueryExpression7843);
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3662:1: entryRuleBetweenExpression returns [EObject current=null] : iv_ruleBetweenExpression= ruleBetweenExpression EOF ;
    public final EObject entryRuleBetweenExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBetweenExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3663:2: (iv_ruleBetweenExpression= ruleBetweenExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3664:2: iv_ruleBetweenExpression= ruleBetweenExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBetweenExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBetweenExpression_in_entryRuleBetweenExpression7878);
            iv_ruleBetweenExpression=ruleBetweenExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBetweenExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBetweenExpression7888); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3671:1: ruleBetweenExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_32 ) )? otherlv_2= KEYWORD_65 ( (lv_min_3_0= ruleValue ) ) otherlv_4= KEYWORD_24 ( (lv_max_5_0= ruleValue ) ) ) ;
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
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3674:28: ( ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_32 ) )? otherlv_2= KEYWORD_65 ( (lv_min_3_0= ruleValue ) ) otherlv_4= KEYWORD_24 ( (lv_max_5_0= ruleValue ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3675:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_32 ) )? otherlv_2= KEYWORD_65 ( (lv_min_3_0= ruleValue ) ) otherlv_4= KEYWORD_24 ( (lv_max_5_0= ruleValue ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3675:1: ( ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_32 ) )? otherlv_2= KEYWORD_65 ( (lv_min_3_0= ruleValue ) ) otherlv_4= KEYWORD_24 ( (lv_max_5_0= ruleValue ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3675:2: ( (lv_left_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_32 ) )? otherlv_2= KEYWORD_65 ( (lv_min_3_0= ruleValue ) ) otherlv_4= KEYWORD_24 ( (lv_max_5_0= ruleValue ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3675:2: ( (lv_left_0_0= ruleVariable ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3676:1: (lv_left_0_0= ruleVariable )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3676:1: (lv_left_0_0= ruleVariable )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3677:3: lv_left_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBetweenExpressionAccess().getLeftVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleBetweenExpression7934);
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

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3693:2: ( (lv_isNot_1_0= KEYWORD_32 ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==KEYWORD_32) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3694:1: (lv_isNot_1_0= KEYWORD_32 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3694:1: (lv_isNot_1_0= KEYWORD_32 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3695:3: lv_isNot_1_0= KEYWORD_32
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleBetweenExpression7953); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_ruleBetweenExpression7978); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBetweenExpressionAccess().getBETWEENKeyword_2());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3714:1: ( (lv_min_3_0= ruleValue ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3715:1: (lv_min_3_0= ruleValue )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3715:1: (lv_min_3_0= ruleValue )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3716:3: lv_min_3_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBetweenExpressionAccess().getMinValueParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleBetweenExpression7998);
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

            otherlv_4=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleBetweenExpression8011); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBetweenExpressionAccess().getANDKeyword_4());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3737:1: ( (lv_max_5_0= ruleValue ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3738:1: (lv_max_5_0= ruleValue )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3738:1: (lv_max_5_0= ruleValue )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3739:3: lv_max_5_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBetweenExpressionAccess().getMaxValueParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleBetweenExpression8031);
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3763:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3764:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3765:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable8066);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable8076); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3772:1: ruleVariable returns [EObject current=null] : (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_AliasAttributeExpression_0 = null;

        EObject this_ParameterExpression_1 = null;

        EObject this_Value_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3775:28: ( (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3776:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3776:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue )
            int alt53=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt53=1;
                }
                break;
            case KEYWORD_9:
                {
                alt53=2;
                }
                break;
            case KEYWORD_47:
            case KEYWORD_40:
            case KEYWORD_44:
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3777:2: this_AliasAttributeExpression_0= ruleAliasAttributeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccess().getAliasAttributeExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleVariable8126);
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3790:2: this_ParameterExpression_1= ruleParameterExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccess().getParameterExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameterExpression_in_ruleVariable8156);
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3803:2: this_Value_2= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccess().getValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleVariable8186);
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3822:1: entryRuleExpressionTerm returns [EObject current=null] : iv_ruleExpressionTerm= ruleExpressionTerm EOF ;
    public final EObject entryRuleExpressionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionTerm = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3823:2: (iv_ruleExpressionTerm= ruleExpressionTerm EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3824:2: iv_ruleExpressionTerm= ruleExpressionTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionTermRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionTerm_in_entryRuleExpressionTerm8220);
            iv_ruleExpressionTerm=ruleExpressionTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionTerm8230); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3831:1: ruleExpressionTerm returns [EObject current=null] : (this_Variable_0= ruleVariable | this_Subquery_1= ruleSubquery ) ;
    public final EObject ruleExpressionTerm() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_Subquery_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3834:28: ( (this_Variable_0= ruleVariable | this_Subquery_1= ruleSubquery ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3835:1: (this_Variable_0= ruleVariable | this_Subquery_1= ruleSubquery )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3835:1: (this_Variable_0= ruleVariable | this_Subquery_1= ruleSubquery )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==KEYWORD_47||LA54_0==KEYWORD_40||LA54_0==KEYWORD_44||LA54_0==KEYWORD_9||(LA54_0>=RULE_ID && LA54_0<=RULE_STRING)) ) {
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3836:2: this_Variable_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionTermAccess().getVariableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleExpressionTerm8280);
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3849:2: this_Subquery_1= ruleSubquery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionTermAccess().getSubqueryParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubquery_in_ruleExpressionTerm8310);
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3868:1: entryRuleAliasAttributeExpression returns [EObject current=null] : iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF ;
    public final EObject entryRuleAliasAttributeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasAttributeExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3869:2: (iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3870:2: iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAliasAttributeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_entryRuleAliasAttributeExpression8344);
            iv_ruleAliasAttributeExpression=ruleAliasAttributeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAliasAttributeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAliasAttributeExpression8354); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3877:1: ruleAliasAttributeExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_7 ( (lv_attributes_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleAliasAttributeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_attributes_2_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3880:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_7 ( (lv_attributes_2_0= RULE_ID ) ) )* ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3881:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_7 ( (lv_attributes_2_0= RULE_ID ) ) )* )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3881:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_7 ( (lv_attributes_2_0= RULE_ID ) ) )* )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3881:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_7 ( (lv_attributes_2_0= RULE_ID ) ) )*
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3881:2: ( (otherlv_0= RULE_ID ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3882:1: (otherlv_0= RULE_ID )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3882:1: (otherlv_0= RULE_ID )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3883:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAliasAttributeExpressionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8403); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getAliasAttributeExpressionAccess().getAliasVariableDeclarationCrossReference_0_0()); 
              	
            }

            }


            }

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3897:2: (otherlv_1= KEYWORD_7 ( (lv_attributes_2_0= RULE_ID ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==KEYWORD_7) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3898:2: otherlv_1= KEYWORD_7 ( (lv_attributes_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleAliasAttributeExpression8417); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getAliasAttributeExpressionAccess().getFullStopKeyword_1_0());
            	          
            	    }
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3902:1: ( (lv_attributes_2_0= RULE_ID ) )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3903:1: (lv_attributes_2_0= RULE_ID )
            	    {
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3903:1: (lv_attributes_2_0= RULE_ID )
            	    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3904:3: lv_attributes_2_0= RULE_ID
            	    {
            	    lv_attributes_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8433); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3928:1: entryRuleParameterExpression returns [EObject current=null] : iv_ruleParameterExpression= ruleParameterExpression EOF ;
    public final EObject entryRuleParameterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterExpression = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3929:2: (iv_ruleParameterExpression= ruleParameterExpression EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3930:2: iv_ruleParameterExpression= ruleParameterExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParameterExpression_in_entryRuleParameterExpression8475);
            iv_ruleParameterExpression=ruleParameterExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterExpression8485); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3937:1: ruleParameterExpression returns [EObject current=null] : (otherlv_0= KEYWORD_9 ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameterExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3940:28: ( (otherlv_0= KEYWORD_9 ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3941:1: (otherlv_0= KEYWORD_9 ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3941:1: (otherlv_0= KEYWORD_9 ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3942:2: otherlv_0= KEYWORD_9 ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleParameterExpression8523); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParameterExpressionAccess().getColonKeyword_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3946:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3947:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3947:1: (lv_name_1_0= RULE_ID )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3948:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterExpression8539); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3974:1: entryRuleStringFunction returns [EObject current=null] : iv_ruleStringFunction= ruleStringFunction EOF ;
    public final EObject entryRuleStringFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringFunction = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3975:2: (iv_ruleStringFunction= ruleStringFunction EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3976:2: iv_ruleStringFunction= ruleStringFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleStringFunction_in_entryRuleStringFunction8581);
            iv_ruleStringFunction=ruleStringFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunction8591); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3983:1: ruleStringFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_5 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 ) ;
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
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3986:28: ( ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_5 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3987:1: ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_5 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3987:1: ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_5 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3987:2: ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_5 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3987:2: ( (lv_name_0_0= ruleStringFunctionName ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3988:1: (lv_name_0_0= ruleStringFunctionName )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3988:1: (lv_name_0_0= ruleStringFunctionName )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3989:3: lv_name_0_0= ruleStringFunctionName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringFunctionAccess().getNameStringFunctionNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStringFunctionName_in_ruleStringFunction8637);
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

            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleStringFunction8650); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStringFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4010:1: ( (lv_params_2_0= ruleVariable ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4011:1: (lv_params_2_0= ruleVariable )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4011:1: (lv_params_2_0= ruleVariable )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4012:3: lv_params_2_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringFunctionAccess().getParamsVariableParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleStringFunction8670);
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

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4028:2: (otherlv_3= KEYWORD_5 ( (lv_params_4_0= ruleVariable ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4029:2: otherlv_3= KEYWORD_5 ( (lv_params_4_0= ruleVariable ) )
            {
            otherlv_3=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleStringFunction8684); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getStringFunctionAccess().getCommaKeyword_3_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4033:1: ( (lv_params_4_0= ruleVariable ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4034:1: (lv_params_4_0= ruleVariable )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4034:1: (lv_params_4_0= ruleVariable )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4035:3: lv_params_4_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringFunctionAccess().getParamsVariableParserRuleCall_3_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleStringFunction8704);
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

            otherlv_5=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleStringFunction8718); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4064:1: entryRuleStringFunctionName returns [String current=null] : iv_ruleStringFunctionName= ruleStringFunctionName EOF ;
    public final String entryRuleStringFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringFunctionName = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4065:1: (iv_ruleStringFunctionName= ruleStringFunctionName EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4066:2: iv_ruleStringFunctionName= ruleStringFunctionName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringFunctionNameRule()); 
            }
            pushFollow(FOLLOW_ruleStringFunctionName_in_entryRuleStringFunctionName8753);
            iv_ruleStringFunctionName=ruleStringFunctionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringFunctionName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunctionName8764); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4073:1: ruleStringFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_56 | kw= KEYWORD_67 | kw= KEYWORD_51 | kw= KEYWORD_54 | kw= KEYWORD_60 | kw= KEYWORD_61 ) ;
    public final AntlrDatatypeRuleToken ruleStringFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4077:6: ( (kw= KEYWORD_56 | kw= KEYWORD_67 | kw= KEYWORD_51 | kw= KEYWORD_54 | kw= KEYWORD_60 | kw= KEYWORD_61 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4078:1: (kw= KEYWORD_56 | kw= KEYWORD_67 | kw= KEYWORD_51 | kw= KEYWORD_54 | kw= KEYWORD_60 | kw= KEYWORD_61 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4078:1: (kw= KEYWORD_56 | kw= KEYWORD_67 | kw= KEYWORD_51 | kw= KEYWORD_54 | kw= KEYWORD_60 | kw= KEYWORD_61 )
            int alt56=6;
            switch ( input.LA(1) ) {
            case KEYWORD_56:
                {
                alt56=1;
                }
                break;
            case KEYWORD_67:
                {
                alt56=2;
                }
                break;
            case KEYWORD_51:
                {
                alt56=3;
                }
                break;
            case KEYWORD_54:
                {
                alt56=4;
                }
                break;
            case KEYWORD_60:
                {
                alt56=5;
                }
                break;
            case KEYWORD_61:
                {
                alt56=6;
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4079:2: kw= KEYWORD_56
                    {
                    kw=(Token)match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleStringFunctionName8802); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getCONCATKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4086:2: kw= KEYWORD_67
                    {
                    kw=(Token)match(input,KEYWORD_67,FOLLOW_KEYWORD_67_in_ruleStringFunctionName8821); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getSUBSTRINGKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4093:2: kw= KEYWORD_51
                    {
                    kw=(Token)match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleStringFunctionName8840); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getLOWERKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4100:2: kw= KEYWORD_54
                    {
                    kw=(Token)match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleStringFunctionName8859); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getUPPERKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4107:2: kw= KEYWORD_60
                    {
                    kw=(Token)match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleStringFunctionName8878); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getLENGTHKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4114:2: kw= KEYWORD_61
                    {
                    kw=(Token)match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleStringFunctionName8897); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4127:1: entryRuleNumericFunction returns [EObject current=null] : iv_ruleNumericFunction= ruleNumericFunction EOF ;
    public final EObject entryRuleNumericFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericFunction = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4128:2: (iv_ruleNumericFunction= ruleNumericFunction EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4129:2: iv_ruleNumericFunction= ruleNumericFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericFunction_in_entryRuleNumericFunction8936);
            iv_ruleNumericFunction=ruleNumericFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericFunction8946); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4136:1: ruleNumericFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_5 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 ) ;
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
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4139:28: ( ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_5 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4140:1: ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_5 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4140:1: ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_5 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4140:2: ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_5 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4140:2: ( (lv_name_0_0= ruleNumericFunctionName ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4141:1: (lv_name_0_0= ruleNumericFunctionName )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4141:1: (lv_name_0_0= ruleNumericFunctionName )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4142:3: lv_name_0_0= ruleNumericFunctionName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumericFunctionAccess().getNameNumericFunctionNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumericFunctionName_in_ruleNumericFunction8992);
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

            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleNumericFunction9005); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNumericFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4163:1: ( (lv_params_2_0= ruleVariable ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4164:1: (lv_params_2_0= ruleVariable )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4164:1: (lv_params_2_0= ruleVariable )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4165:3: lv_params_2_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumericFunctionAccess().getParamsVariableParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleNumericFunction9025);
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

            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4181:2: (otherlv_3= KEYWORD_5 ( (lv_params_4_0= ruleVariable ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4182:2: otherlv_3= KEYWORD_5 ( (lv_params_4_0= ruleVariable ) )
            {
            otherlv_3=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleNumericFunction9039); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getNumericFunctionAccess().getCommaKeyword_3_0());
                  
            }
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4186:1: ( (lv_params_4_0= ruleVariable ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4187:1: (lv_params_4_0= ruleVariable )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4187:1: (lv_params_4_0= ruleVariable )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4188:3: lv_params_4_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumericFunctionAccess().getParamsVariableParserRuleCall_3_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleNumericFunction9059);
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

            otherlv_5=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleNumericFunction9073); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4217:1: entryRuleNumericFunctionName returns [String current=null] : iv_ruleNumericFunctionName= ruleNumericFunctionName EOF ;
    public final String entryRuleNumericFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumericFunctionName = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4218:1: (iv_ruleNumericFunctionName= ruleNumericFunctionName EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4219:2: iv_ruleNumericFunctionName= ruleNumericFunctionName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericFunctionNameRule()); 
            }
            pushFollow(FOLLOW_ruleNumericFunctionName_in_entryRuleNumericFunctionName9108);
            iv_ruleNumericFunctionName=ruleNumericFunctionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericFunctionName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericFunctionName9119); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4226:1: ruleNumericFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_22 | kw= KEYWORD_43 | kw= KEYWORD_30 | kw= KEYWORD_41 ) ;
    public final AntlrDatatypeRuleToken ruleNumericFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4230:6: ( (kw= KEYWORD_22 | kw= KEYWORD_43 | kw= KEYWORD_30 | kw= KEYWORD_41 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4231:1: (kw= KEYWORD_22 | kw= KEYWORD_43 | kw= KEYWORD_30 | kw= KEYWORD_41 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4231:1: (kw= KEYWORD_22 | kw= KEYWORD_43 | kw= KEYWORD_30 | kw= KEYWORD_41 )
            int alt57=4;
            switch ( input.LA(1) ) {
            case KEYWORD_22:
                {
                alt57=1;
                }
                break;
            case KEYWORD_43:
                {
                alt57=2;
                }
                break;
            case KEYWORD_30:
                {
                alt57=3;
                }
                break;
            case KEYWORD_41:
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4232:2: kw= KEYWORD_22
                    {
                    kw=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleNumericFunctionName9157); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumericFunctionNameAccess().getABSKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4239:2: kw= KEYWORD_43
                    {
                    kw=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleNumericFunctionName9176); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumericFunctionNameAccess().getSQRTKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4246:2: kw= KEYWORD_30
                    {
                    kw=(Token)match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleNumericFunctionName9195); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumericFunctionNameAccess().getMODKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4253:2: kw= KEYWORD_41
                    {
                    kw=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleNumericFunctionName9214); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4270:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4271:2: (iv_ruleValue= ruleValue EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4272:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue9257);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue9267); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4279:1: ruleValue returns [EObject current=null] : (this_IntegerLiteral_0= ruleIntegerLiteral | this_StringLiteral_1= ruleStringLiteral | this_NullLiteral_2= ruleNullLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerLiteral_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_NullLiteral_2 = null;

        EObject this_BooleanLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4282:28: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_StringLiteral_1= ruleStringLiteral | this_NullLiteral_2= ruleNullLiteral | this_BooleanLiteral_3= ruleBooleanLiteral ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4283:1: (this_IntegerLiteral_0= ruleIntegerLiteral | this_StringLiteral_1= ruleStringLiteral | this_NullLiteral_2= ruleNullLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4283:1: (this_IntegerLiteral_0= ruleIntegerLiteral | this_StringLiteral_1= ruleStringLiteral | this_NullLiteral_2= ruleNullLiteral | this_BooleanLiteral_3= ruleBooleanLiteral )
            int alt58=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt58=1;
                }
                break;
            case RULE_STRING:
                {
                alt58=2;
                }
                break;
            case KEYWORD_40:
                {
                alt58=3;
                }
                break;
            case KEYWORD_47:
            case KEYWORD_44:
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4284:2: this_IntegerLiteral_0= ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getIntegerLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleValue9317);
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4297:2: this_StringLiteral_1= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getStringLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleValue9347);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_StringLiteral_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4310:2: this_NullLiteral_2= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getNullLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleValue9377);
                    this_NullLiteral_2=ruleNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_NullLiteral_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4323:2: this_BooleanLiteral_3= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getBooleanLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleValue9407);
                    this_BooleanLiteral_3=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BooleanLiteral_3;
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


    // $ANTLR start "entryRuleIntegerLiteral"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4342:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4343:2: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4344:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral9441);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral9451); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4351:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4354:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4355:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4355:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4356:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4356:1: (lv_value_0_0= RULE_INT )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4357:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerLiteral9492); if (state.failed) return current;
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


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4381:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4382:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4383:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9531);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral9541); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4390:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4393:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4394:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4394:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4395:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4395:1: (lv_value_0_0= RULE_STRING )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4396:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral9582); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4420:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4421:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4422:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral9621);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral9631); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4429:1: ruleNullLiteral returns [EObject current=null] : ( (lv_value_0_0= KEYWORD_40 ) ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4432:28: ( ( (lv_value_0_0= KEYWORD_40 ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4433:1: ( (lv_value_0_0= KEYWORD_40 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4433:1: ( (lv_value_0_0= KEYWORD_40 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4434:1: (lv_value_0_0= KEYWORD_40 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4434:1: (lv_value_0_0= KEYWORD_40 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4435:3: lv_value_0_0= KEYWORD_40
            {
            lv_value_0_0=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleNullLiteral9674); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4457:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4458:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4459:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral9719);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral9729); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4466:1: ruleBooleanLiteral returns [EObject current=null] : ( ( (lv_value_0_1= KEYWORD_44 | lv_value_0_2= KEYWORD_47 ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4469:28: ( ( ( (lv_value_0_1= KEYWORD_44 | lv_value_0_2= KEYWORD_47 ) ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4470:1: ( ( (lv_value_0_1= KEYWORD_44 | lv_value_0_2= KEYWORD_47 ) ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4470:1: ( ( (lv_value_0_1= KEYWORD_44 | lv_value_0_2= KEYWORD_47 ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4471:1: ( (lv_value_0_1= KEYWORD_44 | lv_value_0_2= KEYWORD_47 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4471:1: ( (lv_value_0_1= KEYWORD_44 | lv_value_0_2= KEYWORD_47 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4472:1: (lv_value_0_1= KEYWORD_44 | lv_value_0_2= KEYWORD_47 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4472:1: (lv_value_0_1= KEYWORD_44 | lv_value_0_2= KEYWORD_47 )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==KEYWORD_44) ) {
                alt59=1;
            }
            else if ( (LA59_0==KEYWORD_47) ) {
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4473:3: lv_value_0_1= KEYWORD_44
                    {
                    lv_value_0_1=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleBooleanLiteral9774); if (state.failed) return current;
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4486:8: lv_value_0_2= KEYWORD_47
                    {
                    lv_value_0_2=(Token)match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleBooleanLiteral9802); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4510:1: entryRuleSubquery returns [EObject current=null] : iv_ruleSubquery= ruleSubquery EOF ;
    public final EObject entryRuleSubquery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubquery = null;


        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4511:2: (iv_ruleSubquery= ruleSubquery EOF )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4512:2: iv_ruleSubquery= ruleSubquery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubqueryRule()); 
            }
            pushFollow(FOLLOW_ruleSubquery_in_entryRuleSubquery9850);
            iv_ruleSubquery=ruleSubquery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubquery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubquery9860); if (state.failed) return current;

            }

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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4519:1: ruleSubquery returns [EObject current=null] : (otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2 ) ;
    public final EObject ruleSubquery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_SelectStatement_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4522:28: ( (otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2 ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4523:1: (otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2 )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4523:1: (otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2 )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4524:2: otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleSubquery9898); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSubqueryAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubqueryAccess().getSelectStatementParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleSubquery9922);
            this_SelectStatement_1=ruleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_SelectStatement_1;
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleSubquery9934); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4553:1: ruleOrderByDirection returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_35 ) ) ;
    public final Enumerator ruleOrderByDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4555:28: ( ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_35 ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4556:1: ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_35 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4556:1: ( (enumLiteral_0= KEYWORD_26 ) | (enumLiteral_1= KEYWORD_35 ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==KEYWORD_26) ) {
                alt60=1;
            }
            else if ( (LA60_0==KEYWORD_35) ) {
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4556:2: (enumLiteral_0= KEYWORD_26 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4556:2: (enumLiteral_0= KEYWORD_26 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4556:7: enumLiteral_0= KEYWORD_26
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleOrderByDirection9986); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOrderByDirectionAccess().getAscEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOrderByDirectionAccess().getAscEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4562:6: (enumLiteral_1= KEYWORD_35 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4562:6: (enumLiteral_1= KEYWORD_35 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4562:11: enumLiteral_1= KEYWORD_35
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleOrderByDirection10008); if (state.failed) return current;
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


    // $ANTLR start "ruleUnaryOperator"
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4572:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_4 ) | (enumLiteral_1= KEYWORD_6 ) | (enumLiteral_2= KEYWORD_32 ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4574:28: ( ( (enumLiteral_0= KEYWORD_4 ) | (enumLiteral_1= KEYWORD_6 ) | (enumLiteral_2= KEYWORD_32 ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4575:1: ( (enumLiteral_0= KEYWORD_4 ) | (enumLiteral_1= KEYWORD_6 ) | (enumLiteral_2= KEYWORD_32 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4575:1: ( (enumLiteral_0= KEYWORD_4 ) | (enumLiteral_1= KEYWORD_6 ) | (enumLiteral_2= KEYWORD_32 ) )
            int alt61=3;
            switch ( input.LA(1) ) {
            case KEYWORD_4:
                {
                alt61=1;
                }
                break;
            case KEYWORD_6:
                {
                alt61=2;
                }
                break;
            case KEYWORD_32:
                {
                alt61=3;
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4575:2: (enumLiteral_0= KEYWORD_4 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4575:2: (enumLiteral_0= KEYWORD_4 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4575:7: enumLiteral_0= KEYWORD_4
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleUnaryOperator10058); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getPositiveEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4581:6: (enumLiteral_1= KEYWORD_6 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4581:6: (enumLiteral_1= KEYWORD_6 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4581:11: enumLiteral_1= KEYWORD_6
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleUnaryOperator10080); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getNegativeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4587:6: (enumLiteral_2= KEYWORD_32 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4587:6: (enumLiteral_2= KEYWORD_32 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4587:11: enumLiteral_2= KEYWORD_32
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleUnaryOperator10102); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4597:1: ruleAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_4 ) | (enumLiteral_1= KEYWORD_6 ) ) ;
    public final Enumerator ruleAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4599:28: ( ( (enumLiteral_0= KEYWORD_4 ) | (enumLiteral_1= KEYWORD_6 ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4600:1: ( (enumLiteral_0= KEYWORD_4 ) | (enumLiteral_1= KEYWORD_6 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4600:1: ( (enumLiteral_0= KEYWORD_4 ) | (enumLiteral_1= KEYWORD_6 ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==KEYWORD_4) ) {
                alt62=1;
            }
            else if ( (LA62_0==KEYWORD_6) ) {
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4600:2: (enumLiteral_0= KEYWORD_4 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4600:2: (enumLiteral_0= KEYWORD_4 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4600:7: enumLiteral_0= KEYWORD_4
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleAdditionOperator10152); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4606:6: (enumLiteral_1= KEYWORD_6 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4606:6: (enumLiteral_1= KEYWORD_6 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4606:11: enumLiteral_1= KEYWORD_6
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleAdditionOperator10174); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4616:1: ruleMultiplicationOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_3 ) | (enumLiteral_1= KEYWORD_8 ) ) ;
    public final Enumerator ruleMultiplicationOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4618:28: ( ( (enumLiteral_0= KEYWORD_3 ) | (enumLiteral_1= KEYWORD_8 ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4619:1: ( (enumLiteral_0= KEYWORD_3 ) | (enumLiteral_1= KEYWORD_8 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4619:1: ( (enumLiteral_0= KEYWORD_3 ) | (enumLiteral_1= KEYWORD_8 ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==KEYWORD_3) ) {
                alt63=1;
            }
            else if ( (LA63_0==KEYWORD_8) ) {
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4619:2: (enumLiteral_0= KEYWORD_3 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4619:2: (enumLiteral_0= KEYWORD_3 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4619:7: enumLiteral_0= KEYWORD_3
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleMultiplicationOperator10224); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicationOperatorAccess().getMultiplyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicationOperatorAccess().getMultiplyEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4625:6: (enumLiteral_1= KEYWORD_8 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4625:6: (enumLiteral_1= KEYWORD_8 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4625:11: enumLiteral_1= KEYWORD_8
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleMultiplicationOperator10246); if (state.failed) return current;
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
    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4635:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_10 ) | (enumLiteral_1= KEYWORD_12 ) | (enumLiteral_2= KEYWORD_13 ) | (enumLiteral_3= KEYWORD_15 ) | (enumLiteral_4= KEYWORD_11 ) | (enumLiteral_5= KEYWORD_14 ) ) ;
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
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4637:28: ( ( (enumLiteral_0= KEYWORD_10 ) | (enumLiteral_1= KEYWORD_12 ) | (enumLiteral_2= KEYWORD_13 ) | (enumLiteral_3= KEYWORD_15 ) | (enumLiteral_4= KEYWORD_11 ) | (enumLiteral_5= KEYWORD_14 ) ) )
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4638:1: ( (enumLiteral_0= KEYWORD_10 ) | (enumLiteral_1= KEYWORD_12 ) | (enumLiteral_2= KEYWORD_13 ) | (enumLiteral_3= KEYWORD_15 ) | (enumLiteral_4= KEYWORD_11 ) | (enumLiteral_5= KEYWORD_14 ) )
            {
            // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4638:1: ( (enumLiteral_0= KEYWORD_10 ) | (enumLiteral_1= KEYWORD_12 ) | (enumLiteral_2= KEYWORD_13 ) | (enumLiteral_3= KEYWORD_15 ) | (enumLiteral_4= KEYWORD_11 ) | (enumLiteral_5= KEYWORD_14 ) )
            int alt64=6;
            switch ( input.LA(1) ) {
            case KEYWORD_10:
                {
                alt64=1;
                }
                break;
            case KEYWORD_12:
                {
                alt64=2;
                }
                break;
            case KEYWORD_13:
                {
                alt64=3;
                }
                break;
            case KEYWORD_15:
                {
                alt64=4;
                }
                break;
            case KEYWORD_11:
                {
                alt64=5;
                }
                break;
            case KEYWORD_14:
                {
                alt64=6;
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
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4638:2: (enumLiteral_0= KEYWORD_10 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4638:2: (enumLiteral_0= KEYWORD_10 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4638:7: enumLiteral_0= KEYWORD_10
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleComparisonOperator10296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getLessThenEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getLessThenEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4644:6: (enumLiteral_1= KEYWORD_12 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4644:6: (enumLiteral_1= KEYWORD_12 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4644:11: enumLiteral_1= KEYWORD_12
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleComparisonOperator10318); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getGreaterThenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getGreaterThenEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4650:6: (enumLiteral_2= KEYWORD_13 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4650:6: (enumLiteral_2= KEYWORD_13 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4650:11: enumLiteral_2= KEYWORD_13
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleComparisonOperator10340); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getLessEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getLessEqualEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4656:6: (enumLiteral_3= KEYWORD_15 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4656:6: (enumLiteral_3= KEYWORD_15 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4656:11: enumLiteral_3= KEYWORD_15
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleComparisonOperator10362); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4662:6: (enumLiteral_4= KEYWORD_11 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4662:6: (enumLiteral_4= KEYWORD_11 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4662:11: enumLiteral_4= KEYWORD_11
                    {
                    enumLiteral_4=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleComparisonOperator10384); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getEqualEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4668:6: (enumLiteral_5= KEYWORD_14 )
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4668:6: (enumLiteral_5= KEYWORD_14 )
                    // ../org.nightlabs.vestigo.xtext.jpql/src-gen/org/nightlabs/vestigo/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4668:11: enumLiteral_5= KEYWORD_14
                    {
                    enumLiteral_5=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleComparisonOperator10406); if (state.failed) return current;
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
    static final String DFA26_eotS =
        "\6\uffff";
    static final String DFA26_eofS =
        "\1\uffff\1\3\3\uffff\1\3";
    static final String DFA26_minS =
        "\1\112\1\27\1\112\2\uffff\1\27";
    static final String DFA26_maxS =
        "\3\112\2\uffff\1\112";
    static final String DFA26_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA26_specialS =
        "\6\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1",
            "\1\3\2\uffff\1\3\2\uffff\1\3\25\uffff\1\3\4\uffff\1\4\6\uffff"+
            "\1\3\2\uffff\1\3\1\uffff\1\2\5\uffff\1\4",
            "\1\5",
            "",
            "",
            "\1\3\2\uffff\1\3\2\uffff\1\3\25\uffff\1\3\4\uffff\1\4\6\uffff"+
            "\1\3\2\uffff\1\3\1\uffff\1\2\5\uffff\1\4"
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
        "\31\uffff";
    static final String DFA42_eofS =
        "\31\uffff";
    static final String DFA42_minS =
        "\1\14\5\uffff\1\11\1\112\5\11\1\112\1\11\1\uffff\1\24\3\uffff\2"+
        "\11\1\24\2\uffff";
    static final String DFA42_maxS =
        "\1\114\5\uffff\1\104\1\112\5\73\1\112\1\72\1\uffff\1\62\3\uffff"+
        "\1\73\1\104\1\43\2\uffff";
    static final String DFA42_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\11\uffff\1\12\1\uffff\1\13\1\11\1\6"+
        "\3\uffff\1\7\1\10";
    static final String DFA42_specialS =
        "\31\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\2\10\uffff\1\14\15\uffff\1\12\1\uffff\1\5\1\uffff\1\13\1"+
            "\uffff\1\3\1\uffff\1\4\22\uffff\1\1\7\uffff\1\7\3\uffff\1\6"+
            "\1\10\1\11",
            "",
            "",
            "",
            "",
            "",
            "\1\21\6\uffff\1\23\21\uffff\1\22\17\uffff\1\16\7\uffff\1\17"+
            "\1\20\10\uffff\1\15",
            "\1\24",
            "\1\21\6\uffff\1\23\21\uffff\1\22\17\uffff\1\16\7\uffff\1\17"+
            "\1\20",
            "\1\21\6\uffff\1\23\21\uffff\1\22\17\uffff\1\16\7\uffff\1\17"+
            "\1\20",
            "\1\21\6\uffff\1\23\21\uffff\1\22\17\uffff\1\16\7\uffff\1\17"+
            "\1\20",
            "\1\21\6\uffff\1\23\21\uffff\1\22\17\uffff\1\16\7\uffff\1\17"+
            "\1\20",
            "\1\21\6\uffff\1\23\21\uffff\1\22\17\uffff\1\16\7\uffff\1\17"+
            "\1\20",
            "\1\25",
            "\1\21\6\uffff\1\23\21\uffff\1\22\27\uffff\1\17",
            "",
            "\1\30\16\uffff\1\27\16\uffff\1\26",
            "",
            "",
            "",
            "\1\21\6\uffff\1\23\21\uffff\1\22\17\uffff\1\16\7\uffff\1\17"+
            "\1\20",
            "\1\21\6\uffff\1\23\21\uffff\1\22\17\uffff\1\16\7\uffff\1\17"+
            "\1\20\10\uffff\1\15",
            "\1\30\16\uffff\1\27",
            "",
            ""
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
            return "2767:1: (this_ParenthesesExpression_0= ruleParenthesesExpression | this_ExistsExpression_1= ruleExistsExpression | this_AllExpression_2= ruleAllExpression | this_AnyExpression_3= ruleAnyExpression | this_SomeExpression_4= ruleSomeExpression | this_CollectionExpression_5= ruleCollectionExpression | this_NullComparisonExpression_6= ruleNullComparisonExpression | this_EmptyComparisonExpression_7= ruleEmptyComparisonExpression | this_LikeExpression_8= ruleLikeExpression | this_InExpression_9= ruleInExpression | this_BetweenExpression_10= ruleBetweenExpression )";
        }
    }
    static final String DFA48_eotS =
        "\20\uffff";
    static final String DFA48_eofS =
        "\20\uffff";
    static final String DFA48_minS =
        "\1\25\1\62\1\112\5\62\1\112\1\72\1\76\2\62\1\21\2\uffff";
    static final String DFA48_maxS =
        "\1\114\1\104\1\112\5\72\1\112\1\72\1\76\1\72\1\104\1\114\2\uffff";
    static final String DFA48_acceptS =
        "\16\uffff\1\2\1\1";
    static final String DFA48_specialS =
        "\20\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\7\15\uffff\1\5\3\uffff\1\6\36\uffff\1\2\3\uffff\1\1\1\3\1"+
            "\4",
            "\1\11\7\uffff\1\12\11\uffff\1\10",
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
            "\1\11\7\uffff\1\12\11\uffff\1\10",
            "\1\16\3\uffff\1\17\11\uffff\1\16\3\uffff\1\17\3\uffff\1\17"+
            "\36\uffff\1\17\3\uffff\3\17",
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
            return "3440:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )";
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
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleGroupByClause454 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleGroupByClause466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleGroupByClause486 = new BitSet(new long[]{0x0000000000002002L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleGroupByClause500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleGroupByClause520 = new BitSet(new long[]{0x0000000000002002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleHavingClause_in_ruleGroupByClause543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_entryRuleHavingClause579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingClause589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_ruleHavingClause627 = new BitSet(new long[]{0x40040AA800201000L,0x0000000000001C4AL});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleHavingClause647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderByClause_in_entryRuleOrderByClause682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderByClause692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleOrderByClause730 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleOrderByClause742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_ruleOrderByClause762 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleOrderByClause776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleOrderBySpec_in_ruleOrderByClause796 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
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
    public static final BitSet FOLLOW_KEYWORD_64_in_ruleUpdateClause1130 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleUpdateClause1150 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleUpdateClause1164 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleUpdateClause1184 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleSetClause_in_entryRuleSetClause1221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetClause1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleSetClause1269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_ruleSetClause1289 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleSetClause1303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_ruleSetClause1323 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_entryRuleUpdateItem1360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateItem1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleUpdateItem1416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleUpdateItem1429 = new BitSet(new long[]{0x0000008800200000L,0x0000000000001C40L});
    public static final BitSet FOLLOW_ruleValue_in_ruleUpdateItem1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement1484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteStatement1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteClause_in_ruleDeleteStatement1540 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleDeleteStatement1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteClause_in_entryRuleDeleteClause1597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteClause1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleDeleteClause1645 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleFromClause_in_ruleDeleteClause1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_entryRuleSelectClause1700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectClause1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleSelectClause1748 = new BitSet(new long[]{0x0012E00000080100L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_66_in_ruleSelectClause1766 = new BitSet(new long[]{0x0012E00000080100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectClause1799 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleSelectClause1813 = new BitSet(new long[]{0x0012E00000080100L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectClause1833 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression1870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectExpression1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectExpression1930 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleAvgAggregate2286 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleAvgAggregate2298 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_66_in_ruleAvgAggregate2316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleAvgAggregate2349 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleAvgAggregate2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountAggregate_in_entryRuleCountAggregate2396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCountAggregate2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleCountAggregate2444 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleCountAggregate2456 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_66_in_ruleCountAggregate2474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleCountAggregate2507 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleCountAggregate2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxAggregate_in_entryRuleMaxAggregate2554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxAggregate2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleMaxAggregate2602 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleMaxAggregate2614 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_66_in_ruleMaxAggregate2632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleMaxAggregate2665 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleMaxAggregate2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinAggregate_in_entryRuleMinAggregate2712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinAggregate2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleMinAggregate2760 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleMinAggregate2772 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_66_in_ruleMinAggregate2790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleMinAggregate2823 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleMinAggregate2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumAggregate_in_entryRuleSumAggregate2870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumAggregate2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleSumAggregate2918 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleSumAggregate2930 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_66_in_ruleSumAggregate2948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSumAggregate2981 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSumAggregate2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstructorExpression_in_entryRuleSelectConstructorExpression3028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectConstructorExpression3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleSelectConstructorExpression3076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectConstructorExpression3092 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleSelectConstructorExpression3110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3130 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleSelectConstructorExpression3144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3164 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSelectConstructorExpression3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClause_in_entryRuleFromClause3213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClause3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleFromClause3261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleFromClass_in_ruleFromClause3281 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleFromClause3295 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleFromClause3315 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleFromEntry_in_entryRuleFromEntry3352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromEntry3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClass_in_ruleFromEntry3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromCollection_in_ruleFromEntry3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleVariableDeclaration3525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClass_in_entryRuleFromClass3583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClass3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassId_in_ruleFromClass3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassVar_in_ruleFromClass3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier3708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedIdentifier3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier3759 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleQualifiedIdentifier3778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier3793 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFromClassId_in_entryRuleFromClassId3839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClassId3849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleFromClassId3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassVar_in_entryRuleFromClassVar3928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClassVar3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleFromClassVar3984 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleFromClassVar4005 = new BitSet(new long[]{0x0000000301000002L});
    public static final BitSet FOLLOW_ruleFromJoin_in_ruleFromClassVar4026 = new BitSet(new long[]{0x0000000301000002L});
    public static final BitSet FOLLOW_ruleFromCollection_in_entryRuleFromCollection4062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromCollection4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleFromCollection4110 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleFromCollection4122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleFromCollection4142 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleFromCollection4155 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleFromCollection4175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromJoin_in_entryRuleFromJoin4210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromJoin4220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_ruleFromJoin4270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftJoin_in_ruleFromJoin4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerJoin_in_ruleFromJoin4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_entryRuleJoin4364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoin4374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleJoin4412 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleJoin4430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleJoin4463 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleJoin4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftJoin_in_entryRuleLeftJoin4519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftJoin4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleLeftJoin4567 = new BitSet(new long[]{0x0000000108000000L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleLeftJoin4585 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleLeftJoin4610 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleLeftJoin4628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleLeftJoin4661 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleLeftJoin4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerJoin_in_entryRuleInnerJoin4717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInnerJoin4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleInnerJoin4765 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleInnerJoin4777 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleInnerJoin4795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleInnerJoin4828 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInnerJoin4849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_entryRuleWhereClause4884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereClause4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleWhereClause4932 = new BitSet(new long[]{0x40040AA800201000L,0x0000000000001C4AL});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleWhereClause4952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression4987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression5047 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleOrExpression5073 = new BitSet(new long[]{0x40040AA800201000L,0x0000000000001C4AL});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression5093 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression5132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression5142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_ruleAndExpression5192 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleAndExpression5218 = new BitSet(new long[]{0x40040AA800201000L,0x0000000000001C4AL});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_ruleAndExpression5238 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperatorExpression_in_entryRuleComparisonOperatorExpression5277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonOperatorExpression5287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_ruleComparisonOperatorExpression5337 = new BitSet(new long[]{0x00E0000000000002L,0x0000000000000380L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_ruleComparisonOperatorExpression5370 = new BitSet(new long[]{0x40040AA800201000L,0x0000000000001C4AL});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_ruleComparisonOperatorExpression5391 = new BitSet(new long[]{0x00E0000000000002L,0x0000000000000380L});
    public static final BitSet FOLLOW_ruleAdditionExpression_in_entryRuleAdditionExpression5428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionExpression5438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression5488 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000AL});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditionExpression5521 = new BitSet(new long[]{0x40040AA800201000L,0x0000000000001C4AL});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_ruleAdditionExpression5542 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000AL});
    public static final BitSet FOLLOW_ruleMultiplicationExpression_in_entryRuleMultiplicationExpression5579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationExpression5589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicationExpression5639 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000021L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicationExpression5672 = new BitSet(new long[]{0x40040AA800201000L,0x0000000000001C4AL});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicationExpression5693 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000021L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression5730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression5740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleUnaryExpression5786 = new BitSet(new long[]{0x40040AA800201000L,0x0000000000001C4AL});
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
    public static final BitSet FOLLOW_ruleParenthesesExpression_in_entryRuleParenthesesExpression6237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesesExpression6247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleParenthesesExpression6285 = new BitSet(new long[]{0x4000008800200000L,0x0000000000001C40L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_ruleParenthesesExpression6309 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleParenthesesExpression6321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsExpression_in_entryRuleExistsExpression6355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExistsExpression6365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleExistsExpression6403 = new BitSet(new long[]{0x4000008800200000L,0x0000000000001C40L});
    public static final BitSet FOLLOW_ruleSubquery_in_ruleExistsExpression6423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllExpression_in_entryRuleAllExpression6458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllExpression6468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleAllExpression6506 = new BitSet(new long[]{0x4000008800200000L,0x0000000000001C40L});
    public static final BitSet FOLLOW_ruleSubquery_in_ruleAllExpression6526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyExpression_in_entryRuleAnyExpression6561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnyExpression6571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleAnyExpression6609 = new BitSet(new long[]{0x4000008800200000L,0x0000000000001C40L});
    public static final BitSet FOLLOW_ruleSubquery_in_ruleAnyExpression6629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeExpression_in_entryRuleSomeExpression6664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSomeExpression6674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleSomeExpression6712 = new BitSet(new long[]{0x4000008800200000L,0x0000000000001C40L});
    public static final BitSet FOLLOW_ruleSubquery_in_ruleSomeExpression6732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression6767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionExpression6777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCollectionExpression6823 = new BitSet(new long[]{0x0004000000010000L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleCollectionExpression6842 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleCollectionExpression6867 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleCollectionExpression6880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleCollectionExpression6902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullComparisonExpression_in_entryRuleNullComparisonExpression6937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullComparisonExpression6947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNullComparisonExpression6993 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleNullComparisonExpression7006 = new BitSet(new long[]{0x0004000800000000L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleNullComparisonExpression7024 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleNullComparisonExpression7049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyComparisonExpression_in_entryRuleEmptyComparisonExpression7083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmptyComparisonExpression7093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleEmptyComparisonExpression7139 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleEmptyComparisonExpression7152 = new BitSet(new long[]{0x0004000000100000L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleEmptyComparisonExpression7170 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleEmptyComparisonExpression7195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikeExpression_in_entryRuleLikeExpression7229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLikeExpression7239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleLikeExpression7285 = new BitSet(new long[]{0x0004000400000000L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleLikeExpression7304 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleLikeExpression7329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLikeExpression7349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpression_in_entryRuleInExpression7384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInExpression7394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInSeqExpression_in_ruleInExpression7444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInQueryExpression_in_ruleInExpression7474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInSeqExpression_in_entryRuleInSeqExpression7508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInSeqExpression7518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7564 = new BitSet(new long[]{0x0404000000000000L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleInSeqExpression7583 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleInSeqExpression7608 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleInSeqExpression7620 = new BitSet(new long[]{0x0000008800200000L,0x0000000000001C40L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7640 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleInSeqExpression7654 = new BitSet(new long[]{0x0000008800200000L,0x0000000000001C40L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7674 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleInSeqExpression7689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInQueryExpression_in_entryRuleInQueryExpression7723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInQueryExpression7733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInQueryExpression7779 = new BitSet(new long[]{0x0404000000000000L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleInQueryExpression7798 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleInQueryExpression7823 = new BitSet(new long[]{0x4000008800200000L,0x0000000000001C40L});
    public static final BitSet FOLLOW_ruleSubquery_in_ruleInQueryExpression7843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBetweenExpression_in_entryRuleBetweenExpression7878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBetweenExpression7888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleBetweenExpression7934 = new BitSet(new long[]{0x0004000000000200L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleBetweenExpression7953 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_65_in_ruleBetweenExpression7978 = new BitSet(new long[]{0x0000008800200000L,0x0000000000001C40L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBetweenExpression7998 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleBetweenExpression8011 = new BitSet(new long[]{0x0000008800200000L,0x0000000000001C40L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBetweenExpression8031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable8066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable8076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleVariable8126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_ruleVariable8156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleVariable8186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_entryRuleExpressionTerm8220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionTerm8230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleExpressionTerm8280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubquery_in_ruleExpressionTerm8310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_entryRuleAliasAttributeExpression8344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAliasAttributeExpression8354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8403 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleAliasAttributeExpression8417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8433 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_entryRuleParameterExpression8475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterExpression8485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleParameterExpression8523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterExpression8539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_entryRuleStringFunction8581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunction8591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunctionName_in_ruleStringFunction8637 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleStringFunction8650 = new BitSet(new long[]{0x0000008800200000L,0x0000000000001C40L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunction8670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleStringFunction8684 = new BitSet(new long[]{0x0000008800200000L,0x0000000000001C40L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunction8704 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleStringFunction8718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunctionName_in_entryRuleStringFunctionName8753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunctionName8764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleStringFunctionName8802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_67_in_ruleStringFunctionName8821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleStringFunctionName8840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleStringFunctionName8859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleStringFunctionName8878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleStringFunctionName8897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFunction_in_entryRuleNumericFunction8936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericFunction8946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFunctionName_in_ruleNumericFunction8992 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleNumericFunction9005 = new BitSet(new long[]{0x0000008800200000L,0x0000000000001C40L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNumericFunction9025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleNumericFunction9039 = new BitSet(new long[]{0x0000008800200000L,0x0000000000001C40L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNumericFunction9059 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleNumericFunction9073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFunctionName_in_entryRuleNumericFunctionName9108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericFunctionName9119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleNumericFunctionName9157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleNumericFunctionName9176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleNumericFunctionName9195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleNumericFunctionName9214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue9257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue9267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleValue9317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleValue9347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleValue9377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleValue9407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral9441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral9451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerLiteral9492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral9541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral9582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral9621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral9631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleNullLiteral9674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral9719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral9729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleBooleanLiteral9774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleBooleanLiteral9802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubquery_in_entryRuleSubquery9850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubquery9860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleSubquery9898 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleSubquery9922 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSubquery9934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleOrderByDirection9986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleOrderByDirection10008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleUnaryOperator10058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleUnaryOperator10080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleUnaryOperator10102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleAdditionOperator10152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleAdditionOperator10174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleMultiplicationOperator10224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleMultiplicationOperator10246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleComparisonOperator10296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleComparisonOperator10318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleComparisonOperator10340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleComparisonOperator10362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleComparisonOperator10384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleComparisonOperator10406 = new BitSet(new long[]{0x0000000000000002L});

}