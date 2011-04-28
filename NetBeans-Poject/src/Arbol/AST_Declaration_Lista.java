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

    //public AST_Declaration_Simple N_Declaration;
    public AST_Declaration N_Declaration;
    public AST_Declaration N_Sig;
    

    public AST_Declaration_Lista() {
    }

    public AST_Declaration_Lista(AST_Declaration N_Declaration, AST_Declaration N_Sig) {
        this.N_Declaration = N_Declaration;
        this.N_Sig = N_Sig;
    }

  



}
