package analizador;

import java_cup.runtime.*;
%%
%class Lexer

%cup
%line
%column

L = [a-zA-Z]
L2 = [a-z]
D = [0-9]
WHITE = [ \b\r\f\t\n]

%{
public String Lexeme;
public Symbol token(int simbolo){
		Lexema lexema = new Lexema( yytext() );
		Interface.setError("La cadena '"+yytext()+"' es invalida, se encontro en la linea "+(yyline+1)+", y en la columna "+(yycolumn+1));
		return new Symbol(simbolo,yyline,yycolumn,lexema);
	}
	public Symbol token(int simbolo,String componenteLexico){
		Sintactico.vars++;
		Lexema lexema = new Lexema( yytext() );
                Interface.addLexemes(yytext()+","+componenteLexico); // esta linea para el video Himura para la tabla de simbolos
		return new Symbol(simbolo,yyline,yycolumn,lexema);
	}
%}
%%
{WHITE} {/*Ignore*/}
//----------------> Simbolos

"->" { return token(sym.TRANSICION,"Transicion"); }
","  { return token(sym.SEPARADOR,"Separador"); }
";"  { return token(sym.DELIMITADOR,"Delimitador"); }
"("  { return token(sym.PARENTESIS_ABRE,"Parentesis_Abre"); }
")"  { return token(sym.PARENTESIS_CIERRA,"Parentesis_Cierra"); }

//--------------> Simbolos ER

"init"  { Lexeme=yytext(); return token(sym.INICIAL,"init");}

"state" { Lexeme=yytext(); return token(sym.ESTADO,"state");}

"alpha" { Lexeme=yytext(); return token(sym.ALFABETO,"alpha");}

"end"   { Lexeme=yytext(); return token(sym.FIN,"end");}

(({L2})|({D})) { Lexeme=yytext(); return token(sym.ALPHA,"Alfabeto");}

({L})+({D})+ { Lexeme=yytext(); return token(sym.IDENTIFICADOR,"Identificador");}

. {Lexeme=yytext(); return token(sym.ERROR);}