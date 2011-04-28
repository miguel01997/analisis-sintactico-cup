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
public class AST_Expression_Term_Lista extends AST_Expression_Term{

    
    
    public AST_Expression_Term_Simple N_Term;
    public AST_Expression_Term N_Sig;

    public AST_Expression_Term_Lista() {
    }

    public AST_Expression_Term_Lista(AST_Expression_Term_Simple N_Term, AST_Expression_Term N_Sig) {
        this.N_Term = N_Term;
        this.N_Sig = N_Sig;
    }

    @Override
    public Object visit(visitor v){
        return v.visit_AST_Expression_Term_Lista(this);
    }

    

   



}
