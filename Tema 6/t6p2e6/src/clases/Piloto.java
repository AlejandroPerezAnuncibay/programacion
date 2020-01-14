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
public class Piloto {
    private String cPiloto;
    private String nomPiloto;
    private String apePiloto;
    private Integer nLicencia;
    private ArrayList <Vuelo> vuelos;

    public Piloto() {
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public Piloto(String cPiloto, String nomPiloto, String apePiloto, Integer nLicencia) {
        this.cPiloto = cPiloto;
        this.nomPiloto = nomPiloto;
        this.apePiloto = apePiloto;
        this.nLicencia = nLicencia;
    }

    public String getcPiloto() {
        return cPiloto;
    }

    public void setcPiloto(String cPiloto) {
        this.cPiloto = cPiloto;
    }

    public String getNomPiloto() {
        return nomPiloto;
    }

    public void setNomPiloto(String nomPiloto) {
        this.nomPiloto = nomPiloto;
    }

    public String getApePiloto() {
        return apePiloto;
    }

    public void setApePiloto(String apePiloto) {
        this.apePiloto = apePiloto;
    }

    public Integer getnLicencia() {
        return nLicencia;
    }

    public void setnLicencia(Integer nLicencia) {
        this.nLicencia = nLicencia;
    }
    public void agregarNuevo(){
        
    }
    public void asignarVuelo(){
        
    }
    public void cancelarVuelo(){
        
    }
    public void modificar(){
        
    }
    public Piloto buscar(){
        return null;
    }
    
}