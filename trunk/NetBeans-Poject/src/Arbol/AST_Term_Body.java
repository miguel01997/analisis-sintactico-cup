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
public abstract class AST_Term_Body {

    public AST_Term_Body() {
    }

    public abstract Object visit(visitor v);



}
