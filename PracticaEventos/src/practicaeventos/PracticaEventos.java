/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaeventos;
import Vista.*;
import Modelo.*;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


/**
 *
 * @author Alejandro
 */
public class PracticaEventos {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<eventos> listaEventos;
    private static BBDD bd;
    private static eliminarEvento eev;
    private static TablaEventos te;
    private static eventos e;
    private static modificarEvento em;
    private static Empresa ev;
    private static acontecimientos ac;
    private static boolean prueba;
    public static void main(String[] args) {
        // TODO code application logic here
        bd = new BBDD();
        bd.conectar();
        te = new TablaEventos(bd.getCon());
        ev = new Empresa();
        ev.setVisible(true);
    }

    public static void mostrarAcontecimientos() {
     ac = new acontecimientos();
     ac.setVisible(true);
     ev.setVisible(false);
     eev.setVisible(false);
     em.setVisible(false);
     
    }

    public static void mostrarEmpresa() {
     ev.setVisible(true);
     eev.setVisible(false);
     em.setVisible(false);
     ac.setVisible(false);
     }

    public static void meterDatos(String nombre, Object selectedItem, String fecha, String horaini, String horafin, int aforo) {
     try
        {
    e = new eventos(nombre, selectedItem.toString(),fecha,horaini,horafin,aforo);
    te.Insertar(e);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
        }
        JOptionPane.showMessageDialog(null,"Evento añadido");
        
    }

    public static void ventanaEliminar() {
        
        eev = new eliminarEvento();
        eev.setVisible(true);
        ev.setVisible(false);
        em.setVisible(false);
        ac.setVisible(false);
      
        
        
    }

    public static void rellenarCombo(JComboBox<String> todoEvento) {
     
        listaEventos = new ArrayList();
       try{
       te.buscarTodo(listaEventos);
       }catch(Exception e){
       JOptionPane.showMessageDialog(null, e.getMessage()+" Ha surgido un error ");
       }
        for (int i = 0; i < listaEventos.size(); i++) {
           String nEve = listaEventos.get(i).getNombre();
           todoEvento.addItem(nEve);
            
        }
    
    }

    public static Boolean eEventos(String evenele) {
         try{
        prueba = false;
       prueba = te.eliminarEvento(evenele);
       }catch(Exception e){
       JOptionPane.showMessageDialog(null, e.getMessage()+" Ha surgido un error ");
       }
         return prueba;
      
    
        
    }

    public static void mostrarModificar() {
        em = new modificarEvento();
        em.setVisible(true);
        eev.setVisible(false);
        ev.setVisible(false);
        ac.setVisible(false);
    }

    public static void acontecimientosCambio(Object eventoamodi) {
        ac = new acontecimientos();
        ac.setVisible(true);
     
        for (int i = 0; i < listaEventos.size(); i++) {
            if(String.valueOf(eventoamodi).equalsIgnoreCase(listaEventos.get(i).getNombre()))
            e = listaEventos.get(i);  
        }
        ac.modificar(e.getNombre(),e.getLugar(),e.getFecha(),e.getHoraini(),e.getHorafin(),e.getMaxPersonas());
        
    }

    public static void modificarDatos(String nombre, Object selectedItem, String fecha, String horaini, String horafin, int aforo) {
        try
        {
    e = new eventos(nombre, selectedItem.toString(),fecha,horaini,horafin,aforo);
    te.Actualizar(e);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
        }
        JOptionPane.showMessageDialog(null,"Evento modificado");
    }
    
    
}
