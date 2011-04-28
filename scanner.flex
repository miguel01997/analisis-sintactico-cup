/**
 * Scanner para la gramática de prueba del curso de Compiladores e Intérpretes.
 */
import java_cup.runtime.*;
%%

%public
%implements java_cup.runtime.Scanner
%class Scanner
%function next_token
%type java_cup.runtime.Symbol
%unicode
%line
%column
%cup
%debug




%eofval{
  return new java_cup.runtime.Symbol(<CUPSYM>.EOF);
%eofval}
%eofclose


%{
  StringBuffer string = new StringBuffer();

  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }
%}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment} 

TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}

Identifier = [:jletter:] [:jletterdigit:]*

DecIntegerLiteral = 0 | [1-9][0-9]*

%state STRING

%%

/* Palabras reservadas */

<YYINITIAL> "VAR"            { return symbol(sym.Sym_Var); }
<YYINITIAL> "RETURN"            { return symbol(sym.Sym_Return); }
<YYINITIAL> "IF"            { return symbol(sym.Sym_If); }
<YYINITIAL> "DO"                            { return symbol(sym.Sym_Do); }
<YYINITIAL> "WHILE"                            { return symbol(sym.Sym_While); }
<YYINITIAL> "WRITE"                            { return symbol(sym.Sym_Write); }
<YYINITIAL> "END"                            { return symbol(sym.Sym_End); }
<YYINITIAL> "BEGIN"                            { return symbol(sym.Sym_Begin); }
<YYINITIAL> "FUNCTION"                            { return symbol(sym.Sym_Function); }
<YYINITIAL> "ODD"                            { return symbol(sym.Sym_Odd); }
<YYINITIAL> "THEN"                            { return symbol(sym.Sym_Then); }
<YYINITIAL> "CONST"                            { return symbol(sym.Sym_Const); }


<YYINITIAL> {
  /* identificadores */ 
  {Identifier}                   { return symbol(sym.Sym_Name,yytext()); }
 
  /* literales enteros positivos */
  {DecIntegerLiteral}            { return symbol(sym.Sym_Number,yytext()); }
  \"                             { string.setLength(0); yybegin(STRING); }

  /* operadores */
  "+"                            { return symbol(sym.Sym_Mas); }
  "-"                           { return symbol(sym.Sym_Menos); }
  "/"                            { return symbol(sym.Sym_Division); }
  "*"                            { return symbol(sym.Sym_Multiplicacion); }
  "<>"                           { return symbol(sym.Sym_Diferente); }
  "="                            { return symbol(sym.Sym_Igual); }
  "<"                            { return symbol(sym.Sym_Menor); }
  ">"                           { return symbol(sym.Sym_Mayor); }
  "<="                            { return symbol(sym.Sym_MenorIgual); }
  ">="                            { return symbol(sym.Sym_MayorIgual); }
  


  /* otros simbolos válidos */
  "("                            { return symbol(sym.Sym_ParenI); }
  ")"                           { return symbol(sym.Sym_ParenF); }
  ";"                            { return symbol(sym.Sym_PuntoYComa); }
  ","                            { return symbol(sym.Sym_Coma); }
  ":="                            { return symbol(sym.Sym_DosPIgual); }
  "."                            { return symbol(sym.Sym_Punto); }



  
  /* commentarios */
  {Comment}                      { /* ignore */ }
 
  /* espacios en blanco */
  {WhiteSpace}                   { /* ignore */ }
}


/* caracteres no válidos */
.|\n                             { throw new Error("Caracter no permitido: "+ yytext()); }

