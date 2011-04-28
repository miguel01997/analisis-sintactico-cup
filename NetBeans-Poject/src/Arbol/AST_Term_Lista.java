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

    public AST_Factor N_Factor;
    public AST_Term_Body N_Sig;
    

    public AST_Term_Lista() {
    }

    public AST_Term_Lista(AST_Factor N_Factor, AST_Term_Body N_Sig) {
        this.N_Factor = N_Factor;
        this.N_Sig = N_Sig;
    }

    

    
   

    
}
