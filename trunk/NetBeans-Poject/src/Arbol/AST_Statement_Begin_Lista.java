/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;

/**
 *
 * @author lidier
 */
public class AST_Statement_Begin_Lista extends AST_Statement_Begin{

    public AST_Statement_Begin Lista;
    public AST_Statement_Begin_Simple Statement_Extra;

    public AST_Statement_Begin_Lista() {
    }

    public AST_Statement_Begin_Lista(AST_Statement_Begin Lista, AST_Statement_Begin_Simple Statement_Extra) {
        this.Lista = Lista;
        this.Statement_Extra = Statement_Extra;
    }



    

}
