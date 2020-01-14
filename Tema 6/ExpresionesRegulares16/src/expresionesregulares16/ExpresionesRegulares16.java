/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresionesregulares16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class ExpresionesRegulares16 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
           
      String nEntero = JOptionPane.showInputDialog("Introduce una fecha");
     
         Pattern pEntero= Pattern.compile("(([0][1-9]|[1-2][0-9]|[3][0-1])/([0][1]|[0][3]|[0][5]|[0][7-8]|[1][0]|[1][2]) / ([0-9]{4}))"
                 + "|(([0][1-9]|[1-2][0-9]|[3][0])/([0][4]|[0][6]|[0][5]|[0][9]|[1][1])/([0-9]{4}))"
                 + "|(([0][1-9]|[1-2][0-8])/([0][2])/([0-9]{4}))");
        Matcher mEntero = pEntero.matcher(nEntero);
        
        if(mEntero.matches())
            JOptionPane.showMessageDialog(null, "Es una fecha");
        else
            JOptionPane.showMessageDialog(null, "No es una fecha");
    }
}