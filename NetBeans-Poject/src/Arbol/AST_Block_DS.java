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
public class AST_Block_DS extends AST_Block {

    public AST_Statement N_Statement;
    public AST_Declaration N_Declaration;

    public AST_Block_DS() {
    }

    public AST_Block_DS(AST_Statement N_Statement, AST_Declaration N_Declaration) {
        this.N_Statement = N_Statement;
        this.N_Declaration = N_Declaration;
    }

    @Override
    public Object visit(visitor v){
        return v.visit_AST_Block_DS(this);
    }



    
}
