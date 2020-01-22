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
public class Pelicula extends Obra{
    private String Productora;
    private int Duracion;

    public Pelicula() {
    }

    public Pelicula(String Productora, int Duracion) {
        this.Productora = Productora;
        this.Duracion = Duracion;
    }

    public Pelicula(String Productora, int Duracion, String Titulo, int AñoEdicion, ArrayList<Artista> ListaArtistas) {
        super(Titulo, AñoEdicion, ListaArtistas);
        this.Productora = Productora;
        this.Duracion = Duracion;
    }

     public String getProductora() {
        return Productora;
    }

    public void setProductora(String Productora) {
        this.Productora = Productora;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }


    
    
    
}
