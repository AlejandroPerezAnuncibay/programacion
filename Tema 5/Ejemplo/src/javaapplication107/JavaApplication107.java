/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication107;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class JavaApplication107 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> primero;
        primero = new ArrayList();
        primero.add(3);
        primero.add(5);
        primero.add(7);
        primero.add(1,10);
        primero.add(30);
        primero.add(50);
        
        primero.add(5);
        primero.add(70);
        primero.add(50);
        
        primero.remove(Integer.valueOf(50));
        primero.remove(4);
        System.out.println(primero.size());
        System.out.println("El contenido del elemento 1 es " + primero.get(1));
        primero.set(1,17);
        System.out.println("El contenido del elemento 1 es " + primero.get(1));
        primero.add(7,primero.get(5));
        primero.remove(5);
        
        
        ArrayList<ArrayList<Integer>> segundo = new ArrayList();
        segundo.add(new ArrayList());
        segundo.get(0).add(6);
        segundo.get(0).add(7);
        segundo.add(new ArrayList());
        segundo.get(1).add(60);
        segundo.get(1).add(70);
        segundo.get(0).add(700);
        System.out.println(segundo.get(0).get(1));
        
        
        ArrayList<int []> tercero = new ArrayList();
        
        
        
    }
    
}
