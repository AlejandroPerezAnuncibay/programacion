/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4p1;

import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 *
 * @author 1gdaw05
 */
public class T4p1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int[] numeros = new int[10];  
      for(int i : numeros){
     numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número"));
      
      
      
      }
      Arrays.sort(numeros);
      JOptionPane.showMessageDialog(null, "El menor es: "+numeros[0]+" y el mayor: "+numeros[9]);
    }
    
}
