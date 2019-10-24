/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3e6;
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
public class P3e6 {

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
      
            }
            catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Solo puedes introducir números");
            }
            }while(!correcto);
            int dia = date1.getDayOfYear();
            JOptionPane.showMessageDialog(null, dia);
           if(dia>0 && dia<79)
               JOptionPane.showMessageDialog(null, "La fecha es Invierno");
           if(dia>80 && dia<173)
               JOptionPane.showMessageDialog(null, "La fecha es Primavera");
           if(dia>174 && dia<271)
               JOptionPane.showMessageDialog(null, "La fecha es Verano");
           if(dia>272 && dia<355)
               JOptionPane.showMessageDialog(null, "La fecha es Otoño");
           if(dia>356 && dia<=365)
               JOptionPane.showMessageDialog(null, "La fecha es Primavera");
           
           
           
           
    }
}