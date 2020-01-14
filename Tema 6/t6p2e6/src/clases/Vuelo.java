/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Date;

public class Vuelo {
    private int nVuelo;
    private String h_salida;
    private String h_llegada;
    private String l_origen;
    private String l_destino;
    private Date f_salida;
    private Date f_regreso;
    private String tipoVuelo;
    
    private Avion avion;
    private Piloto piloto;
    private ArrayList <Asiento> asientos;
    private ArrayList <Pasajero> pasajeros;
    //Tal y como poner en el diagrama: private Pasajero pasajero;
    private Ciudad ciudad;
    
    public Vuelo() {
    }

    public Vuelo(int nVuelo, String h_salida, String h_llegada, String l_origen, String l_destino, Date f_salida, Date f_regreso, String tipoVuelo) {
        this.nVuelo = nVuelo;
        this.h_salida = h_salida;
        this.h_llegada = h_llegada;
        this.l_origen = l_origen;
        this.l_destino = l_destino;
        this.f_salida = f_salida;
        this.f_regreso = f_regreso;
        this.tipoVuelo = tipoVuelo;
    }
    
    public Vuelo(int nVuelo, String h_salida, String h_llegada, String l_origen, String l_destino, Date f_salida, Date f_regreso, String tipoVuelo, Avion avion, Piloto piloto, ArrayList<Asiento> asientos, ArrayList<Pasajero> pasajeros, Ciudad ciudad) {
        this.nVuelo = nVuelo;
        this.h_salida = h_salida;
        this.h_llegada = h_llegada;
        this.l_origen = l_origen;
        this.l_destino = l_destino;
        this.f_salida = f_salida;
        this.f_regreso = f_regreso;
        this.tipoVuelo = tipoVuelo;
        this.avion = avion;
        this.piloto = piloto;
        this.asientos = asientos;
        this.pasajeros = pasajeros;
        this.ciudad = ciudad;
    }

    public int getnVuelo() {
        return nVuelo;
    }

    public void setnVuelo(int nVuelo) {
        this.nVuelo = nVuelo;
    }

    public String getH_salida() {
        return h_salida;
    }

    public void setH_salida(String h_salida) {
        this.h_salida = h_salida;
    }

    public String getH_llegada() {
        return h_llegada;
    }

    public void setH_llegada(String h_llegada) {
        this.h_llegada = h_llegada;
    }

    public String getL_origen() {
        return l_origen;
    }

    public void setL_origen(String l_origen) {
        this.l_origen = l_origen;
    }

    public String getL_destino() {
        return l_destino;
    }

    public void setL_destino(String l_destino) {
        this.l_destino = l_destino;
    }

    public Date getF_salida() {
        return f_salida;
    }

    public void setF_salida(Date f_salida) {
        this.f_salida = f_salida;
    }

    public Date getF_regreso() {
        return f_regreso;
    }

    public void setF_regreso(Date f_regreso) {
        this.f_regreso = f_regreso;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<Asiento> asientos) {
        this.asientos = asientos;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
    public void reservar(){}
    public void modificar(){}
    public void eliminar(){}
    public Vuelo buscar(){
        return null;
    }
}
