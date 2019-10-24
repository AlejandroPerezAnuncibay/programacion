/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3e5;
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
public class P3e5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
       
            // TODO code application logic here
            boolean correcto = false;
            LocalDate date1 = null;
        
            do{
            try{
            String diaa = JOptionPane.showInputDialog("Introduzca el dia");
            int dia = Integer.parseInt(diaa);
            String mess = JOptionPane.showInputDialog("Introduzca el mes");
            int mes = Integer.parseInt(mess);
            String anoo = JOptionPane.showInputDialog("Introduzca el año");
            int ano = Integer.parseInt(anoo);
            correcto=true;
              date1 =  LocalDate.of(ano,mes,dia);
              date1 = date1.plusDays(+100);
            }
            catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Solo puedes introducir números");
            }
            }while(!correcto);
            JOptionPane.showMessageDialog(null, date1.getDayOfWeek()+", "+date1.getDayOfMonth()+" of "+date1.getMonth()+" of "+date1.getYear());
           
    }
    
}
