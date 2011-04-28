/*
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;
import Visitor.*;

/**
 *
 * @author lidier
 */
public class AST_Variable_Lista extends AST_Variable {

    
    public AST_Variable_Simple N_Variable;
    public AST_Variable N_Sig;

    public AST_Variable_Lista() {
    }

 

    public AST_Variable_Lista(AST_Variable_Simple N_Variable, AST_Variable N_Sig) {
        this.N_Variable = N_Variable;
        this.N_Sig = N_Sig;
    }

    @Override
    public Object visit(visitor v){
        return v.visit_AST_Variable_Lista(this);
    }



    
    
    

}
