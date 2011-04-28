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
public class AST_Factor_Number extends AST_Factor {

    //public int number;
    public Object number;

    public AST_Factor_Number() {
    }

    public AST_Factor_Number(int number) {
        this.number = number;
    }

    public AST_Factor_Number(Object number) {
        this.number = number;
    }

    @Override
    public Object visit(visitor v){
        return v.visit_AST_Factor_Number(this);
    }

    



    

}
