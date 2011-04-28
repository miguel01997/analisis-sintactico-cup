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
public class AST_Factor_Name_Expression_Lista extends AST_Factor_Name_Expression {

    //public String name;
    public Object name;
    public lista_expression lista;


 

    public AST_Factor_Name_Expression_Lista() {
    }

    public AST_Factor_Name_Expression_Lista(String name, lista_expression lista) {
        this.name = name;
        this.lista = lista;
    }

    public AST_Factor_Name_Expression_Lista(Object name, lista_expression lista) {
        this.name = name;
        this.lista = lista;
    }

    @Override
    public Object visit(visitor v){
        return v.visit_AST_Factor_Name_Expression_Lista(this);
    }

    


    



}
