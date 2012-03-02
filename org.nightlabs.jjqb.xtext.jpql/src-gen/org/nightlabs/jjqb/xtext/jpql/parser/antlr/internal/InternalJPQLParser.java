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

@SuppressWarnings("all")
public class InternalJPQLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_LITERALTEMPORAL", "RULE_DATE_LITERAL", "RULE_TIME_LITERAL", "RULE_TIMESTAMP_LITERAL", "RULE_DATE_STRING", "RULE_TIME_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'IMPORT'", "':'", "'HAVING'", "'ORDER'", "'BY'", "','", "'ASC'", "'DESC'", "'.'", "'UPDATE'", "'SET'", "'='", "'DELETE'", "'SELECT'", "'DISTINCT'", "'AVG'", "'('", "')'", "'MAX'", "'MIN'", "'SUM'", "'COUNT'", "'NEW'", "'FROM'", "'AS'", "'IN'", "'JOIN'", "'FETCH'", "'LEFT'", "'OUTER'", "'INNER'", "'WHERE'", "'OR'", "'AND'", "'NOT'", "'EXISTS'", "'ALL'", "'ANY'", "'SOME'", "'MEMBER'", "'OF'", "'IS'", "'NULL'", "'EMPTY'", "'LIKE'", "'BETWEEN'", "'CONCAT'", "'SUBSTRING'", "'LOWER'", "'UPPER'", "'LENGTH'", "'LOCATE'", "'ABS'", "'SQRT'", "'MOD'", "'SIZE'", "'TRUE'", "'FALSE'", "'<'", "'>'", "'<='", "'>='", "'!='"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int RULE_DATE_STRING=11;
    public static final int RULE_TIME_LITERAL=9;
    public static final int T__50=50;
    public static final int RULE_DATE_LITERAL=8;
    public static final int RULE_TIMESTAMP_LITERAL=10;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_LITERALTEMPORAL=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_TIME_STRING=12;
    public static final int RULE_WS=15;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalJPQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJPQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJPQLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g"; }



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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:68:1: entryRuleQueryModule returns [EObject current=null] : iv_ruleQueryModule= ruleQueryModule EOF ;
    public final EObject entryRuleQueryModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryModule = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:69:2: (iv_ruleQueryModule= ruleQueryModule EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:70:2: iv_ruleQueryModule= ruleQueryModule EOF
            {
             newCompositeNode(grammarAccess.getQueryModuleRule()); 
            pushFollow(FOLLOW_ruleQueryModule_in_entryRuleQueryModule75);
            iv_ruleQueryModule=ruleQueryModule();

            state._fsp--;

             current =iv_ruleQueryModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryModule85); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:77:1: ruleQueryModule returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_defaultQuery_1_0= ruleJPQLQuery ) )? ( (lv_namedQueries_2_0= ruleNamedQuery ) )* ) ;
    public final EObject ruleQueryModule() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_defaultQuery_1_0 = null;

        EObject lv_namedQueries_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:80:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_defaultQuery_1_0= ruleJPQLQuery ) )? ( (lv_namedQueries_2_0= ruleNamedQuery ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_defaultQuery_1_0= ruleJPQLQuery ) )? ( (lv_namedQueries_2_0= ruleNamedQuery ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_defaultQuery_1_0= ruleJPQLQuery ) )? ( (lv_namedQueries_2_0= ruleNamedQuery ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:81:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_defaultQuery_1_0= ruleJPQLQuery ) )? ( (lv_namedQueries_2_0= ruleNamedQuery ) )*
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:81:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:82:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:82:1: (lv_imports_0_0= ruleImport )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:83:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQueryModuleAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleQueryModule131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:99:3: ( (lv_defaultQuery_1_0= ruleJPQLQuery ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26||(LA2_0>=29 && LA2_0<=30)||LA2_0==40) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:100:1: (lv_defaultQuery_1_0= ruleJPQLQuery )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:100:1: (lv_defaultQuery_1_0= ruleJPQLQuery )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:101:3: lv_defaultQuery_1_0= ruleJPQLQuery
                    {
                     
                    	        newCompositeNode(grammarAccess.getQueryModuleAccess().getDefaultQueryJPQLQueryParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJPQLQuery_in_ruleQueryModule153);
                    lv_defaultQuery_1_0=ruleJPQLQuery();

                    state._fsp--;


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
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:117:3: ( (lv_namedQueries_2_0= ruleNamedQuery ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:118:1: (lv_namedQueries_2_0= ruleNamedQuery )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:118:1: (lv_namedQueries_2_0= ruleNamedQuery )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:119:3: lv_namedQueries_2_0= ruleNamedQuery
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQueryModuleAccess().getNamedQueriesNamedQueryParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNamedQuery_in_ruleQueryModule175);
            	    lv_namedQueries_2_0=ruleNamedQuery();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:143:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:144:2: (iv_ruleImport= ruleImport EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:145:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport212);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport222); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:152:1: ruleImport returns [EObject current=null] : (otherlv_0= 'IMPORT' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:155:28: ( (otherlv_0= 'IMPORT' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:156:1: (otherlv_0= 'IMPORT' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:156:1: (otherlv_0= 'IMPORT' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:156:3: otherlv_0= 'IMPORT' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleImport259); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getIMPORTKeyword_0());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:160:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:161:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:161:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:162:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport276); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:186:1: entryRuleNamedQuery returns [EObject current=null] : iv_ruleNamedQuery= ruleNamedQuery EOF ;
    public final EObject entryRuleNamedQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedQuery = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:187:2: (iv_ruleNamedQuery= ruleNamedQuery EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:188:2: iv_ruleNamedQuery= ruleNamedQuery EOF
            {
             newCompositeNode(grammarAccess.getNamedQueryRule()); 
            pushFollow(FOLLOW_ruleNamedQuery_in_entryRuleNamedQuery317);
            iv_ruleNamedQuery=ruleNamedQuery();

            state._fsp--;

             current =iv_ruleNamedQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedQuery327); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:195:1: ruleNamedQuery returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_query_2_0= ruleJPQLQuery ) ) ) ;
    public final EObject ruleNamedQuery() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_query_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:198:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_query_2_0= ruleJPQLQuery ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:199:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_query_2_0= ruleJPQLQuery ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:199:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_query_2_0= ruleJPQLQuery ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:199:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_query_2_0= ruleJPQLQuery ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:199:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:200:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:200:1: (lv_name_0_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:201:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedQuery369); 

            			newLeafNode(lv_name_0_0, grammarAccess.getNamedQueryAccess().getNameIDTerminalRuleCall_0_0()); 
            		

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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleNamedQuery386); 

                	newLeafNode(otherlv_1, grammarAccess.getNamedQueryAccess().getColonKeyword_1());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:221:1: ( (lv_query_2_0= ruleJPQLQuery ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:222:1: (lv_query_2_0= ruleJPQLQuery )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:222:1: (lv_query_2_0= ruleJPQLQuery )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:223:3: lv_query_2_0= ruleJPQLQuery
            {
             
            	        newCompositeNode(grammarAccess.getNamedQueryAccess().getQueryJPQLQueryParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleJPQLQuery_in_ruleNamedQuery407);
            lv_query_2_0=ruleJPQLQuery();

            state._fsp--;


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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:247:1: entryRuleJPQLQuery returns [EObject current=null] : iv_ruleJPQLQuery= ruleJPQLQuery EOF ;
    public final EObject entryRuleJPQLQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJPQLQuery = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:248:2: (iv_ruleJPQLQuery= ruleJPQLQuery EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:249:2: iv_ruleJPQLQuery= ruleJPQLQuery EOF
            {
             newCompositeNode(grammarAccess.getJPQLQueryRule()); 
            pushFollow(FOLLOW_ruleJPQLQuery_in_entryRuleJPQLQuery443);
            iv_ruleJPQLQuery=ruleJPQLQuery();

            state._fsp--;

             current =iv_ruleJPQLQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJPQLQuery453); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:256:1: ruleJPQLQuery returns [EObject current=null] : (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement ) ;
    public final EObject ruleJPQLQuery() throws RecognitionException {
        EObject current = null;

        EObject this_SelectStatement_0 = null;

        EObject this_UpdateStatement_1 = null;

        EObject this_DeleteStatement_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:259:28: ( (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:260:1: (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:260:1: (this_SelectStatement_0= ruleSelectStatement | this_UpdateStatement_1= ruleUpdateStatement | this_DeleteStatement_2= ruleDeleteStatement )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 30:
            case 40:
                {
                alt4=1;
                }
                break;
            case 26:
                {
                alt4=2;
                }
                break;
            case 29:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:261:5: this_SelectStatement_0= ruleSelectStatement
                    {
                     
                            newCompositeNode(grammarAccess.getJPQLQueryAccess().getSelectStatementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSelectStatement_in_ruleJPQLQuery500);
                    this_SelectStatement_0=ruleSelectStatement();

                    state._fsp--;

                     
                            current = this_SelectStatement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:271:5: this_UpdateStatement_1= ruleUpdateStatement
                    {
                     
                            newCompositeNode(grammarAccess.getJPQLQueryAccess().getUpdateStatementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUpdateStatement_in_ruleJPQLQuery527);
                    this_UpdateStatement_1=ruleUpdateStatement();

                    state._fsp--;

                     
                            current = this_UpdateStatement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:281:5: this_DeleteStatement_2= ruleDeleteStatement
                    {
                     
                            newCompositeNode(grammarAccess.getJPQLQueryAccess().getDeleteStatementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDeleteStatement_in_ruleJPQLQuery554);
                    this_DeleteStatement_2=ruleDeleteStatement();

                    state._fsp--;

                     
                            current = this_DeleteStatement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:297:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:298:2: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:299:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
             newCompositeNode(grammarAccess.getSelectStatementRule()); 
            pushFollow(FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement589);
            iv_ruleSelectStatement=ruleSelectStatement();

            state._fsp--;

             current =iv_ruleSelectStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectStatement599); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:306:1: ruleSelectStatement returns [EObject current=null] : ( ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_having_2_0= ruleHavingClause ) )? ( (lv_order_3_0= ruleOrderClause ) )? ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_selectFromClause_0_0 = null;

        EObject lv_whereClause_1_0 = null;

        EObject lv_having_2_0 = null;

        EObject lv_order_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:309:28: ( ( ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_having_2_0= ruleHavingClause ) )? ( (lv_order_3_0= ruleOrderClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:310:1: ( ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_having_2_0= ruleHavingClause ) )? ( (lv_order_3_0= ruleOrderClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:310:1: ( ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_having_2_0= ruleHavingClause ) )? ( (lv_order_3_0= ruleOrderClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:310:2: ( (lv_selectFromClause_0_0= ruleSelectFromClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ( (lv_having_2_0= ruleHavingClause ) )? ( (lv_order_3_0= ruleOrderClause ) )?
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:310:2: ( (lv_selectFromClause_0_0= ruleSelectFromClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:311:1: (lv_selectFromClause_0_0= ruleSelectFromClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:311:1: (lv_selectFromClause_0_0= ruleSelectFromClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:312:3: lv_selectFromClause_0_0= ruleSelectFromClause
            {
             
            	        newCompositeNode(grammarAccess.getSelectStatementAccess().getSelectFromClauseSelectFromClauseParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSelectFromClause_in_ruleSelectStatement645);
            lv_selectFromClause_0_0=ruleSelectFromClause();

            state._fsp--;


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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:328:2: ( (lv_whereClause_1_0= ruleWhereClause ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==48) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:329:1: (lv_whereClause_1_0= ruleWhereClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:329:1: (lv_whereClause_1_0= ruleWhereClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:330:3: lv_whereClause_1_0= ruleWhereClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectStatementAccess().getWhereClauseWhereClauseParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleSelectStatement666);
                    lv_whereClause_1_0=ruleWhereClause();

                    state._fsp--;


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
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:346:3: ( (lv_having_2_0= ruleHavingClause ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:347:1: (lv_having_2_0= ruleHavingClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:347:1: (lv_having_2_0= ruleHavingClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:348:3: lv_having_2_0= ruleHavingClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectStatementAccess().getHavingHavingClauseParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleHavingClause_in_ruleSelectStatement688);
                    lv_having_2_0=ruleHavingClause();

                    state._fsp--;


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
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:364:3: ( (lv_order_3_0= ruleOrderClause ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:365:1: (lv_order_3_0= ruleOrderClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:365:1: (lv_order_3_0= ruleOrderClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:366:3: lv_order_3_0= ruleOrderClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectStatementAccess().getOrderOrderClauseParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrderClause_in_ruleSelectStatement710);
                    lv_order_3_0=ruleOrderClause();

                    state._fsp--;


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
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:390:1: entryRuleHavingClause returns [EObject current=null] : iv_ruleHavingClause= ruleHavingClause EOF ;
    public final EObject entryRuleHavingClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHavingClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:391:2: (iv_ruleHavingClause= ruleHavingClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:392:2: iv_ruleHavingClause= ruleHavingClause EOF
            {
             newCompositeNode(grammarAccess.getHavingClauseRule()); 
            pushFollow(FOLLOW_ruleHavingClause_in_entryRuleHavingClause747);
            iv_ruleHavingClause=ruleHavingClause();

            state._fsp--;

             current =iv_ruleHavingClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHavingClause757); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:399:1: ruleHavingClause returns [EObject current=null] : (otherlv_0= 'HAVING' ( (lv_having_1_0= ruleOrExpression ) ) ) ;
    public final EObject ruleHavingClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_having_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:402:28: ( (otherlv_0= 'HAVING' ( (lv_having_1_0= ruleOrExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:403:1: (otherlv_0= 'HAVING' ( (lv_having_1_0= ruleOrExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:403:1: (otherlv_0= 'HAVING' ( (lv_having_1_0= ruleOrExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:403:3: otherlv_0= 'HAVING' ( (lv_having_1_0= ruleOrExpression ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleHavingClause794); 

                	newLeafNode(otherlv_0, grammarAccess.getHavingClauseAccess().getHAVINGKeyword_0());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:407:1: ( (lv_having_1_0= ruleOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:408:1: (lv_having_1_0= ruleOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:408:1: (lv_having_1_0= ruleOrExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:409:3: lv_having_1_0= ruleOrExpression
            {
             
            	        newCompositeNode(grammarAccess.getHavingClauseAccess().getHavingOrExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleOrExpression_in_ruleHavingClause815);
            lv_having_1_0=ruleOrExpression();

            state._fsp--;


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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:433:1: entryRuleOrderClause returns [EObject current=null] : iv_ruleOrderClause= ruleOrderClause EOF ;
    public final EObject entryRuleOrderClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:434:2: (iv_ruleOrderClause= ruleOrderClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:435:2: iv_ruleOrderClause= ruleOrderClause EOF
            {
             newCompositeNode(grammarAccess.getOrderClauseRule()); 
            pushFollow(FOLLOW_ruleOrderClause_in_entryRuleOrderClause851);
            iv_ruleOrderClause=ruleOrderClause();

            state._fsp--;

             current =iv_ruleOrderClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderClause861); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:442:1: ruleOrderClause returns [EObject current=null] : (otherlv_0= 'ORDER' otherlv_1= 'BY' ( (lv_ordering_2_0= ruleOrderItem ) ) (otherlv_3= ',' ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= 'ASC' ) ) | ( (lv_isDesc_6_0= 'DESC' ) ) )? ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:445:28: ( (otherlv_0= 'ORDER' otherlv_1= 'BY' ( (lv_ordering_2_0= ruleOrderItem ) ) (otherlv_3= ',' ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= 'ASC' ) ) | ( (lv_isDesc_6_0= 'DESC' ) ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:446:1: (otherlv_0= 'ORDER' otherlv_1= 'BY' ( (lv_ordering_2_0= ruleOrderItem ) ) (otherlv_3= ',' ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= 'ASC' ) ) | ( (lv_isDesc_6_0= 'DESC' ) ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:446:1: (otherlv_0= 'ORDER' otherlv_1= 'BY' ( (lv_ordering_2_0= ruleOrderItem ) ) (otherlv_3= ',' ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= 'ASC' ) ) | ( (lv_isDesc_6_0= 'DESC' ) ) )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:446:3: otherlv_0= 'ORDER' otherlv_1= 'BY' ( (lv_ordering_2_0= ruleOrderItem ) ) (otherlv_3= ',' ( (lv_ordering_4_0= ruleOrderItem ) ) )* ( ( (lv_isAsc_5_0= 'ASC' ) ) | ( (lv_isDesc_6_0= 'DESC' ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleOrderClause898); 

                	newLeafNode(otherlv_0, grammarAccess.getOrderClauseAccess().getORDERKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleOrderClause910); 

                	newLeafNode(otherlv_1, grammarAccess.getOrderClauseAccess().getBYKeyword_1());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:454:1: ( (lv_ordering_2_0= ruleOrderItem ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:455:1: (lv_ordering_2_0= ruleOrderItem )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:455:1: (lv_ordering_2_0= ruleOrderItem )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:456:3: lv_ordering_2_0= ruleOrderItem
            {
             
            	        newCompositeNode(grammarAccess.getOrderClauseAccess().getOrderingOrderItemParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleOrderItem_in_ruleOrderClause931);
            lv_ordering_2_0=ruleOrderItem();

            state._fsp--;


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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:472:2: (otherlv_3= ',' ( (lv_ordering_4_0= ruleOrderItem ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:472:4: otherlv_3= ',' ( (lv_ordering_4_0= ruleOrderItem ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleOrderClause944); 

            	        	newLeafNode(otherlv_3, grammarAccess.getOrderClauseAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:476:1: ( (lv_ordering_4_0= ruleOrderItem ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:477:1: (lv_ordering_4_0= ruleOrderItem )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:477:1: (lv_ordering_4_0= ruleOrderItem )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:478:3: lv_ordering_4_0= ruleOrderItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrderClauseAccess().getOrderingOrderItemParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOrderItem_in_ruleOrderClause965);
            	    lv_ordering_4_0=ruleOrderItem();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:494:4: ( ( (lv_isAsc_5_0= 'ASC' ) ) | ( (lv_isDesc_6_0= 'DESC' ) ) )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:494:5: ( (lv_isAsc_5_0= 'ASC' ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:494:5: ( (lv_isAsc_5_0= 'ASC' ) )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:495:1: (lv_isAsc_5_0= 'ASC' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:495:1: (lv_isAsc_5_0= 'ASC' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:496:3: lv_isAsc_5_0= 'ASC'
                    {
                    lv_isAsc_5_0=(Token)match(input,23,FOLLOW_23_in_ruleOrderClause986); 

                            newLeafNode(lv_isAsc_5_0, grammarAccess.getOrderClauseAccess().getIsAscASCKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOrderClauseRule());
                    	        }
                           		setWithLastConsumed(current, "isAsc", true, "ASC");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:510:6: ( (lv_isDesc_6_0= 'DESC' ) )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:510:6: ( (lv_isDesc_6_0= 'DESC' ) )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:511:1: (lv_isDesc_6_0= 'DESC' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:511:1: (lv_isDesc_6_0= 'DESC' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:512:3: lv_isDesc_6_0= 'DESC'
                    {
                    lv_isDesc_6_0=(Token)match(input,24,FOLLOW_24_in_ruleOrderClause1023); 

                            newLeafNode(lv_isDesc_6_0, grammarAccess.getOrderClauseAccess().getIsDescDESCKeyword_4_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOrderClauseRule());
                    	        }
                           		setWithLastConsumed(current, "isDesc", true, "DESC");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:533:1: entryRuleOrderItem returns [EObject current=null] : iv_ruleOrderItem= ruleOrderItem EOF ;
    public final EObject entryRuleOrderItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderItem = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:534:2: (iv_ruleOrderItem= ruleOrderItem EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:535:2: iv_ruleOrderItem= ruleOrderItem EOF
            {
             newCompositeNode(grammarAccess.getOrderItemRule()); 
            pushFollow(FOLLOW_ruleOrderItem_in_entryRuleOrderItem1074);
            iv_ruleOrderItem=ruleOrderItem();

            state._fsp--;

             current =iv_ruleOrderItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderItem1084); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:542:1: ruleOrderItem returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_feature_2_0= RULE_ID ) ) ) ;
    public final EObject ruleOrderItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_feature_2_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:545:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_feature_2_0= RULE_ID ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:546:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_feature_2_0= RULE_ID ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:546:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_feature_2_0= RULE_ID ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:546:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_feature_2_0= RULE_ID ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:546:2: ( (otherlv_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:547:1: (otherlv_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:547:1: (otherlv_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:548:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOrderItemRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrderItem1129); 

            		newLeafNode(otherlv_0, grammarAccess.getOrderItemAccess().getVarFromEntryCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleOrderItem1141); 

                	newLeafNode(otherlv_1, grammarAccess.getOrderItemAccess().getFullStopKeyword_1());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:563:1: ( (lv_feature_2_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:564:1: (lv_feature_2_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:564:1: (lv_feature_2_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:565:3: lv_feature_2_0= RULE_ID
            {
            lv_feature_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrderItem1158); 

            			newLeafNode(lv_feature_2_0, grammarAccess.getOrderItemAccess().getFeatureIDTerminalRuleCall_2_0()); 
            		

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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:589:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:590:2: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:591:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
             newCompositeNode(grammarAccess.getUpdateStatementRule()); 
            pushFollow(FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement1199);
            iv_ruleUpdateStatement=ruleUpdateStatement();

            state._fsp--;

             current =iv_ruleUpdateStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateStatement1209); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:598:1: ruleUpdateStatement returns [EObject current=null] : ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ) ;
    public final EObject ruleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_updateClause_0_0 = null;

        EObject lv_setClause_1_0 = null;

        EObject lv_whereClause_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:601:28: ( ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:602:1: ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:602:1: ( ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:602:2: ( (lv_updateClause_0_0= ruleUpdateClause ) ) ( (lv_setClause_1_0= ruleSetClause ) ) ( (lv_whereClause_2_0= ruleWhereClause ) )?
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:602:2: ( (lv_updateClause_0_0= ruleUpdateClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:603:1: (lv_updateClause_0_0= ruleUpdateClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:603:1: (lv_updateClause_0_0= ruleUpdateClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:604:3: lv_updateClause_0_0= ruleUpdateClause
            {
             
            	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateClauseUpdateClauseParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUpdateClause_in_ruleUpdateStatement1255);
            lv_updateClause_0_0=ruleUpdateClause();

            state._fsp--;


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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:620:2: ( (lv_setClause_1_0= ruleSetClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:621:1: (lv_setClause_1_0= ruleSetClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:621:1: (lv_setClause_1_0= ruleSetClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:622:3: lv_setClause_1_0= ruleSetClause
            {
             
            	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getSetClauseSetClauseParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSetClause_in_ruleUpdateStatement1276);
            lv_setClause_1_0=ruleSetClause();

            state._fsp--;


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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:638:2: ( (lv_whereClause_2_0= ruleWhereClause ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==48) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:639:1: (lv_whereClause_2_0= ruleWhereClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:639:1: (lv_whereClause_2_0= ruleWhereClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:640:3: lv_whereClause_2_0= ruleWhereClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getUpdateStatementAccess().getWhereClauseWhereClauseParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleUpdateStatement1297);
                    lv_whereClause_2_0=ruleWhereClause();

                    state._fsp--;


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
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:664:1: entryRuleUpdateClause returns [EObject current=null] : iv_ruleUpdateClause= ruleUpdateClause EOF ;
    public final EObject entryRuleUpdateClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:665:2: (iv_ruleUpdateClause= ruleUpdateClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:666:2: iv_ruleUpdateClause= ruleUpdateClause EOF
            {
             newCompositeNode(grammarAccess.getUpdateClauseRule()); 
            pushFollow(FOLLOW_ruleUpdateClause_in_entryRuleUpdateClause1334);
            iv_ruleUpdateClause=ruleUpdateClause();

            state._fsp--;

             current =iv_ruleUpdateClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateClause1344); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:673:1: ruleUpdateClause returns [EObject current=null] : (otherlv_0= 'UPDATE' ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) ;
    public final EObject ruleUpdateClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_fromEntries_1_0 = null;

        EObject lv_fromEntries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:676:28: ( (otherlv_0= 'UPDATE' ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:677:1: (otherlv_0= 'UPDATE' ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:677:1: (otherlv_0= 'UPDATE' ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:677:3: otherlv_0= 'UPDATE' ( (lv_fromEntries_1_0= ruleFromEntry ) ) (otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleUpdateClause1381); 

                	newLeafNode(otherlv_0, grammarAccess.getUpdateClauseAccess().getUPDATEKeyword_0());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:681:1: ( (lv_fromEntries_1_0= ruleFromEntry ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:682:1: (lv_fromEntries_1_0= ruleFromEntry )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:682:1: (lv_fromEntries_1_0= ruleFromEntry )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:683:3: lv_fromEntries_1_0= ruleFromEntry
            {
             
            	        newCompositeNode(grammarAccess.getUpdateClauseAccess().getFromEntriesFromEntryParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFromEntry_in_ruleUpdateClause1402);
            lv_fromEntries_1_0=ruleFromEntry();

            state._fsp--;


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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:699:2: (otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:699:4: otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleUpdateClause1415); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUpdateClauseAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:703:1: ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:704:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:704:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:705:3: lv_fromEntries_3_0= ruleFromEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpdateClauseAccess().getFromEntriesFromEntryParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFromEntry_in_ruleUpdateClause1436);
            	    lv_fromEntries_3_0=ruleFromEntry();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:729:1: entryRuleSetClause returns [EObject current=null] : iv_ruleSetClause= ruleSetClause EOF ;
    public final EObject entryRuleSetClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:730:2: (iv_ruleSetClause= ruleSetClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:731:2: iv_ruleSetClause= ruleSetClause EOF
            {
             newCompositeNode(grammarAccess.getSetClauseRule()); 
            pushFollow(FOLLOW_ruleSetClause_in_entryRuleSetClause1474);
            iv_ruleSetClause=ruleSetClause();

            state._fsp--;

             current =iv_ruleSetClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetClause1484); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:738:1: ruleSetClause returns [EObject current=null] : (otherlv_0= 'SET' ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleUpdateItem ) ) )* ) ;
    public final EObject ruleSetClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:741:28: ( (otherlv_0= 'SET' ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleUpdateItem ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:742:1: (otherlv_0= 'SET' ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleUpdateItem ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:742:1: (otherlv_0= 'SET' ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleUpdateItem ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:742:3: otherlv_0= 'SET' ( (lv_items_1_0= ruleUpdateItem ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleUpdateItem ) ) )*
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleSetClause1521); 

                	newLeafNode(otherlv_0, grammarAccess.getSetClauseAccess().getSETKeyword_0());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:746:1: ( (lv_items_1_0= ruleUpdateItem ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:747:1: (lv_items_1_0= ruleUpdateItem )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:747:1: (lv_items_1_0= ruleUpdateItem )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:748:3: lv_items_1_0= ruleUpdateItem
            {
             
            	        newCompositeNode(grammarAccess.getSetClauseAccess().getItemsUpdateItemParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUpdateItem_in_ruleSetClause1542);
            lv_items_1_0=ruleUpdateItem();

            state._fsp--;


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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:764:2: (otherlv_2= ',' ( (lv_items_3_0= ruleUpdateItem ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:764:4: otherlv_2= ',' ( (lv_items_3_0= ruleUpdateItem ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleSetClause1555); 

            	        	newLeafNode(otherlv_2, grammarAccess.getSetClauseAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:768:1: ( (lv_items_3_0= ruleUpdateItem ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:769:1: (lv_items_3_0= ruleUpdateItem )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:769:1: (lv_items_3_0= ruleUpdateItem )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:770:3: lv_items_3_0= ruleUpdateItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSetClauseAccess().getItemsUpdateItemParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpdateItem_in_ruleSetClause1576);
            	    lv_items_3_0=ruleUpdateItem();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:794:1: entryRuleUpdateItem returns [EObject current=null] : iv_ruleUpdateItem= ruleUpdateItem EOF ;
    public final EObject entryRuleUpdateItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateItem = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:795:2: (iv_ruleUpdateItem= ruleUpdateItem EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:796:2: iv_ruleUpdateItem= ruleUpdateItem EOF
            {
             newCompositeNode(grammarAccess.getUpdateItemRule()); 
            pushFollow(FOLLOW_ruleUpdateItem_in_entryRuleUpdateItem1614);
            iv_ruleUpdateItem=ruleUpdateItem();

            state._fsp--;

             current =iv_ruleUpdateItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdateItem1624); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:803:1: ruleUpdateItem returns [EObject current=null] : ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleUpdateItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_alias_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:806:28: ( ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:807:1: ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:807:1: ( ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:807:2: ( (lv_alias_0_0= ruleAliasAttributeExpression ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:807:2: ( (lv_alias_0_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:808:1: (lv_alias_0_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:808:1: (lv_alias_0_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:809:3: lv_alias_0_0= ruleAliasAttributeExpression
            {
             
            	        newCompositeNode(grammarAccess.getUpdateItemAccess().getAliasAliasAttributeExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleUpdateItem1670);
            lv_alias_0_0=ruleAliasAttributeExpression();

            state._fsp--;


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

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleUpdateItem1682); 

                	newLeafNode(otherlv_1, grammarAccess.getUpdateItemAccess().getEqualsSignKeyword_1());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:829:1: ( (lv_value_2_0= ruleValue ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:830:1: (lv_value_2_0= ruleValue )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:830:1: (lv_value_2_0= ruleValue )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:831:3: lv_value_2_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getUpdateItemAccess().getValueValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleUpdateItem1703);
            lv_value_2_0=ruleValue();

            state._fsp--;


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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:855:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:856:2: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:857:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
            {
             newCompositeNode(grammarAccess.getDeleteStatementRule()); 
            pushFollow(FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement1739);
            iv_ruleDeleteStatement=ruleDeleteStatement();

            state._fsp--;

             current =iv_ruleDeleteStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteStatement1749); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:864:1: ruleDeleteStatement returns [EObject current=null] : ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_deleteClause_0_0 = null;

        EObject lv_whereClause_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:867:28: ( ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:868:1: ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:868:1: ( ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:868:2: ( (lv_deleteClause_0_0= ruleDeleteClause ) ) ( (lv_whereClause_1_0= ruleWhereClause ) )?
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:868:2: ( (lv_deleteClause_0_0= ruleDeleteClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:869:1: (lv_deleteClause_0_0= ruleDeleteClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:869:1: (lv_deleteClause_0_0= ruleDeleteClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:870:3: lv_deleteClause_0_0= ruleDeleteClause
            {
             
            	        newCompositeNode(grammarAccess.getDeleteStatementAccess().getDeleteClauseDeleteClauseParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDeleteClause_in_ruleDeleteStatement1795);
            lv_deleteClause_0_0=ruleDeleteClause();

            state._fsp--;


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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:886:2: ( (lv_whereClause_1_0= ruleWhereClause ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==48) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:887:1: (lv_whereClause_1_0= ruleWhereClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:887:1: (lv_whereClause_1_0= ruleWhereClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:888:3: lv_whereClause_1_0= ruleWhereClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeleteStatementAccess().getWhereClauseWhereClauseParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhereClause_in_ruleDeleteStatement1816);
                    lv_whereClause_1_0=ruleWhereClause();

                    state._fsp--;


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
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:912:1: entryRuleDeleteClause returns [EObject current=null] : iv_ruleDeleteClause= ruleDeleteClause EOF ;
    public final EObject entryRuleDeleteClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:913:2: (iv_ruleDeleteClause= ruleDeleteClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:914:2: iv_ruleDeleteClause= ruleDeleteClause EOF
            {
             newCompositeNode(grammarAccess.getDeleteClauseRule()); 
            pushFollow(FOLLOW_ruleDeleteClause_in_entryRuleDeleteClause1853);
            iv_ruleDeleteClause=ruleDeleteClause();

            state._fsp--;

             current =iv_ruleDeleteClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteClause1863); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:921:1: ruleDeleteClause returns [EObject current=null] : (otherlv_0= 'DELETE' ( (lv_fromClause_1_0= ruleFromClause ) ) ) ;
    public final EObject ruleDeleteClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_fromClause_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:924:28: ( (otherlv_0= 'DELETE' ( (lv_fromClause_1_0= ruleFromClause ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:925:1: (otherlv_0= 'DELETE' ( (lv_fromClause_1_0= ruleFromClause ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:925:1: (otherlv_0= 'DELETE' ( (lv_fromClause_1_0= ruleFromClause ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:925:3: otherlv_0= 'DELETE' ( (lv_fromClause_1_0= ruleFromClause ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleDeleteClause1900); 

                	newLeafNode(otherlv_0, grammarAccess.getDeleteClauseAccess().getDELETEKeyword_0());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:929:1: ( (lv_fromClause_1_0= ruleFromClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:930:1: (lv_fromClause_1_0= ruleFromClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:930:1: (lv_fromClause_1_0= ruleFromClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:931:3: lv_fromClause_1_0= ruleFromClause
            {
             
            	        newCompositeNode(grammarAccess.getDeleteClauseAccess().getFromClauseFromClauseParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFromClause_in_ruleDeleteClause1921);
            lv_fromClause_1_0=ruleFromClause();

            state._fsp--;


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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:955:1: entryRuleSelectFromClause returns [EObject current=null] : iv_ruleSelectFromClause= ruleSelectFromClause EOF ;
    public final EObject entryRuleSelectFromClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectFromClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:956:2: (iv_ruleSelectFromClause= ruleSelectFromClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:957:2: iv_ruleSelectFromClause= ruleSelectFromClause EOF
            {
             newCompositeNode(grammarAccess.getSelectFromClauseRule()); 
            pushFollow(FOLLOW_ruleSelectFromClause_in_entryRuleSelectFromClause1957);
            iv_ruleSelectFromClause=ruleSelectFromClause();

            state._fsp--;

             current =iv_ruleSelectFromClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectFromClause1967); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:964:1: ruleSelectFromClause returns [EObject current=null] : ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) ) ;
    public final EObject ruleSelectFromClause() throws RecognitionException {
        EObject current = null;

        EObject lv_selectClause_0_0 = null;

        EObject lv_fromClause_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:967:28: ( ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:968:1: ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:968:1: ( ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:968:2: ( (lv_selectClause_0_0= ruleSelectClause ) )? ( (lv_fromClause_1_0= ruleFromClause ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:968:2: ( (lv_selectClause_0_0= ruleSelectClause ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:969:1: (lv_selectClause_0_0= ruleSelectClause )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:969:1: (lv_selectClause_0_0= ruleSelectClause )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:970:3: lv_selectClause_0_0= ruleSelectClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getSelectFromClauseAccess().getSelectClauseSelectClauseParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelectClause_in_ruleSelectFromClause2013);
                    lv_selectClause_0_0=ruleSelectClause();

                    state._fsp--;


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
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:986:3: ( (lv_fromClause_1_0= ruleFromClause ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:987:1: (lv_fromClause_1_0= ruleFromClause )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:987:1: (lv_fromClause_1_0= ruleFromClause )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:988:3: lv_fromClause_1_0= ruleFromClause
            {
             
            	        newCompositeNode(grammarAccess.getSelectFromClauseAccess().getFromClauseFromClauseParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFromClause_in_ruleSelectFromClause2035);
            lv_fromClause_1_0=ruleFromClause();

            state._fsp--;


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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1012:1: entryRuleSelectClause returns [EObject current=null] : iv_ruleSelectClause= ruleSelectClause EOF ;
    public final EObject entryRuleSelectClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1013:2: (iv_ruleSelectClause= ruleSelectClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1014:2: iv_ruleSelectClause= ruleSelectClause EOF
            {
             newCompositeNode(grammarAccess.getSelectClauseRule()); 
            pushFollow(FOLLOW_ruleSelectClause_in_entryRuleSelectClause2071);
            iv_ruleSelectClause=ruleSelectClause();

            state._fsp--;

             current =iv_ruleSelectClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectClause2081); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1021:1: ruleSelectClause returns [EObject current=null] : (otherlv_0= 'SELECT' ( (lv_isDistinct_1_0= 'DISTINCT' ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleSelectExpression ) ) )* ) ;
    public final EObject ruleSelectClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isDistinct_1_0=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1024:28: ( (otherlv_0= 'SELECT' ( (lv_isDistinct_1_0= 'DISTINCT' ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleSelectExpression ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1025:1: (otherlv_0= 'SELECT' ( (lv_isDistinct_1_0= 'DISTINCT' ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleSelectExpression ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1025:1: (otherlv_0= 'SELECT' ( (lv_isDistinct_1_0= 'DISTINCT' ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleSelectExpression ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1025:3: otherlv_0= 'SELECT' ( (lv_isDistinct_1_0= 'DISTINCT' ) )? ( (lv_expressions_2_0= ruleSelectExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleSelectExpression ) ) )*
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleSelectClause2118); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectClauseAccess().getSELECTKeyword_0());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1029:1: ( (lv_isDistinct_1_0= 'DISTINCT' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1030:1: (lv_isDistinct_1_0= 'DISTINCT' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1030:1: (lv_isDistinct_1_0= 'DISTINCT' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1031:3: lv_isDistinct_1_0= 'DISTINCT'
                    {
                    lv_isDistinct_1_0=(Token)match(input,31,FOLLOW_31_in_ruleSelectClause2136); 

                            newLeafNode(lv_isDistinct_1_0, grammarAccess.getSelectClauseAccess().getIsDistinctDISTINCTKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSelectClauseRule());
                    	        }
                           		setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                    	    

                    }


                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1044:3: ( (lv_expressions_2_0= ruleSelectExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1045:1: (lv_expressions_2_0= ruleSelectExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1045:1: (lv_expressions_2_0= ruleSelectExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1046:3: lv_expressions_2_0= ruleSelectExpression
            {
             
            	        newCompositeNode(grammarAccess.getSelectClauseAccess().getExpressionsSelectExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectClause2171);
            lv_expressions_2_0=ruleSelectExpression();

            state._fsp--;


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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1062:2: (otherlv_3= ',' ( (lv_expressions_4_0= ruleSelectExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1062:4: otherlv_3= ',' ( (lv_expressions_4_0= ruleSelectExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleSelectClause2184); 

            	        	newLeafNode(otherlv_3, grammarAccess.getSelectClauseAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1066:1: ( (lv_expressions_4_0= ruleSelectExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1067:1: (lv_expressions_4_0= ruleSelectExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1067:1: (lv_expressions_4_0= ruleSelectExpression )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1068:3: lv_expressions_4_0= ruleSelectExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSelectClauseAccess().getExpressionsSelectExpressionParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSelectExpression_in_ruleSelectClause2205);
            	    lv_expressions_4_0=ruleSelectExpression();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1092:1: entryRuleSelectExpression returns [EObject current=null] : iv_ruleSelectExpression= ruleSelectExpression EOF ;
    public final EObject entryRuleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1093:2: (iv_ruleSelectExpression= ruleSelectExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1094:2: iv_ruleSelectExpression= ruleSelectExpression EOF
            {
             newCompositeNode(grammarAccess.getSelectExpressionRule()); 
            pushFollow(FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression2243);
            iv_ruleSelectExpression=ruleSelectExpression();

            state._fsp--;

             current =iv_ruleSelectExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectExpression2253); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1101:1: ruleSelectExpression returns [EObject current=null] : (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression ) ;
    public final EObject ruleSelectExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AliasAttributeExpression_0 = null;

        EObject this_SelectAggregateExpression_1 = null;

        EObject this_SelectConstructorExpression_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1104:28: ( (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1105:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1105:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_SelectAggregateExpression_1= ruleSelectAggregateExpression | this_SelectConstructorExpression_2= ruleSelectConstructorExpression )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt17=1;
                }
                break;
            case 32:
            case 35:
            case 36:
            case 37:
            case 38:
                {
                alt17=2;
                }
                break;
            case 39:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1106:5: this_AliasAttributeExpression_0= ruleAliasAttributeExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSelectExpressionAccess().getAliasAttributeExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSelectExpression2300);
                    this_AliasAttributeExpression_0=ruleAliasAttributeExpression();

                    state._fsp--;

                     
                            current = this_AliasAttributeExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1116:5: this_SelectAggregateExpression_1= ruleSelectAggregateExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSelectExpressionAccess().getSelectAggregateExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSelectAggregateExpression_in_ruleSelectExpression2327);
                    this_SelectAggregateExpression_1=ruleSelectAggregateExpression();

                    state._fsp--;

                     
                            current = this_SelectAggregateExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1126:5: this_SelectConstructorExpression_2= ruleSelectConstructorExpression
                    {
                     
                            newCompositeNode(grammarAccess.getSelectExpressionAccess().getSelectConstructorExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSelectConstructorExpression_in_ruleSelectExpression2354);
                    this_SelectConstructorExpression_2=ruleSelectConstructorExpression();

                    state._fsp--;

                     
                            current = this_SelectConstructorExpression_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1142:1: entryRuleSelectAggregateExpression returns [EObject current=null] : iv_ruleSelectAggregateExpression= ruleSelectAggregateExpression EOF ;
    public final EObject entryRuleSelectAggregateExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectAggregateExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1143:2: (iv_ruleSelectAggregateExpression= ruleSelectAggregateExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1144:2: iv_ruleSelectAggregateExpression= ruleSelectAggregateExpression EOF
            {
             newCompositeNode(grammarAccess.getSelectAggregateExpressionRule()); 
            pushFollow(FOLLOW_ruleSelectAggregateExpression_in_entryRuleSelectAggregateExpression2389);
            iv_ruleSelectAggregateExpression=ruleSelectAggregateExpression();

            state._fsp--;

             current =iv_ruleSelectAggregateExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectAggregateExpression2399); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1151:1: ruleSelectAggregateExpression returns [EObject current=null] : (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate ) ;
    public final EObject ruleSelectAggregateExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AvgAggregate_0 = null;

        EObject this_MaxAggregate_1 = null;

        EObject this_MinAggregate_2 = null;

        EObject this_SumAggregate_3 = null;

        EObject this_CountAggregate_4 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1154:28: ( (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1155:1: (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1155:1: (this_AvgAggregate_0= ruleAvgAggregate | this_MaxAggregate_1= ruleMaxAggregate | this_MinAggregate_2= ruleMinAggregate | this_SumAggregate_3= ruleSumAggregate | this_CountAggregate_4= ruleCountAggregate )
            int alt18=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt18=1;
                }
                break;
            case 35:
                {
                alt18=2;
                }
                break;
            case 36:
                {
                alt18=3;
                }
                break;
            case 37:
                {
                alt18=4;
                }
                break;
            case 38:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1156:5: this_AvgAggregate_0= ruleAvgAggregate
                    {
                     
                            newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getAvgAggregateParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAvgAggregate_in_ruleSelectAggregateExpression2446);
                    this_AvgAggregate_0=ruleAvgAggregate();

                    state._fsp--;

                     
                            current = this_AvgAggregate_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1166:5: this_MaxAggregate_1= ruleMaxAggregate
                    {
                     
                            newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getMaxAggregateParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMaxAggregate_in_ruleSelectAggregateExpression2473);
                    this_MaxAggregate_1=ruleMaxAggregate();

                    state._fsp--;

                     
                            current = this_MaxAggregate_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1176:5: this_MinAggregate_2= ruleMinAggregate
                    {
                     
                            newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getMinAggregateParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMinAggregate_in_ruleSelectAggregateExpression2500);
                    this_MinAggregate_2=ruleMinAggregate();

                    state._fsp--;

                     
                            current = this_MinAggregate_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1186:5: this_SumAggregate_3= ruleSumAggregate
                    {
                     
                            newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getSumAggregateParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSumAggregate_in_ruleSelectAggregateExpression2527);
                    this_SumAggregate_3=ruleSumAggregate();

                    state._fsp--;

                     
                            current = this_SumAggregate_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1196:5: this_CountAggregate_4= ruleCountAggregate
                    {
                     
                            newCompositeNode(grammarAccess.getSelectAggregateExpressionAccess().getCountAggregateParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCountAggregate_in_ruleSelectAggregateExpression2554);
                    this_CountAggregate_4=ruleCountAggregate();

                    state._fsp--;

                     
                            current = this_CountAggregate_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1212:1: entryRuleAvgAggregate returns [EObject current=null] : iv_ruleAvgAggregate= ruleAvgAggregate EOF ;
    public final EObject entryRuleAvgAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvgAggregate = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1213:2: (iv_ruleAvgAggregate= ruleAvgAggregate EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1214:2: iv_ruleAvgAggregate= ruleAvgAggregate EOF
            {
             newCompositeNode(grammarAccess.getAvgAggregateRule()); 
            pushFollow(FOLLOW_ruleAvgAggregate_in_entryRuleAvgAggregate2589);
            iv_ruleAvgAggregate=ruleAvgAggregate();

            state._fsp--;

             current =iv_ruleAvgAggregate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvgAggregate2599); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1221:1: ruleAvgAggregate returns [EObject current=null] : (otherlv_0= 'AVG' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleAvgAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1224:28: ( (otherlv_0= 'AVG' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1225:1: (otherlv_0= 'AVG' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1225:1: (otherlv_0= 'AVG' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1225:3: otherlv_0= 'AVG' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleAvgAggregate2636); 

                	newLeafNode(otherlv_0, grammarAccess.getAvgAggregateAccess().getAVGKeyword_0());
                
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleAvgAggregate2648); 

                	newLeafNode(otherlv_1, grammarAccess.getAvgAggregateAccess().getLeftParenthesisKeyword_1());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1233:1: ( (lv_isDistinct_2_0= 'DISTINCT' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1234:1: (lv_isDistinct_2_0= 'DISTINCT' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1234:1: (lv_isDistinct_2_0= 'DISTINCT' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1235:3: lv_isDistinct_2_0= 'DISTINCT'
                    {
                    lv_isDistinct_2_0=(Token)match(input,31,FOLLOW_31_in_ruleAvgAggregate2666); 

                            newLeafNode(lv_isDistinct_2_0, grammarAccess.getAvgAggregateAccess().getIsDistinctDISTINCTKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAvgAggregateRule());
                    	        }
                           		setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                    	    

                    }


                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1248:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1249:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1249:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1250:3: lv_item_3_0= ruleAliasAttributeExpression
            {
             
            	        newCompositeNode(grammarAccess.getAvgAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleAvgAggregate2701);
            lv_item_3_0=ruleAliasAttributeExpression();

            state._fsp--;


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

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleAvgAggregate2713); 

                	newLeafNode(otherlv_4, grammarAccess.getAvgAggregateAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1278:1: entryRuleMaxAggregate returns [EObject current=null] : iv_ruleMaxAggregate= ruleMaxAggregate EOF ;
    public final EObject entryRuleMaxAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxAggregate = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1279:2: (iv_ruleMaxAggregate= ruleMaxAggregate EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1280:2: iv_ruleMaxAggregate= ruleMaxAggregate EOF
            {
             newCompositeNode(grammarAccess.getMaxAggregateRule()); 
            pushFollow(FOLLOW_ruleMaxAggregate_in_entryRuleMaxAggregate2749);
            iv_ruleMaxAggregate=ruleMaxAggregate();

            state._fsp--;

             current =iv_ruleMaxAggregate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxAggregate2759); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1287:1: ruleMaxAggregate returns [EObject current=null] : (otherlv_0= 'MAX' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleMaxAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1290:28: ( (otherlv_0= 'MAX' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1291:1: (otherlv_0= 'MAX' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1291:1: (otherlv_0= 'MAX' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1291:3: otherlv_0= 'MAX' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleMaxAggregate2796); 

                	newLeafNode(otherlv_0, grammarAccess.getMaxAggregateAccess().getMAXKeyword_0());
                
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleMaxAggregate2808); 

                	newLeafNode(otherlv_1, grammarAccess.getMaxAggregateAccess().getLeftParenthesisKeyword_1());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1299:1: ( (lv_isDistinct_2_0= 'DISTINCT' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1300:1: (lv_isDistinct_2_0= 'DISTINCT' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1300:1: (lv_isDistinct_2_0= 'DISTINCT' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1301:3: lv_isDistinct_2_0= 'DISTINCT'
                    {
                    lv_isDistinct_2_0=(Token)match(input,31,FOLLOW_31_in_ruleMaxAggregate2826); 

                            newLeafNode(lv_isDistinct_2_0, grammarAccess.getMaxAggregateAccess().getIsDistinctDISTINCTKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMaxAggregateRule());
                    	        }
                           		setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                    	    

                    }


                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1314:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1315:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1315:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1316:3: lv_item_3_0= ruleAliasAttributeExpression
            {
             
            	        newCompositeNode(grammarAccess.getMaxAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleMaxAggregate2861);
            lv_item_3_0=ruleAliasAttributeExpression();

            state._fsp--;


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

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleMaxAggregate2873); 

                	newLeafNode(otherlv_4, grammarAccess.getMaxAggregateAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1344:1: entryRuleMinAggregate returns [EObject current=null] : iv_ruleMinAggregate= ruleMinAggregate EOF ;
    public final EObject entryRuleMinAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinAggregate = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1345:2: (iv_ruleMinAggregate= ruleMinAggregate EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1346:2: iv_ruleMinAggregate= ruleMinAggregate EOF
            {
             newCompositeNode(grammarAccess.getMinAggregateRule()); 
            pushFollow(FOLLOW_ruleMinAggregate_in_entryRuleMinAggregate2909);
            iv_ruleMinAggregate=ruleMinAggregate();

            state._fsp--;

             current =iv_ruleMinAggregate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinAggregate2919); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1353:1: ruleMinAggregate returns [EObject current=null] : (otherlv_0= 'MIN' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleMinAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1356:28: ( (otherlv_0= 'MIN' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1357:1: (otherlv_0= 'MIN' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1357:1: (otherlv_0= 'MIN' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1357:3: otherlv_0= 'MIN' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleMinAggregate2956); 

                	newLeafNode(otherlv_0, grammarAccess.getMinAggregateAccess().getMINKeyword_0());
                
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleMinAggregate2968); 

                	newLeafNode(otherlv_1, grammarAccess.getMinAggregateAccess().getLeftParenthesisKeyword_1());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1365:1: ( (lv_isDistinct_2_0= 'DISTINCT' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1366:1: (lv_isDistinct_2_0= 'DISTINCT' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1366:1: (lv_isDistinct_2_0= 'DISTINCT' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1367:3: lv_isDistinct_2_0= 'DISTINCT'
                    {
                    lv_isDistinct_2_0=(Token)match(input,31,FOLLOW_31_in_ruleMinAggregate2986); 

                            newLeafNode(lv_isDistinct_2_0, grammarAccess.getMinAggregateAccess().getIsDistinctDISTINCTKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMinAggregateRule());
                    	        }
                           		setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                    	    

                    }


                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1380:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1381:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1381:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1382:3: lv_item_3_0= ruleAliasAttributeExpression
            {
             
            	        newCompositeNode(grammarAccess.getMinAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleMinAggregate3021);
            lv_item_3_0=ruleAliasAttributeExpression();

            state._fsp--;


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

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleMinAggregate3033); 

                	newLeafNode(otherlv_4, grammarAccess.getMinAggregateAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1410:1: entryRuleSumAggregate returns [EObject current=null] : iv_ruleSumAggregate= ruleSumAggregate EOF ;
    public final EObject entryRuleSumAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumAggregate = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1411:2: (iv_ruleSumAggregate= ruleSumAggregate EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1412:2: iv_ruleSumAggregate= ruleSumAggregate EOF
            {
             newCompositeNode(grammarAccess.getSumAggregateRule()); 
            pushFollow(FOLLOW_ruleSumAggregate_in_entryRuleSumAggregate3069);
            iv_ruleSumAggregate=ruleSumAggregate();

            state._fsp--;

             current =iv_ruleSumAggregate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumAggregate3079); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1419:1: ruleSumAggregate returns [EObject current=null] : (otherlv_0= 'SUM' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleSumAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1422:28: ( (otherlv_0= 'SUM' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1423:1: (otherlv_0= 'SUM' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1423:1: (otherlv_0= 'SUM' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1423:3: otherlv_0= 'SUM' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleSumAggregate3116); 

                	newLeafNode(otherlv_0, grammarAccess.getSumAggregateAccess().getSUMKeyword_0());
                
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleSumAggregate3128); 

                	newLeafNode(otherlv_1, grammarAccess.getSumAggregateAccess().getLeftParenthesisKeyword_1());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1431:1: ( (lv_isDistinct_2_0= 'DISTINCT' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1432:1: (lv_isDistinct_2_0= 'DISTINCT' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1432:1: (lv_isDistinct_2_0= 'DISTINCT' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1433:3: lv_isDistinct_2_0= 'DISTINCT'
                    {
                    lv_isDistinct_2_0=(Token)match(input,31,FOLLOW_31_in_ruleSumAggregate3146); 

                            newLeafNode(lv_isDistinct_2_0, grammarAccess.getSumAggregateAccess().getIsDistinctDISTINCTKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSumAggregateRule());
                    	        }
                           		setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                    	    

                    }


                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1446:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1447:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1447:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1448:3: lv_item_3_0= ruleAliasAttributeExpression
            {
             
            	        newCompositeNode(grammarAccess.getSumAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSumAggregate3181);
            lv_item_3_0=ruleAliasAttributeExpression();

            state._fsp--;


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

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleSumAggregate3193); 

                	newLeafNode(otherlv_4, grammarAccess.getSumAggregateAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1476:1: entryRuleCountAggregate returns [EObject current=null] : iv_ruleCountAggregate= ruleCountAggregate EOF ;
    public final EObject entryRuleCountAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountAggregate = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1477:2: (iv_ruleCountAggregate= ruleCountAggregate EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1478:2: iv_ruleCountAggregate= ruleCountAggregate EOF
            {
             newCompositeNode(grammarAccess.getCountAggregateRule()); 
            pushFollow(FOLLOW_ruleCountAggregate_in_entryRuleCountAggregate3229);
            iv_ruleCountAggregate=ruleCountAggregate();

            state._fsp--;

             current =iv_ruleCountAggregate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCountAggregate3239); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1485:1: ruleCountAggregate returns [EObject current=null] : (otherlv_0= 'COUNT' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleCountAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isDistinct_2_0=null;
        Token otherlv_4=null;
        EObject lv_item_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1488:28: ( (otherlv_0= 'COUNT' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1489:1: (otherlv_0= 'COUNT' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1489:1: (otherlv_0= 'COUNT' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')' )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1489:3: otherlv_0= 'COUNT' otherlv_1= '(' ( (lv_isDistinct_2_0= 'DISTINCT' ) )? ( (lv_item_3_0= ruleAliasAttributeExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleCountAggregate3276); 

                	newLeafNode(otherlv_0, grammarAccess.getCountAggregateAccess().getCOUNTKeyword_0());
                
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleCountAggregate3288); 

                	newLeafNode(otherlv_1, grammarAccess.getCountAggregateAccess().getLeftParenthesisKeyword_1());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1497:1: ( (lv_isDistinct_2_0= 'DISTINCT' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1498:1: (lv_isDistinct_2_0= 'DISTINCT' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1498:1: (lv_isDistinct_2_0= 'DISTINCT' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1499:3: lv_isDistinct_2_0= 'DISTINCT'
                    {
                    lv_isDistinct_2_0=(Token)match(input,31,FOLLOW_31_in_ruleCountAggregate3306); 

                            newLeafNode(lv_isDistinct_2_0, grammarAccess.getCountAggregateAccess().getIsDistinctDISTINCTKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCountAggregateRule());
                    	        }
                           		setWithLastConsumed(current, "isDistinct", true, "DISTINCT");
                    	    

                    }


                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1512:3: ( (lv_item_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1513:1: (lv_item_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1513:1: (lv_item_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1514:3: lv_item_3_0= ruleAliasAttributeExpression
            {
             
            	        newCompositeNode(grammarAccess.getCountAggregateAccess().getItemAliasAttributeExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleCountAggregate3341);
            lv_item_3_0=ruleAliasAttributeExpression();

            state._fsp--;


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

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleCountAggregate3353); 

                	newLeafNode(otherlv_4, grammarAccess.getCountAggregateAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1542:1: entryRuleSelectConstructorExpression returns [EObject current=null] : iv_ruleSelectConstructorExpression= ruleSelectConstructorExpression EOF ;
    public final EObject entryRuleSelectConstructorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectConstructorExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1543:2: (iv_ruleSelectConstructorExpression= ruleSelectConstructorExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1544:2: iv_ruleSelectConstructorExpression= ruleSelectConstructorExpression EOF
            {
             newCompositeNode(grammarAccess.getSelectConstructorExpressionRule()); 
            pushFollow(FOLLOW_ruleSelectConstructorExpression_in_entryRuleSelectConstructorExpression3389);
            iv_ruleSelectConstructorExpression=ruleSelectConstructorExpression();

            state._fsp--;

             current =iv_ruleSelectConstructorExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectConstructorExpression3399); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1551:1: ruleSelectConstructorExpression returns [EObject current=null] : (otherlv_0= 'NEW' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= ',' ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= ')' ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1554:28: ( (otherlv_0= 'NEW' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= ',' ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= ')' ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1555:1: (otherlv_0= 'NEW' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= ',' ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= ')' )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1555:1: (otherlv_0= 'NEW' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= ',' ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= ')' )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1555:3: otherlv_0= 'NEW' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_items_3_0= ruleAliasAttributeExpression ) ) (otherlv_4= ',' ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleSelectConstructorExpression3436); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectConstructorExpressionAccess().getNEWKeyword_0());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1559:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1560:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1560:1: (lv_name_1_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1561:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectConstructorExpression3453); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSelectConstructorExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleSelectConstructorExpression3470); 

                	newLeafNode(otherlv_2, grammarAccess.getSelectConstructorExpressionAccess().getLeftParenthesisKeyword_2());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1581:1: ( (lv_items_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1582:1: (lv_items_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1582:1: (lv_items_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1583:3: lv_items_3_0= ruleAliasAttributeExpression
            {
             
            	        newCompositeNode(grammarAccess.getSelectConstructorExpressionAccess().getItemsAliasAttributeExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3491);
            lv_items_3_0=ruleAliasAttributeExpression();

            state._fsp--;


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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1599:2: (otherlv_4= ',' ( (lv_items_5_0= ruleAliasAttributeExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==22) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1599:4: otherlv_4= ',' ( (lv_items_5_0= ruleAliasAttributeExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleSelectConstructorExpression3504); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSelectConstructorExpressionAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1603:1: ( (lv_items_5_0= ruleAliasAttributeExpression ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1604:1: (lv_items_5_0= ruleAliasAttributeExpression )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1604:1: (lv_items_5_0= ruleAliasAttributeExpression )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1605:3: lv_items_5_0= ruleAliasAttributeExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSelectConstructorExpressionAccess().getItemsAliasAttributeExpressionParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3525);
            	    lv_items_5_0=ruleAliasAttributeExpression();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleSelectConstructorExpression3539); 

                	newLeafNode(otherlv_6, grammarAccess.getSelectConstructorExpressionAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1633:1: entryRuleFromClause returns [EObject current=null] : iv_ruleFromClause= ruleFromClause EOF ;
    public final EObject entryRuleFromClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1634:2: (iv_ruleFromClause= ruleFromClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1635:2: iv_ruleFromClause= ruleFromClause EOF
            {
             newCompositeNode(grammarAccess.getFromClauseRule()); 
            pushFollow(FOLLOW_ruleFromClause_in_entryRuleFromClause3575);
            iv_ruleFromClause=ruleFromClause();

            state._fsp--;

             current =iv_ruleFromClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClause3585); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1642:1: ruleFromClause returns [EObject current=null] : (otherlv_0= 'FROM' ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) ;
    public final EObject ruleFromClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_fromEntries_1_0 = null;

        EObject lv_fromEntries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1645:28: ( (otherlv_0= 'FROM' ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1646:1: (otherlv_0= 'FROM' ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1646:1: (otherlv_0= 'FROM' ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1646:3: otherlv_0= 'FROM' ( (lv_fromEntries_1_0= ruleFromClass ) ) (otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleFromClause3622); 

                	newLeafNode(otherlv_0, grammarAccess.getFromClauseAccess().getFROMKeyword_0());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1650:1: ( (lv_fromEntries_1_0= ruleFromClass ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1651:1: (lv_fromEntries_1_0= ruleFromClass )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1651:1: (lv_fromEntries_1_0= ruleFromClass )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1652:3: lv_fromEntries_1_0= ruleFromClass
            {
             
            	        newCompositeNode(grammarAccess.getFromClauseAccess().getFromEntriesFromClassParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFromClass_in_ruleFromClause3643);
            lv_fromEntries_1_0=ruleFromClass();

            state._fsp--;


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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1668:2: (otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==22) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1668:4: otherlv_2= ',' ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleFromClause3656); 

            	        	newLeafNode(otherlv_2, grammarAccess.getFromClauseAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1672:1: ( (lv_fromEntries_3_0= ruleFromEntry ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1673:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1673:1: (lv_fromEntries_3_0= ruleFromEntry )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1674:3: lv_fromEntries_3_0= ruleFromEntry
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFromClauseAccess().getFromEntriesFromEntryParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFromEntry_in_ruleFromClause3677);
            	    lv_fromEntries_3_0=ruleFromEntry();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1698:1: entryRuleFromEntry returns [EObject current=null] : iv_ruleFromEntry= ruleFromEntry EOF ;
    public final EObject entryRuleFromEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromEntry = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1699:2: (iv_ruleFromEntry= ruleFromEntry EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1700:2: iv_ruleFromEntry= ruleFromEntry EOF
            {
             newCompositeNode(grammarAccess.getFromEntryRule()); 
            pushFollow(FOLLOW_ruleFromEntry_in_entryRuleFromEntry3715);
            iv_ruleFromEntry=ruleFromEntry();

            state._fsp--;

             current =iv_ruleFromEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromEntry3725); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1707:1: ruleFromEntry returns [EObject current=null] : (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection ) ;
    public final EObject ruleFromEntry() throws RecognitionException {
        EObject current = null;

        EObject this_FromClass_0 = null;

        EObject this_FromCollection_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1710:28: ( (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1711:1: (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1711:1: (this_FromClass_0= ruleFromClass | this_FromCollection_1= ruleFromCollection )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            else if ( (LA26_0==42) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1712:5: this_FromClass_0= ruleFromClass
                    {
                     
                            newCompositeNode(grammarAccess.getFromEntryAccess().getFromClassParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFromClass_in_ruleFromEntry3772);
                    this_FromClass_0=ruleFromClass();

                    state._fsp--;

                     
                            current = this_FromClass_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1722:5: this_FromCollection_1= ruleFromCollection
                    {
                     
                            newCompositeNode(grammarAccess.getFromEntryAccess().getFromCollectionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFromCollection_in_ruleFromEntry3799);
                    this_FromCollection_1=ruleFromCollection();

                    state._fsp--;

                     
                            current = this_FromCollection_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1738:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1739:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1740:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3834);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration3844); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1747:1: ruleVariableDeclaration returns [EObject current=null] : ( (otherlv_0= 'AS' )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1750:28: ( ( (otherlv_0= 'AS' )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1751:1: ( (otherlv_0= 'AS' )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1751:1: ( (otherlv_0= 'AS' )? ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1751:2: (otherlv_0= 'AS' )? ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1751:2: (otherlv_0= 'AS' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1751:4: otherlv_0= 'AS'
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleVariableDeclaration3882); 

                        	newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getASKeyword_0());
                        

                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1755:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1756:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1756:1: (lv_name_1_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1757:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration3901); 

            			newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1781:1: entryRuleFromClass returns [EObject current=null] : iv_ruleFromClass= ruleFromClass EOF ;
    public final EObject entryRuleFromClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClass = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1782:2: (iv_ruleFromClass= ruleFromClass EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1783:2: iv_ruleFromClass= ruleFromClass EOF
            {
             newCompositeNode(grammarAccess.getFromClassRule()); 
            pushFollow(FOLLOW_ruleFromClass_in_entryRuleFromClass3942);
            iv_ruleFromClass=ruleFromClass();

            state._fsp--;

             current =iv_ruleFromClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClass3952); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1790:1: ruleFromClass returns [EObject current=null] : (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar ) ;
    public final EObject ruleFromClass() throws RecognitionException {
        EObject current = null;

        EObject this_FromClassId_0 = null;

        EObject this_FromClassVar_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1793:28: ( (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1794:1: (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1794:1: (this_FromClassId_0= ruleFromClassId | this_FromClassVar_1= ruleFromClassVar )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case 19:
                case 20:
                case 22:
                case 27:
                case 34:
                case 48:
                    {
                    alt28=1;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA28_3 = input.LA(3);

                    if ( (LA28_3==EOF||LA28_3==RULE_ID||(LA28_3>=19 && LA28_3<=20)||LA28_3==22||LA28_3==27||LA28_3==34||LA28_3==43||LA28_3==45||(LA28_3>=47 && LA28_3<=48)) ) {
                        alt28=2;
                    }
                    else if ( (LA28_3==18) ) {
                        alt28=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 41:
                    {
                    alt28=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1795:5: this_FromClassId_0= ruleFromClassId
                    {
                     
                            newCompositeNode(grammarAccess.getFromClassAccess().getFromClassIdParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFromClassId_in_ruleFromClass3999);
                    this_FromClassId_0=ruleFromClassId();

                    state._fsp--;

                     
                            current = this_FromClassId_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1805:5: this_FromClassVar_1= ruleFromClassVar
                    {
                     
                            newCompositeNode(grammarAccess.getFromClassAccess().getFromClassVarParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFromClassVar_in_ruleFromClass4026);
                    this_FromClassVar_1=ruleFromClassVar();

                    state._fsp--;

                     
                            current = this_FromClassVar_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleFromClassId"
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1821:1: entryRuleFromClassId returns [EObject current=null] : iv_ruleFromClassId= ruleFromClassId EOF ;
    public final EObject entryRuleFromClassId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClassId = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1822:2: (iv_ruleFromClassId= ruleFromClassId EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1823:2: iv_ruleFromClassId= ruleFromClassId EOF
            {
             newCompositeNode(grammarAccess.getFromClassIdRule()); 
            pushFollow(FOLLOW_ruleFromClassId_in_entryRuleFromClassId4061);
            iv_ruleFromClassId=ruleFromClassId();

            state._fsp--;

             current =iv_ruleFromClassId; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClassId4071); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1830:1: ruleFromClassId returns [EObject current=null] : ( (lv_type_0_0= RULE_ID ) ) ;
    public final EObject ruleFromClassId() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1833:28: ( ( (lv_type_0_0= RULE_ID ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1834:1: ( (lv_type_0_0= RULE_ID ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1834:1: ( (lv_type_0_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1835:1: (lv_type_0_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1835:1: (lv_type_0_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1836:3: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFromClassId4112); 

            			newLeafNode(lv_type_0_0, grammarAccess.getFromClassIdAccess().getTypeIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFromClassIdRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1860:1: entryRuleFromClassVar returns [EObject current=null] : iv_ruleFromClassVar= ruleFromClassVar EOF ;
    public final EObject entryRuleFromClassVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromClassVar = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1861:2: (iv_ruleFromClassVar= ruleFromClassVar EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1862:2: iv_ruleFromClassVar= ruleFromClassVar EOF
            {
             newCompositeNode(grammarAccess.getFromClassVarRule()); 
            pushFollow(FOLLOW_ruleFromClassVar_in_entryRuleFromClassVar4152);
            iv_ruleFromClassVar=ruleFromClassVar();

            state._fsp--;

             current =iv_ruleFromClassVar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromClassVar4162); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1869:1: ruleFromClassVar returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* ) ;
    public final EObject ruleFromClassVar() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        EObject lv_variable_1_0 = null;

        EObject lv_joins_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1872:28: ( ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1873:1: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1873:1: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1873:2: ( (lv_type_0_0= RULE_ID ) ) ( (lv_variable_1_0= ruleVariableDeclaration ) ) ( (lv_joins_2_0= ruleFromJoin ) )*
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1873:2: ( (lv_type_0_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1874:1: (lv_type_0_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1874:1: (lv_type_0_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1875:3: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFromClassVar4204); 

            			newLeafNode(lv_type_0_0, grammarAccess.getFromClassVarAccess().getTypeIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFromClassVarRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1891:2: ( (lv_variable_1_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1892:1: (lv_variable_1_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1892:1: (lv_variable_1_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1893:3: lv_variable_1_0= ruleVariableDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getFromClassVarAccess().getVariableVariableDeclarationParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleFromClassVar4230);
            lv_variable_1_0=ruleVariableDeclaration();

            state._fsp--;


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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1909:2: ( (lv_joins_2_0= ruleFromJoin ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==43||LA29_0==45||LA29_0==47) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1910:1: (lv_joins_2_0= ruleFromJoin )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1910:1: (lv_joins_2_0= ruleFromJoin )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1911:3: lv_joins_2_0= ruleFromJoin
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFromClassVarAccess().getJoinsFromJoinParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFromJoin_in_ruleFromClassVar4251);
            	    lv_joins_2_0=ruleFromJoin();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1935:1: entryRuleFromCollection returns [EObject current=null] : iv_ruleFromCollection= ruleFromCollection EOF ;
    public final EObject entryRuleFromCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromCollection = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1936:2: (iv_ruleFromCollection= ruleFromCollection EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1937:2: iv_ruleFromCollection= ruleFromCollection EOF
            {
             newCompositeNode(grammarAccess.getFromCollectionRule()); 
            pushFollow(FOLLOW_ruleFromCollection_in_entryRuleFromCollection4288);
            iv_ruleFromCollection=ruleFromCollection();

            state._fsp--;

             current =iv_ruleFromCollection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromCollection4298); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1944:1: ruleFromCollection returns [EObject current=null] : (otherlv_0= 'IN' otherlv_1= '(' ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= ')' ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleFromCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_path_2_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1947:28: ( (otherlv_0= 'IN' otherlv_1= '(' ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= ')' ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1948:1: (otherlv_0= 'IN' otherlv_1= '(' ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= ')' ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1948:1: (otherlv_0= 'IN' otherlv_1= '(' ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= ')' ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1948:3: otherlv_0= 'IN' otherlv_1= '(' ( (lv_path_2_0= ruleAliasAttributeExpression ) ) otherlv_3= ')' ( (lv_variable_4_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleFromCollection4335); 

                	newLeafNode(otherlv_0, grammarAccess.getFromCollectionAccess().getINKeyword_0());
                
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleFromCollection4347); 

                	newLeafNode(otherlv_1, grammarAccess.getFromCollectionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1956:1: ( (lv_path_2_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1957:1: (lv_path_2_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1957:1: (lv_path_2_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1958:3: lv_path_2_0= ruleAliasAttributeExpression
            {
             
            	        newCompositeNode(grammarAccess.getFromCollectionAccess().getPathAliasAttributeExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleFromCollection4368);
            lv_path_2_0=ruleAliasAttributeExpression();

            state._fsp--;


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

            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleFromCollection4380); 

                	newLeafNode(otherlv_3, grammarAccess.getFromCollectionAccess().getRightParenthesisKeyword_3());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1978:1: ( (lv_variable_4_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1979:1: (lv_variable_4_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1979:1: (lv_variable_4_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:1980:3: lv_variable_4_0= ruleVariableDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getFromCollectionAccess().getVariableVariableDeclarationParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleFromCollection4401);
            lv_variable_4_0=ruleVariableDeclaration();

            state._fsp--;


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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2004:1: entryRuleFromJoin returns [EObject current=null] : iv_ruleFromJoin= ruleFromJoin EOF ;
    public final EObject entryRuleFromJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromJoin = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2005:2: (iv_ruleFromJoin= ruleFromJoin EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2006:2: iv_ruleFromJoin= ruleFromJoin EOF
            {
             newCompositeNode(grammarAccess.getFromJoinRule()); 
            pushFollow(FOLLOW_ruleFromJoin_in_entryRuleFromJoin4437);
            iv_ruleFromJoin=ruleFromJoin();

            state._fsp--;

             current =iv_ruleFromJoin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFromJoin4447); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2013:1: ruleFromJoin returns [EObject current=null] : (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin ) ;
    public final EObject ruleFromJoin() throws RecognitionException {
        EObject current = null;

        EObject this_Join_0 = null;

        EObject this_LeftJoin_1 = null;

        EObject this_InnerJoin_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2016:28: ( (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2017:1: (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2017:1: (this_Join_0= ruleJoin | this_LeftJoin_1= ruleLeftJoin | this_InnerJoin_2= ruleInnerJoin )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt30=1;
                }
                break;
            case 45:
                {
                alt30=2;
                }
                break;
            case 47:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2018:5: this_Join_0= ruleJoin
                    {
                     
                            newCompositeNode(grammarAccess.getFromJoinAccess().getJoinParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleJoin_in_ruleFromJoin4494);
                    this_Join_0=ruleJoin();

                    state._fsp--;

                     
                            current = this_Join_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2028:5: this_LeftJoin_1= ruleLeftJoin
                    {
                     
                            newCompositeNode(grammarAccess.getFromJoinAccess().getLeftJoinParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLeftJoin_in_ruleFromJoin4521);
                    this_LeftJoin_1=ruleLeftJoin();

                    state._fsp--;

                     
                            current = this_LeftJoin_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2038:5: this_InnerJoin_2= ruleInnerJoin
                    {
                     
                            newCompositeNode(grammarAccess.getFromJoinAccess().getInnerJoinParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInnerJoin_in_ruleFromJoin4548);
                    this_InnerJoin_2=ruleInnerJoin();

                    state._fsp--;

                     
                            current = this_InnerJoin_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2054:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2055:2: (iv_ruleJoin= ruleJoin EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2056:2: iv_ruleJoin= ruleJoin EOF
            {
             newCompositeNode(grammarAccess.getJoinRule()); 
            pushFollow(FOLLOW_ruleJoin_in_entryRuleJoin4583);
            iv_ruleJoin=ruleJoin();

            state._fsp--;

             current =iv_ruleJoin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoin4593); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2063:1: ruleJoin returns [EObject current=null] : (otherlv_0= 'JOIN' ( (lv_isFetch_1_0= 'FETCH' ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isFetch_1_0=null;
        EObject lv_path_2_0 = null;

        EObject lv_variable_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2066:28: ( (otherlv_0= 'JOIN' ( (lv_isFetch_1_0= 'FETCH' ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2067:1: (otherlv_0= 'JOIN' ( (lv_isFetch_1_0= 'FETCH' ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2067:1: (otherlv_0= 'JOIN' ( (lv_isFetch_1_0= 'FETCH' ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2067:3: otherlv_0= 'JOIN' ( (lv_isFetch_1_0= 'FETCH' ) )? ( (lv_path_2_0= ruleAliasAttributeExpression ) ) ( (lv_variable_3_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleJoin4630); 

                	newLeafNode(otherlv_0, grammarAccess.getJoinAccess().getJOINKeyword_0());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2071:1: ( (lv_isFetch_1_0= 'FETCH' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==44) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2072:1: (lv_isFetch_1_0= 'FETCH' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2072:1: (lv_isFetch_1_0= 'FETCH' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2073:3: lv_isFetch_1_0= 'FETCH'
                    {
                    lv_isFetch_1_0=(Token)match(input,44,FOLLOW_44_in_ruleJoin4648); 

                            newLeafNode(lv_isFetch_1_0, grammarAccess.getJoinAccess().getIsFetchFETCHKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJoinRule());
                    	        }
                           		setWithLastConsumed(current, "isFetch", true, "FETCH");
                    	    

                    }


                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2086:3: ( (lv_path_2_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2087:1: (lv_path_2_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2087:1: (lv_path_2_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2088:3: lv_path_2_0= ruleAliasAttributeExpression
            {
             
            	        newCompositeNode(grammarAccess.getJoinAccess().getPathAliasAttributeExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleJoin4683);
            lv_path_2_0=ruleAliasAttributeExpression();

            state._fsp--;


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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2104:2: ( (lv_variable_3_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2105:1: (lv_variable_3_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2105:1: (lv_variable_3_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2106:3: lv_variable_3_0= ruleVariableDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getJoinAccess().getVariableVariableDeclarationParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleJoin4704);
            lv_variable_3_0=ruleVariableDeclaration();

            state._fsp--;


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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2130:1: entryRuleLeftJoin returns [EObject current=null] : iv_ruleLeftJoin= ruleLeftJoin EOF ;
    public final EObject entryRuleLeftJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftJoin = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2131:2: (iv_ruleLeftJoin= ruleLeftJoin EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2132:2: iv_ruleLeftJoin= ruleLeftJoin EOF
            {
             newCompositeNode(grammarAccess.getLeftJoinRule()); 
            pushFollow(FOLLOW_ruleLeftJoin_in_entryRuleLeftJoin4740);
            iv_ruleLeftJoin=ruleLeftJoin();

            state._fsp--;

             current =iv_ruleLeftJoin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftJoin4750); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2139:1: ruleLeftJoin returns [EObject current=null] : (otherlv_0= 'LEFT' ( (lv_isOuter_1_0= 'OUTER' ) )? otherlv_2= 'JOIN' ( (lv_isFetch_3_0= 'FETCH' ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2142:28: ( (otherlv_0= 'LEFT' ( (lv_isOuter_1_0= 'OUTER' ) )? otherlv_2= 'JOIN' ( (lv_isFetch_3_0= 'FETCH' ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2143:1: (otherlv_0= 'LEFT' ( (lv_isOuter_1_0= 'OUTER' ) )? otherlv_2= 'JOIN' ( (lv_isFetch_3_0= 'FETCH' ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2143:1: (otherlv_0= 'LEFT' ( (lv_isOuter_1_0= 'OUTER' ) )? otherlv_2= 'JOIN' ( (lv_isFetch_3_0= 'FETCH' ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2143:3: otherlv_0= 'LEFT' ( (lv_isOuter_1_0= 'OUTER' ) )? otherlv_2= 'JOIN' ( (lv_isFetch_3_0= 'FETCH' ) )? ( (lv_path_4_0= ruleAliasAttributeExpression ) ) ( (lv_variable_5_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleLeftJoin4787); 

                	newLeafNode(otherlv_0, grammarAccess.getLeftJoinAccess().getLEFTKeyword_0());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2147:1: ( (lv_isOuter_1_0= 'OUTER' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==46) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2148:1: (lv_isOuter_1_0= 'OUTER' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2148:1: (lv_isOuter_1_0= 'OUTER' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2149:3: lv_isOuter_1_0= 'OUTER'
                    {
                    lv_isOuter_1_0=(Token)match(input,46,FOLLOW_46_in_ruleLeftJoin4805); 

                            newLeafNode(lv_isOuter_1_0, grammarAccess.getLeftJoinAccess().getIsOuterOUTERKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLeftJoinRule());
                    	        }
                           		setWithLastConsumed(current, "isOuter", true, "OUTER");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleLeftJoin4831); 

                	newLeafNode(otherlv_2, grammarAccess.getLeftJoinAccess().getJOINKeyword_2());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2166:1: ( (lv_isFetch_3_0= 'FETCH' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==44) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2167:1: (lv_isFetch_3_0= 'FETCH' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2167:1: (lv_isFetch_3_0= 'FETCH' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2168:3: lv_isFetch_3_0= 'FETCH'
                    {
                    lv_isFetch_3_0=(Token)match(input,44,FOLLOW_44_in_ruleLeftJoin4849); 

                            newLeafNode(lv_isFetch_3_0, grammarAccess.getLeftJoinAccess().getIsFetchFETCHKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLeftJoinRule());
                    	        }
                           		setWithLastConsumed(current, "isFetch", true, "FETCH");
                    	    

                    }


                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2181:3: ( (lv_path_4_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2182:1: (lv_path_4_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2182:1: (lv_path_4_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2183:3: lv_path_4_0= ruleAliasAttributeExpression
            {
             
            	        newCompositeNode(grammarAccess.getLeftJoinAccess().getPathAliasAttributeExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleLeftJoin4884);
            lv_path_4_0=ruleAliasAttributeExpression();

            state._fsp--;


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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2199:2: ( (lv_variable_5_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2200:1: (lv_variable_5_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2200:1: (lv_variable_5_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2201:3: lv_variable_5_0= ruleVariableDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getLeftJoinAccess().getVariableVariableDeclarationParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleLeftJoin4905);
            lv_variable_5_0=ruleVariableDeclaration();

            state._fsp--;


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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2225:1: entryRuleInnerJoin returns [EObject current=null] : iv_ruleInnerJoin= ruleInnerJoin EOF ;
    public final EObject entryRuleInnerJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInnerJoin = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2226:2: (iv_ruleInnerJoin= ruleInnerJoin EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2227:2: iv_ruleInnerJoin= ruleInnerJoin EOF
            {
             newCompositeNode(grammarAccess.getInnerJoinRule()); 
            pushFollow(FOLLOW_ruleInnerJoin_in_entryRuleInnerJoin4941);
            iv_ruleInnerJoin=ruleInnerJoin();

            state._fsp--;

             current =iv_ruleInnerJoin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInnerJoin4951); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2234:1: ruleInnerJoin returns [EObject current=null] : (otherlv_0= 'INNER' otherlv_1= 'JOIN' ( (lv_isFetch_2_0= 'FETCH' ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) ;
    public final EObject ruleInnerJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isFetch_2_0=null;
        EObject lv_path_3_0 = null;

        EObject lv_variable_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2237:28: ( (otherlv_0= 'INNER' otherlv_1= 'JOIN' ( (lv_isFetch_2_0= 'FETCH' ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2238:1: (otherlv_0= 'INNER' otherlv_1= 'JOIN' ( (lv_isFetch_2_0= 'FETCH' ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2238:1: (otherlv_0= 'INNER' otherlv_1= 'JOIN' ( (lv_isFetch_2_0= 'FETCH' ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2238:3: otherlv_0= 'INNER' otherlv_1= 'JOIN' ( (lv_isFetch_2_0= 'FETCH' ) )? ( (lv_path_3_0= ruleAliasAttributeExpression ) ) ( (lv_variable_4_0= ruleVariableDeclaration ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleInnerJoin4988); 

                	newLeafNode(otherlv_0, grammarAccess.getInnerJoinAccess().getINNERKeyword_0());
                
            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleInnerJoin5000); 

                	newLeafNode(otherlv_1, grammarAccess.getInnerJoinAccess().getJOINKeyword_1());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2246:1: ( (lv_isFetch_2_0= 'FETCH' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==44) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2247:1: (lv_isFetch_2_0= 'FETCH' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2247:1: (lv_isFetch_2_0= 'FETCH' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2248:3: lv_isFetch_2_0= 'FETCH'
                    {
                    lv_isFetch_2_0=(Token)match(input,44,FOLLOW_44_in_ruleInnerJoin5018); 

                            newLeafNode(lv_isFetch_2_0, grammarAccess.getInnerJoinAccess().getIsFetchFETCHKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInnerJoinRule());
                    	        }
                           		setWithLastConsumed(current, "isFetch", true, "FETCH");
                    	    

                    }


                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2261:3: ( (lv_path_3_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2262:1: (lv_path_3_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2262:1: (lv_path_3_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2263:3: lv_path_3_0= ruleAliasAttributeExpression
            {
             
            	        newCompositeNode(grammarAccess.getInnerJoinAccess().getPathAliasAttributeExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleInnerJoin5053);
            lv_path_3_0=ruleAliasAttributeExpression();

            state._fsp--;


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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2279:2: ( (lv_variable_4_0= ruleVariableDeclaration ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2280:1: (lv_variable_4_0= ruleVariableDeclaration )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2280:1: (lv_variable_4_0= ruleVariableDeclaration )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2281:3: lv_variable_4_0= ruleVariableDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getInnerJoinAccess().getVariableVariableDeclarationParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleInnerJoin5074);
            lv_variable_4_0=ruleVariableDeclaration();

            state._fsp--;


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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2305:1: entryRuleWhereClause returns [EObject current=null] : iv_ruleWhereClause= ruleWhereClause EOF ;
    public final EObject entryRuleWhereClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereClause = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2306:2: (iv_ruleWhereClause= ruleWhereClause EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2307:2: iv_ruleWhereClause= ruleWhereClause EOF
            {
             newCompositeNode(grammarAccess.getWhereClauseRule()); 
            pushFollow(FOLLOW_ruleWhereClause_in_entryRuleWhereClause5110);
            iv_ruleWhereClause=ruleWhereClause();

            state._fsp--;

             current =iv_ruleWhereClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhereClause5120); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2314:1: ruleWhereClause returns [EObject current=null] : (otherlv_0= 'WHERE' ( (lv_whereEntry_1_0= ruleOrExpression ) ) ) ;
    public final EObject ruleWhereClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_whereEntry_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2317:28: ( (otherlv_0= 'WHERE' ( (lv_whereEntry_1_0= ruleOrExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2318:1: (otherlv_0= 'WHERE' ( (lv_whereEntry_1_0= ruleOrExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2318:1: (otherlv_0= 'WHERE' ( (lv_whereEntry_1_0= ruleOrExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2318:3: otherlv_0= 'WHERE' ( (lv_whereEntry_1_0= ruleOrExpression ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleWhereClause5157); 

                	newLeafNode(otherlv_0, grammarAccess.getWhereClauseAccess().getWHEREKeyword_0());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2322:1: ( (lv_whereEntry_1_0= ruleOrExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2323:1: (lv_whereEntry_1_0= ruleOrExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2323:1: (lv_whereEntry_1_0= ruleOrExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2324:3: lv_whereEntry_1_0= ruleOrExpression
            {
             
            	        newCompositeNode(grammarAccess.getWhereClauseAccess().getWhereEntryOrExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleOrExpression_in_ruleWhereClause5178);
            lv_whereEntry_1_0=ruleOrExpression();

            state._fsp--;


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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2348:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2349:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2350:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression5214);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression5224); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2357:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2360:28: ( (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2361:1: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2361:1: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndExpression ) ) )+ )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2362:5: this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndExpression ) ) )+ )?
            {
             
                    newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression5271);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;

             
                    current = this_AndExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2370:1: ( () (otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndExpression ) ) )+ )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==49) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2370:2: () (otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndExpression ) ) )+
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2370:2: ()
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2371:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getOrExpressionAccess().getOrExpressionEntriesAction_1_0(),
                                current);
                        

                    }

                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2376:2: (otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndExpression ) ) )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==49) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2376:4: otherlv_2= 'OR' ( (lv_entries_3_0= ruleAndExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleOrExpression5293); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getORKeyword_1_1_0());
                    	        
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2380:1: ( (lv_entries_3_0= ruleAndExpression ) )
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2381:1: (lv_entries_3_0= ruleAndExpression )
                    	    {
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2381:1: (lv_entries_3_0= ruleAndExpression )
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2382:3: lv_entries_3_0= ruleAndExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOrExpressionAccess().getEntriesAndExpressionParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression5314);
                    	    lv_entries_3_0=ruleAndExpression();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2406:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2407:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2408:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression5354);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression5364); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2415:1: ruleAndExpression returns [EObject current=null] : (this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ConcreteExpression_0 = null;

        EObject lv_entries_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2418:28: ( (this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2419:1: (this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2419:1: (this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )? )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2420:5: this_ConcreteExpression_0= ruleConcreteExpression ( () (otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )?
            {
             
                    newCompositeNode(grammarAccess.getAndExpressionAccess().getConcreteExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleConcreteExpression_in_ruleAndExpression5411);
            this_ConcreteExpression_0=ruleConcreteExpression();

            state._fsp--;

             
                    current = this_ConcreteExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2428:1: ( () (otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteExpression ) ) )+ )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==50) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2428:2: () (otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteExpression ) ) )+
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2428:2: ()
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2429:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getAndExpressionAccess().getAndExpressionEntriesAction_1_0(),
                                current);
                        

                    }

                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2434:2: (otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteExpression ) ) )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==50) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2434:4: otherlv_2= 'AND' ( (lv_entries_3_0= ruleConcreteExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleAndExpression5433); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getANDKeyword_1_1_0());
                    	        
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2438:1: ( (lv_entries_3_0= ruleConcreteExpression ) )
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2439:1: (lv_entries_3_0= ruleConcreteExpression )
                    	    {
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2439:1: (lv_entries_3_0= ruleConcreteExpression )
                    	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2440:3: lv_entries_3_0= ruleConcreteExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAndExpressionAccess().getEntriesConcreteExpressionParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConcreteExpression_in_ruleAndExpression5454);
                    	    lv_entries_3_0=ruleConcreteExpression();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    if ( cnt37 >= 1 ) break loop37;
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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2464:1: entryRuleConcreteExpression returns [EObject current=null] : iv_ruleConcreteExpression= ruleConcreteExpression EOF ;
    public final EObject entryRuleConcreteExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2465:2: (iv_ruleConcreteExpression= ruleConcreteExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2466:2: iv_ruleConcreteExpression= ruleConcreteExpression EOF
            {
             newCompositeNode(grammarAccess.getConcreteExpressionRule()); 
            pushFollow(FOLLOW_ruleConcreteExpression_in_entryRuleConcreteExpression5494);
            iv_ruleConcreteExpression=ruleConcreteExpression();

            state._fsp--;

             current =iv_ruleConcreteExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcreteExpression5504); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2473:1: ruleConcreteExpression returns [EObject current=null] : (this_ParExpression_0= ruleParExpression | this_OperatorExpression_1= ruleOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2476:28: ( (this_ParExpression_0= ruleParExpression | this_OperatorExpression_1= ruleOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2477:1: (this_ParExpression_0= ruleParExpression | this_OperatorExpression_1= ruleOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2477:1: (this_ParExpression_0= ruleParExpression | this_OperatorExpression_1= ruleOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression )
            int alt39=12;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2478:5: this_ParExpression_0= ruleParExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteExpressionAccess().getParExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleParExpression_in_ruleConcreteExpression5551);
                    this_ParExpression_0=ruleParExpression();

                    state._fsp--;

                     
                            current = this_ParExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2488:5: this_OperatorExpression_1= ruleOperatorExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteExpressionAccess().getOperatorExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOperatorExpression_in_ruleConcreteExpression5578);
                    this_OperatorExpression_1=ruleOperatorExpression();

                    state._fsp--;

                     
                            current = this_OperatorExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2498:5: this_ExistsExpression_2= ruleExistsExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteExpressionAccess().getExistsExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleExistsExpression_in_ruleConcreteExpression5605);
                    this_ExistsExpression_2=ruleExistsExpression();

                    state._fsp--;

                     
                            current = this_ExistsExpression_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2508:5: this_AllExpression_3= ruleAllExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteExpressionAccess().getAllExpressionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAllExpression_in_ruleConcreteExpression5632);
                    this_AllExpression_3=ruleAllExpression();

                    state._fsp--;

                     
                            current = this_AllExpression_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2518:5: this_AnyExpression_4= ruleAnyExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteExpressionAccess().getAnyExpressionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleAnyExpression_in_ruleConcreteExpression5659);
                    this_AnyExpression_4=ruleAnyExpression();

                    state._fsp--;

                     
                            current = this_AnyExpression_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2528:5: this_SomeExpression_5= ruleSomeExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteExpressionAccess().getSomeExpressionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleSomeExpression_in_ruleConcreteExpression5686);
                    this_SomeExpression_5=ruleSomeExpression();

                    state._fsp--;

                     
                            current = this_SomeExpression_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2538:5: this_CollectionExpression_6= ruleCollectionExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteExpressionAccess().getCollectionExpressionParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleCollectionExpression_in_ruleConcreteExpression5713);
                    this_CollectionExpression_6=ruleCollectionExpression();

                    state._fsp--;

                     
                            current = this_CollectionExpression_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2548:5: this_NullComparisonExpression_7= ruleNullComparisonExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteExpressionAccess().getNullComparisonExpressionParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleNullComparisonExpression_in_ruleConcreteExpression5740);
                    this_NullComparisonExpression_7=ruleNullComparisonExpression();

                    state._fsp--;

                     
                            current = this_NullComparisonExpression_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2558:5: this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteExpressionAccess().getEmptyComparisonExpressionParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleEmptyComparisonExpression_in_ruleConcreteExpression5767);
                    this_EmptyComparisonExpression_8=ruleEmptyComparisonExpression();

                    state._fsp--;

                     
                            current = this_EmptyComparisonExpression_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2568:5: this_LikeExpression_9= ruleLikeExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteExpressionAccess().getLikeExpressionParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleLikeExpression_in_ruleConcreteExpression5794);
                    this_LikeExpression_9=ruleLikeExpression();

                    state._fsp--;

                     
                            current = this_LikeExpression_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2578:5: this_InExpression_10= ruleInExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteExpressionAccess().getInExpressionParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleInExpression_in_ruleConcreteExpression5821);
                    this_InExpression_10=ruleInExpression();

                    state._fsp--;

                     
                            current = this_InExpression_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2588:5: this_BetweenExpression_11= ruleBetweenExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConcreteExpressionAccess().getBetweenExpressionParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleBetweenExpression_in_ruleConcreteExpression5848);
                    this_BetweenExpression_11=ruleBetweenExpression();

                    state._fsp--;

                     
                            current = this_BetweenExpression_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2604:1: entryRuleParExpression returns [EObject current=null] : iv_ruleParExpression= ruleParExpression EOF ;
    public final EObject entryRuleParExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2605:2: (iv_ruleParExpression= ruleParExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2606:2: iv_ruleParExpression= ruleParExpression EOF
            {
             newCompositeNode(grammarAccess.getParExpressionRule()); 
            pushFollow(FOLLOW_ruleParExpression_in_entryRuleParExpression5883);
            iv_ruleParExpression=ruleParExpression();

            state._fsp--;

             current =iv_ruleParExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParExpression5893); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2613:1: ruleParExpression returns [EObject current=null] : (otherlv_0= '(' this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= ')' ) ;
    public final EObject ruleParExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ExpressionTerm_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2616:28: ( (otherlv_0= '(' this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= ')' ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2617:1: (otherlv_0= '(' this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= ')' )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2617:1: (otherlv_0= '(' this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= ')' )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2617:3: otherlv_0= '(' this_ExpressionTerm_1= ruleExpressionTerm otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleParExpression5930); 

                	newLeafNode(otherlv_0, grammarAccess.getParExpressionAccess().getLeftParenthesisKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getParExpressionAccess().getExpressionTermParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleExpressionTerm_in_ruleParExpression5952);
            this_ExpressionTerm_1=ruleExpressionTerm();

            state._fsp--;

             
                    current = this_ExpressionTerm_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleParExpression5963); 

                	newLeafNode(otherlv_2, grammarAccess.getParExpressionAccess().getRightParenthesisKeyword_2());
                

            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2642:1: entryRuleOperatorExpression returns [EObject current=null] : iv_ruleOperatorExpression= ruleOperatorExpression EOF ;
    public final EObject entryRuleOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatorExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2643:2: (iv_ruleOperatorExpression= ruleOperatorExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2644:2: iv_ruleOperatorExpression= ruleOperatorExpression EOF
            {
             newCompositeNode(grammarAccess.getOperatorExpressionRule()); 
            pushFollow(FOLLOW_ruleOperatorExpression_in_entryRuleOperatorExpression5999);
            iv_ruleOperatorExpression=ruleOperatorExpression();

            state._fsp--;

             current =iv_ruleOperatorExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorExpression6009); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2651:1: ruleOperatorExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) ) ) ;
    public final EObject ruleOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_lhs_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_rhs_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2654:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2655:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2655:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2655:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rhs_2_0= ruleExpressionTerm ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2655:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2656:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2656:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2657:3: lv_lhs_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getOperatorExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleOperatorExpression6055);
            lv_lhs_0_0=ruleVariable();

            state._fsp--;


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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2673:2: ( (lv_operator_1_0= ruleOperator ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2674:1: (lv_operator_1_0= ruleOperator )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2674:1: (lv_operator_1_0= ruleOperator )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2675:3: lv_operator_1_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getOperatorExpressionAccess().getOperatorOperatorEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleOperator_in_ruleOperatorExpression6076);
            lv_operator_1_0=ruleOperator();

            state._fsp--;


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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2691:2: ( (lv_rhs_2_0= ruleExpressionTerm ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2692:1: (lv_rhs_2_0= ruleExpressionTerm )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2692:1: (lv_rhs_2_0= ruleExpressionTerm )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2693:3: lv_rhs_2_0= ruleExpressionTerm
            {
             
            	        newCompositeNode(grammarAccess.getOperatorExpressionAccess().getRhsExpressionTermParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpressionTerm_in_ruleOperatorExpression6097);
            lv_rhs_2_0=ruleExpressionTerm();

            state._fsp--;


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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2717:1: entryRuleExistsExpression returns [EObject current=null] : iv_ruleExistsExpression= ruleExistsExpression EOF ;
    public final EObject entryRuleExistsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistsExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2718:2: (iv_ruleExistsExpression= ruleExistsExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2719:2: iv_ruleExistsExpression= ruleExistsExpression EOF
            {
             newCompositeNode(grammarAccess.getExistsExpressionRule()); 
            pushFollow(FOLLOW_ruleExistsExpression_in_entryRuleExistsExpression6133);
            iv_ruleExistsExpression=ruleExistsExpression();

            state._fsp--;

             current =iv_ruleExistsExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExistsExpression6143); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2726:1: ruleExistsExpression returns [EObject current=null] : ( ( (lv_isNot_0_0= 'NOT' ) )? otherlv_1= 'EXISTS' ( (lv_query_2_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleExistsExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_0_0=null;
        Token otherlv_1=null;
        EObject lv_query_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2729:28: ( ( ( (lv_isNot_0_0= 'NOT' ) )? otherlv_1= 'EXISTS' ( (lv_query_2_0= ruleQueryExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2730:1: ( ( (lv_isNot_0_0= 'NOT' ) )? otherlv_1= 'EXISTS' ( (lv_query_2_0= ruleQueryExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2730:1: ( ( (lv_isNot_0_0= 'NOT' ) )? otherlv_1= 'EXISTS' ( (lv_query_2_0= ruleQueryExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2730:2: ( (lv_isNot_0_0= 'NOT' ) )? otherlv_1= 'EXISTS' ( (lv_query_2_0= ruleQueryExpression ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2730:2: ( (lv_isNot_0_0= 'NOT' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==51) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2731:1: (lv_isNot_0_0= 'NOT' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2731:1: (lv_isNot_0_0= 'NOT' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2732:3: lv_isNot_0_0= 'NOT'
                    {
                    lv_isNot_0_0=(Token)match(input,51,FOLLOW_51_in_ruleExistsExpression6186); 

                            newLeafNode(lv_isNot_0_0, grammarAccess.getExistsExpressionAccess().getIsNotNOTKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExistsExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "isNot", true, "NOT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleExistsExpression6212); 

                	newLeafNode(otherlv_1, grammarAccess.getExistsExpressionAccess().getEXISTSKeyword_1());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2749:1: ( (lv_query_2_0= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2750:1: (lv_query_2_0= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2750:1: (lv_query_2_0= ruleQueryExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2751:3: lv_query_2_0= ruleQueryExpression
            {
             
            	        newCompositeNode(grammarAccess.getExistsExpressionAccess().getQueryQueryExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleExistsExpression6233);
            lv_query_2_0=ruleQueryExpression();

            state._fsp--;


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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2775:1: entryRuleAllExpression returns [EObject current=null] : iv_ruleAllExpression= ruleAllExpression EOF ;
    public final EObject entryRuleAllExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2776:2: (iv_ruleAllExpression= ruleAllExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2777:2: iv_ruleAllExpression= ruleAllExpression EOF
            {
             newCompositeNode(grammarAccess.getAllExpressionRule()); 
            pushFollow(FOLLOW_ruleAllExpression_in_entryRuleAllExpression6269);
            iv_ruleAllExpression=ruleAllExpression();

            state._fsp--;

             current =iv_ruleAllExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllExpression6279); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2784:1: ruleAllExpression returns [EObject current=null] : (otherlv_0= 'ALL' ( (lv_query_1_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleAllExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_query_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2787:28: ( (otherlv_0= 'ALL' ( (lv_query_1_0= ruleQueryExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2788:1: (otherlv_0= 'ALL' ( (lv_query_1_0= ruleQueryExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2788:1: (otherlv_0= 'ALL' ( (lv_query_1_0= ruleQueryExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2788:3: otherlv_0= 'ALL' ( (lv_query_1_0= ruleQueryExpression ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleAllExpression6316); 

                	newLeafNode(otherlv_0, grammarAccess.getAllExpressionAccess().getALLKeyword_0());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2792:1: ( (lv_query_1_0= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2793:1: (lv_query_1_0= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2793:1: (lv_query_1_0= ruleQueryExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2794:3: lv_query_1_0= ruleQueryExpression
            {
             
            	        newCompositeNode(grammarAccess.getAllExpressionAccess().getQueryQueryExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleAllExpression6337);
            lv_query_1_0=ruleQueryExpression();

            state._fsp--;


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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2818:1: entryRuleAnyExpression returns [EObject current=null] : iv_ruleAnyExpression= ruleAnyExpression EOF ;
    public final EObject entryRuleAnyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2819:2: (iv_ruleAnyExpression= ruleAnyExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2820:2: iv_ruleAnyExpression= ruleAnyExpression EOF
            {
             newCompositeNode(grammarAccess.getAnyExpressionRule()); 
            pushFollow(FOLLOW_ruleAnyExpression_in_entryRuleAnyExpression6373);
            iv_ruleAnyExpression=ruleAnyExpression();

            state._fsp--;

             current =iv_ruleAnyExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnyExpression6383); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2827:1: ruleAnyExpression returns [EObject current=null] : (otherlv_0= 'ANY' ( (lv_query_1_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleAnyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_query_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2830:28: ( (otherlv_0= 'ANY' ( (lv_query_1_0= ruleQueryExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2831:1: (otherlv_0= 'ANY' ( (lv_query_1_0= ruleQueryExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2831:1: (otherlv_0= 'ANY' ( (lv_query_1_0= ruleQueryExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2831:3: otherlv_0= 'ANY' ( (lv_query_1_0= ruleQueryExpression ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleAnyExpression6420); 

                	newLeafNode(otherlv_0, grammarAccess.getAnyExpressionAccess().getANYKeyword_0());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2835:1: ( (lv_query_1_0= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2836:1: (lv_query_1_0= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2836:1: (lv_query_1_0= ruleQueryExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2837:3: lv_query_1_0= ruleQueryExpression
            {
             
            	        newCompositeNode(grammarAccess.getAnyExpressionAccess().getQueryQueryExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleAnyExpression6441);
            lv_query_1_0=ruleQueryExpression();

            state._fsp--;


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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2861:1: entryRuleSomeExpression returns [EObject current=null] : iv_ruleSomeExpression= ruleSomeExpression EOF ;
    public final EObject entryRuleSomeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSomeExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2862:2: (iv_ruleSomeExpression= ruleSomeExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2863:2: iv_ruleSomeExpression= ruleSomeExpression EOF
            {
             newCompositeNode(grammarAccess.getSomeExpressionRule()); 
            pushFollow(FOLLOW_ruleSomeExpression_in_entryRuleSomeExpression6477);
            iv_ruleSomeExpression=ruleSomeExpression();

            state._fsp--;

             current =iv_ruleSomeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSomeExpression6487); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2870:1: ruleSomeExpression returns [EObject current=null] : (otherlv_0= 'SOME' ( (lv_query_1_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleSomeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_query_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2873:28: ( (otherlv_0= 'SOME' ( (lv_query_1_0= ruleQueryExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2874:1: (otherlv_0= 'SOME' ( (lv_query_1_0= ruleQueryExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2874:1: (otherlv_0= 'SOME' ( (lv_query_1_0= ruleQueryExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2874:3: otherlv_0= 'SOME' ( (lv_query_1_0= ruleQueryExpression ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleSomeExpression6524); 

                	newLeafNode(otherlv_0, grammarAccess.getSomeExpressionAccess().getSOMEKeyword_0());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2878:1: ( (lv_query_1_0= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2879:1: (lv_query_1_0= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2879:1: (lv_query_1_0= ruleQueryExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2880:3: lv_query_1_0= ruleQueryExpression
            {
             
            	        newCompositeNode(grammarAccess.getSomeExpressionAccess().getQueryQueryExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleSomeExpression6545);
            lv_query_1_0=ruleQueryExpression();

            state._fsp--;


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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2904:1: entryRuleCollectionExpression returns [EObject current=null] : iv_ruleCollectionExpression= ruleCollectionExpression EOF ;
    public final EObject entryRuleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2905:2: (iv_ruleCollectionExpression= ruleCollectionExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2906:2: iv_ruleCollectionExpression= ruleCollectionExpression EOF
            {
             newCompositeNode(grammarAccess.getCollectionExpressionRule()); 
            pushFollow(FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression6581);
            iv_ruleCollectionExpression=ruleCollectionExpression();

            state._fsp--;

             current =iv_ruleCollectionExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionExpression6591); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2913:1: ruleCollectionExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'MEMBER' (otherlv_3= 'OF' )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) ) ) ;
    public final EObject ruleCollectionExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2916:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'MEMBER' (otherlv_3= 'OF' )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2917:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'MEMBER' (otherlv_3= 'OF' )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2917:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'MEMBER' (otherlv_3= 'OF' )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2917:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'MEMBER' (otherlv_3= 'OF' )? ( (lv_rhs_4_0= ruleAliasAttributeExpression ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2917:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2918:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2918:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2919:3: lv_lhs_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getCollectionExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleCollectionExpression6637);
            lv_lhs_0_0=ruleVariable();

            state._fsp--;


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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2935:2: ( (lv_isNot_1_0= 'NOT' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==51) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2936:1: (lv_isNot_1_0= 'NOT' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2936:1: (lv_isNot_1_0= 'NOT' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2937:3: lv_isNot_1_0= 'NOT'
                    {
                    lv_isNot_1_0=(Token)match(input,51,FOLLOW_51_in_ruleCollectionExpression6655); 

                            newLeafNode(lv_isNot_1_0, grammarAccess.getCollectionExpressionAccess().getIsNotNOTKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "isNot", true, "NOT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleCollectionExpression6681); 

                	newLeafNode(otherlv_2, grammarAccess.getCollectionExpressionAccess().getMEMBERKeyword_2());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2954:1: (otherlv_3= 'OF' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==57) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2954:3: otherlv_3= 'OF'
                    {
                    otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleCollectionExpression6694); 

                        	newLeafNode(otherlv_3, grammarAccess.getCollectionExpressionAccess().getOFKeyword_3());
                        

                    }
                    break;

            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2958:3: ( (lv_rhs_4_0= ruleAliasAttributeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2959:1: (lv_rhs_4_0= ruleAliasAttributeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2959:1: (lv_rhs_4_0= ruleAliasAttributeExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2960:3: lv_rhs_4_0= ruleAliasAttributeExpression
            {
             
            	        newCompositeNode(grammarAccess.getCollectionExpressionAccess().getRhsAliasAttributeExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleCollectionExpression6717);
            lv_rhs_4_0=ruleAliasAttributeExpression();

            state._fsp--;


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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2984:1: entryRuleNullComparisonExpression returns [EObject current=null] : iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF ;
    public final EObject entryRuleNullComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullComparisonExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2985:2: (iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2986:2: iv_ruleNullComparisonExpression= ruleNullComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getNullComparisonExpressionRule()); 
            pushFollow(FOLLOW_ruleNullComparisonExpression_in_entryRuleNullComparisonExpression6753);
            iv_ruleNullComparisonExpression=ruleNullComparisonExpression();

            state._fsp--;

             current =iv_ruleNullComparisonExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullComparisonExpression6763); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2993:1: ruleNullComparisonExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= 'IS' ( (lv_isNot_2_0= 'NOT' ) )? otherlv_3= 'NULL' ) ;
    public final EObject ruleNullComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isNot_2_0=null;
        Token otherlv_3=null;
        EObject lv_lhs_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2996:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= 'IS' ( (lv_isNot_2_0= 'NOT' ) )? otherlv_3= 'NULL' ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2997:1: ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= 'IS' ( (lv_isNot_2_0= 'NOT' ) )? otherlv_3= 'NULL' )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2997:1: ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= 'IS' ( (lv_isNot_2_0= 'NOT' ) )? otherlv_3= 'NULL' )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2997:2: ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= 'IS' ( (lv_isNot_2_0= 'NOT' ) )? otherlv_3= 'NULL'
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2997:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2998:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2998:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:2999:3: lv_lhs_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getNullComparisonExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleNullComparisonExpression6809);
            lv_lhs_0_0=ruleVariable();

            state._fsp--;


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

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleNullComparisonExpression6821); 

                	newLeafNode(otherlv_1, grammarAccess.getNullComparisonExpressionAccess().getISKeyword_1());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3019:1: ( (lv_isNot_2_0= 'NOT' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==51) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3020:1: (lv_isNot_2_0= 'NOT' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3020:1: (lv_isNot_2_0= 'NOT' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3021:3: lv_isNot_2_0= 'NOT'
                    {
                    lv_isNot_2_0=(Token)match(input,51,FOLLOW_51_in_ruleNullComparisonExpression6839); 

                            newLeafNode(lv_isNot_2_0, grammarAccess.getNullComparisonExpressionAccess().getIsNotNOTKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNullComparisonExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "isNot", true, "NOT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,59,FOLLOW_59_in_ruleNullComparisonExpression6865); 

                	newLeafNode(otherlv_3, grammarAccess.getNullComparisonExpressionAccess().getNULLKeyword_3());
                

            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3046:1: entryRuleEmptyComparisonExpression returns [EObject current=null] : iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF ;
    public final EObject entryRuleEmptyComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyComparisonExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3047:2: (iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3048:2: iv_ruleEmptyComparisonExpression= ruleEmptyComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getEmptyComparisonExpressionRule()); 
            pushFollow(FOLLOW_ruleEmptyComparisonExpression_in_entryRuleEmptyComparisonExpression6901);
            iv_ruleEmptyComparisonExpression=ruleEmptyComparisonExpression();

            state._fsp--;

             current =iv_ruleEmptyComparisonExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmptyComparisonExpression6911); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3055:1: ruleEmptyComparisonExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= 'IS' ( (lv_isNot_2_0= 'NOT' ) )? otherlv_3= 'EMPTY' ) ;
    public final EObject ruleEmptyComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isNot_2_0=null;
        Token otherlv_3=null;
        EObject lv_lhs_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3058:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= 'IS' ( (lv_isNot_2_0= 'NOT' ) )? otherlv_3= 'EMPTY' ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3059:1: ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= 'IS' ( (lv_isNot_2_0= 'NOT' ) )? otherlv_3= 'EMPTY' )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3059:1: ( ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= 'IS' ( (lv_isNot_2_0= 'NOT' ) )? otherlv_3= 'EMPTY' )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3059:2: ( (lv_lhs_0_0= ruleVariable ) ) otherlv_1= 'IS' ( (lv_isNot_2_0= 'NOT' ) )? otherlv_3= 'EMPTY'
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3059:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3060:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3060:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3061:3: lv_lhs_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getEmptyComparisonExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleEmptyComparisonExpression6957);
            lv_lhs_0_0=ruleVariable();

            state._fsp--;


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

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleEmptyComparisonExpression6969); 

                	newLeafNode(otherlv_1, grammarAccess.getEmptyComparisonExpressionAccess().getISKeyword_1());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3081:1: ( (lv_isNot_2_0= 'NOT' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==51) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3082:1: (lv_isNot_2_0= 'NOT' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3082:1: (lv_isNot_2_0= 'NOT' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3083:3: lv_isNot_2_0= 'NOT'
                    {
                    lv_isNot_2_0=(Token)match(input,51,FOLLOW_51_in_ruleEmptyComparisonExpression6987); 

                            newLeafNode(lv_isNot_2_0, grammarAccess.getEmptyComparisonExpressionAccess().getIsNotNOTKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEmptyComparisonExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "isNot", true, "NOT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,60,FOLLOW_60_in_ruleEmptyComparisonExpression7013); 

                	newLeafNode(otherlv_3, grammarAccess.getEmptyComparisonExpressionAccess().getEMPTYKeyword_3());
                

            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3108:1: entryRuleLikeExpression returns [EObject current=null] : iv_ruleLikeExpression= ruleLikeExpression EOF ;
    public final EObject entryRuleLikeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLikeExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3109:2: (iv_ruleLikeExpression= ruleLikeExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3110:2: iv_ruleLikeExpression= ruleLikeExpression EOF
            {
             newCompositeNode(grammarAccess.getLikeExpressionRule()); 
            pushFollow(FOLLOW_ruleLikeExpression_in_entryRuleLikeExpression7049);
            iv_ruleLikeExpression=ruleLikeExpression();

            state._fsp--;

             current =iv_ruleLikeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLikeExpression7059); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3117:1: ruleLikeExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'LIKE' ( (lv_pattern_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleLikeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        Token lv_pattern_3_0=null;
        EObject lv_lhs_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3120:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'LIKE' ( (lv_pattern_3_0= RULE_STRING ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3121:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'LIKE' ( (lv_pattern_3_0= RULE_STRING ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3121:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'LIKE' ( (lv_pattern_3_0= RULE_STRING ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3121:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'LIKE' ( (lv_pattern_3_0= RULE_STRING ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3121:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3122:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3122:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3123:3: lv_lhs_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getLikeExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleLikeExpression7105);
            lv_lhs_0_0=ruleVariable();

            state._fsp--;


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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3139:2: ( (lv_isNot_1_0= 'NOT' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==51) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3140:1: (lv_isNot_1_0= 'NOT' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3140:1: (lv_isNot_1_0= 'NOT' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3141:3: lv_isNot_1_0= 'NOT'
                    {
                    lv_isNot_1_0=(Token)match(input,51,FOLLOW_51_in_ruleLikeExpression7123); 

                            newLeafNode(lv_isNot_1_0, grammarAccess.getLikeExpressionAccess().getIsNotNOTKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLikeExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "isNot", true, "NOT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleLikeExpression7149); 

                	newLeafNode(otherlv_2, grammarAccess.getLikeExpressionAccess().getLIKEKeyword_2());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3158:1: ( (lv_pattern_3_0= RULE_STRING ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3159:1: (lv_pattern_3_0= RULE_STRING )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3159:1: (lv_pattern_3_0= RULE_STRING )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3160:3: lv_pattern_3_0= RULE_STRING
            {
            lv_pattern_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLikeExpression7166); 

            			newLeafNode(lv_pattern_3_0, grammarAccess.getLikeExpressionAccess().getPatternSTRINGTerminalRuleCall_3_0()); 
            		

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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3184:1: entryRuleInExpression returns [EObject current=null] : iv_ruleInExpression= ruleInExpression EOF ;
    public final EObject entryRuleInExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3185:2: (iv_ruleInExpression= ruleInExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3186:2: iv_ruleInExpression= ruleInExpression EOF
            {
             newCompositeNode(grammarAccess.getInExpressionRule()); 
            pushFollow(FOLLOW_ruleInExpression_in_entryRuleInExpression7207);
            iv_ruleInExpression=ruleInExpression();

            state._fsp--;

             current =iv_ruleInExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInExpression7217); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3193:1: ruleInExpression returns [EObject current=null] : (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression ) ;
    public final EObject ruleInExpression() throws RecognitionException {
        EObject current = null;

        EObject this_InSeqExpression_0 = null;

        EObject this_InQueryExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3196:28: ( (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3197:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3197:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )
            int alt46=2;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3198:5: this_InSeqExpression_0= ruleInSeqExpression
                    {
                     
                            newCompositeNode(grammarAccess.getInExpressionAccess().getInSeqExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInSeqExpression_in_ruleInExpression7264);
                    this_InSeqExpression_0=ruleInSeqExpression();

                    state._fsp--;

                     
                            current = this_InSeqExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3208:5: this_InQueryExpression_1= ruleInQueryExpression
                    {
                     
                            newCompositeNode(grammarAccess.getInExpressionAccess().getInQueryExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInQueryExpression_in_ruleInExpression7291);
                    this_InQueryExpression_1=ruleInQueryExpression();

                    state._fsp--;

                     
                            current = this_InQueryExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3224:1: entryRuleInSeqExpression returns [EObject current=null] : iv_ruleInSeqExpression= ruleInSeqExpression EOF ;
    public final EObject entryRuleInSeqExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInSeqExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3225:2: (iv_ruleInSeqExpression= ruleInSeqExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3226:2: iv_ruleInSeqExpression= ruleInSeqExpression EOF
            {
             newCompositeNode(grammarAccess.getInSeqExpressionRule()); 
            pushFollow(FOLLOW_ruleInSeqExpression_in_entryRuleInSeqExpression7326);
            iv_ruleInSeqExpression=ruleInSeqExpression();

            state._fsp--;

             current =iv_ruleInSeqExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInSeqExpression7336); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3233:1: ruleInSeqExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'IN' otherlv_3= '(' ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= ')' ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3236:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'IN' otherlv_3= '(' ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= ')' ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3237:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'IN' otherlv_3= '(' ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= ')' )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3237:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'IN' otherlv_3= '(' ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= ')' )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3237:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'IN' otherlv_3= '(' ( (lv_items_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_items_6_0= ruleVariable ) ) )* otherlv_7= ')'
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3237:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3238:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3238:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3239:3: lv_lhs_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getInSeqExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7382);
            lv_lhs_0_0=ruleVariable();

            state._fsp--;


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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3255:2: ( (lv_isNot_1_0= 'NOT' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==51) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3256:1: (lv_isNot_1_0= 'NOT' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3256:1: (lv_isNot_1_0= 'NOT' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3257:3: lv_isNot_1_0= 'NOT'
                    {
                    lv_isNot_1_0=(Token)match(input,51,FOLLOW_51_in_ruleInSeqExpression7400); 

                            newLeafNode(lv_isNot_1_0, grammarAccess.getInSeqExpressionAccess().getIsNotNOTKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInSeqExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "isNot", true, "NOT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleInSeqExpression7426); 

                	newLeafNode(otherlv_2, grammarAccess.getInSeqExpressionAccess().getINKeyword_2());
                
            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleInSeqExpression7438); 

                	newLeafNode(otherlv_3, grammarAccess.getInSeqExpressionAccess().getLeftParenthesisKeyword_3());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3278:1: ( (lv_items_4_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3279:1: (lv_items_4_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3279:1: (lv_items_4_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3280:3: lv_items_4_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getInSeqExpressionAccess().getItemsVariableParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7459);
            lv_items_4_0=ruleVariable();

            state._fsp--;


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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3296:2: (otherlv_5= ',' ( (lv_items_6_0= ruleVariable ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==22) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3296:4: otherlv_5= ',' ( (lv_items_6_0= ruleVariable ) )
            	    {
            	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleInSeqExpression7472); 

            	        	newLeafNode(otherlv_5, grammarAccess.getInSeqExpressionAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3300:1: ( (lv_items_6_0= ruleVariable ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3301:1: (lv_items_6_0= ruleVariable )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3301:1: (lv_items_6_0= ruleVariable )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3302:3: lv_items_6_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInSeqExpressionAccess().getItemsVariableParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleInSeqExpression7493);
            	    lv_items_6_0=ruleVariable();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleInSeqExpression7507); 

                	newLeafNode(otherlv_7, grammarAccess.getInSeqExpressionAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3330:1: entryRuleInQueryExpression returns [EObject current=null] : iv_ruleInQueryExpression= ruleInQueryExpression EOF ;
    public final EObject entryRuleInQueryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInQueryExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3331:2: (iv_ruleInQueryExpression= ruleInQueryExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3332:2: iv_ruleInQueryExpression= ruleInQueryExpression EOF
            {
             newCompositeNode(grammarAccess.getInQueryExpressionRule()); 
            pushFollow(FOLLOW_ruleInQueryExpression_in_entryRuleInQueryExpression7543);
            iv_ruleInQueryExpression=ruleInQueryExpression();

            state._fsp--;

             current =iv_ruleInQueryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInQueryExpression7553); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3339:1: ruleInQueryExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'IN' ( (lv_query_3_0= ruleQueryExpression ) ) ) ;
    public final EObject ruleInQueryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_isNot_1_0=null;
        Token otherlv_2=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_query_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3342:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'IN' ( (lv_query_3_0= ruleQueryExpression ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3343:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'IN' ( (lv_query_3_0= ruleQueryExpression ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3343:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'IN' ( (lv_query_3_0= ruleQueryExpression ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3343:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'IN' ( (lv_query_3_0= ruleQueryExpression ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3343:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3344:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3344:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3345:3: lv_lhs_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getInQueryExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleInQueryExpression7599);
            lv_lhs_0_0=ruleVariable();

            state._fsp--;


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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3361:2: ( (lv_isNot_1_0= 'NOT' ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==51) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3362:1: (lv_isNot_1_0= 'NOT' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3362:1: (lv_isNot_1_0= 'NOT' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3363:3: lv_isNot_1_0= 'NOT'
                    {
                    lv_isNot_1_0=(Token)match(input,51,FOLLOW_51_in_ruleInQueryExpression7617); 

                            newLeafNode(lv_isNot_1_0, grammarAccess.getInQueryExpressionAccess().getIsNotNOTKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInQueryExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "isNot", true, "NOT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleInQueryExpression7643); 

                	newLeafNode(otherlv_2, grammarAccess.getInQueryExpressionAccess().getINKeyword_2());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3380:1: ( (lv_query_3_0= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3381:1: (lv_query_3_0= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3381:1: (lv_query_3_0= ruleQueryExpression )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3382:3: lv_query_3_0= ruleQueryExpression
            {
             
            	        newCompositeNode(grammarAccess.getInQueryExpressionAccess().getQueryQueryExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQueryExpression_in_ruleInQueryExpression7664);
            lv_query_3_0=ruleQueryExpression();

            state._fsp--;


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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3406:1: entryRuleBetweenExpression returns [EObject current=null] : iv_ruleBetweenExpression= ruleBetweenExpression EOF ;
    public final EObject entryRuleBetweenExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBetweenExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3407:2: (iv_ruleBetweenExpression= ruleBetweenExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3408:2: iv_ruleBetweenExpression= ruleBetweenExpression EOF
            {
             newCompositeNode(grammarAccess.getBetweenExpressionRule()); 
            pushFollow(FOLLOW_ruleBetweenExpression_in_entryRuleBetweenExpression7700);
            iv_ruleBetweenExpression=ruleBetweenExpression();

            state._fsp--;

             current =iv_ruleBetweenExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBetweenExpression7710); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3415:1: ruleBetweenExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'BETWEEN' ( (lv_min_3_0= ruleValue ) ) otherlv_4= 'AND' ( (lv_max_5_0= ruleValue ) ) ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3418:28: ( ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'BETWEEN' ( (lv_min_3_0= ruleValue ) ) otherlv_4= 'AND' ( (lv_max_5_0= ruleValue ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3419:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'BETWEEN' ( (lv_min_3_0= ruleValue ) ) otherlv_4= 'AND' ( (lv_max_5_0= ruleValue ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3419:1: ( ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'BETWEEN' ( (lv_min_3_0= ruleValue ) ) otherlv_4= 'AND' ( (lv_max_5_0= ruleValue ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3419:2: ( (lv_lhs_0_0= ruleVariable ) ) ( (lv_isNot_1_0= 'NOT' ) )? otherlv_2= 'BETWEEN' ( (lv_min_3_0= ruleValue ) ) otherlv_4= 'AND' ( (lv_max_5_0= ruleValue ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3419:2: ( (lv_lhs_0_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3420:1: (lv_lhs_0_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3420:1: (lv_lhs_0_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3421:3: lv_lhs_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getBetweenExpressionAccess().getLhsVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleBetweenExpression7756);
            lv_lhs_0_0=ruleVariable();

            state._fsp--;


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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3437:2: ( (lv_isNot_1_0= 'NOT' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==51) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3438:1: (lv_isNot_1_0= 'NOT' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3438:1: (lv_isNot_1_0= 'NOT' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3439:3: lv_isNot_1_0= 'NOT'
                    {
                    lv_isNot_1_0=(Token)match(input,51,FOLLOW_51_in_ruleBetweenExpression7774); 

                            newLeafNode(lv_isNot_1_0, grammarAccess.getBetweenExpressionAccess().getIsNotNOTKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBetweenExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "isNot", true, "NOT");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleBetweenExpression7800); 

                	newLeafNode(otherlv_2, grammarAccess.getBetweenExpressionAccess().getBETWEENKeyword_2());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3456:1: ( (lv_min_3_0= ruleValue ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3457:1: (lv_min_3_0= ruleValue )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3457:1: (lv_min_3_0= ruleValue )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3458:3: lv_min_3_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getBetweenExpressionAccess().getMinValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleBetweenExpression7821);
            lv_min_3_0=ruleValue();

            state._fsp--;


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

            otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleBetweenExpression7833); 

                	newLeafNode(otherlv_4, grammarAccess.getBetweenExpressionAccess().getANDKeyword_4());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3478:1: ( (lv_max_5_0= ruleValue ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3479:1: (lv_max_5_0= ruleValue )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3479:1: (lv_max_5_0= ruleValue )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3480:3: lv_max_5_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getBetweenExpressionAccess().getMaxValueParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleBetweenExpression7854);
            lv_max_5_0=ruleValue();

            state._fsp--;


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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3504:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3505:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3506:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable7890);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable7900); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3513:1: ruleVariable returns [EObject current=null] : (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_AliasAttributeExpression_0 = null;

        EObject this_ParameterExpression_1 = null;

        EObject this_Value_2 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3516:28: ( (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3517:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3517:1: (this_AliasAttributeExpression_0= ruleAliasAttributeExpression | this_ParameterExpression_1= ruleParameterExpression | this_Value_2= ruleValue )
            int alt51=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt51=1;
                }
                break;
            case 18:
                {
                alt51=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_LITERALTEMPORAL:
            case 59:
            case 73:
            case 74:
                {
                alt51=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3518:5: this_AliasAttributeExpression_0= ruleAliasAttributeExpression
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAccess().getAliasAttributeExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAliasAttributeExpression_in_ruleVariable7947);
                    this_AliasAttributeExpression_0=ruleAliasAttributeExpression();

                    state._fsp--;

                     
                            current = this_AliasAttributeExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3528:5: this_ParameterExpression_1= ruleParameterExpression
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAccess().getParameterExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParameterExpression_in_ruleVariable7974);
                    this_ParameterExpression_1=ruleParameterExpression();

                    state._fsp--;

                     
                            current = this_ParameterExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3538:5: this_Value_2= ruleValue
                    {
                     
                            newCompositeNode(grammarAccess.getVariableAccess().getValueParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleValue_in_ruleVariable8001);
                    this_Value_2=ruleValue();

                    state._fsp--;

                     
                            current = this_Value_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3554:1: entryRuleExpressionTerm returns [EObject current=null] : iv_ruleExpressionTerm= ruleExpressionTerm EOF ;
    public final EObject entryRuleExpressionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionTerm = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3555:2: (iv_ruleExpressionTerm= ruleExpressionTerm EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3556:2: iv_ruleExpressionTerm= ruleExpressionTerm EOF
            {
             newCompositeNode(grammarAccess.getExpressionTermRule()); 
            pushFollow(FOLLOW_ruleExpressionTerm_in_entryRuleExpressionTerm8036);
            iv_ruleExpressionTerm=ruleExpressionTerm();

            state._fsp--;

             current =iv_ruleExpressionTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionTerm8046); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3563:1: ruleExpressionTerm returns [EObject current=null] : (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression ) ;
    public final EObject ruleExpressionTerm() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_QueryExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3566:28: ( (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3567:1: (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3567:1: (this_Variable_0= ruleVariable | this_QueryExpression_1= ruleQueryExpression )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_STRING && LA52_0<=RULE_LITERALTEMPORAL)||LA52_0==18||LA52_0==59||(LA52_0>=73 && LA52_0<=74)) ) {
                alt52=1;
            }
            else if ( (LA52_0==33) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3568:5: this_Variable_0= ruleVariable
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionTermAccess().getVariableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleExpressionTerm8093);
                    this_Variable_0=ruleVariable();

                    state._fsp--;

                     
                            current = this_Variable_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3578:5: this_QueryExpression_1= ruleQueryExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionTermAccess().getQueryExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleQueryExpression_in_ruleExpressionTerm8120);
                    this_QueryExpression_1=ruleQueryExpression();

                    state._fsp--;

                     
                            current = this_QueryExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3594:1: entryRuleAliasAttributeExpression returns [EObject current=null] : iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF ;
    public final EObject entryRuleAliasAttributeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasAttributeExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3595:2: (iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3596:2: iv_ruleAliasAttributeExpression= ruleAliasAttributeExpression EOF
            {
             newCompositeNode(grammarAccess.getAliasAttributeExpressionRule()); 
            pushFollow(FOLLOW_ruleAliasAttributeExpression_in_entryRuleAliasAttributeExpression8155);
            iv_ruleAliasAttributeExpression=ruleAliasAttributeExpression();

            state._fsp--;

             current =iv_ruleAliasAttributeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAliasAttributeExpression8165); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3603:1: ruleAliasAttributeExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_attributes_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleAliasAttributeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_attributes_2_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3606:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_attributes_2_0= RULE_ID ) ) )* ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3607:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_attributes_2_0= RULE_ID ) ) )* )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3607:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_attributes_2_0= RULE_ID ) ) )* )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3607:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_attributes_2_0= RULE_ID ) ) )*
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3607:2: ( (otherlv_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3608:1: (otherlv_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3608:1: (otherlv_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3609:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAliasAttributeExpressionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8210); 

            		newLeafNode(otherlv_0, grammarAccess.getAliasAttributeExpressionAccess().getAliasVariableDeclarationCrossReference_0_0()); 
            	

            }


            }

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3620:2: (otherlv_1= '.' ( (lv_attributes_2_0= RULE_ID ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==25) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3620:4: otherlv_1= '.' ( (lv_attributes_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleAliasAttributeExpression8223); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAliasAttributeExpressionAccess().getFullStopKeyword_1_0());
            	        
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3624:1: ( (lv_attributes_2_0= RULE_ID ) )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3625:1: (lv_attributes_2_0= RULE_ID )
            	    {
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3625:1: (lv_attributes_2_0= RULE_ID )
            	    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3626:3: lv_attributes_2_0= RULE_ID
            	    {
            	    lv_attributes_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8240); 

            	    			newLeafNode(lv_attributes_2_0, grammarAccess.getAliasAttributeExpressionAccess().getAttributesIDTerminalRuleCall_1_1_0()); 
            	    		

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
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3650:1: entryRuleParameterExpression returns [EObject current=null] : iv_ruleParameterExpression= ruleParameterExpression EOF ;
    public final EObject entryRuleParameterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3651:2: (iv_ruleParameterExpression= ruleParameterExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3652:2: iv_ruleParameterExpression= ruleParameterExpression EOF
            {
             newCompositeNode(grammarAccess.getParameterExpressionRule()); 
            pushFollow(FOLLOW_ruleParameterExpression_in_entryRuleParameterExpression8283);
            iv_ruleParameterExpression=ruleParameterExpression();

            state._fsp--;

             current =iv_ruleParameterExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterExpression8293); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3659:1: ruleParameterExpression returns [EObject current=null] : (otherlv_0= ':' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameterExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3662:28: ( (otherlv_0= ':' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3663:1: (otherlv_0= ':' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3663:1: (otherlv_0= ':' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3663:3: otherlv_0= ':' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleParameterExpression8330); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterExpressionAccess().getColonKeyword_0());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3667:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3668:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3668:1: (lv_name_1_0= RULE_ID )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3669:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterExpression8347); 

            			newLeafNode(lv_name_1_0, grammarAccess.getParameterExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3695:1: entryRuleStringFunction returns [EObject current=null] : iv_ruleStringFunction= ruleStringFunction EOF ;
    public final EObject entryRuleStringFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringFunction = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3696:2: (iv_ruleStringFunction= ruleStringFunction EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3697:2: iv_ruleStringFunction= ruleStringFunction EOF
            {
             newCompositeNode(grammarAccess.getStringFunctionRule()); 
            pushFollow(FOLLOW_ruleStringFunction_in_entryRuleStringFunction8390);
            iv_ruleStringFunction=ruleStringFunction();

            state._fsp--;

             current =iv_ruleStringFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunction8400); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3704:1: ruleStringFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= ')' ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3707:28: ( ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= ')' ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3708:1: ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= ')' )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3708:1: ( ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= ')' )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3708:2: ( (lv_name_0_0= ruleStringFunctionName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= ')'
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3708:2: ( (lv_name_0_0= ruleStringFunctionName ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3709:1: (lv_name_0_0= ruleStringFunctionName )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3709:1: (lv_name_0_0= ruleStringFunctionName )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3710:3: lv_name_0_0= ruleStringFunctionName
            {
             
            	        newCompositeNode(grammarAccess.getStringFunctionAccess().getNameStringFunctionNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStringFunctionName_in_ruleStringFunction8446);
            lv_name_0_0=ruleStringFunctionName();

            state._fsp--;


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

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleStringFunction8458); 

                	newLeafNode(otherlv_1, grammarAccess.getStringFunctionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3730:1: ( (lv_params_2_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3731:1: (lv_params_2_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3731:1: (lv_params_2_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3732:3: lv_params_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getStringFunctionAccess().getParamsVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleStringFunction8479);
            lv_params_2_0=ruleVariable();

            state._fsp--;


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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3748:2: (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3748:4: otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) )
            {
            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleStringFunction8492); 

                	newLeafNode(otherlv_3, grammarAccess.getStringFunctionAccess().getCommaKeyword_3_0());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3752:1: ( (lv_params_4_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3753:1: (lv_params_4_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3753:1: (lv_params_4_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3754:3: lv_params_4_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getStringFunctionAccess().getParamsVariableParserRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleStringFunction8513);
            lv_params_4_0=ruleVariable();

            state._fsp--;


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

            otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleStringFunction8526); 

                	newLeafNode(otherlv_5, grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3782:1: entryRuleStringFunctionName returns [String current=null] : iv_ruleStringFunctionName= ruleStringFunctionName EOF ;
    public final String entryRuleStringFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringFunctionName = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3783:2: (iv_ruleStringFunctionName= ruleStringFunctionName EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3784:2: iv_ruleStringFunctionName= ruleStringFunctionName EOF
            {
             newCompositeNode(grammarAccess.getStringFunctionNameRule()); 
            pushFollow(FOLLOW_ruleStringFunctionName_in_entryRuleStringFunctionName8563);
            iv_ruleStringFunctionName=ruleStringFunctionName();

            state._fsp--;

             current =iv_ruleStringFunctionName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringFunctionName8574); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3791:1: ruleStringFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'CONCAT' | kw= 'SUBSTRING' | kw= 'LOWER' | kw= 'UPPER' | kw= 'LENGTH' | kw= 'LOCATE' ) ;
    public final AntlrDatatypeRuleToken ruleStringFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3794:28: ( (kw= 'CONCAT' | kw= 'SUBSTRING' | kw= 'LOWER' | kw= 'UPPER' | kw= 'LENGTH' | kw= 'LOCATE' ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3795:1: (kw= 'CONCAT' | kw= 'SUBSTRING' | kw= 'LOWER' | kw= 'UPPER' | kw= 'LENGTH' | kw= 'LOCATE' )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3795:1: (kw= 'CONCAT' | kw= 'SUBSTRING' | kw= 'LOWER' | kw= 'UPPER' | kw= 'LENGTH' | kw= 'LOCATE' )
            int alt54=6;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt54=1;
                }
                break;
            case 64:
                {
                alt54=2;
                }
                break;
            case 65:
                {
                alt54=3;
                }
                break;
            case 66:
                {
                alt54=4;
                }
                break;
            case 67:
                {
                alt54=5;
                }
                break;
            case 68:
                {
                alt54=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3796:2: kw= 'CONCAT'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleStringFunctionName8612); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getCONCATKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3803:2: kw= 'SUBSTRING'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleStringFunctionName8631); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getSUBSTRINGKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3810:2: kw= 'LOWER'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleStringFunctionName8650); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getLOWERKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3817:2: kw= 'UPPER'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleStringFunctionName8669); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getUPPERKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3824:2: kw= 'LENGTH'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleStringFunctionName8688); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getLENGTHKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3831:2: kw= 'LOCATE'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleStringFunctionName8707); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStringFunctionNameAccess().getLOCATEKeyword_5()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3844:1: entryRuleNumericFunction returns [EObject current=null] : iv_ruleNumericFunction= ruleNumericFunction EOF ;
    public final EObject entryRuleNumericFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericFunction = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3845:2: (iv_ruleNumericFunction= ruleNumericFunction EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3846:2: iv_ruleNumericFunction= ruleNumericFunction EOF
            {
             newCompositeNode(grammarAccess.getNumericFunctionRule()); 
            pushFollow(FOLLOW_ruleNumericFunction_in_entryRuleNumericFunction8747);
            iv_ruleNumericFunction=ruleNumericFunction();

            state._fsp--;

             current =iv_ruleNumericFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericFunction8757); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3853:1: ruleNumericFunction returns [EObject current=null] : ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= ')' ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3856:28: ( ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= ')' ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3857:1: ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= ')' )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3857:1: ( ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= ')' )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3857:2: ( (lv_name_0_0= ruleNumericFunctionName ) ) otherlv_1= '(' ( (lv_params_2_0= ruleVariable ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) ) otherlv_5= ')'
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3857:2: ( (lv_name_0_0= ruleNumericFunctionName ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3858:1: (lv_name_0_0= ruleNumericFunctionName )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3858:1: (lv_name_0_0= ruleNumericFunctionName )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3859:3: lv_name_0_0= ruleNumericFunctionName
            {
             
            	        newCompositeNode(grammarAccess.getNumericFunctionAccess().getNameNumericFunctionNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNumericFunctionName_in_ruleNumericFunction8803);
            lv_name_0_0=ruleNumericFunctionName();

            state._fsp--;


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

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleNumericFunction8815); 

                	newLeafNode(otherlv_1, grammarAccess.getNumericFunctionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3879:1: ( (lv_params_2_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3880:1: (lv_params_2_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3880:1: (lv_params_2_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3881:3: lv_params_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getNumericFunctionAccess().getParamsVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleNumericFunction8836);
            lv_params_2_0=ruleVariable();

            state._fsp--;


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

            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3897:2: (otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3897:4: otherlv_3= ',' ( (lv_params_4_0= ruleVariable ) )
            {
            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleNumericFunction8849); 

                	newLeafNode(otherlv_3, grammarAccess.getNumericFunctionAccess().getCommaKeyword_3_0());
                
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3901:1: ( (lv_params_4_0= ruleVariable ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3902:1: (lv_params_4_0= ruleVariable )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3902:1: (lv_params_4_0= ruleVariable )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3903:3: lv_params_4_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getNumericFunctionAccess().getParamsVariableParserRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleNumericFunction8870);
            lv_params_4_0=ruleVariable();

            state._fsp--;


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

            otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleNumericFunction8883); 

                	newLeafNode(otherlv_5, grammarAccess.getNumericFunctionAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3931:1: entryRuleNumericFunctionName returns [String current=null] : iv_ruleNumericFunctionName= ruleNumericFunctionName EOF ;
    public final String entryRuleNumericFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumericFunctionName = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3932:2: (iv_ruleNumericFunctionName= ruleNumericFunctionName EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3933:2: iv_ruleNumericFunctionName= ruleNumericFunctionName EOF
            {
             newCompositeNode(grammarAccess.getNumericFunctionNameRule()); 
            pushFollow(FOLLOW_ruleNumericFunctionName_in_entryRuleNumericFunctionName8920);
            iv_ruleNumericFunctionName=ruleNumericFunctionName();

            state._fsp--;

             current =iv_ruleNumericFunctionName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericFunctionName8931); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3940:1: ruleNumericFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ABS' | kw= 'SQRT' | kw= 'MOD' | kw= 'SIZE' ) ;
    public final AntlrDatatypeRuleToken ruleNumericFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3943:28: ( (kw= 'ABS' | kw= 'SQRT' | kw= 'MOD' | kw= 'SIZE' ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3944:1: (kw= 'ABS' | kw= 'SQRT' | kw= 'MOD' | kw= 'SIZE' )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3944:1: (kw= 'ABS' | kw= 'SQRT' | kw= 'MOD' | kw= 'SIZE' )
            int alt55=4;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt55=1;
                }
                break;
            case 70:
                {
                alt55=2;
                }
                break;
            case 71:
                {
                alt55=3;
                }
                break;
            case 72:
                {
                alt55=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3945:2: kw= 'ABS'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleNumericFunctionName8969); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumericFunctionNameAccess().getABSKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3952:2: kw= 'SQRT'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleNumericFunctionName8988); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumericFunctionNameAccess().getSQRTKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3959:2: kw= 'MOD'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleNumericFunctionName9007); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumericFunctionNameAccess().getMODKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3966:2: kw= 'SIZE'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleNumericFunctionName9026); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNumericFunctionNameAccess().getSIZEKeyword_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3981:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3982:2: (iv_ruleValue= ruleValue EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3983:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue9068);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue9078); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3990:1: ruleValue returns [EObject current=null] : (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression | this_DateTimeExpression_4= ruleDateTimeExpression ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerExpression_0 = null;

        EObject this_StringExpression_1 = null;

        EObject this_NullExpression_2 = null;

        EObject this_BooleanExpression_3 = null;

        EObject this_DateTimeExpression_4 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3993:28: ( (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression | this_DateTimeExpression_4= ruleDateTimeExpression ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3994:1: (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression | this_DateTimeExpression_4= ruleDateTimeExpression )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3994:1: (this_IntegerExpression_0= ruleIntegerExpression | this_StringExpression_1= ruleStringExpression | this_NullExpression_2= ruleNullExpression | this_BooleanExpression_3= ruleBooleanExpression | this_DateTimeExpression_4= ruleDateTimeExpression )
            int alt56=5;
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
            case 59:
                {
                alt56=3;
                }
                break;
            case 73:
            case 74:
                {
                alt56=4;
                }
                break;
            case RULE_LITERALTEMPORAL:
                {
                alt56=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:3995:5: this_IntegerExpression_0= ruleIntegerExpression
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getIntegerExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntegerExpression_in_ruleValue9125);
                    this_IntegerExpression_0=ruleIntegerExpression();

                    state._fsp--;

                     
                            current = this_IntegerExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4005:5: this_StringExpression_1= ruleStringExpression
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getStringExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringExpression_in_ruleValue9152);
                    this_StringExpression_1=ruleStringExpression();

                    state._fsp--;

                     
                            current = this_StringExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4015:5: this_NullExpression_2= ruleNullExpression
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getNullExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNullExpression_in_ruleValue9179);
                    this_NullExpression_2=ruleNullExpression();

                    state._fsp--;

                     
                            current = this_NullExpression_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4025:5: this_BooleanExpression_3= ruleBooleanExpression
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getBooleanExpressionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleValue9206);
                    this_BooleanExpression_3=ruleBooleanExpression();

                    state._fsp--;

                     
                            current = this_BooleanExpression_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4035:5: this_DateTimeExpression_4= ruleDateTimeExpression
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getDateTimeExpressionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleDateTimeExpression_in_ruleValue9233);
                    this_DateTimeExpression_4=ruleDateTimeExpression();

                    state._fsp--;

                     
                            current = this_DateTimeExpression_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4051:1: entryRuleIntegerExpression returns [EObject current=null] : iv_ruleIntegerExpression= ruleIntegerExpression EOF ;
    public final EObject entryRuleIntegerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4052:2: (iv_ruleIntegerExpression= ruleIntegerExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4053:2: iv_ruleIntegerExpression= ruleIntegerExpression EOF
            {
             newCompositeNode(grammarAccess.getIntegerExpressionRule()); 
            pushFollow(FOLLOW_ruleIntegerExpression_in_entryRuleIntegerExpression9268);
            iv_ruleIntegerExpression=ruleIntegerExpression();

            state._fsp--;

             current =iv_ruleIntegerExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerExpression9278); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4060:1: ruleIntegerExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4063:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4064:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4064:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4065:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4065:1: (lv_value_0_0= RULE_INT )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4066:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerExpression9319); 

            			newLeafNode(lv_value_0_0, grammarAccess.getIntegerExpressionAccess().getValueINTTerminalRuleCall_0()); 
            		

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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4090:1: entryRuleStringExpression returns [EObject current=null] : iv_ruleStringExpression= ruleStringExpression EOF ;
    public final EObject entryRuleStringExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4091:2: (iv_ruleStringExpression= ruleStringExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4092:2: iv_ruleStringExpression= ruleStringExpression EOF
            {
             newCompositeNode(grammarAccess.getStringExpressionRule()); 
            pushFollow(FOLLOW_ruleStringExpression_in_entryRuleStringExpression9359);
            iv_ruleStringExpression=ruleStringExpression();

            state._fsp--;

             current =iv_ruleStringExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringExpression9369); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4099:1: ruleStringExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4102:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4103:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4103:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4104:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4104:1: (lv_value_0_0= RULE_STRING )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4105:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringExpression9410); 

            			newLeafNode(lv_value_0_0, grammarAccess.getStringExpressionAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4129:1: entryRuleNullExpression returns [EObject current=null] : iv_ruleNullExpression= ruleNullExpression EOF ;
    public final EObject entryRuleNullExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4130:2: (iv_ruleNullExpression= ruleNullExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4131:2: iv_ruleNullExpression= ruleNullExpression EOF
            {
             newCompositeNode(grammarAccess.getNullExpressionRule()); 
            pushFollow(FOLLOW_ruleNullExpression_in_entryRuleNullExpression9450);
            iv_ruleNullExpression=ruleNullExpression();

            state._fsp--;

             current =iv_ruleNullExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullExpression9460); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4138:1: ruleNullExpression returns [EObject current=null] : ( (lv_value_0_0= 'NULL' ) ) ;
    public final EObject ruleNullExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4141:28: ( ( (lv_value_0_0= 'NULL' ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4142:1: ( (lv_value_0_0= 'NULL' ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4142:1: ( (lv_value_0_0= 'NULL' ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4143:1: (lv_value_0_0= 'NULL' )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4143:1: (lv_value_0_0= 'NULL' )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4144:3: lv_value_0_0= 'NULL'
            {
            lv_value_0_0=(Token)match(input,59,FOLLOW_59_in_ruleNullExpression9502); 

                    newLeafNode(lv_value_0_0, grammarAccess.getNullExpressionAccess().getValueNULLKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNullExpressionRule());
            	        }
                   		setWithLastConsumed(current, "value", lv_value_0_0, "NULL");
            	    

            }


            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4165:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4166:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4167:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression9550);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;

             current =iv_ruleBooleanExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression9560); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4174:1: ruleBooleanExpression returns [EObject current=null] : ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4177:28: ( ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4178:1: ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4178:1: ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4179:1: ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4179:1: ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4180:1: (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4180:1: (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==73) ) {
                alt57=1;
            }
            else if ( (LA57_0==74) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4181:3: lv_value_0_1= 'TRUE'
                    {
                    lv_value_0_1=(Token)match(input,73,FOLLOW_73_in_ruleBooleanExpression9604); 

                            newLeafNode(lv_value_0_1, grammarAccess.getBooleanExpressionAccess().getValueTRUEKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "value", true, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4193:8: lv_value_0_2= 'FALSE'
                    {
                    lv_value_0_2=(Token)match(input,74,FOLLOW_74_in_ruleBooleanExpression9633); 

                            newLeafNode(lv_value_0_2, grammarAccess.getBooleanExpressionAccess().getValueFALSEKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "value", true, null);
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4216:1: entryRuleDateTimeExpression returns [EObject current=null] : iv_ruleDateTimeExpression= ruleDateTimeExpression EOF ;
    public final EObject entryRuleDateTimeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTimeExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4217:2: (iv_ruleDateTimeExpression= ruleDateTimeExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4218:2: iv_ruleDateTimeExpression= ruleDateTimeExpression EOF
            {
             newCompositeNode(grammarAccess.getDateTimeExpressionRule()); 
            pushFollow(FOLLOW_ruleDateTimeExpression_in_entryRuleDateTimeExpression9684);
            iv_ruleDateTimeExpression=ruleDateTimeExpression();

            state._fsp--;

             current =iv_ruleDateTimeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateTimeExpression9694); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4225:1: ruleDateTimeExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_LITERALTEMPORAL ) ) ;
    public final EObject ruleDateTimeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4228:28: ( ( (lv_value_0_0= RULE_LITERALTEMPORAL ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4229:1: ( (lv_value_0_0= RULE_LITERALTEMPORAL ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4229:1: ( (lv_value_0_0= RULE_LITERALTEMPORAL ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4230:1: (lv_value_0_0= RULE_LITERALTEMPORAL )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4230:1: (lv_value_0_0= RULE_LITERALTEMPORAL )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4231:3: lv_value_0_0= RULE_LITERALTEMPORAL
            {
            lv_value_0_0=(Token)match(input,RULE_LITERALTEMPORAL,FOLLOW_RULE_LITERALTEMPORAL_in_ruleDateTimeExpression9735); 

            			newLeafNode(lv_value_0_0, grammarAccess.getDateTimeExpressionAccess().getValueLiteralTemporalTerminalRuleCall_0()); 
            		

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

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4255:1: entryRuleQueryExpression returns [EObject current=null] : iv_ruleQueryExpression= ruleQueryExpression EOF ;
    public final EObject entryRuleQueryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryExpression = null;


        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4256:2: (iv_ruleQueryExpression= ruleQueryExpression EOF )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4257:2: iv_ruleQueryExpression= ruleQueryExpression EOF
            {
             newCompositeNode(grammarAccess.getQueryExpressionRule()); 
            pushFollow(FOLLOW_ruleQueryExpression_in_entryRuleQueryExpression9775);
            iv_ruleQueryExpression=ruleQueryExpression();

            state._fsp--;

             current =iv_ruleQueryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryExpression9785); 

            }

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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4264:1: ruleQueryExpression returns [EObject current=null] : (otherlv_0= '(' this_SelectStatement_1= ruleSelectStatement otherlv_2= ')' ) ;
    public final EObject ruleQueryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_SelectStatement_1 = null;


         enterRule(); 
            
        try {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4267:28: ( (otherlv_0= '(' this_SelectStatement_1= ruleSelectStatement otherlv_2= ')' ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4268:1: (otherlv_0= '(' this_SelectStatement_1= ruleSelectStatement otherlv_2= ')' )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4268:1: (otherlv_0= '(' this_SelectStatement_1= ruleSelectStatement otherlv_2= ')' )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4268:3: otherlv_0= '(' this_SelectStatement_1= ruleSelectStatement otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleQueryExpression9822); 

                	newLeafNode(otherlv_0, grammarAccess.getQueryExpressionAccess().getLeftParenthesisKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getQueryExpressionAccess().getSelectStatementParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleSelectStatement_in_ruleQueryExpression9844);
            this_SelectStatement_1=ruleSelectStatement();

            state._fsp--;

             
                    current = this_SelectStatement_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleQueryExpression9855); 

                	newLeafNode(otherlv_2, grammarAccess.getQueryExpressionAccess().getRightParenthesisKeyword_2());
                

            }


            }

             leaveRule(); 
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
    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4293:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4295:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= '!=' ) ) )
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4296:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= '!=' ) )
            {
            // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4296:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= '!=' ) )
            int alt58=6;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt58=1;
                }
                break;
            case 76:
                {
                alt58=2;
                }
                break;
            case 77:
                {
                alt58=3;
                }
                break;
            case 78:
                {
                alt58=4;
                }
                break;
            case 28:
                {
                alt58=5;
                }
                break;
            case 79:
                {
                alt58=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4296:2: (enumLiteral_0= '<' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4296:2: (enumLiteral_0= '<' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4296:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_75_in_ruleOperator9905); 

                            current = grammarAccess.getOperatorAccess().getLessThenEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getLessThenEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4302:6: (enumLiteral_1= '>' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4302:6: (enumLiteral_1= '>' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4302:8: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_76_in_ruleOperator9922); 

                            current = grammarAccess.getOperatorAccess().getGreaterThenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getGreaterThenEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4308:6: (enumLiteral_2= '<=' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4308:6: (enumLiteral_2= '<=' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4308:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_77_in_ruleOperator9939); 

                            current = grammarAccess.getOperatorAccess().getLessEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getLessEqualEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4314:6: (enumLiteral_3= '>=' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4314:6: (enumLiteral_3= '>=' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4314:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_78_in_ruleOperator9956); 

                            current = grammarAccess.getOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getGreaterEqualEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4320:6: (enumLiteral_4= '=' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4320:6: (enumLiteral_4= '=' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4320:8: enumLiteral_4= '='
                    {
                    enumLiteral_4=(Token)match(input,28,FOLLOW_28_in_ruleOperator9973); 

                            current = grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4326:6: (enumLiteral_5= '!=' )
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4326:6: (enumLiteral_5= '!=' )
                    // ../org.nightlabs.jjqb.xtext.jpql/src-gen/org/nightlabs/jjqb/xtext/jpql/parser/antlr/internal/InternalJPQL.g:4326:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,79,FOLLOW_79_in_ruleOperator9990); 

                            current = grammarAccess.getOperatorAccess().getNotEqualEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getOperatorAccess().getNotEqualEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
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


    protected DFA39 dfa39 = new DFA39(this);
    protected DFA46 dfa46 = new DFA46(this);
    static final String DFA39_eotS =
        "\33\uffff";
    static final String DFA39_eofS =
        "\33\uffff";
    static final String DFA39_minS =
        "\1\4\1\uffff\1\31\1\5\6\34\4\uffff\1\5\1\52\3\uffff\1\63\2\uffff"+
        "\1\34\1\31\1\73\2\uffff";
    static final String DFA39_maxS =
        "\1\112\1\uffff\1\117\1\5\6\117\4\uffff\1\5\1\76\3\uffff\1\74\2\uffff"+
        "\2\117\1\74\2\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\1\10\uffff\1\3\1\4\1\5\1\6\2\uffff\1\7\1\13\1\14\1\uffff"+
        "\1\12\1\2\3\uffff\1\10\1\11";
    static final String DFA39_specialS =
        "\33\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\5\1\2\1\4\1\11\12\uffff\1\3\16\uffff\1\1\21\uffff\2\12\1"+
            "\13\1\14\1\15\3\uffff\1\6\15\uffff\1\7\1\10",
            "",
            "\1\16\2\uffff\1\25\15\uffff\1\21\10\uffff\1\17\4\uffff\1\20"+
            "\1\uffff\1\23\2\uffff\1\24\1\22\14\uffff\5\25",
            "\1\26",
            "\1\25\15\uffff\1\21\10\uffff\1\17\4\uffff\1\20\1\uffff\1\23"+
            "\2\uffff\1\24\1\22\14\uffff\5\25",
            "\1\25\15\uffff\1\21\10\uffff\1\17\4\uffff\1\20\1\uffff\1\23"+
            "\2\uffff\1\24\1\22\14\uffff\5\25",
            "\1\25\15\uffff\1\21\10\uffff\1\17\4\uffff\1\20\1\uffff\1\23"+
            "\2\uffff\1\24\1\22\14\uffff\5\25",
            "\1\25\15\uffff\1\21\10\uffff\1\17\4\uffff\1\20\1\uffff\1\23"+
            "\2\uffff\1\24\1\22\14\uffff\5\25",
            "\1\25\15\uffff\1\21\10\uffff\1\17\4\uffff\1\20\1\uffff\1\23"+
            "\2\uffff\1\24\1\22\14\uffff\5\25",
            "\1\25\15\uffff\1\21\10\uffff\1\17\4\uffff\1\20\1\uffff\1\23"+
            "\2\uffff\1\24\1\22\14\uffff\5\25",
            "",
            "",
            "",
            "",
            "\1\27",
            "\1\21\15\uffff\1\20\4\uffff\1\24\1\22",
            "",
            "",
            "",
            "\1\30\7\uffff\1\31\1\32",
            "",
            "",
            "\1\25\15\uffff\1\21\10\uffff\1\17\4\uffff\1\20\1\uffff\1\23"+
            "\2\uffff\1\24\1\22\14\uffff\5\25",
            "\1\16\2\uffff\1\25\15\uffff\1\21\10\uffff\1\17\4\uffff\1\20"+
            "\1\uffff\1\23\2\uffff\1\24\1\22\14\uffff\5\25",
            "\1\31\1\32",
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
            return "2477:1: (this_ParExpression_0= ruleParExpression | this_OperatorExpression_1= ruleOperatorExpression | this_ExistsExpression_2= ruleExistsExpression | this_AllExpression_3= ruleAllExpression | this_AnyExpression_4= ruleAnyExpression | this_SomeExpression_5= ruleSomeExpression | this_CollectionExpression_6= ruleCollectionExpression | this_NullComparisonExpression_7= ruleNullComparisonExpression | this_EmptyComparisonExpression_8= ruleEmptyComparisonExpression | this_LikeExpression_9= ruleLikeExpression | this_InExpression_10= ruleInExpression | this_BetweenExpression_11= ruleBetweenExpression )";
        }
    }
    static final String DFA46_eotS =
        "\21\uffff";
    static final String DFA46_eofS =
        "\21\uffff";
    static final String DFA46_minS =
        "\1\4\1\31\1\5\6\52\1\5\1\52\1\41\1\52\1\31\1\4\2\uffff";
    static final String DFA46_maxS =
        "\1\112\1\63\1\5\6\63\1\5\1\52\1\41\2\63\1\112\2\uffff";
    static final String DFA46_acceptS =
        "\17\uffff\1\2\1\1";
    static final String DFA46_specialS =
        "\21\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\4\1\1\1\3\1\10\12\uffff\1\2\50\uffff\1\5\15\uffff\1\6\1\7",
            "\1\11\20\uffff\1\13\10\uffff\1\12",
            "\1\14",
            "\1\13\10\uffff\1\12",
            "\1\13\10\uffff\1\12",
            "\1\13\10\uffff\1\12",
            "\1\13\10\uffff\1\12",
            "\1\13\10\uffff\1\12",
            "\1\13\10\uffff\1\12",
            "\1\15",
            "\1\13",
            "\1\16",
            "\1\13\10\uffff\1\12",
            "\1\11\20\uffff\1\13\10\uffff\1\12",
            "\4\20\12\uffff\1\20\13\uffff\1\17\11\uffff\1\17\22\uffff\1"+
            "\20\15\uffff\2\20",
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
            return "3197:1: (this_InSeqExpression_0= ruleInSeqExpression | this_InQueryExpression_1= ruleInQueryExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleQueryModule_in_entryRuleQueryModule75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryModule85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleQueryModule131 = new BitSet(new long[]{0x0000010064020022L});
    public static final BitSet FOLLOW_ruleJPQLQuery_in_ruleQueryModule153 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleNamedQuery_in_ruleQueryModule175 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleImport259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedQuery_in_entryRuleNamedQuery317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedQuery327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedQuery369 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNamedQuery386 = new BitSet(new long[]{0x0000010064000000L});
    public static final BitSet FOLLOW_ruleJPQLQuery_in_ruleNamedQuery407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJPQLQuery_in_entryRuleJPQLQuery443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJPQLQuery453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleJPQLQuery500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_ruleJPQLQuery527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_ruleJPQLQuery554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_entryRuleSelectStatement589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectStatement599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectFromClause_in_ruleSelectStatement645 = new BitSet(new long[]{0x0001000000180002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleSelectStatement666 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_ruleSelectStatement688 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOrderClause_in_ruleSelectStatement710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHavingClause_in_entryRuleHavingClause747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHavingClause757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleHavingClause794 = new BitSet(new long[]{0x08F80002000400F0L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleHavingClause815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderClause_in_entryRuleOrderClause851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderClause861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOrderClause898 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleOrderClause910 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleOrderItem_in_ruleOrderClause931 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_22_in_ruleOrderClause944 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleOrderItem_in_ruleOrderClause965 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_23_in_ruleOrderClause986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOrderClause1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderItem_in_entryRuleOrderItem1074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderItem1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrderItem1129 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleOrderItem1141 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrderItem1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateStatement_in_entryRuleUpdateStatement1199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateStatement1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateClause_in_ruleUpdateStatement1255 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleSetClause_in_ruleUpdateStatement1276 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleUpdateStatement1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdateClause_in_entryRuleUpdateClause1334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateClause1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleUpdateClause1381 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleUpdateClause1402 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleUpdateClause1415 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleUpdateClause1436 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleSetClause_in_entryRuleSetClause1474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetClause1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSetClause1521 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_ruleSetClause1542 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleSetClause1555 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_ruleSetClause1576 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleUpdateItem_in_entryRuleUpdateItem1614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdateItem1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleUpdateItem1670 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleUpdateItem1682 = new BitSet(new long[]{0x08000000000400F0L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleValue_in_ruleUpdateItem1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteStatement_in_entryRuleDeleteStatement1739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteStatement1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteClause_in_ruleDeleteStatement1795 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_ruleDeleteStatement1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteClause_in_entryRuleDeleteClause1853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteClause1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDeleteClause1900 = new BitSet(new long[]{0x0000010040000000L});
    public static final BitSet FOLLOW_ruleFromClause_in_ruleDeleteClause1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectFromClause_in_entryRuleSelectFromClause1957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectFromClause1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_ruleSelectFromClause2013 = new BitSet(new long[]{0x0000010040000000L});
    public static final BitSet FOLLOW_ruleFromClause_in_ruleSelectFromClause2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectClause_in_entryRuleSelectClause2071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectClause2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSelectClause2118 = new BitSet(new long[]{0x000000F980000020L});
    public static final BitSet FOLLOW_31_in_ruleSelectClause2136 = new BitSet(new long[]{0x000000F980000020L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectClause2171 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleSelectClause2184 = new BitSet(new long[]{0x000000F980000020L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_ruleSelectClause2205 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleSelectExpression_in_entryRuleSelectExpression2243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectExpression2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectExpression2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAggregateExpression_in_ruleSelectExpression2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstructorExpression_in_ruleSelectExpression2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectAggregateExpression_in_entryRuleSelectAggregateExpression2389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectAggregateExpression2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgAggregate_in_ruleSelectAggregateExpression2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxAggregate_in_ruleSelectAggregateExpression2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinAggregate_in_ruleSelectAggregateExpression2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumAggregate_in_ruleSelectAggregateExpression2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountAggregate_in_ruleSelectAggregateExpression2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgAggregate_in_entryRuleAvgAggregate2589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvgAggregate2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleAvgAggregate2636 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAvgAggregate2648 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_31_in_ruleAvgAggregate2666 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleAvgAggregate2701 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleAvgAggregate2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxAggregate_in_entryRuleMaxAggregate2749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxAggregate2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleMaxAggregate2796 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleMaxAggregate2808 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_31_in_ruleMaxAggregate2826 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleMaxAggregate2861 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleMaxAggregate2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinAggregate_in_entryRuleMinAggregate2909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinAggregate2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleMinAggregate2956 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleMinAggregate2968 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_31_in_ruleMinAggregate2986 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleMinAggregate3021 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleMinAggregate3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumAggregate_in_entryRuleSumAggregate3069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumAggregate3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleSumAggregate3116 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleSumAggregate3128 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_31_in_ruleSumAggregate3146 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSumAggregate3181 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleSumAggregate3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCountAggregate_in_entryRuleCountAggregate3229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCountAggregate3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleCountAggregate3276 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleCountAggregate3288 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_31_in_ruleCountAggregate3306 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleCountAggregate3341 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleCountAggregate3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstructorExpression_in_entryRuleSelectConstructorExpression3389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectConstructorExpression3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleSelectConstructorExpression3436 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectConstructorExpression3453 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleSelectConstructorExpression3470 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3491 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_22_in_ruleSelectConstructorExpression3504 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleSelectConstructorExpression3525 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_34_in_ruleSelectConstructorExpression3539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClause_in_entryRuleFromClause3575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClause3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleFromClause3622 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFromClass_in_ruleFromClause3643 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleFromClause3656 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_ruleFromEntry_in_ruleFromClause3677 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleFromEntry_in_entryRuleFromEntry3715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromEntry3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClass_in_ruleFromEntry3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromCollection_in_ruleFromEntry3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleVariableDeclaration3882 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration3901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClass_in_entryRuleFromClass3942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClass3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassId_in_ruleFromClass3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassVar_in_ruleFromClass4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassId_in_entryRuleFromClassId4061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClassId4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFromClassId4112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromClassVar_in_entryRuleFromClassVar4152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromClassVar4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFromClassVar4204 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleFromClassVar4230 = new BitSet(new long[]{0x0000A80000000002L});
    public static final BitSet FOLLOW_ruleFromJoin_in_ruleFromClassVar4251 = new BitSet(new long[]{0x0000A80000000002L});
    public static final BitSet FOLLOW_ruleFromCollection_in_entryRuleFromCollection4288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromCollection4298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleFromCollection4335 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleFromCollection4347 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleFromCollection4368 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleFromCollection4380 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleFromCollection4401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFromJoin_in_entryRuleFromJoin4437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFromJoin4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_ruleFromJoin4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftJoin_in_ruleFromJoin4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerJoin_in_ruleFromJoin4548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoin_in_entryRuleJoin4583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoin4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleJoin4630 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_44_in_ruleJoin4648 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleJoin4683 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleJoin4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftJoin_in_entryRuleLeftJoin4740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftJoin4750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleLeftJoin4787 = new BitSet(new long[]{0x0000480000000000L});
    public static final BitSet FOLLOW_46_in_ruleLeftJoin4805 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleLeftJoin4831 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_44_in_ruleLeftJoin4849 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleLeftJoin4884 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleLeftJoin4905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInnerJoin_in_entryRuleInnerJoin4941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInnerJoin4951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleInnerJoin4988 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleInnerJoin5000 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_44_in_ruleInnerJoin5018 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleInnerJoin5053 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleInnerJoin5074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhereClause_in_entryRuleWhereClause5110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhereClause5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleWhereClause5157 = new BitSet(new long[]{0x08F80002000400F0L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleWhereClause5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression5214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression5224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression5271 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOrExpression5293 = new BitSet(new long[]{0x08F80002000400F0L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression5314 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression5354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression5364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteExpression_in_ruleAndExpression5411 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleAndExpression5433 = new BitSet(new long[]{0x08F80002000400F0L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleConcreteExpression_in_ruleAndExpression5454 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleConcreteExpression_in_entryRuleConcreteExpression5494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcreteExpression5504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParExpression_in_ruleConcreteExpression5551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorExpression_in_ruleConcreteExpression5578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsExpression_in_ruleConcreteExpression5605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllExpression_in_ruleConcreteExpression5632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyExpression_in_ruleConcreteExpression5659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeExpression_in_ruleConcreteExpression5686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_ruleConcreteExpression5713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullComparisonExpression_in_ruleConcreteExpression5740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyComparisonExpression_in_ruleConcreteExpression5767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikeExpression_in_ruleConcreteExpression5794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpression_in_ruleConcreteExpression5821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBetweenExpression_in_ruleConcreteExpression5848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParExpression_in_entryRuleParExpression5883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParExpression5893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleParExpression5930 = new BitSet(new long[]{0x08000002000400F0L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_ruleParExpression5952 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleParExpression5963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorExpression_in_entryRuleOperatorExpression5999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorExpression6009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleOperatorExpression6055 = new BitSet(new long[]{0x0000000010000000L,0x000000000000F800L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleOperatorExpression6076 = new BitSet(new long[]{0x08000002000400F0L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_ruleOperatorExpression6097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsExpression_in_entryRuleExistsExpression6133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExistsExpression6143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleExistsExpression6186 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleExistsExpression6212 = new BitSet(new long[]{0x08000002000400F0L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleExistsExpression6233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllExpression_in_entryRuleAllExpression6269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllExpression6279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleAllExpression6316 = new BitSet(new long[]{0x08000002000400F0L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleAllExpression6337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyExpression_in_entryRuleAnyExpression6373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnyExpression6383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAnyExpression6420 = new BitSet(new long[]{0x08000002000400F0L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleAnyExpression6441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeExpression_in_entryRuleSomeExpression6477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSomeExpression6487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleSomeExpression6524 = new BitSet(new long[]{0x08000002000400F0L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleSomeExpression6545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionExpression_in_entryRuleCollectionExpression6581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionExpression6591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCollectionExpression6637 = new BitSet(new long[]{0x0108000000000000L});
    public static final BitSet FOLLOW_51_in_ruleCollectionExpression6655 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleCollectionExpression6681 = new BitSet(new long[]{0x0200000000000020L});
    public static final BitSet FOLLOW_57_in_ruleCollectionExpression6694 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleCollectionExpression6717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullComparisonExpression_in_entryRuleNullComparisonExpression6753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullComparisonExpression6763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNullComparisonExpression6809 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleNullComparisonExpression6821 = new BitSet(new long[]{0x0808000000000000L});
    public static final BitSet FOLLOW_51_in_ruleNullComparisonExpression6839 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleNullComparisonExpression6865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmptyComparisonExpression_in_entryRuleEmptyComparisonExpression6901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmptyComparisonExpression6911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleEmptyComparisonExpression6957 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleEmptyComparisonExpression6969 = new BitSet(new long[]{0x1008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleEmptyComparisonExpression6987 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleEmptyComparisonExpression7013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikeExpression_in_entryRuleLikeExpression7049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLikeExpression7059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleLikeExpression7105 = new BitSet(new long[]{0x2008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleLikeExpression7123 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleLikeExpression7149 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLikeExpression7166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpression_in_entryRuleInExpression7207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInExpression7217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInSeqExpression_in_ruleInExpression7264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInQueryExpression_in_ruleInExpression7291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInSeqExpression_in_entryRuleInSeqExpression7326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInSeqExpression7336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7382 = new BitSet(new long[]{0x0008040000000000L});
    public static final BitSet FOLLOW_51_in_ruleInSeqExpression7400 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleInSeqExpression7426 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleInSeqExpression7438 = new BitSet(new long[]{0x08000000000400F0L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7459 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_22_in_ruleInSeqExpression7472 = new BitSet(new long[]{0x08000000000400F0L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInSeqExpression7493 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_34_in_ruleInSeqExpression7507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInQueryExpression_in_entryRuleInQueryExpression7543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInQueryExpression7553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleInQueryExpression7599 = new BitSet(new long[]{0x0008040000000000L});
    public static final BitSet FOLLOW_51_in_ruleInQueryExpression7617 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleInQueryExpression7643 = new BitSet(new long[]{0x08000002000400F0L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleInQueryExpression7664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBetweenExpression_in_entryRuleBetweenExpression7700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBetweenExpression7710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleBetweenExpression7756 = new BitSet(new long[]{0x4008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleBetweenExpression7774 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleBetweenExpression7800 = new BitSet(new long[]{0x08000000000400F0L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBetweenExpression7821 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleBetweenExpression7833 = new BitSet(new long[]{0x08000000000400F0L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBetweenExpression7854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable7890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable7900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_ruleVariable7947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_ruleVariable7974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleVariable8001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionTerm_in_entryRuleExpressionTerm8036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionTerm8046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleExpressionTerm8093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_ruleExpressionTerm8120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasAttributeExpression_in_entryRuleAliasAttributeExpression8155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAliasAttributeExpression8165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8210 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleAliasAttributeExpression8223 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAliasAttributeExpression8240 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_entryRuleParameterExpression8283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterExpression8293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleParameterExpression8330 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterExpression8347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunction_in_entryRuleStringFunction8390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunction8400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunctionName_in_ruleStringFunction8446 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleStringFunction8458 = new BitSet(new long[]{0x08000000000400F0L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunction8479 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleStringFunction8492 = new BitSet(new long[]{0x08000000000400F0L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleStringFunction8513 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleStringFunction8526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringFunctionName_in_entryRuleStringFunctionName8563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringFunctionName8574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleStringFunctionName8612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleStringFunctionName8631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleStringFunctionName8650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleStringFunctionName8669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleStringFunctionName8688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleStringFunctionName8707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFunction_in_entryRuleNumericFunction8747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericFunction8757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFunctionName_in_ruleNumericFunction8803 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleNumericFunction8815 = new BitSet(new long[]{0x08000000000400F0L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNumericFunction8836 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleNumericFunction8849 = new BitSet(new long[]{0x08000000000400F0L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleNumericFunction8870 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleNumericFunction8883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericFunctionName_in_entryRuleNumericFunctionName8920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericFunctionName8931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleNumericFunctionName8969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleNumericFunctionName8988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleNumericFunctionName9007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleNumericFunctionName9026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue9068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue9078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerExpression_in_ruleValue9125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_ruleValue9152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_ruleValue9179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleValue9206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeExpression_in_ruleValue9233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerExpression_in_entryRuleIntegerExpression9268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerExpression9278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerExpression9319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringExpression_in_entryRuleStringExpression9359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringExpression9369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringExpression9410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullExpression_in_entryRuleNullExpression9450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullExpression9460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleNullExpression9502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression9550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression9560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleBooleanExpression9604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleBooleanExpression9633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateTimeExpression_in_entryRuleDateTimeExpression9684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateTimeExpression9694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LITERALTEMPORAL_in_ruleDateTimeExpression9735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryExpression_in_entryRuleQueryExpression9775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryExpression9785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleQueryExpression9822 = new BitSet(new long[]{0x0000010040000000L});
    public static final BitSet FOLLOW_ruleSelectStatement_in_ruleQueryExpression9844 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleQueryExpression9855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleOperator9905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleOperator9922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleOperator9939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleOperator9956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOperator9973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleOperator9990 = new BitSet(new long[]{0x0000000000000002L});

}