/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresionesregulares6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class ExpresionesRegulares6 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
      String nEntero = JOptionPane.showInputDialog("Introduce un numero entero");
        Pattern pEntero= Pattern.compile("[0-9][0-9][0-9][0-9][A-Z][A-Z][A-Z]$");
        Matcher mEntero = pEntero.matcher(nEntero);
        
        if(mEntero.matches())
            JOptionPane.showMessageDialog(null, "Es una matricula");
        else
            JOptionPane.showMessageDialog(null, "No es una matricula");
    }
    
}
