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
public class Disco extends Obra{
    private String discografia;
    private int nCanciones;

    public Disco() {
    }

    public Disco(String discografia, int nCanciones) {
        this.discografia = discografia;
        this.nCanciones = nCanciones;
    }

    public String getDiscografia() {
        return discografia;
    }

    public int getnCanciones() {
        return nCanciones;
    }

    public void setDiscografia(String discografia) {
        this.discografia = discografia;
    }

    public void setnCanciones(int nCanciones) {
        this.nCanciones = nCanciones;
    }

   
}
