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
public class AST_Program extends AST_AST{

    public AST_Block N_Block;

    public AST_Program() {
    }

    public AST_Program(AST_Block N_Block) {
        this.N_Block = N_Block;
    }

    @Override
    public Object visit(visitor v){
        return v.visit_AST_Program(this);
    }



    
}
