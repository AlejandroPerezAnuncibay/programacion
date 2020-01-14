/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresiones.regulares;
import java.util.regex.*;
import javax.swing.JOptionPane;
/**
 *
 * @author 1gdaw05
 */
public class ExpresionesRegulares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nEntero = JOptionPane.showInputDialog("Introduce un numero entero");
        Pattern pEntero= Pattern.compile("^-?[0-9]+$");
        Matcher mEntero = pEntero.matcher(nEntero);
        
        if(mEntero.matches())
            JOptionPane.showMessageDialog(null, "Si que es entero");
        else
            JOptionPane.showMessageDialog(null, "No es entero");
    }
    
    
}
