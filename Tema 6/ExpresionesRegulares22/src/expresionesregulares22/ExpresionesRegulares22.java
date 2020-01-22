/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpresionesRegulares22;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import Clases.*;
import java.time.LocalDate;

/**
 *
 * @author 1gdaw07
 */
public class ExpresionesRegulares22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               
        // Obra
        Obra o= new Obra();
        o.setTitulo("Sarandonga");
        o.setAñoEdicion(1925);
        //Artista
        Artista a1 = new Artista();
        a1.setFechaNacimiento(LocalDate.MIN);
        a1.setNombre("Master Pedofilia");
        Artista a2 = new Artista();
        a2.setFechaNacimiento(LocalDate.MIN);
        
        
        
        
    }
    
}
