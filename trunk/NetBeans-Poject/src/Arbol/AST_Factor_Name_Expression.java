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
public abstract class AST_Factor_Name_Expression extends AST_Factor_Name{

   

    public AST_Factor_Name_Expression() {
    }

    public abstract Object visit(visitor v);

    
}
