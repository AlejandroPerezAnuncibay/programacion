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
public class Libro extends Obra{
    private String Editorial;
    private int NumeroPaginas;

    public Libro(String Editorial, int NumeroPaginas) {
        this.Editorial = Editorial;
        this.NumeroPaginas = NumeroPaginas;
    }

    public Libro(String Editorial, int NumeroPaginas, String Titulo, int AñoEdicion, ArrayList<Artista> ListaArtistas) {
        super(Titulo, AñoEdicion, ListaArtistas);
        this.Editorial = Editorial;
        this.NumeroPaginas = NumeroPaginas;
    }
    

 

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int NumeroPaginas) {
        this.NumeroPaginas = NumeroPaginas;
    }
    
    
    
}
