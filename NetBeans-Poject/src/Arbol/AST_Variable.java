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
public abstract class AST_Variable extends AST_Declaration_Simple{

    public AST_Variable() {
    }

    public abstract Object visit(visitor v);


}
