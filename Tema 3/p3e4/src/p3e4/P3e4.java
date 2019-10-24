/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3e4;
import java.text.*;
import java.time.*;
import javax.swing.JOptionPane;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author 1gdaw05
 */
public class P3e4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
       
            // TODO code application logic here
            
            String diaa = JOptionPane.showInputDialog("Introduzca el dia");
            int dia = Integer.parseInt(diaa);
            String mess = JOptionPane.showInputDialog("Introduzca el mes");
            int mes = Integer.parseInt(mess);
            String anoo = JOptionPane.showInputDialog("Introduzca el año");
            int ano = Integer.parseInt(anoo);
            
           /* LocalDate mm = LocalDate.parse(mess);
            LocalDate yy = LocalDate.parse(anoo);
            LocalDate dd = LocalDate.parse(diaa);*/
           
            LocalDate date1 =  LocalDate.of(ano,mes,dia);
            JOptionPane.showMessageDialog(null, date1);
            String diaa2 = JOptionPane.showInputDialog("Introduzca el dia");
            int dia2 = Integer.parseInt(diaa2);
            String mess2 = JOptionPane.showInputDialog("Introduzca el mes");
            int mes2 = Integer.parseInt(mess2);
            String anoo2 = JOptionPane.showInputDialog("Introduzca el año");
            int ano2 = Integer.parseInt(anoo2);
            LocalDate date2 =  LocalDate.of(ano2,mes2,dia2);
            
             JOptionPane.showMessageDialog(null, date2);
            Period Datafinal = Period.between(date1, date2);
            JOptionPane.showMessageDialog(null, "La diferencia entre fechas es: "+Datafinal);
            
            
            
        
    
       
       
    }
    
}
