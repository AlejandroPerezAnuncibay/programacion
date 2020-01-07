/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p2e3;
import Clases.*;
import java.util.ArrayList;
/**
 *
 * @author 1gdaw05
 */
public class T6p2e3 {

    /**
     * @param args the command line arguments
     */
 
    private static ArrayList<Empleado> listaEmpleados1 = new ArrayList();
    private static ArrayList<Empleado> listaEmpleados2 = new ArrayList();
    private static ArrayList<Cliente> listaClientes1 = new ArrayList();
    private static ArrayList<Cliente> listaClientes2 = new ArrayList();
        
    public static void main(String[] args) {
        // TODO code application logic here
        
        crearEmpleados();
        crearDirectivos();
        crearClientes();
        crearEmpresas();
    }

   

 
    private static void crearEmpleados() {
   
    Empleado e1 = new Empleado(2000, "Jorge", 62);
    Empleado e2 = new Empleado(1650, "Naia", 42);
   listaEmpleados1.add(e1);
   listaEmpleados1.add(e2);
   Empleado e3 = new Empleado(3500, "Ivan", 35);
   Empleado e4 = new Empleado(1650, "Bittor", 19);
   listaEmpleados1.add(e3);
   listaEmpleados1.add(e4);
   
    }
   private static void crearDirectivos() {
       
        Directivo d1 = new Directivo("Director",50000, "Pedro", 28);
        Directivo d2 = new Directivo("Director",50000, "Carmen", 57);
        d1.setSubordinados(listaEmpleados1);
        d2.setSubordinados(listaEmpleados2);

        
     }

  

    private static void crearClientes() {
    Cliente c1 = new Cliente(666222558, "Perico", 148);
    Cliente c2 = new Cliente(668998668, "Noé", 2020);
   listaClientes1.add(c1);
   listaClientes1.add(c2);
    Cliente c3 = new Cliente(666333222, "Perico", 148);
    Cliente c4 = new Cliente(666333111, "Noé", 2020);
    Cliente c5 = new Cliente(666000222, "Juana", 13);
   listaClientes2.add(c3);
   listaClientes2.add(c4);
   listaClientes2.add(c5);
    }
   private static void crearEmpresas() {
        ArrayList<Empresa> listaEmpresas = new ArrayList();
        Empresa e1 = new Empresa("Egibide");
        Empresa e2 = new Empresa("Michelin");
        e1.setListaClientes(listaClientes1);
        e2.setListaClientes(listaClientes2);
        e1.setListaEmpleado(listaEmpleados1);
        e2.setListaEmpleado(listaEmpleados2);
        listaEmpresas.add(e1);
        listaEmpresas.add(e2);
        
    }
}
