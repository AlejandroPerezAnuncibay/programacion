/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author Alejandro
 */
public class Persona {
    private String nombre;
    private String primerApe;
    private String segundoApe;
    private String email;
    private String fechaNac;
    private String DNI;
    private String nTel;

    public Persona() {
    }

    public Persona(String nombre, String primerApe, String segundoApe, String email, String fechaNac, String DNI, String nTel) {
        this.nombre = nombre;
        this.primerApe = primerApe;
        this.segundoApe = segundoApe;
        this.email = email;
        this.fechaNac = fechaNac;
        this.DNI = DNI;
        this.nTel = nTel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApe() {
        return primerApe;
    }

    public void setPrimerApe(String primerApe) {
        this.primerApe = primerApe;
    }

    public String getSegundoApe() {
        return segundoApe;
    }

    public void setSegundoApe(String segundoApe) {
        this.segundoApe = segundoApe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

  

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getnTel() {
        return nTel;
    }

    public void setnTel(String nTel) {
        this.nTel = nTel;
    }

   
}
