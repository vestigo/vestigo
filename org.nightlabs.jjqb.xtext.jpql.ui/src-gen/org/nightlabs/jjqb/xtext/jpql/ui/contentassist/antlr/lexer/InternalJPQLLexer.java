package org.nightlabs.jjqb.xtext.jpql.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJPQLLexer extends Lexer {
    public static final int RULE_ID=76;
    public static final int RULE_ANY_OTHER=82;
    public static final int KEYWORD_56=15;
    public static final int KEYWORD_19=41;
    public static final int KEYWORD_55=14;
    public static final int KEYWORD_17=61;
    public static final int KEYWORD_54=13;
    public static final int KEYWORD_53=12;
    public static final int KEYWORD_18=40;
    public static final int KEYWORD_15=59;
    public static final int KEYWORD_52=11;
    public static final int KEYWORD_16=60;
    public static final int KEYWORD_51=10;
    public static final int KEYWORD_13=57;
    public static final int KEYWORD_50=29;
    public static final int KEYWORD_14=58;
    public static final int KEYWORD_11=55;
    public static final int KEYWORD_12=56;
    public static final int EOF=-1;
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
    public static final int KEYWORD_27=49;
    public static final int KEYWORD_62=8;
    public static final int KEYWORD_20=42;
    public static final int KEYWORD_21=43;
    public static final int KEYWORD_22=44;
    public static final int KEYWORD_23=45;
    public static final int RULE_DATE_LITERAL=70;
    public static final int RULE_TIMESTAMP_LITERAL=72;
    public static final int RULE_LITERALTEMPORAL=73;
    public static final int KEYWORD_1=62;
    public static final int KEYWORD_30=52;
    public static final int KEYWORD_5=66;
    public static final int KEYWORD_34=33;
    public static final int KEYWORD_4=65;
    public static final int KEYWORD_33=32;
    public static final int KEYWORD_3=64;
    public static final int KEYWORD_32=31;
    public static final int KEYWORD_2=63;
    public static final int KEYWORD_31=30;
    public static final int KEYWORD_38=37;
    public static final int RULE_SL_COMMENT=80;
    public static final int KEYWORD_37=36;
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
    public static final int RULE_WS=81;
    public static final int KEYWORD_47=26;
    public static final int KEYWORD_46=25;
    public static final int KEYWORD_49=28;
    public static final int KEYWORD_48=27;

    // delegates
    // delegators

    public InternalJPQLLexer() {;} 
    public InternalJPQLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJPQLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g"; }

    // $ANTLR start "KEYWORD_66"
    public final void mKEYWORD_66() throws RecognitionException {
        try {
            int _type = KEYWORD_66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:19:12: ( ( 'C' | 'c' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) '_' ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'P' | 'p' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:19:14: ( 'C' | 'c' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) '_' ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'P' | 'p' )
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
    // $ANTLR end "KEYWORD_66"

    // $ANTLR start "KEYWORD_64"
    public final void mKEYWORD_64() throws RecognitionException {
        try {
            int _type = KEYWORD_64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:21:12: ( ( 'C' | 'c' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) '_' ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:21:14: ( 'C' | 'c' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) '_' ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
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
    // $ANTLR end "KEYWORD_64"

    // $ANTLR start "KEYWORD_65"
    public final void mKEYWORD_65() throws RecognitionException {
        try {
            int _type = KEYWORD_65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:23:12: ( ( 'C' | 'c' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) '_' ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:23:14: ( 'C' | 'c' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) '_' ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' )
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
    // $ANTLR end "KEYWORD_65"

    // $ANTLR start "KEYWORD_63"
    public final void mKEYWORD_63() throws RecognitionException {
        try {
            int _type = KEYWORD_63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:25:12: ( ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:25:14: ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
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
    // $ANTLR end "KEYWORD_63"

    // $ANTLR start "KEYWORD_62"
    public final void mKEYWORD_62() throws RecognitionException {
        try {
            int _type = KEYWORD_62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:27:12: ( ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:27:14: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' )
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
    // $ANTLR end "KEYWORD_62"

    // $ANTLR start "KEYWORD_61"
    public final void mKEYWORD_61() throws RecognitionException {
        try {
            int _type = KEYWORD_61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:29:12: ( ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'W' | 'w' ) ( 'E' | 'e' ) ( 'E' | 'e' ) ( 'N' | 'n' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:29:14: ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'W' | 'w' ) ( 'E' | 'e' ) ( 'E' | 'e' ) ( 'N' | 'n' )
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
    // $ANTLR end "KEYWORD_61"

    // $ANTLR start "KEYWORD_51"
    public final void mKEYWORD_51() throws RecognitionException {
        try {
            int _type = KEYWORD_51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:31:12: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'T' | 't' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:31:14: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'T' | 't' )
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
    // $ANTLR end "KEYWORD_51"

    // $ANTLR start "KEYWORD_52"
    public final void mKEYWORD_52() throws RecognitionException {
        try {
            int _type = KEYWORD_52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:33:12: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:33:14: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' )
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
    // $ANTLR end "KEYWORD_52"

    // $ANTLR start "KEYWORD_53"
    public final void mKEYWORD_53() throws RecognitionException {
        try {
            int _type = KEYWORD_53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:35:12: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'S' | 's' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:35:14: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'S' | 's' )
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
    // $ANTLR end "KEYWORD_53"

    // $ANTLR start "KEYWORD_54"
    public final void mKEYWORD_54() throws RecognitionException {
        try {
            int _type = KEYWORD_54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:37:12: ( ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:37:14: ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
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
    // $ANTLR end "KEYWORD_54"

    // $ANTLR start "KEYWORD_55"
    public final void mKEYWORD_55() throws RecognitionException {
        try {
            int _type = KEYWORD_55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:39:12: ( ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:39:14: ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' )
            {
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

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
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
    // $ANTLR end "KEYWORD_55"

    // $ANTLR start "KEYWORD_56"
    public final void mKEYWORD_56() throws RecognitionException {
        try {
            int _type = KEYWORD_56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:41:12: ( ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'T' | 't' ) ( 'H' | 'h' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:41:14: ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'T' | 't' ) ( 'H' | 'h' )
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
    // $ANTLR end "KEYWORD_56"

    // $ANTLR start "KEYWORD_57"
    public final void mKEYWORD_57() throws RecognitionException {
        try {
            int _type = KEYWORD_57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:43:12: ( ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:43:14: ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
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
    // $ANTLR end "KEYWORD_57"

    // $ANTLR start "KEYWORD_58"
    public final void mKEYWORD_58() throws RecognitionException {
        try {
            int _type = KEYWORD_58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:45:12: ( ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:45:14: ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'R' | 'r' )
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
    // $ANTLR end "KEYWORD_58"

    // $ANTLR start "KEYWORD_59"
    public final void mKEYWORD_59() throws RecognitionException {
        try {
            int _type = KEYWORD_59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:47:12: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:47:14: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
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
    // $ANTLR end "KEYWORD_59"

    // $ANTLR start "KEYWORD_60"
    public final void mKEYWORD_60() throws RecognitionException {
        try {
            int _type = KEYWORD_60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:49:12: ( ( 'U' | 'u' ) ( 'P' | 'p' ) ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:49:14: ( 'U' | 'u' ) ( 'P' | 'p' ) ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
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
    // $ANTLR end "KEYWORD_60"

    // $ANTLR start "KEYWORD_41"
    public final void mKEYWORD_41() throws RecognitionException {
        try {
            int _type = KEYWORD_41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:51:12: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:51:14: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'T' | 't' )
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
    // $ANTLR end "KEYWORD_41"

    // $ANTLR start "KEYWORD_42"
    public final void mKEYWORD_42() throws RecognitionException {
        try {
            int _type = KEYWORD_42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:53:12: ( ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'Y' | 'y' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:53:14: ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'Y' | 'y' )
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
    // $ANTLR end "KEYWORD_42"

    // $ANTLR start "KEYWORD_43"
    public final void mKEYWORD_43() throws RecognitionException {
        try {
            int _type = KEYWORD_43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:55:12: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:55:14: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
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
    // $ANTLR end "KEYWORD_43"

    // $ANTLR start "KEYWORD_44"
    public final void mKEYWORD_44() throws RecognitionException {
        try {
            int _type = KEYWORD_44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:57:12: ( ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:57:14: ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' )
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
    // $ANTLR end "KEYWORD_44"

    // $ANTLR start "KEYWORD_45"
    public final void mKEYWORD_45() throws RecognitionException {
        try {
            int _type = KEYWORD_45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:59:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:59:14: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' )
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
    // $ANTLR end "KEYWORD_45"

    // $ANTLR start "KEYWORD_46"
    public final void mKEYWORD_46() throws RecognitionException {
        try {
            int _type = KEYWORD_46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:61:12: ( ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'W' | 'w' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:61:14: ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'W' | 'w' ) ( 'E' | 'e' ) ( 'R' | 'r' )
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
    // $ANTLR end "KEYWORD_46"

    // $ANTLR start "KEYWORD_47"
    public final void mKEYWORD_47() throws RecognitionException {
        try {
            int _type = KEYWORD_47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:63:12: ( ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:63:14: ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' )
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
    // $ANTLR end "KEYWORD_47"

    // $ANTLR start "KEYWORD_48"
    public final void mKEYWORD_48() throws RecognitionException {
        try {
            int _type = KEYWORD_48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:65:12: ( ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:65:14: ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' )
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
    // $ANTLR end "KEYWORD_48"

    // $ANTLR start "KEYWORD_49"
    public final void mKEYWORD_49() throws RecognitionException {
        try {
            int _type = KEYWORD_49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:67:12: ( ( 'U' | 'u' ) ( 'P' | 'p' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:67:14: ( 'U' | 'u' ) ( 'P' | 'p' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' )
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
    // $ANTLR end "KEYWORD_49"

    // $ANTLR start "KEYWORD_50"
    public final void mKEYWORD_50() throws RecognitionException {
        try {
            int _type = KEYWORD_50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:69:12: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:69:14: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' )
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
    // $ANTLR end "KEYWORD_50"

    // $ANTLR start "KEYWORD_31"
    public final void mKEYWORD_31() throws RecognitionException {
        try {
            int _type = KEYWORD_31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:71:12: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:71:14: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' )
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
    // $ANTLR end "KEYWORD_31"

    // $ANTLR start "KEYWORD_32"
    public final void mKEYWORD_32() throws RecognitionException {
        try {
            int _type = KEYWORD_32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:73:12: ( ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:73:14: ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' )
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
    // $ANTLR end "KEYWORD_32"

    // $ANTLR start "KEYWORD_33"
    public final void mKEYWORD_33() throws RecognitionException {
        try {
            int _type = KEYWORD_33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:75:12: ( ( 'J' | 'j' ) ( 'O' | 'o' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:75:14: ( 'J' | 'j' ) ( 'O' | 'o' ) ( 'I' | 'i' ) ( 'N' | 'n' )
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
    // $ANTLR end "KEYWORD_33"

    // $ANTLR start "KEYWORD_34"
    public final void mKEYWORD_34() throws RecognitionException {
        try {
            int _type = KEYWORD_34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:77:12: ( ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'T' | 't' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:77:14: ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'T' | 't' )
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
    // $ANTLR end "KEYWORD_34"

    // $ANTLR start "KEYWORD_35"
    public final void mKEYWORD_35() throws RecognitionException {
        try {
            int _type = KEYWORD_35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:79:12: ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'K' | 'k' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:79:14: ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'K' | 'k' ) ( 'E' | 'e' )
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
    // $ANTLR end "KEYWORD_35"

    // $ANTLR start "KEYWORD_36"
    public final void mKEYWORD_36() throws RecognitionException {
        try {
            int _type = KEYWORD_36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:81:12: ( ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:81:14: ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' )
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
    // $ANTLR end "KEYWORD_36"

    // $ANTLR start "KEYWORD_37"
    public final void mKEYWORD_37() throws RecognitionException {
        try {
            int _type = KEYWORD_37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:83:12: ( ( 'S' | 's' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:83:14: ( 'S' | 's' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'E' | 'e' )
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
    // $ANTLR end "KEYWORD_37"

    // $ANTLR start "KEYWORD_38"
    public final void mKEYWORD_38() throws RecognitionException {
        try {
            int _type = KEYWORD_38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:85:12: ( ( 'S' | 's' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:85:14: ( 'S' | 's' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'E' | 'e' )
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
    // $ANTLR end "KEYWORD_38"

    // $ANTLR start "KEYWORD_39"
    public final void mKEYWORD_39() throws RecognitionException {
        try {
            int _type = KEYWORD_39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:87:12: ( ( 'S' | 's' ) ( 'Q' | 'q' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:87:14: ( 'S' | 's' ) ( 'Q' | 'q' ) ( 'R' | 'r' ) ( 'T' | 't' )
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
    // $ANTLR end "KEYWORD_39"

    // $ANTLR start "KEYWORD_40"
    public final void mKEYWORD_40() throws RecognitionException {
        try {
            int _type = KEYWORD_40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:89:12: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:89:14: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )
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
    // $ANTLR end "KEYWORD_40"

    // $ANTLR start "KEYWORD_18"
    public final void mKEYWORD_18() throws RecognitionException {
        try {
            int _type = KEYWORD_18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:91:12: ( ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'S' | 's' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:91:14: ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'S' | 's' )
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
    // $ANTLR end "KEYWORD_18"

    // $ANTLR start "KEYWORD_19"
    public final void mKEYWORD_19() throws RecognitionException {
        try {
            int _type = KEYWORD_19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:93:12: ( ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:93:14: ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' )
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
    // $ANTLR end "KEYWORD_19"

    // $ANTLR start "KEYWORD_20"
    public final void mKEYWORD_20() throws RecognitionException {
        try {
            int _type = KEYWORD_20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:95:12: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:95:14: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
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
    // $ANTLR end "KEYWORD_20"

    // $ANTLR start "KEYWORD_21"
    public final void mKEYWORD_21() throws RecognitionException {
        try {
            int _type = KEYWORD_21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:97:12: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'Y' | 'y' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:97:14: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'Y' | 'y' )
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
    // $ANTLR end "KEYWORD_21"

    // $ANTLR start "KEYWORD_22"
    public final void mKEYWORD_22() throws RecognitionException {
        try {
            int _type = KEYWORD_22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:99:12: ( ( 'A' | 'a' ) ( 'S' | 's' ) ( 'C' | 'c' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:99:14: ( 'A' | 'a' ) ( 'S' | 's' ) ( 'C' | 'c' )
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
    // $ANTLR end "KEYWORD_22"

    // $ANTLR start "KEYWORD_23"
    public final void mKEYWORD_23() throws RecognitionException {
        try {
            int _type = KEYWORD_23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:101:12: ( ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'G' | 'g' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:101:14: ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'G' | 'g' )
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
    // $ANTLR end "KEYWORD_23"

    // $ANTLR start "KEYWORD_24"
    public final void mKEYWORD_24() throws RecognitionException {
        try {
            int _type = KEYWORD_24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:103:12: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'X' | 'x' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:103:14: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'X' | 'x' )
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
    // $ANTLR end "KEYWORD_24"

    // $ANTLR start "KEYWORD_25"
    public final void mKEYWORD_25() throws RecognitionException {
        try {
            int _type = KEYWORD_25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:105:12: ( ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:105:14: ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' )
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
    // $ANTLR end "KEYWORD_25"

    // $ANTLR start "KEYWORD_26"
    public final void mKEYWORD_26() throws RecognitionException {
        try {
            int _type = KEYWORD_26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:107:12: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:107:14: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' )
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
    // $ANTLR end "KEYWORD_26"

    // $ANTLR start "KEYWORD_27"
    public final void mKEYWORD_27() throws RecognitionException {
        try {
            int _type = KEYWORD_27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:109:12: ( ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'W' | 'w' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:109:14: ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'W' | 'w' )
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
    // $ANTLR end "KEYWORD_27"

    // $ANTLR start "KEYWORD_28"
    public final void mKEYWORD_28() throws RecognitionException {
        try {
            int _type = KEYWORD_28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:111:12: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:111:14: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' )
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
    // $ANTLR end "KEYWORD_28"

    // $ANTLR start "KEYWORD_29"
    public final void mKEYWORD_29() throws RecognitionException {
        try {
            int _type = KEYWORD_29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:113:12: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:113:14: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' )
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
    // $ANTLR end "KEYWORD_29"

    // $ANTLR start "KEYWORD_30"
    public final void mKEYWORD_30() throws RecognitionException {
        try {
            int _type = KEYWORD_30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:115:12: ( ( 'S' | 's' ) ( 'U' | 'u' ) ( 'M' | 'm' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:115:14: ( 'S' | 's' ) ( 'U' | 'u' ) ( 'M' | 'm' )
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
    // $ANTLR end "KEYWORD_30"

    // $ANTLR start "KEYWORD_9"
    public final void mKEYWORD_9() throws RecognitionException {
        try {
            int _type = KEYWORD_9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:117:11: ( '!' '=' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:117:13: '!' '='
            {
            match('!'); 
            match('='); 

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
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:119:12: ( '<' '=' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:119:14: '<' '='
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
    // $ANTLR end "KEYWORD_10"

    // $ANTLR start "KEYWORD_11"
    public final void mKEYWORD_11() throws RecognitionException {
        try {
            int _type = KEYWORD_11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:121:12: ( '>' '=' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:121:14: '>' '='
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
    // $ANTLR end "KEYWORD_11"

    // $ANTLR start "KEYWORD_12"
    public final void mKEYWORD_12() throws RecognitionException {
        try {
            int _type = KEYWORD_12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:123:12: ( ( 'A' | 'a' ) ( 'S' | 's' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:123:14: ( 'A' | 'a' ) ( 'S' | 's' )
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
    // $ANTLR end "KEYWORD_12"

    // $ANTLR start "KEYWORD_13"
    public final void mKEYWORD_13() throws RecognitionException {
        try {
            int _type = KEYWORD_13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:125:12: ( ( 'B' | 'b' ) ( 'Y' | 'y' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:125:14: ( 'B' | 'b' ) ( 'Y' | 'y' )
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
    // $ANTLR end "KEYWORD_13"

    // $ANTLR start "KEYWORD_14"
    public final void mKEYWORD_14() throws RecognitionException {
        try {
            int _type = KEYWORD_14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:127:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:127:14: ( 'I' | 'i' ) ( 'N' | 'n' )
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
    // $ANTLR end "KEYWORD_14"

    // $ANTLR start "KEYWORD_15"
    public final void mKEYWORD_15() throws RecognitionException {
        try {
            int _type = KEYWORD_15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:129:12: ( ( 'I' | 'i' ) ( 'S' | 's' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:129:14: ( 'I' | 'i' ) ( 'S' | 's' )
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
    // $ANTLR end "KEYWORD_15"

    // $ANTLR start "KEYWORD_16"
    public final void mKEYWORD_16() throws RecognitionException {
        try {
            int _type = KEYWORD_16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:131:12: ( ( 'O' | 'o' ) ( 'F' | 'f' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:131:14: ( 'O' | 'o' ) ( 'F' | 'f' )
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
    // $ANTLR end "KEYWORD_16"

    // $ANTLR start "KEYWORD_17"
    public final void mKEYWORD_17() throws RecognitionException {
        try {
            int _type = KEYWORD_17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:133:12: ( ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:133:14: ( 'O' | 'o' ) ( 'R' | 'r' )
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
    // $ANTLR end "KEYWORD_17"

    // $ANTLR start "KEYWORD_1"
    public final void mKEYWORD_1() throws RecognitionException {
        try {
            int _type = KEYWORD_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:135:11: ( '(' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:135:13: '('
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
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:137:11: ( ')' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:137:13: ')'
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
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:139:11: ( ',' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:139:13: ','
            {
            match(','); 

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
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:141:11: ( '.' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:141:13: '.'
            {
            match('.'); 

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
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:143:11: ( ':' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:143:13: ':'
            {
            match(':'); 

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
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:145:11: ( '<' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:145:13: '<'
            {
            match('<'); 

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
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:147:11: ( '=' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:147:13: '='
            {
            match('='); 

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
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:149:11: ( '>' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:149:13: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_8"

    // $ANTLR start "RULE_LITERALTEMPORAL"
    public final void mRULE_LITERALTEMPORAL() throws RecognitionException {
        try {
            int _type = RULE_LITERALTEMPORAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:153:22: ( ( RULE_DATE_LITERAL | RULE_TIME_LITERAL | RULE_TIMESTAMP_LITERAL ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:153:24: ( RULE_DATE_LITERAL | RULE_TIME_LITERAL | RULE_TIMESTAMP_LITERAL )
            {
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:153:24: ( RULE_DATE_LITERAL | RULE_TIME_LITERAL | RULE_TIMESTAMP_LITERAL )
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
                    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:153:25: RULE_DATE_LITERAL
                    {
                    mRULE_DATE_LITERAL(); 

                    }
                    break;
                case 2 :
                    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:153:43: RULE_TIME_LITERAL
                    {
                    mRULE_TIME_LITERAL(); 

                    }
                    break;
                case 3 :
                    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:153:61: RULE_TIMESTAMP_LITERAL
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
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:155:19: ( '(' 'd' ( ' ' | '\\t' )+ '\\'' RULE_DATE_STRING '\\'' ( ' ' | '\\t' )* ')' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:155:21: '(' 'd' ( ' ' | '\\t' )+ '\\'' RULE_DATE_STRING '\\'' ( ' ' | '\\t' )* ')'
            {
            match('('); 
            match('d'); 
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:155:29: ( ' ' | '\\t' )+
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
            	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:
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
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:155:68: ( ' ' | '\\t' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\t'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:
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
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:157:19: ( '(' 't' ( ' ' | '\\t' )+ '\\'' RULE_TIME_STRING '\\'' ( ' ' | '\\t' )* ')' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:157:21: '(' 't' ( ' ' | '\\t' )+ '\\'' RULE_TIME_STRING '\\'' ( ' ' | '\\t' )* ')'
            {
            match('('); 
            match('t'); 
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:157:29: ( ' ' | '\\t' )+
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
            	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:
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
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:157:68: ( ' ' | '\\t' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\t'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:
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
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:159:24: ( '(' 'ts' ( ' ' | '\\t' )+ '\\'' RULE_DATE_STRING ' ' RULE_TIME_STRING '\\'' ( ' ' | '\\t' )* ')' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:159:26: '(' 'ts' ( ' ' | '\\t' )+ '\\'' RULE_DATE_STRING ' ' RULE_TIME_STRING '\\'' ( ' ' | '\\t' )* ')'
            {
            match('('); 
            match("ts"); 

            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:159:35: ( ' ' | '\\t' )+
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
            	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:
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
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:159:95: ( ' ' | '\\t' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\t'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:
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
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:161:18: ( '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:161:20: '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9'
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
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:163:18: ( '0' .. '9' ( '0' .. '9' )? ':' '0' .. '9' '0' .. '9' ':' '0' .. '9' '0' .. '9' '.' ( '0' .. '9' )* )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:163:20: '0' .. '9' ( '0' .. '9' )? ':' '0' .. '9' '0' .. '9' ':' '0' .. '9' '0' .. '9' '.' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:163:29: ( '0' .. '9' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:163:30: '0' .. '9'
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
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:163:89: ( '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:163:90: '0' .. '9'
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
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:165:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:165:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:165:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:165:11: '^'
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

            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:165:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:
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
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:167:10: ( ( '0' .. '9' )+ )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:167:12: ( '0' .. '9' )+
            {
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:167:12: ( '0' .. '9' )+
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
            	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:167:13: '0' .. '9'
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
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:169:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:169:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:169:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:169:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:169:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:169:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:169:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:169:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:169:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:169:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:169:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:171:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:171:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:171:24: ( options {greedy=false; } : . )*
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
            	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:171:52: .
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
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:173:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:173:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:173:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:173:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:173:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:173:41: ( '\\r' )? '\\n'
                    {
                    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:173:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:173:41: '\\r'
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
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:175:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:175:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:175:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:
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
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:177:16: ( . )
            // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:177:18: .
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
        // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:8: ( KEYWORD_66 | KEYWORD_64 | KEYWORD_65 | KEYWORD_63 | KEYWORD_62 | KEYWORD_61 | KEYWORD_51 | KEYWORD_52 | KEYWORD_53 | KEYWORD_54 | KEYWORD_55 | KEYWORD_56 | KEYWORD_57 | KEYWORD_58 | KEYWORD_59 | KEYWORD_60 | KEYWORD_41 | KEYWORD_42 | KEYWORD_43 | KEYWORD_44 | KEYWORD_45 | KEYWORD_46 | KEYWORD_47 | KEYWORD_48 | KEYWORD_49 | KEYWORD_50 | KEYWORD_31 | KEYWORD_32 | KEYWORD_33 | KEYWORD_34 | KEYWORD_35 | KEYWORD_36 | KEYWORD_37 | KEYWORD_38 | KEYWORD_39 | KEYWORD_40 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | RULE_LITERALTEMPORAL | RULE_DATE_LITERAL | RULE_TIME_LITERAL | RULE_TIMESTAMP_LITERAL | RULE_DATE_STRING | RULE_TIME_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=79;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:10: KEYWORD_66
                {
                mKEYWORD_66(); 

                }
                break;
            case 2 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:21: KEYWORD_64
                {
                mKEYWORD_64(); 

                }
                break;
            case 3 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:32: KEYWORD_65
                {
                mKEYWORD_65(); 

                }
                break;
            case 4 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:43: KEYWORD_63
                {
                mKEYWORD_63(); 

                }
                break;
            case 5 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:54: KEYWORD_62
                {
                mKEYWORD_62(); 

                }
                break;
            case 6 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:65: KEYWORD_61
                {
                mKEYWORD_61(); 

                }
                break;
            case 7 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:76: KEYWORD_51
                {
                mKEYWORD_51(); 

                }
                break;
            case 8 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:87: KEYWORD_52
                {
                mKEYWORD_52(); 

                }
                break;
            case 9 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:98: KEYWORD_53
                {
                mKEYWORD_53(); 

                }
                break;
            case 10 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:109: KEYWORD_54
                {
                mKEYWORD_54(); 

                }
                break;
            case 11 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:120: KEYWORD_55
                {
                mKEYWORD_55(); 

                }
                break;
            case 12 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:131: KEYWORD_56
                {
                mKEYWORD_56(); 

                }
                break;
            case 13 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:142: KEYWORD_57
                {
                mKEYWORD_57(); 

                }
                break;
            case 14 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:153: KEYWORD_58
                {
                mKEYWORD_58(); 

                }
                break;
            case 15 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:164: KEYWORD_59
                {
                mKEYWORD_59(); 

                }
                break;
            case 16 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:175: KEYWORD_60
                {
                mKEYWORD_60(); 

                }
                break;
            case 17 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:186: KEYWORD_41
                {
                mKEYWORD_41(); 

                }
                break;
            case 18 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:197: KEYWORD_42
                {
                mKEYWORD_42(); 

                }
                break;
            case 19 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:208: KEYWORD_43
                {
                mKEYWORD_43(); 

                }
                break;
            case 20 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:219: KEYWORD_44
                {
                mKEYWORD_44(); 

                }
                break;
            case 21 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:230: KEYWORD_45
                {
                mKEYWORD_45(); 

                }
                break;
            case 22 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:241: KEYWORD_46
                {
                mKEYWORD_46(); 

                }
                break;
            case 23 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:252: KEYWORD_47
                {
                mKEYWORD_47(); 

                }
                break;
            case 24 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:263: KEYWORD_48
                {
                mKEYWORD_48(); 

                }
                break;
            case 25 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:274: KEYWORD_49
                {
                mKEYWORD_49(); 

                }
                break;
            case 26 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:285: KEYWORD_50
                {
                mKEYWORD_50(); 

                }
                break;
            case 27 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:296: KEYWORD_31
                {
                mKEYWORD_31(); 

                }
                break;
            case 28 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:307: KEYWORD_32
                {
                mKEYWORD_32(); 

                }
                break;
            case 29 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:318: KEYWORD_33
                {
                mKEYWORD_33(); 

                }
                break;
            case 30 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:329: KEYWORD_34
                {
                mKEYWORD_34(); 

                }
                break;
            case 31 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:340: KEYWORD_35
                {
                mKEYWORD_35(); 

                }
                break;
            case 32 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:351: KEYWORD_36
                {
                mKEYWORD_36(); 

                }
                break;
            case 33 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:362: KEYWORD_37
                {
                mKEYWORD_37(); 

                }
                break;
            case 34 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:373: KEYWORD_38
                {
                mKEYWORD_38(); 

                }
                break;
            case 35 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:384: KEYWORD_39
                {
                mKEYWORD_39(); 

                }
                break;
            case 36 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:395: KEYWORD_40
                {
                mKEYWORD_40(); 

                }
                break;
            case 37 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:406: KEYWORD_18
                {
                mKEYWORD_18(); 

                }
                break;
            case 38 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:417: KEYWORD_19
                {
                mKEYWORD_19(); 

                }
                break;
            case 39 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:428: KEYWORD_20
                {
                mKEYWORD_20(); 

                }
                break;
            case 40 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:439: KEYWORD_21
                {
                mKEYWORD_21(); 

                }
                break;
            case 41 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:450: KEYWORD_22
                {
                mKEYWORD_22(); 

                }
                break;
            case 42 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:461: KEYWORD_23
                {
                mKEYWORD_23(); 

                }
                break;
            case 43 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:472: KEYWORD_24
                {
                mKEYWORD_24(); 

                }
                break;
            case 44 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:483: KEYWORD_25
                {
                mKEYWORD_25(); 

                }
                break;
            case 45 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:494: KEYWORD_26
                {
                mKEYWORD_26(); 

                }
                break;
            case 46 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:505: KEYWORD_27
                {
                mKEYWORD_27(); 

                }
                break;
            case 47 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:516: KEYWORD_28
                {
                mKEYWORD_28(); 

                }
                break;
            case 48 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:527: KEYWORD_29
                {
                mKEYWORD_29(); 

                }
                break;
            case 49 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:538: KEYWORD_30
                {
                mKEYWORD_30(); 

                }
                break;
            case 50 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:549: KEYWORD_9
                {
                mKEYWORD_9(); 

                }
                break;
            case 51 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:559: KEYWORD_10
                {
                mKEYWORD_10(); 

                }
                break;
            case 52 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:570: KEYWORD_11
                {
                mKEYWORD_11(); 

                }
                break;
            case 53 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:581: KEYWORD_12
                {
                mKEYWORD_12(); 

                }
                break;
            case 54 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:592: KEYWORD_13
                {
                mKEYWORD_13(); 

                }
                break;
            case 55 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:603: KEYWORD_14
                {
                mKEYWORD_14(); 

                }
                break;
            case 56 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:614: KEYWORD_15
                {
                mKEYWORD_15(); 

                }
                break;
            case 57 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:625: KEYWORD_16
                {
                mKEYWORD_16(); 

                }
                break;
            case 58 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:636: KEYWORD_17
                {
                mKEYWORD_17(); 

                }
                break;
            case 59 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:647: KEYWORD_1
                {
                mKEYWORD_1(); 

                }
                break;
            case 60 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:657: KEYWORD_2
                {
                mKEYWORD_2(); 

                }
                break;
            case 61 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:667: KEYWORD_3
                {
                mKEYWORD_3(); 

                }
                break;
            case 62 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:677: KEYWORD_4
                {
                mKEYWORD_4(); 

                }
                break;
            case 63 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:687: KEYWORD_5
                {
                mKEYWORD_5(); 

                }
                break;
            case 64 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:697: KEYWORD_6
                {
                mKEYWORD_6(); 

                }
                break;
            case 65 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:707: KEYWORD_7
                {
                mKEYWORD_7(); 

                }
                break;
            case 66 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:717: KEYWORD_8
                {
                mKEYWORD_8(); 

                }
                break;
            case 67 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:727: RULE_LITERALTEMPORAL
                {
                mRULE_LITERALTEMPORAL(); 

                }
                break;
            case 68 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:748: RULE_DATE_LITERAL
                {
                mRULE_DATE_LITERAL(); 

                }
                break;
            case 69 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:766: RULE_TIME_LITERAL
                {
                mRULE_TIME_LITERAL(); 

                }
                break;
            case 70 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:784: RULE_TIMESTAMP_LITERAL
                {
                mRULE_TIMESTAMP_LITERAL(); 

                }
                break;
            case 71 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:807: RULE_DATE_STRING
                {
                mRULE_DATE_STRING(); 

                }
                break;
            case 72 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:824: RULE_TIME_STRING
                {
                mRULE_TIME_STRING(); 

                }
                break;
            case 73 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:841: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 74 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:849: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 75 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:858: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 76 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:870: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 77 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:886: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 78 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:902: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 79 :
                // ../org.nightlabs.jjqb.xtext.jpql.ui/src-gen/org/nightlabs/jjqb/xtext/jpql/ui/contentassist/antlr/lexer/InternalJPQLLexer.g:1:910: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\1\uffff\21\45\1\42\1\120\1\122\1\125\5\uffff\1\134\1\42\1\uffff"+
        "\3\42\2\uffff\2\45\1\uffff\10\45\1\160\4\45\1\166\1\167\13\45\1"+
        "\u0087\1\45\1\u0089\11\45\1\u0095\1\45\15\uffff\1\134\6\uffff\4"+
        "\45\1\u009f\1\45\1\u00a1\7\45\1\uffff\5\45\2\uffff\6\45\1\u00b4"+
        "\1\u00b5\1\u00b6\6\45\1\uffff\1\45\1\uffff\3\45\1\u00c1\1\u00c2"+
        "\1\45\1\u00c4\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\uffff\1\u00c9\3"+
        "\uffff\1\134\4\45\1\uffff\1\45\1\uffff\1\u00d3\1\u00d4\1\u00d5\2"+
        "\45\1\u00d8\7\45\1\u00e0\2\45\1\u00e3\1\45\3\uffff\4\45\1\u00e9"+
        "\3\45\1\u00ed\1\u00ee\2\uffff\1\u00ef\11\uffff\1\134\2\45\1\u00f6"+
        "\2\45\3\uffff\2\45\1\uffff\2\45\1\u00fd\2\45\1\u0100\1\45\1\uffff"+
        "\1\45\1\u0103\1\uffff\2\45\1\u0106\1\u0107\1\u0108\1\uffff\1\u0109"+
        "\1\u010a\1\u010b\7\uffff\1\45\1\u0111\1\uffff\1\45\1\u0113\1\45"+
        "\1\u0115\1\45\1\u0117\1\uffff\1\u0118\1\u0119\1\uffff\1\u011a\1"+
        "\u011b\1\uffff\1\u011c\1\u011d\12\uffff\1\45\1\uffff\1\45\1\uffff"+
        "\1\45\1\uffff\1\u0124\12\uffff\2\45\1\u012b\4\uffff\2\45\1\u0131"+
        "\4\uffff\2\45\4\uffff\2\45\3\uffff\1\u0140\1\u0141\3\uffff\1\45"+
        "\6\uffff\1\45\4\uffff\1\45\3\uffff\1\45\3\uffff\1\u0155\16\uffff";
    static final String DFA21_eofS =
        "\u0162\uffff";
    static final String DFA21_minS =
        "\1\0\1\117\3\105\1\115\1\101\1\115\1\105\1\101\1\120\1\101\1\106"+
        "\1\110\1\117\1\105\1\122\1\102\3\75\1\144\5\uffff\1\60\1\101\1\uffff"+
        "\2\0\1\52\2\uffff\1\122\1\116\1\uffff\1\102\1\114\1\132\1\115\1"+
        "\122\1\123\1\114\1\124\1\60\1\111\1\120\1\126\1\120\2\60\1\106\1"+
        "\103\1\113\1\115\1\130\1\116\2\104\1\114\1\124\1\117\1\60\1\124"+
        "\1\60\1\105\1\111\1\114\1\127\1\124\1\125\1\123\1\114\1\104\1\60"+
        "\1\107\5\uffff\2\11\6\uffff\1\60\6\uffff\1\122\1\103\1\116\1\123"+
        "\1\60\1\105\1\60\2\105\2\124\1\105\1\103\1\127\1\uffff\1\123\1\124"+
        "\1\111\1\117\1\105\2\uffff\1\107\1\124\1\101\2\105\1\102\3\60\1"+
        "\101\1\105\1\123\1\103\1\115\1\105\1\uffff\1\105\1\uffff\1\122\1"+
        "\116\1\114\2\60\1\105\5\60\1\uffff\1\60\3\11\1\60\1\105\1\101\2"+
        "\124\1\uffff\1\103\1\uffff\3\60\1\111\1\124\1\60\1\105\1\124\1\131"+
        "\1\116\2\122\1\124\1\60\1\124\1\122\1\60\1\105\3\uffff\1\124\1\122"+
        "\1\105\1\110\1\60\2\122\1\105\2\60\2\uffff\1\60\6\uffff\1\60\1\11"+
        "\1\60\1\55\1\116\1\124\1\60\1\122\1\124\3\uffff\1\116\1\105\1\uffff"+
        "\1\105\1\123\1\60\1\107\1\124\1\60\1\110\1\uffff\1\105\1\60\1\uffff"+
        "\1\122\1\105\3\60\1\uffff\3\60\3\uffff\3\60\1\uffff\1\124\1\60\1"+
        "\uffff\1\111\1\60\1\103\1\60\1\116\1\60\1\uffff\2\60\1\uffff\2\60"+
        "\1\uffff\2\60\6\uffff\2\60\1\72\1\60\1\137\1\uffff\1\116\1\uffff"+
        "\1\124\1\uffff\1\60\7\uffff\3\60\1\104\1\107\1\60\1\uffff\1\55\1"+
        "\60\1\72\1\111\1\101\1\60\1\uffff\1\60\1\55\1\60\1\115\1\124\1\uffff"+
        "\3\60\2\105\1\55\1\60\1\56\3\60\1\55\1\47\1\124\2\uffff\2\60\1\47"+
        "\1\11\1\101\1\47\1\60\1\11\1\uffff\1\115\1\11\1\40\1\uffff\1\120"+
        "\1\11\1\uffff\3\60\1\uffff\1\72\2\60\1\72\2\60\1\56\2\47\2\11\1"+
        "\uffff";
    static final String DFA21_maxS =
        "\1\uffff\2\165\1\151\1\171\1\170\1\141\1\163\2\157\1\160\1\162\1"+
        "\165\1\150\1\157\1\165\1\162\1\166\3\75\1\164\5\uffff\1\72\1\172"+
        "\1\uffff\2\uffff\1\57\2\uffff\1\162\1\165\1\uffff\1\155\1\164\1"+
        "\172\1\155\1\162\2\163\1\164\1\172\1\151\1\160\1\166\1\160\2\172"+
        "\1\156\1\167\1\153\1\155\1\170\1\156\1\144\1\160\1\154\1\164\1\157"+
        "\1\172\1\164\1\172\1\145\1\151\1\154\1\167\1\164\1\165\1\163\1\154"+
        "\1\171\1\172\1\147\5\uffff\1\40\1\163\6\uffff\1\72\6\uffff\1\162"+
        "\1\143\1\156\1\163\1\172\1\145\1\172\2\145\2\164\1\145\1\143\1\167"+
        "\1\uffff\1\163\1\164\1\151\1\157\1\145\2\uffff\1\147\1\164\1\141"+
        "\2\145\1\142\3\172\1\141\1\145\1\163\1\143\1\155\1\145\1\uffff\1"+
        "\145\1\uffff\1\162\1\156\1\154\2\172\1\145\5\172\1\uffff\1\172\1"+
        "\47\1\40\1\47\1\71\1\145\1\141\2\164\1\uffff\1\143\1\uffff\3\172"+
        "\1\151\1\164\1\172\1\145\1\164\1\171\1\156\2\162\1\164\1\172\1\164"+
        "\1\162\1\172\1\145\3\uffff\1\164\1\162\1\145\1\150\1\172\2\162\1"+
        "\145\2\172\2\uffff\1\172\6\uffff\1\71\1\47\1\71\1\55\1\156\1\164"+
        "\1\172\1\162\1\164\3\uffff\1\156\1\145\1\uffff\1\145\1\163\1\172"+
        "\1\147\1\164\1\172\1\150\1\uffff\1\145\1\172\1\uffff\1\162\1\145"+
        "\3\172\1\uffff\3\172\3\uffff\2\71\1\72\1\uffff\1\164\1\172\1\uffff"+
        "\1\151\1\172\1\143\1\172\1\156\1\172\1\uffff\2\172\1\uffff\2\172"+
        "\1\uffff\2\172\6\uffff\2\71\1\72\1\71\1\137\1\uffff\1\156\1\uffff"+
        "\1\164\1\uffff\1\172\7\uffff\3\71\1\164\1\147\1\172\1\uffff\1\55"+
        "\1\71\1\72\1\151\1\141\1\172\1\uffff\1\71\1\55\1\71\1\155\1\164"+
        "\1\uffff\3\71\2\145\1\55\1\71\1\56\2\172\1\71\1\55\1\71\1\164\2"+
        "\uffff\3\71\1\51\1\141\1\47\1\71\1\51\1\uffff\1\155\1\51\1\40\1"+
        "\uffff\1\160\1\51\1\uffff\1\71\1\172\1\72\1\uffff\1\72\2\71\1\72"+
        "\2\71\1\56\2\71\2\51\1\uffff";
    static final String DFA21_acceptS =
        "\26\uffff\1\74\1\75\1\76\1\77\1\101\2\uffff\1\111\3\uffff\1\116"+
        "\1\117\2\uffff\1\111\50\uffff\1\62\1\63\1\100\1\64\1\102\2\uffff"+
        "\1\73\1\74\1\75\1\76\1\77\1\101\1\uffff\1\112\1\110\1\113\1\114"+
        "\1\115\1\116\16\uffff\1\66\5\uffff\1\67\1\70\17\uffff\1\72\1\uffff"+
        "\1\71\13\uffff\1\65\11\uffff\1\61\1\uffff\1\60\22\uffff\1\53\1\54"+
        "\1\55\12\uffff\1\56\1\57\1\uffff\1\45\1\46\1\47\1\50\1\51\1\52\11"+
        "\uffff\1\41\1\42\1\43\2\uffff\1\33\7\uffff\1\36\2\uffff\1\37\5\uffff"+
        "\1\34\3\uffff\1\35\1\40\1\44\3\uffff\1\107\2\uffff\1\21\6\uffff"+
        "\1\22\2\uffff\1\25\2\uffff\1\26\2\uffff\1\31\1\23\1\24\1\27\1\30"+
        "\1\32\5\uffff\1\7\1\uffff\1\17\1\uffff\1\10\1\uffff\1\11\1\12\1"+
        "\13\1\14\1\15\1\16\1\20\6\uffff\1\6\6\uffff\1\5\5\uffff\1\4\16\uffff"+
        "\1\3\1\2\10\uffff\1\103\3\uffff\1\103\2\uffff\1\103\3\uffff\1\1"+
        "\13\uffff\1\103";
    static final String DFA21_specialS =
        "\1\0\35\uffff\1\1\1\2\u0142\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\22\1\36\4\42\1\37\1\25\1"+
            "\26\2\42\1\27\1\42\1\30\1\40\12\33\1\31\1\42\1\23\1\32\1\24"+
            "\2\42\1\21\1\4\1\1\1\3\1\5\1\13\1\35\1\6\1\7\1\16\1\35\1\10"+
            "\1\11\1\17\1\14\3\35\1\2\1\20\1\12\1\35\1\15\3\35\3\42\1\34"+
            "\1\35\1\42\1\21\1\4\1\1\1\3\1\5\1\13\1\35\1\6\1\7\1\16\1\35"+
            "\1\10\1\11\1\17\1\14\3\35\1\2\1\20\1\12\1\35\1\15\3\35\uff85"+
            "\42",
            "\1\44\5\uffff\1\43\31\uffff\1\44\5\uffff\1\43",
            "\1\47\3\uffff\1\50\5\uffff\1\51\1\uffff\1\52\3\uffff\1\46\17"+
            "\uffff\1\47\3\uffff\1\50\5\uffff\1\51\1\uffff\1\52\3\uffff\1"+
            "\46",
            "\1\54\3\uffff\1\53\33\uffff\1\54\3\uffff\1\53",
            "\1\55\23\uffff\1\56\13\uffff\1\55\23\uffff\1\56",
            "\1\60\12\uffff\1\57\24\uffff\1\60\12\uffff\1\57",
            "\1\61\37\uffff\1\61",
            "\1\62\1\63\4\uffff\1\64\31\uffff\1\62\1\63\4\uffff\1\64",
            "\1\65\3\uffff\1\67\5\uffff\1\66\25\uffff\1\65\3\uffff\1\67"+
            "\5\uffff\1\66",
            "\1\71\3\uffff\1\70\3\uffff\1\72\5\uffff\1\73\21\uffff\1\71"+
            "\3\uffff\1\70\3\uffff\1\72\5\uffff\1\73",
            "\1\74\37\uffff\1\74",
            "\1\75\3\uffff\1\76\14\uffff\1\77\16\uffff\1\75\3\uffff\1\76"+
            "\14\uffff\1\77",
            "\1\102\13\uffff\1\100\2\uffff\1\101\20\uffff\1\102\13\uffff"+
            "\1\100\2\uffff\1\101",
            "\1\103\37\uffff\1\103",
            "\1\104\37\uffff\1\104",
            "\1\106\11\uffff\1\107\5\uffff\1\105\17\uffff\1\106\11\uffff"+
            "\1\107\5\uffff\1\105",
            "\1\110\37\uffff\1\110",
            "\1\111\11\uffff\1\112\1\uffff\1\113\4\uffff\1\114\2\uffff\1"+
            "\115\13\uffff\1\111\11\uffff\1\112\1\uffff\1\113\4\uffff\1\114"+
            "\2\uffff\1\115",
            "\1\116",
            "\1\117",
            "\1\121",
            "\1\123\17\uffff\1\124",
            "",
            "",
            "",
            "",
            "",
            "\12\133\1\135",
            "\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\0\136",
            "\0\136",
            "\1\137\4\uffff\1\140",
            "",
            "",
            "\1\142\37\uffff\1\142",
            "\1\143\6\uffff\1\144\30\uffff\1\143\6\uffff\1\144",
            "",
            "\1\145\12\uffff\1\146\24\uffff\1\145\12\uffff\1\146",
            "\1\147\7\uffff\1\150\27\uffff\1\147\7\uffff\1\150",
            "\1\151\37\uffff\1\151",
            "\1\152\37\uffff\1\152",
            "\1\153\37\uffff\1\153",
            "\1\154\37\uffff\1\154",
            "\1\155\6\uffff\1\156\30\uffff\1\155\6\uffff\1\156",
            "\1\157\37\uffff\1\157",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\161\37\uffff\1\161",
            "\1\162\37\uffff\1\162",
            "\1\163\37\uffff\1\163",
            "\1\164\37\uffff\1\164",
            "\12\45\7\uffff\15\45\1\165\14\45\4\uffff\1\45\1\uffff\15\45"+
            "\1\165\14\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\171\7\uffff\1\170\27\uffff\1\171\7\uffff\1\170",
            "\1\172\23\uffff\1\173\13\uffff\1\172\23\uffff\1\173",
            "\1\174\37\uffff\1\174",
            "\1\175\37\uffff\1\175",
            "\1\176\37\uffff\1\176",
            "\1\177\37\uffff\1\177",
            "\1\u0080\37\uffff\1\u0080",
            "\1\u0081\13\uffff\1\u0082\23\uffff\1\u0081\13\uffff\1\u0082",
            "\1\u0083\37\uffff\1\u0083",
            "\1\u0084\37\uffff\1\u0084",
            "\1\u0085\37\uffff\1\u0085",
            "\12\45\7\uffff\3\45\1\u0086\26\45\4\uffff\1\45\1\uffff\3\45"+
            "\1\u0086\26\45",
            "\1\u0088\37\uffff\1\u0088",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u008a\37\uffff\1\u008a",
            "\1\u008b\37\uffff\1\u008b",
            "\1\u008c\37\uffff\1\u008c",
            "\1\u008d\37\uffff\1\u008d",
            "\1\u008e\37\uffff\1\u008e",
            "\1\u008f\37\uffff\1\u008f",
            "\1\u0090\37\uffff\1\u0090",
            "\1\u0091\37\uffff\1\u0091",
            "\1\u0092\24\uffff\1\u0093\12\uffff\1\u0092\24\uffff\1\u0093",
            "\12\45\7\uffff\2\45\1\u0094\27\45\4\uffff\1\45\1\uffff\2\45"+
            "\1\u0094\27\45",
            "\1\u0096\37\uffff\1\u0096",
            "",
            "",
            "",
            "",
            "",
            "\1\u0097\26\uffff\1\u0097",
            "\1\u0099\26\uffff\1\u0099\122\uffff\1\u0098",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u009a\1\135",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009b\37\uffff\1\u009b",
            "\1\u009c\37\uffff\1\u009c",
            "\1\u009d\37\uffff\1\u009d",
            "\1\u009e\37\uffff\1\u009e",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00a0\37\uffff\1\u00a0",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00a2\37\uffff\1\u00a2",
            "\1\u00a3\37\uffff\1\u00a3",
            "\1\u00a4\37\uffff\1\u00a4",
            "\1\u00a5\37\uffff\1\u00a5",
            "\1\u00a6\37\uffff\1\u00a6",
            "\1\u00a7\37\uffff\1\u00a7",
            "\1\u00a8\37\uffff\1\u00a8",
            "",
            "\1\u00a9\37\uffff\1\u00a9",
            "\1\u00aa\37\uffff\1\u00aa",
            "\1\u00ab\37\uffff\1\u00ab",
            "\1\u00ac\37\uffff\1\u00ac",
            "\1\u00ad\37\uffff\1\u00ad",
            "",
            "",
            "\1\u00ae\37\uffff\1\u00ae",
            "\1\u00af\37\uffff\1\u00af",
            "\1\u00b0\37\uffff\1\u00b0",
            "\1\u00b1\37\uffff\1\u00b1",
            "\1\u00b2\37\uffff\1\u00b2",
            "\1\u00b3\37\uffff\1\u00b3",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00b7\37\uffff\1\u00b7",
            "\1\u00b8\37\uffff\1\u00b8",
            "\1\u00b9\37\uffff\1\u00b9",
            "\1\u00ba\37\uffff\1\u00ba",
            "\1\u00bb\37\uffff\1\u00bb",
            "\1\u00bc\37\uffff\1\u00bc",
            "",
            "\1\u00bd\37\uffff\1\u00bd",
            "",
            "\1\u00be\37\uffff\1\u00be",
            "\1\u00bf\37\uffff\1\u00bf",
            "\1\u00c0\37\uffff\1\u00c0",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00c3\37\uffff\1\u00c3",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0097\26\uffff\1\u0097\6\uffff\1\u00ca",
            "\1\u00cb\26\uffff\1\u00cb",
            "\1\u0099\26\uffff\1\u0099\6\uffff\1\u00cc",
            "\12\u00cd",
            "\1\u00ce\37\uffff\1\u00ce",
            "\1\u00cf\37\uffff\1\u00cf",
            "\1\u00d0\37\uffff\1\u00d0",
            "\1\u00d1\37\uffff\1\u00d1",
            "",
            "\1\u00d2\37\uffff\1\u00d2",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00d6\37\uffff\1\u00d6",
            "\1\u00d7\37\uffff\1\u00d7",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00d9\37\uffff\1\u00d9",
            "\1\u00da\37\uffff\1\u00da",
            "\1\u00db\37\uffff\1\u00db",
            "\1\u00dc\37\uffff\1\u00dc",
            "\1\u00dd\37\uffff\1\u00dd",
            "\1\u00de\37\uffff\1\u00de",
            "\1\u00df\37\uffff\1\u00df",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00e1\37\uffff\1\u00e1",
            "\1\u00e2\37\uffff\1\u00e2",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00e4\37\uffff\1\u00e4",
            "",
            "",
            "",
            "\1\u00e5\37\uffff\1\u00e5",
            "\1\u00e6\37\uffff\1\u00e6",
            "\1\u00e7\37\uffff\1\u00e7",
            "\1\u00e8\37\uffff\1\u00e8",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00ea\37\uffff\1\u00ea",
            "\1\u00eb\37\uffff\1\u00eb",
            "\1\u00ec\37\uffff\1\u00ec",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u00f0",
            "\1\u00cb\26\uffff\1\u00cb\6\uffff\1\u00f1",
            "\12\u00f2",
            "\1\u00f3",
            "\1\u00f4\37\uffff\1\u00f4",
            "\1\u00f5\37\uffff\1\u00f5",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00f7\37\uffff\1\u00f7",
            "\1\u00f8\37\uffff\1\u00f8",
            "",
            "",
            "",
            "\1\u00f9\37\uffff\1\u00f9",
            "\1\u00fa\37\uffff\1\u00fa",
            "",
            "\1\u00fb\37\uffff\1\u00fb",
            "\1\u00fc\37\uffff\1\u00fc",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00fe\37\uffff\1\u00fe",
            "\1\u00ff\37\uffff\1\u00ff",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0101\37\uffff\1\u0101",
            "",
            "\1\u0102\37\uffff\1\u0102",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u0104\37\uffff\1\u0104",
            "\1\u0105\37\uffff\1\u0105",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "\12\u010c",
            "\12\u010d",
            "\12\u010e\1\u010f",
            "",
            "\1\u0110\37\uffff\1\u0110",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u0112\37\uffff\1\u0112",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0114\37\uffff\1\u0114",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0116\37\uffff\1\u0116",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u011e",
            "\12\u011f",
            "\1\u010f",
            "\12\u0120",
            "\1\u0121",
            "",
            "\1\u0122\37\uffff\1\u0122",
            "",
            "\1\u0123\37\uffff\1\u0123",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u0125",
            "\12\u0126",
            "\12\u0127",
            "\1\u0129\17\uffff\1\u0128\17\uffff\1\u0129\17\uffff\1\u0128",
            "\1\u012a\37\uffff\1\u012a",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u012c",
            "\12\u012d",
            "\1\u012e",
            "\1\u012f\37\uffff\1\u012f",
            "\1\u0130\37\uffff\1\u0130",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\u0132",
            "\1\u0133",
            "\12\u0134",
            "\1\u0135\37\uffff\1\u0135",
            "\1\u0136\37\uffff\1\u0136",
            "",
            "\12\u0137",
            "\12\u0138",
            "\12\u0139",
            "\1\u013a\37\uffff\1\u013a",
            "\1\u013b\37\uffff\1\u013b",
            "\1\u013c",
            "\12\u013d",
            "\1\u013e",
            "\12\45\7\uffff\22\45\1\u013f\7\45\4\uffff\1\45\1\uffff\22\45"+
            "\1\u013f\7\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\u0142",
            "\1\u0143",
            "\1\u0145\10\uffff\12\u0144",
            "\1\u0146\37\uffff\1\u0146",
            "",
            "",
            "\12\u0147",
            "\12\u0148",
            "\1\u0145\10\uffff\12\u0144",
            "\1\u0149\26\uffff\1\u0149\10\uffff\1\u014a",
            "\1\u014b\37\uffff\1\u014b",
            "\1\u014c",
            "\12\u014d",
            "\1\u0149\26\uffff\1\u0149\10\uffff\1\u014a",
            "",
            "\1\u014f\37\uffff\1\u014f",
            "\1\u0150\26\uffff\1\u0150\10\uffff\1\u0151",
            "\1\u0152",
            "",
            "\1\u0153\37\uffff\1\u0153",
            "\1\u0150\26\uffff\1\u0150\10\uffff\1\u0151",
            "",
            "\12\u0154",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\u0156\1\u0157",
            "",
            "\1\u0157",
            "\12\u0158",
            "\12\u0159",
            "\1\u015a",
            "\12\u015b",
            "\12\u015c",
            "\1\u015d",
            "\1\u015f\10\uffff\12\u015e",
            "\1\u015f\10\uffff\12\u015e",
            "\1\u0160\26\uffff\1\u0160\10\uffff\1\u0161",
            "\1\u0160\26\uffff\1\u0160\10\uffff\1\u0161",
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
            return "1:1: Tokens : ( KEYWORD_66 | KEYWORD_64 | KEYWORD_65 | KEYWORD_63 | KEYWORD_62 | KEYWORD_61 | KEYWORD_51 | KEYWORD_52 | KEYWORD_53 | KEYWORD_54 | KEYWORD_55 | KEYWORD_56 | KEYWORD_57 | KEYWORD_58 | KEYWORD_59 | KEYWORD_60 | KEYWORD_41 | KEYWORD_42 | KEYWORD_43 | KEYWORD_44 | KEYWORD_45 | KEYWORD_46 | KEYWORD_47 | KEYWORD_48 | KEYWORD_49 | KEYWORD_50 | KEYWORD_31 | KEYWORD_32 | KEYWORD_33 | KEYWORD_34 | KEYWORD_35 | KEYWORD_36 | KEYWORD_37 | KEYWORD_38 | KEYWORD_39 | KEYWORD_40 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | RULE_LITERALTEMPORAL | RULE_DATE_LITERAL | RULE_TIME_LITERAL | RULE_TIMESTAMP_LITERAL | RULE_DATE_STRING | RULE_TIME_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='C'||LA21_0=='c') ) {s = 1;}

                        else if ( (LA21_0=='S'||LA21_0=='s') ) {s = 2;}

                        else if ( (LA21_0=='D'||LA21_0=='d') ) {s = 3;}

                        else if ( (LA21_0=='B'||LA21_0=='b') ) {s = 4;}

                        else if ( (LA21_0=='E'||LA21_0=='e') ) {s = 5;}

                        else if ( (LA21_0=='H'||LA21_0=='h') ) {s = 6;}

                        else if ( (LA21_0=='I'||LA21_0=='i') ) {s = 7;}

                        else if ( (LA21_0=='L'||LA21_0=='l') ) {s = 8;}

                        else if ( (LA21_0=='M'||LA21_0=='m') ) {s = 9;}

                        else if ( (LA21_0=='U'||LA21_0=='u') ) {s = 10;}

                        else if ( (LA21_0=='F'||LA21_0=='f') ) {s = 11;}

                        else if ( (LA21_0=='O'||LA21_0=='o') ) {s = 12;}

                        else if ( (LA21_0=='W'||LA21_0=='w') ) {s = 13;}

                        else if ( (LA21_0=='J'||LA21_0=='j') ) {s = 14;}

                        else if ( (LA21_0=='N'||LA21_0=='n') ) {s = 15;}

                        else if ( (LA21_0=='T'||LA21_0=='t') ) {s = 16;}

                        else if ( (LA21_0=='A'||LA21_0=='a') ) {s = 17;}

                        else if ( (LA21_0=='!') ) {s = 18;}

                        else if ( (LA21_0=='<') ) {s = 19;}

                        else if ( (LA21_0=='>') ) {s = 20;}

                        else if ( (LA21_0=='(') ) {s = 21;}

                        else if ( (LA21_0==')') ) {s = 22;}

                        else if ( (LA21_0==',') ) {s = 23;}

                        else if ( (LA21_0=='.') ) {s = 24;}

                        else if ( (LA21_0==':') ) {s = 25;}

                        else if ( (LA21_0=='=') ) {s = 26;}

                        else if ( ((LA21_0>='0' && LA21_0<='9')) ) {s = 27;}

                        else if ( (LA21_0=='^') ) {s = 28;}

                        else if ( (LA21_0=='G'||LA21_0=='K'||(LA21_0>='P' && LA21_0<='R')||LA21_0=='V'||(LA21_0>='X' && LA21_0<='Z')||LA21_0=='_'||LA21_0=='g'||LA21_0=='k'||(LA21_0>='p' && LA21_0<='r')||LA21_0=='v'||(LA21_0>='x' && LA21_0<='z')) ) {s = 29;}

                        else if ( (LA21_0=='\"') ) {s = 30;}

                        else if ( (LA21_0=='\'') ) {s = 31;}

                        else if ( (LA21_0=='/') ) {s = 32;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 33;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||(LA21_0>='#' && LA21_0<='&')||(LA21_0>='*' && LA21_0<='+')||LA21_0=='-'||LA21_0==';'||(LA21_0>='?' && LA21_0<='@')||(LA21_0>='[' && LA21_0<=']')||LA21_0=='`'||(LA21_0>='{' && LA21_0<='\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_30 = input.LA(1);

                        s = -1;
                        if ( ((LA21_30>='\u0000' && LA21_30<='\uFFFF')) ) {s = 94;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_31 = input.LA(1);

                        s = -1;
                        if ( ((LA21_31>='\u0000' && LA21_31<='\uFFFF')) ) {s = 94;}

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