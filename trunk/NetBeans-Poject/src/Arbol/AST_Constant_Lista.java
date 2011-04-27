/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;

/**
 *
 * @author lidier
 */
public class AST_Constant_Lista extends AST_Constant{

    public AST_Constant_Lista N_Constant_Lista;
    public AST_Constant N_Constant_Extra;

    public AST_Constant_Lista() {
    }

    public AST_Constant_Lista(AST_Constant_Lista N_Constant_Lista, AST_Constant N_Constant_Extra) {
        this.N_Constant_Lista = N_Constant_Lista;
        this.N_Constant_Extra = N_Constant_Extra;
    }



}
