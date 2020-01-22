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
public class Obra {
    private String titulo;
    private int anoEdicion;
    private ArrayList<Artista> listaArtistas;
    public Obra() {
    }

    public Obra(String titulo, int anoEdicion) {
        this.titulo = titulo;
        this.anoEdicion = anoEdicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoEdicion() {
        return anoEdicion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoEdicion(int anoEdicion) {
        this.anoEdicion = anoEdicion;
    }
    
    
}
