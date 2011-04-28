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
public class AST_Expression_Csig_Simple extends AST_Expression {

    //public int signo;
    public Object signo;
    public AST_Term N_Term;

    public AST_Expression_Csig_Simple() {
    }

    public AST_Expression_Csig_Simple(int signo, AST_Term N_Term) {
        this.signo = signo;
        this.N_Term = N_Term;
    }

    public AST_Expression_Csig_Simple(Object signo, AST_Term N_Term) {
        this.signo = signo;
        this.N_Term = N_Term;
    }

    @Override
    public Object visit(visitor v){
        return v.visit_AST_Expression_Csig_Simple(this);
    }

    




}
