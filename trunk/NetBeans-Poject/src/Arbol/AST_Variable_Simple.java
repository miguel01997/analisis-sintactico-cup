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
public class AST_Variable_Simple extends AST_Variable {

    //public String name;
    public Object name;

    public AST_Variable_Simple() {
    }

    public AST_Variable_Simple(String name) {
        this.name = name;
    }

    public AST_Variable_Simple(Object name) {
        this.name = name;
    }

    @Override
    public Object visit(visitor v){
        return v.visit_AST_Variable_Simple(this);
    }

    

    


}
