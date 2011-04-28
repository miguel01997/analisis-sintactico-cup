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
public class AST_Term_Simple extends AST_Term{

    public AST_Factor N_Factor;

    public AST_Term_Simple() {
    }

    public AST_Term_Simple(AST_Factor N_Factor) {
        this.N_Factor = N_Factor;
    }

    @Override
    public Object visit(visitor v){
        return v.visit_AST_Term_Simple(this);
    }




}
