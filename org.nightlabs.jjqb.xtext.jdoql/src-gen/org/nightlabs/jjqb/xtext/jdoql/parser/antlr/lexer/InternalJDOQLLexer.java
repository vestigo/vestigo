package org.nightlabs.jjqb.xtext.jdoql.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJDOQLLexer extends Lexer {
    public static final int RULE_ID=56;
    public static final int RULE_ANY_OTHER=62;
    public static final int KEYWORD_19=32;
    public static final int KEYWORD_17=55;
    public static final int KEYWORD_18=31;
    public static final int KEYWORD_15=53;
    public static final int KEYWORD_52=6;
    public static final int KEYWORD_16=54;
    public static final int KEYWORD_51=5;
    public static final int KEYWORD_13=51;
    public static final int KEYWORD_50=4;
    public static final int KEYWORD_14=52;
    public static final int KEYWORD_11=49;
    public static final int KEYWORD_12=50;
    public static final int EOF=-1;
    public static final int KEYWORD_10=48;
    public static final int KEYWORD_6=44;
    public static final int KEYWORD_7=45;
    public static final int KEYWORD_8=46;
    public static final int KEYWORD_9=47;
    public static final int KEYWORD_28=23;
    public static final int KEYWORD_29=24;
    public static final int RULE_INT=57;
    public static final int KEYWORD_24=37;
    public static final int KEYWORD_25=38;
    public static final int KEYWORD_26=30;
    public static final int KEYWORD_27=22;
    public static final int KEYWORD_20=33;
    public static final int KEYWORD_21=34;
    public static final int KEYWORD_22=35;
    public static final int KEYWORD_23=36;
    public static final int KEYWORD_30=25;
    public static final int KEYWORD_1=39;
    public static final int KEYWORD_34=29;
    public static final int KEYWORD_5=43;
    public static final int KEYWORD_33=28;
    public static final int KEYWORD_4=42;
    public static final int KEYWORD_32=27;
    public static final int KEYWORD_3=41;
    public static final int KEYWORD_31=26;
    public static final int KEYWORD_2=40;
    public static final int KEYWORD_38=18;
    public static final int RULE_SL_COMMENT=60;
    public static final int KEYWORD_37=17;
    public static final int KEYWORD_36=16;
    public static final int KEYWORD_35=15;
    public static final int RULE_ML_COMMENT=59;
    public static final int KEYWORD_39=19;
    public static final int RULE_STRING=58;
    public static final int KEYWORD_41=21;
    public static final int KEYWORD_40=20;
    public static final int KEYWORD_43=12;
    public static final int KEYWORD_42=11;
    public static final int KEYWORD_45=14;
    public static final int KEYWORD_44=13;
    public static final int RULE_WS=61;
    public static final int KEYWORD_47=10;
    public static final int KEYWORD_46=9;
    public static final int KEYWORD_49=7;
    public static final int KEYWORD_48=8;

    // delegates
    // delegators

    public InternalJDOQLLexer() {;} 
    public InternalJDOQLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJDOQLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g"; }

    // $ANTLR start "KEYWORD_50"
    public final void mKEYWORD_50() throws RecognitionException {
        try {
            int _type = KEYWORD_50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:19:12: ( ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'S' | 's' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:19:14: ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
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

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
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

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
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
    // $ANTLR end "KEYWORD_50"

    // $ANTLR start "KEYWORD_51"
    public final void mKEYWORD_51() throws RecognitionException {
        try {
            int _type = KEYWORD_51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:21:12: ( ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:21:14: ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' )
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

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
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
    // $ANTLR end "KEYWORD_51"

    // $ANTLR start "KEYWORD_52"
    public final void mKEYWORD_52() throws RecognitionException {
        try {
            int _type = KEYWORD_52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:23:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'O' | 'o' ) ( 'F' | 'f' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:23:14: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'O' | 'o' ) ( 'F' | 'f' )
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

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
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
    // $ANTLR end "KEYWORD_52"

    // $ANTLR start "KEYWORD_49"
    public final void mKEYWORD_49() throws RecognitionException {
        try {
            int _type = KEYWORD_49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:25:12: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:25:14: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
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
    // $ANTLR end "KEYWORD_49"

    // $ANTLR start "KEYWORD_48"
    public final void mKEYWORD_48() throws RecognitionException {
        try {
            int _type = KEYWORD_48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:27:12: ( ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:27:14: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' )
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
    // $ANTLR end "KEYWORD_48"

    // $ANTLR start "KEYWORD_46"
    public final void mKEYWORD_46() throws RecognitionException {
        try {
            int _type = KEYWORD_46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:29:12: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'D' | 'd' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:29:14: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'D' | 'd' ) ( 'E' | 'e' )
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

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
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

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:31:12: ( ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'N' | 'n' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:31:14: ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
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

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_47"

    // $ANTLR start "KEYWORD_42"
    public final void mKEYWORD_42() throws RecognitionException {
        try {
            int _type = KEYWORD_42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:33:12: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:33:14: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
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
    // $ANTLR end "KEYWORD_42"

    // $ANTLR start "KEYWORD_43"
    public final void mKEYWORD_43() throws RecognitionException {
        try {
            int _type = KEYWORD_43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:35:12: ( ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:35:14: ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'E' | 'e' )
            {
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

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
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
    // $ANTLR end "KEYWORD_43"

    // $ANTLR start "KEYWORD_44"
    public final void mKEYWORD_44() throws RecognitionException {
        try {
            int _type = KEYWORD_44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:37:12: ( ( 'D' | 'd' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:37:14: ( 'D' | 'd' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
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

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:39:12: ( ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:39:14: ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' )
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
    // $ANTLR end "KEYWORD_45"

    // $ANTLR start "KEYWORD_35"
    public final void mKEYWORD_35() throws RecognitionException {
        try {
            int _type = KEYWORD_35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:41:12: ( ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:41:14: ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' )
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
    // $ANTLR end "KEYWORD_35"

    // $ANTLR start "KEYWORD_36"
    public final void mKEYWORD_36() throws RecognitionException {
        try {
            int _type = KEYWORD_36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:43:12: ( ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:43:14: ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' )
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
    // $ANTLR end "KEYWORD_36"

    // $ANTLR start "KEYWORD_37"
    public final void mKEYWORD_37() throws RecognitionException {
        try {
            int _type = KEYWORD_37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:45:12: ( ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:45:14: ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:47:12: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:47:14: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' )
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
    // $ANTLR end "KEYWORD_38"

    // $ANTLR start "KEYWORD_39"
    public final void mKEYWORD_39() throws RecognitionException {
        try {
            int _type = KEYWORD_39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:49:12: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:49:14: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
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
    // $ANTLR end "KEYWORD_39"

    // $ANTLR start "KEYWORD_40"
    public final void mKEYWORD_40() throws RecognitionException {
        try {
            int _type = KEYWORD_40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:51:12: ( ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'T' | 't' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:51:14: ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
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

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
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
    // $ANTLR end "KEYWORD_40"

    // $ANTLR start "KEYWORD_41"
    public final void mKEYWORD_41() throws RecognitionException {
        try {
            int _type = KEYWORD_41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:53:12: ( ( 'S' | 's' ) ( 'H' | 'h' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:53:14: ( 'S' | 's' ) ( 'H' | 'h' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
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
    // $ANTLR end "KEYWORD_41"

    // $ANTLR start "KEYWORD_27"
    public final void mKEYWORD_27() throws RecognitionException {
        try {
            int _type = KEYWORD_27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:55:12: ( ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:55:14: ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' )
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
    // $ANTLR end "KEYWORD_27"

    // $ANTLR start "KEYWORD_28"
    public final void mKEYWORD_28() throws RecognitionException {
        try {
            int _type = KEYWORD_28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:57:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:57:14: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' )
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

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:59:12: ( ( 'B' | 'b' ) ( 'Y' | 'y' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:59:14: ( 'B' | 'b' ) ( 'Y' | 'y' ) ( 'T' | 't' ) ( 'E' | 'e' )
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
    // $ANTLR end "KEYWORD_29"

    // $ANTLR start "KEYWORD_30"
    public final void mKEYWORD_30() throws RecognitionException {
        try {
            int _type = KEYWORD_30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:61:12: ( ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:61:14: ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' )
            {
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

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
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
    // $ANTLR end "KEYWORD_30"

    // $ANTLR start "KEYWORD_31"
    public final void mKEYWORD_31() throws RecognitionException {
        try {
            int _type = KEYWORD_31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:63:12: ( ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:63:14: ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'G' | 'g' )
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
    // $ANTLR end "KEYWORD_31"

    // $ANTLR start "KEYWORD_32"
    public final void mKEYWORD_32() throws RecognitionException {
        try {
            int _type = KEYWORD_32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:65:12: ( ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:65:14: ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' )
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
    // $ANTLR end "KEYWORD_32"

    // $ANTLR start "KEYWORD_33"
    public final void mKEYWORD_33() throws RecognitionException {
        try {
            int _type = KEYWORD_33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:67:12: ( ( 'T' | 't' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'S' | 's' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:67:14: ( 'T' | 't' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'S' | 's' )
            {
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
    // $ANTLR end "KEYWORD_33"

    // $ANTLR start "KEYWORD_34"
    public final void mKEYWORD_34() throws RecognitionException {
        try {
            int _type = KEYWORD_34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:69:12: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:69:14: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )
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
    // $ANTLR end "KEYWORD_34"

    // $ANTLR start "KEYWORD_26"
    public final void mKEYWORD_26() throws RecognitionException {
        try {
            int _type = KEYWORD_26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:71:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:71:14: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' )
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
    // $ANTLR end "KEYWORD_26"

    // $ANTLR start "KEYWORD_18"
    public final void mKEYWORD_18() throws RecognitionException {
        try {
            int _type = KEYWORD_18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:73:12: ( '!' '=' )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:73:14: '!' '='
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
    // $ANTLR end "KEYWORD_18"

    // $ANTLR start "KEYWORD_19"
    public final void mKEYWORD_19() throws RecognitionException {
        try {
            int _type = KEYWORD_19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:75:12: ( '&' '&' )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:75:14: '&' '&'
            {
            match('&'); 
            match('&'); 

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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:77:12: ( '<' '=' )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:77:14: '<' '='
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
    // $ANTLR end "KEYWORD_20"

    // $ANTLR start "KEYWORD_21"
    public final void mKEYWORD_21() throws RecognitionException {
        try {
            int _type = KEYWORD_21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:79:12: ( '=' '=' )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:79:14: '=' '='
            {
            match('='); 
            match('='); 

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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:81:12: ( '>' '=' )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:81:14: '>' '='
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
    // $ANTLR end "KEYWORD_22"

    // $ANTLR start "KEYWORD_23"
    public final void mKEYWORD_23() throws RecognitionException {
        try {
            int _type = KEYWORD_23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:83:12: ( ( 'A' | 'a' ) ( 'S' | 's' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:83:14: ( 'A' | 'a' ) ( 'S' | 's' )
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
    // $ANTLR end "KEYWORD_23"

    // $ANTLR start "KEYWORD_24"
    public final void mKEYWORD_24() throws RecognitionException {
        try {
            int _type = KEYWORD_24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:85:12: ( ( 'B' | 'b' ) ( 'Y' | 'y' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:85:14: ( 'B' | 'b' ) ( 'Y' | 'y' )
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
    // $ANTLR end "KEYWORD_24"

    // $ANTLR start "KEYWORD_25"
    public final void mKEYWORD_25() throws RecognitionException {
        try {
            int _type = KEYWORD_25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:87:12: ( '|' '|' )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:87:14: '|' '|'
            {
            match('|'); 
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_25"

    // $ANTLR start "KEYWORD_1"
    public final void mKEYWORD_1() throws RecognitionException {
        try {
            int _type = KEYWORD_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:89:11: ( '!' )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:89:13: '!'
            {
            match('!'); 

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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:91:11: ( '%' )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:91:13: '%'
            {
            match('%'); 

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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:93:11: ( '&' )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:93:13: '&'
            {
            match('&'); 

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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:95:11: ( '(' )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:95:13: '('
            {
            match('('); 

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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:97:11: ( ')' )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:97:13: ')'
            {
            match(')'); 

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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:99:11: ( '*' )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:99:13: '*'
            {
            match('*'); 

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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:101:11: ( '+' )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:101:13: '+'
            {
            match('+'); 

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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:103:11: ( ',' )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:103:13: ','
            {
            match(','); 

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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:105:11: ( '-' )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:105:13: '-'
            {
            match('-'); 

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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:107:12: ( '.' )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:107:14: '.'
            {
            match('.'); 

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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:109:12: ( '/' )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:109:14: '/'
            {
            match('/'); 

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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:111:12: ( ':' )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:111:14: ':'
            {
            match(':'); 

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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:113:12: ( ';' )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:113:14: ';'
            {
            match(';'); 

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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:115:12: ( '<' )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:115:14: '<'
            {
            match('<'); 

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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:117:12: ( '>' )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:117:14: '>'
            {
            match('>'); 

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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:119:12: ( '|' )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:119:14: '|'
            {
            match('|'); 

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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:121:12: ( '~' )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:121:14: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_17"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:125:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:125:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:125:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:125:11: '^'
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

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:125:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:
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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:127:10: ( ( '0' .. '9' )+ )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:127:12: ( '0' .. '9' )+
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:127:12: ( '0' .. '9' )+
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
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:127:13: '0' .. '9'
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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:129:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:129:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:129:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:129:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:129:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:129:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:129:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:129:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:129:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:129:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:129:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:131:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:131:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:131:24: ( options {greedy=false; } : . )*
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
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:131:52: .
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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:133:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:133:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:133:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:133:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:133:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:133:41: ( '\\r' )? '\\n'
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:133:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:133:41: '\\r'
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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:135:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:135:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:135:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:
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
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:137:16: ( . )
            // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:137:18: .
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
        // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:8: ( KEYWORD_50 | KEYWORD_51 | KEYWORD_52 | KEYWORD_49 | KEYWORD_48 | KEYWORD_46 | KEYWORD_47 | KEYWORD_42 | KEYWORD_43 | KEYWORD_44 | KEYWORD_45 | KEYWORD_35 | KEYWORD_36 | KEYWORD_37 | KEYWORD_38 | KEYWORD_39 | KEYWORD_40 | KEYWORD_41 | KEYWORD_27 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_33 | KEYWORD_34 | KEYWORD_26 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=59;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:10: KEYWORD_50
                {
                mKEYWORD_50(); 

                }
                break;
            case 2 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:21: KEYWORD_51
                {
                mKEYWORD_51(); 

                }
                break;
            case 3 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:32: KEYWORD_52
                {
                mKEYWORD_52(); 

                }
                break;
            case 4 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:43: KEYWORD_49
                {
                mKEYWORD_49(); 

                }
                break;
            case 5 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:54: KEYWORD_48
                {
                mKEYWORD_48(); 

                }
                break;
            case 6 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:65: KEYWORD_46
                {
                mKEYWORD_46(); 

                }
                break;
            case 7 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:76: KEYWORD_47
                {
                mKEYWORD_47(); 

                }
                break;
            case 8 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:87: KEYWORD_42
                {
                mKEYWORD_42(); 

                }
                break;
            case 9 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:98: KEYWORD_43
                {
                mKEYWORD_43(); 

                }
                break;
            case 10 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:109: KEYWORD_44
                {
                mKEYWORD_44(); 

                }
                break;
            case 11 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:120: KEYWORD_45
                {
                mKEYWORD_45(); 

                }
                break;
            case 12 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:131: KEYWORD_35
                {
                mKEYWORD_35(); 

                }
                break;
            case 13 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:142: KEYWORD_36
                {
                mKEYWORD_36(); 

                }
                break;
            case 14 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:153: KEYWORD_37
                {
                mKEYWORD_37(); 

                }
                break;
            case 15 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:164: KEYWORD_38
                {
                mKEYWORD_38(); 

                }
                break;
            case 16 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:175: KEYWORD_39
                {
                mKEYWORD_39(); 

                }
                break;
            case 17 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:186: KEYWORD_40
                {
                mKEYWORD_40(); 

                }
                break;
            case 18 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:197: KEYWORD_41
                {
                mKEYWORD_41(); 

                }
                break;
            case 19 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:208: KEYWORD_27
                {
                mKEYWORD_27(); 

                }
                break;
            case 20 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:219: KEYWORD_28
                {
                mKEYWORD_28(); 

                }
                break;
            case 21 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:230: KEYWORD_29
                {
                mKEYWORD_29(); 

                }
                break;
            case 22 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:241: KEYWORD_30
                {
                mKEYWORD_30(); 

                }
                break;
            case 23 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:252: KEYWORD_31
                {
                mKEYWORD_31(); 

                }
                break;
            case 24 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:263: KEYWORD_32
                {
                mKEYWORD_32(); 

                }
                break;
            case 25 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:274: KEYWORD_33
                {
                mKEYWORD_33(); 

                }
                break;
            case 26 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:285: KEYWORD_34
                {
                mKEYWORD_34(); 

                }
                break;
            case 27 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:296: KEYWORD_26
                {
                mKEYWORD_26(); 

                }
                break;
            case 28 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:307: KEYWORD_18
                {
                mKEYWORD_18(); 

                }
                break;
            case 29 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:318: KEYWORD_19
                {
                mKEYWORD_19(); 

                }
                break;
            case 30 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:329: KEYWORD_20
                {
                mKEYWORD_20(); 

                }
                break;
            case 31 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:340: KEYWORD_21
                {
                mKEYWORD_21(); 

                }
                break;
            case 32 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:351: KEYWORD_22
                {
                mKEYWORD_22(); 

                }
                break;
            case 33 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:362: KEYWORD_23
                {
                mKEYWORD_23(); 

                }
                break;
            case 34 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:373: KEYWORD_24
                {
                mKEYWORD_24(); 

                }
                break;
            case 35 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:384: KEYWORD_25
                {
                mKEYWORD_25(); 

                }
                break;
            case 36 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:395: KEYWORD_1
                {
                mKEYWORD_1(); 

                }
                break;
            case 37 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:405: KEYWORD_2
                {
                mKEYWORD_2(); 

                }
                break;
            case 38 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:415: KEYWORD_3
                {
                mKEYWORD_3(); 

                }
                break;
            case 39 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:425: KEYWORD_4
                {
                mKEYWORD_4(); 

                }
                break;
            case 40 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:435: KEYWORD_5
                {
                mKEYWORD_5(); 

                }
                break;
            case 41 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:445: KEYWORD_6
                {
                mKEYWORD_6(); 

                }
                break;
            case 42 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:455: KEYWORD_7
                {
                mKEYWORD_7(); 

                }
                break;
            case 43 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:465: KEYWORD_8
                {
                mKEYWORD_8(); 

                }
                break;
            case 44 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:475: KEYWORD_9
                {
                mKEYWORD_9(); 

                }
                break;
            case 45 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:485: KEYWORD_10
                {
                mKEYWORD_10(); 

                }
                break;
            case 46 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:496: KEYWORD_11
                {
                mKEYWORD_11(); 

                }
                break;
            case 47 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:507: KEYWORD_12
                {
                mKEYWORD_12(); 

                }
                break;
            case 48 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:518: KEYWORD_13
                {
                mKEYWORD_13(); 

                }
                break;
            case 49 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:529: KEYWORD_14
                {
                mKEYWORD_14(); 

                }
                break;
            case 50 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:540: KEYWORD_15
                {
                mKEYWORD_15(); 

                }
                break;
            case 51 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:551: KEYWORD_16
                {
                mKEYWORD_16(); 

                }
                break;
            case 52 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:562: KEYWORD_17
                {
                mKEYWORD_17(); 

                }
                break;
            case 53 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:573: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 54 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:581: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 55 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:590: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 56 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:602: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 57 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:618: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 58 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:634: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 59 :
                // ../org.nightlabs.jjqb.xtext.jdoql/src-gen/org/nightlabs/jjqb/xtext/jdoql/parser/antlr/lexer/InternalJDOQLLexer.g:1:642: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\21\55\1\107\1\111\1\113\1\53\1\116\1\55\1\121\10\uffff"+
        "\1\134\3\uffff\1\53\2\uffff\2\53\2\uffff\1\55\1\uffff\12\55\1\160"+
        "\15\55\11\uffff\1\176\23\uffff\5\55\1\u0085\7\55\1\uffff\15\55\1"+
        "\uffff\5\55\1\u009f\1\uffff\6\55\1\u00a6\7\55\1\u00ae\1\u00af\1"+
        "\u00b0\1\u00b1\1\u00b2\1\u00b3\3\55\1\u00b7\1\55\1\uffff\6\55\1"+
        "\uffff\1\55\1\u00c0\1\u00c1\1\u00c2\1\u00c3\1\u00c4\1\u00c5\6\uffff"+
        "\2\55\1\u00c8\1\uffff\1\55\1\u00ca\2\55\1\u00cd\2\55\1\u00d0\6\uffff"+
        "\2\55\1\uffff\1\55\1\uffff\2\55\1\uffff\1\u00d6\1\u00d7\1\uffff"+
        "\4\55\1\u00dc\2\uffff\3\55\1\u00e0\1\uffff\1\u00e1\1\u00e2\1\u00e3"+
        "\4\uffff";
    static final String DFA12_eofS =
        "\u00e4\uffff";
    static final String DFA12_minS =
        "\1\0\1\101\1\105\1\115\1\101\1\111\1\130\1\117\1\116\2\122\1\101"+
        "\1\110\1\101\1\110\1\117\1\125\1\110\1\75\1\46\3\75\1\123\1\174"+
        "\10\uffff\1\52\3\uffff\1\101\2\uffff\2\0\2\uffff\1\122\1\uffff\1"+
        "\102\1\114\1\117\1\123\1\120\1\122\1\123\1\125\1\103\1\117\1\60"+
        "\1\111\1\117\1\104\1\116\1\105\1\114\2\117\1\101\1\116\1\114\1\111"+
        "\1\125\11\uffff\1\60\23\uffff\1\101\1\103\1\105\1\122\1\124\1\60"+
        "\1\117\1\111\1\124\1\102\2\114\1\105\1\uffff\1\121\1\125\1\105\1"+
        "\107\1\122\1\123\1\101\1\115\1\122\1\107\1\114\1\123\1\105\1\uffff"+
        "\1\115\1\114\1\103\1\124\1\101\1\60\1\uffff\1\122\1\101\1\111\1"+
        "\114\1\125\1\105\1\60\1\125\1\120\1\122\3\105\1\124\6\60\1\105\1"+
        "\101\1\124\1\60\1\116\1\uffff\1\124\1\102\1\116\1\105\1\104\1\101"+
        "\1\uffff\1\105\6\60\6\uffff\1\124\1\123\1\60\1\uffff\1\103\1\60"+
        "\1\114\1\103\1\60\1\105\1\116\1\60\6\uffff\1\105\1\123\1\uffff\1"+
        "\105\1\uffff\1\105\1\124\1\uffff\2\60\1\uffff\1\122\1\105\1\117"+
        "\1\123\1\60\2\uffff\2\123\1\106\1\60\1\uffff\3\60\4\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\141\1\165\1\156\1\141\1\157\1\170\1\171\1\156\2\162\1"+
        "\141\1\150\1\162\1\150\1\157\1\165\1\162\1\75\1\46\3\75\1\163\1"+
        "\174\10\uffff\1\57\3\uffff\1\172\2\uffff\2\uffff\2\uffff\1\162\1"+
        "\uffff\1\142\1\154\1\157\1\164\1\160\1\162\1\163\1\165\1\143\1\157"+
        "\1\172\1\151\1\157\1\144\1\156\1\145\1\154\2\157\1\141\1\156\1\154"+
        "\1\151\1\165\11\uffff\1\172\23\uffff\1\141\1\143\1\145\1\162\1\164"+
        "\1\172\1\157\1\151\1\164\1\142\2\154\1\145\1\uffff\1\161\1\165\1"+
        "\145\1\147\1\162\1\163\1\141\1\155\1\162\1\147\1\154\1\163\1\145"+
        "\1\uffff\1\155\1\154\1\143\1\164\1\141\1\172\1\uffff\1\162\1\141"+
        "\1\151\1\154\1\165\1\145\1\172\1\165\1\160\1\162\3\145\1\164\6\172"+
        "\1\145\1\141\1\164\1\172\1\156\1\uffff\1\164\1\142\1\156\1\145\1"+
        "\144\1\141\1\uffff\1\145\6\172\6\uffff\1\164\1\163\1\172\1\uffff"+
        "\1\143\1\172\1\154\1\143\1\172\1\145\1\156\1\172\6\uffff\1\145\1"+
        "\163\1\uffff\1\145\1\uffff\1\145\1\164\1\uffff\2\172\1\uffff\1\162"+
        "\1\145\1\157\1\163\1\172\2\uffff\2\163\1\146\1\172\1\uffff\3\172"+
        "\4\uffff";
    static final String DFA12_acceptS =
        "\31\uffff\1\45\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\uffff\1\57\1"+
        "\60\1\64\1\uffff\1\65\1\66\2\uffff\1\72\1\73\1\uffff\1\65\30\uffff"+
        "\1\34\1\44\1\35\1\46\1\36\1\61\1\37\1\40\1\62\1\uffff\1\43\1\63"+
        "\1\45\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\70\1\71\1\56\1\57\1\60"+
        "\1\64\1\66\1\67\1\72\15\uffff\1\42\15\uffff\1\41\6\uffff\1\33\31"+
        "\uffff\1\24\6\uffff\1\25\7\uffff\1\23\1\26\1\27\1\30\1\31\1\32\3"+
        "\uffff\1\22\10\uffff\1\14\1\15\1\16\1\17\1\20\1\21\2\uffff\1\10"+
        "\1\uffff\1\13\2\uffff\1\12\2\uffff\1\11\5\uffff\1\6\1\7\4\uffff"+
        "\1\5\3\uffff\1\4\1\1\1\2\1\3";
    static final String DFA12_specialS =
        "\1\2\47\uffff\1\1\1\0\u00ba\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\22\1\50\2\53\1\31\1\23\1"+
            "\51\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\12\47\1\42\1\43"+
            "\1\24\1\25\1\26\2\53\1\27\1\7\1\16\1\5\1\6\1\15\1\11\1\46\1"+
            "\3\2\46\1\17\1\46\1\20\1\12\1\1\1\46\1\13\1\2\1\21\1\10\1\4"+
            "\1\14\3\46\3\53\1\45\1\46\1\53\1\27\1\7\1\16\1\5\1\6\1\15\1"+
            "\11\1\46\1\3\2\46\1\17\1\46\1\20\1\12\1\1\1\46\1\13\1\2\1\21"+
            "\1\10\1\4\1\14\3\46\1\53\1\30\1\53\1\44\uff81\53",
            "\1\54\37\uffff\1\54",
            "\1\57\2\uffff\1\60\14\uffff\1\56\17\uffff\1\57\2\uffff\1\60"+
            "\14\uffff\1\56",
            "\1\62\1\61\36\uffff\1\62\1\61",
            "\1\63\37\uffff\1\63",
            "\1\64\5\uffff\1\65\31\uffff\1\64\5\uffff\1\65",
            "\1\66\37\uffff\1\66",
            "\1\67\11\uffff\1\70\25\uffff\1\67\11\uffff\1\70",
            "\1\71\37\uffff\1\71",
            "\1\72\37\uffff\1\72",
            "\1\73\37\uffff\1\73",
            "\1\74\37\uffff\1\74",
            "\1\75\37\uffff\1\75",
            "\1\76\12\uffff\1\77\5\uffff\1\100\16\uffff\1\76\12\uffff\1"+
            "\77\5\uffff\1\100",
            "\1\101\37\uffff\1\101",
            "\1\102\37\uffff\1\102",
            "\1\103\37\uffff\1\103",
            "\1\104\11\uffff\1\105\25\uffff\1\104\11\uffff\1\105",
            "\1\106",
            "\1\110",
            "\1\112",
            "\1\114",
            "\1\115",
            "\1\117\37\uffff\1\117",
            "\1\120",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\132\4\uffff\1\133",
            "",
            "",
            "",
            "\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\0\141",
            "\0\141",
            "",
            "",
            "\1\143\37\uffff\1\143",
            "",
            "\1\144\37\uffff\1\144",
            "\1\145\37\uffff\1\145",
            "\1\146\37\uffff\1\146",
            "\1\147\1\150\36\uffff\1\147\1\150",
            "\1\151\37\uffff\1\151",
            "\1\152\37\uffff\1\152",
            "\1\153\37\uffff\1\153",
            "\1\154\37\uffff\1\154",
            "\1\155\37\uffff\1\155",
            "\1\156\37\uffff\1\156",
            "\12\55\7\uffff\23\55\1\157\6\55\4\uffff\1\55\1\uffff\23\55"+
            "\1\157\6\55",
            "\1\161\37\uffff\1\161",
            "\1\162\37\uffff\1\162",
            "\1\163\37\uffff\1\163",
            "\1\164\37\uffff\1\164",
            "\1\165\37\uffff\1\165",
            "\1\166\37\uffff\1\166",
            "\1\167\37\uffff\1\167",
            "\1\170\37\uffff\1\170",
            "\1\171\37\uffff\1\171",
            "\1\172\37\uffff\1\172",
            "\1\173\37\uffff\1\173",
            "\1\174\37\uffff\1\174",
            "\1\175\37\uffff\1\175",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
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
            "\1\177\37\uffff\1\177",
            "\1\u0080\37\uffff\1\u0080",
            "\1\u0081\37\uffff\1\u0081",
            "\1\u0082\37\uffff\1\u0082",
            "\1\u0083\37\uffff\1\u0083",
            "\12\55\7\uffff\16\55\1\u0084\13\55\4\uffff\1\55\1\uffff\16"+
            "\55\1\u0084\13\55",
            "\1\u0086\37\uffff\1\u0086",
            "\1\u0087\37\uffff\1\u0087",
            "\1\u0088\37\uffff\1\u0088",
            "\1\u0089\37\uffff\1\u0089",
            "\1\u008a\37\uffff\1\u008a",
            "\1\u008b\37\uffff\1\u008b",
            "\1\u008c\37\uffff\1\u008c",
            "",
            "\1\u008d\37\uffff\1\u008d",
            "\1\u008e\37\uffff\1\u008e",
            "\1\u008f\37\uffff\1\u008f",
            "\1\u0090\37\uffff\1\u0090",
            "\1\u0091\37\uffff\1\u0091",
            "\1\u0092\37\uffff\1\u0092",
            "\1\u0093\37\uffff\1\u0093",
            "\1\u0094\37\uffff\1\u0094",
            "\1\u0095\37\uffff\1\u0095",
            "\1\u0096\37\uffff\1\u0096",
            "\1\u0097\37\uffff\1\u0097",
            "\1\u0098\37\uffff\1\u0098",
            "\1\u0099\37\uffff\1\u0099",
            "",
            "\1\u009a\37\uffff\1\u009a",
            "\1\u009b\37\uffff\1\u009b",
            "\1\u009c\37\uffff\1\u009c",
            "\1\u009d\37\uffff\1\u009d",
            "\1\u009e\37\uffff\1\u009e",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00a0\37\uffff\1\u00a0",
            "\1\u00a1\37\uffff\1\u00a1",
            "\1\u00a2\37\uffff\1\u00a2",
            "\1\u00a3\37\uffff\1\u00a3",
            "\1\u00a4\37\uffff\1\u00a4",
            "\1\u00a5\37\uffff\1\u00a5",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00a7\37\uffff\1\u00a7",
            "\1\u00a8\37\uffff\1\u00a8",
            "\1\u00a9\37\uffff\1\u00a9",
            "\1\u00aa\37\uffff\1\u00aa",
            "\1\u00ab\37\uffff\1\u00ab",
            "\1\u00ac\37\uffff\1\u00ac",
            "\1\u00ad\37\uffff\1\u00ad",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00b4\37\uffff\1\u00b4",
            "\1\u00b5\37\uffff\1\u00b5",
            "\1\u00b6\37\uffff\1\u00b6",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00b8\37\uffff\1\u00b8",
            "",
            "\1\u00b9\37\uffff\1\u00b9",
            "\1\u00ba\37\uffff\1\u00ba",
            "\1\u00bb\37\uffff\1\u00bb",
            "\1\u00bc\37\uffff\1\u00bc",
            "\1\u00bd\37\uffff\1\u00bd",
            "\1\u00be\37\uffff\1\u00be",
            "",
            "\1\u00bf\37\uffff\1\u00bf",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c6\37\uffff\1\u00c6",
            "\1\u00c7\37\uffff\1\u00c7",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00c9\37\uffff\1\u00c9",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00cb\37\uffff\1\u00cb",
            "\1\u00cc\37\uffff\1\u00cc",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00ce\37\uffff\1\u00ce",
            "\1\u00cf\37\uffff\1\u00cf",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d1\37\uffff\1\u00d1",
            "\1\u00d2\37\uffff\1\u00d2",
            "",
            "\1\u00d3\37\uffff\1\u00d3",
            "",
            "\1\u00d4\37\uffff\1\u00d4",
            "\1\u00d5\37\uffff\1\u00d5",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00d8\37\uffff\1\u00d8",
            "\1\u00d9\37\uffff\1\u00d9",
            "\1\u00da\37\uffff\1\u00da",
            "\1\u00db\37\uffff\1\u00db",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\u00dd\37\uffff\1\u00dd",
            "\1\u00de\37\uffff\1\u00de",
            "\1\u00df\37\uffff\1\u00df",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
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
            return "1:1: Tokens : ( KEYWORD_50 | KEYWORD_51 | KEYWORD_52 | KEYWORD_49 | KEYWORD_48 | KEYWORD_46 | KEYWORD_47 | KEYWORD_42 | KEYWORD_43 | KEYWORD_44 | KEYWORD_45 | KEYWORD_35 | KEYWORD_36 | KEYWORD_37 | KEYWORD_38 | KEYWORD_39 | KEYWORD_40 | KEYWORD_41 | KEYWORD_27 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_33 | KEYWORD_34 | KEYWORD_26 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_41 = input.LA(1);

                        s = -1;
                        if ( ((LA12_41>='\u0000' && LA12_41<='\uFFFF')) ) {s = 97;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_40 = input.LA(1);

                        s = -1;
                        if ( ((LA12_40>='\u0000' && LA12_40<='\uFFFF')) ) {s = 97;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='P'||LA12_0=='p') ) {s = 1;}

                        else if ( (LA12_0=='S'||LA12_0=='s') ) {s = 2;}

                        else if ( (LA12_0=='I'||LA12_0=='i') ) {s = 3;}

                        else if ( (LA12_0=='V'||LA12_0=='v') ) {s = 4;}

                        else if ( (LA12_0=='D'||LA12_0=='d') ) {s = 5;}

                        else if ( (LA12_0=='E'||LA12_0=='e') ) {s = 6;}

                        else if ( (LA12_0=='B'||LA12_0=='b') ) {s = 7;}

                        else if ( (LA12_0=='U'||LA12_0=='u') ) {s = 8;}

                        else if ( (LA12_0=='G'||LA12_0=='g') ) {s = 9;}

                        else if ( (LA12_0=='O'||LA12_0=='o') ) {s = 10;}

                        else if ( (LA12_0=='R'||LA12_0=='r') ) {s = 11;}

                        else if ( (LA12_0=='W'||LA12_0=='w') ) {s = 12;}

                        else if ( (LA12_0=='F'||LA12_0=='f') ) {s = 13;}

                        else if ( (LA12_0=='C'||LA12_0=='c') ) {s = 14;}

                        else if ( (LA12_0=='L'||LA12_0=='l') ) {s = 15;}

                        else if ( (LA12_0=='N'||LA12_0=='n') ) {s = 16;}

                        else if ( (LA12_0=='T'||LA12_0=='t') ) {s = 17;}

                        else if ( (LA12_0=='!') ) {s = 18;}

                        else if ( (LA12_0=='&') ) {s = 19;}

                        else if ( (LA12_0=='<') ) {s = 20;}

                        else if ( (LA12_0=='=') ) {s = 21;}

                        else if ( (LA12_0=='>') ) {s = 22;}

                        else if ( (LA12_0=='A'||LA12_0=='a') ) {s = 23;}

                        else if ( (LA12_0=='|') ) {s = 24;}

                        else if ( (LA12_0=='%') ) {s = 25;}

                        else if ( (LA12_0=='(') ) {s = 26;}

                        else if ( (LA12_0==')') ) {s = 27;}

                        else if ( (LA12_0=='*') ) {s = 28;}

                        else if ( (LA12_0=='+') ) {s = 29;}

                        else if ( (LA12_0==',') ) {s = 30;}

                        else if ( (LA12_0=='-') ) {s = 31;}

                        else if ( (LA12_0=='.') ) {s = 32;}

                        else if ( (LA12_0=='/') ) {s = 33;}

                        else if ( (LA12_0==':') ) {s = 34;}

                        else if ( (LA12_0==';') ) {s = 35;}

                        else if ( (LA12_0=='~') ) {s = 36;}

                        else if ( (LA12_0=='^') ) {s = 37;}

                        else if ( (LA12_0=='H'||(LA12_0>='J' && LA12_0<='K')||LA12_0=='M'||LA12_0=='Q'||(LA12_0>='X' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='h'||(LA12_0>='j' && LA12_0<='k')||LA12_0=='m'||LA12_0=='q'||(LA12_0>='x' && LA12_0<='z')) ) {s = 38;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 39;}

                        else if ( (LA12_0=='\"') ) {s = 40;}

                        else if ( (LA12_0=='\'') ) {s = 41;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 42;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='$')||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='{'||LA12_0=='}'||(LA12_0>='\u007F' && LA12_0<='\uFFFF')) ) {s = 43;}

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