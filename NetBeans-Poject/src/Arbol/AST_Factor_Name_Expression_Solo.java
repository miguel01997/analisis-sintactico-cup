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
public class AST_Factor_Name_Expression_Solo extends AST_Factor_Name_Expression{

    //public String name;
    public Object name;


    public AST_Factor_Name_Expression_Solo() {
    }

    public AST_Factor_Name_Expression_Solo(String name) {
        this.name = name;
    }

    public AST_Factor_Name_Expression_Solo(Object name) {
        this.name = name;
    }

    @Override
    public Object visit(visitor v){
        return v.visit_AST_Factor_Name_Expression_Solo(this);
    }

    





}
