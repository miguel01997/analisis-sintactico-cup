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
public class AST_Term_Body_Lista extends AST_Term_Body{

    //public int multiOdivi;
    public Object multiOdivi;
    public AST_Factor N_Factor;


    public AST_Term_Body N_Sig;

    public AST_Term_Body_Lista() {
    }

    public AST_Term_Body_Lista(int multiOdivi, AST_Factor N_Factor, AST_Term_Body N_Sig) {
        this.multiOdivi = multiOdivi;
        this.N_Factor = N_Factor;
        this.N_Sig = N_Sig;
    }

    public AST_Term_Body_Lista(Object multiOdivi, AST_Factor N_Factor, AST_Term_Body N_Sig) {
        this.multiOdivi = multiOdivi;
        this.N_Factor = N_Factor;
        this.N_Sig = N_Sig;
    }

    @Override
    public Object visit(visitor v){
        return v.visit_AST_Term_Body_Lista(this);
    }

    

    

    
}
