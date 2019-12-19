/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p1;
import Clases.*;
import javax.swing.JOptionPane;
/**
 *
 * @author 1gdaw05
 */
public class T6p1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculos c1 = new Calculos();
        int e = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio de la circunferencia"));
        c1.setRadio(e);
        
        JOptionPane.showMessageDialog(null, "La longitud de una circunferencia con radio "+ c1.getRadio()+" es de "+ c1.getLongi()+"\n"+
        "El area de una circunferencia con radio "+ c1.getRadio()+" es de "+ c1.getArea()+"\n"+
        "El volumen de una circunferencia con radio "+ c1.getRadio()+" es de "+ c1.getVolumen()+"\n");
        
    }
    
}
