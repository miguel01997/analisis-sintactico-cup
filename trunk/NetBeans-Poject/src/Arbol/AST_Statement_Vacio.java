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
public class AST_Statement_Vacio extends AST_Statement {

    //---------------------------
    //ESTA CLASE NO ES ABSTRACTA
    //----------------------------
    public AST_Statement_Vacio() {
    }

    @Override
    public Object visit(visitor v){
        return v.visit_AST_Statement_Vacio(this);
    }



}
