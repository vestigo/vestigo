
/*
* generated by Xtext
*/
lexer grammar InternalJDOQLLexer;


@header {
package org.nightlabs.jjqb.xtext.jdoql.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}




KEYWORD_129 : ('J'|'j')('A'|'a')('V'|'v')('A'|'a')('X'|'x')'.'('J'|'j')('D'|'d')('O'|'o')'.'('J'|'j')('D'|'d')('O'|'o')('H'|'h')('E'|'e')('L'|'l')('P'|'p')('E'|'e')('R'|'r')'.'('G'|'g')('E'|'e')('T'|'t')('O'|'o')('B'|'b')('J'|'j')('E'|'e')('C'|'c')('T'|'t')('I'|'i')('D'|'d');

KEYWORD_128 : ('J'|'j')('A'|'a')('V'|'v')('A'|'a')('X'|'x')'.'('J'|'j')('D'|'d')('O'|'o')'.'('J'|'j')('D'|'d')('O'|'o')('H'|'h')('E'|'e')('L'|'l')('P'|'p')('E'|'e')('R'|'r')'.'('G'|'g')('E'|'e')('T'|'t')('V'|'v')('E'|'e')('R'|'r')('S'|'s')('I'|'i')('O'|'o')('N'|'n');

KEYWORD_127 : ('J'|'j')('D'|'d')('O'|'o')('H'|'h')('E'|'e')('L'|'l')('P'|'p')('E'|'e')('R'|'r')'.'('G'|'g')('E'|'e')('T'|'t')('O'|'o')('B'|'b')('J'|'j')('E'|'e')('C'|'c')('T'|'t')('I'|'i')('D'|'d');

KEYWORD_125 : ('J'|'j')('D'|'d')('O'|'o')('H'|'h')('E'|'e')('L'|'l')('P'|'p')('E'|'e')('R'|'r')'.'('G'|'g')('E'|'e')('T'|'t')('V'|'v')('E'|'e')('R'|'r')('S'|'s')('I'|'i')('O'|'o')('N'|'n');

KEYWORD_126 : ('J'|'j')('A'|'a')('V'|'v')('A'|'a')'.'('L'|'l')('A'|'a')('N'|'n')('G'|'g')'.'('M'|'m')('A'|'a')('T'|'t')('H'|'h')'.'('F'|'f')('L'|'l')('O'|'o')('O'|'o')('R'|'r');

KEYWORD_119 : ('J'|'j')('A'|'a')('V'|'v')('A'|'a')'.'('L'|'l')('A'|'a')('N'|'n')('G'|'g')'.'('C'|'c')('H'|'h')('A'|'a')('R'|'r')('A'|'a')('C'|'c')('T'|'t')('E'|'e')('R'|'r');

KEYWORD_120 : ('J'|'j')('A'|'a')('V'|'v')('A'|'a')'.'('L'|'l')('A'|'a')('N'|'n')('G'|'g')'.'('M'|'m')('A'|'a')('T'|'t')('H'|'h')'.'('A'|'a')('C'|'c')('O'|'o')('S'|'s');

KEYWORD_121 : ('J'|'j')('A'|'a')('V'|'v')('A'|'a')'.'('L'|'l')('A'|'a')('N'|'n')('G'|'g')'.'('M'|'m')('A'|'a')('T'|'t')('H'|'h')'.'('A'|'a')('S'|'s')('I'|'i')('N'|'n');

KEYWORD_122 : ('J'|'j')('A'|'a')('V'|'v')('A'|'a')'.'('L'|'l')('A'|'a')('N'|'n')('G'|'g')'.'('M'|'m')('A'|'a')('T'|'t')('H'|'h')'.'('A'|'a')('T'|'t')('A'|'a')('N'|'n');

KEYWORD_123 : ('J'|'j')('A'|'a')('V'|'v')('A'|'a')'.'('L'|'l')('A'|'a')('N'|'n')('G'|'g')'.'('M'|'m')('A'|'a')('T'|'t')('H'|'h')'.'('C'|'c')('E'|'e')('I'|'i')('L'|'l');

KEYWORD_124 : ('J'|'j')('A'|'a')('V'|'v')('A'|'a')'.'('L'|'l')('A'|'a')('N'|'n')('G'|'g')'.'('M'|'m')('A'|'a')('T'|'t')('H'|'h')'.'('S'|'s')('Q'|'q')('R'|'r')('T'|'t');

