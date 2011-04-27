/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;

/**
 *
 * @author lidier
 */
public class AST_Declaration_Lista extends AST_Declaration{

    public AST_Declaration_Lista N_Declaration_Lista;
    public AST_Declaration_Simple N_Declaration_Extra;

    public AST_Declaration_Lista() {
    }

    public AST_Declaration_Lista(AST_Declaration_Lista N_Declaration_Lista, AST_Declaration_Simple N_Declaration_Extra) {
        this.N_Declaration_Lista = N_Declaration_Lista;
        this.N_Declaration_Extra = N_Declaration_Extra;
    }





}
