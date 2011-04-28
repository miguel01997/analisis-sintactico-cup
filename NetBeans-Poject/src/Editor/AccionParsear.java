/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Editor;

/**
 *
 * @author lidier
 */
import java.awt.Event;
import javax.swing.AbstractAction;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import javax.swing.Action;
import javax.swing.KeyStroke;
import javax.swing.text.JTextComponent;
import java.awt.event.ActionEvent;


public class AccionParsear extends AbstractAction
{
    private JTextComponent areaTexto;

    public void actionPerformed (ActionEvent e)
   {
        try
        {
      String texto = areaTexto.getText();
      InputStream stream = new ByteArrayInputStream(texto.getBytes());
      Sintactico.Scanner sca = new Sintactico.Scanner(stream);
      Sintactico.parser par = new Sintactico.parser(sca);
      par.parse();
       }

        catch(Exception ex)
       {
            
       }
      
   }

    public AccionParsear(JTextComponent areaTexto)
    {
        this.areaTexto = areaTexto;
        this.putValue(Action.NAME, "Parsear");
        this.putValue(
            Action.ACCELERATOR_KEY,
            KeyStroke.getAWTKeyStroke('P', Event.CTRL_MASK));
    }


}
