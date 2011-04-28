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
public abstract class AST_Declaration {

    public AST_Declaration() {
    }


    public abstract Object visit(visitor v);
}
