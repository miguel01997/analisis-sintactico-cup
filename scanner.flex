/**
 * Scanner para la gramática de prueba del curso de Compiladores e Intérpretes.
 */
import java_cup.runtime.*;
%%

%class Scanner
%unicode
%line
%column
%type token
%function nextToken
%cup

%eofval{
  return symbol(sym.EOF);
%eofval}

%{
  StringBuffer string = new StringBuffer();

  private token symbol(int type) {
    return new token(type, yyline, yycolumn);
  }
  private token symbol(int type, Object value) {
    return new token(type, yyline, yycolumn, value);
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
  ";"                            { return symbol(Sym.Sym_PuntoYComa); }
  ","                            { return symbol(Sym.Sym_Coma); }
  ":="                            { return symbol(Sym.Sym_DosPIgual); }
  "."                            { return symbol(Sym.Sym_Punto); }



  
  /* commentarios */
  {Comment}                      { /* ignore */ }
 
  /* espacios en blanco */
  {WhiteSpace}                   { /* ignore */ }
}


/* caracteres no válidos */
.|\n                             { throw new Error("Caracter no permitido: "+ yytext()); }

