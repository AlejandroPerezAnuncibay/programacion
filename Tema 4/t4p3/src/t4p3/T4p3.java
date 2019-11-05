/*
 * To change this license heaalfabeto[]=der;
choose License Headers in Project Properties.
 * To change this template falfabeto[]=ile;
choose Tools | Templates
 * and open the template in the editor.
 */
package t4p3;
import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 *
 * @author 1gdaw05
 */
public class T4p3 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        // TODO code application logic here
        int ped = 26;
        String cadena  = "";
        boolean correcto = false;
          
      char[] alfabeto = new char[26];  
       alfabeto[0]='A';
       alfabeto[1]='B';
       alfabeto[2]='C';
       alfabeto[3]='D';
       alfabeto[4]='E';
       alfabeto[5]='F';
       alfabeto[6]='G';
       alfabeto[7]='H';
       alfabeto[8]='I';
       alfabeto[9]='J';
       alfabeto[10]='K';
       alfabeto[11]='L';
       alfabeto[12]='M';
       alfabeto[13]='N';
       alfabeto[13]='Ñ';
       alfabeto[15]='O';
       alfabeto[16]='P';
       alfabeto[17]='Q';
       alfabeto[18]='R';
       alfabeto[19]='S';
       alfabeto[20]='U';
       alfabeto[21]='V';
       alfabeto[22]='W';
       alfabeto[23]='X';
       alfabeto[24]='Y';
       alfabeto[25]='Z';
        do{
            try{
            ped = Integer.parseInt(JOptionPane.showInputDialog("Teclea el número correspondiente a la letra: "));
         
         
         
         
            if( ped>25)
                 throw new NumeroException();
                         
            correcto = true;
            }
            catch (NumeroException e){
            JOptionPane.showMessageDialog(null, "Introduce un valor valido(25 o menor)");
            }
            catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Introduce un valor valido(25 o menor)");
            correcto=false;
            }
         
          }while(!correcto);
         
         
         
         
       while( ped != -1){
           cadena = cadena +alfabeto[ped];
           
              do{
            try{
            ped = Integer.parseInt(JOptionPane.showInputDialog("Teclea el número correspondiente a la letra: "));
         
         
         
         
            if( ped>25)
                 throw new NumeroException();
                         
            correcto = true;
            }
            catch (NumeroException e){
            JOptionPane.showMessageDialog(null, "Introduce un valor valido(25 o menor)");
            correcto=false;
            }
            catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Introduce un valor valido(25 o menor)");
            correcto=false;
            }
            
         
          }while(!correcto);
       
       
       }
       JOptionPane.showMessageDialog(null, cadena);
      }
    }
    

