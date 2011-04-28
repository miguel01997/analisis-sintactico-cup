/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;

/**
 *
 * @author lidier
 */
public class AST_Factor_Name_Expression_Simple extends AST_Factor_Name_Expression {

    //public String name;
    public Object name;

    public AST_Expression N_Expression;

    public AST_Factor_Name_Expression_Simple() {
    }

    public AST_Factor_Name_Expression_Simple(String name, AST_Expression N_Expression) {
        this.name = name;
        this.N_Expression = N_Expression;
    }

    public AST_Factor_Name_Expression_Simple(Object name, AST_Expression N_Expression) {
        this.name = name;
        this.N_Expression = N_Expression;
    }

    





}
