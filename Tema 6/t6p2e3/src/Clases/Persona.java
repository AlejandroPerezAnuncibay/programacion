/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class Persona {
    private  String nombre;
    private  int edad;

    public Persona() {
    }
    public Persona(String nombre, int edad) {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String mostrar(){
    String mostrar="";
    mostrar = "La persona "+nombre+" tiene "+edad+ " años.";
    return mostrar;
    }
  
    
    
    
    
    
    
    
    
    
    
}
