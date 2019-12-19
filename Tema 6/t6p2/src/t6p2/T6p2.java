/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p2;

import Clases.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class T6p2 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Alumno> alu = new ArrayList();
    public static void main(String[] args) {
        // TODO code application logic here
       
        menu();
    
      

    }

    private static void introalu() {
        String cont = "si";
              do{
        Alumno alu1 = new Alumno();
        alu1.setCod(JOptionPane.showInputDialog("Introduce el codigo del alumno"));
        alu1.setNombre(JOptionPane.showInputDialog("Introduce el nombre del alumno"));
        alu1.setDomicilio(JOptionPane.showInputDialog("Introduce la direccion del alumno"));
        alu1.setTelefono(Integer.parseInt(JOptionPane.showInputDialog("Introduce el telefono del alumno")));
        alu.add(alu1);
        cont = JOptionPane.showInputDialog("¿Quieres introducir otro alumno?");
        
        }while(cont.equalsIgnoreCase("si"));
              menu();
        
        }

    private static void menu() {
        int op = Integer.parseInt(JOptionPane.showInputDialog("¿Que operacion quieres realizar?"
                + "\n 1.Introducir alumno"
                + "\n 2.Buscar alumno"));
        switch(op){
            case 1: introalu();break;
            case 2: buscaralu();break;
            
        
        
        }
      }

    private static void buscaralu() {
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo del alumno que quieras buscar"));
        int pos = alu.indexOf(cod);
        String mensaje= "";
        if (pos != -1){
            mensaje += "Nombre: "+alu.get(pos).getNombre()+"\n";
            mensaje += "Domicilio: "+alu.get(pos).getDomicilio()+"\n";
            mensaje += "Numero: "+alu.get(pos).getTelefono()+"\n";
            JOptionPane.showMessageDialog(null, mensaje);
            menu();
            
        
        }
        else if(pos == -1)
            JOptionPane.showMessageDialog(null, "No se ha encontrado al alumno. Volverá al menú");
    }
    
}
