/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;

/**
 *
 * @author lidier
 */
public class AST_Statement_Name extends AST_Statement {


    //public String name;
    public Object name;

    public AST_Expression N_Expression;

    public AST_Statement_Name() {
    }

    public AST_Statement_Name(String name, AST_Expression N_Expression) {
        this.name = name;
        this.N_Expression = N_Expression;
    }

    public AST_Statement_Name(Object name, AST_Expression N_Expression) {
        this.name = name;
        this.N_Expression = N_Expression;
    }

    



    
}
