parser grammar Rx;

@header{
    package src.parser;
}

options {
    tokenVocab = Lex;
}

crate: item* EOF? ;

item: function | struct | enumeration | constant_item | trait | implementation ;

function: CONST? FN IDENTIFIER
            LPAR function_parameters? RPAR
            (RARROW type)?
            (block_expression | SEMI) ;

function_parameters
    : self_param COMMA?
    | (self_param COMMA)? function_param (COMMA function_param)*
    ;

function_param: pattern COLON type ;

self_param: (AND? MUT? SELF_KW) | (MUT? SELF_KW COLON type) ;

struct: STRUCT IDENTIFIER (LBCE struct_fields? RBCE | SEMI) ;

struct_fields: struct_field (COMMA struct_field)* COMMA? ;

struct_field: IDENTIFIER COLON type ;

enumeration: ENUM IDENTIFIER LBCE enum_variants? RBCE ;

enum_variants: enum_variant (COMMA enum_variant)* COMMA? ;

enum_variant: IDENTIFIER;

constant_item: CONST IDENTIFIER COLON type (EQ expression)? SEMI ;

trait: TRAIT IDENTIFIER LBCE associated_item* RBCE ;

implementation: inderent_impl | trait_impl ;

inderent_impl: IMPL type LBCE associated_item* RBCE ;

trait_impl: IMPL IDENTIFIER FOR type LBCE associated_item* RBCE ;

associated_item: function | constant_item ;

statement:
    SEMI
    | item
    | let_statement
    | expression_statement
    ;

let_statement: LET pattern (COLON type)? ( EQ expression )? SEMI;

expression_statement: expression_without_block SEMI | expression_with_block SEMI? ;

expression
    : LPAR expression RPAR
    | LPAR ((expression COMMA)+ expression?)? RPAR
    | expression DOT path_expr_segment LPAR call_params? RPAR
    | expression DOT IDENTIFIER
    | expression DOT INTEGER_LITERAL
    | expression LBKT expression RBKT
    | expression LPAR call_params? RPAR
// >>>> operator_expression
    | (AND | ANDAND) expression | (AND | ANDAND) MUT expression
    | STAR expression
    | NOT expression | MINUS expression
    | expression (STAR | SLASH | PERCENT) expression
    | expression (PLUS | MINUS) expression
    | expression (SHL | SHR) expression
    | expression (LT | LE | EQEQ | NE | GE | GT) expression
    | expression (AND | CARET | OR) expression
    | expression (ANDAND | OROR) expression
    | expression DOTDOT expression
    | expression AS type
    | <assoc = right> expression (EQ | PLUSEQ | MINUSEQ | STAREQ | SLASHEQ | PERCENTEQ | CARETEQ | ANDEQ | OREQ | SHLEQ | SHREQ) expression
// <<<<
    | LBKT array_elements? RBKT
    | path_in_expression LBCE struct_expr_fields? RBCE
    | CONTINUE
    | BREAK expression?
    | RETURN expression?
    | literal_expression
    | path_expression
    | UNDERSCORE
    | block_expression
    | const_block_expression
    | loop_expression
    | if_expression
    | match_expression
    ;

expression_without_struct
    : LPAR expression_without_struct RPAR
    | LPAR ((expression_without_struct COMMA)+ expression_without_struct?)? RPAR
    | expression_without_struct DOT path_expr_segment LPAR call_params? RPAR
    | expression_without_struct DOT IDENTIFIER
    | expression DOT INTEGER_LITERAL
    | expression_without_struct LBKT expression_without_struct RBKT
    | expression_without_struct LPAR call_params? RPAR
// >>>> operator_expression
    | (AND | ANDAND) expression_without_struct | (AND | ANDAND) MUT expression_without_struct
    | STAR expression_without_struct
    | NOT expression_without_struct | MINUS expression_without_struct
    | expression_without_struct (STAR | SLASH | PERCENT) expression_without_struct
    | expression_without_struct (PLUS | MINUS) expression_without_struct
    | expression_without_struct (SHL | SHR) expression_without_struct
    | expression_without_struct (LT | LE | EQEQ | NE | GE | GT) expression_without_struct
    | expression_without_struct (AND | CARET | OR) expression_without_struct
    | expression_without_struct (ANDAND | OROR) expression_without_struct
    | expression_without_struct DOTDOT expression_without_struct
    | expression_without_struct AS type
    | <assoc = right> expression_without_struct (EQ | PLUSEQ | MINUSEQ | STAREQ | SLASHEQ | PERCENTEQ | CARETEQ | ANDEQ | OREQ | SHLEQ | SHREQ) expression_without_struct
// <<<<
    | LBKT array_elements? RBKT
    | CONTINUE
    | BREAK expression_without_struct?
    | RETURN expression_without_struct?
    | literal_expression
    | path_expression
    | UNDERSCORE
    | block_expression
    | const_block_expression
    | loop_expression
    | if_expression
    | match_expression
    ;

expression_without_block
    : LPAR expression RPAR
    | LPAR ((expression COMMA)+ expression?)? RPAR
