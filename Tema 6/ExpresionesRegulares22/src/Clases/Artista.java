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
 * @author 1gdaw07
 */
public class Artista {
    private String Nombre;
    private LocalDate FechaNacimiento;
    private ArrayList<Obra> ListaObras;
    private ArrayList<Pelicula> ListaPeliculas;

    public Artista() {
    }

    public Artista(String Nombre, LocalDate FechaNacimiento, ArrayList<Obra> ListaObras) {
        this.Nombre = Nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.ListaObras = ListaObras;
    }

    public Artista(String Nombre, LocalDate FechaNacimiento, ArrayList<Obra> ListaObras, ArrayList<Pelicula> ListaPeliculas) {
        this.Nombre = Nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.ListaObras = ListaObras;
        this.ListaPeliculas = ListaPeliculas;
    }

    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public ArrayList<Obra> getListaObras() {
        return ListaObras;
    }

    public void setListaObras(ArrayList<Obra> ListaObras) {
        this.ListaObras = ListaObras;
    }
    
    
    
}
