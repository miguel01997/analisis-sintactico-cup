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
public class AST_Function_N extends AST_Function{

    //public String name;
    public Object name;
    public AST_Block N_Block;

    public AST_Function_N() {
    }

    public AST_Function_N(String name, AST_Block N_Block) {
        this.name = name;
        this.N_Block = N_Block;
    }

    public AST_Function_N(Object name, AST_Block N_Block) {
        this.name = name;
        this.N_Block = N_Block;
    }

    @Override
    public Object visit(visitor v){
        return v.visit_AST_Function_N(this);
    }

    




}
