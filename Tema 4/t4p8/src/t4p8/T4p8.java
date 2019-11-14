/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4p8;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class T4p8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String todo ="";
         int[][] asis= new int[31][5];
         int[] codi = new int [5];
         int a = 0;
         int b;
         int x;
         String cont = "";
         boolean mal = false;
          
         do{
            
         int cod = Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo del alumno"));
              codi[a] = cod;
              do {
                   do{
          x = Integer.parseInt(JOptionPane.showInputDialog("¿Que día faltó el alumno? "));
          mal = true;
         if (asis[x-1][a]!=0){
             JOptionPane.showMessageDialog(null, "Ya habias introducido ese dia, prueba con otro");
             mal = false;
         }
             }while(mal == false);
             
         asis [x-1][a]= Integer.parseInt(JOptionPane.showInputDialog("Cuantas faltas tuvo el alumno ese día"));
        b=  JOptionPane.showConfirmDialog(null,"¿Quieres introducir otra falta para el alumno con el codigo: "+cod+ "?");
              }while(b == 0);
         
         cont = JOptionPane.showInputDialog("¿Quieres introducir otro alumno?");
         a += 1;
         }while(cont.equalsIgnoreCase("si") && a<codi.length);
         
//                 falta salida de datos
        for (int i = 0; i < codi.length; i++) {
            todo += "El alumno "+codi[i]+"ha faltado "+asis[i][i]+"\n";
            
        }
        JOptionPane.showMessageDialog(null,todo);
         
          
    
}
}
