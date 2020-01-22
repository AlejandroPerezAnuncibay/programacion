/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.time.LocalDate;

/**
 *
 * @author 1gdaw05
 */
public class Alumno {
        private String cod;
        private String Domicilio;
        private String fechaNac;
        private String numTelefono;
        private String correoElectronicoPersonal;
        private String correoElectronicoEgibide;
        private String paginaWeb;
        private String curso;
        private String estadoCivil;
        private String nombre;

    public Alumno() {
    }

    public Alumno(String cod, String Domicilio, String fechaNac, String numTelefono, String correoElectronicoPersonal, String correoElectronicoEgibide, String paginaWeb, String curso, String estadoCivil, String nombre) {
        this.cod = cod;
        this.Domicilio = Domicilio;
        this.fechaNac = fechaNac;
        this.numTelefono = numTelefono;
        this.correoElectronicoPersonal = correoElectronicoPersonal;
        this.correoElectronicoEgibide = correoElectronicoEgibide;
        this.paginaWeb = paginaWeb;
        this.curso = curso;
        this.estadoCivil = estadoCivil;
        this.nombre = nombre;
    }

    
    public String getCod() {
        return cod;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public String getCorreoElectronicoPersonal() {
        return correoElectronicoPersonal;
    }

    public String getCorreoElectronicoEgibide() {
        return correoElectronicoEgibide;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public String getCurso() {
        return curso;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public void setCorreoElectronicoPersonal(String correoElectronicoPersonal) {
        this.correoElectronicoPersonal = correoElectronicoPersonal;
    }

    public void setCorreoElectronicoEgibide(String correoElectronicoEgibide) {
        this.correoElectronicoEgibide = correoElectronicoEgibide;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
        
        
        
        
}
