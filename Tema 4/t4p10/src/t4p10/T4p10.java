/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4p10;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class T4p10 {

    /**
     * @param args the command line arguments
     */
    public static int tabla[][]= new int[4][4];
        public static String fila[]= {"1. ","2. ","3. ","4. "};
    public static void main(String[] args) {
        // TODO code application logic here
       menu();
    }

    private static void pedirfila() {
        
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                tabla[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número que irá en la posición "+i+" - "+j));
                fila[j] += " "+tabla[i][j]+" ";
                
            }
        }
        JOptionPane.showMessageDialog(null, fila);
        menu();
    
    }

    private static void menu() {
        int op;
        do{
        op = Integer.parseInt(JOptionPane.showInputDialog("¿Que operación quieres realizar sobre la tabla anterior?\n0.Introducción de datos(obligatorio para proceder)\n1.Suma de una fila a elegir\n2.Suma de una columna a elegir\n3.Suma de la diagonal principal\n4.Suma de la diagonal inversa\n5.Media de todos los valores introducidos\n6.Salir"));
        
        }while(op!=0 && tabla[0][0] == 0);
        switch (op){
            case 0:
                pedirfila();
                break;
            case 1:
                calcularsumafila();
            break;
            case 2:
                calcularsumacolumna();
            break;
            case 3:
                calculardiagonal1();
                break;
            case 4:
                calculardiagonal2();
                break;
            case 5: 
                calcularmedia();
                break;
            case 6:
                System.exit(0);
                break;
            default:{
                JOptionPane.showMessageDialog(null, "Introduce una opcion valida");
                menu();
            }
                        
        
        
        }
    
    
    
    }

    private static void calcularsumafila() {
        int op;
        int total= 0;
        String cuadra= "";
        for (int i = 0; i < fila.length; i++) {
           cuadra += fila[i]+"\n"; 
            
            
        }
        op = Integer.parseInt(JOptionPane.showInputDialog("¿Que fila quieres sumar?\n"+cuadra));
        
        for (int i = 0; i < tabla.length; i++) {
             
            total +=tabla[i][op-1];
        }
        JOptionPane.showMessageDialog(null, "La suma de la fila "+op+" es "+total);
        menu();
        
        }

    private static void calcularsumacolumna() {
        int op;
        int total= 0;
        String cuadra= "";
        for (int i = 0; i < fila.length; i++) {
           cuadra += fila[i]+"\n"; 
            
            
        }
        op = Integer.parseInt(JOptionPane.showInputDialog("¿Que columna quieres sumar?\n"+cuadra));
        
        for (int i = 0; i < tabla.length; i++) {
             
            total +=tabla[op-1][i];
        }
        JOptionPane.showMessageDialog(null, "La suma de la columna "+op+" es "+total);
        menu();
       
    }

    private static void calculardiagonal1() {
        int total= 0;
        for (int i = 0; i < tabla.length; i++) {
            total +=tabla[i][i];
            
            
        }
        JOptionPane.showMessageDialog(null, "La suma de la diagonal es "+total);
        menu();
        
    }

    private static void calculardiagonal2() {
          int total= 0;
        for (int i = tabla.length-1,x = 0; x<tabla.length; i--,x++) {
            
             total +=tabla[x][i];
            
            
        }
        JOptionPane.showMessageDialog(null, "La suma de la diagonal inversa es "+total);
        menu();}

    private static void calcularmedia() {
         int total= 0;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
               total +=tabla[j][i]; 
             
            }
            
            
            
        } 
        total = total/16;
        JOptionPane.showMessageDialog(null, "La media de la tabla es "+total);
        menu();
        }


    
        
        
       }
    

