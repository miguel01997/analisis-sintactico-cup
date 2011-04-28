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
public abstract class AST_Block {

    public AST_Block() {
    }

    public abstract Object visit(visitor v);


}
