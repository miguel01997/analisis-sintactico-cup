/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;
import Visitor.*;

/**
 *
 * @author lidier
 */
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

public Object visit(visitor v){
        return v.visit_lista_expression(this);
    }



    }
