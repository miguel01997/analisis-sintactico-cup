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
public abstract class AST_Declaration_Simple extends AST_Declaration{

    public AST_Declaration_Simple() {
    }

    public abstract Object visit(visitor v);




}
