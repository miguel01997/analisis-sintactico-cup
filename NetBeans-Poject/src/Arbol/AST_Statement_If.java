/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;
import Visitor.*;

/**
 *
 * @author lidier
 */
public class AST_Statement_If extends AST_Statement {

    public AST_Condition N_Condition;
    public AST_Statement N_Statement;

    public AST_Statement_If() {
    }

    public AST_Statement_If(AST_Condition N_Condition, AST_Statement N_Statement) {
        this.N_Condition = N_Condition;
        this.N_Statement = N_Statement;
    }

    @Override
    public Object visit(visitor v){
        return v.visit_AST_Statement_If(this);
    }



    

}
