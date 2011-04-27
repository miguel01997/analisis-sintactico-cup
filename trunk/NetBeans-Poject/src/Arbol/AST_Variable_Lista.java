/*
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;

/**
 *
 * @author lidier
 */
public class AST_Variable_Lista extends AST_Variable {

    public AST_Variable_Lista N_Variable_Lista;
    public AST_Variable_Simple N_Variable_Extra;

    public AST_Variable_Lista() {
    }

    public AST_Variable_Lista(AST_Variable_Lista N_Variable_Lista, AST_Variable_Simple N_Variable_Extra) {
        this.N_Variable_Lista = N_Variable_Lista;
        this.N_Variable_Extra = N_Variable_Extra;
    }


    
    

}
