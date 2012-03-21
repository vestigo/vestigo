package org.nightlabs.jjqb.xtext.jdoql.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJDOQLLexer extends Lexer {
    public static final int RULE_ID=79;
    public static final int RULE_ANY_OTHER=85;
    public static final int KEYWORD_19=55;
    public static final int KEYWORD_56=20;
    public static final int KEYWORD_55=28;
    public static final int KEYWORD_17=78;
    public static final int KEYWORD_54=27;
    public static final int KEYWORD_18=54;
    public static final int KEYWORD_53=26;
    public static final int KEYWORD_15=76;
    public static final int KEYWORD_52=25;
    public static final int KEYWORD_16=77;
    public static final int KEYWORD_51=24;
    public static final int KEYWORD_13=74;
    public static final int KEYWORD_50=33;
    public static final int KEYWORD_14=75;
    public static final int KEYWORD_11=72;
    public static final int KEYWORD_12=73;
    public static final int EOF=-1;
    public static final int KEYWORD_10=71;
    public static final int KEYWORD_59=23;
    public static final int KEYWORD_58=22;
    public static final int KEYWORD_57=21;
    public static final int KEYWORD_6=67;
    public static final int KEYWORD_7=68;
    public static final int KEYWORD_8=69;
    public static final int KEYWORD_9=70;
    public static final int KEYWORD_28=53;
    public static final int KEYWORD_65=10;
    public static final int KEYWORD_64=9;
    public static final int KEYWORD_29=41;
    public static final int RULE_INT=80;
    public static final int KEYWORD_67=12;
    public static final int KEYWORD_66=11;
    public static final int KEYWORD_24=60;
    public static final int KEYWORD_61=17;
    public static final int KEYWORD_25=61;
    public static final int KEYWORD_60=16;
    public static final int KEYWORD_26=51;
    public static final int KEYWORD_63=19;
    public static final int KEYWORD_27=52;
    public static final int KEYWORD_62=18;
    public static final int KEYWORD_20=56;
    public static final int KEYWORD_21=57;
    public static final int KEYWORD_22=58;
    public static final int KEYWORD_23=59;
    public static final int KEYWORD_69=14;
    public static final int KEYWORD_68=13;
    public static final int KEYWORD_71=6;
    public static final int KEYWORD_72=7;
    public static final int KEYWORD_73=8;
    public static final int KEYWORD_74=5;
    public static final int KEYWORD_75=4;
    public static final int KEYWORD_1=62;
    public static final int KEYWORD_30=42;
    public static final int KEYWORD_5=66;
    public static final int KEYWORD_34=46;
    public static final int KEYWORD_4=65;
    public static final int KEYWORD_33=45;
    public static final int KEYWORD_3=64;
    public static final int KEYWORD_32=44;
    public static final int KEYWORD_70=15;
    public static final int KEYWORD_2=63;
    public static final int KEYWORD_31=43;
    public static final int KEYWORD_38=50;
    public static final int RULE_SL_COMMENT=83;
    public static final int KEYWORD_37=49;
    public static final int KEYWORD_36=48;
    public static final int KEYWORD_35=47;
    public static final int RULE_ML_COMMENT=82;
    public static final int KEYWORD_39=34;
    public static final int RULE_STRING=81;
    public static final int KEYWORD_41=36;
    public static final int KEYWORD_40=35;
    public static final int KEYWORD_43=38;
    public static final int KEYWORD_42=37;
    public static final int KEYWORD_45=40;
    public static final int KEYWORD_44=39;
    public static final int RULE_WS=84;
    public static final int KEYWORD_47=30;
    public static final int KEYWORD_46=29;
    public static final int KEYWORD_49=32;
    public static final int KEYWORD_48=31;

    // delegates
    // delegators

    public InternalJDOQLLexer() {;} 
    public InternalJDOQLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJDOQLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g"; }

    // $ANTLR start "KEYWORD_75"
    public final void mKEYWORD_75() throws RecognitionException {
        try {
            int _type = KEYWORD_75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:19:12: ( ( 'J' | 'j' ) ( 'D' | 'd' ) ( 'O' | 'o' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) '.' ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'B' | 'b' ) ( 'J' | 'j' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:19:14: ( 'J' | 'j' ) ( 'D' | 'd' ) ( 'O' | 'o' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) '.' ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'B' | 'b' ) ( 'J' | 'j' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
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

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
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

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
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

            match('.'); 
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

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
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

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
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
    // $ANTLR end "KEYWORD_75"

    // $ANTLR start "KEYWORD_74"
    public final void mKEYWORD_74() throws RecognitionException {
        try {
            int _type = KEYWORD_74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:21:12: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:21:14: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'E' | 'e' )
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
    // $ANTLR end "KEYWORD_74"

    // $ANTLR start "KEYWORD_71"
    public final void mKEYWORD_71() throws RecognitionException {
        try {
            int _type = KEYWORD_71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:23:12: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'K' | 'k' ) ( 'E' | 'e' ) ( 'Y' | 'y' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:23:14: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'K' | 'k' ) ( 'E' | 'e' ) ( 'Y' | 'y' )
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
    // $ANTLR end "KEYWORD_71"

    // $ANTLR start "KEYWORD_72"
    public final void mKEYWORD_72() throws RecognitionException {
        try {
            int _type = KEYWORD_72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:25:12: ( ( 'T' | 't' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'W' | 'w' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:25:14: ( 'T' | 't' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'W' | 'w' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
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
    // $ANTLR end "KEYWORD_72"

    // $ANTLR start "KEYWORD_73"
    public final void mKEYWORD_73() throws RecognitionException {
        try {
            int _type = KEYWORD_73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:27:12: ( ( 'T' | 't' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:27:14: ( 'T' | 't' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
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
    // $ANTLR end "KEYWORD_73"

    // $ANTLR start "KEYWORD_64"
    public final void mKEYWORD_64() throws RecognitionException {
        try {
            int _type = KEYWORD_64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:29:12: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:29:14: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
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
    // $ANTLR end "KEYWORD_64"

    // $ANTLR start "KEYWORD_65"
    public final void mKEYWORD_65() throws RecognitionException {
        try {
            int _type = KEYWORD_65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:31:12: ( ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'S' | 's' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:31:14: ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'S' | 's' )
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
    // $ANTLR end "KEYWORD_65"

    // $ANTLR start "KEYWORD_66"
    public final void mKEYWORD_66() throws RecognitionException {
        try {
            int _type = KEYWORD_66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:33:12: ( ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:33:14: ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' )
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
    // $ANTLR end "KEYWORD_66"

    // $ANTLR start "KEYWORD_67"
    public final void mKEYWORD_67() throws RecognitionException {
        try {
            int _type = KEYWORD_67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:35:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'O' | 'o' ) ( 'F' | 'f' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:35:14: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'O' | 'o' ) ( 'F' | 'f' )
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
    // $ANTLR end "KEYWORD_67"

    // $ANTLR start "KEYWORD_68"
    public final void mKEYWORD_68() throws RecognitionException {
        try {
            int _type = KEYWORD_68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:37:12: ( ( 'J' | 'j' ) ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'A' | 'a' ) '.' ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) '.' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:37:14: ( 'J' | 'j' ) ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'A' | 'a' ) '.' ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) '.'
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
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

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('.'); 
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

            match('.'); 

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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:39:12: ( ( 'J' | 'j' ) ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'X' | 'x' ) '.' ( 'J' | 'j' ) ( 'D' | 'd' ) ( 'O' | 'o' ) '.' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:39:14: ( 'J' | 'j' ) ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'X' | 'x' ) '.' ( 'J' | 'j' ) ( 'D' | 'd' ) ( 'O' | 'o' ) '.'
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
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

            match('.'); 
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
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

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_69"

    // $ANTLR start "KEYWORD_70"
    public final void mKEYWORD_70() throws RecognitionException {
        try {
            int _type = KEYWORD_70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:41:12: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'S' | 's' ) ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'H' | 'h' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:41:14: ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'S' | 's' ) ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'H' | 'h' )
            {
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

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
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

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
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
    // $ANTLR end "KEYWORD_70"

    // $ANTLR start "KEYWORD_60"
    public final void mKEYWORD_60() throws RecognitionException {
        try {
            int _type = KEYWORD_60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:43:12: ( ( 'A' | 'a' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:43:14: ( 'A' | 'a' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
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
    // $ANTLR end "KEYWORD_60"

    // $ANTLR start "KEYWORD_61"
    public final void mKEYWORD_61() throws RecognitionException {
        try {
            int _type = KEYWORD_61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:45:12: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'H' | 'h' ) '.' ( 'S' | 's' ) ( 'Q' | 'q' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:45:14: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'H' | 'h' ) '.' ( 'S' | 's' ) ( 'Q' | 'q' ) ( 'R' | 'r' ) ( 'T' | 't' )
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

            match('.'); 
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
    // $ANTLR end "KEYWORD_61"

    // $ANTLR start "KEYWORD_62"
    public final void mKEYWORD_62() throws RecognitionException {
        try {
            int _type = KEYWORD_62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:47:12: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:47:14: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'S' | 's' )
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
    // $ANTLR end "KEYWORD_62"

    // $ANTLR start "KEYWORD_63"
    public final void mKEYWORD_63() throws RecognitionException {
        try {
            int _type = KEYWORD_63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:49:12: ( ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:49:14: ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
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

    // $ANTLR start "KEYWORD_56"
    public final void mKEYWORD_56() throws RecognitionException {
        try {
            int _type = KEYWORD_56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:51:12: ( ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:51:14: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' )
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
    // $ANTLR end "KEYWORD_56"

    // $ANTLR start "KEYWORD_57"
    public final void mKEYWORD_57() throws RecognitionException {
        try {
            int _type = KEYWORD_57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:53:12: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'H' | 'h' ) '.' ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'S' | 's' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:53:14: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'H' | 'h' ) '.' ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'S' | 's' )
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

            match('.'); 
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
    // $ANTLR end "KEYWORD_57"

    // $ANTLR start "KEYWORD_58"
    public final void mKEYWORD_58() throws RecognitionException {
        try {
            int _type = KEYWORD_58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:55:12: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:55:14: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' )
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:57:12: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'S' | 's' ) ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'H' | 'h' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:57:14: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'S' | 's' ) ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'H' | 'h' )
            {
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

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
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

            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
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
    // $ANTLR end "KEYWORD_59"

    // $ANTLR start "KEYWORD_51"
    public final void mKEYWORD_51() throws RecognitionException {
        try {
            int _type = KEYWORD_51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:59:12: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'D' | 'd' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:59:14: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'D' | 'd' ) ( 'E' | 'e' )
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
    // $ANTLR end "KEYWORD_51"

    // $ANTLR start "KEYWORD_52"
    public final void mKEYWORD_52() throws RecognitionException {
        try {
            int _type = KEYWORD_52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:61:12: ( ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'N' | 'n' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:61:14: ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'N' | 'n' )
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
    // $ANTLR end "KEYWORD_52"

    // $ANTLR start "KEYWORD_53"
    public final void mKEYWORD_53() throws RecognitionException {
        try {
            int _type = KEYWORD_53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:63:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'O' | 'o' ) ( 'F' | 'f' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:63:14: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'O' | 'o' ) ( 'F' | 'f' )
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

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
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
    // $ANTLR end "KEYWORD_53"

    // $ANTLR start "KEYWORD_54"
    public final void mKEYWORD_54() throws RecognitionException {
        try {
            int _type = KEYWORD_54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:65:12: ( ( 'I' | 'i' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'Y' | 'y' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:65:14: ( 'I' | 'i' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'Y' | 'y' )
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
    // $ANTLR end "KEYWORD_54"

    // $ANTLR start "KEYWORD_55"
    public final void mKEYWORD_55() throws RecognitionException {
        try {
            int _type = KEYWORD_55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:67:12: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:67:14: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'S' | 's' )
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
    // $ANTLR end "KEYWORD_55"

    // $ANTLR start "KEYWORD_46"
    public final void mKEYWORD_46() throws RecognitionException {
        try {
            int _type = KEYWORD_46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:69:12: ( ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:69:14: ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
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
    // $ANTLR end "KEYWORD_46"

    // $ANTLR start "KEYWORD_47"
    public final void mKEYWORD_47() throws RecognitionException {
        try {
            int _type = KEYWORD_47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:71:12: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:71:14: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
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
    // $ANTLR end "KEYWORD_47"

    // $ANTLR start "KEYWORD_48"
    public final void mKEYWORD_48() throws RecognitionException {
        try {
            int _type = KEYWORD_48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:73:12: ( ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:73:14: ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'E' | 'e' )
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
    // $ANTLR end "KEYWORD_48"

    // $ANTLR start "KEYWORD_49"
    public final void mKEYWORD_49() throws RecognitionException {
        try {
            int _type = KEYWORD_49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:75:12: ( ( 'D' | 'd' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:75:14: ( 'D' | 'd' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' )
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
    // $ANTLR end "KEYWORD_49"

    // $ANTLR start "KEYWORD_50"
    public final void mKEYWORD_50() throws RecognitionException {
        try {
            int _type = KEYWORD_50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:77:12: ( ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:77:14: ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' )
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
    // $ANTLR end "KEYWORD_50"

    // $ANTLR start "KEYWORD_39"
    public final void mKEYWORD_39() throws RecognitionException {
        try {
            int _type = KEYWORD_39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:79:12: ( ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:79:14: ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' )
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
    // $ANTLR end "KEYWORD_39"

    // $ANTLR start "KEYWORD_40"
    public final void mKEYWORD_40() throws RecognitionException {
        try {
            int _type = KEYWORD_40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:81:12: ( ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:81:14: ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' )
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
    // $ANTLR end "KEYWORD_40"

    // $ANTLR start "KEYWORD_41"
    public final void mKEYWORD_41() throws RecognitionException {
        try {
            int _type = KEYWORD_41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:83:12: ( ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:83:14: ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'E' | 'e' )
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
    // $ANTLR end "KEYWORD_41"

    // $ANTLR start "KEYWORD_42"
    public final void mKEYWORD_42() throws RecognitionException {
        try {
            int _type = KEYWORD_42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:85:12: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:85:14: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' )
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
    // $ANTLR end "KEYWORD_42"

    // $ANTLR start "KEYWORD_43"
    public final void mKEYWORD_43() throws RecognitionException {
        try {
            int _type = KEYWORD_43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:87:12: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:87:14: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:89:12: ( ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'T' | 't' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:89:14: ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'T' | 't' )
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
    // $ANTLR end "KEYWORD_44"

    // $ANTLR start "KEYWORD_45"
    public final void mKEYWORD_45() throws RecognitionException {
        try {
            int _type = KEYWORD_45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:91:12: ( ( 'S' | 's' ) ( 'H' | 'h' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:91:14: ( 'S' | 's' ) ( 'H' | 'h' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' )
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
    // $ANTLR end "KEYWORD_45"

    // $ANTLR start "KEYWORD_29"
    public final void mKEYWORD_29() throws RecognitionException {
        try {
            int _type = KEYWORD_29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:93:12: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:93:14: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' )
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
    // $ANTLR end "KEYWORD_29"

    // $ANTLR start "KEYWORD_30"
    public final void mKEYWORD_30() throws RecognitionException {
        try {
            int _type = KEYWORD_30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:95:12: ( ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:95:14: ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' )
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
    // $ANTLR end "KEYWORD_30"

    // $ANTLR start "KEYWORD_31"
    public final void mKEYWORD_31() throws RecognitionException {
        try {
            int _type = KEYWORD_31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:97:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:97:14: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' )
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
    // $ANTLR end "KEYWORD_31"

    // $ANTLR start "KEYWORD_32"
    public final void mKEYWORD_32() throws RecognitionException {
        try {
            int _type = KEYWORD_32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:99:12: ( ( 'B' | 'b' ) ( 'Y' | 'y' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:99:14: ( 'B' | 'b' ) ( 'Y' | 'y' ) ( 'T' | 't' ) ( 'E' | 'e' )
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
    // $ANTLR end "KEYWORD_32"

    // $ANTLR start "KEYWORD_33"
    public final void mKEYWORD_33() throws RecognitionException {
        try {
            int _type = KEYWORD_33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:101:12: ( ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:101:14: ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'R' | 'r' )
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
    // $ANTLR end "KEYWORD_33"

    // $ANTLR start "KEYWORD_34"
    public final void mKEYWORD_34() throws RecognitionException {
        try {
            int _type = KEYWORD_34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:103:12: ( ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:103:14: ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'G' | 'g' )
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
    // $ANTLR end "KEYWORD_34"

    // $ANTLR start "KEYWORD_35"
    public final void mKEYWORD_35() throws RecognitionException {
        try {
            int _type = KEYWORD_35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:105:12: ( ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:105:14: ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' )
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
    // $ANTLR end "KEYWORD_35"

    // $ANTLR start "KEYWORD_36"
    public final void mKEYWORD_36() throws RecognitionException {
        try {
            int _type = KEYWORD_36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:107:12: ( ( 'S' | 's' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:107:14: ( 'S' | 's' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'E' | 'e' )
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
    // $ANTLR end "KEYWORD_36"

    // $ANTLR start "KEYWORD_37"
    public final void mKEYWORD_37() throws RecognitionException {
        try {
            int _type = KEYWORD_37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:109:12: ( ( 'T' | 't' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'S' | 's' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:109:14: ( 'T' | 't' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'S' | 's' )
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
    // $ANTLR end "KEYWORD_37"

    // $ANTLR start "KEYWORD_38"
    public final void mKEYWORD_38() throws RecognitionException {
        try {
            int _type = KEYWORD_38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:111:12: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:111:14: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )
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
    // $ANTLR end "KEYWORD_38"

    // $ANTLR start "KEYWORD_26"
    public final void mKEYWORD_26() throws RecognitionException {
        try {
            int _type = KEYWORD_26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:113:12: ( ( 'A' | 'a' ) ( 'S' | 's' ) ( 'C' | 'c' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:113:14: ( 'A' | 'a' ) ( 'S' | 's' ) ( 'C' | 'c' )
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:115:12: ( ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'T' | 't' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:115:14: ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'T' | 't' )
            {
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
    // $ANTLR end "KEYWORD_27"

    // $ANTLR start "KEYWORD_28"
    public final void mKEYWORD_28() throws RecognitionException {
        try {
            int _type = KEYWORD_28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:117:12: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:117:14: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' )
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
    // $ANTLR end "KEYWORD_28"

    // $ANTLR start "KEYWORD_18"
    public final void mKEYWORD_18() throws RecognitionException {
        try {
            int _type = KEYWORD_18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:119:12: ( '!' '=' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:119:14: '!' '='
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:121:12: ( '&' '&' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:121:14: '&' '&'
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:123:12: ( '<' '=' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:123:14: '<' '='
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:125:12: ( '=' '=' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:125:14: '=' '='
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:127:12: ( '>' '=' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:127:14: '>' '='
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:129:12: ( ( 'A' | 'a' ) ( 'S' | 's' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:129:14: ( 'A' | 'a' ) ( 'S' | 's' )
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:131:12: ( ( 'B' | 'b' ) ( 'Y' | 'y' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:131:14: ( 'B' | 'b' ) ( 'Y' | 'y' )
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:133:12: ( '|' '|' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:133:14: '|' '|'
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:135:11: ( '!' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:135:13: '!'
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:137:11: ( '%' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:137:13: '%'
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:139:11: ( '&' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:139:13: '&'
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:141:11: ( '(' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:141:13: '('
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:143:11: ( ')' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:143:13: ')'
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:145:11: ( '*' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:145:13: '*'
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:147:11: ( '+' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:147:13: '+'
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:149:11: ( ',' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:149:13: ','
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:151:11: ( '-' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:151:13: '-'
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:153:12: ( '.' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:153:14: '.'
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:155:12: ( '/' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:155:14: '/'
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:157:12: ( ':' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:157:14: ':'
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:159:12: ( ';' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:159:14: ';'
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:161:12: ( '<' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:161:14: '<'
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:163:12: ( '>' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:163:14: '>'
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:165:12: ( '|' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:165:14: '|'
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:167:12: ( '~' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:167:14: '~'
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:171:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:171:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:171:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:171:11: '^'
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

            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:171:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:173:10: ( ( '0' .. '9' )+ )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:173:12: ( '0' .. '9' )+
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:173:12: ( '0' .. '9' )+
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
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:173:13: '0' .. '9'
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:175:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:175:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:175:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:175:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:175:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:175:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:175:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:175:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:175:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:175:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:175:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:177:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:177:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:177:24: ( options {greedy=false; } : . )*
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
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:177:52: .
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:179:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:179:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:179:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:179:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:179:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:179:41: ( '\\r' )? '\\n'
                    {
                    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:179:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:179:41: '\\r'
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:181:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:181:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:181:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:
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
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:183:16: ( . )
            // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:183:18: .
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
        // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:8: ( KEYWORD_75 | KEYWORD_74 | KEYWORD_71 | KEYWORD_72 | KEYWORD_73 | KEYWORD_64 | KEYWORD_65 | KEYWORD_66 | KEYWORD_67 | KEYWORD_68 | KEYWORD_69 | KEYWORD_70 | KEYWORD_60 | KEYWORD_61 | KEYWORD_62 | KEYWORD_63 | KEYWORD_56 | KEYWORD_57 | KEYWORD_58 | KEYWORD_59 | KEYWORD_51 | KEYWORD_52 | KEYWORD_53 | KEYWORD_54 | KEYWORD_55 | KEYWORD_46 | KEYWORD_47 | KEYWORD_48 | KEYWORD_49 | KEYWORD_50 | KEYWORD_39 | KEYWORD_40 | KEYWORD_41 | KEYWORD_42 | KEYWORD_43 | KEYWORD_44 | KEYWORD_45 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_33 | KEYWORD_34 | KEYWORD_35 | KEYWORD_36 | KEYWORD_37 | KEYWORD_38 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=82;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:10: KEYWORD_75
                {
                mKEYWORD_75(); 

                }
                break;
            case 2 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:21: KEYWORD_74
                {
                mKEYWORD_74(); 

                }
                break;
            case 3 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:32: KEYWORD_71
                {
                mKEYWORD_71(); 

                }
                break;
            case 4 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:43: KEYWORD_72
                {
                mKEYWORD_72(); 

                }
                break;
            case 5 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:54: KEYWORD_73
                {
                mKEYWORD_73(); 

                }
                break;
            case 6 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:65: KEYWORD_64
                {
                mKEYWORD_64(); 

                }
                break;
            case 7 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:76: KEYWORD_65
                {
                mKEYWORD_65(); 

                }
                break;
            case 8 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:87: KEYWORD_66
                {
                mKEYWORD_66(); 

                }
                break;
            case 9 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:98: KEYWORD_67
                {
                mKEYWORD_67(); 

                }
                break;
            case 10 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:109: KEYWORD_68
                {
                mKEYWORD_68(); 

                }
                break;
            case 11 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:120: KEYWORD_69
                {
                mKEYWORD_69(); 

                }
                break;
            case 12 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:131: KEYWORD_70
                {
                mKEYWORD_70(); 

                }
                break;
            case 13 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:142: KEYWORD_60
                {
                mKEYWORD_60(); 

                }
                break;
            case 14 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:153: KEYWORD_61
                {
                mKEYWORD_61(); 

                }
                break;
            case 15 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:164: KEYWORD_62
                {
                mKEYWORD_62(); 

                }
                break;
            case 16 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:175: KEYWORD_63
                {
                mKEYWORD_63(); 

                }
                break;
            case 17 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:186: KEYWORD_56
                {
                mKEYWORD_56(); 

                }
                break;
            case 18 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:197: KEYWORD_57
                {
                mKEYWORD_57(); 

                }
                break;
            case 19 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:208: KEYWORD_58
                {
                mKEYWORD_58(); 

                }
                break;
            case 20 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:219: KEYWORD_59
                {
                mKEYWORD_59(); 

                }
                break;
            case 21 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:230: KEYWORD_51
                {
                mKEYWORD_51(); 

                }
                break;
            case 22 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:241: KEYWORD_52
                {
                mKEYWORD_52(); 

                }
                break;
            case 23 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:252: KEYWORD_53
                {
                mKEYWORD_53(); 

                }
                break;
            case 24 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:263: KEYWORD_54
                {
                mKEYWORD_54(); 

                }
                break;
            case 25 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:274: KEYWORD_55
                {
                mKEYWORD_55(); 

                }
                break;
            case 26 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:285: KEYWORD_46
                {
                mKEYWORD_46(); 

                }
                break;
            case 27 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:296: KEYWORD_47
                {
                mKEYWORD_47(); 

                }
                break;
            case 28 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:307: KEYWORD_48
                {
                mKEYWORD_48(); 

                }
                break;
            case 29 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:318: KEYWORD_49
                {
                mKEYWORD_49(); 

                }
                break;
            case 30 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:329: KEYWORD_50
                {
                mKEYWORD_50(); 

                }
                break;
            case 31 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:340: KEYWORD_39
                {
                mKEYWORD_39(); 

                }
                break;
            case 32 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:351: KEYWORD_40
                {
                mKEYWORD_40(); 

                }
                break;
            case 33 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:362: KEYWORD_41
                {
                mKEYWORD_41(); 

                }
                break;
            case 34 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:373: KEYWORD_42
                {
                mKEYWORD_42(); 

                }
                break;
            case 35 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:384: KEYWORD_43
                {
                mKEYWORD_43(); 

                }
                break;
            case 36 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:395: KEYWORD_44
                {
                mKEYWORD_44(); 

                }
                break;
            case 37 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:406: KEYWORD_45
                {
                mKEYWORD_45(); 

                }
                break;
            case 38 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:417: KEYWORD_29
                {
                mKEYWORD_29(); 

                }
                break;
            case 39 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:428: KEYWORD_30
                {
                mKEYWORD_30(); 

                }
                break;
            case 40 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:439: KEYWORD_31
                {
                mKEYWORD_31(); 

                }
                break;
            case 41 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:450: KEYWORD_32
                {
                mKEYWORD_32(); 

                }
                break;
            case 42 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:461: KEYWORD_33
                {
                mKEYWORD_33(); 

                }
                break;
            case 43 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:472: KEYWORD_34
                {
                mKEYWORD_34(); 

                }
                break;
            case 44 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:483: KEYWORD_35
                {
                mKEYWORD_35(); 

                }
                break;
            case 45 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:494: KEYWORD_36
                {
                mKEYWORD_36(); 

                }
                break;
            case 46 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:505: KEYWORD_37
                {
                mKEYWORD_37(); 

                }
                break;
            case 47 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:516: KEYWORD_38
                {
                mKEYWORD_38(); 

                }
                break;
            case 48 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:527: KEYWORD_26
                {
                mKEYWORD_26(); 

                }
                break;
            case 49 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:538: KEYWORD_27
                {
                mKEYWORD_27(); 

                }
                break;
            case 50 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:549: KEYWORD_28
                {
                mKEYWORD_28(); 

                }
                break;
            case 51 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:560: KEYWORD_18
                {
                mKEYWORD_18(); 

                }
                break;
            case 52 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:571: KEYWORD_19
                {
                mKEYWORD_19(); 

                }
                break;
            case 53 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:582: KEYWORD_20
                {
                mKEYWORD_20(); 

                }
                break;
            case 54 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:593: KEYWORD_21
                {
                mKEYWORD_21(); 

                }
                break;
            case 55 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:604: KEYWORD_22
                {
                mKEYWORD_22(); 

                }
                break;
            case 56 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:615: KEYWORD_23
                {
                mKEYWORD_23(); 

                }
                break;
            case 57 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:626: KEYWORD_24
                {
                mKEYWORD_24(); 

                }
                break;
            case 58 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:637: KEYWORD_25
                {
                mKEYWORD_25(); 

                }
                break;
            case 59 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:648: KEYWORD_1
                {
                mKEYWORD_1(); 

                }
                break;
            case 60 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:658: KEYWORD_2
                {
                mKEYWORD_2(); 

                }
                break;
            case 61 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:668: KEYWORD_3
                {
                mKEYWORD_3(); 

                }
                break;
            case 62 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:678: KEYWORD_4
                {
                mKEYWORD_4(); 

                }
                break;
            case 63 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:688: KEYWORD_5
                {
                mKEYWORD_5(); 

                }
                break;
            case 64 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:698: KEYWORD_6
                {
                mKEYWORD_6(); 

                }
                break;
            case 65 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:708: KEYWORD_7
                {
                mKEYWORD_7(); 

                }
                break;
            case 66 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:718: KEYWORD_8
                {
                mKEYWORD_8(); 

                }
                break;
            case 67 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:728: KEYWORD_9
                {
                mKEYWORD_9(); 

                }
                break;
            case 68 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:738: KEYWORD_10
                {
                mKEYWORD_10(); 

                }
                break;
            case 69 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:749: KEYWORD_11
                {
                mKEYWORD_11(); 

                }
                break;
            case 70 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:760: KEYWORD_12
                {
                mKEYWORD_12(); 

                }
                break;
            case 71 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:771: KEYWORD_13
                {
                mKEYWORD_13(); 

                }
                break;
            case 72 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:782: KEYWORD_14
                {
                mKEYWORD_14(); 

                }
                break;
            case 73 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:793: KEYWORD_15
                {
                mKEYWORD_15(); 

                }
                break;
            case 74 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:804: KEYWORD_16
                {
                mKEYWORD_16(); 

                }
                break;
            case 75 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:815: KEYWORD_17
                {
                mKEYWORD_17(); 

                }
                break;
            case 76 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:826: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 77 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:834: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 78 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:843: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 79 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:855: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 80 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:871: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 81 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:887: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 82 :
                // ../org.nightlabs.jjqb.xtext.jdoql.ui/src-gen/org/nightlabs/jjqb/xtext/jdoql/ui/contentassist/antlr/lexer/InternalJDOQLLexer.g:1:895: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\25\61\1\127\1\131\1\133\1\56\1\136\1\140\10\uffff\1\153"+
        "\3\uffff\1\56\2\uffff\2\56\2\uffff\2\61\1\uffff\21\61\1\u0089\5"+
        "\61\1\u0090\14\61\34\uffff\23\61\1\u00b2\2\61\1\u00b6\1\uffff\6"+
        "\61\1\uffff\3\61\1\u00c1\13\61\1\u00ce\2\61\1\u00d1\1\u00d2\1\u00d4"+
        "\10\61\1\u00dd\2\61\1\u00e0\1\uffff\3\61\1\uffff\6\61\1\u00ea\3"+
        "\61\1\uffff\5\61\1\u00f3\1\u00f4\1\u00f5\1\61\1\uffff\2\61\1\uffff"+
        "\2\61\2\uffff\1\61\1\uffff\7\61\1\u0103\1\uffff\2\61\1\uffff\3\61"+
        "\1\uffff\5\61\1\uffff\2\61\1\u0112\1\u0113\1\u0114\1\u0115\1\u0116"+
        "\1\u0117\3\uffff\1\61\1\uffff\5\61\1\u011e\4\61\1\u0123\1\uffff"+
        "\3\61\1\u0127\1\61\2\uffff\5\61\1\u012e\1\u012f\6\uffff\6\61\1\uffff"+
        "\4\61\1\uffff\1\61\1\u013b\1\u013c\1\uffff\1\61\1\u013e\2\61\1\u0141"+
        "\1\u0142\2\uffff\1\61\1\u0146\3\61\1\u014a\5\61\2\uffff\1\61\1\uffff"+
        "\1\61\1\u0152\2\uffff\3\61\1\uffff\3\61\1\uffff\2\61\1\u015b\2\61"+
        "\1\u015e\1\u015f\2\uffff\4\61\1\u0164\1\u0165\1\u0166\1\uffff\1"+
        "\u0167\1\u0168\2\uffff\1\61\1\u016a\1\u016b\1\u016c\5\uffff\1\61"+
        "\3\uffff\1\u016e\1\uffff";
    static final String DFA12_eofS =
        "\u016f\uffff";
    static final String DFA12_minS =
        "\1\0\1\101\2\110\1\105\1\101\1\105\1\115\1\123\2\101\1\116\1\117"+
        "\1\101\1\116\1\105\1\122\1\101\1\110\1\101\1\117\1\125\1\75\1\46"+
        "\3\75\1\174\10\uffff\1\52\3\uffff\1\101\2\uffff\2\0\2\uffff\1\117"+
        "\1\126\1\uffff\1\116\1\101\1\114\1\111\1\125\2\123\1\125\1\122\1"+
        "\102\1\101\1\114\1\117\1\132\1\104\1\105\1\120\1\60\1\124\1\122"+
        "\1\104\1\103\1\117\1\60\1\126\1\111\1\117\1\124\1\104\1\116\1\105"+
        "\1\114\2\117\1\116\1\114\34\uffff\1\110\1\101\1\124\1\122\1\117"+
        "\1\120\1\123\1\105\1\103\1\124\1\102\1\101\1\103\1\122\1\105\1\122"+
        "\1\105\1\124\1\105\1\60\1\115\1\117\1\60\1\uffff\1\103\1\111\1\123"+
        "\2\114\1\105\1\uffff\1\111\1\121\1\125\1\60\1\105\1\107\1\122\1"+
        "\123\1\101\1\115\1\107\1\114\1\105\1\56\1\101\1\60\1\127\1\120\3"+
        "\60\1\111\1\114\1\115\1\114\2\124\1\103\1\124\1\60\1\101\1\130\1"+
        "\60\1\uffff\1\120\1\122\1\116\1\uffff\1\56\1\110\1\101\1\127\1\125"+
        "\1\105\1\60\1\116\1\125\1\120\1\uffff\1\122\3\105\1\124\3\60\1\114"+
        "\1\uffff\1\56\1\111\1\uffff\2\105\2\uffff\1\116\1\uffff\1\116\2"+
        "\105\1\101\1\122\1\123\1\124\1\60\1\uffff\1\116\1\117\1\uffff\2"+
        "\124\1\104\1\101\1\105\1\102\1\111\1\104\1\101\1\uffff\1\107\1\105"+
        "\6\60\3\uffff\1\120\1\uffff\1\116\2\122\1\104\1\103\1\60\1\124\1"+
        "\123\1\111\1\127\1\60\1\uffff\1\103\1\106\1\131\1\60\1\111\2\uffff"+
        "\1\123\1\114\1\124\1\105\1\116\2\60\6\uffff\1\105\1\123\2\103\1"+
        "\111\1\124\1\uffff\1\105\1\123\1\116\1\111\1\uffff\1\105\2\60\1"+
        "\uffff\1\116\1\60\1\105\1\110\2\60\2\uffff\1\122\1\60\2\101\1\116"+
        "\1\60\1\122\1\105\1\107\1\124\1\117\2\uffff\1\107\1\uffff\1\123"+
        "\1\60\2\uffff\1\56\1\101\1\105\1\uffff\2\123\1\107\1\uffff\2\123"+
        "\1\60\1\110\1\106\2\60\2\uffff\1\114\1\131\2\105\3\60\1\uffff\2"+
        "\60\2\uffff\1\125\3\60\5\uffff\1\105\3\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\144\1\157\1\162\1\157\1\141\1\165\2\163\2\141\1\170\1"+
        "\171\1\141\1\156\2\162\1\141\1\150\1\162\1\157\1\165\1\75\1\46\3"+
        "\75\1\174\10\uffff\1\57\3\uffff\1\172\2\uffff\2\uffff\2\uffff\1"+
        "\157\1\166\1\uffff\1\156\1\141\1\165\1\151\1\165\2\163\1\165\1\162"+
        "\1\142\1\141\1\154\1\157\1\172\1\164\1\145\1\160\1\172\1\164\1\162"+
        "\1\144\1\143\1\157\1\172\1\166\1\151\1\157\1\164\1\144\1\156\1\145"+
        "\1\154\2\157\1\156\1\154\34\uffff\1\150\1\141\1\164\1\162\1\157"+
        "\1\160\1\163\1\145\1\143\1\164\1\142\1\141\1\163\1\162\1\145\1\162"+
        "\1\145\1\164\1\145\1\172\1\155\1\157\1\172\1\uffff\1\150\1\151\1"+
        "\163\2\154\1\145\1\uffff\1\151\1\161\1\165\1\172\1\145\1\147\1\162"+
        "\1\163\1\141\1\155\1\147\1\154\1\145\1\170\1\141\1\172\1\167\1\160"+
        "\3\172\1\151\1\154\1\155\1\154\2\164\1\143\1\164\1\172\1\141\1\170"+
        "\1\172\1\uffff\1\160\1\162\1\156\1\uffff\1\56\1\150\1\141\1\167"+
        "\1\165\1\145\1\172\1\156\1\165\1\160\1\uffff\1\162\3\145\1\164\3"+
        "\172\1\154\1\uffff\1\56\1\151\1\uffff\2\145\2\uffff\1\156\1\uffff"+
        "\1\156\2\145\1\141\1\162\1\163\1\164\1\172\1\uffff\1\156\1\157\1"+
        "\uffff\2\164\1\144\1\163\1\145\1\142\1\151\1\144\1\141\1\uffff\1"+
        "\147\1\145\6\172\3\uffff\1\160\1\uffff\1\156\2\162\1\144\1\143\1"+
        "\172\1\164\1\163\1\151\1\167\1\172\1\uffff\1\143\1\146\1\171\1\172"+
        "\1\151\2\uffff\1\163\1\154\1\164\1\145\1\156\2\172\6\uffff\1\145"+
        "\1\163\2\143\1\151\1\164\1\uffff\1\145\1\163\1\156\1\151\1\uffff"+
        "\1\145\2\172\1\uffff\1\156\1\172\1\145\1\150\2\172\2\uffff\1\162"+
        "\1\172\2\141\1\156\1\172\1\162\1\145\1\147\1\164\1\157\2\uffff\1"+
        "\147\1\uffff\1\163\1\172\2\uffff\1\56\1\141\1\145\1\uffff\2\163"+
        "\1\147\1\uffff\2\163\1\172\1\150\1\146\2\172\2\uffff\1\154\1\171"+
        "\2\145\3\172\1\uffff\2\172\2\uffff\1\165\3\172\5\uffff\1\145\3\uffff"+
        "\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\34\uffff\1\74\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\uffff\1"+
        "\106\1\107\1\113\1\uffff\1\114\1\115\2\uffff\1\121\1\122\2\uffff"+
        "\1\114\44\uffff\1\63\1\73\1\64\1\75\1\65\1\110\1\66\1\67\1\111\1"+
        "\72\1\112\1\74\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\117\1\120"+
        "\1\105\1\106\1\107\1\113\1\115\1\116\1\121\27\uffff\1\70\6\uffff"+
        "\1\71\41\uffff\1\62\3\uffff\1\60\12\uffff\1\61\11\uffff\1\12\2\uffff"+
        "\1\52\2\uffff\1\56\1\57\1\uffff\1\46\10\uffff\1\55\2\uffff\1\50"+
        "\11\uffff\1\51\10\uffff\1\47\1\53\1\54\1\uffff\1\13\13\uffff\1\45"+
        "\5\uffff\1\16\1\22\7\uffff\1\37\1\40\1\41\1\42\1\43\1\44\6\uffff"+
        "\1\35\4\uffff\1\33\3\uffff\1\36\6\uffff\1\32\1\34\13\uffff\1\27"+
        "\1\30\1\uffff\1\31\2\uffff\1\25\1\26\3\uffff\1\23\3\uffff\1\21\7"+
        "\uffff\1\24\1\1\7\uffff\1\20\2\uffff\1\15\1\17\4\uffff\1\6\1\7\1"+
        "\10\1\14\1\11\1\uffff\1\3\1\4\1\5\1\uffff\1\2";
    static final String DFA12_specialS =
        "\1\2\52\uffff\1\1\1\0\u0142\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\56\2\55\2\56\1\55\22\56\1\55\1\26\1\53\2\56\1\34\1\27\1"+
            "\54\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\12\52\1\45\1\46"+
            "\1\30\1\31\1\32\2\56\1\10\1\14\1\2\1\4\1\13\1\23\1\17\1\15\1"+
            "\7\1\1\1\51\1\24\1\11\1\25\1\20\1\5\1\51\1\21\1\6\1\3\1\16\1"+
            "\12\1\22\3\51\3\56\1\50\1\51\1\56\1\10\1\14\1\2\1\4\1\13\1\23"+
            "\1\17\1\15\1\7\1\1\1\51\1\24\1\11\1\25\1\20\1\5\1\51\1\21\1"+
            "\6\1\3\1\16\1\12\1\22\3\51\1\56\1\33\1\56\1\47\uff81\56",
            "\1\60\2\uffff\1\57\34\uffff\1\60\2\uffff\1\57",
            "\1\63\6\uffff\1\62\30\uffff\1\63\6\uffff\1\62",
            "\1\65\6\uffff\1\64\2\uffff\1\66\25\uffff\1\65\6\uffff\1\64"+
            "\2\uffff\1\66",
            "\1\67\3\uffff\1\70\5\uffff\1\71\25\uffff\1\67\3\uffff\1\70"+
            "\5\uffff\1\71",
            "\1\72\37\uffff\1\72",
            "\1\75\2\uffff\1\76\1\77\12\uffff\1\74\1\73\17\uffff\1\75\2"+
            "\uffff\1\76\1\77\12\uffff\1\74\1\73",
            "\1\102\1\100\4\uffff\1\101\31\uffff\1\102\1\100\4\uffff\1\101",
            "\1\103\37\uffff\1\103",
            "\1\104\37\uffff\1\104",
            "\1\105\37\uffff\1\105",
            "\1\106\11\uffff\1\107\25\uffff\1\106\11\uffff\1\107",
            "\1\110\11\uffff\1\111\25\uffff\1\110\11\uffff\1\111",
            "\1\112\37\uffff\1\112",
            "\1\113\37\uffff\1\113",
            "\1\115\14\uffff\1\114\22\uffff\1\115\14\uffff\1\114",
            "\1\116\37\uffff\1\116",
            "\1\117\37\uffff\1\117",
            "\1\120\37\uffff\1\120",
            "\1\121\12\uffff\1\122\5\uffff\1\123\16\uffff\1\121\12\uffff"+
            "\1\122\5\uffff\1\123",
            "\1\124\37\uffff\1\124",
            "\1\125\37\uffff\1\125",
            "\1\126",
            "\1\130",
            "\1\132",
            "\1\134",
            "\1\135",
            "\1\137",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\151\4\uffff\1\152",
            "",
            "",
            "",
            "\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\0\160",
            "\0\160",
            "",
            "",
            "\1\162\37\uffff\1\162",
            "\1\163\37\uffff\1\163",
            "",
            "\1\164\37\uffff\1\164",
            "\1\165\37\uffff\1\165",
            "\1\166\10\uffff\1\167\26\uffff\1\166\10\uffff\1\167",
            "\1\170\37\uffff\1\170",
            "\1\171\37\uffff\1\171",
            "\1\172\37\uffff\1\172",
            "\1\173\37\uffff\1\173",
            "\1\174\37\uffff\1\174",
            "\1\175\37\uffff\1\175",
            "\1\176\37\uffff\1\176",
            "\1\177\37\uffff\1\177",
            "\1\u0080\37\uffff\1\u0080",
            "\1\u0081\37\uffff\1\u0081",
            "\1\u0082\37\uffff\1\u0082",
            "\1\u0084\16\uffff\1\u0083\1\u0085\17\uffff\1\u0084\16\uffff"+
            "\1\u0083\1\u0085",
            "\1\u0086\37\uffff\1\u0086",
            "\1\u0087\37\uffff\1\u0087",
            "\12\61\7\uffff\2\61\1\u0088\27\61\4\uffff\1\61\1\uffff\2\61"+
            "\1\u0088\27\61",
            "\1\u008a\37\uffff\1\u008a",
            "\1\u008b\37\uffff\1\u008b",
            "\1\u008c\37\uffff\1\u008c",
            "\1\u008d\37\uffff\1\u008d",
            "\1\u008e\37\uffff\1\u008e",
            "\12\61\7\uffff\23\61\1\u008f\6\61\4\uffff\1\61\1\uffff\23\61"+
            "\1\u008f\6\61",
            "\1\u0091\37\uffff\1\u0091",
            "\1\u0092\37\uffff\1\u0092",
            "\1\u0093\37\uffff\1\u0093",
            "\1\u0094\37\uffff\1\u0094",
            "\1\u0095\37\uffff\1\u0095",
            "\1\u0096\37\uffff\1\u0096",
            "\1\u0097\37\uffff\1\u0097",
            "\1\u0098\37\uffff\1\u0098",
            "\1\u0099\37\uffff\1\u0099",
            "\1\u009a\37\uffff\1\u009a",
            "\1\u009b\37\uffff\1\u009b",
            "\1\u009c\37\uffff\1\u009c",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009d\37\uffff\1\u009d",
            "\1\u009e\37\uffff\1\u009e",
            "\1\u009f\37\uffff\1\u009f",
            "\1\u00a0\37\uffff\1\u00a0",
            "\1\u00a1\37\uffff\1\u00a1",
            "\1\u00a2\37\uffff\1\u00a2",
            "\1\u00a3\37\uffff\1\u00a3",
            "\1\u00a4\37\uffff\1\u00a4",
            "\1\u00a5\37\uffff\1\u00a5",
            "\1\u00a6\37\uffff\1\u00a6",
            "\1\u00a7\37\uffff\1\u00a7",
            "\1\u00a8\37\uffff\1\u00a8",
            "\1\u00a9\17\uffff\1\u00aa\17\uffff\1\u00a9\17\uffff\1\u00aa",
            "\1\u00ab\37\uffff\1\u00ab",
            "\1\u00ac\37\uffff\1\u00ac",
            "\1\u00ad\37\uffff\1\u00ad",
            "\1\u00ae\37\uffff\1\u00ae",
            "\1\u00af\37\uffff\1\u00af",
            "\1\u00b0\37\uffff\1\u00b0",
            "\12\61\7\uffff\16\61\1\u00b1\13\61\4\uffff\1\61\1\uffff\16"+
            "\61\1\u00b1\13\61",
            "\1\u00b3\37\uffff\1\u00b3",
            "\1\u00b4\37\uffff\1\u00b4",
            "\12\61\7\uffff\4\61\1\u00b5\25\61\4\uffff\1\61\1\uffff\4\61"+
            "\1\u00b5\25\61",
            "",
            "\1\u00b8\4\uffff\1\u00b7\32\uffff\1\u00b8\4\uffff\1\u00b7",
            "\1\u00b9\37\uffff\1\u00b9",
            "\1\u00ba\37\uffff\1\u00ba",
            "\1\u00bb\37\uffff\1\u00bb",
            "\1\u00bc\37\uffff\1\u00bc",
            "\1\u00bd\37\uffff\1\u00bd",
            "",
            "\1\u00be\37\uffff\1\u00be",
            "\1\u00bf\37\uffff\1\u00bf",
            "\1\u00c0\37\uffff\1\u00c0",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00c2\37\uffff\1\u00c2",
            "\1\u00c3\37\uffff\1\u00c3",
            "\1\u00c4\37\uffff\1\u00c4",
            "\1\u00c5\37\uffff\1\u00c5",
            "\1\u00c6\37\uffff\1\u00c6",
            "\1\u00c7\37\uffff\1\u00c7",
            "\1\u00c8\37\uffff\1\u00c8",
            "\1\u00c9\37\uffff\1\u00c9",
            "\1\u00ca\37\uffff\1\u00ca",
            "\1\u00cb\51\uffff\1\u00cc\37\uffff\1\u00cc",
            "\1\u00cd\37\uffff\1\u00cd",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00cf\37\uffff\1\u00cf",
            "\1\u00d0\37\uffff\1\u00d0",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\4\61\1\u00d3\25\61\4\uffff\1\61\1\uffff\4\61"+
            "\1\u00d3\25\61",
            "\1\u00d5\37\uffff\1\u00d5",
            "\1\u00d6\37\uffff\1\u00d6",
            "\1\u00d7\37\uffff\1\u00d7",
            "\1\u00d8\37\uffff\1\u00d8",
            "\1\u00d9\37\uffff\1\u00d9",
            "\1\u00da\37\uffff\1\u00da",
            "\1\u00db\37\uffff\1\u00db",
            "\1\u00dc\37\uffff\1\u00dc",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00de\37\uffff\1\u00de",
            "\1\u00df\37\uffff\1\u00df",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u00e1\37\uffff\1\u00e1",
            "\1\u00e2\37\uffff\1\u00e2",
            "\1\u00e3\37\uffff\1\u00e3",
            "",
            "\1\u00e4",
            "\1\u00e5\37\uffff\1\u00e5",
            "\1\u00e6\37\uffff\1\u00e6",
            "\1\u00e7\37\uffff\1\u00e7",
            "\1\u00e8\37\uffff\1\u00e8",
            "\1\u00e9\37\uffff\1\u00e9",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00eb\37\uffff\1\u00eb",
            "\1\u00ec\37\uffff\1\u00ec",
            "\1\u00ed\37\uffff\1\u00ed",
            "",
            "\1\u00ee\37\uffff\1\u00ee",
            "\1\u00ef\37\uffff\1\u00ef",
            "\1\u00f0\37\uffff\1\u00f0",
            "\1\u00f1\37\uffff\1\u00f1",
            "\1\u00f2\37\uffff\1\u00f2",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00f6\37\uffff\1\u00f6",
            "",
            "\1\u00f7",
            "\1\u00f8\37\uffff\1\u00f8",
            "",
            "\1\u00f9\37\uffff\1\u00f9",
            "\1\u00fa\37\uffff\1\u00fa",
            "",
            "",
            "\1\u00fb\37\uffff\1\u00fb",
            "",
            "\1\u00fc\37\uffff\1\u00fc",
            "\1\u00fd\37\uffff\1\u00fd",
            "\1\u00fe\37\uffff\1\u00fe",
            "\1\u00ff\37\uffff\1\u00ff",
            "\1\u0100\37\uffff\1\u0100",
            "\1\u0101\37\uffff\1\u0101",
            "\1\u0102\37\uffff\1\u0102",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u0104\37\uffff\1\u0104",
            "\1\u0105\37\uffff\1\u0105",
            "",
            "\1\u0106\37\uffff\1\u0106",
            "\1\u0107\37\uffff\1\u0107",
            "\1\u0108\37\uffff\1\u0108",
            "\1\u010a\21\uffff\1\u0109\15\uffff\1\u010a\21\uffff\1\u0109",
            "\1\u010b\37\uffff\1\u010b",
            "\1\u010c\37\uffff\1\u010c",
            "\1\u010d\37\uffff\1\u010d",
            "\1\u010e\37\uffff\1\u010e",
            "\1\u010f\37\uffff\1\u010f",
            "",
            "\1\u0110\37\uffff\1\u0110",
            "\1\u0111\37\uffff\1\u0111",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "\1\u0118\37\uffff\1\u0118",
            "",
            "\1\u0119\37\uffff\1\u0119",
            "\1\u011a\37\uffff\1\u011a",
            "\1\u011b\37\uffff\1\u011b",
            "\1\u011c\37\uffff\1\u011c",
            "\1\u011d\37\uffff\1\u011d",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u011f\37\uffff\1\u011f",
            "\1\u0120\37\uffff\1\u0120",
            "\1\u0121\37\uffff\1\u0121",
            "\1\u0122\37\uffff\1\u0122",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u0124\37\uffff\1\u0124",
            "\1\u0125\37\uffff\1\u0125",
            "\1\u0126\37\uffff\1\u0126",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0128\37\uffff\1\u0128",
            "",
            "",
            "\1\u0129\37\uffff\1\u0129",
            "\1\u012a\37\uffff\1\u012a",
            "\1\u012b\37\uffff\1\u012b",
            "\1\u012c\37\uffff\1\u012c",
            "\1\u012d\37\uffff\1\u012d",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0130\37\uffff\1\u0130",
            "\1\u0131\37\uffff\1\u0131",
            "\1\u0132\37\uffff\1\u0132",
            "\1\u0133\37\uffff\1\u0133",
            "\1\u0134\37\uffff\1\u0134",
            "\1\u0135\37\uffff\1\u0135",
            "",
            "\1\u0136\37\uffff\1\u0136",
            "\1\u0137\37\uffff\1\u0137",
            "\1\u0138\37\uffff\1\u0138",
            "\1\u0139\37\uffff\1\u0139",
            "",
            "\1\u013a\37\uffff\1\u013a",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u013d\37\uffff\1\u013d",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u013f\37\uffff\1\u013f",
            "\1\u0140\37\uffff\1\u0140",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u0143\37\uffff\1\u0143",
            "\12\61\7\uffff\12\61\1\u0145\12\61\1\u0144\4\61\4\uffff\1\61"+
            "\1\uffff\12\61\1\u0145\12\61\1\u0144\4\61",
            "\1\u0147\37\uffff\1\u0147",
            "\1\u0148\37\uffff\1\u0148",
            "\1\u0149\37\uffff\1\u0149",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u014b\37\uffff\1\u014b",
            "\1\u014c\37\uffff\1\u014c",
            "\1\u014d\37\uffff\1\u014d",
            "\1\u014e\37\uffff\1\u014e",
            "\1\u014f\37\uffff\1\u014f",
            "",
            "",
            "\1\u0150\37\uffff\1\u0150",
            "",
            "\1\u0151\37\uffff\1\u0151",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u0153",
            "\1\u0154\37\uffff\1\u0154",
            "\1\u0155\37\uffff\1\u0155",
            "",
            "\1\u0156\37\uffff\1\u0156",
            "\1\u0157\37\uffff\1\u0157",
            "\1\u0158\37\uffff\1\u0158",
            "",
            "\1\u0159\37\uffff\1\u0159",
            "\1\u015a\37\uffff\1\u015a",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u015c\37\uffff\1\u015c",
            "\1\u015d\37\uffff\1\u015d",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u0160\37\uffff\1\u0160",
            "\1\u0161\37\uffff\1\u0161",
            "\1\u0162\37\uffff\1\u0162",
            "\1\u0163\37\uffff\1\u0163",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u0169\37\uffff\1\u0169",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "",
            "\1\u016d\37\uffff\1\u016d",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
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
            return "1:1: Tokens : ( KEYWORD_75 | KEYWORD_74 | KEYWORD_71 | KEYWORD_72 | KEYWORD_73 | KEYWORD_64 | KEYWORD_65 | KEYWORD_66 | KEYWORD_67 | KEYWORD_68 | KEYWORD_69 | KEYWORD_70 | KEYWORD_60 | KEYWORD_61 | KEYWORD_62 | KEYWORD_63 | KEYWORD_56 | KEYWORD_57 | KEYWORD_58 | KEYWORD_59 | KEYWORD_51 | KEYWORD_52 | KEYWORD_53 | KEYWORD_54 | KEYWORD_55 | KEYWORD_46 | KEYWORD_47 | KEYWORD_48 | KEYWORD_49 | KEYWORD_50 | KEYWORD_39 | KEYWORD_40 | KEYWORD_41 | KEYWORD_42 | KEYWORD_43 | KEYWORD_44 | KEYWORD_45 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_33 | KEYWORD_34 | KEYWORD_35 | KEYWORD_36 | KEYWORD_37 | KEYWORD_38 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_44 = input.LA(1);

                        s = -1;
                        if ( ((LA12_44>='\u0000' && LA12_44<='\uFFFF')) ) {s = 112;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_43 = input.LA(1);

                        s = -1;
                        if ( ((LA12_43>='\u0000' && LA12_43<='\uFFFF')) ) {s = 112;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='J'||LA12_0=='j') ) {s = 1;}

                        else if ( (LA12_0=='C'||LA12_0=='c') ) {s = 2;}

                        else if ( (LA12_0=='T'||LA12_0=='t') ) {s = 3;}

                        else if ( (LA12_0=='D'||LA12_0=='d') ) {s = 4;}

                        else if ( (LA12_0=='P'||LA12_0=='p') ) {s = 5;}

                        else if ( (LA12_0=='S'||LA12_0=='s') ) {s = 6;}

                        else if ( (LA12_0=='I'||LA12_0=='i') ) {s = 7;}

                        else if ( (LA12_0=='A'||LA12_0=='a') ) {s = 8;}

                        else if ( (LA12_0=='M'||LA12_0=='m') ) {s = 9;}

                        else if ( (LA12_0=='V'||LA12_0=='v') ) {s = 10;}

                        else if ( (LA12_0=='E'||LA12_0=='e') ) {s = 11;}

                        else if ( (LA12_0=='B'||LA12_0=='b') ) {s = 12;}

                        else if ( (LA12_0=='H'||LA12_0=='h') ) {s = 13;}

                        else if ( (LA12_0=='U'||LA12_0=='u') ) {s = 14;}

                        else if ( (LA12_0=='G'||LA12_0=='g') ) {s = 15;}

                        else if ( (LA12_0=='O'||LA12_0=='o') ) {s = 16;}

                        else if ( (LA12_0=='R'||LA12_0=='r') ) {s = 17;}

                        else if ( (LA12_0=='W'||LA12_0=='w') ) {s = 18;}

                        else if ( (LA12_0=='F'||LA12_0=='f') ) {s = 19;}

                        else if ( (LA12_0=='L'||LA12_0=='l') ) {s = 20;}

                        else if ( (LA12_0=='N'||LA12_0=='n') ) {s = 21;}

                        else if ( (LA12_0=='!') ) {s = 22;}

                        else if ( (LA12_0=='&') ) {s = 23;}

                        else if ( (LA12_0=='<') ) {s = 24;}

                        else if ( (LA12_0=='=') ) {s = 25;}

                        else if ( (LA12_0=='>') ) {s = 26;}

                        else if ( (LA12_0=='|') ) {s = 27;}

                        else if ( (LA12_0=='%') ) {s = 28;}

                        else if ( (LA12_0=='(') ) {s = 29;}

                        else if ( (LA12_0==')') ) {s = 30;}

                        else if ( (LA12_0=='*') ) {s = 31;}

                        else if ( (LA12_0=='+') ) {s = 32;}

                        else if ( (LA12_0==',') ) {s = 33;}

                        else if ( (LA12_0=='-') ) {s = 34;}

                        else if ( (LA12_0=='.') ) {s = 35;}

                        else if ( (LA12_0=='/') ) {s = 36;}

                        else if ( (LA12_0==':') ) {s = 37;}

                        else if ( (LA12_0==';') ) {s = 38;}

                        else if ( (LA12_0=='~') ) {s = 39;}

                        else if ( (LA12_0=='^') ) {s = 40;}

                        else if ( (LA12_0=='K'||LA12_0=='Q'||(LA12_0>='X' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='k'||LA12_0=='q'||(LA12_0>='x' && LA12_0<='z')) ) {s = 41;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 42;}

                        else if ( (LA12_0=='\"') ) {s = 43;}

                        else if ( (LA12_0=='\'') ) {s = 44;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 45;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='$')||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='{'||LA12_0=='}'||(LA12_0>='\u007F' && LA12_0<='\uFFFF')) ) {s = 46;}

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