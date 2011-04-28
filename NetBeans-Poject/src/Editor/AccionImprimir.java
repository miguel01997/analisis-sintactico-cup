package Editor;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Event;
import javax.swing.AbstractAction;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import javax.swing.Action;
import javax.swing.KeyStroke;
import javax.swing.text.JTextComponent;
import java.awt.event.ActionEvent;


public class AccionImprimir extends AbstractAction
{
    private JTextComponent areaTexto;

    public void actionPerformed (ActionEvent e)
   {
        try
        {

      String texto = areaTexto.getText();
      InputStream stream = new ByteArrayInputStream(texto.getBytes());
       //= Sintactico.parser.main(stream);

      Sintactico.Scanner sca = new Sintactico.Scanner(stream);
      Sintactico.parser par = new Sintactico.parser(sca);
      par.parse();
      
      //Visitor.imprimir_visitor instancia_imp = new Visitor.imprimir_visitor();
      //instancia_imp.imprimir(arbol);
       }

        catch(Exception ex)
       {

       }

      


   }

    public AccionImprimir(JTextComponent areaTexto)
    {
        this.areaTexto = areaTexto;
        this.putValue(Action.NAME, "COMPILAR CON IMPRESION DE AST");
        this.putValue(
            Action.ACCELERATOR_KEY,
            KeyStroke.getAWTKeyStroke('I', Event.CTRL_MASK));
    }


}
