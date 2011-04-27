/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;

/**
 *
 * @author lidier
 */
public class AST_Statement_Write extends AST_Statement {

    public AST_Expression N_Expression;

    public AST_Statement_Write() {
    }

    public AST_Statement_Write(AST_Expression N_Expression) {
        this.N_Expression = N_Expression;
    }



    

}
