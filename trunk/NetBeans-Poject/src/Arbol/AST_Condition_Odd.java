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
public class AST_Condition_Odd extends AST_Condition{

    public AST_Expression N_Expression;

    public AST_Condition_Odd() {
    }

    public AST_Condition_Odd(AST_Expression N_Expression) {
        this.N_Expression = N_Expression;
    }

    @Override
    public Object visit(visitor v){
        return v.visit_AST_Condition_Odd(this);
    }

    
}
