/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;

/**
 *
 * @author lidier
 */
public class AST_Function_N_Lista extends AST_Function{


    public String name;
    public lista_args args = null;
    public AST_Block N_Block;

    public class lista_args{

        public String arg;
        public lista_args sig;

        public lista_args() {
        }

        public lista_args(String arg) {
            this.arg = arg;
        }

        public lista_args(String arg, lista_args sig) {
            this.arg = arg;
            this.sig = sig;
        }



    }

    public AST_Function_N_Lista() {
    }

    public AST_Function_N_Lista(String name, AST_Block N_Block) {
        this.name = name;
        this.N_Block = N_Block;
    }



    

}
