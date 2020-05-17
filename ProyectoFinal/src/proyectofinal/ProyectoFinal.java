/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;
import Modelo.*;
import Vista.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author Alejandro
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    
    /*
    Variables globales
    */
    private static principal vPrincipal;
    private static ventanaAnadir vAnadir;
    private static TablaCuentas tc;
    private static TablaPersonas tp;
    private static Persona p;
    private static Cuenta c;
     
    private static BBDD bd;
    public static void main(String[] args) {
        // TODO code application logic here
        bd = new BBDD();
        bd.conectar();
        tc = new TablaCuentas(bd.getCon());
        tp = new TablaPersonas(bd.getCon());
        vPrincipal = new principal();
        vPrincipal.setVisible(true);
    }

    public static void buscarDni(String text) {
       try{
            
        p = tp.buscarPersona(text);
        if(p == null){
            vAnadir.anadirPersona();
         
        }
            
        
        else
        {
            vAnadir.rellenarPersona(text, p.getNombre(), p.getPrimerApe(), p.getSegundoApe(), p.getnTel(), p.getEmail(), p.getDNI(), p.getFechaNac());
         
           
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(vAnadir, e + "Error al añadir a la persona");
    }
       
    }

    public static void mostrarAnadir() {
        vAnadir = new ventanaAnadir();
        vAnadir.setVisible(true);
        vPrincipal.setVisible(false);
    
    }

    public static void anadirPersona(String dni, String nombre, String primerape, String segundoape, String email, String numTel, String fNac) {
        try{
        p = new Persona();
        p.setDNI(dni);
        p.setEmail(email);
        p.setnTel(numTel);
        p.setNombre(nombre);
        p.setSegundoApe(segundoape);
        p.setPrimerApe(primerape);
        
       
        p.setFechaNac(fNac);
        tp.Insertar(p);
        }catch(Exception e){
        JOptionPane.showMessageDialog(vAnadir, e+" Problemas sl insertar a la persona");
        }
        JOptionPane.showMessageDialog(vAnadir, "Persona con DNI: "+p.getDNI()+" añadida.");
        vAnadir.vaciar();
    }

    public static String generarNumeroCuenta() {
      String numero = "";
      try{
          
          
          for (int i = 0; i < 2; i++) {
              
              for (int j = 0; j < 4; j++) {
                  int n1 = (int) (Math.random() * 9);
                  numero = numero +n1;
              
              }
              numero = numero + "-";
          }
          int n = (int) (Math.random() * 9);
          int nn = (int) (Math.random() * 9);
          int nnn = (int) (Math.random() * 9);
          int nnnn= (int) (Math.random() * 9);
          numero = numero+String.valueOf(n)+String.valueOf(nn)+String.valueOf(nnn)
                  + String.valueOf(nnnn);
    
    c = tc.buscarCuenta(numero);
    if(c == null){
    vAnadir.meterDescrip(numero);
    }
    else{
    JOptionPane.showMessageDialog(vAnadir, "El número de cuenta generado ya existe, por favor generelo de nuevo");}
   
        }catch(Exception e){
        JOptionPane.showMessageDialog(vAnadir, "Error con la comprobacion del"
                + "numero de cuenta");}
    
    return numero;
    }

   
    
}
