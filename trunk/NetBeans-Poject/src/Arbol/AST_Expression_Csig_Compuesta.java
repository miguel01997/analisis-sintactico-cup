/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;

/**
 *
 * @author lidier
 */
public class AST_Expression_Csig_Compuesta extends AST_Expression {

    public int signo;
    public AST_Term N_Term;
    public AST_Expression_Term N_Expression_Term;

    public AST_Expression_Csig_Compuesta() {
    }

    public AST_Expression_Csig_Compuesta(int signo, AST_Term N_Term, AST_Expression_Term N_Expression_Term) {
        this.signo = signo;
        this.N_Term = N_Term;
        this.N_Expression_Term = N_Expression_Term;
    }



}