KEYWORD_113 : ('J'|'j')('A'|'a')('V'|'v')('A'|'a')'.'('L'|'l')('A'|'a')('N'|'n')('G'|'g')'.'('M'|'m')('A'|'a')('T'|'t')('H'|'h')'.'('A'|'a')('B'|'b')('S'|'s');

KEYWORD_114 : ('J'|'j')('A'|'a')('V'|'v')('A'|'a')'.'('L'|'l')('A'|'a')('N'|'n')('G'|'g')'.'('M'|'m')('A'|'a')('T'|'t')('H'|'h')'.'('C'|'c')('O'|'o')('S'|'s');

KEYWORD_115 : ('J'|'j')('A'|'a')('V'|'v')('A'|'a')'.'('L'|'l')('A'|'a')('N'|'n')('G'|'g')'.'('M'|'m')('A'|'a')('T'|'t')('H'|'h')'.'('E'|'e')('X'|'x')('P'|'p');

KEYWORD_116 : ('J'|'j')('A'|'a')('V'|'v')('A'|'a')'.'('L'|'l')('A'|'a')('N'|'n')('G'|'g')'.'('M'|'m')('A'|'a')('T'|'t')('H'|'h')'.'('L'|'l')('O'|'o')('G'|'g');

KEYWORD_117 : ('J'|'j')('A'|'a')('V'|'v')('A'|'a')'.'('L'|'l')('A'|'a')('N'|'n')('G'|'g')'.'('M'|'m')('A'|'a')('T'|'t')('H'|'h')'.'('S'|'s')('I'|'i')('N'|'n');

KEYWORD_118 : ('J'|'j')('A'|'a')('V'|'v')('A'|'a')'.'('L'|'l')('A'|'a')('N'|'n')('G'|'g')'.'('M'|'m')('A'|'a')('T'|'t')('H'|'h')'.'('T'|'t')('A'|'a')('N'|'n');

KEYWORD_111 : ('J'|'j')('A'|'a')('V'|'v')('A'|'a')'.'('L'|'l')('A'|'a')('N'|'n')('G'|'g')'.'('B'|'b')('O'|'o')('O'|'o')('L'|'l')('E'|'e')('A'|'a')('N'|'n');

KEYWORD_112 : ('J'|'j')('A'|'a')('V'|'v')('A'|'a')'.'('L'|'l')('A'|'a')('N'|'n')('G'|'g')'.'('I'|'i')('N'|'n')('T'|'t')('E'|'e')('G'|'g')('E'|'e')('R'|'r');

KEYWORD_108 : ('E'|'e')('Q'|'q')('U'|'u')('A'|'a')('L'|'l')('S'|'s')('I'|'i')('G'|'g')('N'|'n')('O'|'o')('R'|'r')('E'|'e')('C'|'c')('A'|'a')('S'|'s')('E'|'e');

KEYWORD_109 : ('J'|'j')('A'|'a')('V'|'v')('A'|'a')'.'('L'|'l')('A'|'a')('N'|'n')('G'|'g')'.'('D'|'d')('O'|'o')('U'|'u')('B'|'b')('L'|'l')('E'|'e');

KEYWORD_110 : ('J'|'j')('A'|'a')('V'|'v')('A'|'a')'.'('L'|'l')('A'|'a')('N'|'n')('G'|'g')'.'('S'|'s')('T'|'t')('R'|'r')('I'|'i')('N'|'n')('G'|'g');

KEYWORD_106 : ('J'|'j')('A'|'a')('V'|'v')('A'|'a')'.'('L'|'l')('A'|'a')('N'|'n')('G'|'g')'.'('F'|'f')('L'|'l')('O'|'o')('A'|'a')('T'|'t');

KEYWORD_107 : ('J'|'j')('A'|'a')('V'|'v')('A'|'a')'.'('L'|'l')('A'|'a')('N'|'n')('G'|'g')'.'('S'|'s')('H'|'h')('O'|'o')('R'|'r')('T'|'t');

KEYWORD_104 : ('J'|'j')('A'|'a')('V'|'v')('A'|'a')'.'('L'|'l')('A'|'a')('N'|'n')('G'|'g')'.'('B'|'b')('Y'|'y')('T'|'t')('E'|'e');

