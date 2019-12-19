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
public class Calculos {
    
    private double radio;
   


    public Calculos(double radio) {
        this.radio = radio;
    }

    public Calculos() {
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double getLongi() {
       double longi = 2*Math.PI*radio;
       return longi;
    }
    public double getArea(){
        double area = Math.PI * radio * radio;
        return area;
    }
    public double getVolumen(){
        double vol = (4*Math.PI * radio * radio*radio)/3;
        return vol;
    }
    
}
    
    
    
   
  
