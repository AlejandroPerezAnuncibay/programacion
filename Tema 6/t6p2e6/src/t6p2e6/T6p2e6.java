/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p2e6;
import Clases.*;
import java.util.ArrayList;

/**
 *
 * @author 1gdaw05
 */
public class T6p2e6 {

    /**
     * @param args the command line arguments
     */
     static ArrayList<Asiento> listadoAsientos = new ArrayList(); 
     static ArrayList<Pasajero> listadoPasajeros = new ArrayList(); 
     static ArrayList<Vuelo> listadoVuelos = new ArrayList(); 
    public static void main(String[] args) {
        // TODO code application logic here
        Vuelo vuelo1 = new Vuelo(123,"13:30","14:30","Vitoria","España",null,null,"Rapido");
        Vuelo vuelo2 = new Vuelo();
        Ciudad Vitoria = new Ciudad("1233","Vitoria");
        Ciudad España = new Ciudad("3243","España");
        Avion Avion1 = new Avion("RyanAirs","1234",77,"Ninguno");
        Avion Avion2 = new Avion("Iberia Viajes","1234",777,"Ninguno");
        Piloto Pedro = new Piloto("098","Pedro","Torero",123431);
        Piloto Juan = new Piloto("987","Juanito","Torero",6457484);
        Asiento a1 = new Asiento(1,false,"ninguno");
        Asiento a2 = new Asiento(2,true,"Bodega");
        listadoAsientos.add(a2);
        listadoAsientos.add(a1);
        Pasajero p1 = new Pasajero("No de españa","Che","Gue","Vara",12);
        Pasajero p2 = new Pasajero("Si de españa","Ped","ro","Sanchez",14);
        listadoPasajeros.add(p2);
        listadoPasajeros.add(p1);
        vuelo1.setAvion(Avion1);
        
        vuelo2.setAvion(Avion2);
        vuelo1.setPiloto(Pedro);
        vuelo2.setPiloto(Juan);
        
        vuelo1.setAsientos(listadoAsientos);
        vuelo2.setAsientos(listadoAsientos);
        
        vuelo1.setPasajeros(listadoPasajeros);
        vuelo2.setAsientos(listadoAsientos);
        
        vuelo1.setCiudad(Vitoria);
        vuelo2.setCiudad(España); 
        
        listadoVuelos.add(vuelo2);
        listadoVuelos.add(vuelo1);
        
        Avion1.setListadoVuelos(listadoVuelos);
        Avion2.setListadoVuelos(null);
        
        Pedro.setVuelos(listadoVuelos);
        Juan.setVuelos(listadoVuelos);
        
        p1.setVuelos(listadoVuelos);
        p2.setVuelos(listadoVuelos);
        
        a1.setVuelo(vuelo2);
        a2.setVuelo(vuelo1);
    }
    
}
