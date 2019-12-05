/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5ej1;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class T5ej1 {

    /**
     * @param args the command line arguments
     */
       public static  ArrayList<Double> primero;
      
    public static void main(String[] args) {
        // TODO code application logic here
       primero = new ArrayList();
           String cont ="si";
           Double n;
           int c = 0;
           do{
               
               n = Double.parseDouble(JOptionPane.showInputDialog("¿Que número quieres aÃ±adir en la posición "+primero.size()+" ?"));
               
              primero.add(c, n);
                   
                 cont = JOptionPane.showInputDialog("¿Quieres continuar?");
           }while(cont.equalsIgnoreCase("si"));
           menu();
                   
    }

    private static void menu() {
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
                mayorymenor();
            }break;
           
            case 2:{
                buscarn();
            }break;
            case 3:{
                buscarborrar();
            }break;
            case 4:{
                toArray();
            }break;
            case 5:{
                numele();
            }break;
            case 6:{
                inser();
            }break;
            case 7:{
                inspos();
            }break;
            case 8:{
                borrar();
            }break;
            case 9:{
                sumaymedia();
            }break;
            case 10:{
                System.exit(0);
            }break;
            
        
        
        
        
        }
    }

    private static void mayorymenor() {
        int l;
      Collections.sort(primero);
      l = primero.size();
      Double bajo = primero.get(0);
      Double alto = primero.get(l-1);
      JOptionPane.showMessageDialog(null, "El número más bajo es: "+bajo+"\nEl número mas alto es: "+alto);
        
        
     }

    private static void buscarn() {
        Double n = Double.parseDouble(JOptionPane.showInputDialog("¿Que número quieres buscar?"));
        if(primero.contains(n))
            JOptionPane.showMessageDialog(null, "Hemos encontrado el número");
        else
            JOptionPane.showMessageDialog(null, "No hemos encontrado el número");
        menu();
      }

    private static void buscarborrar() {
         Double n = Double.parseDouble(JOptionPane.showInputDialog("¿Que número quieres buscar?"));
        if(primero.contains(n))
           primero.remove(n);
        else
            JOptionPane.showMessageDialog(null, "No hemos encontrado el número");
        menu();
    }

    private static void toArray() {
        int dim = primero.size();
        Double[] pri = new Double[dim];
        pri = primero.toArray(pri);
        JOptionPane.showMessageDialog(null, "Se ha creado un Array llamado pri");
        menu();
             }

    private static void numele() {
            int n;
            n = primero.size();
            JOptionPane.showMessageDialog(null,"El arrayList tiene "+ n+" elementos");
            menu();
    }

    private static void inser() {
        double n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número que se va a introducir en la ultima posición"));
        primero.add(n);
        JOptionPane.showMessageDialog(null,"El número "+ n+" se ha añadido");
        menu();
    }

    private static void inspos() {
     int p = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posición"));
     double n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número que se va a introducir en la posición" +p));
        primero.add(p, n);
        JOptionPane.showMessageDialog(null,"El número "+ n+" se ha añadido en la posición "+p);
        menu();
    }

    private static void borrar() {
        int p = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posición"));
        if(primero.size()<p){
            JOptionPane.showMessageDialog(null, "Esa posición no existe");
            borrar();
        }
        primero.remove(p);
        JOptionPane.showMessageDialog(null,"El número de la posición "+ p+" ha sido eliminado");
        menu();
    }

    private static void sumaymedia() {
        int total = 0;
    for(double i : primero)
    {
        total += i;
    }
    JOptionPane.showMessageDialog(null, "El total es: "+total+" y la media es "+total/primero.size());
        menu();
    }
        
   
    
}
