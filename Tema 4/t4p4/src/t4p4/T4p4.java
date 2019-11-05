/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4p4;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class T4p4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String mes[] = new String[12];
        mes [0]= "Enero";
        mes [1]= "Febrero";
        mes [2]= "Marzo";
        mes [3]= "Abril";
        mes [4]= "Mayo";
        mes [5]= "Junio";
        mes [6]= "Julio";
        mes [7]= "Agosto";
        mes [8]= "Septiembre";
        mes [9]= "Octubre";
        mes [10]= "Noviembre";
        mes [11]= "Diciembre";
         String mesp = JOptionPane.showInputDialog(null, "Introduce un mes para validarlo: ");
        
        for (String i : mes){
           
            if(i.equalsIgnoreCase(mesp))
                JOptionPane.showMessageDialog(null, "El mes es correcto");
            
            
        }
        
    }
    
}
