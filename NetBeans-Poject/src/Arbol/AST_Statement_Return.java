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
public class AST_Statement_Return extends AST_Statement {

    public AST_Expression N_Expression;

    public AST_Statement_Return() {
    }

    public AST_Statement_Return(AST_Expression N_Expression) {
        this.N_Expression = N_Expression;
    }

    @Override
    public Object visit(visitor v){
        return v.visit_AST_Statement_Return(this);
    }






}
