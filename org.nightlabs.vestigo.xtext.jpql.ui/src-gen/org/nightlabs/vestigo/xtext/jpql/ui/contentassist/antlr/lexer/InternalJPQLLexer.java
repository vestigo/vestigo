package org.nightlabs.vestigo.xtext.jpql.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJPQLLexer extends Lexer {
    public static final int RULE_ID=74;
    public static final int RULE_ANY_OTHER=80;
    public static final int KEYWORD_19=59;
    public static final int KEYWORD_56=10;
    public static final int KEYWORD_55=29;
    public static final int KEYWORD_17=57;
    public static final int KEYWORD_54=28;
    public static final int KEYWORD_18=58;
    public static final int KEYWORD_53=27;
    public static final int KEYWORD_15=55;
    public static final int KEYWORD_52=26;
    public static final int KEYWORD_16=56;
    public static final int KEYWORD_51=25;
    public static final int KEYWORD_13=53;
    public static final int KEYWORD_50=24;
    public static final int KEYWORD_14=54;
    public static final int KEYWORD_11=72;
    public static final int KEYWORD_12=73;
    public static final int EOF=-1;
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
    public static final int KEYWORD_27=45;
    public static final int KEYWORD_62=16;
    public static final int KEYWORD_20=60;
    public static final int KEYWORD_21=61;
    public static final int KEYWORD_22=40;
    public static final int KEYWORD_23=41;
    public static final int KEYWORD_69=6;
    public static final int KEYWORD_68=5;
    public static final int KEYWORD_1=62;
    public static final int KEYWORD_30=48;
    public static final int KEYWORD_5=66;
    public static final int KEYWORD_34=52;
    public static final int KEYWORD_4=65;
    public static final int KEYWORD_33=51;
    public static final int KEYWORD_3=64;
    public static final int KEYWORD_32=50;
    public static final int KEYWORD_70=4;
    public static final int KEYWORD_2=63;
    public static final int KEYWORD_31=49;
    public static final int KEYWORD_38=33;
    public static final int RULE_SL_COMMENT=78;
    public static final int KEYWORD_37=32;
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
    public static final int RULE_WS=79;
    public static final int KEYWORD_47=21;
    public static final int KEYWORD_46=20;
    public static final int KEYWORD_49=23;
    public static final int KEYWORD_48=22;

    // delegates
    // delegators

    public InternalJPQLLexer() {;} 
    public InternalJPQLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJPQLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g"; }

    // $ANTLR start "KEYWORD_70"
    public final void mKEYWORD_70() throws RecognitionException {
        try {
            int _type = KEYWORD_70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:19:12: ( ( 'C' | 'c' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) '_' ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'P' | 'p' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:19:14: ( 'C' | 'c' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) '_' ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_70"

    // $ANTLR start "KEYWORD_68"
    public final void mKEYWORD_68() throws RecognitionException {
        try {
            int _type = KEYWORD_68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:21:12: ( ( 'C' | 'c' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) '_' ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:21:14: ( 'C' | 'c' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) '_' ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_68"

    // $ANTLR start "KEYWORD_69"
    public final void mKEYWORD_69() throws RecognitionException {
        try {
            int _type = KEYWORD_69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:23:12: ( ( 'C' | 'c' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) '_' ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:23:14: ( 'C' | 'c' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) '_' ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_69"

    // $ANTLR start "KEYWORD_67"
    public final void mKEYWORD_67() throws RecognitionException {
        try {
            int _type = KEYWORD_67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:25:12: ( ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:25:14: ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_67"

    // $ANTLR start "KEYWORD_66"
    public final void mKEYWORD_66() throws RecognitionException {
        try {
            int _type = KEYWORD_66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:27:12: ( ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:27:14: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_66"

    // $ANTLR start "KEYWORD_65"
    public final void mKEYWORD_65() throws RecognitionException {
        try {
            int _type = KEYWORD_65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:29:12: ( ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'W' | 'w' ) ( 'E' | 'e' ) ( 'E' | 'e' ) ( 'N' | 'n' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:29:14: ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'W' | 'w' ) ( 'E' | 'e' ) ( 'E' | 'e' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_65"

    // $ANTLR start "KEYWORD_56"
    public final void mKEYWORD_56() throws RecognitionException {
        try {
            int _type = KEYWORD_56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:31:12: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'T' | 't' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:31:14: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_56"

    // $ANTLR start "KEYWORD_57"
    public final void mKEYWORD_57() throws RecognitionException {
        try {
            int _type = KEYWORD_57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:33:12: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:33:14: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_57"

    // $ANTLR start "KEYWORD_58"
    public final void mKEYWORD_58() throws RecognitionException {
        try {
            int _type = KEYWORD_58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:35:12: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'S' | 's' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:35:14: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_58"

    // $ANTLR start "KEYWORD_59"
    public final void mKEYWORD_59() throws RecognitionException {
        try {
            int _type = KEYWORD_59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:37:12: ( ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:37:14: ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_59"

    // $ANTLR start "KEYWORD_60"
    public final void mKEYWORD_60() throws RecognitionException {
        try {
            int _type = KEYWORD_60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:39:12: ( ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'T' | 't' ) ( 'H' | 'h' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:39:14: ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'T' | 't' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_60"

    // $ANTLR start "KEYWORD_61"
    public final void mKEYWORD_61() throws RecognitionException {
        try {
            int _type = KEYWORD_61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:41:12: ( ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:41:14: ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_61"

    // $ANTLR start "KEYWORD_62"
    public final void mKEYWORD_62() throws RecognitionException {
        try {
            int _type = KEYWORD_62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:43:12: ( ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:43:14: ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_62"

    // $ANTLR start "KEYWORD_63"
    public final void mKEYWORD_63() throws RecognitionException {
        try {
            int _type = KEYWORD_63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:45:12: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:45:14: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_63"

    // $ANTLR start "KEYWORD_64"
    public final void mKEYWORD_64() throws RecognitionException {
        try {
            int _type = KEYWORD_64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:47:12: ( ( 'U' | 'u' ) ( 'P' | 'p' ) ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:47:14: ( 'U' | 'u' ) ( 'P' | 'p' ) ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_64"

    // $ANTLR start "KEYWORD_45"
    public final void mKEYWORD_45() throws RecognitionException {
        try {
            int _type = KEYWORD_45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:49:12: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:49:14: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_45"

    // $ANTLR start "KEYWORD_46"
    public final void mKEYWORD_46() throws RecognitionException {
        try {
            int _type = KEYWORD_46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:51:12: ( ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'Y' | 'y' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:51:14: ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_46"

    // $ANTLR start "KEYWORD_47"
    public final void mKEYWORD_47() throws RecognitionException {
        try {
            int _type = KEYWORD_47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:53:12: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:53:14: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_47"

    // $ANTLR start "KEYWORD_48"
    public final void mKEYWORD_48() throws RecognitionException {
        try {
            int _type = KEYWORD_48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:55:12: ( ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:55:14: ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_48"

    // $ANTLR start "KEYWORD_49"
    public final void mKEYWORD_49() throws RecognitionException {
        try {
            int _type = KEYWORD_49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:57:12: ( ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:57:14: ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_49"

    // $ANTLR start "KEYWORD_50"
    public final void mKEYWORD_50() throws RecognitionException {
        try {
            int _type = KEYWORD_50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:59:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:59:14: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_50"

    // $ANTLR start "KEYWORD_51"
    public final void mKEYWORD_51() throws RecognitionException {
        try {
            int _type = KEYWORD_51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:61:12: ( ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'W' | 'w' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:61:14: ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'W' | 'w' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_51"

    // $ANTLR start "KEYWORD_52"
    public final void mKEYWORD_52() throws RecognitionException {
        try {
            int _type = KEYWORD_52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:63:12: ( ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:63:14: ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_52"

    // $ANTLR start "KEYWORD_53"
    public final void mKEYWORD_53() throws RecognitionException {
        try {
            int _type = KEYWORD_53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:65:12: ( ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:65:14: ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_53"

    // $ANTLR start "KEYWORD_54"
    public final void mKEYWORD_54() throws RecognitionException {
        try {
            int _type = KEYWORD_54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:67:12: ( ( 'U' | 'u' ) ( 'P' | 'p' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:67:14: ( 'U' | 'u' ) ( 'P' | 'p' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_54"

    // $ANTLR start "KEYWORD_55"
    public final void mKEYWORD_55() throws RecognitionException {
        try {
            int _type = KEYWORD_55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:69:12: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:69:14: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_55"

    // $ANTLR start "KEYWORD_35"
    public final void mKEYWORD_35() throws RecognitionException {
        try {
            int _type = KEYWORD_35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:71:12: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:71:14: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_35"

    // $ANTLR start "KEYWORD_36"
    public final void mKEYWORD_36() throws RecognitionException {
        try {
            int _type = KEYWORD_36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:73:12: ( ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:73:14: ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_36"

    // $ANTLR start "KEYWORD_37"
    public final void mKEYWORD_37() throws RecognitionException {
        try {
            int _type = KEYWORD_37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:75:12: ( ( 'J' | 'j' ) ( 'O' | 'o' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:75:14: ( 'J' | 'j' ) ( 'O' | 'o' ) ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_37"

    // $ANTLR start "KEYWORD_38"
    public final void mKEYWORD_38() throws RecognitionException {
        try {
            int _type = KEYWORD_38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:77:12: ( ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'T' | 't' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:77:14: ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_38"

    // $ANTLR start "KEYWORD_39"
    public final void mKEYWORD_39() throws RecognitionException {
        try {
            int _type = KEYWORD_39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:79:12: ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'K' | 'k' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:79:14: ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'K' | 'k' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_39"

    // $ANTLR start "KEYWORD_40"
    public final void mKEYWORD_40() throws RecognitionException {
        try {
            int _type = KEYWORD_40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:81:12: ( ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:81:14: ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_40"

    // $ANTLR start "KEYWORD_41"
    public final void mKEYWORD_41() throws RecognitionException {
        try {
            int _type = KEYWORD_41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:83:12: ( ( 'S' | 's' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:83:14: ( 'S' | 's' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_41"

    // $ANTLR start "KEYWORD_42"
    public final void mKEYWORD_42() throws RecognitionException {
        try {
            int _type = KEYWORD_42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:85:12: ( ( 'S' | 's' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:85:14: ( 'S' | 's' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_42"

    // $ANTLR start "KEYWORD_43"
    public final void mKEYWORD_43() throws RecognitionException {
        try {
            int _type = KEYWORD_43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:87:12: ( ( 'S' | 's' ) ( 'Q' | 'q' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:87:14: ( 'S' | 's' ) ( 'Q' | 'q' ) ( 'R' | 'r' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_43"

    // $ANTLR start "KEYWORD_44"
    public final void mKEYWORD_44() throws RecognitionException {
        try {
            int _type = KEYWORD_44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:89:12: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:89:14: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_44"

    // $ANTLR start "KEYWORD_22"
    public final void mKEYWORD_22() throws RecognitionException {
        try {
            int _type = KEYWORD_22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:91:12: ( ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'S' | 's' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:91:14: ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_22"

    // $ANTLR start "KEYWORD_23"
    public final void mKEYWORD_23() throws RecognitionException {
        try {
            int _type = KEYWORD_23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:93:12: ( ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:93:14: ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_23"

    // $ANTLR start "KEYWORD_24"
    public final void mKEYWORD_24() throws RecognitionException {
        try {
            int _type = KEYWORD_24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:95:12: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:95:14: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_24"

    // $ANTLR start "KEYWORD_25"
    public final void mKEYWORD_25() throws RecognitionException {
        try {
            int _type = KEYWORD_25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:97:12: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'Y' | 'y' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:97:14: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_25"

    // $ANTLR start "KEYWORD_26"
    public final void mKEYWORD_26() throws RecognitionException {
        try {
            int _type = KEYWORD_26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:99:12: ( ( 'A' | 'a' ) ( 'S' | 's' ) ( 'C' | 'c' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:99:14: ( 'A' | 'a' ) ( 'S' | 's' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_26"

    // $ANTLR start "KEYWORD_27"
    public final void mKEYWORD_27() throws RecognitionException {
        try {
            int _type = KEYWORD_27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:101:12: ( ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'G' | 'g' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:101:14: ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_27"

    // $ANTLR start "KEYWORD_28"
    public final void mKEYWORD_28() throws RecognitionException {
        try {
            int _type = KEYWORD_28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:103:12: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'X' | 'x' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:103:14: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'X' | 'x' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_28"

    // $ANTLR start "KEYWORD_29"
    public final void mKEYWORD_29() throws RecognitionException {
        try {
            int _type = KEYWORD_29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:105:12: ( ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:105:14: ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_29"

    // $ANTLR start "KEYWORD_30"
    public final void mKEYWORD_30() throws RecognitionException {
        try {
            int _type = KEYWORD_30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:107:12: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:107:14: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_30"

    // $ANTLR start "KEYWORD_31"
    public final void mKEYWORD_31() throws RecognitionException {
        try {
            int _type = KEYWORD_31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:109:12: ( ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'W' | 'w' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:109:14: ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'W' | 'w' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_31"

    // $ANTLR start "KEYWORD_32"
    public final void mKEYWORD_32() throws RecognitionException {
        try {
            int _type = KEYWORD_32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:111:12: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:111:14: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_32"

    // $ANTLR start "KEYWORD_33"
    public final void mKEYWORD_33() throws RecognitionException {
        try {
            int _type = KEYWORD_33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:113:12: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:113:14: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_33"

    // $ANTLR start "KEYWORD_34"
    public final void mKEYWORD_34() throws RecognitionException {
        try {
            int _type = KEYWORD_34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:115:12: ( ( 'S' | 's' ) ( 'U' | 'u' ) ( 'M' | 'm' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:115:14: ( 'S' | 's' ) ( 'U' | 'u' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_34"

    // $ANTLR start "KEYWORD_13"
    public final void mKEYWORD_13() throws RecognitionException {
        try {
            int _type = KEYWORD_13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:117:12: ( '<' '=' )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:117:14: '<' '='
            {
            match('<'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_13"

    // $ANTLR start "KEYWORD_14"
    public final void mKEYWORD_14() throws RecognitionException {
        try {
            int _type = KEYWORD_14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:119:12: ( '<' '>' )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:119:14: '<' '>'
            {
            match('<'); 
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_14"

    // $ANTLR start "KEYWORD_15"
    public final void mKEYWORD_15() throws RecognitionException {
        try {
            int _type = KEYWORD_15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:121:12: ( '>' '=' )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:121:14: '>' '='
            {
            match('>'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_15"

    // $ANTLR start "KEYWORD_16"
    public final void mKEYWORD_16() throws RecognitionException {
        try {
            int _type = KEYWORD_16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:123:12: ( ( 'A' | 'a' ) ( 'S' | 's' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:123:14: ( 'A' | 'a' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_16"

    // $ANTLR start "KEYWORD_17"
    public final void mKEYWORD_17() throws RecognitionException {
        try {
            int _type = KEYWORD_17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:125:12: ( ( 'B' | 'b' ) ( 'Y' | 'y' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:125:14: ( 'B' | 'b' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_17"

    // $ANTLR start "KEYWORD_18"
    public final void mKEYWORD_18() throws RecognitionException {
        try {
            int _type = KEYWORD_18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:127:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:127:14: ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_18"

    // $ANTLR start "KEYWORD_19"
    public final void mKEYWORD_19() throws RecognitionException {
        try {
            int _type = KEYWORD_19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:129:12: ( ( 'I' | 'i' ) ( 'S' | 's' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:129:14: ( 'I' | 'i' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_19"

    // $ANTLR start "KEYWORD_20"
    public final void mKEYWORD_20() throws RecognitionException {
        try {
            int _type = KEYWORD_20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:131:12: ( ( 'O' | 'o' ) ( 'F' | 'f' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:131:14: ( 'O' | 'o' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_20"

    // $ANTLR start "KEYWORD_21"
    public final void mKEYWORD_21() throws RecognitionException {
        try {
            int _type = KEYWORD_21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:133:12: ( ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:133:14: ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_21"

    // $ANTLR start "KEYWORD_1"
    public final void mKEYWORD_1() throws RecognitionException {
        try {
            int _type = KEYWORD_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:135:11: ( '(' )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:135:13: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_1"

    // $ANTLR start "KEYWORD_2"
    public final void mKEYWORD_2() throws RecognitionException {
        try {
            int _type = KEYWORD_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:137:11: ( ')' )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:137:13: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_2"

    // $ANTLR start "KEYWORD_3"
    public final void mKEYWORD_3() throws RecognitionException {
        try {
            int _type = KEYWORD_3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:139:11: ( '*' )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:139:13: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_3"

    // $ANTLR start "KEYWORD_4"
    public final void mKEYWORD_4() throws RecognitionException {
        try {
            int _type = KEYWORD_4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:141:11: ( '+' )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:141:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_4"

    // $ANTLR start "KEYWORD_5"
    public final void mKEYWORD_5() throws RecognitionException {
        try {
            int _type = KEYWORD_5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:143:11: ( ',' )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:143:13: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_5"

    // $ANTLR start "KEYWORD_6"
    public final void mKEYWORD_6() throws RecognitionException {
        try {
            int _type = KEYWORD_6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:145:11: ( '-' )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:145:13: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_6"

    // $ANTLR start "KEYWORD_7"
    public final void mKEYWORD_7() throws RecognitionException {
        try {
            int _type = KEYWORD_7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:147:11: ( '.' )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:147:13: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_7"

    // $ANTLR start "KEYWORD_8"
    public final void mKEYWORD_8() throws RecognitionException {
        try {
            int _type = KEYWORD_8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:149:11: ( '/' )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:149:13: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_8"

    // $ANTLR start "KEYWORD_9"
    public final void mKEYWORD_9() throws RecognitionException {
        try {
            int _type = KEYWORD_9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:151:11: ( ':' )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:151:13: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_9"

    // $ANTLR start "KEYWORD_10"
    public final void mKEYWORD_10() throws RecognitionException {
        try {
            int _type = KEYWORD_10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:153:12: ( '<' )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:153:14: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_10"

    // $ANTLR start "KEYWORD_11"
    public final void mKEYWORD_11() throws RecognitionException {
        try {
            int _type = KEYWORD_11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:155:12: ( '=' )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:155:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_11"

    // $ANTLR start "KEYWORD_12"
    public final void mKEYWORD_12() throws RecognitionException {
        try {
            int _type = KEYWORD_12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:157:12: ( '>' )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:157:14: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_12"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:161:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:161:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:161:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:161:11: '^'
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

            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:161:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:
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
            	    break loop2;
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
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:163:10: ( ( '0' .. '9' )+ )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:163:12: ( '0' .. '9' )+
            {
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:163:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:163:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:165:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:165:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:165:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:165:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:165:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:165:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:165:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:165:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:165:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:165:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:165:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:167:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:167:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:167:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:167:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:169:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:169:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:169:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:169:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:169:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:169:41: ( '\\r' )? '\\n'
                    {
                    // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:169:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:169:41: '\\r'
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
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:171:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:171:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:171:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:173:16: ( . )
            // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:173:18: .
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
        // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:8: ( KEYWORD_70 | KEYWORD_68 | KEYWORD_69 | KEYWORD_67 | KEYWORD_66 | KEYWORD_65 | KEYWORD_56 | KEYWORD_57 | KEYWORD_58 | KEYWORD_59 | KEYWORD_60 | KEYWORD_61 | KEYWORD_62 | KEYWORD_63 | KEYWORD_64 | KEYWORD_45 | KEYWORD_46 | KEYWORD_47 | KEYWORD_48 | KEYWORD_49 | KEYWORD_50 | KEYWORD_51 | KEYWORD_52 | KEYWORD_53 | KEYWORD_54 | KEYWORD_55 | KEYWORD_35 | KEYWORD_36 | KEYWORD_37 | KEYWORD_38 | KEYWORD_39 | KEYWORD_40 | KEYWORD_41 | KEYWORD_42 | KEYWORD_43 | KEYWORD_44 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_33 | KEYWORD_34 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=77;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:10: KEYWORD_70
                {
                mKEYWORD_70(); 

                }
                break;
            case 2 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:21: KEYWORD_68
                {
                mKEYWORD_68(); 

                }
                break;
            case 3 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:32: KEYWORD_69
                {
                mKEYWORD_69(); 

                }
                break;
            case 4 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:43: KEYWORD_67
                {
                mKEYWORD_67(); 

                }
                break;
            case 5 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:54: KEYWORD_66
                {
                mKEYWORD_66(); 

                }
                break;
            case 6 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:65: KEYWORD_65
                {
                mKEYWORD_65(); 

                }
                break;
            case 7 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:76: KEYWORD_56
                {
                mKEYWORD_56(); 

                }
                break;
            case 8 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:87: KEYWORD_57
                {
                mKEYWORD_57(); 

                }
                break;
            case 9 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:98: KEYWORD_58
                {
                mKEYWORD_58(); 

                }
                break;
            case 10 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:109: KEYWORD_59
                {
                mKEYWORD_59(); 

                }
                break;
            case 11 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:120: KEYWORD_60
                {
                mKEYWORD_60(); 

                }
                break;
            case 12 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:131: KEYWORD_61
                {
                mKEYWORD_61(); 

                }
                break;
            case 13 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:142: KEYWORD_62
                {
                mKEYWORD_62(); 

                }
                break;
            case 14 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:153: KEYWORD_63
                {
                mKEYWORD_63(); 

                }
                break;
            case 15 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:164: KEYWORD_64
                {
                mKEYWORD_64(); 

                }
                break;
            case 16 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:175: KEYWORD_45
                {
                mKEYWORD_45(); 

                }
                break;
            case 17 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:186: KEYWORD_46
                {
                mKEYWORD_46(); 

                }
                break;
            case 18 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:197: KEYWORD_47
                {
                mKEYWORD_47(); 

                }
                break;
            case 19 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:208: KEYWORD_48
                {
                mKEYWORD_48(); 

                }
                break;
            case 20 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:219: KEYWORD_49
                {
                mKEYWORD_49(); 

                }
                break;
            case 21 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:230: KEYWORD_50
                {
                mKEYWORD_50(); 

                }
                break;
            case 22 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:241: KEYWORD_51
                {
                mKEYWORD_51(); 

                }
                break;
            case 23 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:252: KEYWORD_52
                {
                mKEYWORD_52(); 

                }
                break;
            case 24 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:263: KEYWORD_53
                {
                mKEYWORD_53(); 

                }
                break;
            case 25 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:274: KEYWORD_54
                {
                mKEYWORD_54(); 

                }
                break;
            case 26 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:285: KEYWORD_55
                {
                mKEYWORD_55(); 

                }
                break;
            case 27 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:296: KEYWORD_35
                {
                mKEYWORD_35(); 

                }
                break;
            case 28 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:307: KEYWORD_36
                {
                mKEYWORD_36(); 

                }
                break;
            case 29 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:318: KEYWORD_37
                {
                mKEYWORD_37(); 

                }
                break;
            case 30 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:329: KEYWORD_38
                {
                mKEYWORD_38(); 

                }
                break;
            case 31 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:340: KEYWORD_39
                {
                mKEYWORD_39(); 

                }
                break;
            case 32 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:351: KEYWORD_40
                {
                mKEYWORD_40(); 

                }
                break;
            case 33 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:362: KEYWORD_41
                {
                mKEYWORD_41(); 

                }
                break;
            case 34 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:373: KEYWORD_42
                {
                mKEYWORD_42(); 

                }
                break;
            case 35 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:384: KEYWORD_43
                {
                mKEYWORD_43(); 

                }
                break;
            case 36 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:395: KEYWORD_44
                {
                mKEYWORD_44(); 

                }
                break;
            case 37 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:406: KEYWORD_22
                {
                mKEYWORD_22(); 

                }
                break;
            case 38 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:417: KEYWORD_23
                {
                mKEYWORD_23(); 

                }
                break;
            case 39 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:428: KEYWORD_24
                {
                mKEYWORD_24(); 

                }
                break;
            case 40 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:439: KEYWORD_25
                {
                mKEYWORD_25(); 

                }
                break;
            case 41 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:450: KEYWORD_26
                {
                mKEYWORD_26(); 

                }
                break;
            case 42 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:461: KEYWORD_27
                {
                mKEYWORD_27(); 

                }
                break;
            case 43 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:472: KEYWORD_28
                {
                mKEYWORD_28(); 

                }
                break;
            case 44 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:483: KEYWORD_29
                {
                mKEYWORD_29(); 

                }
                break;
            case 45 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:494: KEYWORD_30
                {
                mKEYWORD_30(); 

                }
                break;
            case 46 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:505: KEYWORD_31
                {
                mKEYWORD_31(); 

                }
                break;
            case 47 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:516: KEYWORD_32
                {
                mKEYWORD_32(); 

                }
                break;
            case 48 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:527: KEYWORD_33
                {
                mKEYWORD_33(); 

                }
                break;
            case 49 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:538: KEYWORD_34
                {
                mKEYWORD_34(); 

                }
                break;
            case 50 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:549: KEYWORD_13
                {
                mKEYWORD_13(); 

                }
                break;
            case 51 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:560: KEYWORD_14
                {
                mKEYWORD_14(); 

                }
                break;
            case 52 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:571: KEYWORD_15
                {
                mKEYWORD_15(); 

                }
                break;
            case 53 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:582: KEYWORD_16
                {
                mKEYWORD_16(); 

                }
                break;
            case 54 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:593: KEYWORD_17
                {
                mKEYWORD_17(); 

                }
                break;
            case 55 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:604: KEYWORD_18
                {
                mKEYWORD_18(); 

                }
                break;
            case 56 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:615: KEYWORD_19
                {
                mKEYWORD_19(); 

                }
                break;
            case 57 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:626: KEYWORD_20
                {
                mKEYWORD_20(); 

                }
                break;
            case 58 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:637: KEYWORD_21
                {
                mKEYWORD_21(); 

                }
                break;
            case 59 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:648: KEYWORD_1
                {
                mKEYWORD_1(); 

                }
                break;
            case 60 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:658: KEYWORD_2
                {
                mKEYWORD_2(); 

                }
                break;
            case 61 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:668: KEYWORD_3
                {
                mKEYWORD_3(); 

                }
                break;
            case 62 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:678: KEYWORD_4
                {
                mKEYWORD_4(); 

                }
                break;
            case 63 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:688: KEYWORD_5
                {
                mKEYWORD_5(); 

                }
                break;
            case 64 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:698: KEYWORD_6
                {
                mKEYWORD_6(); 

                }
                break;
            case 65 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:708: KEYWORD_7
                {
                mKEYWORD_7(); 

                }
                break;
            case 66 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:718: KEYWORD_8
                {
                mKEYWORD_8(); 

                }
                break;
            case 67 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:728: KEYWORD_9
                {
                mKEYWORD_9(); 

                }
                break;
            case 68 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:738: KEYWORD_10
                {
                mKEYWORD_10(); 

                }
                break;
            case 69 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:749: KEYWORD_11
                {
                mKEYWORD_11(); 

                }
                break;
            case 70 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:760: KEYWORD_12
                {
                mKEYWORD_12(); 

                }
                break;
            case 71 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:771: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 72 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:779: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 73 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:788: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 74 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:800: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 75 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:816: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 76 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:832: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 77 :
                // ../org.nightlabs.vestigo.xtext.jpql.ui/src-gen/org/nightlabs/vestigo/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:840: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\22\50\1\123\1\125\7\uffff\1\137\2\uffff\1\45\2\uffff\2"+
        "\45\2\uffff\2\50\1\uffff\10\50\1\163\17\50\1\u0087\1\u0088\1\u008a"+
        "\1\50\1\u008c\11\50\1\u0098\1\50\24\uffff\4\50\1\u009e\1\50\1\u00a0"+
        "\7\50\1\uffff\11\50\1\u00b1\1\u00b2\1\u00b3\7\50\2\uffff\1\50\1"+
        "\uffff\1\50\1\uffff\3\50\1\u00c0\1\u00c1\1\50\1\u00c3\1\u00c4\1"+
        "\u00c5\1\u00c6\1\u00c7\1\uffff\1\u00c8\4\50\1\uffff\1\50\1\uffff"+
        "\1\u00ce\1\u00cf\1\u00d0\2\50\1\u00d3\5\50\1\u00d9\2\50\1\u00dc"+
        "\1\50\3\uffff\4\50\1\u00e2\5\50\1\u00e8\1\u00e9\2\uffff\1\u00ea"+
        "\6\uffff\2\50\1\u00ed\2\50\3\uffff\2\50\1\uffff\2\50\1\u00f4\2\50"+
        "\1\uffff\1\50\1\u00f8\1\uffff\2\50\1\u00fb\1\u00fc\1\u00fd\1\uffff"+
        "\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102\3\uffff\1\50\1\u0104\1"+
        "\uffff\1\50\1\u0106\1\50\1\u0108\1\50\1\u010a\1\uffff\1\u010b\1"+
        "\u010c\1\u010d\1\uffff\1\u010e\1\u010f\10\uffff\1\50\1\uffff\1\50"+
        "\1\uffff\1\50\1\uffff\1\u0113\6\uffff\2\50\1\u0117\1\uffff\2\50"+
        "\1\u011a\1\uffff\2\50\1\uffff\2\50\1\u0120\1\u0121\1\50\2\uffff"+
        "\3\50\1\u0126\1\uffff";
    static final String DFA12_eofS =
        "\u0127\uffff";
    static final String DFA12_minS =
        "\1\0\1\117\3\105\1\115\1\101\1\105\1\101\1\120\1\101\1\122\1\116"+
        "\1\106\1\110\1\117\1\105\1\122\1\102\2\75\7\uffff\1\52\2\uffff\1"+
        "\101\2\uffff\2\0\2\uffff\1\122\1\116\1\uffff\1\102\1\114\1\132\1"+
        "\115\1\122\1\123\1\114\1\124\1\60\1\111\1\120\1\126\1\106\1\103"+
        "\1\113\1\115\1\130\1\116\2\104\1\114\1\124\2\117\3\60\1\124\1\60"+
        "\1\105\1\111\1\114\1\127\1\124\1\125\1\123\1\114\1\104\1\60\1\107"+
        "\24\uffff\1\122\1\103\1\116\1\123\1\60\1\105\1\60\2\105\2\124\1"+
        "\105\1\103\1\127\1\uffff\1\123\1\124\1\111\1\107\1\124\1\101\2\105"+
        "\1\102\3\60\1\101\1\105\1\123\1\103\1\115\1\125\1\105\2\uffff\1"+
        "\105\1\uffff\1\105\1\uffff\1\122\1\116\1\114\2\60\1\105\5\60\1\uffff"+
        "\1\60\1\105\1\101\2\124\1\uffff\1\103\1\uffff\3\60\1\111\1\124\1"+
        "\60\1\105\1\124\1\131\1\116\1\124\1\60\1\124\1\122\1\60\1\105\3"+
        "\uffff\1\124\1\122\1\105\1\110\1\60\1\120\3\122\1\105\2\60\2\uffff"+
        "\1\60\6\uffff\1\116\1\124\1\60\1\122\1\124\3\uffff\1\116\1\105\1"+
        "\uffff\1\105\1\123\1\60\1\107\1\110\1\uffff\1\105\1\60\1\uffff\1"+
        "\122\1\105\3\60\1\uffff\5\60\3\uffff\1\124\1\60\1\uffff\1\111\1"+
        "\60\1\103\1\60\1\116\1\60\1\uffff\3\60\1\uffff\2\60\10\uffff\1\137"+
        "\1\uffff\1\116\1\uffff\1\124\1\uffff\1\60\6\uffff\1\104\1\107\1"+
        "\60\1\uffff\1\111\1\101\1\60\1\uffff\1\115\1\124\1\uffff\2\105\2"+
        "\60\1\124\2\uffff\1\101\1\115\1\120\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\2\165\1\151\1\171\1\170\1\141\2\157\1\160\2\162\1\163\1"+
        "\165\1\150\1\157\1\165\1\162\1\166\1\76\1\75\7\uffff\1\57\2\uffff"+
        "\1\172\2\uffff\2\uffff\2\uffff\1\162\1\165\1\uffff\1\155\1\164\1"+
        "\172\1\155\1\162\2\163\1\164\1\172\1\151\1\160\1\166\1\156\1\167"+
        "\1\153\1\155\1\170\1\156\1\144\1\160\1\154\1\164\2\157\3\172\1\164"+
        "\1\172\1\145\1\151\1\154\1\167\1\164\1\165\1\163\1\154\1\171\1\172"+
        "\1\147\24\uffff\1\162\1\143\1\156\1\163\1\172\1\145\1\172\2\145"+
        "\2\164\1\145\1\143\1\167\1\uffff\1\163\1\164\1\151\1\147\1\164\1"+
        "\141\2\145\1\142\3\172\1\141\1\145\1\163\1\143\1\155\1\165\1\145"+
        "\2\uffff\1\145\1\uffff\1\145\1\uffff\1\162\1\156\1\154\2\172\1\145"+
        "\5\172\1\uffff\1\172\1\145\1\141\2\164\1\uffff\1\143\1\uffff\3\172"+
        "\1\151\1\164\1\172\1\145\1\164\1\171\1\156\1\164\1\172\1\164\1\162"+
        "\1\172\1\145\3\uffff\1\164\1\162\1\145\1\150\1\172\1\160\3\162\1"+
        "\145\2\172\2\uffff\1\172\6\uffff\1\156\1\164\1\172\1\162\1\164\3"+
        "\uffff\1\156\1\145\1\uffff\1\145\1\163\1\172\1\147\1\150\1\uffff"+
        "\1\145\1\172\1\uffff\1\162\1\145\3\172\1\uffff\5\172\3\uffff\1\164"+
        "\1\172\1\uffff\1\151\1\172\1\143\1\172\1\156\1\172\1\uffff\3\172"+
        "\1\uffff\2\172\10\uffff\1\137\1\uffff\1\156\1\uffff\1\164\1\uffff"+
        "\1\172\6\uffff\1\164\1\147\1\172\1\uffff\1\151\1\141\1\172\1\uffff"+
        "\1\155\1\164\1\uffff\2\145\2\172\1\164\2\uffff\1\141\1\155\1\160"+
        "\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\25\uffff\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\uffff\1\103\1\105"+
        "\1\uffff\1\107\1\110\2\uffff\1\114\1\115\2\uffff\1\107\50\uffff"+
        "\1\62\1\63\1\104\1\64\1\106\1\73\1\74\1\75\1\76\1\77\1\100\1\101"+
        "\1\112\1\113\1\102\1\103\1\105\1\110\1\111\1\114\16\uffff\1\66\23"+
        "\uffff\1\67\1\70\1\uffff\1\72\1\uffff\1\71\13\uffff\1\65\5\uffff"+
        "\1\61\1\uffff\1\60\20\uffff\1\53\1\54\1\55\14\uffff\1\56\1\57\1"+
        "\uffff\1\45\1\46\1\47\1\50\1\51\1\52\5\uffff\1\41\1\42\1\43\2\uffff"+
        "\1\33\5\uffff\1\36\2\uffff\1\37\5\uffff\1\34\5\uffff\1\35\1\40\1"+
        "\44\2\uffff\1\20\6\uffff\1\21\3\uffff\1\26\2\uffff\1\31\1\22\1\23"+
        "\1\24\1\25\1\27\1\30\1\32\1\uffff\1\7\1\uffff\1\16\1\uffff\1\10"+
        "\1\uffff\1\11\1\12\1\13\1\14\1\15\1\17\3\uffff\1\6\3\uffff\1\5\2"+
        "\uffff\1\4\5\uffff\1\3\1\2\4\uffff\1\1";
    static final String DFA12_specialS =
        "\1\1\41\uffff\1\0\1\2\u0103\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\45\2\44\2\45\1\44\22\45\1\44\1\45\1\42\4\45\1\43\1\25\1"+
            "\26\1\27\1\30\1\31\1\32\1\33\1\34\12\41\1\35\1\45\1\23\1\36"+
            "\1\24\2\45\1\22\1\4\1\1\1\3\1\5\1\12\1\13\1\6\1\14\1\17\1\40"+
            "\1\7\1\10\1\20\1\15\3\40\1\2\1\21\1\11\1\40\1\16\3\40\3\45\1"+
            "\37\1\40\1\45\1\22\1\4\1\1\1\3\1\5\1\12\1\13\1\6\1\14\1\17\1"+
            "\40\1\7\1\10\1\20\1\15\3\40\1\2\1\21\1\11\1\40\1\16\3\40\uff85"+
            "\45",
            "\1\47\5\uffff\1\46\31\uffff\1\47\5\uffff\1\46",
            "\1\52\3\uffff\1\53\5\uffff\1\54\1\uffff\1\55\3\uffff\1\51\17"+
            "\uffff\1\52\3\uffff\1\53\5\uffff\1\54\1\uffff\1\55\3\uffff\1"+
            "\51",
            "\1\57\3\uffff\1\56\33\uffff\1\57\3\uffff\1\56",
            "\1\60\23\uffff\1\61\13\uffff\1\60\23\uffff\1\61",
            "\1\63\12\uffff\1\62\24\uffff\1\63\12\uffff\1\62",
            "\1\64\37\uffff\1\64",
            "\1\65\3\uffff\1\67\5\uffff\1\66\25\uffff\1\65\3\uffff\1\67"+
            "\5\uffff\1\66",
            "\1\71\3\uffff\1\70\3\uffff\1\72\5\uffff\1\73\21\uffff\1\71"+
            "\3\uffff\1\70\3\uffff\1\72\5\uffff\1\73",
            "\1\74\37\uffff\1\74",
            "\1\75\3\uffff\1\76\14\uffff\1\77\16\uffff\1\75\3\uffff\1\76"+
            "\14\uffff\1\77",
            "\1\100\37\uffff\1\100",
            "\1\101\4\uffff\1\102\32\uffff\1\101\4\uffff\1\102",
            "\1\105\13\uffff\1\103\2\uffff\1\104\20\uffff\1\105\13\uffff"+
            "\1\103\2\uffff\1\104",
            "\1\106\37\uffff\1\106",
            "\1\107\37\uffff\1\107",
            "\1\111\11\uffff\1\112\5\uffff\1\110\17\uffff\1\111\11\uffff"+
            "\1\112\5\uffff\1\110",
            "\1\113\37\uffff\1\113",
            "\1\114\11\uffff\1\115\1\uffff\1\116\4\uffff\1\117\2\uffff\1"+
            "\120\13\uffff\1\114\11\uffff\1\115\1\uffff\1\116\4\uffff\1\117"+
            "\2\uffff\1\120",
            "\1\121\1\122",
            "\1\124",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\135\4\uffff\1\136",
            "",
            "",
            "\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\0\143",
            "\0\143",
            "",
            "",
            "\1\145\37\uffff\1\145",
            "\1\146\6\uffff\1\147\30\uffff\1\146\6\uffff\1\147",
            "",
            "\1\150\12\uffff\1\151\24\uffff\1\150\12\uffff\1\151",
            "\1\152\7\uffff\1\153\27\uffff\1\152\7\uffff\1\153",
            "\1\154\37\uffff\1\154",
            "\1\155\37\uffff\1\155",
            "\1\156\37\uffff\1\156",
            "\1\157\37\uffff\1\157",
            "\1\160\6\uffff\1\161\30\uffff\1\160\6\uffff\1\161",
            "\1\162\37\uffff\1\162",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\164\37\uffff\1\164",
            "\1\165\37\uffff\1\165",
            "\1\166\37\uffff\1\166",
            "\1\170\7\uffff\1\167\27\uffff\1\170\7\uffff\1\167",
            "\1\171\23\uffff\1\172\13\uffff\1\171\23\uffff\1\172",
            "\1\173\37\uffff\1\173",
            "\1\174\37\uffff\1\174",
            "\1\175\37\uffff\1\175",
            "\1\176\37\uffff\1\176",
            "\1\177\37\uffff\1\177",
            "\1\u0080\13\uffff\1\u0081\23\uffff\1\u0080\13\uffff\1\u0081",
            "\1\u0082\37\uffff\1\u0082",
            "\1\u0083\37\uffff\1\u0083",
            "\1\u0084\37\uffff\1\u0084",
            "\1\u0085\37\uffff\1\u0085",
            "\12\50\7\uffff\15\50\1\u0086\14\50\4\uffff\1\50\1\uffff\15"+
            "\50\1\u0086\14\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\3\50\1\u0089\26\50\4\uffff\1\50\1\uffff\3\50"+
            "\1\u0089\26\50",
            "\1\u008b\37\uffff\1\u008b",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u008d\37\uffff\1\u008d",
            "\1\u008e\37\uffff\1\u008e",
            "\1\u008f\37\uffff\1\u008f",
            "\1\u0090\37\uffff\1\u0090",
            "\1\u0091\37\uffff\1\u0091",
            "\1\u0092\37\uffff\1\u0092",
            "\1\u0093\37\uffff\1\u0093",
            "\1\u0094\37\uffff\1\u0094",
            "\1\u0095\24\uffff\1\u0096\12\uffff\1\u0095\24\uffff\1\u0096",
            "\12\50\7\uffff\2\50\1\u0097\27\50\4\uffff\1\50\1\uffff\2\50"+
            "\1\u0097\27\50",
            "\1\u0099\37\uffff\1\u0099",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009a\37\uffff\1\u009a",
            "\1\u009b\37\uffff\1\u009b",
            "\1\u009c\37\uffff\1\u009c",
            "\1\u009d\37\uffff\1\u009d",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u009f\37\uffff\1\u009f",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a1\37\uffff\1\u00a1",
            "\1\u00a2\37\uffff\1\u00a2",
            "\1\u00a3\37\uffff\1\u00a3",
            "\1\u00a4\37\uffff\1\u00a4",
            "\1\u00a5\37\uffff\1\u00a5",
            "\1\u00a6\37\uffff\1\u00a6",
            "\1\u00a7\37\uffff\1\u00a7",
            "",
            "\1\u00a8\37\uffff\1\u00a8",
            "\1\u00a9\37\uffff\1\u00a9",
            "\1\u00aa\37\uffff\1\u00aa",
            "\1\u00ab\37\uffff\1\u00ab",
            "\1\u00ac\37\uffff\1\u00ac",
            "\1\u00ad\37\uffff\1\u00ad",
            "\1\u00ae\37\uffff\1\u00ae",
            "\1\u00af\37\uffff\1\u00af",
            "\1\u00b0\37\uffff\1\u00b0",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00b4\37\uffff\1\u00b4",
            "\1\u00b5\37\uffff\1\u00b5",
            "\1\u00b6\37\uffff\1\u00b6",
            "\1\u00b7\37\uffff\1\u00b7",
            "\1\u00b8\37\uffff\1\u00b8",
            "\1\u00b9\37\uffff\1\u00b9",
            "\1\u00ba\37\uffff\1\u00ba",
            "",
            "",
            "\1\u00bb\37\uffff\1\u00bb",
            "",
            "\1\u00bc\37\uffff\1\u00bc",
            "",
            "\1\u00bd\37\uffff\1\u00bd",
            "\1\u00be\37\uffff\1\u00be",
            "\1\u00bf\37\uffff\1\u00bf",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00c2\37\uffff\1\u00c2",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00c9\37\uffff\1\u00c9",
            "\1\u00ca\37\uffff\1\u00ca",
            "\1\u00cb\37\uffff\1\u00cb",
            "\1\u00cc\37\uffff\1\u00cc",
            "",
            "\1\u00cd\37\uffff\1\u00cd",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d1\37\uffff\1\u00d1",
            "\1\u00d2\37\uffff\1\u00d2",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d4\37\uffff\1\u00d4",
            "\1\u00d5\37\uffff\1\u00d5",
            "\1\u00d6\37\uffff\1\u00d6",
            "\1\u00d7\37\uffff\1\u00d7",
            "\1\u00d8\37\uffff\1\u00d8",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00da\37\uffff\1\u00da",
            "\1\u00db\37\uffff\1\u00db",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00dd\37\uffff\1\u00dd",
            "",
            "",
            "",
            "\1\u00de\37\uffff\1\u00de",
            "\1\u00df\37\uffff\1\u00df",
            "\1\u00e0\37\uffff\1\u00e0",
            "\1\u00e1\37\uffff\1\u00e1",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00e3\37\uffff\1\u00e3",
            "\1\u00e4\37\uffff\1\u00e4",
            "\1\u00e5\37\uffff\1\u00e5",
            "\1\u00e6\37\uffff\1\u00e6",
            "\1\u00e7\37\uffff\1\u00e7",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00eb\37\uffff\1\u00eb",
            "\1\u00ec\37\uffff\1\u00ec",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ee\37\uffff\1\u00ee",
            "\1\u00ef\37\uffff\1\u00ef",
            "",
            "",
            "",
            "\1\u00f0\37\uffff\1\u00f0",
            "\1\u00f1\37\uffff\1\u00f1",
            "",
            "\1\u00f2\37\uffff\1\u00f2",
            "\1\u00f3\37\uffff\1\u00f3",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00f5\37\uffff\1\u00f5",
            "\1\u00f6\37\uffff\1\u00f6",
            "",
            "\1\u00f7\37\uffff\1\u00f7",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00f9\37\uffff\1\u00f9",
            "\1\u00fa\37\uffff\1\u00fa",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "\1\u0103\37\uffff\1\u0103",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0105\37\uffff\1\u0105",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0107\37\uffff\1\u0107",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0109\37\uffff\1\u0109",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0110",
            "",
            "\1\u0111\37\uffff\1\u0111",
            "",
            "\1\u0112\37\uffff\1\u0112",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0115\17\uffff\1\u0114\17\uffff\1\u0115\17\uffff\1\u0114",
            "\1\u0116\37\uffff\1\u0116",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0118\37\uffff\1\u0118",
            "\1\u0119\37\uffff\1\u0119",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u011b\37\uffff\1\u011b",
            "\1\u011c\37\uffff\1\u011c",
            "",
            "\1\u011d\37\uffff\1\u011d",
            "\1\u011e\37\uffff\1\u011e",
            "\12\50\7\uffff\22\50\1\u011f\7\50\4\uffff\1\50\1\uffff\22\50"+
            "\1\u011f\7\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0122\37\uffff\1\u0122",
            "",
            "",
            "\1\u0123\37\uffff\1\u0123",
            "\1\u0124\37\uffff\1\u0124",
            "\1\u0125\37\uffff\1\u0125",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KEYWORD_70 | KEYWORD_68 | KEYWORD_69 | KEYWORD_67 | KEYWORD_66 | KEYWORD_65 | KEYWORD_56 | KEYWORD_57 | KEYWORD_58 | KEYWORD_59 | KEYWORD_60 | KEYWORD_61 | KEYWORD_62 | KEYWORD_63 | KEYWORD_64 | KEYWORD_45 | KEYWORD_46 | KEYWORD_47 | KEYWORD_48 | KEYWORD_49 | KEYWORD_50 | KEYWORD_51 | KEYWORD_52 | KEYWORD_53 | KEYWORD_54 | KEYWORD_55 | KEYWORD_35 | KEYWORD_36 | KEYWORD_37 | KEYWORD_38 | KEYWORD_39 | KEYWORD_40 | KEYWORD_41 | KEYWORD_42 | KEYWORD_43 | KEYWORD_44 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_33 | KEYWORD_34 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_34 = input.LA(1);

                        s = -1;
                        if ( ((LA12_34>='\u0000' && LA12_34<='\uFFFF')) ) {s = 99;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='C'||LA12_0=='c') ) {s = 1;}

                        else if ( (LA12_0=='S'||LA12_0=='s') ) {s = 2;}

                        else if ( (LA12_0=='D'||LA12_0=='d') ) {s = 3;}

                        else if ( (LA12_0=='B'||LA12_0=='b') ) {s = 4;}

                        else if ( (LA12_0=='E'||LA12_0=='e') ) {s = 5;}

                        else if ( (LA12_0=='H'||LA12_0=='h') ) {s = 6;}

                        else if ( (LA12_0=='L'||LA12_0=='l') ) {s = 7;}

                        else if ( (LA12_0=='M'||LA12_0=='m') ) {s = 8;}

                        else if ( (LA12_0=='U'||LA12_0=='u') ) {s = 9;}

                        else if ( (LA12_0=='F'||LA12_0=='f') ) {s = 10;}

                        else if ( (LA12_0=='G'||LA12_0=='g') ) {s = 11;}

                        else if ( (LA12_0=='I'||LA12_0=='i') ) {s = 12;}

                        else if ( (LA12_0=='O'||LA12_0=='o') ) {s = 13;}

                        else if ( (LA12_0=='W'||LA12_0=='w') ) {s = 14;}

                        else if ( (LA12_0=='J'||LA12_0=='j') ) {s = 15;}

                        else if ( (LA12_0=='N'||LA12_0=='n') ) {s = 16;}

                        else if ( (LA12_0=='T'||LA12_0=='t') ) {s = 17;}

                        else if ( (LA12_0=='A'||LA12_0=='a') ) {s = 18;}

                        else if ( (LA12_0=='<') ) {s = 19;}

                        else if ( (LA12_0=='>') ) {s = 20;}

                        else if ( (LA12_0=='(') ) {s = 21;}

                        else if ( (LA12_0==')') ) {s = 22;}

                        else if ( (LA12_0=='*') ) {s = 23;}

                        else if ( (LA12_0=='+') ) {s = 24;}

                        else if ( (LA12_0==',') ) {s = 25;}

                        else if ( (LA12_0=='-') ) {s = 26;}

                        else if ( (LA12_0=='.') ) {s = 27;}

                        else if ( (LA12_0=='/') ) {s = 28;}

                        else if ( (LA12_0==':') ) {s = 29;}

                        else if ( (LA12_0=='=') ) {s = 30;}

                        else if ( (LA12_0=='^') ) {s = 31;}

                        else if ( (LA12_0=='K'||(LA12_0>='P' && LA12_0<='R')||LA12_0=='V'||(LA12_0>='X' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='k'||(LA12_0>='p' && LA12_0<='r')||LA12_0=='v'||(LA12_0>='x' && LA12_0<='z')) ) {s = 32;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 33;}

                        else if ( (LA12_0=='\"') ) {s = 34;}

                        else if ( (LA12_0=='\'') ) {s = 35;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 36;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||LA12_0==';'||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 37;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_35 = input.LA(1);

                        s = -1;
                        if ( ((LA12_35>='\u0000' && LA12_35<='\uFFFF')) ) {s = 99;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}