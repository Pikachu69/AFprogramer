package analizador;
import static analizador.Token.*;
%%
%class Lexer
%type Token
L = [a-zA-Z]
L2 = [a-z]
D = [0-9]
A = [(]
A2 = [)]
WHITE=[ \t\r\n]
%{
public String lexeme;
%}
%%
{WHITE} {/*Ignore*/}
"->" {return TRANSICION;}

"," {return SIMBOLO;}

"init" {lexeme=yytext(); return PALABRA_RESERVADA;}

"state" {lexeme=yytext(); return PALABRA_RESERVADA;}

"alpha" {lexeme=yytext(); return PALABRA_RESERVADA;}

"end" {lexeme=yytext(); return PALABRA_RESERVADA;}

(" ")(({L2})|({D})) {lexeme=yytext(); return ALFABETO;}

(" ")({L})+({D})+ {lexeme=yytext(); return IDENTIFICADOR;}

";" {return DELIMITADOR;}

{A}({L2})((",")?({L2})?)*{A2} {lexeme = yytext(); return ASIGNACION;}

. {return ERROR;}