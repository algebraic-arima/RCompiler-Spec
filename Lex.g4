lexer grammar Lex;

@header{
    package src.parser;
}

AS      : 'as' ;
BREAK   : 'break' ;
CONST   : 'const' ;
CONTINUE: 'continue' ;
CRATE   : 'crate' ;
ELSE    : 'else' ;
ENUM    : 'enum' ;
FALSE   : 'false' ;
FN      : 'fn' ;
FOR     : 'for' ;
IF      : 'if' ;
IMPL    : 'impl' ;
IN      : 'in' ;
LET     : 'let' ;
LOOP    : 'loop' ;
MATCH   : 'match' ;
MOVE    : 'move' ;
MUT     : 'mut' ;
PUB     : 'pub' ;
REF     : 'ref' ;
RETURN  : 'return' ;
SELF_KW : 'self' ;
SELF_TYPE : 'Self' ;
STATIC  : 'static' ;
STRUCT  : 'struct' ;
SUPER   : 'super' ;
TRAIT   : 'trait' ;
TRUE    : 'true' ;
TYPE_KW : 'type' ;
UNSAFE  : 'unsafe' ;
USE     : 'use' ;
WHERE   : 'where' ;
WHILE   : 'while' ;
DYN     : 'dyn' ;

//USIZE: 'usize' ;
//ISIZE: 'isize' ;
//U32: 'u32' ;
//I32: 'i32' ;

// omitted
WS: [\u0009\u000A\u000B\u000C\u000D\u0020\u0085\u200E\u200F\u2028\u2029]+ -> skip;
LINE_COMMENT: '//' ~[\n]* -> skip;
BLOCK_COMMENT: '/*' BLOCK_COMMENT_CONTENT* '*/' -> skip;

INTEGER_LITERAL: (DEC_LITERAL | HEX_LITERAL | OCT_LITERAL | BIN_LITERAL) IDENTIFIER?; // leaving out SUFFIX_NO_E since no floating point
DEC_LITERAL: DEC_DIGIT (DEC_DIGIT | '_')* ;
BIN_LITERAL: '0b' (BIN_DIGIT | '_')* BIN_DIGIT (BIN_DIGIT | '_')* ;
OCT_LITERAL: '0o' (OCT_DIGIT | '_')* OCT_DIGIT (OCT_DIGIT | '_')* ;
HEX_LITERAL: '0x' (HEX_DIGIT | '_')* HEX_DIGIT (HEX_DIGIT | '_')* ;

CHAR_LITERAL: '\'' (~[\u0027\u005C\u000A\u000D\u0009] | QUOTE_ESCAPE | ASCII_ESCAPE) '\'' ;
STRING_LITERAL: '"' (~[\u0022\u005C\u000D] | QUOTE_ESCAPE | ASCII_ESCAPE | STRING_CONTINUE)* '"' ;

RAW_STRING_LITERAL: 'r' RAW_STRING_CONTENT;
RAW_STRING_CONTENT: '"' (~[\u000D])* '"' | '#' RAW_STRING_CONTENT '#';

PLUS: '+';
MINUS: '-';
STAR: '*';
SLASH: '/';
PERCENT: '%';
CARET: '^';
NOT: '!';

LT: '<';
LE: '<=';
EQEQ: '==';
NE: '!=';
GE: '>=';
GT: '>';

ANDAND: '&&';
OROR: '||';

SHL: '<<';
SHR: '>>';
AND: '&';
OR: '|';

PLUSEQ: '+=';
MINUSEQ: '-=';
STAREQ: '*=';
SLASHEQ: '/=';
PERCENTEQ: '%=';
CARETEQ: '^=';
ANDEQ: '&=';
OREQ: '|=';
SHLEQ: '<<=';
SHREQ: '>>=';
EQ: '=';

UNDERSCORE: '_';

DOT: '.';
DOTDOT: '..';
DOTDOTDOT: '...';

COMMA: ',';
SEMI: ';';
COLON:':';
PATHSEP: '::';
RARROW: '->';
FATARROW: '=>';
QUESTION: '?';

LPAR: '(';
RPAR: ')';
LBKT: '[';
RBKT: ']';
LBCE: '{';
RBCE: '}';

IDENTIFIER: [a-zA-Z][a-zA-Z_0-9]*;

fragment NUL: '\u0000' ;
fragment TAB: '\u0009' ;
fragment LF : '\u000A' ;
fragment CR : '\u000D' ;
fragment BIN_DIGIT: [01];
fragment OCT_DIGIT: [0-7];
fragment DEC_DIGIT: [0-9];
fragment HEX_DIGIT: [0-9a-fA-F];
fragment QUOTE_ESCAPE: '\\\'' | '\\"' ;
fragment ASCII_ESCAPE: '\\x' OCT_DIGIT HEX_DIGIT | '\\n' | '\\r' | '\\t' | '\\\\' | '\\0' ;
fragment STRING_CONTINUE: '\\' LF;

fragment BLOCK_COMMENT_CONTENT: BLOCK_COMMENT | ~[*/] | STAR ~[/] | SLASH ~[*];
