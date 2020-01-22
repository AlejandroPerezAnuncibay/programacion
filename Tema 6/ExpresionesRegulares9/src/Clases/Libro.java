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
public class Libro extends Obra{
    private String editorial;
    private int nPaginas;
    private ArrayList <Artista> listaArtista;
    public Libro() {
    }

    public Libro(String editorial, int nPaginas) {
        this.editorial = editorial;
        this.nPaginas = nPaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }
    
    
}
