/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;

/**
 *
 * @author lidier
 */
public class AST_Statement_While extends AST_Statement {

    public AST_Condition N_Condition;
    public AST_Statement N_Statement;

    public AST_Statement_While() {
    }

    public AST_Statement_While(AST_Condition N_Condition, AST_Statement N_Statement) {
        this.N_Condition = N_Condition;
        this.N_Statement = N_Statement;
    }



    

}