KEYWORD_105 : ('J'|'j')('A'|'a')('V'|'v')('A'|'a')'.'('L'|'l')('A'|'a')('N'|'n')('G'|'g')'.'('L'|'l')('O'|'o')('N'|'n')('G'|'g');

KEYWORD_102 : ('C'|'c')('O'|'o')('N'|'n')('T'|'t')('A'|'a')('I'|'i')('N'|'n')('S'|'s')('E'|'e')('N'|'n')('T'|'t')('R'|'r')('Y'|'y');

KEYWORD_103 : ('C'|'c')('O'|'o')('N'|'n')('T'|'t')('A'|'a')('I'|'i')('N'|'n')('S'|'s')('V'|'v')('A'|'a')('L'|'l')('U'|'u')('E'|'e');

KEYWORD_99 : ('C'|'c')('O'|'o')('N'|'n')('T'|'t')('A'|'a')('I'|'i')('N'|'n')('S'|'s')('K'|'k')('E'|'e')('Y'|'y');

KEYWORD_100 : ('T'|'t')('O'|'o')('L'|'l')('O'|'o')('W'|'w')('E'|'e')('R'|'r')('C'|'c')('A'|'a')('S'|'s')('E'|'e');

KEYWORD_101 : ('T'|'t')('O'|'o')('U'|'u')('P'|'p')('P'|'p')('E'|'e')('R'|'r')('C'|'c')('A'|'a')('S'|'s')('E'|'e');

KEYWORD_92 : ('D'|'d')('E'|'e')('S'|'s')('C'|'c')('E'|'e')('N'|'n')('D'|'d')('I'|'i')('N'|'n')('G'|'g');

KEYWORD_93 : ('M'|'m')('A'|'a')('T'|'t')('H'|'h')'.'('F'|'f')('L'|'l')('O'|'o')('O'|'o')('R'|'r');

KEYWORD_94 : ('P'|'p')('A'|'a')('R'|'r')('A'|'a')('M'|'m')('E'|'e')('T'|'t')('E'|'e')('R'|'r')('S'|'s');

KEYWORD_95 : ('S'|'s')('U'|'u')('B'|'b')('C'|'c')('L'|'l')('A'|'a')('S'|'s')('S'|'s')('E'|'e')('S'|'s');

KEYWORD_96 : ('I'|'i')('N'|'n')('S'|'s')('T'|'t')('A'|'a')('N'|'n')('C'|'c')('E'|'e')('O'|'o')('F'|'f');

KEYWORD_97 : ('R'|'r')('E'|'e')('P'|'p')('L'|'l')('A'|'a')('C'|'c')('E'|'e')('A'|'a')('L'|'l')('L'|'l');

KEYWORD_98 : ('S'|'s')('T'|'t')('A'|'a')('R'|'r')('T'|'t')('S'|'s')('W'|'w')('I'|'i')('T'|'t')('H'|'h');

KEYWORD_82 : ('A'|'a')('S'|'s')('C'|'c')('E'|'e')('N'|'n')('D'|'d')('I'|'i')('N'|'n')('G'|'g');

KEYWORD_83 : ('M'|'m')('A'|'a')('T'|'t')('H'|'h')'.'('A'|'a')('C'|'c')('O'|'o')('S'|'s');

KEYWORD_84 : ('M'|'m')('A'|'a')('T'|'t')('H'|'h')'.'('A'|'a')('S'|'s')('I'|'i')('N'|'n');

KEYWORD_85 : ('M'|'m')('A'|'a')('T'|'t')('H'|'h')'.'('A'|'a')('T'|'t')('A'|'a')('N'|'n');

KEYWORD_86 : ('M'|'m')('A'|'a')('T'|'t')('H'|'h')'.'('C'|'c')('E'|'e')('I'|'i')('L'|'l');

KEYWORD_87 : ('M'|'m')('A'|'a')('T'|'t')('H'|'h')'.'('S'|'s')('Q'|'q')('R'|'r')('T'|'t');

KEYWORD_88 : ('V'|'v')('A'|'a')('R'|'r')('I'|'i')('A'|'a')('B'|'b')('L'|'l')('E'|'e')('S'|'s');

KEYWORD_89 : ('G'|'g')('E'|'e')('T'|'t')('M'|'m')('I'|'i')('N'|'n')('U'|'u')('T'|'t')('E'|'e');

