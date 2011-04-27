/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;

/**
 *
 * @author lidier
 */
public class AST_Factor_Name_Expression_Lista extends AST_Factor_Name_Expression {


    public String name;


    public class lista_expression
    {
        public AST_Expression N_Exp = null;
        public lista_expression sig = null;

        public lista_expression() {
        }

        public lista_expression(AST_Expression N_Exp) {
            this.N_Exp = N_Exp;
        }

        public lista_expression(AST_Expression N_Exp, lista_expression sig) {
            this.N_Exp = N_Exp;
            this.sig = sig;
        }





    }

    public AST_Factor_Name_Expression_Lista() {
    }

    public AST_Factor_Name_Expression_Lista(String name) {
        this.name = name;
    }



}
