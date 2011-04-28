
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Visitor;
import javax.swing.*;
import javax.swing.tree.*;
import Arbol.*;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

/**
 *
 * @author Javier
 */
public class imprimir_visitor implements Visitor.visitor{
    
  public void imprimir(AST_AST raiz)
  {
      if (raiz != null)
      {
    DefaultMutableTreeNode root;
    root=new DefaultMutableTreeNode("AST");
    root.add((MutableTreeNode) raiz.visit(this));
     final DefaultTreeModel model = new DefaultTreeModel(root);
      final JTree tree = new JTree(model);
      // create a text field and button to modify the data model
      JPanel addPanel = new JPanel(new GridLayout(2, 1));
      // listen for selections
    tree.addTreeSelectionListener(new TreeSelectionListener(  )
        {
            public void valueChanged(TreeSelectionEvent e)
            {
                  TreePath tp = e.getNewLeadSelectionPath(  );
            }
        });
        
      // create a JFrame to hold the tree
     JFrame frame = new JFrame("Arbol de Sintaxis Abstracta");

      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      frame.setSize(400,600);
      frame.getContentPane().add(new JScrollPane(tree));
      frame.getContentPane().add(addPanel, BorderLayout.SOUTH);
      frame.setVisible(true);
        }
 else
      {
          System.out.println("No se puede imprimir el arbol debido a que no existen nodos");
        JOptionPane.showMessageDialog(null,"No se puede imprimir el arbol debido a que no existen nodos","Imposible imprimir", 1);
 
 }
    }

    
    public Object visit_AST_Block_DS(AST_Block_DS N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Declaration.visit(this));
        v.add((MutableTreeNode)N.N_Statement.visit(this));