KEYWORD_90 : ('G'|'g')('E'|'e')('T'|'t')('S'|'s')('E'|'e')('C'|'c')('O'|'o')('N'|'n')('D'|'d');

KEYWORD_91 : ('S'|'s')('U'|'u')('B'|'b')('S'|'s')('T'|'t')('R'|'r')('I'|'i')('N'|'n')('G'|'g');

KEYWORD_71 : ('D'|'d')('I'|'i')('S'|'s')('T'|'t')('I'|'i')('N'|'n')('C'|'c')('T'|'t');

KEYWORD_72 : ('M'|'m')('A'|'a')('T'|'t')('H'|'h')'.'('A'|'a')('B'|'b')('S'|'s');

KEYWORD_73 : ('M'|'m')('A'|'a')('T'|'t')('H'|'h')'.'('C'|'c')('O'|'o')('S'|'s');

KEYWORD_74 : ('M'|'m')('A'|'a')('T'|'t')('H'|'h')'.'('E'|'e')('X'|'x')('P'|'p');

KEYWORD_75 : ('M'|'m')('A'|'a')('T'|'t')('H'|'h')'.'('L'|'l')('O'|'o')('G'|'g');

KEYWORD_76 : ('M'|'m')('A'|'a')('T'|'t')('H'|'h')'.'('S'|'s')('I'|'i')('N'|'n');

KEYWORD_77 : ('M'|'m')('A'|'a')('T'|'t')('H'|'h')'.'('T'|'t')('A'|'a')('N'|'n');

KEYWORD_78 : ('C'|'c')('O'|'o')('N'|'n')('T'|'t')('A'|'a')('I'|'i')('N'|'n')('S'|'s');

KEYWORD_79 : ('E'|'e')('N'|'n')('D'|'d')('S'|'s')('W'|'w')('I'|'i')('T'|'t')('H'|'h');

KEYWORD_80 : ('G'|'g')('E'|'e')('T'|'t')('M'|'m')('O'|'o')('N'|'n')('T'|'t')('H'|'h');

KEYWORD_81 : ('T'|'t')('O'|'o')('S'|'s')('T'|'t')('R'|'r')('I'|'i')('N'|'n')('G'|'g');

KEYWORD_63 : ('E'|'e')('X'|'x')('C'|'c')('L'|'l')('U'|'u')('D'|'d')('E'|'e');

KEYWORD_64 : ('B'|'b')('O'|'o')('O'|'o')('L'|'l')('E'|'e')('A'|'a')('N'|'n');

KEYWORD_65 : ('G'|'g')('E'|'e')('T'|'t')('H'|'h')('O'|'o')('U'|'u')('R'|'r');

KEYWORD_66 : ('G'|'g')('E'|'e')('T'|'t')('Y'|'y')('E'|'e')('A'|'a')('R'|'r');

KEYWORD_67 : ('I'|'i')('N'|'n')('D'|'d')('E'|'e')('X'|'x')('O'|'o')('F'|'f');

KEYWORD_68 : ('I'|'i')('S'|'s')('E'|'e')('M'|'m')('P'|'p')('T'|'t')('Y'|'y');

KEYWORD_69 : ('M'|'m')('A'|'a')('T'|'t')('C'|'c')('H'|'h')('E'|'e')('S'|'s');

KEYWORD_70 : ('O'|'o')('R'|'r')('D'|'d')('I'|'i')('N'|'n')('A'|'a')('L'|'l');

KEYWORD_53 : ('H'|'h')('A'|'a')('V'|'v')('I'|'i')('N'|'n')('G'|'g');

KEYWORD_54 : ('S'|'s')('E'|'e')('L'|'l')('E'|'e')('C'|'c')('T'|'t');

KEYWORD_55 : ('U'|'u')('N'|'n')('I'|'i')('Q'|'q')('U'|'u')('E'|'e');

KEYWORD_56 : ('C'|'c')('H'|'h')('A'|'a')('R'|'r')('A'|'a')('T'|'t');

KEYWORD_57 : ('D'|'d')('O'|'o')('U'|'u')('B'|'b')('L'|'l')('E'|'e');

KEYWORD_58 : ('E'|'e')('Q'|'q')('U'|'u')('A'|'a')('L'|'l')('S'|'s');

