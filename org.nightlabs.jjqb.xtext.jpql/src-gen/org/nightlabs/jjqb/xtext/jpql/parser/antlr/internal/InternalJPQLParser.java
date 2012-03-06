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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_66", "KEYWORD_64", "KEYWORD_65", "KEYWORD_63", "KEYWORD_62", "KEYWORD_61", "KEYWORD_51", "KEYWORD_52", "KEYWORD_53", "KEYWORD_54", "KEYWORD_55", "KEYWORD_56", "KEYWORD_57", "KEYWORD_58", "KEYWORD_59", "KEYWORD_60", "KEYWORD_41", "KEYWORD_42", "KEYWORD_43", "KEYWORD_44", "KEYWORD_45", "KEYWORD_46", "KEYWORD_47", "KEYWORD_48", "KEYWORD_49", "KEYWORD_50", "KEYWORD_31", "KEYWORD_32", "KEYWORD_33", "KEYWORD_34", "KEYWORD_35", "KEYWORD_36", "KEYWORD_37", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "RULE_DATE_LITERAL", "RULE_TIME_LITERAL", "RULE_TIMESTAMP_LITERAL", "RULE_LITERALTEMPORAL", "RULE_DATE_STRING", "RULE_TIME_STRING", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=76;
    public static final int RULE_ANY_OTHER=82;
    public static final int KEYWORD_56=15;
    public static final int KEYWORD_19=41;
    public static final int KEYWORD_55=14;
    public static final int KEYWORD_54=13;
    public static final int KEYWORD_17=61;
    public static final int KEYWORD_18=40;
    public static final int KEYWORD_53=12;
    public static final int KEYWORD_52=11;
    public static final int KEYWORD_15=59;
    public static final int KEYWORD_51=10;
    public static final int KEYWORD_16=60;
    public static final int KEYWORD_50=29;
    public static final int KEYWORD_13=57;
    public static final int KEYWORD_14=58;
    public static final int KEYWORD_11=55;
    public static final int EOF=-1;
    public static final int KEYWORD_12=56;
    public static final int KEYWORD_10=54;
    public static final int KEYWORD_59=18;
    public static final int KEYWORD_58=17;
    public static final int KEYWORD_57=16;
    public static final int KEYWORD_6=67;
    public static final int KEYWORD_7=68;
    public static final int KEYWORD_8=69;
    public static final int KEYWORD_9=53;
    public static final int KEYWORD_28=50;
    public static final int KEYWORD_65=6;
    public static final int KEYWORD_29=51;
    public static final int KEYWORD_64=5;
    public static final int RULE_INT=77;
    public static final int KEYWORD_66=4;
    public static final int KEYWORD_24=46;
    public static final int KEYWORD_61=9;
    public static final int KEYWORD_25=47;
    public static final int KEYWORD_60=19;
    public static final int RULE_DATE_STRING=74;
    public static final int RULE_TIME_LITERAL=71;
    public static final int KEYWORD_26=48;
    public static final int KEYWORD_63=7;
    public static final int KEYWORD_62=8;
    public static final int KEYWORD_27=49;
    public static final int KEYWORD_20=42;
    public static final int KEYWORD_21=43;
    public static final int KEYWORD_22=44;
    public static final int KEYWORD_23=45;
    public static final int RULE_DATE_LITERAL=70;
    public static final int RULE_TIMESTAMP_LITERAL=72;
    public static final int RULE_LITERALTEMPORAL=73;
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
    public static final int RULE_SL_COMMENT=80;
    public static final int KEYWORD_36=35;
    public static final int KEYWORD_35=34;
    public static final int RULE_ML_COMMENT=79;
    public static final int KEYWORD_39=38;
    public static final int RULE_STRING=78;
    public static final int RULE_TIME_STRING=75;
    public static final int KEYWORD_41=20;
    public static final int KEYWORD_40=39;
    public static final int KEYWORD_43=22;
    public static final int KEYWORD_42=21;
    public static final int KEYWORD_45=24;
    public static final int KEYWORD_44=23;
    public static final int KEYWORD_47=26;
    public static final int RULE_WS=81;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:77:1: ruleQueryModule returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_defaultQuery_1_0= ruleJPQLQuery ) )? ( (lv_namedQueries_2_0= ruleNamedQuery ) )* ) ;
    public final EObject ruleQueryModule() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_defaultQuery_1_0 = null;

        EObject lv_namedQueries_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:80:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_defaultQuery_1_0= ruleJPQLQuery ) )? ( (lv_namedQueries_2_0= ruleNamedQuery ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_defaultQuery_1_0= ruleJPQLQuery ) )? ( (lv_namedQueries_2_0= ruleNamedQuery ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_defaultQuery_1_0= ruleJPQLQuery ) )? ( (lv_namedQueries_2_0= ruleNamedQuery ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:81:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_defaultQuery_1_0= ruleJPQLQuery ) )? ( (lv_namedQueries_2_0= ruleNamedQuery ) )*
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:81:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==KEYWORD_55) ) {
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

            if ( (LA2_0==KEYWORD_52||(LA2_0>=KEYWORD_59 && LA2_0<=KEYWORD_60)||LA2_0==KEYWORD_32) ) {
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:117:3: ( (lv_namedQueries_2_0= ruleNamedQuery ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:118:1: (lv_namedQueries_2_0= ruleNamedQuery )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:118:1: (lv_namedQueries_2_0= ruleNamedQuery )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:119:3: lv_namedQueries_2_0= ruleNamedQuery
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQueryModuleAccess().getNamedQueriesNamedQueryParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNamedQuery_in_ruleQueryModule173);
            	    lv_namedQueries_2_0=ruleNamedQuery();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQueryModuleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"namedQueries",
            	              		lv_namedQueries_2_0, 
            	              		"NamedQuery");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleQueryModule"


    // $ANTLR start "entryRuleImport"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:143:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:144:2: (iv_ruleImport= ruleImport EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:145:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport209);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport219); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:152:1: ruleImport returns [EObject current=null] : (otherlv_0= KEYWORD_55 ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:155:28: ( (otherlv_0= KEYWORD_55 ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:156:1: (otherlv_0= KEYWORD_55 ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:156:1: (otherlv_0= KEYWORD_55 ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:157:2: otherlv_0= KEYWORD_55 ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleImport257); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getIMPORTKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:161:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:162:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:162:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:163:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport273); if (state.failed) return current;
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


    // $ANTLR start "entryRuleNamedQuery"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:187:1: entryRuleNamedQuery returns [EObject current=null] : iv_ruleNamedQuery= ruleNamedQuery EOF ;
    public final EObject entryRuleNamedQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedQuery = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:188:2: (iv_ruleNamedQuery= ruleNamedQuery EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:189:2: iv_ruleNamedQuery= ruleNamedQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamedQueryRule()); 
            }
            pushFollow(FOLLOW_ruleNamedQuery_in_entryRuleNamedQuery313);
            iv_ruleNamedQuery=ruleNamedQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamedQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedQuery323); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedQuery"


    // $ANTLR start "ruleNamedQuery"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:196:1: ruleNamedQuery returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= KEYWORD_5 ( (lv_query_2_0= ruleJPQLQuery ) ) ) ;
    public final EObject ruleNamedQuery() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_query_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:199:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= KEYWORD_5 ( (lv_query_2_0= ruleJPQLQuery ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:200:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= KEYWORD_5 ( (lv_query_2_0= ruleJPQLQuery ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:200:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= KEYWORD_5 ( (lv_query_2_0= ruleJPQLQuery ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:200:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= KEYWORD_5 ( (lv_query_2_0= ruleJPQLQuery ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:200:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:201:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:201:1: (lv_name_0_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:202:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedQuery365); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getNamedQueryAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNamedQueryRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleNamedQuery383); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNamedQueryAccess().getColonKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:223:1: ( (lv_query_2_0= ruleJPQLQuery ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:224:1: (lv_query_2_0= ruleJPQLQuery )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:224:1: (lv_query_2_0= ruleJPQLQuery )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:225:3: lv_query_2_0= ruleJPQLQuery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNamedQueryAccess().getQueryJPQLQueryParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJPQLQuery_in_ruleNamedQuery403);
            lv_query_2_0=ruleJPQLQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNamedQueryRule());
              	        }
                     		set(
                     			current, 
                     			"query",
                      		lv_query_2_0, 
                      		"JPQLQuery");
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
    // $ANTLR end "ruleNamedQuery"


    // $ANTLR start "entryRuleJPQLQuery"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:249:1: entryRuleJPQLQuery returns [EObject current=null] : iv_ruleJPQLQuery= ruleJPQLQuery EOF ;
    public final EObject entryRuleJPQLQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJPQLQuery = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:250:2: (iv_ruleJPQLQuery= ruleJPQLQuery EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:251:2: iv_ruleJPQLQuery= ruleJPQLQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJPQLQueryRule()); 
            }
            pushFollow(FOLLOW_ruleJPQLQuery_in_entryRuleJPQLQuery438);
            iv_ruleJPQLQuery=ruleJPQLQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJPQLQuery; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJPQLQuery448); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:258:1: ruleJPQLQuery returns [EObject current=null] : (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement ) ;
    public final EObject ruleJPQLQuery() throws RecognitionException {
        EObject current = null;

        EObject this_SelectStatement_0 = null;

        EObject this_UpdateStatement_1 = null;

        EObject this_DeleteStatement_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:261:28: ( (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:262:1: (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:262:1: (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement )
            int alt4=3;
            switch ( input.LA(1) ) {
            case KEYWORD_59:
            case KEYWORD_32:
                {
                alt4=1;
                }
                break;
            case KEYWORD_60:
                {
                alt4=2;
                }
                break;
            case KEYWORD_52:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:263:2: this_SelectStatement_0= ruleSelectStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJPQLQueryAccess().getSelectStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleJPQLQuery498);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:276:2: this_UpdateStatement_1= ruleUpdateStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJPQLQueryAccess().getUpdateStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUpdateStatement_in_ruleJPQLQuery528);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:289:2: this_DeleteStatement_2= ruleDeleteStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJPQLQueryAccess().getDeleteStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeleteStatement_in_ruleJPQLQuery558);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:308:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:309:2: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:310:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement592);
            iv_ruleSelectStatement=ruleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectStatement602); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:317:1: ruleSelectStatement returns [EObject current=null] : ( ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_having_2_0= ruleHavingClause ) )? ( (lv_order_3_0= ruleOrderClause ) )? ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_selectFromClause_0_0 = null;

        EObject lv_whereClause_1_0 = null;

        EObject lv_having_2_0 = null;

        EObject lv_order_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:320:28: ( ( ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_having_2_0= ruleHavingClause ) )? ( (lv_order_3_0= ruleOrderClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:321:1: ( ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_having_2_0= ruleHavingClause ) )? ( (lv_order_3_0= ruleOrderClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:321:1: ( ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_having_2_0= ruleHavingClause ) )? ( (lv_order_3_0= ruleOrderClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:321:2: ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_having_2_0= ruleHavingClause ) )? ( (lv_order_3_0= ruleOrderClause ) )?
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:321:2: ( (lv_selectFromClause_0_0= ruleSelectFromClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:322:1: (lv_selectFromClause_0_0= ruleSelectFromClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:322:1: (lv_selectFromClause_0_0= ruleSelectFromClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:323:3: lv_selectFromClause_0_0= ruleSelectFromClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectStatementAccess().getSelectFromClauseSelectFromClauseParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectFromClause_in_ruleSelectStatement648);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:339:2: ( (lv_whereClause_1_0= ruleWhereClause ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==KEYWORD_50) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:340:1: (lv_whereClause_1_0= ruleWhereClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:340:1: (lv_whereClause_1_0= ruleWhereClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:341:3: lv_whereClause_1_0= ruleWhereClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getWhereClauseWhereClauseParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleSelectStatement669);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:357:3: ( (lv_having_2_0= ruleHavingClause ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==KEYWORD_54) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:358:1: (lv_having_2_0= ruleHavingClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:358:1: (lv_having_2_0= ruleHavingClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:359:3: lv_having_2_0= ruleHavingClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getHavingHavingClauseParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHavingClause_in_ruleSelectStatement691);
                    lv_having_2_0=ruleHavingClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"having",
                              		lv_having_2_0, 
                              		"HavingClause");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:375:3: ( (lv_order_3_0= ruleOrderClause ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KEYWORD_47) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:376:1: (lv_order_3_0= ruleOrderClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:376:1: (lv_order_3_0= ruleOrderClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:377:3: lv_order_3_0= ruleOrderClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectStatementAccess().getOrderOrderClauseParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOrderClause_in_ruleSelectStatement713);
                    lv_order_3_0=ruleOrderClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"order",
                              		lv_order_3_0, 
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


    // $ANTLR start "entryRuleHavingClause"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:401:1: entryRuleHavingClause returns [EObject current=null] : iv_ruleHavingClause= ruleHavingClause EOF ;
    public final EObject entryRuleHavingClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHavingClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:402:2: (iv_ruleHavingClause= ruleHavingClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:403:2: iv_ruleHavingClause= ruleHavingClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHavingClauseRule()); 
            }
            pushFollow(FOLLOW_ruleHavingClause_in_entryRuleHavingClause749);
            iv_ruleHavingClause=ruleHavingClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHavingClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHavingClause759); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:410:1: ruleHavingClause returns [EObject current=null] : (otherlv_0= KEYWORD_54 ( (lv_having_1_0= ruleOrExpression ) ) ) ;
    public final EObject ruleHavingClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_having_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:413:28: ( (otherlv_0= KEYWORD_54 ( (lv_having_1_0= ruleOrExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:414:1: (otherlv_0= KEYWORD_54 ( (lv_having_1_0= ruleOrExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:414:1: (otherlv_0= KEYWORD_54 ( (lv_having_1_0= ruleOrExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:415:2: otherlv_0= KEYWORD_54 ( (lv_having_1_0= ruleOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleHavingClause797); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getHavingClauseAccess().getHAVINGKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:419:1: ( (lv_having_1_0= ruleOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:420:1: (lv_having_1_0= ruleOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:420:1: (lv_having_1_0= ruleOrExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:421:3: lv_having_1_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHavingClauseAccess().getHavingOrExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleHavingClause817);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:445:1: entryRuleOrderClause returns [EObject current=null] : iv_ruleOrderClause= ruleOrderClause EOF ;
    public final EObject entryRuleOrderClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:446:2: (iv_ruleOrderClause= ruleOrderClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:447:2: iv_ruleOrderClause= ruleOrderClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderClauseRule()); 
            }
            pushFollow(FOLLOW_ruleOrderClause_in_entryRuleOrderClause852);
            iv_ruleOrderClause=ruleOrderClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderClause862); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:454:1: ruleOrderClause returns [EObject current=null] : (otherlv_0= KEYWORD_47 otherlv_1= KEYWORD_13 ( (lv_ordering_2_0= ruleOrderItem ) ) (otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= KEYWORD_22 ) ) | ( (lv_isDesc_6_0= KEYWORD_31 ) ) )? ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:457:28: ( (otherlv_0= KEYWORD_47 otherlv_1= KEYWORD_13 ( (lv_ordering_2_0= ruleOrderItem ) ) (otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= KEYWORD_22 ) ) | ( (lv_isDesc_6_0= KEYWORD_31 ) ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:458:1: (otherlv_0= KEYWORD_47 otherlv_1= KEYWORD_13 ( (lv_ordering_2_0= ruleOrderItem ) ) (otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= KEYWORD_22 ) ) | ( (lv_isDesc_6_0= KEYWORD_31 ) ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:458:1: (otherlv_0= KEYWORD_47 otherlv_1= KEYWORD_13 ( (lv_ordering_2_0= ruleOrderItem ) ) (otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= KEYWORD_22 ) ) | ( (lv_isDesc_6_0= KEYWORD_31 ) ) )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:459:2: otherlv_0= KEYWORD_47 otherlv_1= KEYWORD_13 ( (lv_ordering_2_0= ruleOrderItem ) ) (otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= KEYWORD_22 ) ) | ( (lv_isDesc_6_0= KEYWORD_31 ) ) )?
            {
            otherlv_0=(Token)match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleOrderClause900); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOrderClauseAccess().getORDERKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleOrderClause912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOrderClauseAccess().getBYKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:468:1: ( (lv_ordering_2_0= ruleOrderItem ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:469:1: (lv_ordering_2_0= ruleOrderItem )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:469:1: (lv_ordering_2_0= ruleOrderItem )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:470:3: lv_ordering_2_0= ruleOrderItem
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrderClauseAccess().getOrderingOrderItemParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrderItem_in_ruleOrderClause932);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:486:2: (otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==KEYWORD_3) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:487:2: otherlv_3= KEYWORD_3 ( (lv_ordering_4_0= ruleOrderItem ) )
            	    {
            	    otherlv_3=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleOrderClause946); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getOrderClauseAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:491:1: ( (lv_ordering_4_0= ruleOrderItem ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:492:1: (lv_ordering_4_0= ruleOrderItem )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:492:1: (lv_ordering_4_0= ruleOrderItem )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:493:3: lv_ordering_4_0= ruleOrderItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrderClauseAccess().getOrderingOrderItemParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrderItem_in_ruleOrderClause966);
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
            	    break loop8;
                }
            } while (true);

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:509:4: ( ( (lv_isAsc_5_0= KEYWORD_22 ) ) | ( (lv_isDesc_6_0= KEYWORD_31 ) ) )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KEYWORD_22) ) {
                alt9=1;
            }
            else if ( (LA9_0==KEYWORD_31) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:509:5: ( (lv_isAsc_5_0= KEYWORD_22 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:509:5: ( (lv_isAsc_5_0= KEYWORD_22 ) )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:510:1: (lv_isAsc_5_0= KEYWORD_22 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:510:1: (lv_isAsc_5_0= KEYWORD_22 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:511:3: lv_isAsc_5_0= KEYWORD_22
                    {
                    lv_isAsc_5_0=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleOrderClause988); if (state.failed) return current;
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:526:6: ( (lv_isDesc_6_0= KEYWORD_31 ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:526:6: ( (lv_isDesc_6_0= KEYWORD_31 ) )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:527:1: (lv_isDesc_6_0= KEYWORD_31 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:527:1: (lv_isDesc_6_0= KEYWORD_31 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:528:3: lv_isDesc_6_0= KEYWORD_31
                    {
                    lv_isDesc_6_0=(Token)match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleOrderClause1024); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:550:1: entryRuleOrderItem returns [EObject current=null] : iv_ruleOrderItem= ruleOrderItem EOF ;
    public final EObject entryRuleOrderItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderItem = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:551:2: (iv_ruleOrderItem= ruleOrderItem EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:552:2: iv_ruleOrderItem= ruleOrderItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrderItemRule()); 
            }
            pushFollow(FOLLOW_ruleOrderItem_in_entryRuleOrderItem1072);
            iv_ruleOrderItem=ruleOrderItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrderItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderItem1082); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:559:1: ruleOrderItem returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= KEYWORD_4 ( (lv_feature_2_0= RULE_ID ) ) ) ;
    public final EObject ruleOrderItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_feature_2_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:562:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= KEYWORD_4 ( (lv_feature_2_0= RULE_ID ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:563:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= KEYWORD_4 ( (lv_feature_2_0= RULE_ID ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:563:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= KEYWORD_4 ( (lv_feature_2_0= RULE_ID ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:563:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= KEYWORD_4 ( (lv_feature_2_0= RULE_ID ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:563:2: ( (otherlv_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:564:1: (otherlv_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:564:1: (otherlv_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:565:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOrderItemRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrderItem1131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getOrderItemAccess().getVarFromEntryCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleOrderItem1144); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOrderItemAccess().getFullStopKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:584:1: ( (lv_feature_2_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:585:1: (lv_feature_2_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:585:1: (lv_feature_2_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:586:3: lv_feature_2_0= RULE_ID
            {
            lv_feature_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrderItem1160); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_feature_2_0, grammarAccess.getOrderItemAccess().getFeatureIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOrderItemRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"feature",
                      		lv_feature_2_0, 
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
    // $ANTLR end "ruleOrderItem"


    // $ANTLR start "entryRuleUpdateStatement"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:610:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:611:2: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:612:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateStatementRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement1200);
            iv_ruleUpdateStatement=ruleUpdateStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement1210); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:619:1: ruleUpdateStatement returns [EObject current=null] : ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ) ;
    public final EObject ruleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_updateClause_0_0 = null;

        EObject lv_setClause_1_0 = null;

        EObject lv_whereClause_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:622:28: ( ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:623:1: ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:623:1: ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:623:2: ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )?
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:623:2: ( (lv_updateClause_0_0= ruleUpdateClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:624:1: (lv_updateClause_0_0= ruleUpdateClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:624:1: (lv_updateClause_0_0= ruleUpdateClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:625:3: lv_updateClause_0_0= ruleUpdateClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateClauseUpdateClauseParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUpdateClause_in_ruleUpdateStatement1256);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:641:2: ( (lv_setClause_1_0= ruleSetClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:642:1: (lv_setClause_1_0= ruleSetClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:642:1: (lv_setClause_1_0= ruleSetClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:643:3: lv_setClause_1_0= ruleSetClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getSetClauseSetClauseParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSetClause_in_ruleUpdateStatement1277);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:659:2: ( (lv_whereClause_2_0= ruleWhereClause ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==KEYWORD_50) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:660:1: (lv_whereClause_2_0= ruleWhereClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:660:1: (lv_whereClause_2_0= ruleWhereClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:661:3: lv_whereClause_2_0= ruleWhereClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getWhereClauseWhereClauseParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleUpdateStatement1298);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:685:1: entryRuleUpdateClause returns [EObject current=null] : iv_ruleUpdateClause= ruleUpdateClause EOF ;
    public final EObject entryRuleUpdateClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:686:2: (iv_ruleUpdateClause= ruleUpdateClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:687:2: iv_ruleUpdateClause= ruleUpdateClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateClauseRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateClause_in_entryRuleUpdateClause1334);
            iv_ruleUpdateClause=ruleUpdateClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateClause1344); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:694:1: ruleUpdateClause returns [EObject current=null] : (otherlv_0= KEYWORD_60 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) ;
    public final EObject ruleUpdateClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_fromEntries_1_0 = null;

        EObject lv_fromEntries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:697:28: ( (otherlv_0= KEYWORD_60 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:698:1: (otherlv_0= KEYWORD_60 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:698:1: (otherlv_0= KEYWORD_60 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:699:2: otherlv_0= KEYWORD_60 ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleUpdateClause1382); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUpdateClauseAccess().getUPDATEKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:703:1: ( (lv_fromEntries_1_0= ruleFromEntry ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:704:1: (lv_fromEntries_1_0= ruleFromEntry )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:704:1: (lv_fromEntries_1_0= ruleFromEntry )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:705:3: lv_fromEntries_1_0= ruleFromEntry
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateClauseAccess().getFromEntriesFromEntryParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFromEntry_in_ruleUpdateClause1402);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:721:2: (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==KEYWORD_3) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:722:2: otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleUpdateClause1416); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getUpdateClauseAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:726:1: ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:727:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:727:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:728:3: lv_fromEntries_3_0= ruleFromEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUpdateClauseAccess().getFromEntriesFromEntryParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFromEntry_in_ruleUpdateClause1436);
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
    // $ANTLR end "ruleUpdateClause"


    // $ANTLR start "entryRuleSetClause"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:752:1: entryRuleSetClause returns [EObject current=null] : iv_ruleSetClause= ruleSetClause EOF ;
    public final EObject entryRuleSetClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:753:2: (iv_ruleSetClause= ruleSetClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:754:2: iv_ruleSetClause= ruleSetClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSetClauseRule()); 
            }
            pushFollow(FOLLOW_ruleSetClause_in_entryRuleSetClause1473);
            iv_ruleSetClause=ruleSetClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSetClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetClause1483); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:761:1: ruleSetClause returns [EObject current=null] : (otherlv_0= KEYWORD_29 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )* ) ;
    public final EObject ruleSetClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:764:28: ( (otherlv_0= KEYWORD_29 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:765:1: (otherlv_0= KEYWORD_29 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:765:1: (otherlv_0= KEYWORD_29 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:766:2: otherlv_0= KEYWORD_29 ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleSetClause1521); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSetClauseAccess().getSETKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:770:1: ( (lv_items_1_0= ruleUpdateItem ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:771:1: (lv_items_1_0= ruleUpdateItem )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:771:1: (lv_items_1_0= ruleUpdateItem )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:772:3: lv_items_1_0= ruleUpdateItem
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSetClauseAccess().getItemsUpdateItemParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUpdateItem_in_ruleSetClause1541);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:788:2: (otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==KEYWORD_3) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:789:2: otherlv_2= KEYWORD_3 ( (lv_items_3_0= ruleUpdateItem ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleSetClause1555); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSetClauseAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:793:1: ( (lv_items_3_0= ruleUpdateItem ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:794:1: (lv_items_3_0= ruleUpdateItem )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:794:1: (lv_items_3_0= ruleUpdateItem )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:795:3: lv_items_3_0= ruleUpdateItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSetClauseAccess().getItemsUpdateItemParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUpdateItem_in_ruleSetClause1575);
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
    // $ANTLR end "ruleSetClause"


    // $ANTLR start "entryRuleUpdateItem"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:819:1: entryRuleUpdateItem returns [EObject current=null] : iv_ruleUpdateItem= ruleUpdateItem EOF ;
    public final EObject entryRuleUpdateItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateItem = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:820:2: (iv_ruleUpdateItem= ruleUpdateItem EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:821:2: iv_ruleUpdateItem= ruleUpdateItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateItemRule()); 
            }
            pushFollow(FOLLOW_ruleUpdateItem_in_entryRuleUpdateItem1612);
            iv_ruleUpdateItem=ruleUpdateItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateItem1622); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:828:1: ruleUpdateItem returns [EObject current=null] : ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_7 ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleUpdateItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_alias_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:831:28: ( ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_7 ( (lv_value_2_0= ruleValue ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:832:1: ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_7 ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:832:1: ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_7 ( (lv_value_2_0= ruleValue ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:832:2: ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= KEYWORD_7 ( (lv_value_2_0= ruleValue ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:832:2: ( (lv_alias_0_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:833:1: (lv_alias_0_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:833:1: (lv_alias_0_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:834:3: lv_alias_0_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateItemAccess().getAliasAliasAttributeExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleUpdateItem1668);
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

            otherlv_1=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleUpdateItem1681); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUpdateItemAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:855:1: ( (lv_value_2_0= ruleValue ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:856:1: (lv_value_2_0= ruleValue )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:856:1: (lv_value_2_0= ruleValue )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:857:3: lv_value_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateItemAccess().getValueValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleUpdateItem1701);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:881:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:882:2: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:883:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement1736);
            iv_ruleDeleteStatement=ruleDeleteStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteStatement1746); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:890:1: ruleDeleteStatement returns [EObject current=null] : ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_deleteClause_0_0 = null;

        EObject lv_whereClause_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:893:28: ( ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:894:1: ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:894:1: ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:894:2: ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )?
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:894:2: ( (lv_deleteClause_0_0= ruleDeleteClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:895:1: (lv_deleteClause_0_0= ruleDeleteClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:895:1: (lv_deleteClause_0_0= ruleDeleteClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:896:3: lv_deleteClause_0_0= ruleDeleteClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeleteStatementAccess().getDeleteClauseDeleteClauseParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDeleteClause_in_ruleDeleteStatement1792);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:912:2: ( (lv_whereClause_1_0= ruleWhereClause ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==KEYWORD_50) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:913:1: (lv_whereClause_1_0= ruleWhereClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:913:1: (lv_whereClause_1_0= ruleWhereClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:914:3: lv_whereClause_1_0= ruleWhereClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeleteStatementAccess().getWhereClauseWhereClauseParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleDeleteStatement1813);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:938:1: entryRuleDeleteClause returns [EObject current=null] : iv_ruleDeleteClause= ruleDeleteClause EOF ;
    public final EObject entryRuleDeleteClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:939:2: (iv_ruleDeleteClause= ruleDeleteClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:940:2: iv_ruleDeleteClause= ruleDeleteClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteClauseRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteClause_in_entryRuleDeleteClause1849);
            iv_ruleDeleteClause=ruleDeleteClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteClause1859); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:947:1: ruleDeleteClause returns [EObject current=null] : (otherlv_0= KEYWORD_52 ( (lv_fromClause_1_0= ruleFromClause ) ) ) ;
    public final EObject ruleDeleteClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_fromClause_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:950:28: ( (otherlv_0= KEYWORD_52 ( (lv_fromClause_1_0= ruleFromClause ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:951:1: (otherlv_0= KEYWORD_52 ( (lv_fromClause_1_0= ruleFromClause ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:951:1: (otherlv_0= KEYWORD_52 ( (lv_fromClause_1_0= ruleFromClause ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:952:2: otherlv_0= KEYWORD_52 ( (lv_fromClause_1_0= ruleFromClause ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleDeleteClause1897); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDeleteClauseAccess().getDELETEKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:956:1: ( (lv_fromClause_1_0= ruleFromClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:957:1: (lv_fromClause_1_0= ruleFromClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:957:1: (lv_fromClause_1_0= ruleFromClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:958:3: lv_fromClause_1_0= ruleFromClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeleteClauseAccess().getFromClauseFromClauseParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFromClause_in_ruleDeleteClause1917);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:982:1: entryRuleSelectFromClause returns [EObject current=null] : iv_ruleSelectFromClause= ruleSelectFromClause EOF ;
    public final EObject entryRuleSelectFromClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectFromClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:983:2: (iv_ruleSelectFromClause= ruleSelectFromClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:984:2: iv_ruleSelectFromClause= ruleSelectFromClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectFromClauseRule()); 
            }
            pushFollow(FOLLOW_ruleSelectFromClause_in_entryRuleSelectFromClause1952);
            iv_ruleSelectFromClause=ruleSelectFromClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectFromClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectFromClause1962); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:991:1: ruleSelectFromClause returns [EObject current=null] : ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) ) ;
    public final EObject ruleSelectFromClause() throws RecognitionException {
        EObject current = null;

        EObject lv_selectClause_0_0 = null;

        EObject lv_fromClause_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:994:28: ( ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:995:1: ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:995:1: ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:995:2: ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:995:2: ( (lv_selectClause_0_0= ruleSelectClause ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KEYWORD_59) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:996:1: (lv_selectClause_0_0= ruleSelectClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:996:1: (lv_selectClause_0_0= ruleSelectClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:997:3: lv_selectClause_0_0= ruleSelectClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectFromClauseAccess().getSelectClauseSelectClauseParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectClause_in_ruleSelectFromClause2008);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1013:3: ( (lv_fromClause_1_0= ruleFromClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1014:1: (lv_fromClause_1_0= ruleFromClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1014:1: (lv_fromClause_1_0= ruleFromClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1015:3: lv_fromClause_1_0= ruleFromClause
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectFromClauseAccess().getFromClauseFromClauseParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFromClause_in_ruleSelectFromClause2030);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1039:1: entryRuleSelectClause returns [EObject current=null] : iv_ruleSelectClause= ruleSelectClause EOF ;
    public final EObject entryRuleSelectClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1040:2: (iv_ruleSelectClause= ruleSelectClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1041:2: iv_ruleSelectClause= ruleSelectClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectClauseRule()); 
            }
            pushFollow(FOLLOW_ruleSelectClause_in_entryRuleSelectClause2065);
            iv_ruleSelectClause=ruleSelectClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectClause2075); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1048:1: ruleSelectClause returns [EObject current=null] : (otherlv_0= KEYWORD_59 ( (lv_isDistinct_1_0= KEYWORD_62 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* ) ;
    public final EObject ruleSelectClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isDistinct_1_0=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1051:28: ( (otherlv_0= KEYWORD_59 ( (lv_isDistinct_1_0= KEYWORD_62 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1052:1: (otherlv_0= KEYWORD_59 ( (lv_isDistinct_1_0= KEYWORD_62 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1052:1: (otherlv_0= KEYWORD_59 ( (lv_isDistinct_1_0= KEYWORD_62 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1053:2: otherlv_0= KEYWORD_59 ( (lv_isDistinct_1_0= KEYWORD_62 ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_ruleSelectClause2113); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSelectClauseAccess().getSELECTKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1057:1: ( (lv_isDistinct_1_0= KEYWORD_62 ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KEYWORD_62) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1058:1: (lv_isDistinct_1_0= KEYWORD_62 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1058:1: (lv_isDistinct_1_0= KEYWORD_62 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1059:3: lv_isDistinct_1_0= KEYWORD_62
                    {
                    lv_isDistinct_1_0=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleSelectClause2131); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1073:3: ( (lv_expressions_2_0= ruleSelectExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1074:1: (lv_expressions_2_0= ruleSelectExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1074:1: (lv_expressions_2_0= ruleSelectExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1075:3: lv_expressions_2_0= ruleSelectExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectClauseAccess().getExpressionsSelectExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectClause2164);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1091:2: (otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==KEYWORD_3) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1092:2: otherlv_3= KEYWORD_3 ( (lv_expressions_4_0= ruleSelectExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleSelectClause2178); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getSelectClauseAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1096:1: ( (lv_expressions_4_0= ruleSelectExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1097:1: (lv_expressions_4_0= ruleSelectExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1097:1: (lv_expressions_4_0= ruleSelectExpression )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1098:3: lv_expressions_4_0= ruleSelectExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectClauseAccess().getExpressionsSelectExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectClause2198);
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
            	    break loop16;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1122:1: entryRuleSelectExpression returns [EObject current=null] : iv_ruleSelectExpression= ruleSelectExpression EOF ;
    public final EObject entryRuleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1123:2: (iv_ruleSelectExpression= ruleSelectExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1124:2: iv_ruleSelectExpression= ruleSelectExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression2235);
            iv_ruleSelectExpression=ruleSelectExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectExpression2245); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1131:1: ruleSelectExpression returns [EObject current=null] : (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression ) ;
    public final EObject ruleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AliasAttributeExpression_0 = null;

        EObject this_SelectAggregateExpression_1 = null;

        EObject this_SelectConstructorExpression_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1134:28: ( (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1135:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1135:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt17=1;
                }
                break;
            case KEYWORD_41:
            case KEYWORD_23:
            case KEYWORD_24:
            case KEYWORD_25:
            case KEYWORD_30:
                {
                alt17=2;
                }
                break;
            case KEYWORD_27:
                {
                alt17=3;
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1136:2: this_AliasAttributeExpression_0= ruleAliasAttributeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectExpressionAccess().getAliasAttributeExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSelectExpression2295);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1149:2: this_SelectAggregateExpression_1= ruleSelectAggregateExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectExpressionAccess().getSelectAggregateExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectAggregateExpression_in_ruleSelectExpression2325);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1162:2: this_SelectConstructorExpression_2= ruleSelectConstructorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectExpressionAccess().getSelectConstructorExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectConstructorExpression_in_ruleSelectExpression2355);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1181:1: entryRuleSelectAggregateExpression returns [EObject current=null] : iv_ruleSelectAggregateExpression= ruleSelectAggregateExpression EOF ;
    public final EObject entryRuleSelectAggregateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectAggregateExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1182:2: (iv_ruleSelectAggregateExpression= ruleSelectAggregateExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1183:2: iv_ruleSelectAggregateExpression= ruleSelectAggregateExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectAggregateExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectAggregateExpression_in_entryRuleSelectAggregateExpression2389);
            iv_ruleSelectAggregateExpression=ruleSelectAggregateExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectAggregateExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectAggregateExpression2399); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1190:1: ruleSelectAggregateExpression returns [EObject current=null] : (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate ) ;
    public final EObject ruleSelectAggregateExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AvgAggregate_0 = null;

        EObject this_MaxAggregate_1 = null;

        EObject this_MinAggregate_2 = null;

        EObject this_SumAggregate_3 = null;

        EObject this_CountAggregate_4 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1193:28: ( (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1194:1: (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1194:1: (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate )
            int alt18=5;
            switch ( input.LA(1) ) {
            case KEYWORD_23:
                {
                alt18=1;
                }
                break;
            case KEYWORD_24:
                {
                alt18=2;
                }
                break;
            case KEYWORD_25:
                {
                alt18=3;
                }
                break;
            case KEYWORD_30:
                {
                alt18=4;
                }
                break;
            case KEYWORD_41:
                {
                alt18=5;
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1195:2: this_AvgAggregate_0= ruleAvgAggregate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getAvgAggregateParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAvgAggregate_in_ruleSelectAggregateExpression2449);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1208:2: this_MaxAggregate_1= ruleMaxAggregate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getMaxAggregateParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMaxAggregate_in_ruleSelectAggregateExpression2479);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1221:2: this_MinAggregate_2= ruleMinAggregate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getMinAggregateParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMinAggregate_in_ruleSelectAggregateExpression2509);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1234:2: this_SumAggregate_3= ruleSumAggregate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getSumAggregateParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSumAggregate_in_ruleSelectAggregateExpression2539);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1247:2: this_CountAggregate_4= ruleCountAggregate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getCountAggregateParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCountAggregate_in_ruleSelectAggregateExpression2569);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1266:1: entryRuleAvgAggregate returns [EObject current=null] : iv_ruleAvgAggregate= ruleAvgAggregate EOF ;
    public final EObject entryRuleAvgAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvgAggregate = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1267:2: (iv_ruleAvgAggregate= ruleAvgAggregate EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1268:2: iv_ruleAvgAggregate= ruleAvgAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAvgAggregateRule()); 
            }
            pushFollow(FOLLOW_ruleAvgAggregate_in_entryRuleAvgAggregate2603);
            iv_ruleAvgAggregate=ruleAvgAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAvgAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvgAggregate2613); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1275:1: ruleAvgAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_23 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleAvgAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1278:28: ( (otherlv_0= KEYWORD_23 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1279:1: (otherlv_0= KEYWORD_23 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1279:1: (otherlv_0= KEYWORD_23 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1280:2: otherlv_0= KEYWORD_23 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleAvgAggregate2651); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAvgAggregateAccess().getAVGKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleAvgAggregate2663); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAvgAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1289:1: ( (lv_isDistinct_2_0= KEYWORD_62 ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KEYWORD_62) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1290:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1290:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1291:3: lv_isDistinct_2_0= KEYWORD_62
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleAvgAggregate2681); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1305:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1306:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1306:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1307:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAvgAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleAvgAggregate2714);
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

            otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleAvgAggregate2727); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1336:1: entryRuleMaxAggregate returns [EObject current=null] : iv_ruleMaxAggregate= ruleMaxAggregate EOF ;
    public final EObject entryRuleMaxAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxAggregate = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1337:2: (iv_ruleMaxAggregate= ruleMaxAggregate EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1338:2: iv_ruleMaxAggregate= ruleMaxAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaxAggregateRule()); 
            }
            pushFollow(FOLLOW_ruleMaxAggregate_in_entryRuleMaxAggregate2761);
            iv_ruleMaxAggregate=ruleMaxAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaxAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxAggregate2771); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1345:1: ruleMaxAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_24 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleMaxAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1348:28: ( (otherlv_0= KEYWORD_24 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1349:1: (otherlv_0= KEYWORD_24 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1349:1: (otherlv_0= KEYWORD_24 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1350:2: otherlv_0= KEYWORD_24 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleMaxAggregate2809); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMaxAggregateAccess().getMAXKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleMaxAggregate2821); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMaxAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1359:1: ( (lv_isDistinct_2_0= KEYWORD_62 ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KEYWORD_62) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1360:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1360:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1361:3: lv_isDistinct_2_0= KEYWORD_62
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleMaxAggregate2839); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1375:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1376:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1376:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1377:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaxAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleMaxAggregate2872);
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

            otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleMaxAggregate2885); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1406:1: entryRuleMinAggregate returns [EObject current=null] : iv_ruleMinAggregate= ruleMinAggregate EOF ;
    public final EObject entryRuleMinAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinAggregate = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1407:2: (iv_ruleMinAggregate= ruleMinAggregate EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1408:2: iv_ruleMinAggregate= ruleMinAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinAggregateRule()); 
            }
            pushFollow(FOLLOW_ruleMinAggregate_in_entryRuleMinAggregate2919);
            iv_ruleMinAggregate=ruleMinAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinAggregate2929); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1415:1: ruleMinAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_25 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleMinAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1418:28: ( (otherlv_0= KEYWORD_25 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1419:1: (otherlv_0= KEYWORD_25 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1419:1: (otherlv_0= KEYWORD_25 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1420:2: otherlv_0= KEYWORD_25 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleMinAggregate2967); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMinAggregateAccess().getMINKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleMinAggregate2979); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMinAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1429:1: ( (lv_isDistinct_2_0= KEYWORD_62 ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KEYWORD_62) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1430:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1430:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1431:3: lv_isDistinct_2_0= KEYWORD_62
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleMinAggregate2997); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1445:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1446:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1446:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1447:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleMinAggregate3030);
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

            otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleMinAggregate3043); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1476:1: entryRuleSumAggregate returns [EObject current=null] : iv_ruleSumAggregate= ruleSumAggregate EOF ;
    public final EObject entryRuleSumAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumAggregate = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1477:2: (iv_ruleSumAggregate= ruleSumAggregate EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1478:2: iv_ruleSumAggregate= ruleSumAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumAggregateRule()); 
            }
            pushFollow(FOLLOW_ruleSumAggregate_in_entryRuleSumAggregate3077);
            iv_ruleSumAggregate=ruleSumAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumAggregate3087); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1485:1: ruleSumAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_30 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleSumAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1488:28: ( (otherlv_0= KEYWORD_30 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1489:1: (otherlv_0= KEYWORD_30 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1489:1: (otherlv_0= KEYWORD_30 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1490:2: otherlv_0= KEYWORD_30 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleSumAggregate3125); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSumAggregateAccess().getSUMKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleSumAggregate3137); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSumAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1499:1: ( (lv_isDistinct_2_0= KEYWORD_62 ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==KEYWORD_62) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1500:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1500:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1501:3: lv_isDistinct_2_0= KEYWORD_62
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleSumAggregate3155); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1515:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1516:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1516:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1517:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSumAggregate3188);
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

            otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleSumAggregate3201); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1546:1: entryRuleCountAggregate returns [EObject current=null] : iv_ruleCountAggregate= ruleCountAggregate EOF ;
    public final EObject entryRuleCountAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountAggregate = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1547:2: (iv_ruleCountAggregate= ruleCountAggregate EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1548:2: iv_ruleCountAggregate= ruleCountAggregate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCountAggregateRule()); 
            }
            pushFollow(FOLLOW_ruleCountAggregate_in_entryRuleCountAggregate3235);
            iv_ruleCountAggregate=ruleCountAggregate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCountAggregate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCountAggregate3245); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1555:1: ruleCountAggregate returns [EObject current=null] : (otherlv_0= KEYWORD_41 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) ;
    public final EObject ruleCountAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1558:28: ( (otherlv_0= KEYWORD_41 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1559:1: (otherlv_0= KEYWORD_41 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1559:1: (otherlv_0= KEYWORD_41 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1560:2: otherlv_0= KEYWORD_41 otherlv_1= KEYWORD_1 ( (lv_isDistinct_2_0= KEYWORD_62 ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleCountAggregate3283); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCountAggregateAccess().getCOUNTKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleCountAggregate3295); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCountAggregateAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1569:1: ( (lv_isDistinct_2_0= KEYWORD_62 ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==KEYWORD_62) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1570:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1570:1: (lv_isDistinct_2_0= KEYWORD_62 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1571:3: lv_isDistinct_2_0= KEYWORD_62
                    {
                    lv_isDistinct_2_0=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleCountAggregate3313); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1585:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1586:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1586:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1587:3: lv_item_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCountAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleCountAggregate3346);
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

            otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleCountAggregate3359); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1616:1: entryRuleSelectConstructorExpression returns [EObject current=null] : iv_ruleSelectConstructorExpression= ruleSelectConstructorExpression EOF ;
    public final EObject entryRuleSelectConstructorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectConstructorExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1617:2: (iv_ruleSelectConstructorExpression= ruleSelectConstructorExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1618:2: iv_ruleSelectConstructorExpression= ruleSelectConstructorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectConstructorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectConstructorExpression_in_entryRuleSelectConstructorExpression3393);
            iv_ruleSelectConstructorExpression=ruleSelectConstructorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectConstructorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectConstructorExpression3403); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1625:1: ruleSelectConstructorExpression returns [EObject current=null] : (otherlv_0= KEYWORD_27 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2 ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1628:28: ( (otherlv_0= KEYWORD_27 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1629:1: (otherlv_0= KEYWORD_27 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1629:1: (otherlv_0= KEYWORD_27 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1630:2: otherlv_0= KEYWORD_27 ( (lv_name_1_0= RULE_ID ) ) otherlv_2= KEYWORD_1 ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleSelectConstructorExpression3441); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSelectConstructorExpressionAccess().getNEWKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1634:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1635:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1635:1: (lv_name_1_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1636:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectConstructorExpression3457); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleSelectConstructorExpression3475); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSelectConstructorExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1657:1: ( (lv_items_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1658:1: (lv_items_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1658:1: (lv_items_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1659:3: lv_items_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectConstructorExpressionAccess().getItemsAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3495);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1675:2: (otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==KEYWORD_3) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1676:2: otherlv_4= KEYWORD_3 ( (lv_items_5_0= ruleAliasAttributeExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleSelectConstructorExpression3509); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getSelectConstructorExpressionAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1680:1: ( (lv_items_5_0= ruleAliasAttributeExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1681:1: (lv_items_5_0= ruleAliasAttributeExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1681:1: (lv_items_5_0= ruleAliasAttributeExpression )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1682:3: lv_items_5_0= ruleAliasAttributeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectConstructorExpressionAccess().getItemsAliasAttributeExpressionParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3529);
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
            	    break loop24;
                }
            } while (true);

            otherlv_6=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleSelectConstructorExpression3544); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1711:1: entryRuleFromClause returns [EObject current=null] : iv_ruleFromClause= ruleFromClause EOF ;
    public final EObject entryRuleFromClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1712:2: (iv_ruleFromClause= ruleFromClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1713:2: iv_ruleFromClause= ruleFromClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromClauseRule()); 
            }
            pushFollow(FOLLOW_ruleFromClause_in_entryRuleFromClause3578);
            iv_ruleFromClause=ruleFromClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClause3588); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1720:1: ruleFromClause returns [EObject current=null] : (otherlv_0= KEYWORD_32 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) ;
    public final EObject ruleFromClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_fromEntries_1_0 = null;

        EObject lv_fromEntries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1723:28: ( (otherlv_0= KEYWORD_32 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1724:1: (otherlv_0= KEYWORD_32 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1724:1: (otherlv_0= KEYWORD_32 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1725:2: otherlv_0= KEYWORD_32 ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleFromClause3626); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFromClauseAccess().getFROMKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1729:1: ( (lv_fromEntries_1_0= ruleFromClass ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1730:1: (lv_fromEntries_1_0= ruleFromClass )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1730:1: (lv_fromEntries_1_0= ruleFromClass )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1731:3: lv_fromEntries_1_0= ruleFromClass
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromClauseAccess().getFromEntriesFromClassParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFromClass_in_ruleFromClause3646);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1747:2: (otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==KEYWORD_3) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1748:2: otherlv_2= KEYWORD_3 ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleFromClause3660); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFromClauseAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1752:1: ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1753:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1753:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1754:3: lv_fromEntries_3_0= ruleFromEntry
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFromClauseAccess().getFromEntriesFromEntryParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFromEntry_in_ruleFromClause3680);
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
    // $ANTLR end "ruleFromClause"


    // $ANTLR start "entryRuleFromEntry"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1778:1: entryRuleFromEntry returns [EObject current=null] : iv_ruleFromEntry= ruleFromEntry EOF ;
    public final EObject entryRuleFromEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromEntry = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1779:2: (iv_ruleFromEntry= ruleFromEntry EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1780:2: iv_ruleFromEntry= ruleFromEntry EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromEntryRule()); 
            }
            pushFollow(FOLLOW_ruleFromEntry_in_entryRuleFromEntry3717);
            iv_ruleFromEntry=ruleFromEntry();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromEntry; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromEntry3727); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1787:1: ruleFromEntry returns [EObject current=null] : (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection ) ;
    public final EObject ruleFromEntry() throws RecognitionException {
        EObject current = null;

        EObject this_FromClass_0 = null;

        EObject this_FromCollection_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1790:28: ( (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1791:1: (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1791:1: (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            else if ( (LA26_0==KEYWORD_14) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1792:2: this_FromClass_0= ruleFromClass
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromEntryAccess().getFromClassParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFromClass_in_ruleFromEntry3777);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1805:2: this_FromCollection_1= ruleFromCollection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromEntryAccess().getFromCollectionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFromCollection_in_ruleFromEntry3807);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1824:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1825:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1826:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3841);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration3851); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1833:1: ruleVariableDeclaration returns [EObject current=null] : ( (otherlv_0= KEYWORD_12 )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1836:28: ( ( (otherlv_0= KEYWORD_12 )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1837:1: ( (otherlv_0= KEYWORD_12 )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1837:1: ( (otherlv_0= KEYWORD_12 )? ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1837:2: (otherlv_0= KEYWORD_12 )? ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1837:2: (otherlv_0= KEYWORD_12 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==KEYWORD_12) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1838:2: otherlv_0= KEYWORD_12
                    {
                    otherlv_0=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleVariableDeclaration3890); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getASKeyword_0());
                          
                    }

                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1842:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1843:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1843:1: (lv_name_1_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1844:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration3908); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1868:1: entryRuleFromClass returns [EObject current=null] : iv_ruleFromClass= ruleFromClass EOF ;
    public final EObject entryRuleFromClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClass = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1869:2: (iv_ruleFromClass= ruleFromClass EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1870:2: iv_ruleFromClass= ruleFromClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromClassRule()); 
            }
            pushFollow(FOLLOW_ruleFromClass_in_entryRuleFromClass3948);
            iv_ruleFromClass=ruleFromClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClass3958); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1877:1: ruleFromClass returns [EObject current=null] : (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar ) ;
    public final EObject ruleFromClass() throws RecognitionException {
        EObject current = null;

        EObject this_FromClassId_0 = null;

        EObject this_FromClassVar_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1880:28: ( (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1881:1: (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1881:1: (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar )
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1882:2: this_FromClassId_0= ruleFromClassId
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromClassAccess().getFromClassIdParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFromClassId_in_ruleFromClass4008);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1895:2: this_FromClassVar_1= ruleFromClassVar
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromClassAccess().getFromClassVarParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFromClassVar_in_ruleFromClass4038);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1914:1: entryRuleQualifiedIdentifier returns [String current=null] : iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF ;
    public final String entryRuleQualifiedIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedIdentifier = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1915:1: (iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1916:2: iv_ruleQualifiedIdentifier= ruleQualifiedIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier4073);
            iv_ruleQualifiedIdentifier=ruleQualifiedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedIdentifier4084); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1923:1: ruleQualifiedIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= KEYWORD_4 this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1927:6: ( (this_ID_0= RULE_ID (kw= KEYWORD_4 this_ID_2= RULE_ID )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1928:1: (this_ID_0= RULE_ID (kw= KEYWORD_4 this_ID_2= RULE_ID )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1928:1: (this_ID_0= RULE_ID (kw= KEYWORD_4 this_ID_2= RULE_ID )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1928:6: this_ID_0= RULE_ID (kw= KEYWORD_4 this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier4124); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1935:1: (kw= KEYWORD_4 this_ID_2= RULE_ID )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==KEYWORD_4) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1936:2: kw= KEYWORD_4 this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleQualifiedIdentifier4143); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedIdentifierAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedIdentifier4158); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedIdentifierAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // $ANTLR end "ruleQualifiedIdentifier"


    // $ANTLR start "entryRuleFromClassId"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1956:1: entryRuleFromClassId returns [EObject current=null] : iv_ruleFromClassId= ruleFromClassId EOF ;
    public final EObject entryRuleFromClassId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClassId = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1957:2: (iv_ruleFromClassId= ruleFromClassId EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1958:2: iv_ruleFromClassId= ruleFromClassId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromClassIdRule()); 
            }
            pushFollow(FOLLOW_ruleFromClassId_in_entryRuleFromClassId4204);
            iv_ruleFromClassId=ruleFromClassId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromClassId; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClassId4214); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1965:1: ruleFromClassId returns [EObject current=null] : ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ;
    public final EObject ruleFromClassId() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1968:28: ( ( (lv_type_0_0= ruleQualifiedIdentifier ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1969:1: ( (lv_type_0_0= ruleQualifiedIdentifier ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1969:1: ( (lv_type_0_0= ruleQualifiedIdentifier ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1970:1: (lv_type_0_0= ruleQualifiedIdentifier )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1970:1: (lv_type_0_0= ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1971:3: lv_type_0_0= ruleQualifiedIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromClassIdAccess().getTypeQualifiedIdentifierParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleFromClassId4259);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1995:1: entryRuleFromClassVar returns [EObject current=null] : iv_ruleFromClassVar= ruleFromClassVar EOF ;
    public final EObject entryRuleFromClassVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClassVar = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1996:2: (iv_ruleFromClassVar= ruleFromClassVar EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:1997:2: iv_ruleFromClassVar= ruleFromClassVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromClassVarRule()); 
            }
            pushFollow(FOLLOW_ruleFromClassVar_in_entryRuleFromClassVar4293);
            iv_ruleFromClassVar=ruleFromClassVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromClassVar; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClassVar4303); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2004:1: ruleFromClassVar returns [EObject current=null] : ( ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* ) ;
    public final EObject ruleFromClassVar() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_joins_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2007:28: ( ( ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2008:1: ( ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2008:1: ( ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2008:2: ( (lv_type_0_0= ruleQualifiedIdentifier ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )*
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2008:2: ( (lv_type_0_0= ruleQualifiedIdentifier ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2009:1: (lv_type_0_0= ruleQualifiedIdentifier )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2009:1: (lv_type_0_0= ruleQualifiedIdentifier )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2010:3: lv_type_0_0= ruleQualifiedIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromClassVarAccess().getTypeQualifiedIdentifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedIdentifier_in_ruleFromClassVar4349);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2026:2: ( (lv_variable_1_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2027:1: (lv_variable_1_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2027:1: (lv_variable_1_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2028:3: lv_variable_1_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromClassVarAccess().getVariableVariableDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleFromClassVar4370);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2044:2: ( (lv_joins_2_0= ruleFromJoin ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==KEYWORD_45||(LA30_0>=KEYWORD_33 && LA30_0<=KEYWORD_34)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2045:1: (lv_joins_2_0= ruleFromJoin )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2045:1: (lv_joins_2_0= ruleFromJoin )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2046:3: lv_joins_2_0= ruleFromJoin
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFromClassVarAccess().getJoinsFromJoinParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFromJoin_in_ruleFromClassVar4391);
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
    // $ANTLR end "ruleFromClassVar"


    // $ANTLR start "entryRuleFromCollection"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2070:1: entryRuleFromCollection returns [EObject current=null] : iv_ruleFromCollection= ruleFromCollection EOF ;
    public final EObject entryRuleFromCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromCollection = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2071:2: (iv_ruleFromCollection= ruleFromCollection EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2072:2: iv_ruleFromCollection= ruleFromCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromCollectionRule()); 
            }
            pushFollow(FOLLOW_ruleFromCollection_in_entryRuleFromCollection4427);
            iv_ruleFromCollection=ruleFromCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromCollection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromCollection4437); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2079:1: ruleFromCollection returns [EObject current=null] : (otherlv_0= KEYWORD_14 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleFromCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_path_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2082:28: ( (otherlv_0= KEYWORD_14 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2083:1: (otherlv_0= KEYWORD_14 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2083:1: (otherlv_0= KEYWORD_14 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2084:2: otherlv_0= KEYWORD_14 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= KEYWORD_2 ( (lv_variable_4_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleFromCollection4475); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFromCollectionAccess().getINKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleFromCollection4487); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFromCollectionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2093:1: ( (lv_path_2_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2094:1: (lv_path_2_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2094:1: (lv_path_2_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2095:3: lv_path_2_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromCollectionAccess().getPathAliasAttributeExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleFromCollection4507);
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

            otherlv_3=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleFromCollection4520); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFromCollectionAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2116:1: ( (lv_variable_4_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2117:1: (lv_variable_4_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2117:1: (lv_variable_4_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2118:3: lv_variable_4_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFromCollectionAccess().getVariableVariableDeclarationParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleFromCollection4540);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2142:1: entryRuleFromJoin returns [EObject current=null] : iv_ruleFromJoin= ruleFromJoin EOF ;
    public final EObject entryRuleFromJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromJoin = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2143:2: (iv_ruleFromJoin= ruleFromJoin EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2144:2: iv_ruleFromJoin= ruleFromJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFromJoinRule()); 
            }
            pushFollow(FOLLOW_ruleFromJoin_in_entryRuleFromJoin4575);
            iv_ruleFromJoin=ruleFromJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFromJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromJoin4585); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2151:1: ruleFromJoin returns [EObject current=null] : (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin ) ;
    public final EObject ruleFromJoin() throws RecognitionException {
        EObject current = null;

        EObject this_Join_0 = null;

        EObject this_LeftJoin_1 = null;

        EObject this_InnerJoin_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2154:28: ( (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2155:1: (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2155:1: (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin )
            int alt31=3;
            switch ( input.LA(1) ) {
            case KEYWORD_33:
                {
                alt31=1;
                }
                break;
            case KEYWORD_34:
                {
                alt31=2;
                }
                break;
            case KEYWORD_45:
                {
                alt31=3;
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2156:2: this_Join_0= ruleJoin
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromJoinAccess().getJoinParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJoin_in_ruleFromJoin4635);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2169:2: this_LeftJoin_1= ruleLeftJoin
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromJoinAccess().getLeftJoinParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLeftJoin_in_ruleFromJoin4665);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2182:2: this_InnerJoin_2= ruleInnerJoin
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFromJoinAccess().getInnerJoinParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInnerJoin_in_ruleFromJoin4695);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2201:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2202:2: (iv_ruleJoin= ruleJoin EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2203:2: iv_ruleJoin= ruleJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinRule()); 
            }
            pushFollow(FOLLOW_ruleJoin_in_entryRuleJoin4729);
            iv_ruleJoin=ruleJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoin4739); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2210:1: ruleJoin returns [EObject current=null] : (otherlv_0= KEYWORD_33 ( (lv_isFetch_1_0= KEYWORD_44 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isFetch_1_0=null;
        EObject lv_path_2_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2213:28: ( (otherlv_0= KEYWORD_33 ( (lv_isFetch_1_0= KEYWORD_44 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2214:1: (otherlv_0= KEYWORD_33 ( (lv_isFetch_1_0= KEYWORD_44 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2214:1: (otherlv_0= KEYWORD_33 ( (lv_isFetch_1_0= KEYWORD_44 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2215:2: otherlv_0= KEYWORD_33 ( (lv_isFetch_1_0= KEYWORD_44 ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleJoin4777); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJoinAccess().getJOINKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2219:1: ( (lv_isFetch_1_0= KEYWORD_44 ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==KEYWORD_44) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2220:1: (lv_isFetch_1_0= KEYWORD_44 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2220:1: (lv_isFetch_1_0= KEYWORD_44 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2221:3: lv_isFetch_1_0= KEYWORD_44
                    {
                    lv_isFetch_1_0=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleJoin4795); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2235:3: ( (lv_path_2_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2236:1: (lv_path_2_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2236:1: (lv_path_2_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2237:3: lv_path_2_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinAccess().getPathAliasAttributeExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleJoin4828);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2253:2: ( (lv_variable_3_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2254:1: (lv_variable_3_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2254:1: (lv_variable_3_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2255:3: lv_variable_3_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinAccess().getVariableVariableDeclarationParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleJoin4849);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2279:1: entryRuleLeftJoin returns [EObject current=null] : iv_ruleLeftJoin= ruleLeftJoin EOF ;
    public final EObject entryRuleLeftJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftJoin = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2280:2: (iv_ruleLeftJoin= ruleLeftJoin EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2281:2: iv_ruleLeftJoin= ruleLeftJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeftJoinRule()); 
            }
            pushFollow(FOLLOW_ruleLeftJoin_in_entryRuleLeftJoin4884);
            iv_ruleLeftJoin=ruleLeftJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeftJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftJoin4894); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2288:1: ruleLeftJoin returns [EObject current=null] : (otherlv_0= KEYWORD_34 ( (lv_isOuter_1_0= KEYWORD_48 ) )? otherlv_2= KEYWORD_33 ( (lv_isFetch_3_0= KEYWORD_44 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2291:28: ( (otherlv_0= KEYWORD_34 ( (lv_isOuter_1_0= KEYWORD_48 ) )? otherlv_2= KEYWORD_33 ( (lv_isFetch_3_0= KEYWORD_44 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2292:1: (otherlv_0= KEYWORD_34 ( (lv_isOuter_1_0= KEYWORD_48 ) )? otherlv_2= KEYWORD_33 ( (lv_isFetch_3_0= KEYWORD_44 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2292:1: (otherlv_0= KEYWORD_34 ( (lv_isOuter_1_0= KEYWORD_48 ) )? otherlv_2= KEYWORD_33 ( (lv_isFetch_3_0= KEYWORD_44 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2293:2: otherlv_0= KEYWORD_34 ( (lv_isOuter_1_0= KEYWORD_48 ) )? otherlv_2= KEYWORD_33 ( (lv_isFetch_3_0= KEYWORD_44 ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleLeftJoin4932); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLeftJoinAccess().getLEFTKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2297:1: ( (lv_isOuter_1_0= KEYWORD_48 ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==KEYWORD_48) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2298:1: (lv_isOuter_1_0= KEYWORD_48 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2298:1: (lv_isOuter_1_0= KEYWORD_48 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2299:3: lv_isOuter_1_0= KEYWORD_48
                    {
                    lv_isOuter_1_0=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleLeftJoin4950); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleLeftJoin4975); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLeftJoinAccess().getJOINKeyword_2());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2318:1: ( (lv_isFetch_3_0= KEYWORD_44 ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==KEYWORD_44) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2319:1: (lv_isFetch_3_0= KEYWORD_44 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2319:1: (lv_isFetch_3_0= KEYWORD_44 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2320:3: lv_isFetch_3_0= KEYWORD_44
                    {
                    lv_isFetch_3_0=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleLeftJoin4993); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2334:3: ( (lv_path_4_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2335:1: (lv_path_4_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2335:1: (lv_path_4_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2336:3: lv_path_4_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLeftJoinAccess().getPathAliasAttributeExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleLeftJoin5026);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2352:2: ( (lv_variable_5_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2353:1: (lv_variable_5_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2353:1: (lv_variable_5_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2354:3: lv_variable_5_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLeftJoinAccess().getVariableVariableDeclarationParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleLeftJoin5047);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2378:1: entryRuleInnerJoin returns [EObject current=null] : iv_ruleInnerJoin= ruleInnerJoin EOF ;
    public final EObject entryRuleInnerJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerJoin = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2379:2: (iv_ruleInnerJoin= ruleInnerJoin EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2380:2: iv_ruleInnerJoin= ruleInnerJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInnerJoinRule()); 
            }
            pushFollow(FOLLOW_ruleInnerJoin_in_entryRuleInnerJoin5082);
            iv_ruleInnerJoin=ruleInnerJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInnerJoin; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInnerJoin5092); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2387:1: ruleInnerJoin returns [EObject current=null] : (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_33 ( (lv_isFetch_2_0= KEYWORD_44 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleInnerJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isFetch_2_0=null;
        EObject lv_path_3_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2390:28: ( (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_33 ( (lv_isFetch_2_0= KEYWORD_44 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2391:1: (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_33 ( (lv_isFetch_2_0= KEYWORD_44 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2391:1: (otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_33 ( (lv_isFetch_2_0= KEYWORD_44 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2392:2: otherlv_0= KEYWORD_45 otherlv_1= KEYWORD_33 ( (lv_isFetch_2_0= KEYWORD_44 ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleInnerJoin5130); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInnerJoinAccess().getINNERKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleInnerJoin5142); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInnerJoinAccess().getJOINKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2401:1: ( (lv_isFetch_2_0= KEYWORD_44 ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==KEYWORD_44) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2402:1: (lv_isFetch_2_0= KEYWORD_44 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2402:1: (lv_isFetch_2_0= KEYWORD_44 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2403:3: lv_isFetch_2_0= KEYWORD_44
                    {
                    lv_isFetch_2_0=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleInnerJoin5160); if (state.failed) return current;
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2417:3: ( (lv_path_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2418:1: (lv_path_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2418:1: (lv_path_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2419:3: lv_path_3_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInnerJoinAccess().getPathAliasAttributeExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleInnerJoin5193);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2435:2: ( (lv_variable_4_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2436:1: (lv_variable_4_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2436:1: (lv_variable_4_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2437:3: lv_variable_4_0= ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInnerJoinAccess().getVariableVariableDeclarationParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInnerJoin5214);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2461:1: entryRuleWhereClause returns [EObject current=null] : iv_ruleWhereClause= ruleWhereClause EOF ;
    public final EObject entryRuleWhereClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2462:2: (iv_ruleWhereClause= ruleWhereClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2463:2: iv_ruleWhereClause= ruleWhereClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhereClauseRule()); 
            }
            pushFollow(FOLLOW_ruleWhereClause_in_entryRuleWhereClause5249);
            iv_ruleWhereClause=ruleWhereClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhereClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhereClause5259); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2470:1: ruleWhereClause returns [EObject current=null] : (otherlv_0= KEYWORD_50 ( (lv_whereEntry_1_0= ruleOrExpression ) ) ) ;
    public final EObject ruleWhereClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_whereEntry_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2473:28: ( (otherlv_0= KEYWORD_50 ( (lv_whereEntry_1_0= ruleOrExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2474:1: (otherlv_0= KEYWORD_50 ( (lv_whereEntry_1_0= ruleOrExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2474:1: (otherlv_0= KEYWORD_50 ( (lv_whereEntry_1_0= ruleOrExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2475:2: otherlv_0= KEYWORD_50 ( (lv_whereEntry_1_0= ruleOrExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleWhereClause5297); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhereClauseAccess().getWHEREKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2479:1: ( (lv_whereEntry_1_0= ruleOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2480:1: (lv_whereEntry_1_0= ruleOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2480:1: (lv_whereEntry_1_0= ruleOrExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2481:3: lv_whereEntry_1_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhereClauseAccess().getWhereEntryOrExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleWhereClause5317);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2505:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2506:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2507:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression5352);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression5362); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2514:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2517:28: ( (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2518:1: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2518:1: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2519:2: this_AndExpression_0= ruleAndExpression ( () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression5412);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_AndExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2530:1: ( () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+ )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==KEYWORD_17) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2530:2: () (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2530:2: ()
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2531:2: 
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

                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2539:2: (otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) ) )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==KEYWORD_17) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2540:2: otherlv_2= KEYWORD_17 ( (lv_entries_3_0= ruleAndExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleOrExpression5438); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getORKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2544:1: ( (lv_entries_3_0= ruleAndExpression ) )
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2545:1: (lv_entries_3_0= ruleAndExpression )
                    	    {
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2545:1: (lv_entries_3_0= ruleAndExpression )
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2546:3: lv_entries_3_0= ruleAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getEntriesAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression5458);
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2570:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2571:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2572:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression5497);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression5507); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2579:1: ruleAndExpression returns [EObject current=null] : (this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ConcreteExpression_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2582:28: ( (this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2583:1: (this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2583:1: (this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2584:2: this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getConcreteExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConcreteExpression_in_ruleAndExpression5557);
            this_ConcreteExpression_0=ruleConcreteExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ConcreteExpression_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2595:1: ( () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==KEYWORD_20) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2595:2: () (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2595:2: ()
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2596:2: 
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

                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2604:2: (otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) ) )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==KEYWORD_20) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2605:2: otherlv_2= KEYWORD_20 ( (lv_entries_3_0= ruleConcreteExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleAndExpression5583); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getANDKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2609:1: ( (lv_entries_3_0= ruleConcreteExpression ) )
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2610:1: (lv_entries_3_0= ruleConcreteExpression )
                    	    {
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2610:1: (lv_entries_3_0= ruleConcreteExpression )
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2611:3: lv_entries_3_0= ruleConcreteExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getEntriesConcreteExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleConcreteExpression_in_ruleAndExpression5603);
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
                    	    if ( cnt38 >= 1 ) break loop38;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2635:1: entryRuleConcreteExpression returns [EObject current=null] : iv_ruleConcreteExpression= ruleConcreteExpression EOF ;
    public final EObject entryRuleConcreteExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2636:2: (iv_ruleConcreteExpression= ruleConcreteExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2637:2: iv_ruleConcreteExpression= ruleConcreteExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcreteExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConcreteExpression_in_entryRuleConcreteExpression5642);
            iv_ruleConcreteExpression=ruleConcreteExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcreteExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcreteExpression5652); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2644:1: ruleConcreteExpression returns [EObject current=null] : (this_ParExpression_0= ruleParExpression | this_OperatorExpression_1= ruleOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2647:28: ( (this_ParExpression_0= ruleParExpression | this_OperatorExpression_1= ruleOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2648:1: (this_ParExpression_0= ruleParExpression | this_OperatorExpression_1= ruleOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2648:1: (this_ParExpression_0= ruleParExpression | this_OperatorExpression_1= ruleOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression )
            int alt40=12;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2649:2: this_ParExpression_0= ruleParExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getParExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParExpression_in_ruleConcreteExpression5702);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2662:2: this_OperatorExpression_1= ruleOperatorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getOperatorExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperatorExpression_in_ruleConcreteExpression5732);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2675:2: this_ExistsExpression_2= ruleExistsExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getExistsExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExistsExpression_in_ruleConcreteExpression5762);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2688:2: this_AllExpression_3= ruleAllExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getAllExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAllExpression_in_ruleConcreteExpression5792);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2701:2: this_AnyExpression_4= ruleAnyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getAnyExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnyExpression_in_ruleConcreteExpression5822);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2714:2: this_SomeExpression_5= ruleSomeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getSomeExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSomeExpression_in_ruleConcreteExpression5852);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2727:2: this_CollectionExpression_6= ruleCollectionExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getCollectionExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCollectionExpression_in_ruleConcreteExpression5882);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2740:2: this_NullComparisonExpression_7= ruleNullComparisonExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getNullComparisonExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullComparisonExpression_in_ruleConcreteExpression5912);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2753:2: this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getEmptyComparisonExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEmptyComparisonExpression_in_ruleConcreteExpression5942);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2766:2: this_LikeExpression_9= ruleLikeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getLikeExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLikeExpression_in_ruleConcreteExpression5972);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2779:2: this_InExpression_10= ruleInExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getInExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInExpression_in_ruleConcreteExpression6002);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2792:2: this_BetweenExpression_11= ruleBetweenExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConcreteExpressionAccess().getBetweenExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBetweenExpression_in_ruleConcreteExpression6032);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2811:1: entryRuleParExpression returns [EObject current=null] : iv_ruleParExpression= ruleParExpression EOF ;
    public final EObject entryRuleParExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2812:2: (iv_ruleParExpression= ruleParExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2813:2: iv_ruleParExpression= ruleParExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParExpression_in_entryRuleParExpression6066);
            iv_ruleParExpression=ruleParExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParExpression6076); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2820:1: ruleParExpression returns [EObject current=null] : (otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2 ) ;
    public final EObject ruleParExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ExpressionTerm_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2823:28: ( (otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2824:1: (otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2824:1: (otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2825:2: otherlv_0= KEYWORD_1 this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleParExpression6114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParExpressionAccess().getExpressionTermParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleExpressionTerm_in_ruleParExpression6138);
            this_ExpressionTerm_1=ruleExpressionTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ExpressionTerm_1;
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleParExpression6150); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2854:1: entryRuleOperatorExpression returns [EObject current=null] : iv_ruleOperatorExpression= ruleOperatorExpression EOF ;
    public final EObject entryRuleOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatorExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2855:2: (iv_ruleOperatorExpression= ruleOperatorExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2856:2: iv_ruleOperatorExpression= ruleOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOperatorExpression_in_entryRuleOperatorExpression6184);
            iv_ruleOperatorExpression=ruleOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorExpression6194); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2863:1: ruleOperatorExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) ) ) ;
    public final EObject ruleOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_rhs_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2866:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2867:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2867:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2867:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2867:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2868:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2868:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2869:3: lv_lhs_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperatorExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleOperatorExpression6240);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2885:2: ( (lv_operator_1_0= ruleOperator ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2886:1: (lv_operator_1_0= ruleOperator )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2886:1: (lv_operator_1_0= ruleOperator )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2887:3: lv_operator_1_0= ruleOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperatorExpressionAccess().getOperatorOperatorEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOperator_in_ruleOperatorExpression6261);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2903:2: ( (lv_rhs_2_0= ruleExpressionTerm ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2904:1: (lv_rhs_2_0= ruleExpressionTerm )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2904:1: (lv_rhs_2_0= ruleExpressionTerm )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2905:3: lv_rhs_2_0= ruleExpressionTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperatorExpressionAccess().getRhsExpressionTermParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpressionTerm_in_ruleOperatorExpression6282);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2929:1: entryRuleExistsExpression returns [EObject current=null] : iv_ruleExistsExpression= ruleExistsExpression EOF ;
    public final EObject entryRuleExistsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistsExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2930:2: (iv_ruleExistsExpression= ruleExistsExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2931:2: iv_ruleExistsExpression= ruleExistsExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExistsExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExistsExpression_in_entryRuleExistsExpression6317);
            iv_ruleExistsExpression=ruleExistsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExistsExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExistsExpression6327); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2938:1: ruleExistsExpression returns [EObject current=null] : ( ( (lv_isNot_0_0= KEYWORD_28 ) )? otherlv_1= KEYWORD_53 ( (lv_query_2_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleExistsExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_0_0=null;
        Token otherlv_1=null;
        EObject lv_query_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2941:28: ( ( ( (lv_isNot_0_0= KEYWORD_28 ) )? otherlv_1= KEYWORD_53 ( (lv_query_2_0= ruleQueryExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2942:1: ( ( (lv_isNot_0_0= KEYWORD_28 ) )? otherlv_1= KEYWORD_53 ( (lv_query_2_0= ruleQueryExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2942:1: ( ( (lv_isNot_0_0= KEYWORD_28 ) )? otherlv_1= KEYWORD_53 ( (lv_query_2_0= ruleQueryExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2942:2: ( (lv_isNot_0_0= KEYWORD_28 ) )? otherlv_1= KEYWORD_53 ( (lv_query_2_0= ruleQueryExpression ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2942:2: ( (lv_isNot_0_0= KEYWORD_28 ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==KEYWORD_28) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2943:1: (lv_isNot_0_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2943:1: (lv_isNot_0_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2944:3: lv_isNot_0_0= KEYWORD_28
                    {
                    lv_isNot_0_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleExistsExpression6371); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleExistsExpression6396); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExistsExpressionAccess().getEXISTSKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2963:1: ( (lv_query_2_0= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2964:1: (lv_query_2_0= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2964:1: (lv_query_2_0= ruleQueryExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2965:3: lv_query_2_0= ruleQueryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExistsExpressionAccess().getQueryQueryExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleExistsExpression6416);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2989:1: entryRuleAllExpression returns [EObject current=null] : iv_ruleAllExpression= ruleAllExpression EOF ;
    public final EObject entryRuleAllExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2990:2: (iv_ruleAllExpression= ruleAllExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2991:2: iv_ruleAllExpression= ruleAllExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAllExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAllExpression_in_entryRuleAllExpression6451);
            iv_ruleAllExpression=ruleAllExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAllExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllExpression6461); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:2998:1: ruleAllExpression returns [EObject current=null] : (otherlv_0= KEYWORD_19 ( (lv_query_1_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleAllExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_query_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3001:28: ( (otherlv_0= KEYWORD_19 ( (lv_query_1_0= ruleQueryExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3002:1: (otherlv_0= KEYWORD_19 ( (lv_query_1_0= ruleQueryExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3002:1: (otherlv_0= KEYWORD_19 ( (lv_query_1_0= ruleQueryExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3003:2: otherlv_0= KEYWORD_19 ( (lv_query_1_0= ruleQueryExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleAllExpression6499); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAllExpressionAccess().getALLKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3007:1: ( (lv_query_1_0= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3008:1: (lv_query_1_0= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3008:1: (lv_query_1_0= ruleQueryExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3009:3: lv_query_1_0= ruleQueryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAllExpressionAccess().getQueryQueryExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleAllExpression6519);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3033:1: entryRuleAnyExpression returns [EObject current=null] : iv_ruleAnyExpression= ruleAnyExpression EOF ;
    public final EObject entryRuleAnyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3034:2: (iv_ruleAnyExpression= ruleAnyExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3035:2: iv_ruleAnyExpression= ruleAnyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAnyExpression_in_entryRuleAnyExpression6554);
            iv_ruleAnyExpression=ruleAnyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnyExpression6564); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3042:1: ruleAnyExpression returns [EObject current=null] : (otherlv_0= KEYWORD_21 ( (lv_query_1_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleAnyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_query_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3045:28: ( (otherlv_0= KEYWORD_21 ( (lv_query_1_0= ruleQueryExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3046:1: (otherlv_0= KEYWORD_21 ( (lv_query_1_0= ruleQueryExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3046:1: (otherlv_0= KEYWORD_21 ( (lv_query_1_0= ruleQueryExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3047:2: otherlv_0= KEYWORD_21 ( (lv_query_1_0= ruleQueryExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleAnyExpression6602); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnyExpressionAccess().getANYKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3051:1: ( (lv_query_1_0= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3052:1: (lv_query_1_0= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3052:1: (lv_query_1_0= ruleQueryExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3053:3: lv_query_1_0= ruleQueryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnyExpressionAccess().getQueryQueryExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleAnyExpression6622);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3077:1: entryRuleSomeExpression returns [EObject current=null] : iv_ruleSomeExpression= ruleSomeExpression EOF ;
    public final EObject entryRuleSomeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSomeExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3078:2: (iv_ruleSomeExpression= ruleSomeExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3079:2: iv_ruleSomeExpression= ruleSomeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSomeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSomeExpression_in_entryRuleSomeExpression6657);
            iv_ruleSomeExpression=ruleSomeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSomeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSomeExpression6667); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3086:1: ruleSomeExpression returns [EObject current=null] : (otherlv_0= KEYWORD_38 ( (lv_query_1_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleSomeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_query_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3089:28: ( (otherlv_0= KEYWORD_38 ( (lv_query_1_0= ruleQueryExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3090:1: (otherlv_0= KEYWORD_38 ( (lv_query_1_0= ruleQueryExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3090:1: (otherlv_0= KEYWORD_38 ( (lv_query_1_0= ruleQueryExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3091:2: otherlv_0= KEYWORD_38 ( (lv_query_1_0= ruleQueryExpression ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleSomeExpression6705); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSomeExpressionAccess().getSOMEKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3095:1: ( (lv_query_1_0= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3096:1: (lv_query_1_0= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3096:1: (lv_query_1_0= ruleQueryExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3097:3: lv_query_1_0= ruleQueryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSomeExpressionAccess().getQueryQueryExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleSomeExpression6725);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3121:1: entryRuleCollectionExpression returns [EObject current=null] : iv_ruleCollectionExpression= ruleCollectionExpression EOF ;
    public final EObject entryRuleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3122:2: (iv_ruleCollectionExpression= ruleCollectionExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3123:2: iv_ruleCollectionExpression= ruleCollectionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression6760);
            iv_ruleCollectionExpression=ruleCollectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionExpression6770); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3130:1: ruleCollectionExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_58 (otherlv_3= KEYWORD_16 )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) ) ) ;
    public final EObject ruleCollectionExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3133:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_58 (otherlv_3= KEYWORD_16 )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3134:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_58 (otherlv_3= KEYWORD_16 )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3134:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_58 (otherlv_3= KEYWORD_16 )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3134:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_58 (otherlv_3= KEYWORD_16 )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3134:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3135:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3135:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3136:3: lv_lhs_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleCollectionExpression6816);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3152:2: ( (lv_isNot_1_0= KEYWORD_28 ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==KEYWORD_28) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3153:1: (lv_isNot_1_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3153:1: (lv_isNot_1_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3154:3: lv_isNot_1_0= KEYWORD_28
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleCollectionExpression6835); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleCollectionExpression6860); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCollectionExpressionAccess().getMEMBERKeyword_2());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3173:1: (otherlv_3= KEYWORD_16 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==KEYWORD_16) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3174:2: otherlv_3= KEYWORD_16
                    {
                    otherlv_3=(Token)match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleCollectionExpression6873); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCollectionExpressionAccess().getOFKeyword_3());
                          
                    }

                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3178:3: ( (lv_rhs_4_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3179:1: (lv_rhs_4_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3179:1: (lv_rhs_4_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3180:3: lv_rhs_4_0= ruleAliasAttributeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionExpressionAccess().getRhsAliasAttributeExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleCollectionExpression6895);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3204:1: entryRuleNullComparisonExpression returns [EObject current=null] : iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF ;
    public final EObject entryRuleNullComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullComparisonExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3205:2: (iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3206:2: iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullComparisonExpression_in_entryRuleNullComparisonExpression6930);
            iv_ruleNullComparisonExpression=ruleNullComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullComparisonExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullComparisonExpression6940); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3213:1: ruleNullComparisonExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_36 ) ;
    public final EObject ruleNullComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isNot_2_0=null;
        Token otherlv_3=null;
        EObject lv_lhs_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3216:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_36 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3217:1: ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_36 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3217:1: ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_36 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3217:2: ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_36
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3217:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3218:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3218:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3219:3: lv_lhs_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNullComparisonExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleNullComparisonExpression6986);
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

            otherlv_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleNullComparisonExpression6999); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNullComparisonExpressionAccess().getISKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3240:1: ( (lv_isNot_2_0= KEYWORD_28 ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==KEYWORD_28) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3241:1: (lv_isNot_2_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3241:1: (lv_isNot_2_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3242:3: lv_isNot_2_0= KEYWORD_28
                    {
                    lv_isNot_2_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleNullComparisonExpression7017); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleNullComparisonExpression7042); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3269:1: entryRuleEmptyComparisonExpression returns [EObject current=null] : iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF ;
    public final EObject entryRuleEmptyComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyComparisonExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3270:2: (iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3271:2: iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmptyComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEmptyComparisonExpression_in_entryRuleEmptyComparisonExpression7076);
            iv_ruleEmptyComparisonExpression=ruleEmptyComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmptyComparisonExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmptyComparisonExpression7086); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3278:1: ruleEmptyComparisonExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_42 ) ;
    public final EObject ruleEmptyComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isNot_2_0=null;
        Token otherlv_3=null;
        EObject lv_lhs_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3281:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_42 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3282:1: ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_42 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3282:1: ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_42 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3282:2: ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= KEYWORD_15 ( (lv_isNot_2_0= KEYWORD_28 ) )? otherlv_3= KEYWORD_42
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3282:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3283:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3283:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3284:3: lv_lhs_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEmptyComparisonExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleEmptyComparisonExpression7132);
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

            otherlv_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleEmptyComparisonExpression7145); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEmptyComparisonExpressionAccess().getISKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3305:1: ( (lv_isNot_2_0= KEYWORD_28 ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==KEYWORD_28) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3306:1: (lv_isNot_2_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3306:1: (lv_isNot_2_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3307:3: lv_isNot_2_0= KEYWORD_28
                    {
                    lv_isNot_2_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleEmptyComparisonExpression7163); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleEmptyComparisonExpression7188); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3334:1: entryRuleLikeExpression returns [EObject current=null] : iv_ruleLikeExpression= ruleLikeExpression EOF ;
    public final EObject entryRuleLikeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLikeExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3335:2: (iv_ruleLikeExpression= ruleLikeExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3336:2: iv_ruleLikeExpression= ruleLikeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLikeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLikeExpression_in_entryRuleLikeExpression7222);
            iv_ruleLikeExpression=ruleLikeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLikeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLikeExpression7232); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3343:1: ruleLikeExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_35 ( (lv_pattern_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleLikeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        Token lv_pattern_3_0=null;
        EObject lv_lhs_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3346:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_35 ( (lv_pattern_3_0= RULE_STRING ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3347:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_35 ( (lv_pattern_3_0= RULE_STRING ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3347:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_35 ( (lv_pattern_3_0= RULE_STRING ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3347:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_35 ( (lv_pattern_3_0= RULE_STRING ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3347:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3348:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3348:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3349:3: lv_lhs_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLikeExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleLikeExpression7278);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3365:2: ( (lv_isNot_1_0= KEYWORD_28 ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==KEYWORD_28) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3366:1: (lv_isNot_1_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3366:1: (lv_isNot_1_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3367:3: lv_isNot_1_0= KEYWORD_28
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleLikeExpression7297); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleLikeExpression7322); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLikeExpressionAccess().getLIKEKeyword_2());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3386:1: ( (lv_pattern_3_0= RULE_STRING ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3387:1: (lv_pattern_3_0= RULE_STRING )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3387:1: (lv_pattern_3_0= RULE_STRING )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3388:3: lv_pattern_3_0= RULE_STRING
            {
            lv_pattern_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLikeExpression7338); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3412:1: entryRuleInExpression returns [EObject current=null] : iv_ruleInExpression= ruleInExpression EOF ;
    public final EObject entryRuleInExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3413:2: (iv_ruleInExpression= ruleInExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3414:2: iv_ruleInExpression= ruleInExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInExpression_in_entryRuleInExpression7378);
            iv_ruleInExpression=ruleInExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInExpression7388); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3421:1: ruleInExpression returns [EObject current=null] : (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression ) ;
    public final EObject ruleInExpression() throws RecognitionException {
        EObject current = null;

        EObject this_InSeqExpression_0 = null;

        EObject this_InQueryExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3424:28: ( (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3425:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3425:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )
            int alt47=2;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3426:2: this_InSeqExpression_0= ruleInSeqExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInExpressionAccess().getInSeqExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInSeqExpression_in_ruleInExpression7438);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3439:2: this_InQueryExpression_1= ruleInQueryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInExpressionAccess().getInQueryExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInQueryExpression_in_ruleInExpression7468);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3458:1: entryRuleInSeqExpression returns [EObject current=null] : iv_ruleInSeqExpression= ruleInSeqExpression EOF ;
    public final EObject entryRuleInSeqExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInSeqExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3459:2: (iv_ruleInSeqExpression= ruleInSeqExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3460:2: iv_ruleInSeqExpression= ruleInSeqExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInSeqExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInSeqExpression_in_entryRuleInSeqExpression7502);
            iv_ruleInSeqExpression=ruleInSeqExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInSeqExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInSeqExpression7512); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3467:1: ruleInSeqExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2 ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3470:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3471:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3471:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3471:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 otherlv_3= KEYWORD_1 ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= KEYWORD_2
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3471:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3472:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3472:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3473:3: lv_lhs_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInSeqExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7558);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3489:2: ( (lv_isNot_1_0= KEYWORD_28 ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==KEYWORD_28) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3490:1: (lv_isNot_1_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3490:1: (lv_isNot_1_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3491:3: lv_isNot_1_0= KEYWORD_28
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleInSeqExpression7577); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleInSeqExpression7602); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInSeqExpressionAccess().getINKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleInSeqExpression7614); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInSeqExpressionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3515:1: ( (lv_items_4_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3516:1: (lv_items_4_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3516:1: (lv_items_4_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3517:3: lv_items_4_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInSeqExpressionAccess().getItemsVariableParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7634);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3533:2: (otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==KEYWORD_3) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3534:2: otherlv_5= KEYWORD_3 ( (lv_items_6_0= ruleVariable ) )
            	    {
            	    otherlv_5=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleInSeqExpression7648); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getInSeqExpressionAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3538:1: ( (lv_items_6_0= ruleVariable ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3539:1: (lv_items_6_0= ruleVariable )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3539:1: (lv_items_6_0= ruleVariable )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3540:3: lv_items_6_0= ruleVariable
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInSeqExpressionAccess().getItemsVariableParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7668);
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
            	    break loop49;
                }
            } while (true);

            otherlv_7=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleInSeqExpression7683); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3569:1: entryRuleInQueryExpression returns [EObject current=null] : iv_ruleInQueryExpression= ruleInQueryExpression EOF ;
    public final EObject entryRuleInQueryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInQueryExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3570:2: (iv_ruleInQueryExpression= ruleInQueryExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3571:2: iv_ruleInQueryExpression= ruleInQueryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInQueryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInQueryExpression_in_entryRuleInQueryExpression7717);
            iv_ruleInQueryExpression=ruleInQueryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInQueryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInQueryExpression7727); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3578:1: ruleInQueryExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 ( (lv_query_3_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleInQueryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_query_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3581:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 ( (lv_query_3_0= ruleQueryExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3582:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 ( (lv_query_3_0= ruleQueryExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3582:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 ( (lv_query_3_0= ruleQueryExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3582:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_14 ( (lv_query_3_0= ruleQueryExpression ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3582:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3583:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3583:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3584:3: lv_lhs_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInQueryExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleInQueryExpression7773);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3600:2: ( (lv_isNot_1_0= KEYWORD_28 ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==KEYWORD_28) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3601:1: (lv_isNot_1_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3601:1: (lv_isNot_1_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3602:3: lv_isNot_1_0= KEYWORD_28
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleInQueryExpression7792); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleInQueryExpression7817); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInQueryExpressionAccess().getINKeyword_2());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3621:1: ( (lv_query_3_0= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3622:1: (lv_query_3_0= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3622:1: (lv_query_3_0= ruleQueryExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3623:3: lv_query_3_0= ruleQueryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInQueryExpressionAccess().getQueryQueryExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleInQueryExpression7837);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3647:1: entryRuleBetweenExpression returns [EObject current=null] : iv_ruleBetweenExpression= ruleBetweenExpression EOF ;
    public final EObject entryRuleBetweenExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBetweenExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3648:2: (iv_ruleBetweenExpression= ruleBetweenExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3649:2: iv_ruleBetweenExpression= ruleBetweenExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBetweenExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBetweenExpression_in_entryRuleBetweenExpression7872);
            iv_ruleBetweenExpression=ruleBetweenExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBetweenExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBetweenExpression7882); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3656:1: ruleBetweenExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_61 ( (lv_min_3_0= ruleValue ) ) otherlv_4= KEYWORD_20 ( (lv_max_5_0= ruleValue ) ) ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3659:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_61 ( (lv_min_3_0= ruleValue ) ) otherlv_4= KEYWORD_20 ( (lv_max_5_0= ruleValue ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3660:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_61 ( (lv_min_3_0= ruleValue ) ) otherlv_4= KEYWORD_20 ( (lv_max_5_0= ruleValue ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3660:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_61 ( (lv_min_3_0= ruleValue ) ) otherlv_4= KEYWORD_20 ( (lv_max_5_0= ruleValue ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3660:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= KEYWORD_28 ) )? otherlv_2= KEYWORD_61 ( (lv_min_3_0= ruleValue ) ) otherlv_4= KEYWORD_20 ( (lv_max_5_0= ruleValue ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3660:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3661:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3661:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3662:3: lv_lhs_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBetweenExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleBetweenExpression7928);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3678:2: ( (lv_isNot_1_0= KEYWORD_28 ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==KEYWORD_28) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3679:1: (lv_isNot_1_0= KEYWORD_28 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3679:1: (lv_isNot_1_0= KEYWORD_28 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3680:3: lv_isNot_1_0= KEYWORD_28
                    {
                    lv_isNot_1_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleBetweenExpression7947); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleBetweenExpression7972); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBetweenExpressionAccess().getBETWEENKeyword_2());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3699:1: ( (lv_min_3_0= ruleValue ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3700:1: (lv_min_3_0= ruleValue )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3700:1: (lv_min_3_0= ruleValue )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3701:3: lv_min_3_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBetweenExpressionAccess().getMinValueParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleBetweenExpression7992);
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

            otherlv_4=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleBetweenExpression8005); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBetweenExpressionAccess().getANDKeyword_4());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3722:1: ( (lv_max_5_0= ruleValue ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3723:1: (lv_max_5_0= ruleValue )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3723:1: (lv_max_5_0= ruleValue )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3724:3: lv_max_5_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBetweenExpressionAccess().getMaxValueParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleBetweenExpression8025);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3748:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3749:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3750:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable8060);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable8070); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3757:1: ruleVariable returns [EObject current=null] : (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_AliasAttributeExpression_0 = null;

        EObject this_ParameterExpression_1 = null;

        EObject this_Value_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3760:28: ( (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3761:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3761:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue )
            int alt52=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt52=1;
                }
                break;
            case KEYWORD_5:
                {
                alt52=2;
                }
                break;
            case KEYWORD_43:
            case KEYWORD_36:
            case KEYWORD_40:
            case RULE_LITERALTEMPORAL:
            case RULE_INT:
            case RULE_STRING:
                {
                alt52=3;
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3762:2: this_AliasAttributeExpression_0= ruleAliasAttributeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccess().getAliasAttributeExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleVariable8120);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3775:2: this_ParameterExpression_1= ruleParameterExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccess().getParameterExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameterExpression_in_ruleVariable8150);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3788:2: this_Value_2= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccess().getValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleVariable8180);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3807:1: entryRuleExpressionTerm returns [EObject current=null] : iv_ruleExpressionTerm= ruleExpressionTerm EOF ;
    public final EObject entryRuleExpressionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionTerm = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3808:2: (iv_ruleExpressionTerm= ruleExpressionTerm EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3809:2: iv_ruleExpressionTerm= ruleExpressionTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionTermRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionTerm_in_entryRuleExpressionTerm8214);
            iv_ruleExpressionTerm=ruleExpressionTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionTerm8224); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3816:1: ruleExpressionTerm returns [EObject current=null] : (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression ) ;
    public final EObject ruleExpressionTerm() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_QueryExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3819:28: ( (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3820:1: (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3820:1: (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==KEYWORD_43||LA53_0==KEYWORD_36||LA53_0==KEYWORD_40||LA53_0==KEYWORD_5||LA53_0==RULE_LITERALTEMPORAL||(LA53_0>=RULE_ID && LA53_0<=RULE_STRING)) ) {
                alt53=1;
            }
            else if ( (LA53_0==KEYWORD_1) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3821:2: this_Variable_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionTermAccess().getVariableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleExpressionTerm8274);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3834:2: this_QueryExpression_1= ruleQueryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionTermAccess().getQueryExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQueryExpression_in_ruleExpressionTerm8304);
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3853:1: entryRuleAliasAttributeExpression returns [EObject current=null] : iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF ;
    public final EObject entryRuleAliasAttributeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasAttributeExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3854:2: (iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3855:2: iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAliasAttributeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_entryRuleAliasAttributeExpression8338);
            iv_ruleAliasAttributeExpression=ruleAliasAttributeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAliasAttributeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAliasAttributeExpression8348); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3862:1: ruleAliasAttributeExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleAliasAttributeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_attributes_2_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3865:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3866:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3866:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3866:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )*
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3866:2: ( (otherlv_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3867:1: (otherlv_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3867:1: (otherlv_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3868:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAliasAttributeExpressionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8397); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getAliasAttributeExpressionAccess().getAliasVariableDeclarationCrossReference_0_0()); 
              	
            }

            }


            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3882:2: (otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==KEYWORD_4) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3883:2: otherlv_1= KEYWORD_4 ( (lv_attributes_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleAliasAttributeExpression8411); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getAliasAttributeExpressionAccess().getFullStopKeyword_1_0());
            	          
            	    }
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3887:1: ( (lv_attributes_2_0= RULE_ID ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3888:1: (lv_attributes_2_0= RULE_ID )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3888:1: (lv_attributes_2_0= RULE_ID )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3889:3: lv_attributes_2_0= RULE_ID
            	    {
            	    lv_attributes_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8427); if (state.failed) return current;
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
            	    break loop54;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3913:1: entryRuleParameterExpression returns [EObject current=null] : iv_ruleParameterExpression= ruleParameterExpression EOF ;
    public final EObject entryRuleParameterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3914:2: (iv_ruleParameterExpression= ruleParameterExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3915:2: iv_ruleParameterExpression= ruleParameterExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParameterExpression_in_entryRuleParameterExpression8469);
            iv_ruleParameterExpression=ruleParameterExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterExpression8479); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3922:1: ruleParameterExpression returns [EObject current=null] : (otherlv_0= KEYWORD_5 ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameterExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3925:28: ( (otherlv_0= KEYWORD_5 ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3926:1: (otherlv_0= KEYWORD_5 ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3926:1: (otherlv_0= KEYWORD_5 ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3927:2: otherlv_0= KEYWORD_5 ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleParameterExpression8517); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParameterExpressionAccess().getColonKeyword_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3931:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3932:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3932:1: (lv_name_1_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3933:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterExpression8533); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3959:1: entryRuleStringFunction returns [EObject current=null] : iv_ruleStringFunction= ruleStringFunction EOF ;
    public final EObject entryRuleStringFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringFunction = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3960:2: (iv_ruleStringFunction= ruleStringFunction EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3961:2: iv_ruleStringFunction= ruleStringFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleStringFunction_in_entryRuleStringFunction8575);
            iv_ruleStringFunction=ruleStringFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunction8585); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3968:1: ruleStringFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3971:28: ( ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3972:1: ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3972:1: ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3972:2: ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3972:2: ( (lv_name_0_0= ruleStringFunctionName ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3973:1: (lv_name_0_0= ruleStringFunctionName )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3973:1: (lv_name_0_0= ruleStringFunctionName )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3974:3: lv_name_0_0= ruleStringFunctionName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringFunctionAccess().getNameStringFunctionNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStringFunctionName_in_ruleStringFunction8631);
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

            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleStringFunction8644); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStringFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3995:1: ( (lv_params_2_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3996:1: (lv_params_2_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3996:1: (lv_params_2_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:3997:3: lv_params_2_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringFunctionAccess().getParamsVariableParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleStringFunction8664);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4013:2: (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4014:2: otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) )
            {
            otherlv_3=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleStringFunction8678); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getStringFunctionAccess().getCommaKeyword_3_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4018:1: ( (lv_params_4_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4019:1: (lv_params_4_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4019:1: (lv_params_4_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4020:3: lv_params_4_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringFunctionAccess().getParamsVariableParserRuleCall_3_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleStringFunction8698);
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

            otherlv_5=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleStringFunction8712); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4049:1: entryRuleStringFunctionName returns [String current=null] : iv_ruleStringFunctionName= ruleStringFunctionName EOF ;
    public final String entryRuleStringFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringFunctionName = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4050:1: (iv_ruleStringFunctionName= ruleStringFunctionName EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4051:2: iv_ruleStringFunctionName= ruleStringFunctionName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringFunctionNameRule()); 
            }
            pushFollow(FOLLOW_ruleStringFunctionName_in_entryRuleStringFunctionName8747);
            iv_ruleStringFunctionName=ruleStringFunctionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringFunctionName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunctionName8758); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4058:1: ruleStringFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_51 | kw= KEYWORD_63 | kw= KEYWORD_46 | kw= KEYWORD_49 | kw= KEYWORD_56 | kw= KEYWORD_57 ) ;
    public final AntlrDatatypeRuleToken ruleStringFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4062:6: ( (kw= KEYWORD_51 | kw= KEYWORD_63 | kw= KEYWORD_46 | kw= KEYWORD_49 | kw= KEYWORD_56 | kw= KEYWORD_57 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4063:1: (kw= KEYWORD_51 | kw= KEYWORD_63 | kw= KEYWORD_46 | kw= KEYWORD_49 | kw= KEYWORD_56 | kw= KEYWORD_57 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4063:1: (kw= KEYWORD_51 | kw= KEYWORD_63 | kw= KEYWORD_46 | kw= KEYWORD_49 | kw= KEYWORD_56 | kw= KEYWORD_57 )
            int alt55=6;
            switch ( input.LA(1) ) {
            case KEYWORD_51:
                {
                alt55=1;
                }
                break;
            case KEYWORD_63:
                {
                alt55=2;
                }
                break;
            case KEYWORD_46:
                {
                alt55=3;
                }
                break;
            case KEYWORD_49:
                {
                alt55=4;
                }
                break;
            case KEYWORD_56:
                {
                alt55=5;
                }
                break;
            case KEYWORD_57:
                {
                alt55=6;
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4064:2: kw= KEYWORD_51
                    {
                    kw=(Token)match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleStringFunctionName8796); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getCONCATKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4071:2: kw= KEYWORD_63
                    {
                    kw=(Token)match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleStringFunctionName8815); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getSUBSTRINGKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4078:2: kw= KEYWORD_46
                    {
                    kw=(Token)match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleStringFunctionName8834); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getLOWERKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4085:2: kw= KEYWORD_49
                    {
                    kw=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleStringFunctionName8853); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getUPPERKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4092:2: kw= KEYWORD_56
                    {
                    kw=(Token)match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleStringFunctionName8872); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getLENGTHKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4099:2: kw= KEYWORD_57
                    {
                    kw=(Token)match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleStringFunctionName8891); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4112:1: entryRuleNumericFunction returns [EObject current=null] : iv_ruleNumericFunction= ruleNumericFunction EOF ;
    public final EObject entryRuleNumericFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericFunction = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4113:2: (iv_ruleNumericFunction= ruleNumericFunction EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4114:2: iv_ruleNumericFunction= ruleNumericFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericFunction_in_entryRuleNumericFunction8930);
            iv_ruleNumericFunction=ruleNumericFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericFunction8940); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4121:1: ruleNumericFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4124:28: ( ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4125:1: ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4125:1: ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4125:2: ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= KEYWORD_1 ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= KEYWORD_2
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4125:2: ( (lv_name_0_0= ruleNumericFunctionName ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4126:1: (lv_name_0_0= ruleNumericFunctionName )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4126:1: (lv_name_0_0= ruleNumericFunctionName )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4127:3: lv_name_0_0= ruleNumericFunctionName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumericFunctionAccess().getNameNumericFunctionNameParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumericFunctionName_in_ruleNumericFunction8986);
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

            otherlv_1=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleNumericFunction8999); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNumericFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4148:1: ( (lv_params_2_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4149:1: (lv_params_2_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4149:1: (lv_params_2_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4150:3: lv_params_2_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumericFunctionAccess().getParamsVariableParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleNumericFunction9019);
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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4166:2: (otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4167:2: otherlv_3= KEYWORD_3 ( (lv_params_4_0= ruleVariable ) )
            {
            otherlv_3=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleNumericFunction9033); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getNumericFunctionAccess().getCommaKeyword_3_0());
                  
            }
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4171:1: ( (lv_params_4_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4172:1: (lv_params_4_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4172:1: (lv_params_4_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4173:3: lv_params_4_0= ruleVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumericFunctionAccess().getParamsVariableParserRuleCall_3_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVariable_in_ruleNumericFunction9053);
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

            otherlv_5=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleNumericFunction9067); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4202:1: entryRuleNumericFunctionName returns [String current=null] : iv_ruleNumericFunctionName= ruleNumericFunctionName EOF ;
    public final String entryRuleNumericFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumericFunctionName = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4203:1: (iv_ruleNumericFunctionName= ruleNumericFunctionName EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4204:2: iv_ruleNumericFunctionName= ruleNumericFunctionName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericFunctionNameRule()); 
            }
            pushFollow(FOLLOW_ruleNumericFunctionName_in_entryRuleNumericFunctionName9102);
            iv_ruleNumericFunctionName=ruleNumericFunctionName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericFunctionName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericFunctionName9113); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4211:1: ruleNumericFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_18 | kw= KEYWORD_39 | kw= KEYWORD_26 | kw= KEYWORD_37 ) ;
    public final AntlrDatatypeRuleToken ruleNumericFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4215:6: ( (kw= KEYWORD_18 | kw= KEYWORD_39 | kw= KEYWORD_26 | kw= KEYWORD_37 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4216:1: (kw= KEYWORD_18 | kw= KEYWORD_39 | kw= KEYWORD_26 | kw= KEYWORD_37 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4216:1: (kw= KEYWORD_18 | kw= KEYWORD_39 | kw= KEYWORD_26 | kw= KEYWORD_37 )
            int alt56=4;
            switch ( input.LA(1) ) {
            case KEYWORD_18:
                {
                alt56=1;
                }
                break;
            case KEYWORD_39:
                {
                alt56=2;
                }
                break;
            case KEYWORD_26:
                {
                alt56=3;
                }
                break;
            case KEYWORD_37:
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4217:2: kw= KEYWORD_18
                    {
                    kw=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleNumericFunctionName9151); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumericFunctionNameAccess().getABSKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4224:2: kw= KEYWORD_39
                    {
                    kw=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleNumericFunctionName9170); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumericFunctionNameAccess().getSQRTKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4231:2: kw= KEYWORD_26
                    {
                    kw=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleNumericFunctionName9189); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNumericFunctionNameAccess().getMODKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4238:2: kw= KEYWORD_37
                    {
                    kw=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleNumericFunctionName9208); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4253:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4254:2: (iv_ruleValue= ruleValue EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4255:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue9249);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue9259); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4262:1: ruleValue returns [EObject current=null] : (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression | this_DateTimeExpression_4= ruleDateTimeExpression ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerExpression_0 = null;

        EObject this_StringExpression_1 = null;

        EObject this_NullExpression_2 = null;

        EObject this_BooleanExpression_3 = null;

        EObject this_DateTimeExpression_4 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4265:28: ( (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression | this_DateTimeExpression_4= ruleDateTimeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4266:1: (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression | this_DateTimeExpression_4= ruleDateTimeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4266:1: (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression | this_DateTimeExpression_4= ruleDateTimeExpression )
            int alt57=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt57=1;
                }
                break;
            case RULE_STRING:
                {
                alt57=2;
                }
                break;
            case KEYWORD_36:
                {
                alt57=3;
                }
                break;
            case KEYWORD_43:
            case KEYWORD_40:
                {
                alt57=4;
                }
                break;
            case RULE_LITERALTEMPORAL:
                {
                alt57=5;
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4267:2: this_IntegerExpression_0= ruleIntegerExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getIntegerExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerExpression_in_ruleValue9309);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4280:2: this_StringExpression_1= ruleStringExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getStringExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringExpression_in_ruleValue9339);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4293:2: this_NullExpression_2= ruleNullExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getNullExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullExpression_in_ruleValue9369);
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4306:2: this_BooleanExpression_3= ruleBooleanExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getBooleanExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleValue9399);
                    this_BooleanExpression_3=ruleBooleanExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_BooleanExpression_3;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4319:2: this_DateTimeExpression_4= ruleDateTimeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getDateTimeExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDateTimeExpression_in_ruleValue9429);
                    this_DateTimeExpression_4=ruleDateTimeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_DateTimeExpression_4;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4338:1: entryRuleIntegerExpression returns [EObject current=null] : iv_ruleIntegerExpression= ruleIntegerExpression EOF ;
    public final EObject entryRuleIntegerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4339:2: (iv_ruleIntegerExpression= ruleIntegerExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4340:2: iv_ruleIntegerExpression= ruleIntegerExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerExpression_in_entryRuleIntegerExpression9463);
            iv_ruleIntegerExpression=ruleIntegerExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerExpression9473); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4347:1: ruleIntegerExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4350:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4351:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4351:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4352:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4352:1: (lv_value_0_0= RULE_INT )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4353:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerExpression9514); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4377:1: entryRuleStringExpression returns [EObject current=null] : iv_ruleStringExpression= ruleStringExpression EOF ;
    public final EObject entryRuleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4378:2: (iv_ruleStringExpression= ruleStringExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4379:2: iv_ruleStringExpression= ruleStringExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleStringExpression_in_entryRuleStringExpression9553);
            iv_ruleStringExpression=ruleStringExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringExpression9563); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4386:1: ruleStringExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4389:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4390:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4390:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4391:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4391:1: (lv_value_0_0= RULE_STRING )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4392:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringExpression9604); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4416:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4417:2: (iv_ruleNullExpression= ruleNullExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4418:2: iv_ruleNullExpression= ruleNullExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNullExpression_in_entryRuleNullExpression9643);
            iv_ruleNullExpression=ruleNullExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullExpression9653); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4425:1: ruleNullExpression returns [EObject current=null] : ( (lv_value_0_0= KEYWORD_36 ) ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4428:28: ( ( (lv_value_0_0= KEYWORD_36 ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4429:1: ( (lv_value_0_0= KEYWORD_36 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4429:1: ( (lv_value_0_0= KEYWORD_36 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4430:1: (lv_value_0_0= KEYWORD_36 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4430:1: (lv_value_0_0= KEYWORD_36 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4431:3: lv_value_0_0= KEYWORD_36
            {
            lv_value_0_0=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleNullExpression9696); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4453:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4454:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4455:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression9741);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression9751); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4462:1: ruleBooleanExpression returns [EObject current=null] : ( ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) ) ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4465:28: ( ( ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4466:1: ( ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4466:1: ( ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4467:1: ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4467:1: ( (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4468:1: (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4468:1: (lv_value_0_1= KEYWORD_40 | lv_value_0_2= KEYWORD_43 )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==KEYWORD_40) ) {
                alt58=1;
            }
            else if ( (LA58_0==KEYWORD_43) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4469:3: lv_value_0_1= KEYWORD_40
                    {
                    lv_value_0_1=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleBooleanExpression9796); if (state.failed) return current;
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4482:8: lv_value_0_2= KEYWORD_43
                    {
                    lv_value_0_2=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleBooleanExpression9824); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDateTimeExpression"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4506:1: entryRuleDateTimeExpression returns [EObject current=null] : iv_ruleDateTimeExpression= ruleDateTimeExpression EOF ;
    public final EObject entryRuleDateTimeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTimeExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4507:2: (iv_ruleDateTimeExpression= ruleDateTimeExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4508:2: iv_ruleDateTimeExpression= ruleDateTimeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDateTimeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleDateTimeExpression_in_entryRuleDateTimeExpression9872);
            iv_ruleDateTimeExpression=ruleDateTimeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDateTimeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateTimeExpression9882); if (state.failed) return current;

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateTimeExpression"


    // $ANTLR start "ruleDateTimeExpression"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4515:1: ruleDateTimeExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_LITERALTEMPORAL ) ) ;
    public final EObject ruleDateTimeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4518:28: ( ( (lv_value_0_0= RULE_LITERALTEMPORAL ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4519:1: ( (lv_value_0_0= RULE_LITERALTEMPORAL ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4519:1: ( (lv_value_0_0= RULE_LITERALTEMPORAL ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4520:1: (lv_value_0_0= RULE_LITERALTEMPORAL )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4520:1: (lv_value_0_0= RULE_LITERALTEMPORAL )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4521:3: lv_value_0_0= RULE_LITERALTEMPORAL
            {
            lv_value_0_0=(Token)match(input,RULE_LITERALTEMPORAL,FOLLOW_RULE_LITERALTEMPORAL_in_ruleDateTimeExpression9923); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getDateTimeExpressionAccess().getValueLiteralTemporalTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDateTimeExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"LiteralTemporal");
              	    
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
    // $ANTLR end "ruleDateTimeExpression"


    // $ANTLR start "entryRuleQueryExpression"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4545:1: entryRuleQueryExpression returns [EObject current=null] : iv_ruleQueryExpression= ruleQueryExpression EOF ;
    public final EObject entryRuleQueryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4546:2: (iv_ruleQueryExpression= ruleQueryExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4547:2: iv_ruleQueryExpression= ruleQueryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQueryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleQueryExpression_in_entryRuleQueryExpression9962);
            iv_ruleQueryExpression=ruleQueryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQueryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryExpression9972); if (state.failed) return current;

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4554:1: ruleQueryExpression returns [EObject current=null] : (otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2 ) ;
    public final EObject ruleQueryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_SelectStatement_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4557:28: ( (otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2 ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4558:1: (otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2 )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4558:1: (otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2 )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4559:2: otherlv_0= KEYWORD_1 this_SelectStatement_1= ruleSelectStatement otherlv_2= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleQueryExpression10010); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getQueryExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQueryExpressionAccess().getSelectStatementParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleQueryExpression10034);
            this_SelectStatement_1=ruleSelectStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_SelectStatement_1;
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleQueryExpression10046); if (state.failed) return current;
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4588:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_8 ) | (enumLiteral_2= KEYWORD_10 ) | (enumLiteral_3= KEYWORD_11 ) | (enumLiteral_4= KEYWORD_7 ) | (enumLiteral_5= KEYWORD_9 ) ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4590:28: ( ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_8 ) | (enumLiteral_2= KEYWORD_10 ) | (enumLiteral_3= KEYWORD_11 ) | (enumLiteral_4= KEYWORD_7 ) | (enumLiteral_5= KEYWORD_9 ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4591:1: ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_8 ) | (enumLiteral_2= KEYWORD_10 ) | (enumLiteral_3= KEYWORD_11 ) | (enumLiteral_4= KEYWORD_7 ) | (enumLiteral_5= KEYWORD_9 ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4591:1: ( (enumLiteral_0= KEYWORD_6 ) | (enumLiteral_1= KEYWORD_8 ) | (enumLiteral_2= KEYWORD_10 ) | (enumLiteral_3= KEYWORD_11 ) | (enumLiteral_4= KEYWORD_7 ) | (enumLiteral_5= KEYWORD_9 ) )
            int alt59=6;
            switch ( input.LA(1) ) {
            case KEYWORD_6:
                {
                alt59=1;
                }
                break;
            case KEYWORD_8:
                {
                alt59=2;
                }
                break;
            case KEYWORD_10:
                {
                alt59=3;
                }
                break;
            case KEYWORD_11:
                {
                alt59=4;
                }
                break;
            case KEYWORD_7:
                {
                alt59=5;
                }
                break;
            case KEYWORD_9:
                {
                alt59=6;
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
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4591:2: (enumLiteral_0= KEYWORD_6 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4591:2: (enumLiteral_0= KEYWORD_6 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4591:7: enumLiteral_0= KEYWORD_6
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleOperator10098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getLessThenEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getLessThenEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4597:6: (enumLiteral_1= KEYWORD_8 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4597:6: (enumLiteral_1= KEYWORD_8 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4597:11: enumLiteral_1= KEYWORD_8
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleOperator10120); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getGreaterThenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getGreaterThenEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4603:6: (enumLiteral_2= KEYWORD_10 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4603:6: (enumLiteral_2= KEYWORD_10 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4603:11: enumLiteral_2= KEYWORD_10
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleOperator10142); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getLessEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getLessEqualEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4609:6: (enumLiteral_3= KEYWORD_11 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4609:6: (enumLiteral_3= KEYWORD_11 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4609:11: enumLiteral_3= KEYWORD_11
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleOperator10164); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4615:6: (enumLiteral_4= KEYWORD_7 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4615:6: (enumLiteral_4= KEYWORD_7 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4615:11: enumLiteral_4= KEYWORD_7
                    {
                    enumLiteral_4=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleOperator10186); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4621:6: (enumLiteral_5= KEYWORD_9 )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4621:6: (enumLiteral_5= KEYWORD_9 )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQLParser.g:4621:11: enumLiteral_5= KEYWORD_9
                    {
                    enumLiteral_5=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleOperator10208); if (state.failed) return current;
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


    protected DFA28 dfa28 = new DFA28(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA47 dfa47 = new DFA47(this);
    static final String DFA28_eotS =
        "\7\uffff";
    static final String DFA28_eofS =
        "\1\uffff\1\3\2\uffff\1\5\1\uffff\1\3";
    static final String DFA28_minS =
        "\1\114\1\15\1\114\1\uffff\1\15\1\uffff\1\15";
    static final String DFA28_maxS =
        "\3\114\1\uffff\1\114\1\uffff\1\114";
    static final String DFA28_acceptS =
        "\3\uffff\1\1\1\uffff\1\2\1\uffff";
    static final String DFA28_specialS =
        "\7\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\1",
            "\1\3\14\uffff\1\3\2\uffff\1\3\25\uffff\1\3\4\uffff\1\5\6\uffff"+
            "\2\3\1\2\12\uffff\1\4",
            "\1\6",
            "",
            "\1\5\12\uffff\1\5\1\uffff\1\5\2\uffff\1\5\2\uffff\2\5\21\uffff"+
            "\1\5\13\uffff\2\5\1\uffff\1\3\11\uffff\1\5",
            "",
            "\1\3\14\uffff\1\3\2\uffff\1\3\25\uffff\1\3\4\uffff\1\5\6\uffff"+
            "\2\3\1\2\12\uffff\1\4"
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1881:1: (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar )";
        }
    }
    static final String DFA40_eotS =
        "\33\uffff";
    static final String DFA40_eofS =
        "\33\uffff";
    static final String DFA40_minS =
        "\1\14\1\uffff\1\11\1\114\6\11\4\uffff\1\114\1\11\3\uffff\1\25\2"+
        "\uffff\2\11\1\25\2\uffff";
    static final String DFA40_maxS =
        "\1\116\1\uffff\1\105\1\114\6\105\4\uffff\1\114\1\72\3\uffff\1\62"+
        "\2\uffff\2\105\1\43\2\uffff";
    static final String DFA40_acceptS =
        "\1\uffff\1\1\10\uffff\1\3\1\4\1\5\1\6\2\uffff\1\14\1\13\1\12\1\uffff"+
        "\1\2\1\7\3\uffff\1\10\1\11";
    static final String DFA40_specialS =
        "\33\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\12\11\uffff\1\10\14\uffff\1\6\1\uffff\1\15\1\uffff\1\7\1"+
            "\uffff\1\13\1\uffff\1\14\6\uffff\1\12\13\uffff\1\1\3\uffff\1"+
            "\3\6\uffff\1\11\2\uffff\1\2\1\4\1\5",
            "",
            "\1\20\7\uffff\1\25\20\uffff\1\22\17\uffff\1\17\2\uffff\3\24"+
            "\2\uffff\1\21\1\23\5\uffff\1\16\1\uffff\3\24",
            "\1\26",
            "\1\20\7\uffff\1\25\20\uffff\1\22\17\uffff\1\17\2\uffff\3\24"+
            "\2\uffff\1\21\1\23\7\uffff\3\24",
            "\1\20\7\uffff\1\25\20\uffff\1\22\17\uffff\1\17\2\uffff\3\24"+
            "\2\uffff\1\21\1\23\7\uffff\3\24",
            "\1\20\7\uffff\1\25\20\uffff\1\22\17\uffff\1\17\2\uffff\3\24"+
            "\2\uffff\1\21\1\23\7\uffff\3\24",
            "\1\20\7\uffff\1\25\20\uffff\1\22\17\uffff\1\17\2\uffff\3\24"+
            "\2\uffff\1\21\1\23\7\uffff\3\24",
            "\1\20\7\uffff\1\25\20\uffff\1\22\17\uffff\1\17\2\uffff\3\24"+
            "\2\uffff\1\21\1\23\7\uffff\3\24",
            "\1\20\7\uffff\1\25\20\uffff\1\22\17\uffff\1\17\2\uffff\3\24"+
            "\2\uffff\1\21\1\23\7\uffff\3\24",
            "",
            "",
            "",
            "",
            "\1\27",
            "\1\20\7\uffff\1\25\20\uffff\1\22\27\uffff\1\21",
            "",
            "",
            "",
            "\1\32\15\uffff\1\31\16\uffff\1\30",
            "",
            "",
            "\1\20\7\uffff\1\25\20\uffff\1\22\17\uffff\1\17\2\uffff\3\24"+
            "\2\uffff\1\21\1\23\7\uffff\3\24",
            "\1\20\7\uffff\1\25\20\uffff\1\22\17\uffff\1\17\2\uffff\3\24"+
            "\2\uffff\1\21\1\23\5\uffff\1\16\1\uffff\3\24",
            "\1\32\15\uffff\1\31",
            "",
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "2648:1: (this_ParExpression_0= ruleParExpression | this_OperatorExpression_1= ruleOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression )";
        }
    }
    static final String DFA47_eotS =
        "\21\uffff";
    static final String DFA47_eofS =
        "\21\uffff";
    static final String DFA47_minS =
        "\1\26\1\62\1\114\6\62\1\114\1\72\1\76\2\62\1\22\2\uffff";
    static final String DFA47_maxS =
        "\1\116\1\101\1\114\6\72\1\114\1\72\1\76\1\72\1\101\1\116\2\uffff";
    static final String DFA47_acceptS =
        "\17\uffff\1\2\1\1";
    static final String DFA47_specialS =
        "\21\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\7\14\uffff\1\5\3\uffff\1\6\32\uffff\1\2\6\uffff\1\10\2\uffff"+
            "\1\1\1\3\1\4",
            "\1\12\7\uffff\1\13\6\uffff\1\11",
            "\1\14",
            "\1\12\7\uffff\1\13",
            "\1\12\7\uffff\1\13",
            "\1\12\7\uffff\1\13",
            "\1\12\7\uffff\1\13",
            "\1\12\7\uffff\1\13",
            "\1\12\7\uffff\1\13",
            "\1\15",
            "\1\13",
            "\1\16",
            "\1\12\7\uffff\1\13",
            "\1\12\7\uffff\1\13\6\uffff\1\11",
            "\1\17\3\uffff\1\20\10\uffff\1\17\3\uffff\1\20\3\uffff\1\20"+
            "\32\uffff\1\20\6\uffff\1\20\2\uffff\3\20",
            "",
            ""
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "3425:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleQueryModule_in_entryRuleQueryModule73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryModule83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleQueryModule129 = new BitSet(new long[]{0x00000000800C4802L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJPQLQuery_in_ruleQueryModule151 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleNamedQuery_in_ruleQueryModule173 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleImport257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedQuery_in_entryRuleNamedQuery313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedQuery323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedQuery365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleNamedQuery383 = new BitSet(new long[]{0x00000000800C0800L});
    public static final BitSet FOLLOW_ruleJPQLQuery_in_ruleNamedQuery403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJPQLQuery_in_entryRuleJPQLQuery438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJPQLQuery448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleJPQLQuery498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_ruleJPQLQuery528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_ruleJPQLQuery558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectStatement602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectFromClause_in_ruleSelectStatement648 = new BitSet(new long[]{0x0000000024002002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleSelectStatement669 = new BitSet(new long[]{0x0000000004002002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_ruleSelectStatement691 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleOrderClause_in_ruleSelectStatement713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_entryRuleHavingClause749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingClause759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleHavingClause797 = new BitSet(new long[]{0x40040AA800401000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleHavingClause817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderClause_in_entryRuleOrderClause852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderClause862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleOrderClause900 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleOrderClause912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleOrderItem_in_ruleOrderClause932 = new BitSet(new long[]{0x0000100040000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleOrderClause946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleOrderItem_in_ruleOrderClause966 = new BitSet(new long[]{0x0000100040000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleOrderClause988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleOrderClause1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderItem_in_entryRuleOrderItem1072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderItem1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrderItem1131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleOrderItem1144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrderItem1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateClause_in_ruleUpdateStatement1256 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleSetClause_in_ruleUpdateStatement1277 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleUpdateStatement1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateClause_in_entryRuleUpdateClause1334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateClause1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleUpdateClause1382 = new BitSet(new long[]{0x0400000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleUpdateClause1402 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleUpdateClause1416 = new BitSet(new long[]{0x0400000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleUpdateClause1436 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleSetClause_in_entryRuleSetClause1473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetClause1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleSetClause1521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_ruleSetClause1541 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSetClause1555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_ruleSetClause1575 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_entryRuleUpdateItem1612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateItem1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleUpdateItem1668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleUpdateItem1681 = new BitSet(new long[]{0x0000008800400000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleValue_in_ruleUpdateItem1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement1736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteStatement1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteClause_in_ruleDeleteStatement1792 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleDeleteStatement1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteClause_in_entryRuleDeleteClause1849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteClause1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleDeleteClause1897 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_ruleFromClause_in_ruleDeleteClause1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectFromClause_in_entryRuleSelectFromClause1952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectFromClause1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_ruleSelectFromClause2008 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_ruleFromClause_in_ruleSelectFromClause2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_entryRuleSelectClause2065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectClause2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_ruleSelectClause2113 = new BitSet(new long[]{0x0012E00000100100L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleSelectClause2131 = new BitSet(new long[]{0x0012E00000100100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectClause2164 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSelectClause2178 = new BitSet(new long[]{0x0012E00000100100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectClause2198 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression2235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectExpression2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectExpression2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAggregateExpression_in_ruleSelectExpression2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstructorExpression_in_ruleSelectExpression2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAggregateExpression_in_entryRuleSelectAggregateExpression2389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectAggregateExpression2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgAggregate_in_ruleSelectAggregateExpression2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxAggregate_in_ruleSelectAggregateExpression2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinAggregate_in_ruleSelectAggregateExpression2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumAggregate_in_ruleSelectAggregateExpression2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountAggregate_in_ruleSelectAggregateExpression2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgAggregate_in_entryRuleAvgAggregate2603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvgAggregate2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleAvgAggregate2651 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleAvgAggregate2663 = new BitSet(new long[]{0x0000000000000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleAvgAggregate2681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleAvgAggregate2714 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleAvgAggregate2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxAggregate_in_entryRuleMaxAggregate2761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxAggregate2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleMaxAggregate2809 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleMaxAggregate2821 = new BitSet(new long[]{0x0000000000000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleMaxAggregate2839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleMaxAggregate2872 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleMaxAggregate2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinAggregate_in_entryRuleMinAggregate2919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinAggregate2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleMinAggregate2967 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleMinAggregate2979 = new BitSet(new long[]{0x0000000000000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleMinAggregate2997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleMinAggregate3030 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleMinAggregate3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumAggregate_in_entryRuleSumAggregate3077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumAggregate3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleSumAggregate3125 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleSumAggregate3137 = new BitSet(new long[]{0x0000000000000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleSumAggregate3155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSumAggregate3188 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSumAggregate3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountAggregate_in_entryRuleCountAggregate3235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCountAggregate3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleCountAggregate3283 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleCountAggregate3295 = new BitSet(new long[]{0x0000000000000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleCountAggregate3313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleCountAggregate3346 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleCountAggregate3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstructorExpression_in_entryRuleSelectConstructorExpression3393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectConstructorExpression3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleSelectConstructorExpression3441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectConstructorExpression3457 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleSelectConstructorExpression3475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3495 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSelectConstructorExpression3509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3529 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleSelectConstructorExpression3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClause_in_entryRuleFromClause3578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClause3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleFromClause3626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleFromClass_in_ruleFromClause3646 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleFromClause3660 = new BitSet(new long[]{0x0400000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleFromClause3680 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleFromEntry_in_entryRuleFromEntry3717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromEntry3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClass_in_ruleFromEntry3777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromCollection_in_ruleFromEntry3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration3851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleVariableDeclaration3890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClass_in_entryRuleFromClass3948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClass3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassId_in_ruleFromClass4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassVar_in_ruleFromClass4038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_entryRuleQualifiedIdentifier4073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedIdentifier4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier4124 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleQualifiedIdentifier4143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedIdentifier4158 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassId_in_entryRuleFromClassId4204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClassId4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleFromClassId4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassVar_in_entryRuleFromClassVar4293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClassVar4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedIdentifier_in_ruleFromClassVar4349 = new BitSet(new long[]{0x0100000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleFromClassVar4370 = new BitSet(new long[]{0x0000000301000002L});
    public static final BitSet FOLLOW_ruleFromJoin_in_ruleFromClassVar4391 = new BitSet(new long[]{0x0000000301000002L});
    public static final BitSet FOLLOW_ruleFromCollection_in_entryRuleFromCollection4427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromCollection4437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleFromCollection4475 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleFromCollection4487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleFromCollection4507 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleFromCollection4520 = new BitSet(new long[]{0x0100000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleFromCollection4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromJoin_in_entryRuleFromJoin4575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromJoin4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_ruleFromJoin4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftJoin_in_ruleFromJoin4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerJoin_in_ruleFromJoin4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_entryRuleJoin4729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoin4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleJoin4777 = new BitSet(new long[]{0x0000000000800000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleJoin4795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleJoin4828 = new BitSet(new long[]{0x0100000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleJoin4849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftJoin_in_entryRuleLeftJoin4884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftJoin4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleLeftJoin4932 = new BitSet(new long[]{0x0000000108000000L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleLeftJoin4950 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleLeftJoin4975 = new BitSet(new long[]{0x0000000000800000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleLeftJoin4993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleLeftJoin5026 = new BitSet(new long[]{0x0100000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleLeftJoin5047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerJoin_in_entryRuleInnerJoin5082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInnerJoin5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleInnerJoin5130 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleInnerJoin5142 = new BitSet(new long[]{0x0000000000800000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleInnerJoin5160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleInnerJoin5193 = new BitSet(new long[]{0x0100000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInnerJoin5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_entryRuleWhereClause5249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereClause5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleWhereClause5297 = new BitSet(new long[]{0x40040AA800401000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleWhereClause5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression5352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression5362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression5412 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleOrExpression5438 = new BitSet(new long[]{0x40040AA800401000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression5458 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression5497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression5507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteExpression_in_ruleAndExpression5557 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleAndExpression5583 = new BitSet(new long[]{0x40040AA800401000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleConcreteExpression_in_ruleAndExpression5603 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleConcreteExpression_in_entryRuleConcreteExpression5642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcreteExpression5652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParExpression_in_ruleConcreteExpression5702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorExpression_in_ruleConcreteExpression5732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsExpression_in_ruleConcreteExpression5762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllExpression_in_ruleConcreteExpression5792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyExpression_in_ruleConcreteExpression5822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeExpression_in_ruleConcreteExpression5852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_ruleConcreteExpression5882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullComparisonExpression_in_ruleConcreteExpression5912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyComparisonExpression_in_ruleConcreteExpression5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikeExpression_in_ruleConcreteExpression5972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpression_in_ruleConcreteExpression6002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBetweenExpression_in_ruleConcreteExpression6032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParExpression_in_entryRuleParExpression6066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParExpression6076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleParExpression6114 = new BitSet(new long[]{0x4000008800400000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_ruleParExpression6138 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleParExpression6150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorExpression_in_entryRuleOperatorExpression6184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorExpression6194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleOperatorExpression6240 = new BitSet(new long[]{0x00E0000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleOperatorExpression6261 = new BitSet(new long[]{0x4000008800400000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_ruleOperatorExpression6282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsExpression_in_entryRuleExistsExpression6317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExistsExpression6327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleExistsExpression6371 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleExistsExpression6396 = new BitSet(new long[]{0x4000008800400000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleExistsExpression6416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllExpression_in_entryRuleAllExpression6451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllExpression6461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleAllExpression6499 = new BitSet(new long[]{0x4000008800400000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleAllExpression6519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyExpression_in_entryRuleAnyExpression6554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnyExpression6564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleAnyExpression6602 = new BitSet(new long[]{0x4000008800400000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleAnyExpression6622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeExpression_in_entryRuleSomeExpression6657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSomeExpression6667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleSomeExpression6705 = new BitSet(new long[]{0x4000008800400000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleSomeExpression6725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression6760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionExpression6770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCollectionExpression6816 = new BitSet(new long[]{0x0004000000020000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleCollectionExpression6835 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleCollectionExpression6860 = new BitSet(new long[]{0x1000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleCollectionExpression6873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleCollectionExpression6895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullComparisonExpression_in_entryRuleNullComparisonExpression6930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullComparisonExpression6940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNullComparisonExpression6986 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleNullComparisonExpression6999 = new BitSet(new long[]{0x0004000800000000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleNullComparisonExpression7017 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleNullComparisonExpression7042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyComparisonExpression_in_entryRuleEmptyComparisonExpression7076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmptyComparisonExpression7086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleEmptyComparisonExpression7132 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleEmptyComparisonExpression7145 = new BitSet(new long[]{0x0004000000200000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleEmptyComparisonExpression7163 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleEmptyComparisonExpression7188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikeExpression_in_entryRuleLikeExpression7222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLikeExpression7232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleLikeExpression7278 = new BitSet(new long[]{0x0004000400000000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleLikeExpression7297 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleLikeExpression7322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLikeExpression7338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpression_in_entryRuleInExpression7378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInExpression7388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInSeqExpression_in_ruleInExpression7438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInQueryExpression_in_ruleInExpression7468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInSeqExpression_in_entryRuleInSeqExpression7502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInSeqExpression7512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7558 = new BitSet(new long[]{0x0404000000000000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleInSeqExpression7577 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleInSeqExpression7602 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleInSeqExpression7614 = new BitSet(new long[]{0x0000008800400000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7634 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleInSeqExpression7648 = new BitSet(new long[]{0x0000008800400000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7668 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleInSeqExpression7683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInQueryExpression_in_entryRuleInQueryExpression7717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInQueryExpression7727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInQueryExpression7773 = new BitSet(new long[]{0x0404000000000000L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleInQueryExpression7792 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleInQueryExpression7817 = new BitSet(new long[]{0x4000008800400000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleInQueryExpression7837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBetweenExpression_in_entryRuleBetweenExpression7872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBetweenExpression7882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleBetweenExpression7928 = new BitSet(new long[]{0x0004000000000200L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleBetweenExpression7947 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleBetweenExpression7972 = new BitSet(new long[]{0x0000008800400000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBetweenExpression7992 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleBetweenExpression8005 = new BitSet(new long[]{0x0000008800400000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBetweenExpression8025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable8060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable8070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleVariable8120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_ruleVariable8150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleVariable8180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_entryRuleExpressionTerm8214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionTerm8224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleExpressionTerm8274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleExpressionTerm8304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_entryRuleAliasAttributeExpression8338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAliasAttributeExpression8348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8397 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleAliasAttributeExpression8411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8427 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_entryRuleParameterExpression8469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterExpression8479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleParameterExpression8517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterExpression8533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_entryRuleStringFunction8575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunction8585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunctionName_in_ruleStringFunction8631 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleStringFunction8644 = new BitSet(new long[]{0x0000008800400000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunction8664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleStringFunction8678 = new BitSet(new long[]{0x0000008800400000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunction8698 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleStringFunction8712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunctionName_in_entryRuleStringFunctionName8747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunctionName8758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleStringFunctionName8796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleStringFunctionName8815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleStringFunctionName8834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleStringFunctionName8853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleStringFunctionName8872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleStringFunctionName8891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFunction_in_entryRuleNumericFunction8930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericFunction8940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFunctionName_in_ruleNumericFunction8986 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleNumericFunction8999 = new BitSet(new long[]{0x0000008800400000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNumericFunction9019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleNumericFunction9033 = new BitSet(new long[]{0x0000008800400000L,0x0000000000007204L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNumericFunction9053 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleNumericFunction9067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFunctionName_in_entryRuleNumericFunctionName9102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericFunctionName9113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleNumericFunctionName9151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleNumericFunctionName9170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleNumericFunctionName9189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleNumericFunctionName9208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue9249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue9259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerExpression_in_ruleValue9309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_ruleValue9339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_ruleValue9369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleValue9399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeExpression_in_ruleValue9429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerExpression_in_entryRuleIntegerExpression9463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerExpression9473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerExpression9514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_entryRuleStringExpression9553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringExpression9563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringExpression9604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_entryRuleNullExpression9643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullExpression9653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleNullExpression9696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression9741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression9751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleBooleanExpression9796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleBooleanExpression9824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeExpression_in_entryRuleDateTimeExpression9872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateTimeExpression9882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LITERALTEMPORAL_in_ruleDateTimeExpression9923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_entryRuleQueryExpression9962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryExpression9972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleQueryExpression10010 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleQueryExpression10034 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleQueryExpression10046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleOperator10098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleOperator10120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleOperator10142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleOperator10164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleOperator10186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleOperator10208 = new BitSet(new long[]{0x0000000000000002L});

}