/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Sintactico;

/**
 *
 * @author lidier
 */
public class token {
    public int tipo;
    public int fila;
    public int columna;
    public Object lexema;
    
    public token (int t, int f, int c)
    {
       tipo = t;
       fila = f;
       columna = c;
       lexema = null;
    }

    public token (int t, int f, int c, Object o)
    {
       tipo = t;
       fila = f;
       columna = c;
       lexema = o;
    }
}
