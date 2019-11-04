/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4p2;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class T4p2 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
      int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud"));
      String todos ="";
      int total= 0;
      int[] numeros = new int[a];  
      for(int i : numeros){ 
          Arrays.sort(numeros);
     i = (int)(Math.random()*10)+1;
     JOptionPane.showMessageDialog(null, i);
     
     total = total + i;
      
      
      
      }
     
      JOptionPane.showMessageDialog(null, "El total es: "+total);
    }
    
}