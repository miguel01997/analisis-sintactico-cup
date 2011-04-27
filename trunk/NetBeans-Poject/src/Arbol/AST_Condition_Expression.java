/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;

/**
 *
 * @author lidier
 */
public class AST_Condition_Expression extends AST_Condition{

    public AST_Expression Exp1;
    public int Op;
    public AST_Expression Exp2;

    public AST_Condition_Expression() {
    }

    public AST_Condition_Expression(AST_Expression Exp1, int Op, AST_Expression Exp2) {
        this.Exp1 = Exp1;
        this.Op = Op;
        this.Exp2 = Exp2;
    }




}
