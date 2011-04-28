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
public abstract class AST_Constant extends AST_Declaration_Simple{

    public AST_Constant() {
    }

    public abstract Object visit(visitor v);


}
