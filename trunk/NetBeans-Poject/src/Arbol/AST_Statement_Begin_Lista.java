/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;

/**
 *
 * @author lidier
 */
public class AST_Statement_Begin_Lista extends AST_Statement_Begin{

    
    public AST_Statement N_Statement;
    public AST_Statement_Begin N_Sig;

    public AST_Statement_Begin_Lista() {
    }

    public AST_Statement_Begin_Lista(AST_Statement N_Statement, AST_Statement_Begin N_Sig) {
        this.N_Statement = N_Statement;
        this.N_Sig = N_Sig;
    }




    

}
