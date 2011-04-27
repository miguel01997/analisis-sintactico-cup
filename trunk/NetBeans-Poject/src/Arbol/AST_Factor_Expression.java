/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;

/**
 *
 * @author lidier
 */
public class AST_Factor_Expression extends AST_Factor{


    public AST_Expression N_Expression;

    public AST_Factor_Expression() {
    }

    public AST_Factor_Expression(AST_Expression N_Expression) {
        this.N_Expression = N_Expression;
    }



}
