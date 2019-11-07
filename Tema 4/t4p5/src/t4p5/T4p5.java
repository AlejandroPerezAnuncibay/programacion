/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4p5;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class T4p5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      String cont="si";
     
     int nmes;
     
      int agua[] = new int [12];
      
        
       do{
          
           nmes = Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes "));
           agua[nmes-1] += Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de agua caida: "));
           cont = JOptionPane.showInputDialog("¿quieres continuar?");
       }while(cont.equalsIgnoreCase("si"));
       JOptionPane.showMessageDialog(null, 
       "Enero: "+agua[0]+"\n"+
       "Febrero: "+agua[1]+"\n"+
       "Marzo: "+agua[2]+"\n"+
       "Abril: "+agua[3]+"\n"+
       "Mayo: "+agua[4]+"\n"+
       "Junio: "+agua[5]+"\n"+
       "Julio: "+agua[6]+"\n"+
       "Agosto: "+agua[7]+"\n"+
       "Septiembre: "+agua[8]+"\n"+
       "Octubre: "+agua[9]+"\n"+
       "Noviembre: "+agua[10]+"\n"+
       "Diciembre: "+agua[11]+"\n");
    }
    
}
