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
public class AST_Block_S extends AST_Block{

    public AST_Statement N_Statement;

    public AST_Block_S() {
    }

    public AST_Block_S(AST_Statement N_Statement) {
        this.N_Statement = N_Statement;
    }
    @Override
    public Object visit(visitor v){
        return v.visit_AST_Block_S(this);
    }





}
