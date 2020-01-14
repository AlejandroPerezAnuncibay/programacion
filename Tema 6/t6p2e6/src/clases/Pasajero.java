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
public class Pasajero {
   private String cedula;
   private String nombre;
   private String apellido;
   private String sexo;
   private int edad;
   private ArrayList <Vuelo> vuelos;

    public Pasajero(String cedula, String nombre, String apellido, String sexo, int edad, ArrayList<Vuelo> vuelos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.vuelos = vuelos;
    }

    public Pasajero(String cedula, String nombre, String apellido, String sexo, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
   
   public void agregarNuevo(){
       
   }
   
   public void modificar(){
       
   }
   
   public void asignarVuelo(){
       
   }
   
   public Pasajero buscar(){
   return null;
   }
   
   
}