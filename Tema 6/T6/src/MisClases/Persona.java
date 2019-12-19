/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw05
 */
public class Persona {
    // Atributos
        private String nombre;
        public int edad;
        private String dni;
        private String ape;
        
//    // Relación cardinalidad 1
//        private Coche c;
//
//    public void setC(Coche c) {
//        this.c = c;
//    }
//
//    public Coche getC() {
//        return c;
//    }
    // Relación de uno a muchos
    private ArrayList<Coche> lista;

         public ArrayList<Coche> getLista() {
                return lista;
            }

         public void setLista(ArrayList<Coche> lista) {
                this.lista = lista;
            }
         public void setUnCoche(Coche c){
                lista.add(c);
            }
        
    // Metodos
    
    public Persona()  {
    
    }
        
        
    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona(String nombre, int edad, String dni, String ape) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.ape = ape;
    }
    

    public Persona(String nombre, String ape) {
        this.nombre = nombre;
        this.ape = ape;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public String getApe() {
        return ape;
    }
    
    public boolean isMayor(){
        return (edad >= 18);
    }
        

    
    
    
    
    
}
