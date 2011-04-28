/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Visitor;
import Arbol.*;

/**
 *
 * @author Javier
 */
public interface visitor {
    
    public Object visit_AST_Block_DS (AST_Block_DS N);
    public Object visit_AST_Block_S (AST_Block_S N);
    public Object visit_AST_Condition_Expression (AST_Condition_Expression N);
    public Object visit_AST_Condition_Odd (AST_Condition_Odd N);
    public Object visit_AST_Constant_Def (AST_Constant_Def N);
    public Object visit_AST_Constant_Lista (AST_Constant_Lista N);
    public Object visit_AST_Constant_Simple (AST_Constant_Simple N);
    public Object visit_AST_Declaration_Lista (AST_Declaration_Lista N);
    public Object visit_AST_Expression_Csig_Compuesta (AST_Expression_Csig_Compuesta N);
    public Object visit_AST_Expression_Csig_Simple (AST_Expression_Csig_Simple N);
    public Object visit_AST_Expression_Ssig_Compuesta (AST_Expression_Ssig_Compuesta N);
    public Object visit_AST_Expression_Ssig_Simple (AST_Expression_Ssig_Simple N);
    public Object visit_AST_Expression_Term_Lista (AST_Expression_Term_Lista N);
    public Object visit_AST_Expression_Term_Simple (AST_Expression_Term_Simple N);
    public Object visit_AST_Factor_Expression (AST_Factor_Expression N);
    public Object visit_AST_Factor_Name_Expression_Lista (AST_Factor_Name_Expression_Lista N);
    public Object visit_AST_Factor_Name_Expression_Simple (AST_Factor_Name_Expression_Simple N);
    public Object visit_AST_Factor_Name_Expression_Solo (AST_Factor_Name_Expression_Solo N);
    public Object visit_AST_Factor_Name_Simple (AST_Factor_Name_Simple N);
    public Object visit_AST_Factor_Number (AST_Factor_Number N);
    public Object visit_AST_Function_N (AST_Function_N N);
    public Object visit_AST_Function_N_Lista (AST_Function_N_Lista N);
    public Object visit_AST_Function_N_Simple (AST_Function_N_Simple N);
    public Object visit_AST_Program (AST_Program N);
    public Object visit_AST_Statement_Begin_Lista (AST_Statement_Begin_Lista N);
    public Object visit_AST_Statement_Begin_Simple (AST_Statement_Begin_Simple N);
    public Object visit_AST_Statement_If (AST_Statement_If N);
    public Object visit_AST_Statement_Name (AST_Statement_Name N);
    public Object visit_AST_Statement_Return (AST_Statement_Return N);
    public Object visit_AST_Statement_Vacio (AST_Statement_Vacio N);
    public Object visit_AST_Statement_While (AST_Statement_While N);
    public Object visit_AST_Statement_Write (AST_Statement_Write N);
    public Object visit_AST_Term_Body_Lista (AST_Term_Body_Lista N);
    public Object visit_AST_Term_Body_Simple (AST_Term_Body_Simple N);
    public Object visit_AST_Term_Lista (AST_Term_Lista N);
    public Object visit_AST_Term_Simple (AST_Term_Simple N);
    public Object visit_AST_Variable_Lista (AST_Variable_Lista N);
    public Object visit_AST_Variable_Simple (AST_Variable_Simple N);
    public Object visit_lista_args (lista_args N);
    public Object visit_lista_expression (lista_expression N);
    

    
    
    
}
