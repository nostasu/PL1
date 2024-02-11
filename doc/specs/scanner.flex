package compiler.lexical;

import compiler.syntax.sym;
import compiler.lexical.Token;
import es.uned.lsi.compiler.lexical.ScannerIF;
import es.uned.lsi.compiler.lexical.LexicalError;
import es.uned.lsi.compiler.lexical.LexicalErrorManager;

// incluir aqui, si es necesario otras importaciones

%%
 
%public
%class Scanner
%char
%line
%column
%cup
%unicode


%implements ScannerIF
%scanerror LexicalError

// incluir aqui, si es necesario otras directivas
%ignorecase

%state STRING
%state COMMENT

%{
  LexicalErrorManager lexicalErrorManager = new LexicalErrorManager ();
  
  //Función para crear los tokens
	Token newToken(int number){
 		Token token = new Token (number);
        token.setLine (yyline + 1);
        token.setColumn (yycolumn + 1);
        token.setLexema (yytext ());
        return token;
	}
    
	//Para manejar los strings
	StringBuffer string = new StringBuffer();
%}  
  

ESPACIO_BLANCO=[ \t\r\n\f]
end = "fin"{ESPACIO_BLANCO}
//Añadidas
END_LINE = \r\n|\f|\r|\n
// Identificadores, es una secuencia ordenada de caracteres y dígitos que comienzan obligatoriamente por una letra
identifier = [a-zA-Z][a-zA-Z0-9]* 
number = 0|[1-9][0-9]*
//Definir un número malo cuando empieza
numberError = 0[0-9]+
%%

<YYINITIAL> 
{  	
	"--"					{ yybegin(COMMENT);}
    "and"                	{ return newToken(sym.AND);}
    "begin"                	{ return newToken(sym.BEGIN);} 
	"boolean" 				{ return newToken(sym.BOOLEAN);}
	"constant"				{ return newToken(sym.CONSTANT);}
	"else"					{ return newToken(sym.ELSE);}
	"end"					{ return newToken(sym.END);}
	"false"					{ return newToken(sym.FALSE);}
	"function" 				{ return newToken(sym.FUNCTION);}
	"if" 					{ return newToken(sym.IF);}
	"integer" 				{ return newToken(sym.INTEGER);}
	"is" 					{ return newToken(sym.IS);}
	"loop" 					{ return newToken(sym.LOOP);}
	"out" 					{ return newToken(sym.OUT);}
	"procedure" 			{ return newToken(sym.PROCEDURE);} 
	"put_line" 				{ return newToken(sym.PUTLINE);} 
	"record" 				{ return newToken(sym.RECORD);} 
	"return" 				{ return newToken(sym.RETURN);} 
	"then" 					{ return newToken(sym.THEN);} 
	"true" 					{ return newToken(sym.TRUE);}
	"type" 					{ return newToken(sym.TYPE);} 
	"while" 				{ return newToken(sym.WHILE);} 
    
    "("                	{ return newToken(sym.OPENPARENTHESIS);} 
    ")" 				{ return newToken(sym.CLOSEPARENTHESIS);}
    ","  				{ return newToken(sym.COMMA);}
    ";"					{ return newToken(sym.SEMICOLON);}
	":"					{ return newToken(sym.COLON);}
	"-"                	{ return newToken(sym.MINUS);} 
	"*"                	{ return newToken(sym.MULTIPLY);}       
	":="				{ return newToken(sym.ASSIGNMENT);}
	"."					{ return newToken(sym.DOT);}
	">"					{ return newToken(sym.GREATER);}
	"/="				{ return newToken(sym.DISTINCT);}	
	"\""				{ yybegin(STRING);}
	
    {identifier} 		{ return newToken(sym.IDENTIFIER);}
    {number}			{ return newToken(sym.NUMBER);}
    {numberError}		{ 
    						LexicalError error = new LexicalError ("Error Lexico numero mal formado");
        					error.setLine (yyline + 1);
        					error.setColumn (yycolumn + 1);
        					error.setLexema (yytext ());
        					lexicalErrorManager.lexicalFatalError (error);
    					}
    

   	{ESPACIO_BLANCO}	{}

	{end} {}
    
    // error en caso de coincidir con ningún patrón
	[^] {                                               
		LexicalError error = new LexicalError ("Error lexico: no coincide con ningun patron");
        error.setLine (yyline + 1);
        error.setColumn (yycolumn + 1);
        error.setLexema (yytext ());
        lexicalErrorManager.lexicalError (error);
	}
}

<COMMENT> 
{
	"\n" { yybegin(YYINITIAL);}
	[^] {}
}

<STRING> 
{
	\" { 
		yybegin(YYINITIAL);
		//No se crea otra funcion para este token para evitar la sobrecarga al usarla solo una vez
		int column = yycolumn - string.toString().length();
			Token token = new Token (sym.STRING);
			token.setLine (yyline + 1);
			token.setColumn (yycolumn + 1);
			token.setLexema (string.toString());
			return token;
	}
	
	[^\x00-\x1F\x7F\n\r\"]+	{ string.append( yytext() ); }
    [^]	{
		LexicalError error = new LexicalError ("Error Lexico: Cadena malformada");
		error.setLine (yyline + 1);
		error.setColumn (yycolumn + 1);
		error.setLexema (string.toString ());
		lexicalErrorManager.lexicalFatalError (error);

    }
}




