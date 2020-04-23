/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaeventos;
import Vista.*;
import Modelo.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class PracticaEventos {

    /**
     * @param args the command line arguments
     */
    private static BBDD bd;
    private static TablaEventos te;
    private static eventos e;
    private static Empresa ev;
    private static acontecimientos ac;
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
     ev.setVisible(false);
     ac.setVisible(true);
    }

    public static void mostrarEmpresa() {
     ev.setVisible(true);
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
    
}
