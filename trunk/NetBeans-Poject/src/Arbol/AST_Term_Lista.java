/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;

/**
 *
 * @author lidier
 */
public class AST_Term_Lista extends AST_Term {

    public AST_Term_Lista N_Term_Lista;
    public int multiOdivi;
    public AST_Term_Simple N_Term_Extra;

    public AST_Term_Lista() {
    }

    public AST_Term_Lista(AST_Term_Lista N_Term_Lista, int multiOdivi, AST_Term_Simple N_Term_Extra) {
        this.N_Term_Lista = N_Term_Lista;
        this.multiOdivi = multiOdivi;
        this.N_Term_Extra = N_Term_Extra;
    }



    
}
