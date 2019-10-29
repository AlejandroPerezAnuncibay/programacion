/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3e9;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class P3e9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "";
        float cantprod = 0 ;
        float iva = 0 ;
        float precio= 0;
        String linead ="LINEA DE DETALLE:\n";
        String cont = "si";
        nombre = JOptionPane.showInputDialog(null,"Introduce el nombre" );
        String noiva ="";
        String todo= "";
        float totaliva=0;
        float totalsiniva=0;
        String iv="";
        while(!cont.equalsIgnoreCase("no"))
        {
            cantprod = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos son?"));
            precio = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto vale la unidad?"));
            
            iva = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto iva contiene?"
                    + "\n 1: 4%"
                    + "\n 2: 10%"
                    + "\n 3: 21%"));
            
           
        totalsiniva = totalsiniva+(cantprod*precio);
       noiva = noiva+"\n"+cantprod+" X "+precio+" = "+(cantprod*precio);
       totaliva = totaliva+(((cantprod*precio)/100)*iva);
       iv = iv +"\n"+iva+"% de "+(cantprod*precio)+" = "+(((cantprod*precio)/100)*iva);
      linead = linead + cantprod+" unidad/es al precio de "+precio+" euros con "+iva+"% de IVA\n" ;
        cont = JOptionPane.showInputDialog("¿Quieres introducir más productos?");
        }
        todo = linead+"TOTAL SIN IVA "+totalsiniva+noiva+"\nTOTAL IVA "+totaliva+iv+"\nTOTAL CON IVA "+(totaliva+totalsiniva);
        JOptionPane.showMessageDialog(null,nombre+": \n"+todo);
            }
    
}
