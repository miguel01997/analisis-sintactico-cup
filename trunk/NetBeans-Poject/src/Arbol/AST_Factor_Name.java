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
public abstract class AST_Factor_Name extends AST_Factor{

    public AST_Factor_Name() {
    }

    public abstract Object visit(visitor v);


}
