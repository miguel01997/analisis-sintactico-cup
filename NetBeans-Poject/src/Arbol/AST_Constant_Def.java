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
public class AST_Constant_Def {

    //public String name;
    //public int number;

    public Object name;
    public Object number;

    public AST_Constant_Def() {
    }

    public AST_Constant_Def(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public AST_Constant_Def(Object name, Object number) {
        this.name = name;
        this.number = number;
    }

    
    public Object visit(visitor v){
        return v.visit_AST_Constant_Def(this);
    }

    



}
