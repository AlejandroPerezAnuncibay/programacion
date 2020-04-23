/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alejandro
 */
public class eventos {
    private String nombre;
    private String lugar;
    private String horaini;
    private String horafin;
    private String fecha;
    private int maxPersonas;

    public eventos() {
    }

    public eventos(String nombre, String lugar, String horaini, String horafin, String fecha, int maxPersonas) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.horaini = horaini;
        this.horafin = horafin;
        this.fecha = fecha;
        this.maxPersonas = maxPersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getHoraini() {
        return horaini;
    }

    public void setHoraini(String horaini) {
        this.horaini = horaini;
    }

    public String getHorafin() {
        return horafin;
    }

    public void setHorafin(String horafin) {
        this.horafin = horafin;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getMaxPersonas() {
        return maxPersonas;
    }

    public void setMaxPersonas(int maxPersonas) {
        this.maxPersonas = maxPersonas;
    }
    
}
