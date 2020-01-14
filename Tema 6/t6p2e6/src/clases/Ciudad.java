/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw06
 */
public class Ciudad {
    private String codCiudad;
    private String nombre;
    private ArrayList <Vuelo> vuelos;

    public Ciudad(String codCiudad, String nombre) {
        this.codCiudad = codCiudad;
        this.nombre = nombre;

    }

    public Ciudad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCodCiudad() {
        return codCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setCodCiudad(String codCiudad) {
        this.codCiudad = codCiudad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
    
    public void agregarNuevo(){
        
    }
    
    public Ciudad obtener(){
    return null;
    }
}