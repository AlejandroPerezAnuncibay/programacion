/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3e7;

import java.time.DateTimeException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.time.DayOfWeek;

/**
 *
 * @author 1gdaw05
 */
public class P3e7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     boolean correcto = false;
            LocalDate date1 = null;
            LocalDate date2 = null;  
            int contador =0;
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
           }
            catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Solo puedes introducir números");
            }
            catch(DateTimeException e){
            JOptionPane.showMessageDialog(null, "Introduce unos valores validos");
            }
            catch(NullPointerException e){
            }
            }while(!correcto);
            do{
            try{
            correcto=false;
            String diaa2 = JOptionPane.showInputDialog("Introduzca el dia");
            int dia2 = Integer.parseInt(diaa2);
            String mess2 = JOptionPane.showInputDialog("Introduzca el mes");
            int mes2 = Integer.parseInt(mess2);
            String anoo2 = JOptionPane.showInputDialog("Introduzca el año");
            int ano2 = Integer.parseInt(anoo2);
            correcto=true;
             date2 =  LocalDate.of(ano2,mes2,dia2);
             }
            catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Solo puedes introducir números");
            }
            catch(DateTimeException e){
            JOptionPane.showMessageDialog(null, "Introduce unos valores validos");
            }
            catch(NullPointerException e){
            }
            }while(!correcto);
            if (date1.isBefore(date2)){
            do{
            if (date1.getDayOfWeek()== DayOfWeek.SUNDAY)
                contador++;
            date1 = date1.plusDays(1);
            
            
            
            }while(date1.isBefore(date2));
                    }
            else
            {
            do{
            if (date2.getDayOfWeek()== DayOfWeek.SUNDAY)
                contador++;
            date2 = date2.plusDays(1);
            
            
            
            }while(date2.isBefore(date1));
            
            }
            JOptionPane.showMessageDialog(null, "Hay "+contador+" Domingos");
   
           
    }
    
}