// >>>> operator_expression
    | <assoc = right> expression (EQ | PLUSEQ | MINUSEQ | STAREQ | SLASHEQ | PERCENTEQ | CARETEQ | ANDEQ | OREQ | SHLEQ | SHREQ) expression
    | expression AS type
    | expression DOTDOT expression
    | expression (ANDAND | OROR) expression
    | expression (AND | CARET | OR) expression
    | expression (LT | LE | EQEQ | NE | GE | GT) expression
    | expression (SHL | SHR) expression
    | expression (PLUS | MINUS) expression
    | expression (STAR | SLASH | PERCENT) expression
    | NOT expression | MINUS expression
    | STAR expression
    | (AND | ANDAND) expression | (AND | ANDAND) MUT expression
// <<<<
    | expression LPAR call_params? RPAR
    | expression LBKT expression RBKT
    | expression DOT INTEGER_LITERAL
    | expression DOT IDENTIFIER
    | expression DOT path_expr_segment LPAR call_params? RPAR
    | LBKT array_elements? RBKT
    | path_in_expression LBCE struct_expr_fields? RBCE
    | CONTINUE
    | BREAK expression?
    | RETURN expression?
    | literal_expression
    | path_expression
    | UNDERSCORE
    ;

expression_with_block
    : block_expression
    | const_block_expression
    | loop_expression
    | if_expression
    | match_expression
    ;

literal_expression:
    CHAR_LITERAL
    | STRING_LITERAL
    | RAW_STRING_LITERAL
    | INTEGER_LITERAL
    | TRUE
    | FALSE
    ; // leaving out C strings

path_expression: path_in_expression ;

borrow_expression: (AND | ANDAND) expression | (AND | ANDAND) MUT expression ;
dereference_expression: STAR expression ;
negation_expression: NOT expression | MINUS expression ;
arithmetic_or_logical_expression: expression (PLUS | MINUS | STAR | SLASH | PERCENT | CARET | AND | OR | SHL | SHR) expression ;
comparison_expression: expression (LT | LE | EQEQ | NE | GE | GT) expression ;
lazy_boolean_expression: expression (ANDAND | OROR) expression ;
assignment_expression: expression EQ expression ;
compound_assignment_expression: expression (PLUSEQ | MINUSEQ | STAREQ | SLASHEQ | PERCENTEQ | CARETEQ | ANDEQ | OREQ | SHLEQ | SHREQ) expression ;

grouped_expression: LPAR expression RPAR ;

array_expression: LBKT array_elements? RBKT ;
array_elements: expression (COMMA expression)* COMMA? | expression SEMI expression ;

index_expression: expression LBKT expression RBKT ;

struct_expression: path_in_expression LBCE struct_expr_fields? RBCE ;
struct_expr_fields: struct_expr_field (COMMA struct_expr_field)* COMMA? ;
struct_expr_field: IDENTIFIER COLON expression | IDENTIFIER ;

call_expression: expression LPAR call_params? RPAR ;
call_params: expression (COMMA expression)* COMMA? ;

method_call_expression: expression DOT path_expr_segment LPAR call_params? RPAR ;

field_expression: expression DOT IDENTIFIER ;

continue_expression: CONTINUE ;
break_expression: BREAK expression? ;
return_expression: RETURN expression? ;
underscore_expression: UNDERSCORE ;

block_expression: LBCE statements? RBCE ;
statements: statement+ | statement+ expression_without_block | expression_without_block ;

const_block_expression: CONST block_expression ;

loop_expression: infinite_loop_expression | predicate_loop_expression ;
infinite_loop_expression: LOOP block_expression ;
predicate_loop_expression: WHILE conditions block_expression ;

if_expression: IF conditions block_expression (ELSE (if_expression | block_expression))? ;
conditions: expression_without_struct | let_chain ; // leaving out let chains

let_chain: let_chain_condition (ANDAND let_chain_condition)* ;
let_chain_condition:
    expression_without_struct
    | LET pattern EQ scrutinee
    ;

match_expression: MATCH scrutinee LBCE match_arms? RBCE ;
scrutinee: expression_without_struct;
match_arms:
    (match_arm FATARROW (expression_without_block COMMA | expression_with_block COMMA?))*
    match_arm FATARROW expression COMMA?
    ;
match_arm: pattern;

pattern
    : literal_pattern
    | identifier_pattern
    | wildcard_pattern
    | reference_pattern
    | tuple_struct_pattern
    | path_pattern
    ;

literal_pattern: MINUS? literal_expression ;

identifier_pattern: REF? MUT? IDENTIFIER ;

wildcard_pattern: UNDERSCORE ;

reference_pattern: (AND | ANDAND) MUT? pattern ;

tuple_struct_pattern: path_in_expression LPAR tuple_struct_items? RPAR ;

tuple_struct_items: pattern (COMMA pattern)* COMMA? ;

path_pattern: path_in_expression ;

type: type_path | reference_type | array_type | slice_type | inferred_type | tuple_type;

reference_type: AND MUT? type ;

array_type: LBKT type SEMI expression RBKT ;

slice_type: LBKT type RBKT ;

tuple_type: LPAR ((type COMMA)+ type?)? RPAR ;

inferred_type: UNDERSCORE ;

path_in_expression: path_expr_segment (PATHSEP path_expr_segment)* ;
path_expr_segment: path_ident_segment ;
path_ident_segment: IDENTIFIER | SELF_KW | SELF_TYPE ;

type_path: type_path_segment ;
type_path_segment: path_ident_segment ;
