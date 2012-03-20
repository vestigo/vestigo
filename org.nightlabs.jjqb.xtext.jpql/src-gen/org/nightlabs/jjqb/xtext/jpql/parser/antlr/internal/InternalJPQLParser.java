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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_67", "KEYWORD_65", "KEYWORD_66", "KEYWORD_64", "KEYWORD_63", "KEYWORD_62", "KEYWORD_52", "KEYWORD_53", "KEYWORD_54", "KEYWORD_55", "KEYWORD_56", "KEYWORD_57", "KEYWORD_58", "KEYWORD_59", "KEYWORD_60", "KEYWORD_61", "KEYWORD_41", "KEYWORD_42", "KEYWORD_43", "KEYWORD_44", "KEYWORD_45", "KEYWORD_46", "KEYWORD_47", "KEYWORD_48", "KEYWORD_49", "KEYWORD_50", "KEYWORD_51", "KEYWORD_31", "KEYWORD_32", "KEYWORD_33", "KEYWORD_34", "KEYWORD_35", "KEYWORD_36", "KEYWORD_37", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=71;
    public static final int RULE_ANY_OTHER=77;
    public static final int KEYWORD_56=14;
    public static final int KEYWORD_19=42;
    public static final int KEYWORD_55=13;
    public static final int KEYWORD_54=12;
    public static final int KEYWORD_17=62;
    public static final int KEYWORD_18=41;
    public static final int KEYWORD_53=11;
    public static final int KEYWORD_52=10;
    public static final int KEYWORD_15=60;
    public static final int KEYWORD_51=30;
    public static final int KEYWORD_16=61;
    public static final int KEYWORD_50=29;
    public static final int KEYWORD_13=58;
    public static final int KEYWORD_14=59;
    public static final int KEYWORD_11=56;
    public static final int EOF=-1;
    public static final int KEYWORD_12=57;
    public static final int KEYWORD_10=55;
    public static final int KEYWORD_59=17;
    public static final int KEYWORD_58=16;
    public static final int KEYWORD_57=15;
    public static final int KEYWORD_6=68;
    public static final int KEYWORD_7=69;
    public static final int KEYWORD_8=70;
    public static final int KEYWORD_9=54;
    public static final int KEYWORD_28=51;
    public static final int KEYWORD_65=5;
    public static final int KEYWORD_29=52;
    public static final int KEYWORD_64=7;
    public static final int RULE_INT=72;
    public static final int KEYWORD_67=4;
    public static final int KEYWORD_66=6;
    public static final int KEYWORD_24=47;
    public static final int KEYWORD_61=19;
    public static final int KEYWORD_25=48;
    public static final int KEYWORD_60=18;
    public static final int KEYWORD_26=49;
    public static final int KEYWORD_63=8;
    public static final int KEYWORD_62=9;
    public static final int KEYWORD_27=50;
    public static final int KEYWORD_20=43;
    public static final int KEYWORD_21=44;
    public static final int KEYWORD_22=45;
    public static final int KEYWORD_23=46;
    public static final int KEYWORD_30=53;
    public static final int KEYWORD_1=63;
    public static final int KEYWORD_34=34;
    public static final int KEYWORD_5=67;
    public static final int KEYWORD_33=33;
    public static final int KEYWORD_4=66;
    public static final int KEYWORD_32=32;
    public static final int KEYWORD_3=65;
    public static final int KEYWORD_31=31;
    public static final int KEYWORD_2=64;
    public static final int KEYWORD_38=38;
    public static final int KEYWORD_37=37;
    public static final int RULE_SL_COMMENT=75;
    public static final int KEYWORD_36=36;
    public static final int KEYWORD_35=35;
    public static final int RULE_ML_COMMENT=74;
    public static final int KEYWORD_39=39;
    public static final int RULE_STRING=73;
    public static final int KEYWORD_41=20;
    public static final int KEYWORD_40=40;
    public static final int KEYWORD_43=22;
    public static final int KEYWORD_42=21;
    public static final int KEYWORD_45=24;
    public static final int KEYWORD_44=23;
    public static final int KEYWORD_47=26;
    public static final int RULE_WS=76;
    public static final int KEYWORD_46=25;
    public static final int KEYWORD_49=28;
    public static final int KEYWORD_48=27;

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
    		return "QueryModule";	
    	} 
    	   	   	
    	@Override
    	protected JPQLGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleQueryModule"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:68:1: entryRuleQueryModule returns [EObject current=null] : iv_ruleQueryModule= ruleQueryModule EOF ;
    public final EObject entryRuleQueryModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryModule = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:69:2: (iv_ruleQueryModule= ruleQueryModule EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:70:2: iv_ruleQueryModule= ruleQueryModule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQueryModuleRule()); 
            }
            pushFollow(FOLLOW_ruleQueryModule_in_entryRuleQueryModule73);
            iv_ruleQueryModule=ruleQueryModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQueryModule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryModule83); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQueryModule"


    // $ANTLR start "ruleQueryModule"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:77:1: ruleQueryModule returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_defaultQuery_1_0= ruleJPQLQuery ) )? ) ;
    public final EObject ruleQueryModule() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_defaultQuery_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:80:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_defaultQuery_1_0= ruleJPQLQuery ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_defaultQuery_1_0= ruleJPQLQuery ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_defaultQuery_1_0= ruleJPQLQuery ) )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:81:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_defaultQuery_1_0= ruleJPQLQuery ) )?
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:81:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==KEYWORD_56) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:82:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:82:1: (lv_imports_0_0= ruleImport )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:83:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQueryModuleAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleQueryModule129);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQueryModuleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:99:3: ( (lv_defaultQuery_1_0= ruleJPQLQuery ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==KEYWORD_53||(LA2_0>=KEYWORD_60 && LA2_0<=KEYWORD_61)||LA2_0==KEYWORD_32) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:100:1: (lv_defaultQuery_1_0= ruleJPQLQuery )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:100:1: (lv_defaultQuery_1_0= ruleJPQLQuery )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:101:3: lv_defaultQuery_1_0= ruleJPQLQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getQueryModuleAccess().getDefaultQueryJPQLQueryParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJPQLQuery_in_ruleQueryModule151);
                    lv_defaultQuery_1_0=ruleJPQLQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getQueryModuleRule());
                      	        }
                             		set(
                             			current, 
                             			"defaultQuery",
                              		lv_defaultQuery_1_0, 
                              		"JPQLQuery");
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
    // $ANTLR end "ruleQueryModule"


    // $ANTLR start "entryRuleImport"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:125:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:126:2: (iv_ruleImport= ruleImport EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:127:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport187);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport197); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:134:1: ruleImport returns [EObject current=null] : (otherlv_0= KEYWORD_56 ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:137:28: ( (otherlv_0= KEYWORD_56 ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:138:1: (otherlv_0= KEYWORD_56 ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:138:1: (otherlv_0= KEYWORD_56 ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:139:2: otherlv_0= KEYWORD_56 ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleImport235); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getIMPORTKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:143:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:144:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:144:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:145:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport251); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getImportRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"importURI",
                      		lv_importURI_1_0, 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleJPQLQuery"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:169:1: entryRuleJPQLQuery returns [EObject current=null] : iv_ruleJPQLQuery= ruleJPQLQuery EOF ;
    public final EObject entryRuleJPQLQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJPQLQuery = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:170:2: (iv_ruleJPQLQuery= ruleJPQLQuery EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:171:2: iv_ruleJPQLQuery= ruleJPQLQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJPQLQueryRule()); 
            }
            pushFollow(FOLLOW_ruleJPQLQuery_in_entryRuleJPQLQuery291);
            iv_ruleJPQLQuery=ruleJPQLQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJPQLQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJPQLQuery301); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:178:1: ruleJPQLQuery returns [EObject current=null] : (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement ) ;
    public final EObject ruleJPQLQuery() throws RecognitionException {
        EObject current = null;

        EObject this_SelectStatement_0 = null;

        EObject this_UpdateStatement_1 = null;

        EObject this_DeleteStatement_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:181:28: ( (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:182:1: (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:182:1: (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement )
            int alt3=3;
            switch ( input.LA(1) ) {
            case KEYWORD_60:
            case KEYWORD_32:
                {
                alt3=1;
                }
                break;
            case KEYWORD_61:
                {
                alt3=2;
                }
                break;
            case KEYWORD_53:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:183:2: this_SelectStatement_0= ruleSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJPQLQueryAccess().getSelectStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleJPQLQuery351);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:196:2: this_UpdateStatement_1= ruleUpdateStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJPQLQueryAccess().getUpdateStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUpdateStatement_in_ruleJPQLQuery381);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:209:2: this_DeleteStatement_2= ruleDeleteStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJPQLQueryAccess().getDeleteStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeleteStatement_in_ruleJPQLQuery411);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:228:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:229:2: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:230:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement445);
            iv_ruleSelectStatement=ruleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectStatement455); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:237:1: ruleSelectStatement returns [EObject current=null] : ( ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_groupBy_2_0= ruleGroupClause ) )? ( (lv_having_3_0= ruleHavingClause ) )? ( (lv_order_4_0= ruleOrderClause ) )? ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_selectFromClause_0_0 = null;

        EObject lv_whereClause_1_0 = null;

        EObject lv_groupBy_2_0 = null;

        EObject lv_having_3_0 = null;

        EObject lv_order_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:240:28: ( ( ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_groupBy_2_0= ruleGroupClause ) )? ( (lv_having_3_0= ruleHavingClause ) )? ( (lv_order_4_0= ruleOrderClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:241:1: ( ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_groupBy_2_0= ruleGroupClause ) )? ( (lv_having_3_0= ruleHavingClause ) )? ( (lv_order_4_0= ruleOrderClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:241:1: ( ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_groupBy_2_0= ruleGroupClause ) )? ( (lv_having_3_0= ruleHavingClause ) )? ( (lv_order_4_0= ruleOrderClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:241:2: ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_groupBy_2_0= ruleGroupClause ) )? ( (lv_having_3_0= ruleHavingClause ) )? ( (lv_order_4_0= ruleOrderClause ) )?
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:241:2: ( (lv_selectFromClause_0_0= ruleSelectFromClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:242:1: (lv_selectFromClause_0_0= ruleSelectFromClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:242:1: (lv_selectFromClause_0_0= ruleSelectFromClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:243:3: lv_selectFromClause_0_0= ruleSelectFromClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectStatementAccess().getSelectFromClauseSelectFromClauseParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectFromClause_in_ruleSelectStatement501);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:259:2: ( (lv_whereClause_1_0= ruleWhereClause ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==KEYWORD_51) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:260:1: (lv_whereClause_1_0= ruleWhereClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:260:1: (lv_whereClause_1_0= ruleWhereClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:261:3: lv_whereClause_1_0= ruleWhereClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getWhereClauseWhereClauseParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleSelectStatement522);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:277:3: ( (lv_groupBy_2_0= ruleGroupClause ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==KEYWORD_45) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:278:1: (lv_groupBy_2_0= ruleGroupClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:278:1: (lv_groupBy_2_0= ruleGroupClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:279:3: lv_groupBy_2_0= ruleGroupClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getGroupByGroupClauseParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGroupClause_in_ruleSelectStatement544);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:295:3: ( (lv_having_3_0= ruleHavingClause ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==KEYWORD_55) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:296:1: (lv_having_3_0= ruleHavingClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:296:1: (lv_having_3_0= ruleHavingClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:297:3: lv_having_3_0= ruleHavingClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getHavingHavingClauseParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHavingClause_in_ruleSelectStatement566);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:313:3: ( (lv_order_4_0= ruleOrderClause ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KEYWORD_48) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:314:1: (lv_order_4_0= ruleOrderClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:314:1: (lv_order_4_0= ruleOrderClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:315:3: lv_order_4_0= ruleOrderClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getOrderOrderClauseParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrderClause_in_ruleSelectStatement588);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:339:1: entryRuleGroupClause returns [EObject current=null] : iv_ruleGroupClause= ruleGroupClause EOF ;
    public final EObject entryRuleGroupClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:340:2: (iv_ruleGroupClause= ruleGroupClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:341:2: iv_ruleGroupClause= ruleGroupClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupClauseRule()); 
            }
            pushFollow(FOLLOW_ruleGroupClause_in_entryRuleGroupClause624);
            iv_ruleGroupClause=ruleGroupClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroupClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupClause634); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:348:1: ruleGroupClause returns [EObject current=null] : (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_13 ( (lv_grouping_2_0= ruleGroupItem ) ) (otherlv_3= KEYWORD_3 ( (lv_grouping_4_0= ruleGroupItem ) ) )* ) ;
    public final EObject ruleGroupClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_grouping_2_0 = null;

        EObject lv_grouping_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:351:28: ( (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_13 ( (lv_grouping_2_0= ruleGroupItem ) ) (otherlv_3= KEYWORD_3 ( (lv_grouping_4_0= ruleGroupItem ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:352:1: (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_13 ( (lv_grouping_2_0= ruleGroupItem ) ) (otherlv_3= KEYWORD_3 ( (lv_grouping_4_0= ruleGroupItem ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:352:1: (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_13 ( (lv_grouping_2_0= ruleGroupItem ) ) (otherlv_3= KEYWORD_3 ( (lv_grouping_4_0= ruleGroupItem ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:353:2: otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_13 ( (lv_grouping_2_0= ruleGroupItem ) ) (otherlv_3= KEYWORD_3 ( (lv_grouping_4_0= ruleGroupItem ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleGroupClause672); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGroupClauseAccess().getGROUPKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleGroupClause684); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGroupClauseAccess().getBYKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:362:1: ( (lv_grouping_2_0= ruleGroupItem ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:363:1: (lv_grouping_2_0= ruleGroupItem )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:363:1: (lv_grouping_2_0= ruleGroupItem )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:364:3: lv_grouping_2_0= ruleGroupItem
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupClauseAccess().getGroupingGroupItemParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGroupItem_in_ruleGroupClause704);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:380:2: (otherlv_3= KEYWORD_3 ( (lv_grouping_4_0= ruleGroupItem ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==KEYWORD_3) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:381:2: otherlv_3= KEYWORD_3 ( (lv_grouping_4_0= ruleGroupItem ) )
            	    {
            	    otherlv_3=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleGroupClause718); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getGroupClauseAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:385:1: ( (lv_grouping_4_0= ruleGroupItem ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:386:1: (lv_grouping_4_0= ruleGroupItem )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:386:1: (lv_grouping_4_0= ruleGroupItem )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:387:3: lv_grouping_4_0= ruleGroupItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGroupClauseAccess().getGroupingGroupItemParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGroupItem_in_ruleGroupClause738);
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
    // $ANTLR end "ruleGroupClause"


    // $ANTLR start "entryRuleGroupItem"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:411:1: entryRuleGroupItem returns [EObject current=null] : iv_ruleGroupItem= ruleGroupItem EOF ;
    public final EObject entryRuleGroupItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupItem = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:412:2: (iv_ruleGroupItem= ruleGroupItem EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:413:2: iv_ruleGroupItem= ruleGroupItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupItemRule()); 
            }
            pushFollow(FOLLOW_ruleGroupItem_in_entryRuleGroupItem775);
            iv_ruleGroupItem=ruleGroupItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroupItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupItem785); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:420:1: ruleGroupItem returns [EObject current=null] : ( (lv_var_0_0= ruleAliasAttributeExpression ) ) ;
    public final EObject ruleGroupItem() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:423:28: ( ( (lv_var_0_0= ruleAliasAttributeExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:424:1: ( (lv_var_0_0= ruleAliasAttributeExpression ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:424:1: ( (lv_var_0_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:425:1: (lv_var_0_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:425:1: (lv_var_0_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:426:3: lv_var_0_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGroupItemAccess().getVarAliasAttributeExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleGroupItem830);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:450:1: entryRuleHavingClause returns [EObject current=null] : iv_ruleHavingClause= ruleHavingClause EOF ;
    public final EObject entryRuleHavingClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHavingClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:451:2: (iv_ruleHavingClause= ruleHavingClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:452:2: iv_ruleHavingClause= ruleHavingClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHavingClauseRule()); 
            }
            pushFollow(FOLLOW_ruleHavingClause_in_entryRuleHavingClause864);
            iv_ruleHavingClause=ruleHavingClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHavingClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHavingClause874); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:459:1: ruleHavingClause returns [EObject current=null] : (otherlv_0= KEYWORD_55 ( (lv_having_1_0= ruleOrExpression ) ) ) ;
    public final EObject ruleHavingClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_having_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:462:28: ( (otherlv_0= KEYWORD_55 ( (lv_having_1_0= ruleOrExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:463:1: (otherlv_0= KEYWORD_55 ( (lv_having_1_0= ruleOrExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:463:1: (otherlv_0= KEYWORD_55 ( (lv_having_1_0= ruleOrExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:464:2: otherlv_0= KEYWORD_55 ( (lv_having_1_0= ruleOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleHavingClause912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getHavingClauseAccess().getHAVINGKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:468:1: ( (lv_having_1_0= ruleOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:469:1: (lv_having_1_0= ruleOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:469:1: (lv_having_1_0= ruleOrExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:470:3: lv_having_1_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHavingClauseAccess().getHavingOrExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleHavingClause932);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:494:1: entryRuleOrderClause returns [EObject current=null] : iv_ruleOrderClause= ruleOrderClause EOF ;
    public final EObject entryRuleOrderClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:495:2: (iv_ruleOrderClause= ruleOrderClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:496:2: iv_ruleOrderClause= ruleOrderClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderClauseRule()); 
            }
            pushFollow(FOLLOW_ruleOrderClause_in_entryRuleOrderClause967);
            iv_ruleOrderClause=ruleOrderClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderClause977); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:503:1: ruleOrderClause returns [EObject current=null] : (otherlv_0= KEYWORD_48 otherlv_1= KEYWORD_13 ( (lv_ordering_2_0= ruleOrderItem ) ) (otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= KEYWORD_22 ) ) | ( (lv_isDesc_6_0= KEYWORD_31 ) ) )? ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:506:28: ( (otherlv_0= KEYWORD_48 otherlv_1= KEYWORD_13 ( (lv_ordering_2_0= ruleOrderItem ) ) (otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= KEYWORD_22 ) ) | ( (lv_isDesc_6_0= KEYWORD_31 ) ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:507:1: (otherlv_0= KEYWORD_48 otherlv_1= KEYWORD_13 ( (lv_ordering_2_0= ruleOrderItem ) ) (otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= KEYWORD_22 ) ) | ( (lv_isDesc_6_0= KEYWORD_31 ) ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:507:1: (otherlv_0= KEYWORD_48 otherlv_1= KEYWORD_13 ( (lv_ordering_2_0= ruleOrderItem ) ) (otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= KEYWORD_22 ) ) | ( (lv_isDesc_6_0= KEYWORD_31 ) ) )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:508:2: otherlv_0= KEYWORD_48 otherlv_1= KEYWORD_13 ( (lv_ordering_2_0= ruleOrderItem ) ) (otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= KEYWORD_22 ) ) | ( (lv_isDesc_6_0= KEYWORD_31 ) ) )?
            {
            otherlv_0=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleOrderClause1015); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOrderClauseAccess().getORDERKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleOrderClause1027); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOrderClauseAccess().getBYKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:517:1: ( (lv_ordering_2_0= ruleOrderItem ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:518:1: (lv_ordering_2_0= ruleOrderItem )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:518:1: (lv_ordering_2_0= ruleOrderItem )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:519:3: lv_ordering_2_0= ruleOrderItem
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderClauseAccess().getOrderingOrderItemParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrderItem_in_ruleOrderClause1047);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:535:2: (otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==KEYWORD_3) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:536:2: otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) )
            	    {
            	    otherlv_3=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleOrderClause1061); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getOrderClauseAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:540:1: ( (lv_ordering_4_0= ruleOrderItem ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:541:1: (lv_ordering_4_0= ruleOrderItem )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:541:1: (lv_ordering_4_0= ruleOrderItem )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:542:3: lv_ordering_4_0= ruleOrderItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrderClauseAccess().getOrderingOrderItemParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrderItem_in_ruleOrderClause1081);
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
            	    break loop9;
                }
            } while (true);

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:558:4: ( ( (lv_isAsc_5_0= KEYWORD_22 ) ) | ( (lv_isDesc_6_0= KEYWORD_31 ) ) )?
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==KEYWORD_22) ) {
                alt10=1;
            }
            else if ( (LA10_0==KEYWORD_31) ) {
                alt10=2;
            }
            switch (alt10) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:558:5: ( (lv_isAsc_5_0= KEYWORD_22 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:558:5: ( (lv_isAsc_5_0= KEYWORD_22 ) )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:559:1: (lv_isAsc_5_0= KEYWORD_22 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:559:1: (lv_isAsc_5_0= KEYWORD_22 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:560:3: lv_isAsc_5_0= KEYWORD_22
                    {
                    lv_isAsc_5_0=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleOrderClause1103); if (state.failed) return current;
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:575:6: ( (lv_isDesc_6_0= KEYWORD_31 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:575:6: ( (lv_isDesc_6_0= KEYWORD_31 ) )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:576:1: (lv_isDesc_6_0= KEYWORD_31 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:576:1: (lv_isDesc_6_0= KEYWORD_31 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:577:3: lv_isDesc_6_0= KEYWORD_31
                    {
                    lv_isDesc_6_0=(Token)match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleOrderClause1139); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:599:1: entryRuleOrderItem returns [EObject current=null] : iv_ruleOrderItem= ruleOrderItem EOF ;
    public final EObject entryRuleOrderItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderItem = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:600:2: (iv_ruleOrderItem= ruleOrderItem EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:601:2: iv_ruleOrderItem= ruleOrderItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderItemRule()); 
            }
            pushFollow(FOLLOW_ruleOrderItem_in_entryRuleOrderItem1187);
            iv_ruleOrderItem=ruleOrderItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderItem1197); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:608:1: ruleOrderItem returns [EObject current=null] : ( (lv_var_0_0= ruleAliasAttributeExpression ) ) ;
    public final EObject ruleOrderItem() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:611:28: ( ( (lv_var_0_0= ruleAliasAttributeExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:612:1: ( (lv_var_0_0= ruleAliasAttributeExpression ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:612:1: ( (lv_var_0_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:613:1: (lv_var_0_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:613:1: (lv_var_0_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:614:3: lv_var_0_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderItemAccess().getVarAliasAttributeExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleOrderItem1242);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:638:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:639:2: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:640:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateStatementRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement1276);
            iv_ruleUpdateStatement=ruleUpdateStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement1286); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:647:1: ruleUpdateStatement returns [EObject current=null] : ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ) ;
    public final EObject ruleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_updateClause_0_0 = null;

        EObject lv_setClause_1_0 = null;

        EObject lv_whereClause_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:650:28: ( ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:651:1: ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:651:1: ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:651:2: ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )?
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:651:2: ( (lv_updateClause_0_0= ruleUpdateClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:652:1: (lv_updateClause_0_0= ruleUpdateClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:652:1: (lv_updateClause_0_0= ruleUpdateClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:653:3: lv_updateClause_0_0= ruleUpdateClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateClauseUpdateClauseParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUpdateClause_in_ruleUpdateStatement1332);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:669:2: ( (lv_setClause_1_0= ruleSetClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:670:1: (lv_setClause_1_0= ruleSetClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:670:1: (lv_setClause_1_0= ruleSetClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:671:3: lv_setClause_1_0= ruleSetClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getSetClauseSetClauseParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSetClause_in_ruleUpdateStatement1353);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:687:2: ( (lv_whereClause_2_0= ruleWhereClause ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KEYWORD_51) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:688:1: (lv_whereClause_2_0= ruleWhereClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:688:1: (lv_whereClause_2_0= ruleWhereClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:689:3: lv_whereClause_2_0= ruleWhereClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getWhereClauseWhereClauseParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleUpdateStatement1374);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:713:1: entryRuleUpdateClause returns [EObject current=null] : iv_ruleUpdateClause= ruleUpdateClause EOF ;
    public final EObject entryRuleUpdateClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:714:2: (iv_ruleUpdateClause= ruleUpdateClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:715:2: iv_ruleUpdateClause= ruleUpdateClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateClauseRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateClause_in_entryRuleUpdateClause1410);
            iv_ruleUpdateClause=ruleUpdateClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateClause1420); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:722:1: ruleUpdateClause returns [EObject current=null] : (otherlv_0= KEYWORD_61 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) ;
    public final EObject ruleUpdateClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_fromEntries_1_0 = null;

        EObject lv_fromEntries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:725:28: ( (otherlv_0= KEYWORD_61 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:726:1: (otherlv_0= KEYWORD_61 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:726:1: (otherlv_0= KEYWORD_61 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:727:2: otherlv_0= KEYWORD_61 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleUpdateClause1458); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUpdateClauseAccess().getUPDATEKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:731:1: ( (lv_fromEntries_1_0= ruleFromEntry ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:732:1: (lv_fromEntries_1_0= ruleFromEntry )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:732:1: (lv_fromEntries_1_0= ruleFromEntry )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:733:3: lv_fromEntries_1_0= ruleFromEntry
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateClauseAccess().getFromEntriesFromEntryParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFromEntry_in_ruleUpdateClause1478);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:749:2: (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==KEYWORD_3) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:750:2: otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleUpdateClause1492); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getUpdateClauseAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:754:1: ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:755:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:755:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:756:3: lv_fromEntries_3_0= ruleFromEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUpdateClauseAccess().getFromEntriesFromEntryParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFromEntry_in_ruleUpdateClause1512);
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
    // $ANTLR end "ruleUpdateClause"


    // $ANTLR start "entryRuleSetClause"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:780:1: entryRuleSetClause returns [EObject current=null] : iv_ruleSetClause= ruleSetClause EOF ;
    public final EObject entryRuleSetClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:781:2: (iv_ruleSetClause= ruleSetClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:782:2: iv_ruleSetClause= ruleSetClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetClauseRule()); 
            }
            pushFollow(FOLLOW_ruleSetClause_in_entryRuleSetClause1549);
            iv_ruleSetClause=ruleSetClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetClause1559); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:789:1: ruleSetClause returns [EObject current=null] : (otherlv_0= KEYWORD_29 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )* ) ;
    public final EObject ruleSetClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:792:28: ( (otherlv_0= KEYWORD_29 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:793:1: (otherlv_0= KEYWORD_29 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:793:1: (otherlv_0= KEYWORD_29 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:794:2: otherlv_0= KEYWORD_29 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleSetClause1597); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSetClauseAccess().getSETKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:798:1: ( (lv_items_1_0= ruleUpdateItem ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:799:1: (lv_items_1_0= ruleUpdateItem )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:799:1: (lv_items_1_0= ruleUpdateItem )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:800:3: lv_items_1_0= ruleUpdateItem
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSetClauseAccess().getItemsUpdateItemParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUpdateItem_in_ruleSetClause1617);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:816:2: (otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==KEYWORD_3) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:817:2: otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleSetClause1631); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSetClauseAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:821:1: ( (lv_items_3_0= ruleUpdateItem ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:822:1: (lv_items_3_0= ruleUpdateItem )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:822:1: (lv_items_3_0= ruleUpdateItem )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:823:3: lv_items_3_0= ruleUpdateItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSetClauseAccess().getItemsUpdateItemParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUpdateItem_in_ruleSetClause1651);
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
            	    break loop13;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:847:1: entryRuleUpdateItem returns [EObject current=null] : iv_ruleUpdateItem= ruleUpdateItem EOF ;
    public final EObject entryRuleUpdateItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateItem = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:848:2: (iv_ruleUpdateItem= ruleUpdateItem EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:849:2: iv_ruleUpdateItem= ruleUpdateItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateItemRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateItem_in_entryRuleUpdateItem1688);
            iv_ruleUpdateItem=ruleUpdateItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateItem1698); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:856:1: ruleUpdateItem returns [EObject current=null] : ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_7 ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleUpdateItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_alias_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:859:28: ( ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_7 ( (lv_value_2_0= ruleValue ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:860:1: ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_7 ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:860:1: ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_7 ( (lv_value_2_0= ruleValue ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:860:2: ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_7 ( (lv_value_2_0= ruleValue ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:860:2: ( (lv_alias_0_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:861:1: (lv_alias_0_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:861:1: (lv_alias_0_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:862:3: lv_alias_0_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateItemAccess().getAliasAliasAttributeExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleUpdateItem1744);
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

            otherlv_1=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleUpdateItem1757); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUpdateItemAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:883:1: ( (lv_value_2_0= ruleValue ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:884:1: (lv_value_2_0= ruleValue )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:884:1: (lv_value_2_0= ruleValue )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:885:3: lv_value_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateItemAccess().getValueValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleUpdateItem1777);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:909:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:910:2: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:911:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement1812);
            iv_ruleDeleteStatement=ruleDeleteStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteStatement1822); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:918:1: ruleDeleteStatement returns [EObject current=null] : ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_deleteClause_0_0 = null;

        EObject lv_whereClause_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:921:28: ( ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:922:1: ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:922:1: ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:922:2: ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )?
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:922:2: ( (lv_deleteClause_0_0= ruleDeleteClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:923:1: (lv_deleteClause_0_0= ruleDeleteClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:923:1: (lv_deleteClause_0_0= ruleDeleteClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:924:3: lv_deleteClause_0_0= ruleDeleteClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeleteStatementAccess().getDeleteClauseDeleteClauseParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDeleteClause_in_ruleDeleteStatement1868);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:940:2: ( (lv_whereClause_1_0= ruleWhereClause ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KEYWORD_51) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:941:1: (lv_whereClause_1_0= ruleWhereClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:941:1: (lv_whereClause_1_0= ruleWhereClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:942:3: lv_whereClause_1_0= ruleWhereClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeleteStatementAccess().getWhereClauseWhereClauseParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleDeleteStatement1889);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:966:1: entryRuleDeleteClause returns [EObject current=null] : iv_ruleDeleteClause= ruleDeleteClause EOF ;
    public final EObject entryRuleDeleteClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:967:2: (iv_ruleDeleteClause= ruleDeleteClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:968:2: iv_ruleDeleteClause= ruleDeleteClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteClauseRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteClause_in_entryRuleDeleteClause1925);
            iv_ruleDeleteClause=ruleDeleteClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteClause1935); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:975:1: ruleDeleteClause returns [EObject current=null] : (otherlv_0= KEYWORD_53 ( (lv_fromClause_1_0= ruleFromClause ) ) ) ;
    public final EObject ruleDeleteClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_fromClause_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:978:28: ( (otherlv_0= KEYWORD_53 ( (lv_fromClause_1_0= ruleFromClause ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:979:1: (otherlv_0= KEYWORD_53 ( (lv_fromClause_1_0= ruleFromClause ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:979:1: (otherlv_0= KEYWORD_53 ( (lv_fromClause_1_0= ruleFromClause ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:980:2: otherlv_0= KEYWORD_53 ( (lv_fromClause_1_0= ruleFromClause ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleDeleteClause1973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDeleteClauseAccess().getDELETEKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:984:1: ( (lv_fromClause_1_0= ruleFromClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:985:1: (lv_fromClause_1_0= ruleFromClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:985:1: (lv_fromClause_1_0= ruleFromClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:986:3: lv_fromClause_1_0= ruleFromClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeleteClauseAccess().getFromClauseFromClauseParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFromClause_in_ruleDeleteClause1993);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1010:1: entryRuleSelectFromClause returns [EObject current=null] : iv_ruleSelectFromClause= ruleSelectFromClause EOF ;
    public final EObject entryRuleSelectFromClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectFromClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1011:2: (iv_ruleSelectFromClause= ruleSelectFromClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1012:2: iv_ruleSelectFromClause= ruleSelectFromClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectFromClauseRule()); 
            }
            pushFollow(FOLLOW_ruleSelectFromClause_in_entryRuleSelectFromClause2028);
            iv_ruleSelectFromClause=ruleSelectFromClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectFromClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectFromClause2038); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1019:1: ruleSelectFromClause returns [EObject current=null] : ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) ) ;
    public final EObject ruleSelectFromClause() throws RecognitionException {
        EObject current = null;

        EObject lv_selectClause_0_0 = null;

        EObject lv_fromClause_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1022:28: ( ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1023:1: ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1023:1: ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1023:2: ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1023:2: ( (lv_selectClause_0_0= ruleSelectClause ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KEYWORD_60) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1024:1: (lv_selectClause_0_0= ruleSelectClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1024:1: (lv_selectClause_0_0= ruleSelectClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1025:3: lv_selectClause_0_0= ruleSelectClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectFromClauseAccess().getSelectClauseSelectClauseParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectClause_in_ruleSelectFromClause2084);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1041:3: ( (lv_fromClause_1_0= ruleFromClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1042:1: (lv_fromClause_1_0= ruleFromClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1042:1: (lv_fromClause_1_0= ruleFromClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1043:3: lv_fromClause_1_0= ruleFromClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectFromClauseAccess().getFromClauseFromClauseParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFromClause_in_ruleSelectFromClause2106);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1067:1: entryRuleSelectClause returns [EObject current=null] : iv_ruleSelectClause= ruleSelectClause EOF ;
    public final EObject entryRuleSelectClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1068:2: (iv_ruleSelectClause= ruleSelectClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1069:2: iv_ruleSelectClause= ruleSelectClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectClauseRule()); 
            }
            pushFollow(FOLLOW_ruleSelectClause_in_entryRuleSelectClause2141);
            iv_ruleSelectClause=ruleSelectClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectClause2151); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1076:1: ruleSelectClause returns [EObject current=null] : (otherlv_0= KEYWORD_60 ( (lv_isDistinct_1_0= KEYWORD_63 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* ) ;
    public final EObject ruleSelectClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isDistinct_1_0=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1079:28: ( (otherlv_0= KEYWORD_60 ( (lv_isDistinct_1_0= KEYWORD_63 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1080:1: (otherlv_0= KEYWORD_60 ( (lv_isDistinct_1_0= KEYWORD_63 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1080:1: (otherlv_0= KEYWORD_60 ( (lv_isDistinct_1_0= KEYWORD_63 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1081:2: otherlv_0= KEYWORD_60 ( (lv_isDistinct_1_0= KEYWORD_63 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleSelectClause2189); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSelectClauseAccess().getSELECTKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1085:1: ( (lv_isDistinct_1_0= KEYWORD_63 ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==KEYWORD_63) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1086:1: (lv_isDistinct_1_0= KEYWORD_63 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1086:1: (lv_isDistinct_1_0= KEYWORD_63 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1087:3: lv_isDistinct_1_0= KEYWORD_63
                    {
                    lv_isDistinct_1_0=(Token)match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleSelectClause2207); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1101:3: ( (lv_expressions_2_0= ruleSelectExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1102:1: (lv_expressions_2_0= ruleSelectExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1102:1: (lv_expressions_2_0= ruleSelectExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1103:3: lv_expressions_2_0= ruleSelectExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectClauseAccess().getExpressionsSelectExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectClause2240);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1119:2: (otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==KEYWORD_3) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1120:2: otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleSelectClause2254); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getSelectClauseAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1124:1: ( (lv_expressions_4_0= ruleSelectExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1125:1: (lv_expressions_4_0= ruleSelectExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1125:1: (lv_expressions_4_0= ruleSelectExpression )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1126:3: lv_expressions_4_0= ruleSelectExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectClauseAccess().getExpressionsSelectExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectClause2274);
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
            	    break loop17;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1150:1: entryRuleSelectExpression returns [EObject current=null] : iv_ruleSelectExpression= ruleSelectExpression EOF ;
    public final EObject entryRuleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1151:2: (iv_ruleSelectExpression= ruleSelectExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1152:2: iv_ruleSelectExpression= ruleSelectExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression2311);
            iv_ruleSelectExpression=ruleSelectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectExpression2321); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1159:1: ruleSelectExpression returns [EObject current=null] : (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression ) ;
    public final EObject ruleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AliasAttributeExpression_0 = null;

        EObject this_SelectAggregateExpression_1 = null;

        EObject this_SelectConstructorExpression_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1162:28: ( (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1163:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1163:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt18=1;
                }
                break;
            case KEYWORD_41:
            case KEYWORD_23:
            case KEYWORD_24:
            case KEYWORD_25:
            case KEYWORD_30:
                {
                alt18=2;
                }
                break;
            case KEYWORD_27:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1164:2: this_AliasAttributeExpression_0= ruleAliasAttributeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectExpressionAccess().getAliasAttributeExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSelectExpression2371);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1177:2: this_SelectAggregateExpression_1= ruleSelectAggregateExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectExpressionAccess().getSelectAggregateExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectAggregateExpression_in_ruleSelectExpression2401);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1190:2: this_SelectConstructorExpression_2= ruleSelectConstructorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectExpressionAccess().getSelectConstructorExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectConstructorExpression_in_ruleSelectExpression2431);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1209:1: entryRuleSelectAggregateExpression returns [EObject current=null] : iv_ruleSelectAggregateExpression= ruleSelectAggregateExpression EOF ;
    public final EObject entryRuleSelectAggregateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectAggregateExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1210:2: (iv_ruleSelectAggregateExpression= ruleSelectAggregateExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1211:2: iv_ruleSelectAggregateExpression= ruleSelectAggregateExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectAggregateExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectAggregateExpression_in_entryRuleSelectAggregateExpression2465);
            iv_ruleSelectAggregateExpression=ruleSelectAggregateExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectAggregateExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectAggregateExpression2475); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1218:1: ruleSelectAggregateExpression returns [EObject current=null] : (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate ) ;
    public final EObject ruleSelectAggregateExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AvgAggregate_0 = null;

        EObject this_MaxAggregate_1 = null;

        EObject this_MinAggregate_2 = null;

        EObject this_SumAggregate_3 = null;

        EObject this_CountAggregate_4 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1221:28: ( (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1222:1: (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1222:1: (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate )
            int alt19=5;
            switch ( input.LA(1) ) {
            case KEYWORD_23:
                {
                alt19=1;
                }
                break;
            case KEYWORD_24:
                {
                alt19=2;
                }
                break;
            case KEYWORD_25:
                {
                alt19=3;
                }
                break;
            case KEYWORD_30:
                {
                alt19=4;
                }
                break;
            case KEYWORD_41:
                {
                alt19=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1223:2: this_AvgAggregate_0= ruleAvgAggregate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getAvgAggregateParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAvgAggregate_in_ruleSelectAggregateExpression2525);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1236:2: this_MaxAggregate_1= ruleMaxAggregate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getMaxAggregateParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMaxAggregate_in_ruleSelectAggregateExpression2555);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1249:2: this_MinAggregate_2= ruleMinAggregate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getMinAggregateParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMinAggregate_in_ruleSelectAggregateExpression2585);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1262:2: this_SumAggregate_3= ruleSumAggregate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getSumAggregateParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSumAggregate_in_ruleSelectAggregateExpression2615);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1275:2: this_CountAggregate_4= ruleCountAggregate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getCountAggregateParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCountAggregate_in_ruleSelectAggregateExpression2645);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1294:1: entryRuleAvgAggregate returns [EObject current=null] : iv_ruleAvgAggregate= ruleAvgAggregate EOF ;
    public final EObject entryRuleAvgAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvgAggregate = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1295:2: (iv_ruleAvgAggregate= ruleAvgAggregate EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1296:2: iv_ruleAvgAggregate= ruleAvgAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAvgAggregateRule()); 
            }
            pushFollow(FOLLOW_ruleAvgAggregate_in_entryRuleAvgAggregate2679);
            iv_ruleAvgAggregate=ruleAvgAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAvgAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvgAggregate2689); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1303:1: ruleAvgAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_23 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_63 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleAvgAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1306:28: ( (otherlv_0= KEYWORD_23 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_63 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1307:1: (otherlv_0= KEYWORD_23 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_63 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1307:1: (otherlv_0= KEYWORD_23 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_63 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1308:2: otherlv_0= KEYWORD_23 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_63 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleAvgAggregate2727); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAvgAggregateAccess().getAVGKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleAvgAggregate2739); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAvgAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1317:1: ( (lv_isDistinct_2_0= KEYWORD_63 ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KEYWORD_63) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1318:1: (lv_isDistinct_2_0= KEYWORD_63 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1318:1: (lv_isDistinct_2_0= KEYWORD_63 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1319:3: lv_isDistinct_2_0= KEYWORD_63
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleAvgAggregate2757); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1333:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1334:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1334:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1335:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAvgAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleAvgAggregate2790);
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

            otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleAvgAggregate2803); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1364:1: entryRuleMaxAggregate returns [EObject current=null] : iv_ruleMaxAggregate= ruleMaxAggregate EOF ;
    public final EObject entryRuleMaxAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxAggregate = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1365:2: (iv_ruleMaxAggregate= ruleMaxAggregate EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1366:2: iv_ruleMaxAggregate= ruleMaxAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaxAggregateRule()); 
            }
            pushFollow(FOLLOW_ruleMaxAggregate_in_entryRuleMaxAggregate2837);
            iv_ruleMaxAggregate=ruleMaxAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaxAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxAggregate2847); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1373:1: ruleMaxAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_24 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_63 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleMaxAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1376:28: ( (otherlv_0= KEYWORD_24 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_63 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1377:1: (otherlv_0= KEYWORD_24 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_63 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1377:1: (otherlv_0= KEYWORD_24 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_63 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1378:2: otherlv_0= KEYWORD_24 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_63 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleMaxAggregate2885); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMaxAggregateAccess().getMAXKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleMaxAggregate2897); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMaxAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1387:1: ( (lv_isDistinct_2_0= KEYWORD_63 ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KEYWORD_63) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1388:1: (lv_isDistinct_2_0= KEYWORD_63 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1388:1: (lv_isDistinct_2_0= KEYWORD_63 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1389:3: lv_isDistinct_2_0= KEYWORD_63
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleMaxAggregate2915); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1403:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1404:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1404:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1405:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaxAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleMaxAggregate2948);
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

            otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleMaxAggregate2961); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1434:1: entryRuleMinAggregate returns [EObject current=null] : iv_ruleMinAggregate= ruleMinAggregate EOF ;
    public final EObject entryRuleMinAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinAggregate = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1435:2: (iv_ruleMinAggregate= ruleMinAggregate EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1436:2: iv_ruleMinAggregate= ruleMinAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinAggregateRule()); 
            }
            pushFollow(FOLLOW_ruleMinAggregate_in_entryRuleMinAggregate2995);
            iv_ruleMinAggregate=ruleMinAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinAggregate3005); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1443:1: ruleMinAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_25 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_63 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleMinAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1446:28: ( (otherlv_0= KEYWORD_25 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_63 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1447:1: (otherlv_0= KEYWORD_25 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_63 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1447:1: (otherlv_0= KEYWORD_25 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_63 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1448:2: otherlv_0= KEYWORD_25 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_63 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleMinAggregate3043); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMinAggregateAccess().getMINKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleMinAggregate3055); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMinAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1457:1: ( (lv_isDistinct_2_0= KEYWORD_63 ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==KEYWORD_63) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1458:1: (lv_isDistinct_2_0= KEYWORD_63 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1458:1: (lv_isDistinct_2_0= KEYWORD_63 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1459:3: lv_isDistinct_2_0= KEYWORD_63
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleMinAggregate3073); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1473:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1474:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1474:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1475:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleMinAggregate3106);
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

            otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleMinAggregate3119); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1504:1: entryRuleSumAggregate returns [EObject current=null] : iv_ruleSumAggregate= ruleSumAggregate EOF ;
    public final EObject entryRuleSumAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumAggregate = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1505:2: (iv_ruleSumAggregate= ruleSumAggregate EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1506:2: iv_ruleSumAggregate= ruleSumAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumAggregateRule()); 
            }
            pushFollow(FOLLOW_ruleSumAggregate_in_entryRuleSumAggregate3153);
            iv_ruleSumAggregate=ruleSumAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumAggregate3163); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1513:1: ruleSumAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_30 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_63 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleSumAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1516:28: ( (otherlv_0= KEYWORD_30 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_63 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1517:1: (otherlv_0= KEYWORD_30 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_63 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1517:1: (otherlv_0= KEYWORD_30 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_63 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1518:2: otherlv_0= KEYWORD_30 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_63 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleSumAggregate3201); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSumAggregateAccess().getSUMKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleSumAggregate3213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSumAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1527:1: ( (lv_isDistinct_2_0= KEYWORD_63 ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==KEYWORD_63) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1528:1: (lv_isDistinct_2_0= KEYWORD_63 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1528:1: (lv_isDistinct_2_0= KEYWORD_63 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1529:3: lv_isDistinct_2_0= KEYWORD_63
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleSumAggregate3231); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1543:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1544:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1544:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1545:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSumAggregate3264);
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

            otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleSumAggregate3277); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1574:1: entryRuleCountAggregate returns [EObject current=null] : iv_ruleCountAggregate= ruleCountAggregate EOF ;
    public final EObject entryRuleCountAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountAggregate = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1575:2: (iv_ruleCountAggregate= ruleCountAggregate EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1576:2: iv_ruleCountAggregate= ruleCountAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCountAggregateRule()); 
            }
            pushFollow(FOLLOW_ruleCountAggregate_in_entryRuleCountAggregate3311);
            iv_ruleCountAggregate=ruleCountAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCountAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCountAggregate3321); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1583:1: ruleCountAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_41 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_63 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleCountAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1586:28: ( (otherlv_0= KEYWORD_41 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_63 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1587:1: (otherlv_0= KEYWORD_41 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_63 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1587:1: (otherlv_0= KEYWORD_41 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_63 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1588:2: otherlv_0= KEYWORD_41 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_63 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleCountAggregate3359); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCountAggregateAccess().getCOUNTKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleCountAggregate3371); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCountAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1597:1: ( (lv_isDistinct_2_0= KEYWORD_63 ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==KEYWORD_63) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1598:1: (lv_isDistinct_2_0= KEYWORD_63 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1598:1: (lv_isDistinct_2_0= KEYWORD_63 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1599:3: lv_isDistinct_2_0= KEYWORD_63
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleCountAggregate3389); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1613:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1614:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1614:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1615:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCountAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleCountAggregate3422);
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

            otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleCountAggregate3435); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1644:1: entryRuleSelectConstructorExpression returns [EObject current=null] : iv_ruleSelectConstructorExpression= ruleSelectConstructorExpression EOF ;
    public final EObject entryRuleSelectConstructorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectConstructorExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1645:2: (iv_ruleSelectConstructorExpression= ruleSelectConstructorExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1646:2: iv_ruleSelectConstructorExpression= ruleSelectConstructorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectConstructorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectConstructorExpression_in_entryRuleSelectConstructorExpression3469);
            iv_ruleSelectConstructorExpression=ruleSelectConstructorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectConstructorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectConstructorExpression3479); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1653:1: ruleSelectConstructorExpression returns [EObject current=null] : (otherlv_0= KEYWORD_27 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2 ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1656:28: ( (otherlv_0= KEYWORD_27 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1657:1: (otherlv_0= KEYWORD_27 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1657:1: (otherlv_0= KEYWORD_27 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1658:2: otherlv_0= KEYWORD_27 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleSelectConstructorExpression3517); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSelectConstructorExpressionAccess().getNEWKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1662:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1663:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1663:1: (lv_name_1_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1664:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectConstructorExpression3533); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleSelectConstructorExpression3551); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSelectConstructorExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1685:1: ( (lv_items_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1686:1: (lv_items_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1686:1: (lv_items_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1687:3: lv_items_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectConstructorExpressionAccess().getItemsAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3571);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1703:2: (otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==KEYWORD_3) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1704:2: otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleSelectConstructorExpression3585); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getSelectConstructorExpressionAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1708:1: ( (lv_items_5_0= ruleAliasAttributeExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1709:1: (lv_items_5_0= ruleAliasAttributeExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1709:1: (lv_items_5_0= ruleAliasAttributeExpression )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1710:3: lv_items_5_0= ruleAliasAttributeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectConstructorExpressionAccess().getItemsAliasAttributeExpressionParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3605);
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
            	    break loop25;
                }
            } while (true);

            otherlv_6=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleSelectConstructorExpression3620); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1739:1: entryRuleFromClause returns [EObject current=null] : iv_ruleFromClause= ruleFromClause EOF ;
    public final EObject entryRuleFromClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1740:2: (iv_ruleFromClause= ruleFromClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1741:2: iv_ruleFromClause= ruleFromClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromClauseRule()); 
            }
            pushFollow(FOLLOW_ruleFromClause_in_entryRuleFromClause3654);
            iv_ruleFromClause=ruleFromClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClause3664); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1748:1: ruleFromClause returns [EObject current=null] : (otherlv_0= KEYWORD_32 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) ;
    public final EObject ruleFromClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_fromEntries_1_0 = null;

        EObject lv_fromEntries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1751:28: ( (otherlv_0= KEYWORD_32 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1752:1: (otherlv_0= KEYWORD_32 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1752:1: (otherlv_0= KEYWORD_32 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1753:2: otherlv_0= KEYWORD_32 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleFromClause3702); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFromClauseAccess().getFROMKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1757:1: ( (lv_fromEntries_1_0= ruleFromClass ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1758:1: (lv_fromEntries_1_0= ruleFromClass )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1758:1: (lv_fromEntries_1_0= ruleFromClass )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1759:3: lv_fromEntries_1_0= ruleFromClass
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromClauseAccess().getFromEntriesFromClassParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFromClass_in_ruleFromClause3722);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1775:2: (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==KEYWORD_3) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1776:2: otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleFromClause3736); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFromClauseAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1780:1: ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1781:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1781:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1782:3: lv_fromEntries_3_0= ruleFromEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFromClauseAccess().getFromEntriesFromEntryParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFromEntry_in_ruleFromClause3756);
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
    // $ANTLR end "ruleFromClause"


    // $ANTLR start "entryRuleFromEntry"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1806:1: entryRuleFromEntry returns [EObject current=null] : iv_ruleFromEntry= ruleFromEntry EOF ;
    public final EObject entryRuleFromEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromEntry = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1807:2: (iv_ruleFromEntry= ruleFromEntry EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1808:2: iv_ruleFromEntry= ruleFromEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromEntryRule()); 
            }
            pushFollow(FOLLOW_ruleFromEntry_in_entryRuleFromEntry3793);
            iv_ruleFromEntry=ruleFromEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromEntry3803); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1815:1: ruleFromEntry returns [EObject current=null] : (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection ) ;
    public final EObject ruleFromEntry() throws RecognitionException {
        EObject current = null;

        EObject this_FromClass_0 = null;

        EObject this_FromCollection_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1818:28: ( (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1819:1: (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1819:1: (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            else if ( (LA27_0==KEYWORD_14) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1820:2: this_FromClass_0= ruleFromClass
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromEntryAccess().getFromClassParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFromClass_in_ruleFromEntry3853);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1833:2: this_FromCollection_1= ruleFromCollection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromEntryAccess().getFromCollectionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFromCollection_in_ruleFromEntry3883);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1852:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1853:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1854:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3917);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration3927); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1861:1: ruleVariableDeclaration returns [EObject current=null] : ( (otherlv_0= KEYWORD_12 )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1864:28: ( ( (otherlv_0= KEYWORD_12 )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1865:1: ( (otherlv_0= KEYWORD_12 )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1865:1: ( (otherlv_0= KEYWORD_12 )? ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1865:2: (otherlv_0= KEYWORD_12 )? ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1865:2: (otherlv_0= KEYWORD_12 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==KEYWORD_12) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1866:2: otherlv_0= KEYWORD_12
                    {
                    otherlv_0=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleVariableDeclaration3966); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getASKeyword_0());
                          
                    }

                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1870:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1871:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1871:1: (lv_name_1_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1872:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration3984); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1896:1: entryRuleFromClass returns [EObject current=null] : iv_ruleFromClass= ruleFromClass EOF ;
    public final EObject entryRuleFromClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClass = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1897:2: (iv_ruleFromClass= ruleFromClass EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1898:2: iv_ruleFromClass= ruleFromClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromClassRule()); 
            }
            pushFollow(FOLLOW_ruleFromClass_in_entryRuleFromClass4024);
            iv_ruleFromClass=ruleFromClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClass4034); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1905:1: ruleFromClass returns [EObject current=null] : (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar ) ;
    public final EObject ruleFromClass() throws RecognitionException {
        EObject current = null;

        EObject this_FromClassId_0 = null;

        EObject this_FromClassVar_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1908:28: ( (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1909:1: (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1909:1: (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar )
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1910:2: this_FromClassId_0= ruleFromClassId
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromClassAccess().getFromClassIdParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFromClassId_in_ruleFromClass4084);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1923:2: this_FromClassVar_1= ruleFromClassVar
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromClassAccess().getFromClassVarParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFromClassVar_in_ruleFromClass4114);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1942:1: entryRuleQualifiedIdentifier returns [String current=null] : iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF ;
    public final String entryRuleQualifiedIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedIdentifier = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1943:1: (iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1944:2: iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier4149);
            iv_ruleQualifiedIdentifier=ruleQualifiedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedIdentifier4160); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1951:1: ruleQualifiedIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= KEYWORD_4 this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1955:6: ( (this_ID_0= RULE_ID (kw= KEYWORD_4 this_ID_2= RULE_ID )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1956:1: (this_ID_0= RULE_ID (kw= KEYWORD_4 this_ID_2= RULE_ID )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1956:1: (this_ID_0= RULE_ID (kw= KEYWORD_4 this_ID_2= RULE_ID )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1956:6: this_ID_0= RULE_ID (kw= KEYWORD_4 this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier4200); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1963:1: (kw= KEYWORD_4 this_ID_2= RULE_ID )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==KEYWORD_4) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1964:2: kw= KEYWORD_4 this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleQualifiedIdentifier4219); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier4234); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // $ANTLR end "ruleQualifiedIdentifier"


    // $ANTLR start "entryRuleFromClassId"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1984:1: entryRuleFromClassId returns [EObject current=null] : iv_ruleFromClassId= ruleFromClassId EOF ;
    public final EObject entryRuleFromClassId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClassId = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1985:2: (iv_ruleFromClassId= ruleFromClassId EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1986:2: iv_ruleFromClassId= ruleFromClassId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromClassIdRule()); 
            }
            pushFollow(FOLLOW_ruleFromClassId_in_entryRuleFromClassId4280);
            iv_ruleFromClassId=ruleFromClassId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromClassId; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClassId4290); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1993:1: ruleFromClassId returns [EObject current=null] : ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ;
    public final EObject ruleFromClassId() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1996:28: ( ( (lv_type_0_0= ruleQualifiedIdentifier ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1997:1: ( (lv_type_0_0= ruleQualifiedIdentifier ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1997:1: ( (lv_type_0_0= ruleQualifiedIdentifier ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1998:1: (lv_type_0_0= ruleQualifiedIdentifier )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1998:1: (lv_type_0_0= ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1999:3: lv_type_0_0= ruleQualifiedIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromClassIdAccess().getTypeQualifiedIdentifierParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleFromClassId4335);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2023:1: entryRuleFromClassVar returns [EObject current=null] : iv_ruleFromClassVar= ruleFromClassVar EOF ;
    public final EObject entryRuleFromClassVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClassVar = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2024:2: (iv_ruleFromClassVar= ruleFromClassVar EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2025:2: iv_ruleFromClassVar= ruleFromClassVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromClassVarRule()); 
            }
            pushFollow(FOLLOW_ruleFromClassVar_in_entryRuleFromClassVar4369);
            iv_ruleFromClassVar=ruleFromClassVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromClassVar; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClassVar4379); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2032:1: ruleFromClassVar returns [EObject current=null] : ( ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* ) ;
    public final EObject ruleFromClassVar() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_joins_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2035:28: ( ( ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2036:1: ( ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2036:1: ( ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2036:2: ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )*
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2036:2: ( (lv_type_0_0= ruleQualifiedIdentifier ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2037:1: (lv_type_0_0= ruleQualifiedIdentifier )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2037:1: (lv_type_0_0= ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2038:3: lv_type_0_0= ruleQualifiedIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromClassVarAccess().getTypeQualifiedIdentifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleFromClassVar4425);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2054:2: ( (lv_variable_1_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2055:1: (lv_variable_1_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2055:1: (lv_variable_1_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2056:3: lv_variable_1_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromClassVarAccess().getVariableVariableDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleFromClassVar4446);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2072:2: ( (lv_joins_2_0= ruleFromJoin ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==KEYWORD_46||(LA31_0>=KEYWORD_33 && LA31_0<=KEYWORD_34)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2073:1: (lv_joins_2_0= ruleFromJoin )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2073:1: (lv_joins_2_0= ruleFromJoin )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2074:3: lv_joins_2_0= ruleFromJoin
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFromClassVarAccess().getJoinsFromJoinParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFromJoin_in_ruleFromClassVar4467);
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
    // $ANTLR end "ruleFromClassVar"


    // $ANTLR start "entryRuleFromCollection"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2098:1: entryRuleFromCollection returns [EObject current=null] : iv_ruleFromCollection= ruleFromCollection EOF ;
    public final EObject entryRuleFromCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromCollection = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2099:2: (iv_ruleFromCollection= ruleFromCollection EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2100:2: iv_ruleFromCollection= ruleFromCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromCollectionRule()); 
            }
            pushFollow(FOLLOW_ruleFromCollection_in_entryRuleFromCollection4503);
            iv_ruleFromCollection=ruleFromCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromCollection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromCollection4513); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2107:1: ruleFromCollection returns [EObject current=null] : (otherlv_0= KEYWORD_14 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleFromCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_path_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2110:28: ( (otherlv_0= KEYWORD_14 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2111:1: (otherlv_0= KEYWORD_14 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2111:1: (otherlv_0= KEYWORD_14 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2112:2: otherlv_0= KEYWORD_14 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleFromCollection4551); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFromCollectionAccess().getINKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleFromCollection4563); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFromCollectionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2121:1: ( (lv_path_2_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2122:1: (lv_path_2_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2122:1: (lv_path_2_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2123:3: lv_path_2_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromCollectionAccess().getPathAliasAttributeExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleFromCollection4583);
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

            otherlv_3=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleFromCollection4596); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFromCollectionAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2144:1: ( (lv_variable_4_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2145:1: (lv_variable_4_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2145:1: (lv_variable_4_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2146:3: lv_variable_4_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromCollectionAccess().getVariableVariableDeclarationParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleFromCollection4616);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2170:1: entryRuleFromJoin returns [EObject current=null] : iv_ruleFromJoin= ruleFromJoin EOF ;
    public final EObject entryRuleFromJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromJoin = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2171:2: (iv_ruleFromJoin= ruleFromJoin EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2172:2: iv_ruleFromJoin= ruleFromJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromJoinRule()); 
            }
            pushFollow(FOLLOW_ruleFromJoin_in_entryRuleFromJoin4651);
            iv_ruleFromJoin=ruleFromJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromJoin4661); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2179:1: ruleFromJoin returns [EObject current=null] : (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin ) ;
    public final EObject ruleFromJoin() throws RecognitionException {
        EObject current = null;

        EObject this_Join_0 = null;

        EObject this_LeftJoin_1 = null;

        EObject this_InnerJoin_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2182:28: ( (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2183:1: (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2183:1: (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin )
            int alt32=3;
            switch ( input.LA(1) ) {
            case KEYWORD_33:
                {
                alt32=1;
                }
                break;
            case KEYWORD_34:
                {
                alt32=2;
                }
                break;
            case KEYWORD_46:
                {
                alt32=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2184:2: this_Join_0= ruleJoin
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromJoinAccess().getJoinParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJoin_in_ruleFromJoin4711);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2197:2: this_LeftJoin_1= ruleLeftJoin
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromJoinAccess().getLeftJoinParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLeftJoin_in_ruleFromJoin4741);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2210:2: this_InnerJoin_2= ruleInnerJoin
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromJoinAccess().getInnerJoinParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInnerJoin_in_ruleFromJoin4771);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2229:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2230:2: (iv_ruleJoin= ruleJoin EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2231:2: iv_ruleJoin= ruleJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinRule()); 
            }
            pushFollow(FOLLOW_ruleJoin_in_entryRuleJoin4805);
            iv_ruleJoin=ruleJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoin4815); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2238:1: ruleJoin returns [EObject current=null] : (otherlv_0= KEYWORD_33 ( (lv_isFetch_1_0= KEYWORD_44 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isFetch_1_0=null;
        EObject lv_path_2_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2241:28: ( (otherlv_0= KEYWORD_33 ( (lv_isFetch_1_0= KEYWORD_44 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2242:1: (otherlv_0= KEYWORD_33 ( (lv_isFetch_1_0= KEYWORD_44 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2242:1: (otherlv_0= KEYWORD_33 ( (lv_isFetch_1_0= KEYWORD_44 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2243:2: otherlv_0= KEYWORD_33 ( (lv_isFetch_1_0= KEYWORD_44 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleJoin4853); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJoinAccess().getJOINKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2247:1: ( (lv_isFetch_1_0= KEYWORD_44 ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==KEYWORD_44) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2248:1: (lv_isFetch_1_0= KEYWORD_44 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2248:1: (lv_isFetch_1_0= KEYWORD_44 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2249:3: lv_isFetch_1_0= KEYWORD_44
                    {
                    lv_isFetch_1_0=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleJoin4871); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2263:3: ( (lv_path_2_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2264:1: (lv_path_2_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2264:1: (lv_path_2_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2265:3: lv_path_2_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinAccess().getPathAliasAttributeExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleJoin4904);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2281:2: ( (lv_variable_3_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2282:1: (lv_variable_3_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2282:1: (lv_variable_3_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2283:3: lv_variable_3_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinAccess().getVariableVariableDeclarationParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleJoin4925);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2307:1: entryRuleLeftJoin returns [EObject current=null] : iv_ruleLeftJoin= ruleLeftJoin EOF ;
    public final EObject entryRuleLeftJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftJoin = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2308:2: (iv_ruleLeftJoin= ruleLeftJoin EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2309:2: iv_ruleLeftJoin= ruleLeftJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeftJoinRule()); 
            }
            pushFollow(FOLLOW_ruleLeftJoin_in_entryRuleLeftJoin4960);
            iv_ruleLeftJoin=ruleLeftJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeftJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftJoin4970); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2316:1: ruleLeftJoin returns [EObject current=null] : (otherlv_0= KEYWORD_34 ( (lv_isOuter_1_0= KEYWORD_49 ) )? otherlv_2= KEYWORD_33 ( (lv_isFetch_3_0= KEYWORD_44 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2319:28: ( (otherlv_0= KEYWORD_34 ( (lv_isOuter_1_0= KEYWORD_49 ) )? otherlv_2= KEYWORD_33 ( (lv_isFetch_3_0= KEYWORD_44 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2320:1: (otherlv_0= KEYWORD_34 ( (lv_isOuter_1_0= KEYWORD_49 ) )? otherlv_2= KEYWORD_33 ( (lv_isFetch_3_0= KEYWORD_44 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2320:1: (otherlv_0= KEYWORD_34 ( (lv_isOuter_1_0= KEYWORD_49 ) )? otherlv_2= KEYWORD_33 ( (lv_isFetch_3_0= KEYWORD_44 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2321:2: otherlv_0= KEYWORD_34 ( (lv_isOuter_1_0= KEYWORD_49 ) )? otherlv_2= KEYWORD_33 ( (lv_isFetch_3_0= KEYWORD_44 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleLeftJoin5008); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLeftJoinAccess().getLEFTKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2325:1: ( (lv_isOuter_1_0= KEYWORD_49 ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==KEYWORD_49) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2326:1: (lv_isOuter_1_0= KEYWORD_49 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2326:1: (lv_isOuter_1_0= KEYWORD_49 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2327:3: lv_isOuter_1_0= KEYWORD_49
                    {
                    lv_isOuter_1_0=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleLeftJoin5026); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleLeftJoin5051); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLeftJoinAccess().getJOINKeyword_2());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2346:1: ( (lv_isFetch_3_0= KEYWORD_44 ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==KEYWORD_44) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2347:1: (lv_isFetch_3_0= KEYWORD_44 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2347:1: (lv_isFetch_3_0= KEYWORD_44 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2348:3: lv_isFetch_3_0= KEYWORD_44
                    {
                    lv_isFetch_3_0=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleLeftJoin5069); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2362:3: ( (lv_path_4_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2363:1: (lv_path_4_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2363:1: (lv_path_4_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2364:3: lv_path_4_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLeftJoinAccess().getPathAliasAttributeExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleLeftJoin5102);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2380:2: ( (lv_variable_5_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2381:1: (lv_variable_5_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2381:1: (lv_variable_5_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2382:3: lv_variable_5_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLeftJoinAccess().getVariableVariableDeclarationParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleLeftJoin5123);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2406:1: entryRuleInnerJoin returns [EObject current=null] : iv_ruleInnerJoin= ruleInnerJoin EOF ;
    public final EObject entryRuleInnerJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerJoin = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2407:2: (iv_ruleInnerJoin= ruleInnerJoin EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2408:2: iv_ruleInnerJoin= ruleInnerJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInnerJoinRule()); 
            }
            pushFollow(FOLLOW_ruleInnerJoin_in_entryRuleInnerJoin5158);
            iv_ruleInnerJoin=ruleInnerJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInnerJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInnerJoin5168); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2415:1: ruleInnerJoin returns [EObject current=null] : (otherlv_0= KEYWORD_46 otherlv_1= KEYWORD_33 ( (lv_isFetch_2_0= KEYWORD_44 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleInnerJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isFetch_2_0=null;
        EObject lv_path_3_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2418:28: ( (otherlv_0= KEYWORD_46 otherlv_1= KEYWORD_33 ( (lv_isFetch_2_0= KEYWORD_44 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2419:1: (otherlv_0= KEYWORD_46 otherlv_1= KEYWORD_33 ( (lv_isFetch_2_0= KEYWORD_44 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2419:1: (otherlv_0= KEYWORD_46 otherlv_1= KEYWORD_33 ( (lv_isFetch_2_0= KEYWORD_44 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2420:2: otherlv_0= KEYWORD_46 otherlv_1= KEYWORD_33 ( (lv_isFetch_2_0= KEYWORD_44 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleInnerJoin5206); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInnerJoinAccess().getINNERKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleInnerJoin5218); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInnerJoinAccess().getJOINKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2429:1: ( (lv_isFetch_2_0= KEYWORD_44 ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==KEYWORD_44) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2430:1: (lv_isFetch_2_0= KEYWORD_44 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2430:1: (lv_isFetch_2_0= KEYWORD_44 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2431:3: lv_isFetch_2_0= KEYWORD_44
                    {
                    lv_isFetch_2_0=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleInnerJoin5236); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2445:3: ( (lv_path_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2446:1: (lv_path_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2446:1: (lv_path_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2447:3: lv_path_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInnerJoinAccess().getPathAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleInnerJoin5269);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2463:2: ( (lv_variable_4_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2464:1: (lv_variable_4_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2464:1: (lv_variable_4_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2465:3: lv_variable_4_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInnerJoinAccess().getVariableVariableDeclarationParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInnerJoin5290);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2489:1: entryRuleWhereClause returns [EObject current=null] : iv_ruleWhereClause= ruleWhereClause EOF ;
    public final EObject entryRuleWhereClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2490:2: (iv_ruleWhereClause= ruleWhereClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2491:2: iv_ruleWhereClause= ruleWhereClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhereClauseRule()); 
            }
            pushFollow(FOLLOW_ruleWhereClause_in_entryRuleWhereClause5325);
            iv_ruleWhereClause=ruleWhereClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhereClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhereClause5335); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2498:1: ruleWhereClause returns [EObject current=null] : (otherlv_0= KEYWORD_51 ( (lv_whereEntry_1_0= ruleOrExpression ) ) ) ;
    public final EObject ruleWhereClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_whereEntry_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2501:28: ( (otherlv_0= KEYWORD_51 ( (lv_whereEntry_1_0= ruleOrExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2502:1: (otherlv_0= KEYWORD_51 ( (lv_whereEntry_1_0= ruleOrExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2502:1: (otherlv_0= KEYWORD_51 ( (lv_whereEntry_1_0= ruleOrExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2503:2: otherlv_0= KEYWORD_51 ( (lv_whereEntry_1_0= ruleOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleWhereClause5373); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhereClauseAccess().getWHEREKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2507:1: ( (lv_whereEntry_1_0= ruleOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2508:1: (lv_whereEntry_1_0= ruleOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2508:1: (lv_whereEntry_1_0= ruleOrExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2509:3: lv_whereEntry_1_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhereClauseAccess().getWhereEntryOrExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleWhereClause5393);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2533:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2534:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2535:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression5428);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression5438); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2542:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2545:28: ( (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2546:1: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2546:1: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2547:2: this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression5488);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_AndExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2558:1: ( () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==KEYWORD_17) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2558:2: () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2558:2: ()
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2559:2: 
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

                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2567:2: (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==KEYWORD_17) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2568:2: otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleOrExpression5514); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getORKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2572:1: ( (lv_entries_3_0= ruleAndExpression ) )
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2573:1: (lv_entries_3_0= ruleAndExpression )
                    	    {
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2573:1: (lv_entries_3_0= ruleAndExpression )
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2574:3: lv_entries_3_0= ruleAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getEntriesAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression5534);
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2598:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2599:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2600:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression5573);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression5583); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2607:1: ruleAndExpression returns [EObject current=null] : (this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ConcreteExpression_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2610:28: ( (this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2611:1: (this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2611:1: (this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2612:2: this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getConcreteExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConcreteExpression_in_ruleAndExpression5633);
            this_ConcreteExpression_0=ruleConcreteExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ConcreteExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2623:1: ( () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==KEYWORD_20) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2623:2: () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2623:2: ()
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2624:2: 
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

                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2632:2: (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==KEYWORD_20) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2633:2: otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleAndExpression5659); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getANDKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2637:1: ( (lv_entries_3_0= ruleConcreteExpression ) )
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2638:1: (lv_entries_3_0= ruleConcreteExpression )
                    	    {
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2638:1: (lv_entries_3_0= ruleConcreteExpression )
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2639:3: lv_entries_3_0= ruleConcreteExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getEntriesConcreteExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleConcreteExpression_in_ruleAndExpression5679);
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
                    	    if ( cnt39 >= 1 ) break loop39;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2663:1: entryRuleConcreteExpression returns [EObject current=null] : iv_ruleConcreteExpression= ruleConcreteExpression EOF ;
    public final EObject entryRuleConcreteExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2664:2: (iv_ruleConcreteExpression= ruleConcreteExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2665:2: iv_ruleConcreteExpression= ruleConcreteExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcreteExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConcreteExpression_in_entryRuleConcreteExpression5718);
            iv_ruleConcreteExpression=ruleConcreteExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcreteExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcreteExpression5728); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2672:1: ruleConcreteExpression returns [EObject current=null] : (this_ParExpression_0= ruleParExpression | this_OperatorExpression_1= ruleOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression ) ;
    public final EObject ruleConcreteExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ParExpression_0 = null;

        EObject this_OperatorExpression_1 = null;

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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2675:28: ( (this_ParExpression_0= ruleParExpression | this_OperatorExpression_1= ruleOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2676:1: (this_ParExpression_0= ruleParExpression | this_OperatorExpression_1= ruleOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2676:1: (this_ParExpression_0= ruleParExpression | this_OperatorExpression_1= ruleOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression )
            int alt41=12;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2677:2: this_ParExpression_0= ruleParExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getParExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParExpression_in_ruleConcreteExpression5778);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2690:2: this_OperatorExpression_1= ruleOperatorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getOperatorExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperatorExpression_in_ruleConcreteExpression5808);
                    this_OperatorExpression_1=ruleOperatorExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_OperatorExpression_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2703:2: this_ExistsExpression_2= ruleExistsExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getExistsExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExistsExpression_in_ruleConcreteExpression5838);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2716:2: this_AllExpression_3= ruleAllExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getAllExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAllExpression_in_ruleConcreteExpression5868);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2729:2: this_AnyExpression_4= ruleAnyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getAnyExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnyExpression_in_ruleConcreteExpression5898);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2742:2: this_SomeExpression_5= ruleSomeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getSomeExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSomeExpression_in_ruleConcreteExpression5928);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2755:2: this_CollectionExpression_6= ruleCollectionExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getCollectionExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCollectionExpression_in_ruleConcreteExpression5958);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2768:2: this_NullComparisonExpression_7= ruleNullComparisonExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getNullComparisonExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullComparisonExpression_in_ruleConcreteExpression5988);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2781:2: this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getEmptyComparisonExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEmptyComparisonExpression_in_ruleConcreteExpression6018);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2794:2: this_LikeExpression_9= ruleLikeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getLikeExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLikeExpression_in_ruleConcreteExpression6048);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2807:2: this_InExpression_10= ruleInExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getInExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInExpression_in_ruleConcreteExpression6078);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2820:2: this_BetweenExpression_11= ruleBetweenExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getBetweenExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBetweenExpression_in_ruleConcreteExpression6108);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2839:1: entryRuleParExpression returns [EObject current=null] : iv_ruleParExpression= ruleParExpression EOF ;
    public final EObject entryRuleParExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2840:2: (iv_ruleParExpression= ruleParExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2841:2: iv_ruleParExpression= ruleParExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParExpression_in_entryRuleParExpression6142);
            iv_ruleParExpression=ruleParExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParExpression6152); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2848:1: ruleParExpression returns [EObject current=null] : (otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2 ) ;
    public final EObject ruleParExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ExpressionTerm_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2851:28: ( (otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2852:1: (otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2852:1: (otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2853:2: otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleParExpression6190); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParExpressionAccess().getExpressionTermParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionTerm_in_ruleParExpression6214);
            this_ExpressionTerm_1=ruleExpressionTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ExpressionTerm_1;
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleParExpression6226); if (state.failed) return current;
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


    // $ANTLR start "entryRuleOperatorExpression"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2882:1: entryRuleOperatorExpression returns [EObject current=null] : iv_ruleOperatorExpression= ruleOperatorExpression EOF ;
    public final EObject entryRuleOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatorExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2883:2: (iv_ruleOperatorExpression= ruleOperatorExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2884:2: iv_ruleOperatorExpression= ruleOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOperatorExpression_in_entryRuleOperatorExpression6260);
            iv_ruleOperatorExpression=ruleOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorExpression6270); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperatorExpression"


    // $ANTLR start "ruleOperatorExpression"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2891:1: ruleOperatorExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) ) ) ;
    public final EObject ruleOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_rhs_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2894:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2895:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2895:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2895:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2895:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2896:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2896:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2897:3: lv_lhs_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperatorExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleOperatorExpression6316);
            lv_lhs_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperatorExpressionRule());
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2913:2: ( (lv_operator_1_0= ruleOperator ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2914:1: (lv_operator_1_0= ruleOperator )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2914:1: (lv_operator_1_0= ruleOperator )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2915:3: lv_operator_1_0= ruleOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperatorExpressionAccess().getOperatorOperatorEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOperator_in_ruleOperatorExpression6337);
            lv_operator_1_0=ruleOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperatorExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_1_0, 
                      		"Operator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2931:2: ( (lv_rhs_2_0= ruleExpressionTerm ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2932:1: (lv_rhs_2_0= ruleExpressionTerm )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2932:1: (lv_rhs_2_0= ruleExpressionTerm )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2933:3: lv_rhs_2_0= ruleExpressionTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperatorExpressionAccess().getRhsExpressionTermParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpressionTerm_in_ruleOperatorExpression6358);
            lv_rhs_2_0=ruleExpressionTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperatorExpressionRule());
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
    // $ANTLR end "ruleOperatorExpression"


    // $ANTLR start "entryRuleExistsExpression"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2957:1: entryRuleExistsExpression returns [EObject current=null] : iv_ruleExistsExpression= ruleExistsExpression EOF ;
    public final EObject entryRuleExistsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistsExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2958:2: (iv_ruleExistsExpression= ruleExistsExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2959:2: iv_ruleExistsExpression= ruleExistsExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExistsExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExistsExpression_in_entryRuleExistsExpression6393);
            iv_ruleExistsExpression=ruleExistsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExistsExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExistsExpression6403); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2966:1: ruleExistsExpression returns [EObject current=null] : ( ( (lv_isNot_0_0= KEYWORD_28 ) )? otherlv_1= KEYWORD_54 ( (lv_query_2_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleExistsExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_0_0=null;
        Token otherlv_1=null;
        EObject lv_query_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2969:28: ( ( ( (lv_isNot_0_0= KEYWORD_28 ) )? otherlv_1= KEYWORD_54 ( (lv_query_2_0= ruleQueryExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2970:1: ( ( (lv_isNot_0_0= KEYWORD_28 ) )? otherlv_1= KEYWORD_54 ( (lv_query_2_0= ruleQueryExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2970:1: ( ( (lv_isNot_0_0= KEYWORD_28 ) )? otherlv_1= KEYWORD_54 ( (lv_query_2_0= ruleQueryExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2970:2: ( (lv_isNot_0_0= KEYWORD_28 ) )? otherlv_1= KEYWORD_54 ( (lv_query_2_0= ruleQueryExpression ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2970:2: ( (lv_isNot_0_0= KEYWORD_28 ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==KEYWORD_28) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2971:1: (lv_isNot_0_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2971:1: (lv_isNot_0_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2972:3: lv_isNot_0_0= KEYWORD_28
                    {
                    lv_isNot_0_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleExistsExpression6447); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleExistsExpression6472); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExistsExpressionAccess().getEXISTSKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2991:1: ( (lv_query_2_0= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2992:1: (lv_query_2_0= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2992:1: (lv_query_2_0= ruleQueryExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2993:3: lv_query_2_0= ruleQueryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExistsExpressionAccess().getQueryQueryExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleExistsExpression6492);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3017:1: entryRuleAllExpression returns [EObject current=null] : iv_ruleAllExpression= ruleAllExpression EOF ;
    public final EObject entryRuleAllExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3018:2: (iv_ruleAllExpression= ruleAllExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3019:2: iv_ruleAllExpression= ruleAllExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAllExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAllExpression_in_entryRuleAllExpression6527);
            iv_ruleAllExpression=ruleAllExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAllExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllExpression6537); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3026:1: ruleAllExpression returns [EObject current=null] : (otherlv_0= KEYWORD_19 ( (lv_query_1_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleAllExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_query_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3029:28: ( (otherlv_0= KEYWORD_19 ( (lv_query_1_0= ruleQueryExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3030:1: (otherlv_0= KEYWORD_19 ( (lv_query_1_0= ruleQueryExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3030:1: (otherlv_0= KEYWORD_19 ( (lv_query_1_0= ruleQueryExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3031:2: otherlv_0= KEYWORD_19 ( (lv_query_1_0= ruleQueryExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleAllExpression6575); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAllExpressionAccess().getALLKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3035:1: ( (lv_query_1_0= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3036:1: (lv_query_1_0= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3036:1: (lv_query_1_0= ruleQueryExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3037:3: lv_query_1_0= ruleQueryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAllExpressionAccess().getQueryQueryExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleAllExpression6595);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3061:1: entryRuleAnyExpression returns [EObject current=null] : iv_ruleAnyExpression= ruleAnyExpression EOF ;
    public final EObject entryRuleAnyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3062:2: (iv_ruleAnyExpression= ruleAnyExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3063:2: iv_ruleAnyExpression= ruleAnyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAnyExpression_in_entryRuleAnyExpression6630);
            iv_ruleAnyExpression=ruleAnyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnyExpression6640); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3070:1: ruleAnyExpression returns [EObject current=null] : (otherlv_0= KEYWORD_21 ( (lv_query_1_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleAnyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_query_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3073:28: ( (otherlv_0= KEYWORD_21 ( (lv_query_1_0= ruleQueryExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3074:1: (otherlv_0= KEYWORD_21 ( (lv_query_1_0= ruleQueryExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3074:1: (otherlv_0= KEYWORD_21 ( (lv_query_1_0= ruleQueryExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3075:2: otherlv_0= KEYWORD_21 ( (lv_query_1_0= ruleQueryExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleAnyExpression6678); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnyExpressionAccess().getANYKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3079:1: ( (lv_query_1_0= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3080:1: (lv_query_1_0= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3080:1: (lv_query_1_0= ruleQueryExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3081:3: lv_query_1_0= ruleQueryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnyExpressionAccess().getQueryQueryExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleAnyExpression6698);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3105:1: entryRuleSomeExpression returns [EObject current=null] : iv_ruleSomeExpression= ruleSomeExpression EOF ;
    public final EObject entryRuleSomeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSomeExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3106:2: (iv_ruleSomeExpression= ruleSomeExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3107:2: iv_ruleSomeExpression= ruleSomeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSomeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSomeExpression_in_entryRuleSomeExpression6733);
            iv_ruleSomeExpression=ruleSomeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSomeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSomeExpression6743); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3114:1: ruleSomeExpression returns [EObject current=null] : (otherlv_0= KEYWORD_38 ( (lv_query_1_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleSomeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_query_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3117:28: ( (otherlv_0= KEYWORD_38 ( (lv_query_1_0= ruleQueryExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3118:1: (otherlv_0= KEYWORD_38 ( (lv_query_1_0= ruleQueryExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3118:1: (otherlv_0= KEYWORD_38 ( (lv_query_1_0= ruleQueryExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3119:2: otherlv_0= KEYWORD_38 ( (lv_query_1_0= ruleQueryExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleSomeExpression6781); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSomeExpressionAccess().getSOMEKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3123:1: ( (lv_query_1_0= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3124:1: (lv_query_1_0= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3124:1: (lv_query_1_0= ruleQueryExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3125:3: lv_query_1_0= ruleQueryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSomeExpressionAccess().getQueryQueryExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleSomeExpression6801);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3149:1: entryRuleCollectionExpression returns [EObject current=null] : iv_ruleCollectionExpression= ruleCollectionExpression EOF ;
    public final EObject entryRuleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3150:2: (iv_ruleCollectionExpression= ruleCollectionExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3151:2: iv_ruleCollectionExpression= ruleCollectionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression6836);
            iv_ruleCollectionExpression=ruleCollectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionExpression6846); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3158:1: ruleCollectionExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_59 (otherlv_3= KEYWORD_16 )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) ) ) ;
    public final EObject ruleCollectionExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3161:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_59 (otherlv_3= KEYWORD_16 )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3162:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_59 (otherlv_3= KEYWORD_16 )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3162:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_59 (otherlv_3= KEYWORD_16 )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3162:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_59 (otherlv_3= KEYWORD_16 )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3162:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3163:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3163:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3164:3: lv_lhs_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleCollectionExpression6892);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3180:2: ( (lv_isNot_1_0= KEYWORD_28 ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==KEYWORD_28) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3181:1: (lv_isNot_1_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3181:1: (lv_isNot_1_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3182:3: lv_isNot_1_0= KEYWORD_28
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleCollectionExpression6911); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_ruleCollectionExpression6936); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCollectionExpressionAccess().getMEMBERKeyword_2());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3201:1: (otherlv_3= KEYWORD_16 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==KEYWORD_16) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3202:2: otherlv_3= KEYWORD_16
                    {
                    otherlv_3=(Token)match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleCollectionExpression6949); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCollectionExpressionAccess().getOFKeyword_3());
                          
                    }

                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3206:3: ( (lv_rhs_4_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3207:1: (lv_rhs_4_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3207:1: (lv_rhs_4_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3208:3: lv_rhs_4_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionExpressionAccess().getRhsAliasAttributeExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleCollectionExpression6971);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3232:1: entryRuleNullComparisonExpression returns [EObject current=null] : iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF ;
    public final EObject entryRuleNullComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullComparisonExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3233:2: (iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3234:2: iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullComparisonExpression_in_entryRuleNullComparisonExpression7006);
            iv_ruleNullComparisonExpression=ruleNullComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullComparisonExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullComparisonExpression7016); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3241:1: ruleNullComparisonExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_36 ) ;
    public final EObject ruleNullComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isNot_2_0=null;
        Token otherlv_3=null;
        EObject lv_lhs_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3244:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_36 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3245:1: ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_36 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3245:1: ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_36 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3245:2: ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_36
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3245:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3246:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3246:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3247:3: lv_lhs_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNullComparisonExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleNullComparisonExpression7062);
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

            otherlv_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleNullComparisonExpression7075); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNullComparisonExpressionAccess().getISKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3268:1: ( (lv_isNot_2_0= KEYWORD_28 ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==KEYWORD_28) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3269:1: (lv_isNot_2_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3269:1: (lv_isNot_2_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3270:3: lv_isNot_2_0= KEYWORD_28
                    {
                    lv_isNot_2_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleNullComparisonExpression7093); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleNullComparisonExpression7118); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3297:1: entryRuleEmptyComparisonExpression returns [EObject current=null] : iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF ;
    public final EObject entryRuleEmptyComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyComparisonExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3298:2: (iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3299:2: iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmptyComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEmptyComparisonExpression_in_entryRuleEmptyComparisonExpression7152);
            iv_ruleEmptyComparisonExpression=ruleEmptyComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmptyComparisonExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmptyComparisonExpression7162); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3306:1: ruleEmptyComparisonExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_42 ) ;
    public final EObject ruleEmptyComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isNot_2_0=null;
        Token otherlv_3=null;
        EObject lv_lhs_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3309:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_42 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3310:1: ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_42 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3310:1: ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_42 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3310:2: ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_42
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3310:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3311:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3311:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3312:3: lv_lhs_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEmptyComparisonExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleEmptyComparisonExpression7208);
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

            otherlv_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleEmptyComparisonExpression7221); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEmptyComparisonExpressionAccess().getISKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3333:1: ( (lv_isNot_2_0= KEYWORD_28 ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==KEYWORD_28) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3334:1: (lv_isNot_2_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3334:1: (lv_isNot_2_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3335:3: lv_isNot_2_0= KEYWORD_28
                    {
                    lv_isNot_2_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleEmptyComparisonExpression7239); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleEmptyComparisonExpression7264); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3362:1: entryRuleLikeExpression returns [EObject current=null] : iv_ruleLikeExpression= ruleLikeExpression EOF ;
    public final EObject entryRuleLikeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLikeExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3363:2: (iv_ruleLikeExpression= ruleLikeExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3364:2: iv_ruleLikeExpression= ruleLikeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLikeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLikeExpression_in_entryRuleLikeExpression7298);
            iv_ruleLikeExpression=ruleLikeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLikeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLikeExpression7308); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3371:1: ruleLikeExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_35 ( (lv_pattern_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleLikeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        Token lv_pattern_3_0=null;
        EObject lv_lhs_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3374:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_35 ( (lv_pattern_3_0= RULE_STRING ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3375:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_35 ( (lv_pattern_3_0= RULE_STRING ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3375:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_35 ( (lv_pattern_3_0= RULE_STRING ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3375:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_35 ( (lv_pattern_3_0= RULE_STRING ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3375:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3376:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3376:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3377:3: lv_lhs_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLikeExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleLikeExpression7354);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3393:2: ( (lv_isNot_1_0= KEYWORD_28 ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==KEYWORD_28) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3394:1: (lv_isNot_1_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3394:1: (lv_isNot_1_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3395:3: lv_isNot_1_0= KEYWORD_28
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleLikeExpression7373); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleLikeExpression7398); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLikeExpressionAccess().getLIKEKeyword_2());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3414:1: ( (lv_pattern_3_0= RULE_STRING ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3415:1: (lv_pattern_3_0= RULE_STRING )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3415:1: (lv_pattern_3_0= RULE_STRING )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3416:3: lv_pattern_3_0= RULE_STRING
            {
            lv_pattern_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLikeExpression7414); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3440:1: entryRuleInExpression returns [EObject current=null] : iv_ruleInExpression= ruleInExpression EOF ;
    public final EObject entryRuleInExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3441:2: (iv_ruleInExpression= ruleInExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3442:2: iv_ruleInExpression= ruleInExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInExpression_in_entryRuleInExpression7454);
            iv_ruleInExpression=ruleInExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInExpression7464); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3449:1: ruleInExpression returns [EObject current=null] : (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression ) ;
    public final EObject ruleInExpression() throws RecognitionException {
        EObject current = null;

        EObject this_InSeqExpression_0 = null;

        EObject this_InQueryExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3452:28: ( (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3453:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3453:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )
            int alt48=2;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3454:2: this_InSeqExpression_0= ruleInSeqExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInExpressionAccess().getInSeqExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInSeqExpression_in_ruleInExpression7514);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3467:2: this_InQueryExpression_1= ruleInQueryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInExpressionAccess().getInQueryExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInQueryExpression_in_ruleInExpression7544);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3486:1: entryRuleInSeqExpression returns [EObject current=null] : iv_ruleInSeqExpression= ruleInSeqExpression EOF ;
    public final EObject entryRuleInSeqExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInSeqExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3487:2: (iv_ruleInSeqExpression= ruleInSeqExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3488:2: iv_ruleInSeqExpression= ruleInSeqExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInSeqExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInSeqExpression_in_entryRuleInSeqExpression7578);
            iv_ruleInSeqExpression=ruleInSeqExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInSeqExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInSeqExpression7588); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3495:1: ruleInSeqExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2 ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3498:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3499:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3499:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3499:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3499:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3500:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3500:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3501:3: lv_lhs_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInSeqExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7634);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3517:2: ( (lv_isNot_1_0= KEYWORD_28 ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==KEYWORD_28) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3518:1: (lv_isNot_1_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3518:1: (lv_isNot_1_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3519:3: lv_isNot_1_0= KEYWORD_28
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleInSeqExpression7653); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleInSeqExpression7678); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInSeqExpressionAccess().getINKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleInSeqExpression7690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInSeqExpressionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3543:1: ( (lv_items_4_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3544:1: (lv_items_4_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3544:1: (lv_items_4_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3545:3: lv_items_4_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInSeqExpressionAccess().getItemsVariableParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7710);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3561:2: (otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==KEYWORD_3) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3562:2: otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) )
            	    {
            	    otherlv_5=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleInSeqExpression7724); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getInSeqExpressionAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3566:1: ( (lv_items_6_0= ruleVariable ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3567:1: (lv_items_6_0= ruleVariable )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3567:1: (lv_items_6_0= ruleVariable )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3568:3: lv_items_6_0= ruleVariable
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInSeqExpressionAccess().getItemsVariableParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7744);
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

            otherlv_7=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleInSeqExpression7759); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3597:1: entryRuleInQueryExpression returns [EObject current=null] : iv_ruleInQueryExpression= ruleInQueryExpression EOF ;
    public final EObject entryRuleInQueryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInQueryExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3598:2: (iv_ruleInQueryExpression= ruleInQueryExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3599:2: iv_ruleInQueryExpression= ruleInQueryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInQueryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInQueryExpression_in_entryRuleInQueryExpression7793);
            iv_ruleInQueryExpression=ruleInQueryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInQueryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInQueryExpression7803); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3606:1: ruleInQueryExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 ( (lv_query_3_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleInQueryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_query_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3609:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 ( (lv_query_3_0= ruleQueryExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3610:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 ( (lv_query_3_0= ruleQueryExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3610:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 ( (lv_query_3_0= ruleQueryExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3610:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 ( (lv_query_3_0= ruleQueryExpression ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3610:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3611:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3611:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3612:3: lv_lhs_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInQueryExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleInQueryExpression7849);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3628:2: ( (lv_isNot_1_0= KEYWORD_28 ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==KEYWORD_28) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3629:1: (lv_isNot_1_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3629:1: (lv_isNot_1_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3630:3: lv_isNot_1_0= KEYWORD_28
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleInQueryExpression7868); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleInQueryExpression7893); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInQueryExpressionAccess().getINKeyword_2());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3649:1: ( (lv_query_3_0= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3650:1: (lv_query_3_0= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3650:1: (lv_query_3_0= ruleQueryExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3651:3: lv_query_3_0= ruleQueryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInQueryExpressionAccess().getQueryQueryExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleInQueryExpression7913);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3675:1: entryRuleBetweenExpression returns [EObject current=null] : iv_ruleBetweenExpression= ruleBetweenExpression EOF ;
    public final EObject entryRuleBetweenExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBetweenExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3676:2: (iv_ruleBetweenExpression= ruleBetweenExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3677:2: iv_ruleBetweenExpression= ruleBetweenExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBetweenExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBetweenExpression_in_entryRuleBetweenExpression7948);
            iv_ruleBetweenExpression=ruleBetweenExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBetweenExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBetweenExpression7958); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3684:1: ruleBetweenExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_62 ( (lv_min_3_0= ruleValue ) ) otherlv_4= KEYWORD_20 ( (lv_max_5_0= ruleValue ) ) ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3687:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_62 ( (lv_min_3_0= ruleValue ) ) otherlv_4= KEYWORD_20 ( (lv_max_5_0= ruleValue ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3688:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_62 ( (lv_min_3_0= ruleValue ) ) otherlv_4= KEYWORD_20 ( (lv_max_5_0= ruleValue ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3688:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_62 ( (lv_min_3_0= ruleValue ) ) otherlv_4= KEYWORD_20 ( (lv_max_5_0= ruleValue ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3688:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_62 ( (lv_min_3_0= ruleValue ) ) otherlv_4= KEYWORD_20 ( (lv_max_5_0= ruleValue ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3688:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3689:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3689:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3690:3: lv_lhs_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBetweenExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleBetweenExpression8004);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3706:2: ( (lv_isNot_1_0= KEYWORD_28 ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==KEYWORD_28) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3707:1: (lv_isNot_1_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3707:1: (lv_isNot_1_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3708:3: lv_isNot_1_0= KEYWORD_28
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleBetweenExpression8023); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleBetweenExpression8048); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBetweenExpressionAccess().getBETWEENKeyword_2());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3727:1: ( (lv_min_3_0= ruleValue ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3728:1: (lv_min_3_0= ruleValue )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3728:1: (lv_min_3_0= ruleValue )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3729:3: lv_min_3_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBetweenExpressionAccess().getMinValueParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleBetweenExpression8068);
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

            otherlv_4=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleBetweenExpression8081); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBetweenExpressionAccess().getANDKeyword_4());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3750:1: ( (lv_max_5_0= ruleValue ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3751:1: (lv_max_5_0= ruleValue )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3751:1: (lv_max_5_0= ruleValue )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3752:3: lv_max_5_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBetweenExpressionAccess().getMaxValueParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleBetweenExpression8101);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3776:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3777:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3778:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable8136);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable8146); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3785:1: ruleVariable returns [EObject current=null] : (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_AliasAttributeExpression_0 = null;

        EObject this_ParameterExpression_1 = null;

        EObject this_Value_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3788:28: ( (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3789:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3789:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue )
            int alt53=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt53=1;
                }
                break;
            case KEYWORD_5:
                {
                alt53=2;
                }
                break;
            case KEYWORD_43:
            case KEYWORD_36:
            case KEYWORD_40:
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3790:2: this_AliasAttributeExpression_0= ruleAliasAttributeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccess().getAliasAttributeExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleVariable8196);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3803:2: this_ParameterExpression_1= ruleParameterExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccess().getParameterExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameterExpression_in_ruleVariable8226);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3816:2: this_Value_2= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccess().getValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleVariable8256);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3835:1: entryRuleExpressionTerm returns [EObject current=null] : iv_ruleExpressionTerm= ruleExpressionTerm EOF ;
    public final EObject entryRuleExpressionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionTerm = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3836:2: (iv_ruleExpressionTerm= ruleExpressionTerm EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3837:2: iv_ruleExpressionTerm= ruleExpressionTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionTermRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionTerm_in_entryRuleExpressionTerm8290);
            iv_ruleExpressionTerm=ruleExpressionTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionTerm8300); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3844:1: ruleExpressionTerm returns [EObject current=null] : (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression ) ;
    public final EObject ruleExpressionTerm() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_QueryExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3847:28: ( (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3848:1: (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3848:1: (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==KEYWORD_43||LA54_0==KEYWORD_36||LA54_0==KEYWORD_40||LA54_0==KEYWORD_5||(LA54_0>=RULE_ID && LA54_0<=RULE_STRING)) ) {
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3849:2: this_Variable_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionTermAccess().getVariableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleExpressionTerm8350);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3862:2: this_QueryExpression_1= ruleQueryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionTermAccess().getQueryExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQueryExpression_in_ruleExpressionTerm8380);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3881:1: entryRuleAliasAttributeExpression returns [EObject current=null] : iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF ;
    public final EObject entryRuleAliasAttributeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasAttributeExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3882:2: (iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3883:2: iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAliasAttributeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_entryRuleAliasAttributeExpression8414);
            iv_ruleAliasAttributeExpression=ruleAliasAttributeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAliasAttributeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAliasAttributeExpression8424); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3890:1: ruleAliasAttributeExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleAliasAttributeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_attributes_2_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3893:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3894:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3894:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3894:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )*
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3894:2: ( (otherlv_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3895:1: (otherlv_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3895:1: (otherlv_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3896:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAliasAttributeExpressionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8473); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getAliasAttributeExpressionAccess().getAliasVariableDeclarationCrossReference_0_0()); 
              	
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3910:2: (otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==KEYWORD_4) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3911:2: otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleAliasAttributeExpression8487); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getAliasAttributeExpressionAccess().getFullStopKeyword_1_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3915:1: ( (lv_attributes_2_0= RULE_ID ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3916:1: (lv_attributes_2_0= RULE_ID )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3916:1: (lv_attributes_2_0= RULE_ID )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3917:3: lv_attributes_2_0= RULE_ID
            	    {
            	    lv_attributes_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8503); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3941:1: entryRuleParameterExpression returns [EObject current=null] : iv_ruleParameterExpression= ruleParameterExpression EOF ;
    public final EObject entryRuleParameterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3942:2: (iv_ruleParameterExpression= ruleParameterExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3943:2: iv_ruleParameterExpression= ruleParameterExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParameterExpression_in_entryRuleParameterExpression8545);
            iv_ruleParameterExpression=ruleParameterExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterExpression8555); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3950:1: ruleParameterExpression returns [EObject current=null] : (otherlv_0= KEYWORD_5 ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameterExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3953:28: ( (otherlv_0= KEYWORD_5 ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3954:1: (otherlv_0= KEYWORD_5 ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3954:1: (otherlv_0= KEYWORD_5 ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3955:2: otherlv_0= KEYWORD_5 ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleParameterExpression8593); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParameterExpressionAccess().getColonKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3959:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3960:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3960:1: (lv_name_1_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3961:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterExpression8609); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3987:1: entryRuleStringFunction returns [EObject current=null] : iv_ruleStringFunction= ruleStringFunction EOF ;
    public final EObject entryRuleStringFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringFunction = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3988:2: (iv_ruleStringFunction= ruleStringFunction EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3989:2: iv_ruleStringFunction= ruleStringFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleStringFunction_in_entryRuleStringFunction8651);
            iv_ruleStringFunction=ruleStringFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunction8661); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3996:1: ruleStringFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3999:28: ( ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4000:1: ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4000:1: ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4000:2: ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4000:2: ( (lv_name_0_0= ruleStringFunctionName ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4001:1: (lv_name_0_0= ruleStringFunctionName )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4001:1: (lv_name_0_0= ruleStringFunctionName )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4002:3: lv_name_0_0= ruleStringFunctionName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringFunctionAccess().getNameStringFunctionNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStringFunctionName_in_ruleStringFunction8707);
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

            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleStringFunction8720); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStringFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4023:1: ( (lv_params_2_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4024:1: (lv_params_2_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4024:1: (lv_params_2_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4025:3: lv_params_2_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringFunctionAccess().getParamsVariableParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleStringFunction8740);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4041:2: (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4042:2: otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) )
            {
            otherlv_3=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleStringFunction8754); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getStringFunctionAccess().getCommaKeyword_3_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4046:1: ( (lv_params_4_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4047:1: (lv_params_4_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4047:1: (lv_params_4_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4048:3: lv_params_4_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringFunctionAccess().getParamsVariableParserRuleCall_3_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleStringFunction8774);
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

            otherlv_5=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleStringFunction8788); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4077:1: entryRuleStringFunctionName returns [String current=null] : iv_ruleStringFunctionName= ruleStringFunctionName EOF ;
    public final String entryRuleStringFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringFunctionName = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4078:1: (iv_ruleStringFunctionName= ruleStringFunctionName EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4079:2: iv_ruleStringFunctionName= ruleStringFunctionName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringFunctionNameRule()); 
            }
            pushFollow(FOLLOW_ruleStringFunctionName_in_entryRuleStringFunctionName8823);
            iv_ruleStringFunctionName=ruleStringFunctionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringFunctionName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunctionName8834); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4086:1: ruleStringFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_52 | kw= KEYWORD_64 | kw= KEYWORD_47 | kw= KEYWORD_50 | kw= KEYWORD_57 | kw= KEYWORD_58 ) ;
    public final AntlrDatatypeRuleToken ruleStringFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4090:6: ( (kw= KEYWORD_52 | kw= KEYWORD_64 | kw= KEYWORD_47 | kw= KEYWORD_50 | kw= KEYWORD_57 | kw= KEYWORD_58 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4091:1: (kw= KEYWORD_52 | kw= KEYWORD_64 | kw= KEYWORD_47 | kw= KEYWORD_50 | kw= KEYWORD_57 | kw= KEYWORD_58 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4091:1: (kw= KEYWORD_52 | kw= KEYWORD_64 | kw= KEYWORD_47 | kw= KEYWORD_50 | kw= KEYWORD_57 | kw= KEYWORD_58 )
            int alt56=6;
            switch ( input.LA(1) ) {
            case KEYWORD_52:
                {
                alt56=1;
                }
                break;
            case KEYWORD_64:
                {
                alt56=2;
                }
                break;
            case KEYWORD_47:
                {
                alt56=3;
                }
                break;
            case KEYWORD_50:
                {
                alt56=4;
                }
                break;
            case KEYWORD_57:
                {
                alt56=5;
                }
                break;
            case KEYWORD_58:
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4092:2: kw= KEYWORD_52
                    {
                    kw=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleStringFunctionName8872); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getCONCATKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4099:2: kw= KEYWORD_64
                    {
                    kw=(Token)match(input,KEYWORD_64,FOLLOW_KEYWORD_64_in_ruleStringFunctionName8891); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getSUBSTRINGKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4106:2: kw= KEYWORD_47
                    {
                    kw=(Token)match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleStringFunctionName8910); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getLOWERKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4113:2: kw= KEYWORD_50
                    {
                    kw=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleStringFunctionName8929); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getUPPERKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4120:2: kw= KEYWORD_57
                    {
                    kw=(Token)match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleStringFunctionName8948); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getLENGTHKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4127:2: kw= KEYWORD_58
                    {
                    kw=(Token)match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleStringFunctionName8967); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4140:1: entryRuleNumericFunction returns [EObject current=null] : iv_ruleNumericFunction= ruleNumericFunction EOF ;
    public final EObject entryRuleNumericFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericFunction = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4141:2: (iv_ruleNumericFunction= ruleNumericFunction EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4142:2: iv_ruleNumericFunction= ruleNumericFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericFunction_in_entryRuleNumericFunction9006);
            iv_ruleNumericFunction=ruleNumericFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericFunction9016); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4149:1: ruleNumericFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4152:28: ( ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4153:1: ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4153:1: ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4153:2: ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4153:2: ( (lv_name_0_0= ruleNumericFunctionName ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4154:1: (lv_name_0_0= ruleNumericFunctionName )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4154:1: (lv_name_0_0= ruleNumericFunctionName )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4155:3: lv_name_0_0= ruleNumericFunctionName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumericFunctionAccess().getNameNumericFunctionNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumericFunctionName_in_ruleNumericFunction9062);
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

            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleNumericFunction9075); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNumericFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4176:1: ( (lv_params_2_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4177:1: (lv_params_2_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4177:1: (lv_params_2_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4178:3: lv_params_2_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumericFunctionAccess().getParamsVariableParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleNumericFunction9095);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4194:2: (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4195:2: otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) )
            {
            otherlv_3=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleNumericFunction9109); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getNumericFunctionAccess().getCommaKeyword_3_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4199:1: ( (lv_params_4_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4200:1: (lv_params_4_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4200:1: (lv_params_4_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4201:3: lv_params_4_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumericFunctionAccess().getParamsVariableParserRuleCall_3_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleNumericFunction9129);
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

            otherlv_5=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleNumericFunction9143); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4230:1: entryRuleNumericFunctionName returns [String current=null] : iv_ruleNumericFunctionName= ruleNumericFunctionName EOF ;
    public final String entryRuleNumericFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumericFunctionName = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4231:1: (iv_ruleNumericFunctionName= ruleNumericFunctionName EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4232:2: iv_ruleNumericFunctionName= ruleNumericFunctionName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericFunctionNameRule()); 
            }
            pushFollow(FOLLOW_ruleNumericFunctionName_in_entryRuleNumericFunctionName9178);
            iv_ruleNumericFunctionName=ruleNumericFunctionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericFunctionName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericFunctionName9189); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4239:1: ruleNumericFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_18 | kw= KEYWORD_39 | kw= KEYWORD_26 | kw= KEYWORD_37 ) ;
    public final AntlrDatatypeRuleToken ruleNumericFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4243:6: ( (kw= KEYWORD_18 | kw= KEYWORD_39 | kw= KEYWORD_26 | kw= KEYWORD_37 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4244:1: (kw= KEYWORD_18 | kw= KEYWORD_39 | kw= KEYWORD_26 | kw= KEYWORD_37 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4244:1: (kw= KEYWORD_18 | kw= KEYWORD_39 | kw= KEYWORD_26 | kw= KEYWORD_37 )
            int alt57=4;
            switch ( input.LA(1) ) {
            case KEYWORD_18:
                {
                alt57=1;
                }
                break;
            case KEYWORD_39:
                {
                alt57=2;
                }
                break;
            case KEYWORD_26:
                {
                alt57=3;
                }
                break;
            case KEYWORD_37:
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4245:2: kw= KEYWORD_18
                    {
                    kw=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleNumericFunctionName9227); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumericFunctionNameAccess().getABSKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4252:2: kw= KEYWORD_39
                    {
                    kw=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleNumericFunctionName9246); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumericFunctionNameAccess().getSQRTKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4259:2: kw= KEYWORD_26
                    {
                    kw=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleNumericFunctionName9265); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumericFunctionNameAccess().getMODKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4266:2: kw= KEYWORD_37
                    {
                    kw=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleNumericFunctionName9284); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4281:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4282:2: (iv_ruleValue= ruleValue EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4283:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue9325);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue9335); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4290:1: ruleValue returns [EObject current=null] : (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerExpression_0 = null;

        EObject this_StringExpression_1 = null;

        EObject this_NullExpression_2 = null;

        EObject this_BooleanExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4293:28: ( (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4294:1: (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4294:1: (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression )
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
            case KEYWORD_36:
                {
                alt58=3;
                }
                break;
            case KEYWORD_43:
            case KEYWORD_40:
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4295:2: this_IntegerExpression_0= ruleIntegerExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getIntegerExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerExpression_in_ruleValue9385);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4308:2: this_StringExpression_1= ruleStringExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getStringExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringExpression_in_ruleValue9415);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4321:2: this_NullExpression_2= ruleNullExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getNullExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullExpression_in_ruleValue9445);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4334:2: this_BooleanExpression_3= ruleBooleanExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getBooleanExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleValue9475);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4353:1: entryRuleIntegerExpression returns [EObject current=null] : iv_ruleIntegerExpression= ruleIntegerExpression EOF ;
    public final EObject entryRuleIntegerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4354:2: (iv_ruleIntegerExpression= ruleIntegerExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4355:2: iv_ruleIntegerExpression= ruleIntegerExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerExpression_in_entryRuleIntegerExpression9509);
            iv_ruleIntegerExpression=ruleIntegerExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerExpression9519); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4362:1: ruleIntegerExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4365:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4366:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4366:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4367:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4367:1: (lv_value_0_0= RULE_INT )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4368:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerExpression9560); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4392:1: entryRuleStringExpression returns [EObject current=null] : iv_ruleStringExpression= ruleStringExpression EOF ;
    public final EObject entryRuleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4393:2: (iv_ruleStringExpression= ruleStringExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4394:2: iv_ruleStringExpression= ruleStringExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleStringExpression_in_entryRuleStringExpression9599);
            iv_ruleStringExpression=ruleStringExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringExpression9609); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4401:1: ruleStringExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4404:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4405:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4405:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4406:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4406:1: (lv_value_0_0= RULE_STRING )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4407:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringExpression9650); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4431:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4432:2: (iv_ruleNullExpression= ruleNullExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4433:2: iv_ruleNullExpression= ruleNullExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullExpression_in_entryRuleNullExpression9689);
            iv_ruleNullExpression=ruleNullExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullExpression9699); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4440:1: ruleNullExpression returns [EObject current=null] : ( (lv_value_0_0= KEYWORD_36 ) ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4443:28: ( ( (lv_value_0_0= KEYWORD_36 ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4444:1: ( (lv_value_0_0= KEYWORD_36 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4444:1: ( (lv_value_0_0= KEYWORD_36 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4445:1: (lv_value_0_0= KEYWORD_36 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4445:1: (lv_value_0_0= KEYWORD_36 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4446:3: lv_value_0_0= KEYWORD_36
            {
            lv_value_0_0=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleNullExpression9742); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4468:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4469:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4470:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression9787);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression9797); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4477:1: ruleBooleanExpression returns [EObject current=null] : ( ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) ) ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4480:28: ( ( ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4481:1: ( ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4481:1: ( ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4482:1: ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4482:1: ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4483:1: (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4483:1: (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==KEYWORD_40) ) {
                alt59=1;
            }
            else if ( (LA59_0==KEYWORD_43) ) {
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4484:3: lv_value_0_1= KEYWORD_40
                    {
                    lv_value_0_1=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleBooleanExpression9842); if (state.failed) return current;
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4497:8: lv_value_0_2= KEYWORD_43
                    {
                    lv_value_0_2=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleBooleanExpression9870); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4521:1: entryRuleQueryExpression returns [EObject current=null] : iv_ruleQueryExpression= ruleQueryExpression EOF ;
    public final EObject entryRuleQueryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4522:2: (iv_ruleQueryExpression= ruleQueryExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4523:2: iv_ruleQueryExpression= ruleQueryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQueryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_entryRuleQueryExpression9918);
            iv_ruleQueryExpression=ruleQueryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQueryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryExpression9928); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4530:1: ruleQueryExpression returns [EObject current=null] : (otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2 ) ;
    public final EObject ruleQueryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_SelectStatement_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4533:28: ( (otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4534:1: (otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4534:1: (otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4535:2: otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleQueryExpression9966); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQueryExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQueryExpressionAccess().getSelectStatementParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleQueryExpression9990);
            this_SelectStatement_1=ruleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_SelectStatement_1;
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleQueryExpression10002); if (state.failed) return current;
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


    // $ANTLR start "ruleOperator"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4564:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_8 ) | (enumLiteral_2= KEYWORD_10 ) | (enumLiteral_3= KEYWORD_11 ) | (enumLiteral_4= KEYWORD_7 ) | (enumLiteral_5= KEYWORD_9 ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4566:28: ( ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_8 ) | (enumLiteral_2= KEYWORD_10 ) | (enumLiteral_3= KEYWORD_11 ) | (enumLiteral_4= KEYWORD_7 ) | (enumLiteral_5= KEYWORD_9 ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4567:1: ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_8 ) | (enumLiteral_2= KEYWORD_10 ) | (enumLiteral_3= KEYWORD_11 ) | (enumLiteral_4= KEYWORD_7 ) | (enumLiteral_5= KEYWORD_9 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4567:1: ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_8 ) | (enumLiteral_2= KEYWORD_10 ) | (enumLiteral_3= KEYWORD_11 ) | (enumLiteral_4= KEYWORD_7 ) | (enumLiteral_5= KEYWORD_9 ) )
            int alt60=6;
            switch ( input.LA(1) ) {
            case KEYWORD_6:
                {
                alt60=1;
                }
                break;
            case KEYWORD_8:
                {
                alt60=2;
                }
                break;
            case KEYWORD_10:
                {
                alt60=3;
                }
                break;
            case KEYWORD_11:
                {
                alt60=4;
                }
                break;
            case KEYWORD_7:
                {
                alt60=5;
                }
                break;
            case KEYWORD_9:
                {
                alt60=6;
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4567:2: (enumLiteral_0= KEYWORD_6 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4567:2: (enumLiteral_0= KEYWORD_6 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4567:7: enumLiteral_0= KEYWORD_6
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleOperator10054); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getLessThenEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getLessThenEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4573:6: (enumLiteral_1= KEYWORD_8 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4573:6: (enumLiteral_1= KEYWORD_8 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4573:11: enumLiteral_1= KEYWORD_8
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleOperator10076); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getGreaterThenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getGreaterThenEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4579:6: (enumLiteral_2= KEYWORD_10 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4579:6: (enumLiteral_2= KEYWORD_10 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4579:11: enumLiteral_2= KEYWORD_10
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleOperator10098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getLessEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getLessEqualEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4585:6: (enumLiteral_3= KEYWORD_11 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4585:6: (enumLiteral_3= KEYWORD_11 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4585:11: enumLiteral_3= KEYWORD_11
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleOperator10120); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4591:6: (enumLiteral_4= KEYWORD_7 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4591:6: (enumLiteral_4= KEYWORD_7 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4591:11: enumLiteral_4= KEYWORD_7
                    {
                    enumLiteral_4=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleOperator10142); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4597:6: (enumLiteral_5= KEYWORD_9 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4597:6: (enumLiteral_5= KEYWORD_9 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4597:11: enumLiteral_5= KEYWORD_9
                    {
                    enumLiteral_5=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleOperator10164); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getNotEqualEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getOperatorAccess().getNotEqualEnumLiteralDeclaration_5()); 
                          
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
    // $ANTLR end "ruleOperator"

    // Delegated rules


    protected DFA29 dfa29 = new DFA29(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA48 dfa48 = new DFA48(this);
    static final String DFA29_eotS =
        "\6\uffff";
    static final String DFA29_eofS =
        "\1\uffff\1\4\3\uffff\1\4";
    static final String DFA29_minS =
        "\1\107\1\15\1\107\2\uffff\1\15";
    static final String DFA29_maxS =
        "\3\107\2\uffff\1\107";
    static final String DFA29_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA29_specialS =
        "\6\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\1",
            "\1\4\12\uffff\1\4\2\uffff\1\4\2\uffff\1\4\25\uffff\1\4\4\uffff"+
            "\1\3\6\uffff\2\4\1\2\4\uffff\1\3",
            "\1\5",
            "",
            "",
            "\1\4\12\uffff\1\4\2\uffff\1\4\2\uffff\1\4\25\uffff\1\4\4\uffff"+
            "\1\3\6\uffff\2\4\1\2\4\uffff\1\3"
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1909:1: (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar )";
        }
    }
    static final String DFA41_eotS =
        "\32\uffff";
    static final String DFA41_eofS =
        "\32\uffff";
    static final String DFA41_minS =
        "\1\14\1\uffff\1\11\1\107\5\11\4\uffff\1\107\1\11\1\uffff\1\25\4"+
        "\uffff\2\11\1\25\2\uffff";
    static final String DFA41_maxS =
        "\1\111\1\uffff\1\106\1\107\5\106\4\uffff\1\107\1\73\1\uffff\1\63"+
        "\4\uffff\2\106\1\44\2\uffff";
    static final String DFA41_acceptS =
        "\1\uffff\1\1\7\uffff\1\3\1\4\1\5\1\6\2\uffff\1\12\1\uffff\1\14\1"+
        "\13\1\2\1\7\3\uffff\1\11\1\10";
    static final String DFA41_specialS =
        "\32\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\11\11\uffff\1\10\15\uffff\1\6\1\uffff\1\14\1\uffff\1\7\1"+
            "\uffff\1\12\1\uffff\1\13\6\uffff\1\11\13\uffff\1\1\3\uffff\1"+
            "\3\3\uffff\1\2\1\4\1\5",
            "",
            "\1\21\7\uffff\1\24\21\uffff\1\17\17\uffff\1\16\2\uffff\3\23"+
            "\2\uffff\1\22\1\20\5\uffff\1\15\1\uffff\3\23",
            "\1\25",
            "\1\21\7\uffff\1\24\21\uffff\1\17\17\uffff\1\16\2\uffff\3\23"+
            "\2\uffff\1\22\1\20\7\uffff\3\23",
            "\1\21\7\uffff\1\24\21\uffff\1\17\17\uffff\1\16\2\uffff\3\23"+
            "\2\uffff\1\22\1\20\7\uffff\3\23",
            "\1\21\7\uffff\1\24\21\uffff\1\17\17\uffff\1\16\2\uffff\3\23"+
            "\2\uffff\1\22\1\20\7\uffff\3\23",
            "\1\21\7\uffff\1\24\21\uffff\1\17\17\uffff\1\16\2\uffff\3\23"+
            "\2\uffff\1\22\1\20\7\uffff\3\23",
            "\1\21\7\uffff\1\24\21\uffff\1\17\17\uffff\1\16\2\uffff\3\23"+
            "\2\uffff\1\22\1\20\7\uffff\3\23",
            "",
            "",
            "",
            "",
            "\1\26",
            "\1\21\7\uffff\1\24\21\uffff\1\17\27\uffff\1\22",
            "",
            "\1\30\16\uffff\1\31\16\uffff\1\27",
            "",
            "",
            "",
            "",
            "\1\21\7\uffff\1\24\21\uffff\1\17\17\uffff\1\16\2\uffff\3\23"+
            "\2\uffff\1\22\1\20\7\uffff\3\23",
            "\1\21\7\uffff\1\24\21\uffff\1\17\17\uffff\1\16\2\uffff\3\23"+
            "\2\uffff\1\22\1\20\5\uffff\1\15\1\uffff\3\23",
            "\1\30\16\uffff\1\31",
            "",
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "2676:1: (this_ParExpression_0= ruleParExpression | this_OperatorExpression_1= ruleOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression )";
        }
    }
    static final String DFA48_eotS =
        "\20\uffff";
    static final String DFA48_eofS =
        "\20\uffff";
    static final String DFA48_minS =
        "\1\26\1\63\1\107\5\63\1\107\1\73\1\77\2\63\1\22\2\uffff";
    static final String DFA48_maxS =
        "\1\111\1\102\1\107\5\73\1\107\1\73\1\77\1\73\1\102\1\111\2\uffff";
    static final String DFA48_acceptS =
        "\16\uffff\1\2\1\1";
    static final String DFA48_specialS =
        "\20\uffff}>";
    static final String[] DFA48_transitionS = {
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
            return "3453:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleQueryModule_in_entryRuleQueryModule73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryModule83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleQueryModule129 = new BitSet(new long[]{0x00000001000C4802L});
    public static final BitSet FOLLOW_ruleJPQLQuery_in_ruleQueryModule151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleImport235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJPQLQuery_in_entryRuleJPQLQuery291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJPQLQuery301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleJPQLQuery351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_ruleJPQLQuery381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_ruleJPQLQuery411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectStatement455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectFromClause_in_ruleSelectStatement501 = new BitSet(new long[]{0x0000000049002002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleSelectStatement522 = new BitSet(new long[]{0x0000000009002002L});
    public static final BitSet FOLLOW_ruleGroupClause_in_ruleSelectStatement544 = new BitSet(new long[]{0x0000000008002002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_ruleSelectStatement566 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleOrderClause_in_ruleSelectStatement588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupClause_in_entryRuleGroupClause624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupClause634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleGroupClause672 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleGroupClause684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleGroupItem_in_ruleGroupClause704 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleGroupClause718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleGroupItem_in_ruleGroupClause738 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupItem_in_entryRuleGroupItem775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupItem785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleGroupItem830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_entryRuleHavingClause864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingClause874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleHavingClause912 = new BitSet(new long[]{0x8008155000401000L,0x0000000000000388L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleHavingClause932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderClause_in_entryRuleOrderClause967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderClause977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleOrderClause1015 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleOrderClause1027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleOrderItem_in_ruleOrderClause1047 = new BitSet(new long[]{0x0000200080000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleOrderClause1061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleOrderItem_in_ruleOrderClause1081 = new BitSet(new long[]{0x0000200080000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleOrderClause1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleOrderClause1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderItem_in_entryRuleOrderItem1187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderItem1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleOrderItem1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement1276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateClause_in_ruleUpdateStatement1332 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ruleSetClause_in_ruleUpdateStatement1353 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleUpdateStatement1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateClause_in_entryRuleUpdateClause1410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateClause1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleUpdateClause1458 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleUpdateClause1478 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleUpdateClause1492 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleUpdateClause1512 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetClause_in_entryRuleSetClause1549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetClause1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleSetClause1597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_ruleSetClause1617 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSetClause1631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_ruleSetClause1651 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_entryRuleUpdateItem1688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateItem1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleUpdateItem1744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleUpdateItem1757 = new BitSet(new long[]{0x0000011000400000L,0x0000000000000388L});
    public static final BitSet FOLLOW_ruleValue_in_ruleUpdateItem1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement1812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteStatement1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteClause_in_ruleDeleteStatement1868 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleDeleteStatement1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteClause_in_entryRuleDeleteClause1925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteClause1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleDeleteClause1973 = new BitSet(new long[]{0x0000000100040000L});
    public static final BitSet FOLLOW_ruleFromClause_in_ruleDeleteClause1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectFromClause_in_entryRuleSelectFromClause2028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectFromClause2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_ruleSelectFromClause2084 = new BitSet(new long[]{0x0000000100040000L});
    public static final BitSet FOLLOW_ruleFromClause_in_ruleSelectFromClause2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_entryRuleSelectClause2141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectClause2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleSelectClause2189 = new BitSet(new long[]{0x0025C00000100100L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleSelectClause2207 = new BitSet(new long[]{0x0025C00000100100L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectClause2240 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSelectClause2254 = new BitSet(new long[]{0x0025C00000100100L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectClause2274 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression2311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectExpression2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectExpression2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAggregateExpression_in_ruleSelectExpression2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstructorExpression_in_ruleSelectExpression2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAggregateExpression_in_entryRuleSelectAggregateExpression2465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectAggregateExpression2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgAggregate_in_ruleSelectAggregateExpression2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxAggregate_in_ruleSelectAggregateExpression2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinAggregate_in_ruleSelectAggregateExpression2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumAggregate_in_ruleSelectAggregateExpression2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountAggregate_in_ruleSelectAggregateExpression2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgAggregate_in_entryRuleAvgAggregate2679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvgAggregate2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleAvgAggregate2727 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleAvgAggregate2739 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleAvgAggregate2757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleAvgAggregate2790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleAvgAggregate2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxAggregate_in_entryRuleMaxAggregate2837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxAggregate2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleMaxAggregate2885 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleMaxAggregate2897 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleMaxAggregate2915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleMaxAggregate2948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleMaxAggregate2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinAggregate_in_entryRuleMinAggregate2995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinAggregate3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleMinAggregate3043 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleMinAggregate3055 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleMinAggregate3073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleMinAggregate3106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleMinAggregate3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumAggregate_in_entryRuleSumAggregate3153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumAggregate3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleSumAggregate3201 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleSumAggregate3213 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleSumAggregate3231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSumAggregate3264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSumAggregate3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountAggregate_in_entryRuleCountAggregate3311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCountAggregate3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleCountAggregate3359 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleCountAggregate3371 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleCountAggregate3389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleCountAggregate3422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleCountAggregate3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstructorExpression_in_entryRuleSelectConstructorExpression3469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectConstructorExpression3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleSelectConstructorExpression3517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectConstructorExpression3533 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleSelectConstructorExpression3551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSelectConstructorExpression3585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSelectConstructorExpression3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClause_in_entryRuleFromClause3654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClause3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleFromClause3702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleFromClass_in_ruleFromClause3722 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleFromClause3736 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleFromClause3756 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromEntry_in_entryRuleFromEntry3793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromEntry3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClass_in_ruleFromEntry3853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromCollection_in_ruleFromEntry3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleVariableDeclaration3966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClass_in_entryRuleFromClass4024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClass4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassId_in_ruleFromClass4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassVar_in_ruleFromClass4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier4149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedIdentifier4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier4200 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleQualifiedIdentifier4219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier4234 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleFromClassId_in_entryRuleFromClassId4280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClassId4290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleFromClassId4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassVar_in_entryRuleFromClassVar4369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClassVar4379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleFromClassVar4425 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleFromClassVar4446 = new BitSet(new long[]{0x0000000602000002L});
    public static final BitSet FOLLOW_ruleFromJoin_in_ruleFromClassVar4467 = new BitSet(new long[]{0x0000000602000002L});
    public static final BitSet FOLLOW_ruleFromCollection_in_entryRuleFromCollection4503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromCollection4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleFromCollection4551 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleFromCollection4563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleFromCollection4583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleFromCollection4596 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleFromCollection4616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromJoin_in_entryRuleFromJoin4651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromJoin4661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_ruleFromJoin4711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftJoin_in_ruleFromJoin4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerJoin_in_ruleFromJoin4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_entryRuleJoin4805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoin4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleJoin4853 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleJoin4871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleJoin4904 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleJoin4925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftJoin_in_entryRuleLeftJoin4960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftJoin4970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleLeftJoin5008 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleLeftJoin5026 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleLeftJoin5051 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleLeftJoin5069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleLeftJoin5102 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleLeftJoin5123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerJoin_in_entryRuleInnerJoin5158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInnerJoin5168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleInnerJoin5206 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleInnerJoin5218 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleInnerJoin5236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleInnerJoin5269 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInnerJoin5290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_entryRuleWhereClause5325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereClause5335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleWhereClause5373 = new BitSet(new long[]{0x8008155000401000L,0x0000000000000388L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleWhereClause5393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression5428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression5438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression5488 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleOrExpression5514 = new BitSet(new long[]{0x8008155000401000L,0x0000000000000388L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression5534 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression5573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression5583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteExpression_in_ruleAndExpression5633 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleAndExpression5659 = new BitSet(new long[]{0x8008155000401000L,0x0000000000000388L});
    public static final BitSet FOLLOW_ruleConcreteExpression_in_ruleAndExpression5679 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleConcreteExpression_in_entryRuleConcreteExpression5718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcreteExpression5728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParExpression_in_ruleConcreteExpression5778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorExpression_in_ruleConcreteExpression5808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsExpression_in_ruleConcreteExpression5838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllExpression_in_ruleConcreteExpression5868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyExpression_in_ruleConcreteExpression5898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeExpression_in_ruleConcreteExpression5928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_ruleConcreteExpression5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullComparisonExpression_in_ruleConcreteExpression5988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyComparisonExpression_in_ruleConcreteExpression6018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikeExpression_in_ruleConcreteExpression6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpression_in_ruleConcreteExpression6078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBetweenExpression_in_ruleConcreteExpression6108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParExpression_in_entryRuleParExpression6142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParExpression6152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleParExpression6190 = new BitSet(new long[]{0x8000011000400000L,0x0000000000000388L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_ruleParExpression6214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleParExpression6226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorExpression_in_entryRuleOperatorExpression6260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorExpression6270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleOperatorExpression6316 = new BitSet(new long[]{0x01C0000000000000L,0x0000000000000070L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleOperatorExpression6337 = new BitSet(new long[]{0x8000011000400000L,0x0000000000000388L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_ruleOperatorExpression6358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsExpression_in_entryRuleExistsExpression6393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExistsExpression6403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleExistsExpression6447 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleExistsExpression6472 = new BitSet(new long[]{0x8000011000400000L,0x0000000000000388L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleExistsExpression6492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllExpression_in_entryRuleAllExpression6527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllExpression6537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleAllExpression6575 = new BitSet(new long[]{0x8000011000400000L,0x0000000000000388L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleAllExpression6595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyExpression_in_entryRuleAnyExpression6630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnyExpression6640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleAnyExpression6678 = new BitSet(new long[]{0x8000011000400000L,0x0000000000000388L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleAnyExpression6698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeExpression_in_entryRuleSomeExpression6733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSomeExpression6743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleSomeExpression6781 = new BitSet(new long[]{0x8000011000400000L,0x0000000000000388L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleSomeExpression6801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression6836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionExpression6846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCollectionExpression6892 = new BitSet(new long[]{0x0008000000020000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleCollectionExpression6911 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_KEYWORD_59_in_ruleCollectionExpression6936 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleCollectionExpression6949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleCollectionExpression6971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullComparisonExpression_in_entryRuleNullComparisonExpression7006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullComparisonExpression7016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNullComparisonExpression7062 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleNullComparisonExpression7075 = new BitSet(new long[]{0x0008001000000000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleNullComparisonExpression7093 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleNullComparisonExpression7118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyComparisonExpression_in_entryRuleEmptyComparisonExpression7152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmptyComparisonExpression7162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleEmptyComparisonExpression7208 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleEmptyComparisonExpression7221 = new BitSet(new long[]{0x0008000000200000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleEmptyComparisonExpression7239 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleEmptyComparisonExpression7264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikeExpression_in_entryRuleLikeExpression7298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLikeExpression7308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleLikeExpression7354 = new BitSet(new long[]{0x0008000800000000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleLikeExpression7373 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleLikeExpression7398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLikeExpression7414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpression_in_entryRuleInExpression7454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInExpression7464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInSeqExpression_in_ruleInExpression7514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInQueryExpression_in_ruleInExpression7544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInSeqExpression_in_entryRuleInSeqExpression7578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInSeqExpression7588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7634 = new BitSet(new long[]{0x0808000000000000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleInSeqExpression7653 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleInSeqExpression7678 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleInSeqExpression7690 = new BitSet(new long[]{0x0000011000400000L,0x0000000000000388L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleInSeqExpression7724 = new BitSet(new long[]{0x0000011000400000L,0x0000000000000388L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleInSeqExpression7759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInQueryExpression_in_entryRuleInQueryExpression7793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInQueryExpression7803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInQueryExpression7849 = new BitSet(new long[]{0x0808000000000000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleInQueryExpression7868 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleInQueryExpression7893 = new BitSet(new long[]{0x8000011000400000L,0x0000000000000388L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleInQueryExpression7913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBetweenExpression_in_entryRuleBetweenExpression7948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBetweenExpression7958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleBetweenExpression8004 = new BitSet(new long[]{0x0008000000000200L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleBetweenExpression8023 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleBetweenExpression8048 = new BitSet(new long[]{0x0000011000400000L,0x0000000000000388L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBetweenExpression8068 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleBetweenExpression8081 = new BitSet(new long[]{0x0000011000400000L,0x0000000000000388L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBetweenExpression8101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable8136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable8146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleVariable8196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_ruleVariable8226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleVariable8256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_entryRuleExpressionTerm8290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionTerm8300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleExpressionTerm8350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleExpressionTerm8380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_entryRuleAliasAttributeExpression8414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAliasAttributeExpression8424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8473 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleAliasAttributeExpression8487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8503 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_entryRuleParameterExpression8545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterExpression8555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleParameterExpression8593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterExpression8609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_entryRuleStringFunction8651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunction8661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunctionName_in_ruleStringFunction8707 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleStringFunction8720 = new BitSet(new long[]{0x0000011000400000L,0x0000000000000388L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunction8740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleStringFunction8754 = new BitSet(new long[]{0x0000011000400000L,0x0000000000000388L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunction8774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleStringFunction8788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunctionName_in_entryRuleStringFunctionName8823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunctionName8834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleStringFunctionName8872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_64_in_ruleStringFunctionName8891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleStringFunctionName8910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleStringFunctionName8929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleStringFunctionName8948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleStringFunctionName8967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFunction_in_entryRuleNumericFunction9006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericFunction9016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFunctionName_in_ruleNumericFunction9062 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleNumericFunction9075 = new BitSet(new long[]{0x0000011000400000L,0x0000000000000388L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNumericFunction9095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleNumericFunction9109 = new BitSet(new long[]{0x0000011000400000L,0x0000000000000388L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNumericFunction9129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleNumericFunction9143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFunctionName_in_entryRuleNumericFunctionName9178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericFunctionName9189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleNumericFunctionName9227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleNumericFunctionName9246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleNumericFunctionName9265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleNumericFunctionName9284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue9325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue9335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerExpression_in_ruleValue9385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_ruleValue9415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_ruleValue9445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleValue9475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerExpression_in_entryRuleIntegerExpression9509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerExpression9519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerExpression9560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_entryRuleStringExpression9599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringExpression9609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringExpression9650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_entryRuleNullExpression9689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullExpression9699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleNullExpression9742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression9787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression9797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleBooleanExpression9842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleBooleanExpression9870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_entryRuleQueryExpression9918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryExpression9928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleQueryExpression9966 = new BitSet(new long[]{0x0000000100040000L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleQueryExpression9990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleQueryExpression10002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleOperator10054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleOperator10076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleOperator10098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleOperator10120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleOperator10142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleOperator10164 = new BitSet(new long[]{0x0000000000000002L});

}