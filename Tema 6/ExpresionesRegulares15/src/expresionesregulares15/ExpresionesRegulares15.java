/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresionesregulares15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class ExpresionesRegulares15 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
           
      String nEntero = JOptionPane.showInputDialog("Introduce un numero binario");
      String nDecimales = JOptionPane.showInputDialog("Cuantos decimales has introducido?");
         Pattern pEntero= Pattern.compile("^-[\\d]+[,.][\\d]{"+nDecimales+"}");
        Matcher mEntero = pEntero.matcher(nEntero);
        
        if(mEntero.matches())
            JOptionPane.showMessageDialog(null, "Es un entero");
        else
            JOptionPane.showMessageDialog(null, "No es un entero");
    }
}