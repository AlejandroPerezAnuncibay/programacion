/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p3;
import clases.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 *
 * @author 1gdaw05
 */
public class T6p3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<Persona> personas = new ArrayList<Persona>();
         Persona p1 = new Persona();
         p1.setCiudad("elche");
         p1.setCodpostal(01001);
         p1.setNombre("Josefa");
         p1.setaNacimiento(1999);
         p1.setmNacimiento(11);
         p1.setdNacimiento(25);
         
         personas.add(p1);
         Persona p2 = new Persona("Josefo",01002,"elche",15,10,2005);
         personas.add(p2);
         Persona p3 = new Persona("Ricarda",01003,"Vitoria",15,10,1988);
         personas.add(p3);
         
         
         for (Persona e : personas){
             
             boolean f = false;
             f = e.Elche();
             if (f)
                 JOptionPane.showMessageDialog(null, e.getNombre()+" si vive en elche");
             else if (!f )
                  JOptionPane.showMessageDialog(null, e.getNombre()+" no vive en elche");
         
             boolean x = false;
             x = e.mayorEdad();
             if(x)
                JOptionPane.showMessageDialog(null, e.getNombre()+" si es mayor de edad");
             else if (!x)
                 JOptionPane.showMessageDialog(null, e.getNombre()+" no es mayor de edad");
             
           }
         p1.compareTo(p2);
            
    }
         
         
         
        
         }

    

