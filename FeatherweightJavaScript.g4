grammar FeatherweightJavaScript;


@header { package edu.sjsu.fwjs.parser; }

// Reserved words
IF        : 'if' ;
ELSE      : 'else' ;
WHILE     : 'while' ;
FUNCTION  : 'function' ;
VAR       : 'var' ;
PRINT     : 'print' ;

// Literals
INT       : [1-9][0-9]* | '0' ;
BOOL	  : 'true' | 'false' ;
NULL	  : 'null' ;
ID        : [a-zA-Z_][a-zA-Z_0-9]* ;

// Symbols
MUL       : '*' ;
DIV       : '/' ;
SEPARATOR : ';' ;
ADD       : '+' ;
SUB       : '-' ;
MOD       : '%' ;
GT        : '>' ;
LT        : '<' ;
GE        : '>=' ;
LE        : '<=' ;
EQ        : '==' ;
ASSIGN    : '=' ;

// Whitespace and comments
NEWLINE   : '\r'? '\n' -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;
LINE_COMMENT  : '//' ~[\n\r]* -> skip ;
WS            : [ \t]+ -> skip ; // ignore whitespace


// ***Parsing rules ***

/** The start rule */
prog: stat+ ;

stat: expr SEPARATOR                                    # bareExpr
    | IF '(' expr ')' block ELSE block                  # ifThenElse
    | IF '(' expr ')' block                             # ifThen
    | WHILE '(' expr ')' block							# while
    | PRINT '(' expr ')' SEPARATOR						# print
    | SEPARATOR											# empty
    ;

expr: expr op=( '*' | '/' | '%' ) expr                  # MulDivMod
	| expr op=( '+' | '-' ) expr						# AddSub
	| expr op=( '<' | '<=' | '>' | '>=' | '==' ) expr	# Compare
	| FUNCTION '(' params ')' block					    # FuncDec
	| expr '(' args ')'									# FuncApp
	| VAR ID ASSIGN expr								# VarDec
	| ID												# VarRef
	| ID ASSIGN expr									# Assign
    | INT                                               # int
    | BOOL												# bool
    | NULL												# null
    | '(' expr ')'                                      # parens
    ;

block: '{' stat* '}'                                    # fullBlock
     | stat                                             # simpBlock
     ;
     
params: (ID (',' ID)* )? ;

args: (expr (',' expr)* )? ;
