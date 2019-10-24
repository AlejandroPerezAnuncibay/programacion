/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3e3;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class P3e3 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        // TODO code application logic here
        String palabra = JOptionPane.showInputDialog("Introduce una frase");
        String busqueda = JOptionPane.showInputDialog("Introduce el caracter que quieres buscar");
        char caracter = busqueda.charAt(0);
        int cont = 0;
        for (int i = 0; i < palabra.length(); i++) { 
            if( palabra.charAt(i) == caracter)
                cont=cont+1;
            
        }
        JOptionPane.showMessageDialog(null, "Esta palabra tiene "+cont+" veces ese caracter");
    }
    
}
