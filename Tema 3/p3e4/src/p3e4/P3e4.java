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
     */ LocalDate date1;
            LocalDate date2;
    public static void main(String[] args)  {
       
            // TODO code application logic here
            boolean correcto = false;
            LocalDate date1 = null;
            LocalDate date2 = null;  
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
   
           
            
             
            Period Datafinal = Period.between(date1, date2);
            
            JOptionPane.showMessageDialog(null, "La diferencia entre fechas es: "+Datafinal);
            
            
            
        
    
       
       
    }
    
}
