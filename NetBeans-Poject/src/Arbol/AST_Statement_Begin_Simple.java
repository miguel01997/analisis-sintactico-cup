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
public class AST_Statement_Begin_Simple extends AST_Statement_Begin{

    public AST_Statement N_Statement;

    public AST_Statement_Begin_Simple() {
    }

    public AST_Statement_Begin_Simple(AST_Statement N_Statement) {
        this.N_Statement = N_Statement;
    }

    @Override
    public Object visit(visitor v){
        return v.visit_AST_Statement_Begin_Simple(this);
    }




}
