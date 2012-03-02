package org.nightlabs.jjqb.xtext.jpql.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJPQLLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
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
    public static final int T__42=42;
    public static final int RULE_TIMESTAMP_LITERAL=10;
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
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int T__34=34;
    public static final int T__72=72;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_TIME_STRING=12;
    public static final int T__76=76;
    public static final int RULE_WS=15;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators

    public InternalJPQLLexer() {;} 
    public InternalJPQLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJPQLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:11:7: ( 'CONCAT' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:11:9: 'CONCAT'
            {
            match("CONCAT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:12:7: ( 'SUBSTRING' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:12:9: 'SUBSTRING'
            {
            match("SUBSTRING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:13:7: ( 'LOWER' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:13:9: 'LOWER'
            {
            match("LOWER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:14:7: ( 'UPPER' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:14:9: 'UPPER'
            {
            match("UPPER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:15:7: ( 'LENGTH' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:15:9: 'LENGTH'
            {
            match("LENGTH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:16:7: ( 'LOCATE' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:16:9: 'LOCATE'
            {
            match("LOCATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:17:7: ( 'ABS' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:17:9: 'ABS'
            {
            match("ABS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:18:7: ( 'SQRT' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:18:9: 'SQRT'
            {
            match("SQRT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:19:7: ( 'MOD' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:19:9: 'MOD'
            {
            match("MOD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:20:7: ( 'SIZE' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:20:9: 'SIZE'
            {
            match("SIZE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:21:7: ( 'TRUE' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:21:9: 'TRUE'
            {
            match("TRUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:22:7: ( 'FALSE' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:22:9: 'FALSE'
            {
            match("FALSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:23:7: ( '<' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:23:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:24:7: ( '>' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:24:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:25:7: ( '<=' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:25:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:26:7: ( '>=' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:26:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:27:7: ( '=' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:27:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:28:7: ( '!=' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:28:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:29:7: ( 'IMPORT' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:29:9: 'IMPORT'
            {
            match("IMPORT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:30:7: ( ':' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:30:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:31:7: ( 'HAVING' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:31:9: 'HAVING'
            {
            match("HAVING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:32:7: ( 'ORDER' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:32:9: 'ORDER'
            {
            match("ORDER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:33:7: ( 'BY' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:33:9: 'BY'
            {
            match("BY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:34:7: ( ',' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:34:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:35:7: ( '.' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:35:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:36:7: ( 'UPDATE' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:36:9: 'UPDATE'
            {
            match("UPDATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:37:7: ( 'SET' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:37:9: 'SET'
            {
            match("SET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:38:7: ( 'DELETE' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:38:9: 'DELETE'
            {
            match("DELETE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:39:7: ( 'SELECT' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:39:9: 'SELECT'
            {
            match("SELECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:40:7: ( 'AVG' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:40:9: 'AVG'
            {
            match("AVG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:41:7: ( '(' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:41:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:42:7: ( ')' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:42:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:43:7: ( 'MAX' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:43:9: 'MAX'
            {
            match("MAX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:44:7: ( 'MIN' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:44:9: 'MIN'
            {
            match("MIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:45:7: ( 'SUM' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:45:9: 'SUM'
            {
            match("SUM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:46:7: ( 'COUNT' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:46:9: 'COUNT'
            {
            match("COUNT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:47:7: ( 'NEW' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:47:9: 'NEW'
            {
            match("NEW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:48:7: ( 'FROM' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:48:9: 'FROM'
            {
            match("FROM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:49:7: ( 'AS' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:49:9: 'AS'
            {
            match("AS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:50:7: ( 'IN' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:50:9: 'IN'
            {
            match("IN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:51:7: ( 'JOIN' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:51:9: 'JOIN'
            {
            match("JOIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:52:7: ( 'LEFT' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:52:9: 'LEFT'
            {
            match("LEFT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:53:7: ( 'INNER' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:53:9: 'INNER'
            {
            match("INNER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:54:7: ( 'WHERE' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:54:9: 'WHERE'
            {
            match("WHERE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:55:7: ( 'OR' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:55:9: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:56:7: ( 'AND' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:56:9: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:57:7: ( 'EXISTS' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:57:9: 'EXISTS'
            {
            match("EXISTS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:58:7: ( 'ALL' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:58:9: 'ALL'
            {
            match("ALL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:59:7: ( 'ANY' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:59:9: 'ANY'
            {
            match("ANY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:60:7: ( 'SOME' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:60:9: 'SOME'
            {
            match("SOME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:61:7: ( 'MEMBER' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:61:9: 'MEMBER'
            {
            match("MEMBER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:62:7: ( 'OF' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:62:9: 'OF'
            {
            match("OF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:63:7: ( 'IS' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:63:9: 'IS'
            {
            match("IS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:64:7: ( 'NULL' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:64:9: 'NULL'
            {
            match("NULL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:65:7: ( 'EMPTY' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:65:9: 'EMPTY'
            {
            match("EMPTY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:66:7: ( 'LIKE' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:66:9: 'LIKE'
            {
            match("LIKE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:67:7: ( 'BETWEEN' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:67:9: 'BETWEEN'
            {
            match("BETWEEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:68:7: ( 'ASC' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:68:9: 'ASC'
            {
            match("ASC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:69:7: ( 'DESC' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:69:9: 'DESC'
            {
            match("DESC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:70:7: ( 'DISTINCT' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:70:9: 'DISTINCT'
            {
            match("DISTINCT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:71:7: ( 'FETCH' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:71:9: 'FETCH'
            {
            match("FETCH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:72:7: ( 'OUTER' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:72:9: 'OUTER'
            {
            match("OUTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:73:7: ( 'NOT' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:73:9: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "RULE_LITERALTEMPORAL"
    public final void mRULE_LITERALTEMPORAL() throws RecognitionException {
        try {
            int _type = RULE_LITERALTEMPORAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10816:22: ( ( RULE_DATE_LITERAL | RULE_TIME_LITERAL | RULE_TIMESTAMP_LITERAL ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10816:24: ( RULE_DATE_LITERAL | RULE_TIME_LITERAL | RULE_TIMESTAMP_LITERAL )
            {
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10816:24: ( RULE_DATE_LITERAL | RULE_TIME_LITERAL | RULE_TIMESTAMP_LITERAL )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='(') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='d') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='t') ) {
                    int LA1_3 = input.LA(3);

                    if ( (LA1_3=='s') ) {
                        alt1=3;
                    }
                    else if ( (LA1_3=='\t'||LA1_3==' ') ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10816:25: RULE_DATE_LITERAL
                    {
                    mRULE_DATE_LITERAL(); 

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10816:43: RULE_TIME_LITERAL
                    {
                    mRULE_TIME_LITERAL(); 

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10816:61: RULE_TIMESTAMP_LITERAL
                    {
                    mRULE_TIMESTAMP_LITERAL(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITERALTEMPORAL"

    // $ANTLR start "RULE_DATE_LITERAL"
    public final void mRULE_DATE_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_DATE_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10818:19: ( '(' 'd' ( ' ' | '\\t' )+ '\\'' RULE_DATE_STRING '\\'' ( ' ' | '\\t' )* ')' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10818:21: '(' 'd' ( ' ' | '\\t' )+ '\\'' RULE_DATE_STRING '\\'' ( ' ' | '\\t' )* ')'
            {
            match('('); 
            match('d'); 
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10818:29: ( ' ' | '\\t' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\t'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            match('\''); 
            mRULE_DATE_STRING(); 
            match('\''); 
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10818:68: ( ' ' | '\\t' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\t'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATE_LITERAL"

    // $ANTLR start "RULE_TIME_LITERAL"
    public final void mRULE_TIME_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_TIME_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10820:19: ( '(' 't' ( ' ' | '\\t' )+ '\\'' RULE_TIME_STRING '\\'' ( ' ' | '\\t' )* ')' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10820:21: '(' 't' ( ' ' | '\\t' )+ '\\'' RULE_TIME_STRING '\\'' ( ' ' | '\\t' )* ')'
            {
            match('('); 
            match('t'); 
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10820:29: ( ' ' | '\\t' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\t'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            match('\''); 
            mRULE_TIME_STRING(); 
            match('\''); 
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10820:68: ( ' ' | '\\t' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\t'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TIME_LITERAL"

    // $ANTLR start "RULE_TIMESTAMP_LITERAL"
    public final void mRULE_TIMESTAMP_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_TIMESTAMP_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10822:24: ( '(' 'ts' ( ' ' | '\\t' )+ '\\'' RULE_DATE_STRING ' ' RULE_TIME_STRING '\\'' ( ' ' | '\\t' )* ')' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10822:26: '(' 'ts' ( ' ' | '\\t' )+ '\\'' RULE_DATE_STRING ' ' RULE_TIME_STRING '\\'' ( ' ' | '\\t' )* ')'
            {
            match('('); 
            match("ts"); 

            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10822:35: ( ' ' | '\\t' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\t'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            match('\''); 
            mRULE_DATE_STRING(); 
            match(' '); 
            mRULE_TIME_STRING(); 
            match('\''); 
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10822:95: ( ' ' | '\\t' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\t'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TIMESTAMP_LITERAL"

    // $ANTLR start "RULE_DATE_STRING"
    public final void mRULE_DATE_STRING() throws RecognitionException {
        try {
            int _type = RULE_DATE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10824:18: ( '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10824:20: '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9'
            {
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            match('-'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            match('-'); 
            matchRange('0','9'); 
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATE_STRING"

    // $ANTLR start "RULE_TIME_STRING"
    public final void mRULE_TIME_STRING() throws RecognitionException {
        try {
            int _type = RULE_TIME_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10826:18: ( '0' .. '9' ( '0' .. '9' )? ':' '0' .. '9' '0' .. '9' ':' '0' .. '9' '0' .. '9' '.' ( '0' .. '9' )* )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10826:20: '0' .. '9' ( '0' .. '9' )? ':' '0' .. '9' '0' .. '9' ':' '0' .. '9' '0' .. '9' '.' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10826:29: ( '0' .. '9' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10826:30: '0' .. '9'
                    {
                    matchRange('0','9'); 

                    }
                    break;

            }

            match(':'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            match(':'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            match('.'); 
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10826:89: ( '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10826:90: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TIME_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10828:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10828:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10828:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10828:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10828:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10830:10: ( ( '0' .. '9' )+ )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10830:12: ( '0' .. '9' )+
            {
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10830:12: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10830:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10832:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10832:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10832:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\"') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10832:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10832:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10832:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10832:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10832:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10832:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10832:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10832:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10834:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10834:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10834:24: ( options {greedy=false; } : . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='*') ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1=='/') ) {
                        alt16=2;
                    }
                    else if ( ((LA16_1>='\u0000' && LA16_1<='.')||(LA16_1>='0' && LA16_1<='\uFFFF')) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10834:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10836:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10836:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10836:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10836:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10836:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10836:41: ( '\\r' )? '\\n'
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10836:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10836:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10838:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10838:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10838:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10840:16: ( . )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:10840:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | RULE_LITERALTEMPORAL | RULE_DATE_LITERAL | RULE_TIME_LITERAL | RULE_TIMESTAMP_LITERAL | RULE_DATE_STRING | RULE_TIME_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=76;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:334: T__71
                {
                mT__71(); 

                }
                break;
            case 56 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:340: T__72
                {
                mT__72(); 

                }
                break;
            case 57 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:346: T__73
                {
                mT__73(); 

                }
                break;
            case 58 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:352: T__74
                {
                mT__74(); 

                }
                break;
            case 59 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:358: T__75
                {
                mT__75(); 

                }
                break;
            case 60 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:364: T__76
                {
                mT__76(); 

                }
                break;
            case 61 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:370: T__77
                {
                mT__77(); 

                }
                break;
            case 62 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:376: T__78
                {
                mT__78(); 

                }
                break;
            case 63 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:382: T__79
                {
                mT__79(); 

                }
                break;
            case 64 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:388: RULE_LITERALTEMPORAL
                {
                mRULE_LITERALTEMPORAL(); 

                }
                break;
            case 65 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:409: RULE_DATE_LITERAL
                {
                mRULE_DATE_LITERAL(); 

                }
                break;
            case 66 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:427: RULE_TIME_LITERAL
                {
                mRULE_TIME_LITERAL(); 

                }
                break;
            case 67 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:445: RULE_TIMESTAMP_LITERAL
                {
                mRULE_TIMESTAMP_LITERAL(); 

                }
                break;
            case 68 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:468: RULE_DATE_STRING
                {
                mRULE_DATE_STRING(); 

                }
                break;
            case 69 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:485: RULE_TIME_STRING
                {
                mRULE_TIME_STRING(); 

                }
                break;
            case 70 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:502: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 71 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:510: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 72 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:519: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 73 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:531: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 74 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:547: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 75 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:563: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 76 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/internal/InternalJPQL.g:1:571: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\1\uffff\10\44\1\74\1\76\1\uffff\1\42\1\44\1\uffff\3\44\2\uffff"+
        "\1\44\1\121\1\uffff\4\44\1\134\1\42\1\uffff\3\42\2\uffff\1\44\1"+
        "\uffff\13\44\1\164\12\44\6\uffff\1\44\1\u0082\1\u0083\1\uffff\1"+
        "\44\1\u0086\1\u0087\1\44\1\u0089\1\44\2\uffff\2\44\4\uffff\7\44"+
        "\1\134\6\uffff\3\44\1\u009c\2\44\1\u009f\11\44\1\u00a9\1\u00aa\1"+
        "\u00ab\1\uffff\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\7"+
        "\44\2\uffff\2\44\2\uffff\1\44\1\uffff\4\44\3\uffff\1\u00c3\1\44"+
        "\1\u00c5\4\44\1\134\3\44\1\uffff\1\u00ce\1\u00cf\1\uffff\1\44\1"+
        "\u00d1\3\44\1\u00d5\1\u00d6\2\44\11\uffff\1\44\1\u00da\1\44\1\u00dc"+
        "\10\44\1\u00e5\1\44\4\uffff\1\u00ea\1\uffff\1\u00eb\3\44\1\134\1"+
        "\44\1\u00f1\1\44\2\uffff\1\44\1\uffff\1\u00f4\2\44\2\uffff\1\u00f7"+
        "\2\44\1\uffff\1\u00fa\1\uffff\1\u00fb\1\44\1\u00fd\1\44\1\u00ff"+
        "\1\u0100\2\44\1\uffff\1\44\5\uffff\1\u0108\1\44\1\u010a\1\uffff"+
        "\1\u010b\1\uffff\1\44\1\u010d\1\uffff\1\u010e\1\u010f\1\uffff\1"+
        "\u0110\1\u0111\2\uffff\1\u0112\1\uffff\1\u0113\2\uffff\1\44\1\u0115"+
        "\1\44\5\uffff\1\u011a\2\uffff\1\44\7\uffff\1\u011c\1\uffff\1\44"+
        "\4\uffff\1\44\1\uffff\1\u0122\3\uffff\1\u0126\51\uffff";
    static final String DFA21_eofS =
        "\u014b\uffff";
    static final String DFA21_minS =
        "\1\0\1\117\2\105\1\120\1\102\1\101\1\122\1\101\2\75\1\uffff\1\75"+
        "\1\115\1\uffff\1\101\1\106\1\105\2\uffff\1\105\1\144\1\uffff\1\105"+
        "\1\117\1\110\1\115\1\60\1\101\1\uffff\2\0\1\52\2\uffff\1\116\1\uffff"+
        "\1\102\1\122\1\132\1\114\1\115\1\103\1\106\1\113\1\104\1\123\1\107"+
        "\1\60\1\104\1\114\1\104\1\130\1\116\1\115\1\125\1\114\1\117\1\124"+
        "\6\uffff\1\120\2\60\1\uffff\1\126\2\60\1\124\1\60\1\124\2\uffff"+
        "\1\114\1\123\2\11\2\uffff\1\127\1\114\1\124\1\111\1\105\1\111\1"+
        "\120\1\60\6\uffff\1\103\1\116\1\123\1\60\1\124\1\105\1\60\3\105"+
        "\1\101\1\107\1\124\2\105\1\101\3\60\1\uffff\6\60\1\102\1\105\1\123"+
        "\1\115\1\103\1\117\1\105\2\uffff\1\111\1\105\2\uffff\1\105\1\uffff"+
        "\1\127\1\105\1\103\1\124\3\11\1\60\1\114\1\60\1\116\1\122\1\123"+
        "\1\124\1\60\1\101\2\124\1\uffff\2\60\1\uffff\1\103\1\60\1\122\2"+
        "\124\2\60\1\122\1\124\11\uffff\1\105\1\60\1\105\1\60\1\110\2\122"+
        "\1\116\2\122\1\105\1\124\1\60\1\111\1\60\1\11\1\60\1\uffff\1\60"+
        "\1\uffff\1\60\1\105\1\124\1\131\1\55\1\124\1\60\1\122\2\uffff\1"+
        "\124\1\uffff\1\60\1\105\1\110\2\uffff\1\60\1\105\1\122\1\uffff\1"+
        "\60\1\uffff\1\60\1\124\1\60\1\107\2\60\2\105\1\uffff\1\116\3\60"+
        "\2\uffff\1\60\1\123\1\60\1\uffff\1\60\1\uffff\1\111\1\60\1\uffff"+
        "\2\60\1\uffff\2\60\2\uffff\1\60\1\uffff\1\60\2\uffff\1\116\1\60"+
        "\1\103\2\60\1\72\1\60\1\uffff\1\60\2\uffff\1\116\7\uffff\1\60\1"+
        "\uffff\1\124\3\60\1\uffff\1\107\1\uffff\1\60\1\55\1\60\1\72\1\60"+
        "\1\uffff\1\60\1\55\1\60\1\uffff\3\60\1\55\1\60\1\56\1\60\1\55\1"+
        "\47\2\60\1\47\1\11\1\47\1\60\1\11\1\uffff\1\11\1\40\1\uffff\1\11"+
        "\1\uffff\2\60\1\72\2\60\1\72\2\60\1\56\2\47\2\11\1\uffff";
    static final String DFA21_maxS =
        "\1\uffff\1\117\1\125\1\117\1\120\1\126\1\117\2\122\2\75\1\uffff"+
        "\1\75\1\123\1\uffff\1\101\1\125\1\131\2\uffff\1\111\1\164\1\uffff"+
        "\1\125\1\117\1\110\1\130\1\72\1\172\1\uffff\2\uffff\1\57\2\uffff"+
        "\1\125\1\uffff\1\115\1\122\1\132\1\124\1\115\1\127\1\116\1\113\1"+
        "\120\1\123\1\107\1\172\1\131\1\114\1\104\1\130\1\116\1\115\1\125"+
        "\1\114\1\117\1\124\6\uffff\1\120\2\172\1\uffff\1\126\2\172\1\124"+
        "\1\172\1\124\2\uffff\2\123\1\40\1\163\2\uffff\1\127\1\114\1\124"+
        "\1\111\1\105\1\111\1\120\1\72\6\uffff\1\103\1\116\1\123\1\172\1"+
        "\124\1\105\1\172\3\105\1\101\1\107\1\124\2\105\1\101\3\172\1\uffff"+
        "\6\172\1\102\1\105\1\123\1\115\1\103\1\117\1\105\2\uffff\1\111\1"+
        "\105\2\uffff\1\105\1\uffff\1\127\1\105\1\103\1\124\1\47\1\40\1\47"+
        "\1\172\1\114\1\172\1\116\1\122\1\123\1\124\1\71\1\101\2\124\1\uffff"+
        "\2\172\1\uffff\1\103\1\172\1\122\2\124\2\172\1\122\1\124\11\uffff"+
        "\1\105\1\172\1\105\1\172\1\110\2\122\1\116\2\122\1\105\1\124\1\172"+
        "\1\111\1\71\1\47\1\71\1\uffff\1\172\1\uffff\1\172\1\105\1\124\1"+
        "\131\1\55\1\124\1\172\1\122\2\uffff\1\124\1\uffff\1\172\1\105\1"+
        "\110\2\uffff\1\172\1\105\1\122\1\uffff\1\172\1\uffff\1\172\1\124"+
        "\1\172\1\107\2\172\2\105\1\uffff\1\116\2\71\1\72\2\uffff\1\172\1"+
        "\123\1\172\1\uffff\1\172\1\uffff\1\111\1\172\1\uffff\2\172\1\uffff"+
        "\2\172\2\uffff\1\172\1\uffff\1\172\2\uffff\1\116\1\172\1\103\2\71"+
        "\1\72\1\71\1\uffff\1\172\2\uffff\1\116\7\uffff\1\172\1\uffff\1\124"+
        "\3\71\1\uffff\1\107\1\uffff\1\172\1\55\1\71\1\72\1\172\1\uffff\1"+
        "\71\1\55\1\71\1\uffff\3\71\1\55\1\71\1\56\1\71\1\55\4\71\1\51\1"+
        "\47\1\71\1\51\1\uffff\1\51\1\40\1\uffff\1\51\1\uffff\1\71\2\72\2"+
        "\71\1\72\2\71\1\56\2\71\2\51\1\uffff";
    static final String DFA21_acceptS =
        "\13\uffff\1\21\2\uffff\1\24\3\uffff\1\30\1\31\2\uffff\1\40\6\uffff"+
        "\1\106\3\uffff\1\113\1\114\1\uffff\1\106\26\uffff\1\17\1\15\1\20"+
        "\1\16\1\21\1\22\3\uffff\1\24\6\uffff\1\30\1\31\4\uffff\1\37\1\40"+
        "\10\uffff\1\105\1\107\1\110\1\111\1\112\1\113\23\uffff\1\47\15\uffff"+
        "\1\50\1\65\2\uffff\1\55\1\64\1\uffff\1\27\22\uffff\1\43\2\uffff"+
        "\1\33\11\uffff\1\7\1\36\1\72\1\56\1\61\1\60\1\11\1\41\1\42\21\uffff"+
        "\1\45\1\uffff\1\77\10\uffff\1\10\1\12\1\uffff\1\62\3\uffff\1\52"+
        "\1\70\3\uffff\1\13\1\uffff\1\46\10\uffff\1\73\4\uffff\1\66\1\51"+
        "\3\uffff\1\104\1\uffff\1\44\2\uffff\1\3\2\uffff\1\4\2\uffff\1\14"+
        "\1\75\1\uffff\1\53\1\uffff\1\26\1\76\7\uffff\1\54\1\uffff\1\67\1"+
        "\1\1\uffff\1\35\1\6\1\5\1\32\1\63\1\23\1\25\1\uffff\1\34\4\uffff"+
        "\1\57\1\uffff\1\71\5\uffff\1\74\3\uffff\1\2\20\uffff\1\100\2\uffff"+
        "\1\100\1\uffff\1\100\15\uffff\1\100";
    static final String DFA21_specialS =
        "\1\1\35\uffff\1\0\1\2\u012b\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\14\1\36\4\42\1\37\1\25\1"+
            "\26\2\42\1\22\1\42\1\23\1\40\12\33\1\16\1\42\1\11\1\13\1\12"+
            "\2\42\1\5\1\21\1\1\1\24\1\32\1\10\1\35\1\17\1\15\1\30\1\35\1"+
            "\3\1\6\1\27\1\20\3\35\1\2\1\7\1\4\1\35\1\31\3\35\3\42\1\34\1"+
            "\35\1\42\32\35\uff85\42",
            "\1\43",
            "\1\50\3\uffff\1\47\5\uffff\1\51\1\uffff\1\46\3\uffff\1\45",
            "\1\53\3\uffff\1\54\5\uffff\1\52",
            "\1\55",
            "\1\56\11\uffff\1\62\1\uffff\1\61\4\uffff\1\60\2\uffff\1\57",
            "\1\64\3\uffff\1\66\3\uffff\1\65\5\uffff\1\63",
            "\1\67",
            "\1\70\3\uffff\1\72\14\uffff\1\71",
            "\1\73",
            "\1\75",
            "",
            "\1\100",
            "\1\101\1\102\4\uffff\1\103",
            "",
            "\1\105",
            "\1\107\13\uffff\1\106\2\uffff\1\110",
            "\1\112\23\uffff\1\111",
            "",
            "",
            "\1\115\3\uffff\1\116",
            "\1\117\17\uffff\1\120",
            "",
            "\1\123\11\uffff\1\125\5\uffff\1\124",
            "\1\126",
            "\1\127",
            "\1\131\12\uffff\1\130",
            "\12\132\1\133",
            "\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\0\135",
            "\0\135",
            "\1\136\4\uffff\1\137",
            "",
            "",
            "\1\141\6\uffff\1\142",
            "",
            "\1\143\12\uffff\1\144",
            "\1\145",
            "\1\146",
            "\1\150\7\uffff\1\147",
            "\1\151",
            "\1\153\23\uffff\1\152",
            "\1\155\7\uffff\1\154",
            "\1\156",
            "\1\160\13\uffff\1\157",
            "\1\161",
            "\1\162",
            "\12\44\7\uffff\2\44\1\163\27\44\4\uffff\1\44\1\uffff\32\44",
            "\1\165\24\uffff\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0080",
            "\12\44\7\uffff\15\44\1\u0081\14\44\4\uffff\1\44\1\uffff\32"+
            "\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u0084",
            "\12\44\7\uffff\3\44\1\u0085\26\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0088",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u008a",
            "",
            "",
            "\1\u008b\6\uffff\1\u008c",
            "\1\u008d",
            "\1\u008e\26\uffff\1\u008e",
            "\1\u0090\26\uffff\1\u0090\122\uffff\1\u008f",
            "",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\12\u0098\1\133",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u009d",
            "\1\u009e",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u008e\26\uffff\1\u008e\6\uffff\1\u00c0",
            "\1\u00c1\26\uffff\1\u00c1",
            "\1\u0090\26\uffff\1\u0090\6\uffff\1\u00c2",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00c4",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\12\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00d0",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d9",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00db",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00e6",
            "\12\u00e7",
            "\1\u00c1\26\uffff\1\u00c1\6\uffff\1\u00e8",
            "\12\u00e9",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00f2",
            "",
            "",
            "\1\u00f3",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00f5",
            "\1\u00f6",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00fc",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00fe",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0101",
            "\1\u0102",
            "",
            "\1\u0103",
            "\12\u0104",
            "\12\u0105",
            "\12\u0106\1\u0107",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0109",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u010c",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\1\u0114",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0116",
            "\12\u0117",
            "\12\u0118",
            "\1\u0107",
            "\12\u0119",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\1\u011b",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u011d",
            "\12\u011e",
            "\12\u011f",
            "\12\u0120",
            "",
            "\1\u0121",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0123",
            "\12\u0124",
            "\1\u0125",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\u0127",
            "\1\u0128",
            "\12\u0129",
            "",
            "\12\u012a",
            "\12\u012b",
            "\12\u012c",
            "\1\u012d",
            "\12\u012e",
            "\1\u012f",
            "\12\u0130",
            "\1\u0131",
            "\1\u0133\10\uffff\12\u0132",
            "\12\u0134",
            "\12\u0135",
            "\1\u0133\10\uffff\12\u0132",
            "\1\u0136\26\uffff\1\u0136\10\uffff\1\u0137",
            "\1\u0138",
            "\12\u0139",
            "\1\u0136\26\uffff\1\u0136\10\uffff\1\u0137",
            "",
            "\1\u013b\26\uffff\1\u013b\10\uffff\1\u013c",
            "\1\u013d",
            "",
            "\1\u013b\26\uffff\1\u013b\10\uffff\1\u013c",
            "",
            "\12\u013e",
            "\12\u013f\1\u0140",
            "\1\u0140",
            "\12\u0141",
            "\12\u0142",
            "\1\u0143",
            "\12\u0144",
            "\12\u0145",
            "\1\u0146",
            "\1\u0148\10\uffff\12\u0147",
            "\1\u0148\10\uffff\12\u0147",
            "\1\u0149\26\uffff\1\u0149\10\uffff\1\u014a",
            "\1\u0149\26\uffff\1\u0149\10\uffff\1\u014a",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | RULE_LITERALTEMPORAL | RULE_DATE_LITERAL | RULE_TIME_LITERAL | RULE_TIMESTAMP_LITERAL | RULE_DATE_STRING | RULE_TIME_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_30 = input.LA(1);

                        s = -1;
                        if ( ((LA21_30>='\u0000' && LA21_30<='\uFFFF')) ) {s = 93;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='C') ) {s = 1;}

                        else if ( (LA21_0=='S') ) {s = 2;}

                        else if ( (LA21_0=='L') ) {s = 3;}

                        else if ( (LA21_0=='U') ) {s = 4;}

                        else if ( (LA21_0=='A') ) {s = 5;}

                        else if ( (LA21_0=='M') ) {s = 6;}

                        else if ( (LA21_0=='T') ) {s = 7;}

                        else if ( (LA21_0=='F') ) {s = 8;}

                        else if ( (LA21_0=='<') ) {s = 9;}

                        else if ( (LA21_0=='>') ) {s = 10;}

                        else if ( (LA21_0=='=') ) {s = 11;}

                        else if ( (LA21_0=='!') ) {s = 12;}

                        else if ( (LA21_0=='I') ) {s = 13;}

                        else if ( (LA21_0==':') ) {s = 14;}

                        else if ( (LA21_0=='H') ) {s = 15;}

                        else if ( (LA21_0=='O') ) {s = 16;}

                        else if ( (LA21_0=='B') ) {s = 17;}

                        else if ( (LA21_0==',') ) {s = 18;}

                        else if ( (LA21_0=='.') ) {s = 19;}

                        else if ( (LA21_0=='D') ) {s = 20;}

                        else if ( (LA21_0=='(') ) {s = 21;}

                        else if ( (LA21_0==')') ) {s = 22;}

                        else if ( (LA21_0=='N') ) {s = 23;}

                        else if ( (LA21_0=='J') ) {s = 24;}

                        else if ( (LA21_0=='W') ) {s = 25;}

                        else if ( (LA21_0=='E') ) {s = 26;}

                        else if ( ((LA21_0>='0' && LA21_0<='9')) ) {s = 27;}

                        else if ( (LA21_0=='^') ) {s = 28;}

                        else if ( (LA21_0=='G'||LA21_0=='K'||(LA21_0>='P' && LA21_0<='R')||LA21_0=='V'||(LA21_0>='X' && LA21_0<='Z')||LA21_0=='_'||(LA21_0>='a' && LA21_0<='z')) ) {s = 29;}

                        else if ( (LA21_0=='\"') ) {s = 30;}

                        else if ( (LA21_0=='\'') ) {s = 31;}

                        else if ( (LA21_0=='/') ) {s = 32;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 33;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||(LA21_0>='#' && LA21_0<='&')||(LA21_0>='*' && LA21_0<='+')||LA21_0=='-'||LA21_0==';'||(LA21_0>='?' && LA21_0<='@')||(LA21_0>='[' && LA21_0<=']')||LA21_0=='`'||(LA21_0>='{' && LA21_0<='\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_31 = input.LA(1);

                        s = -1;
                        if ( ((LA21_31>='\u0000' && LA21_31<='\uFFFF')) ) {s = 93;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}