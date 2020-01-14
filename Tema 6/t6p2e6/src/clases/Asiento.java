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
public class Asiento {
    private int nAsiento;
    private Boolean estado;
    private String compartimiento;
    private Vuelo vuelo;

    public int getnAsiento() {
        return nAsiento;
    }

    public Boolean getEstado() {
        return estado;
    }

    public String getCompartimiento() {
        return compartimiento;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public Asiento(int nAsiento, Boolean estado, String compartimiento) {
        this.nAsiento = nAsiento;
        this.estado = estado;
        this.compartimiento = compartimiento;
     
    }

    public void setnAsiento(int nAsiento) {
        this.nAsiento = nAsiento;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public void setCompartimiento(String compartimiento) {
        this.compartimiento = compartimiento;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
       
   public void reservar(){
   
   }
   
   public void comprar(){
       
   }
   
   public Boolean disponibilidad(Boolean estado){
   return estado;
   }
   
   public void desbloquear(){
       
   }
}