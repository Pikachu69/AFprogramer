package analizador;
import static analizador.Token.*;
%%
%class Lexer
%type Token
L = [a-zA-Z]
L2 = [a-z]
D = [0-9]
C = [,]
F = [;]
WHITE=[ \t\r\n]
%{
public String lexeme;
%}
%%
{WHITE} {/*Ignore*/}
"->" {return TRANSICION;}

("alpha")(" ")({L2}|{D})({C}(" ")*({L2}|{D}))*({F}) {lexeme=yytext(); return ALFABETO}

("state")(" ")({L}|{D})({L}|{D})*({C}(" ")*({L}|{D})({L}|{D})*)*({F}) {lexeme=yytext(); return IDENTIFICADOR;}

. {return ERROR;}