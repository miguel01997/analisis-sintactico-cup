/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;

/**
 *
 * @author lidier
 */
public class AST_Expression_Term_Lista extends AST_Expression_Term{

    public AST_Expression_Term_Lista Expression_Term_Lista;
    public AST_Term N_Term_Extra;

    public AST_Expression_Term_Lista() {
    }

    public AST_Expression_Term_Lista(AST_Expression_Term_Lista Expression_Term_Lista, AST_Term N_Term_Extra) {
        this.Expression_Term_Lista = Expression_Term_Lista;
        this.N_Term_Extra = N_Term_Extra;
    }



}
