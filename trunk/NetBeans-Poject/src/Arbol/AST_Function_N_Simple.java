/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;

/**
 *
 * @author lidier
 */
public class AST_Function_N_Simple extends AST_Function {


    //public String name;
    public Object name;
    //public String arg;
    public Object arg;
    public AST_Block N_Block;

    public AST_Function_N_Simple() {
    }

    public AST_Function_N_Simple(String name, String arg, AST_Block N_Block) {
        this.name = name;
        this.arg = arg;
        this.N_Block = N_Block;
    }

    public AST_Function_N_Simple(Object name, String arg, AST_Block N_Block) {
        this.name = name;
        this.arg = arg;
        this.N_Block = N_Block;
    }

    public AST_Function_N_Simple(Object name, Object arg, AST_Block N_Block) {
        this.name = name;
        this.arg = arg;
        this.N_Block = N_Block;
    }

    

    





}
