/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author 1gdaw05
 */
public class Persona {
   
    private String nombre;
    
    private int codpostal;
    private String ciudad;
    private int dNacimiento;
    private int mNacimiento;
    private int aNacimiento;

    public Persona() {
    }

    public Persona(String nombre,int codpostal, String ciudad, int dNacimiento, int mNacimiento, int aNacimiento) {
        this.nombre = nombre;
      
        this.codpostal = codpostal;
        this.ciudad = ciudad;
        this.dNacimiento = dNacimiento;
        this.mNacimiento = mNacimiento;
        this.aNacimiento = aNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

   

    public int getCodpostal() {
        return codpostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getdNacimiento() {
        return dNacimiento;
    }

    public int getmNacimiento() {
        return mNacimiento;
    }

    public int getaNacimiento() {
        return aNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setCodpostal(int codpostal) {
        this.codpostal = codpostal;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setdNacimiento(int dNacimiento) {
        this.dNacimiento = dNacimiento;
    }

    public void setmNacimiento(int mNacimiento) {
        this.mNacimiento = mNacimiento;
    }

    public void setaNacimiento(int aNacimiento) {
        this.aNacimiento = aNacimiento;
    }
    public boolean mayorEdad(){
        boolean mayor = false;
        if(aNacimiento <= 2001)
            mayor = true;
        return mayor;
    }
    public boolean Elche(){
       boolean elche = false;
       if (ciudad.equalsIgnoreCase("elche"))
           elche = true;
       return elche;
    }
        
        public int compareTo(Persona o) {
            if (aNacimiento < o.aNacimiento) {
                return -1;
            }
            if (aNacimiento > o.aNacimiento) {
                return 1;
            }
            return 0;
        }
    }
   
    
    