KEYWORD_59 : ('G'|'g')('E'|'e')('T'|'t')('D'|'d')('A'|'a')('Y'|'y');

KEYWORD_60 : ('I'|'i')('M'|'m')('P'|'p')('O'|'o')('R'|'r')('T'|'t');

KEYWORD_61 : ('J'|'j')('A'|'a')('V'|'v')('A'|'a')('X'|'x')'.';

KEYWORD_62 : ('L'|'l')('E'|'e')('N'|'n')('G'|'g')('T'|'t')('H'|'h');

KEYWORD_44 : ('G'|'g')('R'|'r')('O'|'o')('U'|'u')('P'|'p');

KEYWORD_45 : ('O'|'o')('R'|'r')('D'|'d')('E'|'e')('R'|'r');

KEYWORD_46 : ('R'|'r')('A'|'a')('N'|'n')('G'|'g')('E'|'e');

KEYWORD_47 : ('W'|'w')('H'|'h')('E'|'e')('R'|'r')('E'|'e');

KEYWORD_48 : ('C'|'c')('O'|'o')('U'|'u')('N'|'n')('T'|'t');

KEYWORD_49 : ('F'|'f')('A'|'a')('L'|'l')('S'|'s')('E'|'e');

KEYWORD_50 : ('F'|'f')('L'|'l')('O'|'o')('A'|'a')('T'|'t');

KEYWORD_51 : ('J'|'j')('A'|'a')('V'|'v')('A'|'a')'.';

KEYWORD_52 : ('S'|'s')('H'|'h')('O'|'o')('R'|'r')('T'|'t');

KEYWORD_33 : ('D'|'d')('E'|'e')('S'|'s')('C'|'c');

KEYWORD_34 : ('F'|'f')('R'|'r')('O'|'o')('M'|'m');

KEYWORD_35 : ('I'|'i')('N'|'n')('T'|'t')('O'|'o');

KEYWORD_36 : ('B'|'b')('Y'|'y')('T'|'t')('E'|'e');

KEYWORD_37 : ('C'|'c')('H'|'h')('A'|'a')('R'|'r');

KEYWORD_38 : ('L'|'l')('O'|'o')('N'|'n')('G'|'g');

KEYWORD_39 : ('N'|'n')('U'|'u')('L'|'l')('L'|'l');

KEYWORD_40 : ('S'|'s')('I'|'i')('Z'|'z')('E'|'e');

KEYWORD_41 : ('T'|'t')('H'|'h')('I'|'i')('S'|'s');

KEYWORD_42 : ('T'|'t')('R'|'r')('I'|'i')('M'|'m');

KEYWORD_43 : ('T'|'t')('R'|'r')('U'|'u')('E'|'e');

KEYWORD_26 : ('A'|'a')('S'|'s')('C'|'c');

KEYWORD_27 : ('A'|'a')('V'|'v')('G'|'g');

KEYWORD_28 : ('G'|'g')('E'|'e')('T'|'t');

KEYWORD_29 : ('I'|'i')('N'|'n')('T'|'t');

KEYWORD_30 : ('M'|'m')('A'|'a')('X'|'x');

KEYWORD_31 : ('M'|'m')('I'|'i')('N'|'n');

KEYWORD_32 : ('S'|'s')('U'|'u')('M'|'m');

KEYWORD_18 : '!''=';

KEYWORD_19 : '&''&';

KEYWORD_20 : '<''=';

KEYWORD_21 : '=''=';

KEYWORD_22 : '>''=';

KEYWORD_23 : ('A'|'a')('S'|'s');

KEYWORD_24 : ('B'|'b')('Y'|'y');

KEYWORD_25 : '|''|';

KEYWORD_1 : '!';

KEYWORD_2 : '%';

KEYWORD_3 : '&';

KEYWORD_4 : '(';

KEYWORD_5 : ')';

KEYWORD_6 : '*';

KEYWORD_7 : '+';

KEYWORD_8 : ',';

KEYWORD_9 : '-';

KEYWORD_10 : '.';

KEYWORD_11 : '/';

KEYWORD_12 : ':';

KEYWORD_13 : ';';

KEYWORD_14 : '<';

KEYWORD_15 : '>';

KEYWORD_16 : '|';

KEYWORD_17 : '~';



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



