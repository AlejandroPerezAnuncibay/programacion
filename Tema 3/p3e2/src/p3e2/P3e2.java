/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3e2;
import javax.swing.JOptionPane;
/**
 *
 * @author 1gdaw05
 */
public class P3e2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabra = JOptionPane.showInputDialog("Introduce una frase");
        String alreves = "";
        for (int x=palabra.length()-1;x>=0;x--){
		alreves = alreves + palabra.charAt(x);
        }
        JOptionPane.showMessageDialog(null, alreves);
    }
 
}
