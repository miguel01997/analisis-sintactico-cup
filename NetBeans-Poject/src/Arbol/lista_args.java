/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;

/**
 *
 * @author lidier
 */
public class lista_args{

    //public String arg;
    public Object arg;
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
        
        public lista_args(Object arg) {
            this.arg = arg;
        }


    public lista_args(Object arg, lista_args sig) {
        this.arg = arg;
        this.sig = sig;
    }

        



    }
