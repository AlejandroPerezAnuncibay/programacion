/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author 1gdaw05
 */
public class Artista {
    private String nombre;
    private LocalDate fechaNacimiento;
    private ArrayList<Obra> listaObras;
    private ArrayList<Pelicula> listaPeliculas;
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Artista() {
    }

    public Artista(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
}
