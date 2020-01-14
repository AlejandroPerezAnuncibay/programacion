/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw05
 */
public class Avion {
   private String aerolinia;
   private String codigo_avion;
   private int num_asientos;
   private String comportamiento;

    private ArrayList<Vuelo> listadoVuelos = new ArrayList();
    public Avion() {
    }

    public Avion(String aerolinia, String codigo_avion, int num_asientos, String comportamiento) {
        this.aerolinia = aerolinia;
        this.codigo_avion = codigo_avion;
        this.num_asientos = num_asientos;
        this.comportamiento = comportamiento;
    }

    public String getAerolinia() {
        return aerolinia;
    }

    public String getCodigo_avion() {
        return codigo_avion;
    }

    public int getNum_asientos() {
        return num_asientos;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setAerolinia(String aerolinia) {
        this.aerolinia = aerolinia;
    }

    public void setCodigo_avion(String codigo_avion) {
        this.codigo_avion = codigo_avion;
    }

    public void setNum_asientos(int num_asientos) {
        this.num_asientos = num_asientos;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }
   
    public void asignarasiento(){
        
    }
   
    public Avion obtener(){
    return null;
    }
    
    public void cancelarVuelo(){
        
    }

    public void setListadoVuelos(ArrayList<Vuelo> listadoVuelos) {
        this.listadoVuelos = listadoVuelos;
    }

    public ArrayList<Vuelo> getListadoVuelos() {
        return listadoVuelos;
    }
        
  
            
}
