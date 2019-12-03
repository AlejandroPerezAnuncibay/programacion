/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5p1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class T5p1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           ArrayList<Double> primero;
           primero = new ArrayList();
           String cont ="si";
           Double n;
           int c = 0;
           do{
               
               n = Double.parseDouble(JOptionPane.showInputDialog("¿Que número quieres añadir en la posición "+primero.size()+" ?"));
               
              primero.add(c, n);
                   
                 cont = JOptionPane.showInputDialog("¿Quieres continuar?");
           }while(cont.equalsIgnoreCase("si"));
           menu(primero);
                   
    }

    private static void menu(ArrayList<Double> primero) {
        int op;
        op = Integer.parseInt(JOptionPane.showInputDialog(
                    "1. Visualizar el valor maximo y el minimo"
                + "\n2. Solicitar un numero y buscarlo. Muestra un mensaje indicando si lo n has encontrado o no."
                + "\n3. Solicitar un numero, buscarlo y borrarlo. Sino se encuentra muestra un mensaje de error"
                + "\n4. Convertir el arrayList en un array."
                + "\n5. Si no esta vacio, mostrar el numero de elementos que contiene."
                + "\n6. Insertar un nuevo elemento por el final."
                + "\n7. Insertar un nuevo elemento en la posicion que te indique el usuario."
                + "\n8. Borrar un elemento de una posicion concreta."
                + "\n9. Calcular la suma y la media aritmetica de los valores contenidos."
                + "\n10. Salir"));
        switch (op){
            case 1:{
                
            }break;
           
            case 2:{
                
            }break;
            case 3:{
                
            }break;
            case 4:{
                
            }break;
            case 5:{
                
            }break;
            case 6:{
                
            }break;
            case 7:{
                
            }break;
            case 8:{
                
            }break;
            case 9:{
                
            }break;
            case 10:{
                
            }break;
            
        
        
        
        
        }
    }
   
    
}
