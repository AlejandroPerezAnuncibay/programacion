/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4p7;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class T4p7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double importe = 0;
        double[] cambio= {0.01,0.02,0.05,0.1,0.2,0.5,1,2,5,10,20,50,100,200,500};
        double total = Double.parseDouble(JOptionPane.showInputDialog("Introduce el total a pagar"));
        do{
       importe = Double.parseDouble(JOptionPane.showInputDialog("Introduce el dinero"));
        if (importe<total)
            JOptionPane.showMessageDialog(null, "No puedes dar menos de lo que tienes que pagar!");
    
        }while(importe<total);
    
}
