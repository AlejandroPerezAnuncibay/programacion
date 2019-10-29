/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3e8;

import java.time.DateTimeException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class P3e8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String hacer = "";
        boolean correcto = false;
        do{
        try
        {
        hacer = JOptionPane.showInputDialog("¿Que deseas realizar?"
                +"\na.- Edad"
                +"\nb.- Suma entre dos números" 
                +"\nc.- Vocales en una cadena de caracteres" 
                +"\nd.- Salir" 
               );
        if (!hacer.equals("a") && !hacer.equals("b") && !hacer.equals("c") && !hacer.equals("d"))
        throw new VacioException();
        correcto=true;
        
        
            
        }
        catch (VacioException e){
        JOptionPane.showMessageDialog(null, "Introduce un valor valido");
        correcto = false;
        
        }
        catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(null,"Agur");
               System.exit(0);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Algo ha fallado");
                correcto = false;
            }
        }while(!correcto);
       switch(hacer) {
           case "a":calcularedad();
                   break;
           case "b": calcularsuma();
                   break;
           case "c": cadenacaracteres();
                   break;
           case "d": JOptionPane.showMessageDialog(null, "Agur");
           default: ;
       
       
       
       
       }
       
       
    }

    private static void calcularedad() {
         boolean correcto = false;
            LocalDate date1 = null;
            LocalDate hoy = LocalDate.now();
            int anos=0;
            
           
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
            catch(DateTimeException e){
            JOptionPane.showMessageDialog(null, "Introduce una fecha valida");
            correcto= false;
            }
            catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Solo puedes introducir números");
            correcto= false;
            }
            }while(!correcto);
            if(date1.getMonthValue()<=hoy.getMonthValue() && date1.getDayOfMonth()<=hoy.getDayOfMonth() ){
            anos = (hoy.getYear()- date1.getYear());
            
           
            JOptionPane.showMessageDialog(null, anos);
            }
            else{
                 anos = (hoy.getYear()- date1.getYear());
                  anos = anos - 1;
             JOptionPane.showMessageDialog(null, anos);
            }
           
            }

    private static void calcularsuma() {
      int n1= Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer digito:"));
      int n2= Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo digito:"));
    JOptionPane.showMessageDialog(null,n1 + n2);
    }

    private static void cadenacaracteres() {
        boolean correcto= false;

        String frase = JOptionPane.showInputDialog("Introduce una frase:");
        

        int vocales =0 ;
        for (int x = 0; x < frase.length(); x++) switch (frase.charAt(x))
            {
                case 'a':     
                case 'A':
                case 'e':     
                case 'E':
                case 'i':     
                case 'I':
                case 'o':     
                case 'O':
                case 'u':     
                case 'U':
                vocales = vocales +1;
                    break;
            }
        
        JOptionPane.showMessageDialog(null, "Hay "+vocales+" vocales en esa frase");
            
            
        }
       
        
        
        
    }

    
                
            
            
            
            
            
   
           
            
   
           
    
    

