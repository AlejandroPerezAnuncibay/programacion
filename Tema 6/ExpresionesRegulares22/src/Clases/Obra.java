/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw07
 */
public class Obra {
     private String Titulo;
     private int AñoEdicion;
     private ArrayList<Artista> ListaArtistas;

    public Obra() {
    }
  
    public Obra(String Titulo, int AñoEdicion, ArrayList<Artista> ListaArtistas) {
        this.Titulo = Titulo;
        this.AñoEdicion = AñoEdicion;
        this.ListaArtistas = ListaArtistas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getAñoEdicion() {
        return AñoEdicion;
    }

    public void setAñoEdicion(int AñoEdicion) {
        this.AñoEdicion = AñoEdicion;
    }

    public ArrayList<Artista> getListaArtistas() {
        return ListaArtistas;
    }

    public void setListaArtistas(ArrayList<Artista> ListaArtistas) {
        this.ListaArtistas = ListaArtistas;
    }
    
    
    
    
    
}
