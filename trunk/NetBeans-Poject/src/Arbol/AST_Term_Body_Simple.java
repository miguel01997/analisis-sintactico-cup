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
public class AST_Term_Body_Simple extends AST_Term_Body{

    //public int multiOdivi;
    public Object multiOdivi;
    public AST_Factor N_Factor;

    public AST_Term_Body_Simple() {
    }

    public AST_Term_Body_Simple(int multiOdivi, AST_Factor N_Factor) {
        this.multiOdivi = multiOdivi;
        this.N_Factor = N_Factor;
    }

    public AST_Term_Body_Simple(Object multiOdivi, AST_Factor N_Factor) {
        this.multiOdivi = multiOdivi;
        this.N_Factor = N_Factor;
    }

    @Override
    public Object visit(visitor v){
        return v.visit_AST_Term_Body_Simple(this);
    }

    


}
