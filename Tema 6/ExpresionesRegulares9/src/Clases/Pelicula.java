/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author 1gdaw05
 */
public class Pelicula extends Obra {
    private String productora;
    private int duracion;

    public Pelicula() {
    }

    public String getProductora() {
        return productora;
    }

    public int getDuracion() {
        return duracion;
    }

    public Pelicula(String productora, int duracion) {
        this.productora = productora;
        this.duracion = duracion;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
}
