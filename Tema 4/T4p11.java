/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4p11;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class T4p11 {

    /**
     * @param args the command line arguments
     */
       public static String nombre[][] ={{"Kit Kat","Chicles de fresa","Lacasitos","Palotes"},{"Kinder Bueno","Haribos","Chetoos","Twix"},{"Smint","M&M","Papa Delta","Chicle de menta"},{"Rellenitos del mercadona","Chupa Chups","Palomitas","Coco Bar"}};
       public static double precio[][] ={{1.1,0.8,1.5,0.9},{1.8,1,1.2,1},{1.8,1.3,1.2,0.8},{1.5,1.1,1.1,1.1}};
       public static int cant[][]= new int[4][4];
       public static int ventas[][] = new int [4][4];

    public static void main(String[] args) {
        // TODO code application logic here
        
      
       
        for (int i = 0; i < cant.length; i++) {
      
            for (int j = 0; j < cant.length; j++) {
                cant [i][j] = 5;
         
                
                
            }
 
        } 
        menu();
        
    }

    private static void pedirgolosina() 
    {
       String prod = JOptionPane.showInputDialog("¿Que producto quiere?");
       int fila= Integer.parseInt(Character.toString(prod.charAt(0)));
       int columna= Integer.parseInt(Character.toString(prod.charAt(1)));
       String cont="";
       if (cant[fila][columna] == 0){
           JOptionPane.showMessageDialog(null, "Este producto esta agotado");
           
           cont = JOptionPane.showInputDialog("¿Quiere introducir otro producto?");
            if( cont.equalsIgnoreCase("no"))
                menu();
            else if (cont.equalsIgnoreCase("si"))
                pedirgolosina();
       }
       else{
           JOptionPane.showMessageDialog(null, "El producto "+nombre[fila][columna]+" con precio "+precio[fila][columna]+"€ ha sido entregado");
           cant[fila][columna] = cant[fila][columna] -1;
           ventas[fila][columna] += 1;
            cont = JOptionPane.showInputDialog("¿Quiere introducir otro producto?");
            if( cont.equalsIgnoreCase("no"))
                menu();
            else if (cont.equalsIgnoreCase("si"))
                pedirgolosina();
     
       }
        
    
    
    }

    private static void mostrargolosina() {
        String mostrar = "";
        for (int i = 0; i < cant.length; i++) {
            for (int j = 0; j < cant.length; j++) {
               mostrar += "La golosina "+nombre[i][j]+" que esta en la posición "+i+""+j+" tiene "+cant[i][j]+" unidad/es\n";
            }
        }
        JOptionPane.showMessageDialog(null, mostrar);
        menu();
     
    
    }

    private static void menu() {
      int op;
        op = Integer.parseInt(JOptionPane.showInputDialog("1.Pedir golosina\n2.Mostrar golosinas\n3.Rellenar golosinas\n4.Apagar maquina"));
        switch (op){
            case 1:
                pedirgolosina();
            break;
            case 2:
                mostrargolosina();
            break;
            case 3:
                añadir();
            break;
            case 4:
                ventas();
            break;
            
            default:
                menu();
        
        
        
        
        }
    }

    private static void añadir() {
        String contra="";
        contra = JOptionPane.showInputDialog("Introduzca la contraseña del supervisor:");
        if (contra.equals("MaquinaExpendedora2019"))
        {
            añadirproducto();
        
        
        
        
        }
        else{
        JOptionPane.showMessageDialog(null, "Contraseña mal introducida" );
        menu();
        }
        
    
    }

    private static void añadirproducto() {
        String prod = JOptionPane.showInputDialog("¿Que producto quiere añadir?");
       int fila= Integer.parseInt(Character.toString(prod.charAt(0)));
       int columna= Integer.parseInt(Character.toString(prod.charAt(1)));
       int ud;
       ud = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas unidades quiere añadir?"));
       cant[fila][columna] += ud;
       String cont="";
       cont = JOptionPane.showInputDialog("¿Quiere introducir otro producto?");
            if( cont.equalsIgnoreCase("no"))
                menu();
            else if (cont.equalsIgnoreCase("si"))
                añadirproducto();}

    private static void ventas() {
       String mostrar = "";
        for (int i = 0; i < cant.length; i++) {
            for (int j = 0; j < cant.length; j++) {
               mostrar += "La golosina "+nombre[i][j]+" que esta en la posición "+i+""+j+" se han vendido "+ventas[i][j]+" unidad/es\n";
            }
        }
        JOptionPane.showMessageDialog(null, mostrar);
System.exit(0);
       }
    
}
