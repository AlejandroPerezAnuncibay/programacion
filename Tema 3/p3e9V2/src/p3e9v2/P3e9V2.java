/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3e9V2;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class P3e9V2 {

    /**
     * @param args the command line arguments
     */
     static String todo="";
     static String resto="";
     static   float cantprod = 0 ;
     static   float iva = 0 ;
     static  float precio= 0;
     static float niva=0;
    public static void main(String[] args) {
        
            pedirdatos();
            
            JOptionPane.showMessageDialog(null, todo);
            }

    private static void pedirdatos() {
         
        boolean correcto= false;
        String cont = "si";
       float totalsiniva= 0 ;
       float ivatotal=0;
        String nombre = JOptionPane.showInputDialog("Introduzca su nombre:");
        todo = todo+"NOMBRE: "+nombre+"\n"+"LINEAS DE DETALLE:\n";
        do{
                try{
                    while(cont.equalsIgnoreCase("si")){
                        
                            cantprod = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos son?"));
                               precio = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto vale la unidad?"));

                               iva = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto iva contiene?"
                                       + "\n 1: 4%"
                                       + "\n 2: 10%"
                                       + "\n 3: 21%"));
                               correcto=true;
                               todo = todo+cantprod+" X "+precio+" = "+cantprod*precio+"\n";
                               totalsiniva= cantprod*precio;
                               formarfactura();
                               ivatotal= ivatotal+niva;
           
                                cont = JOptionPane.showInputDialog("¿Quiere introducir otro producto?");
                                if (!cont.equalsIgnoreCase("si") && !cont.equalsIgnoreCase("no"))
                                {
                                         throw new SiNoException();
                                }





                                todo = todo+"TOTAL SIN IVA "+ totalsiniva+resto+"\nTOTAL IVA = "+ivatotal+"\nTOTAL CON IVA = "+(ivatotal+totalsiniva);
                }
                    
                }
                catch(SiNoException e){
                JOptionPane.showMessageDialog(null, "Pon si o no");
                correcto = false;
                }
//                catch(NumberFormatException e){
//                JOptionPane.showMessageDialog(null, "Introduce un número");
//                correcto = false;
//                } 
                
            
        }while (!correcto);
    }

    private static void formarfactura() {
         niva = (((cantprod*precio)/100)*iva);
        resto = resto+"\n"+iva+"% de "+cantprod*precio +" = "+niva;
        
       
    }
    
    
}
