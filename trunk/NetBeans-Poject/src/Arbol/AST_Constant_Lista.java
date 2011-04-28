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
public class AST_Constant_Lista extends AST_Constant{

    //public AST_Constant_Simple N_Constant;
    public AST_Constant_Def N_Constant_Def;
    public AST_Constant N_Sig;
    

    public AST_Constant_Lista() {
    }

    public AST_Constant_Lista(AST_Constant_Def N_Constant_Def, AST_Constant N_Sig) {
        this.N_Constant_Def = N_Constant_Def;
        this.N_Sig = N_Sig;
    }

    @Override
    public Object visit(visitor v){
        return v.visit_AST_Constant_Lista(this);
    }

    

    

}
