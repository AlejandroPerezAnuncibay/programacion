/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg1;
import ventanas.*;
import javax.swing.JOptionPane;
import Modelo.*;
import java.util.ArrayList;
/**
 *
 * @author Alejandro
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    
    private static index in;
    private static BBDD bd;
    private static TablaPersonas tp;
    private static registrar rg;
    private static Persona p;
    private static ArrayList <Persona> listaPersonas;
    public static void main(String[] args) { 
        in = new index();
        in.setVisible(true);
        bd = new BBDD();
        bd.conectar();
        tp = new TablaPersonas(bd.getCon());
      /*  try
        {
        
        
        Persona p = new Persona("Juanito", 14, "Sexador de pollos", "666111222");
        tp.Insertar(p);
        bd.desconectar();
        
        }catch(Exception e){
        JOptionPane.showMessageDialog(in, e.getMessage());
        }
    }
    */
}

    public static void mostrarRegistro() {
        rg = new registrar();
        in.setVisible(false);
        rg.setVisible(true);
    }

    public static void volver() {
        in.setVisible(true);
        rg.setVisible(false);
    }

    public static void añadirPersona(String text, String text0, String text1, String text2) {
         try
        {
    p = new Persona(text.toLowerCase(), Integer.parseInt(text0), text1.toLowerCase(), text2);
    tp.Insertar(p);
    }catch(Exception e){
        JOptionPane.showMessageDialog(in, e.getMessage());
        }
        JOptionPane.showMessageDialog(null,"Persona añadida, volviendo al menú");
        volver();
        
    }


    public static void buscarPersona() {
  try
        {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre de la persona que quieres buscar");
        p = tp.Buscar(nombre.toLowerCase());
        rg.llenarDatos( p.getNombre(), p.getEdad(), p.getProfesion(), p.getNumTel());
        }catch(Exception e){
        JOptionPane.showMessageDialog(in, e.getMessage()+" Ha surgido un error ");
        JOptionPane.showMessageDialog(in,"La persona no existe");
        buscarPersona();
        
        }
        
    }

    public static void buscarTodasPersonas() {
        listaPersonas = new ArrayList();
       try{
       tp.buscarTodo(listaPersonas);
       }catch(Exception e){
       JOptionPane.showMessageDialog(in, e.getMessage()+" Ha surgido un error ");
       }
    
    }

    public static void cogerDatos(int posicion) {
     p = listaPersonas.get(posicion);
     rg.llenarDatos( p.getNombre(), p.getEdad(), p.getProfesion(), p.getNumTel());
    }

  

   
    
}
