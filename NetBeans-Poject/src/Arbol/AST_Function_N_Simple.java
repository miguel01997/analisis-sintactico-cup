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


    public String name;
    public String arg;
    public AST_Block N_Block;

    public AST_Function_N_Simple() {
    }

    public AST_Function_N_Simple(String name, String arg, AST_Block N_Block) {
        this.name = name;
        this.arg = arg;
        this.N_Block = N_Block;
    }





}
