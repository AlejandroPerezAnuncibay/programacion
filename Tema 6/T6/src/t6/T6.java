/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6;
import  MisClases.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de objetos
        Persona p1 = new Persona();
        p1.edad = 19 ;
        p1.setDni("11111111S");
        p1.setEdad(20);
        p1.setNombre("Josefa la cerda");
        p1.setApe("Pig");
        JOptionPane.showMessageDialog(null, p1.getNombre() + " es " + p1.isMayor()) ;
        
        Coche c1 = new Coche("1111ABB","Blanco");
        //relacion de 1
//        p1.setC(coche1);
//         JOptionPane.showMessageDialog(null, "El coche de " + p1.getNombre() + " es de color " + p1.getC().getColor());
        //relacion 1  a n
        Coche c2 = new Coche("1234ABC","Verde");
        Coche c3 = new Coche("4321CBA","Primavera");
        ArrayList<Coche> l = new ArrayList();
        l.add(c1);
        l.add(c2);
        l.add(c3);
        p1.setLista(l);
        Coche c4 = new Coche("1357SAB","Amarillo");
        p1.setUnCoche(c4);
        
        

        
        
        
        
        Persona p2 = new Persona("Pepe2",15,"222222222B","Pepon");
        
        Persona[] listaPersonas = new Persona[3];
        listaPersonas[0] = p1;
        listaPersonas[1] = p2;
        
        

        
    }
    
}
