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
public class Disco extends Obra{
    private String Discografia;
    private int NumeroCanciones;

    public Disco(String Discografia, int NumeroCanciones) {
        this.Discografia = Discografia;
        this.NumeroCanciones = NumeroCanciones;
    }

    public Disco(String Discografia, int NumeroCanciones, String Titulo, int AñoEdicion, ArrayList<Artista> ListaArtistas) {
        super(Titulo, AñoEdicion, ListaArtistas);
        this.Discografia = Discografia;
        this.NumeroCanciones = NumeroCanciones;
    }

   

    public String getDiscografia() {
        return Discografia;
    }

    public void setDiscografia(String Discografia) {
        this.Discografia = Discografia;
    }

    public int getNumeroCanciones() {
        return NumeroCanciones;
    }

    public void setNumeroCanciones(int NumeroCanciones) {
        this.NumeroCanciones = NumeroCanciones;
    }
    
    
    
}
