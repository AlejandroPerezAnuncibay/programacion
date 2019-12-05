/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5p2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class T5p2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        ArrayList<ArrayList<Integer>> alumnado = new ArrayList<ArrayList<Integer>>();
        ArrayList<String> idiomas = new ArrayList<String>();
     
        ArrayList<String> nivel = new ArrayList<String>();
   
        
         
        String niv;
        String idi;
        String cont;
        do{
           alumnado.add(new ArrayList<Integer>());
        idi = JOptionPane.showInputDialog("Escoge el idioma\n1.Ingles\n2.Aleman\n3.Frances\n4.Ruso");
        
      
      int e = idiomas.indexOf(idi);
       if(e == -1 ){
          idiomas.add(idi);
        }
       niv = JOptionPane.showInputDialog("Introduce el nivel. Bajo, Medio, Perfeccion");
        nivel.add(niv);
        int alu;
        alu = Integer.parseInt(JOptionPane.showInputDialog("Cuantos alumnos hay en "+idi+" de nivel "+niv));
        /*Usar indexof*/
        
        int a = idiomas.indexOf(idi); 
        int b = nivel.indexOf(niv);
        if(a == 0);
//        alumnado.get(0).add(0);
//        alumnado.get(a).add(b,alu);
        cont = JOptionPane.showInputDialog("¿Quieres continuar?");
        }while(cont.equalsIgnoreCase("si"));
        String mensaje = "";
        for( ArrayList <Integer> fila : alumnado){
            for( Integer z : fila){
                if(z!=0)
                 mensaje +="El idioma "+fila+" con nivel "+z+" tiene "+z+" alumnos.\n";
                
            }
           
        
        
        }JOptionPane.showMessageDialog(null, mensaje);
    } 
    
}
