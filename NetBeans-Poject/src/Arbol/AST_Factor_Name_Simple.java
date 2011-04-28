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
public class AST_Factor_Name_Simple extends AST_Factor_Name{

    //public String name;
    public Object name;

    public AST_Factor_Name_Simple() {
    }

    public AST_Factor_Name_Simple(String name) {
        this.name = name;
    }

    public AST_Factor_Name_Simple(Object name) {
        this.name = name;
    }

    @Override
    public Object visit(visitor v){
        return v.visit_AST_Factor_Name_Simple(this);
    }

    




}
