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
public class AST_Function_N_Lista extends AST_Function{


    //public String name;
    public Object name;
    public lista_args args;
    public AST_Block N_Block;

    

    public AST_Function_N_Lista() {
    }

    public AST_Function_N_Lista(String name, AST_Block N_Block) {
        this.name = name;
        this.N_Block = N_Block;
    }

    public AST_Function_N_Lista(Object name, AST_Block N_Block) {
        this.name = name;
        this.N_Block = N_Block;
    }

    public AST_Function_N_Lista(Object name, lista_args args, AST_Block N_Block) {
        this.name = name;
        this.args = args;
        this.N_Block = N_Block;
    }

    @Override
    public Object visit(visitor v){
        return v.visit_AST_Function_N_Lista(this);
    }
    
    



    



    

}