        return v;
    }

    public Object visit_AST_Block_S(AST_Block_S N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Statement.visit(this));
        return v;
    }

    public Object visit_AST_Condition_Expression(AST_Condition_Expression N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.Exp1.visit(this));
        v.add((MutableTreeNode)N.Exp2.visit(this));
        v.add(new DefaultMutableTreeNode(String.valueOf(N.Op)));
        return v;



    }

    public Object visit_AST_Condition_Odd(AST_Condition_Odd N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Expression.visit(this));
        return v;

    }

    public Object visit_AST_Constant_Def(AST_Constant_Def N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add(new DefaultMutableTreeNode(String.valueOf(N.name)));
        v.add(new DefaultMutableTreeNode(String.valueOf(N.number)));
        return v;
    }

    public Object visit_AST_Constant_Lista(AST_Constant_Lista N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Constant_Def.visit(this));
        v.add((MutableTreeNode)N.N_Sig.visit(this));
        return v;
    }

    public Object visit_AST_Constant_Simple(AST_Constant_Simple N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Constant_Def.visit(this));
        return v;
    }

    public Object visit_AST_Expression_Csig_Compuesta(AST_Expression_Csig_Compuesta N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Expression_Term.visit(this));
        v.add((MutableTreeNode)N.N_Term.visit(this));
        v.add(new DefaultMutableTreeNode(String.valueOf(N.signo)));
        return v;
    }

    public Object visit_AST_Declaration_Lista(AST_Declaration_Lista N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Declaration.visit(this));
        v.add((MutableTreeNode)N.N_Sig.visit(this));
        return v;
    }



    public Object visit_AST_Expression_Csig_Simple(AST_Expression_Csig_Simple N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Term.visit(this));
        v.add(new DefaultMutableTreeNode(N.signo));
        return v;
    }

    public Object visit_AST_Expression_Ssig_Compuesta(AST_Expression_Ssig_Compuesta N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Expression_Term.visit(this));
        v.add((MutableTreeNode)N.N_Term.visit(this));
        return v;
    }

    public Object visit_AST_Expression_Ssig_Simple(AST_Expression_Ssig_Simple N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Term.visit(this));
        return v;
    }


    public Object visit_AST_Expression_Term_Lista(AST_Expression_Term_Lista N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Term.visit(this));
        v.add((MutableTreeNode)N.N_Sig.visit(this));
        return v;
    }

    public Object visit_AST_Expression_Term_Simple(AST_Expression_Term_Simple N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add(new DefaultMutableTreeNode(N.signo));
        v.add((MutableTreeNode)N.N_Term.visit(this));
        return v;
    }

    public Object visit_AST_Factor_Expression(AST_Factor_Expression N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Expression.visit(this));
        return v;
    }

    public Object visit_AST_Factor_Name_Expression_Lista(AST_Factor_Name_Expression_Lista N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add(new DefaultMutableTreeNode(N.name));
        v.add((MutableTreeNode)N.lista.visit(this));
        return v;
    }

    public Object visit_AST_Factor_Name_Expression_Simple(AST_Factor_Name_Expression_Simple N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Expression.visit(this));
        v.add(new DefaultMutableTreeNode(N.name));
        return v;
    }

    public Object visit_AST_Factor_Name_Expression_Solo(AST_Factor_Name_Expression_Solo N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add(new DefaultMutableTreeNode(N.name));
        return v;
    }

    public Object visit_AST_Factor_Name_Simple(AST_Factor_Name_Simple N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add(new DefaultMutableTreeNode(N.name));
        return v;
    }

    public Object visit_AST_Function_N(AST_Function_N N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Block.visit(this));
        v.add(new DefaultMutableTreeNode(N.name));
        return v;
    }

    public Object visit_AST_Factor_Number(AST_Factor_Number N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add(new DefaultMutableTreeNode(N.number));
        return v;
    }

    public Object visit_AST_Function_N_Lista(AST_Function_N_Lista N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add(new DefaultMutableTreeNode(N.name));
        v.add((MutableTreeNode)N.args.visit(this));
        v.add((MutableTreeNode)N.N_Block.visit(this));
        return v;
    }

    public Object visit_AST_Function_N_Simple(AST_Function_N_Simple N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add(new DefaultMutableTreeNode(N.name));
        v.add(new DefaultMutableTreeNode(N.arg));
        v.add((MutableTreeNode)N.N_Block.visit(this));
        return v;
    }

    public Object visit_AST_Program(AST_Program N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Block.visit(this));
        return v;
    }

    public Object visit_AST_Statement_Begin_Lista(AST_Statement_Begin_Lista N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Statement.visit(this));
        v.add((MutableTreeNode)N.N_Sig.visit(this));
        return v;
    }

    public Object visit_AST_Statement_Begin_Simple(AST_Statement_Begin_Simple N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Statement.visit(this));
        return v;
    }





    public Object visit_AST_Statement_If(AST_Statement_If N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Condition.visit(this));
        v.add((MutableTreeNode)N.N_Statement.visit(this));
        return v;
    }

    public Object visit_AST_Statement_Name(AST_Statement_Name N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add(new DefaultMutableTreeNode(N.name));
        v.add((MutableTreeNode)N.N_Expression.visit(this));
        return v;
    }

    public Object visit_AST_Statement_Return(AST_Statement_Return N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Expression.visit(this));
        return v;
    }

    public Object visit_AST_Statement_Vacio(AST_Statement_Vacio N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        return v;
    }

    public Object visit_AST_Statement_While(AST_Statement_While N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Condition.visit(this));
        v.add((MutableTreeNode)N.N_Statement.visit(this));
        return v;
    }

    public Object visit_AST_Statement_Write(AST_Statement_Write N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Expression.visit(this));
        return v;
    }

    public Object visit_AST_Term_Body_Lista(AST_Term_Body_Lista N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Factor.visit(this));
        v.add(new DefaultMutableTreeNode(N.multiOdivi));
        v.add((MutableTreeNode)N.N_Sig.visit(this));
        return v;
    }
    public Object visit_AST_Term_Body_Simple(AST_Term_Body_Simple N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Factor.visit(this));
        v.add(new DefaultMutableTreeNode(N.multiOdivi));
        
        return v;
    }

    public Object visit_AST_Term_Simple(AST_Term_Simple N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Factor.visit(this));
        return v;
    }

   public Object visit_AST_Term_Lista(AST_Term_Lista N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Factor.visit(this));
        v.add((MutableTreeNode)N.N_Sig.visit(this));
        return v;
    }

   public Object visit_AST_Variable_Lista(AST_Variable_Lista N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Variable.visit(this));
        v.add((MutableTreeNode)N.N_Sig.visit(this));
        return v;
    }


    public Object visit_AST_Variable_Simple(AST_Variable_Simple N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add(new DefaultMutableTreeNode(N.name));
        return v;
    }

    public Object visit_lista_args(lista_args N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add(new DefaultMutableTreeNode(N.arg));
        v.add((MutableTreeNode)N.sig.visit(this));
        return v;
    }

    public Object visit_lista_expression(lista_expression N) {
        DefaultMutableTreeNode v = new DefaultMutableTreeNode(N.getClass().getName());
        v.add((MutableTreeNode)N.N_Exp.visit(this));
        v.add((MutableTreeNode)N.sig.visit(this));
        return v;
    }


    
}

