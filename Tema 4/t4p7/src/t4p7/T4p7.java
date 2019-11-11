/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4p7;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class T4p7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String devolver = "";
        double importe = 0;
        double[][] cambio= {
            {500,200,100,50,20,10,5,2,1,0.5,0.2,0.1,0.05,0.02,0.01}, // [0][i]
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}                          // [1][i]
        };
        double total = Double.parseDouble(JOptionPane.showInputDialog("Introduce el total a pagar"));
        double vueltas = 0;
        do{
       importe = Double.parseDouble(JOptionPane.showInputDialog("Introduce el dinero"));
        if (importe<total)
            JOptionPane.showMessageDialog(null, "No puedes dar menos de lo que tienes que pagar!");
        
        }while(importe<total);
        vueltas = importe - total;
        do{
       if (vueltas>=500){
           cambio[1][0]+=1;
           vueltas = vueltas - 500;
       }else     if (vueltas>=200){
           cambio[1][1]+=1;
           vueltas = vueltas - 200;
       }else     if (vueltas>=100){
           cambio[1][2]+=1;
           vueltas = vueltas - 100;
        }else     if (vueltas>=50){
           cambio[1][3]+=1;
           vueltas = vueltas - 50;
        }else     if (vueltas>=20){
           cambio[1][4]+=1;
           vueltas = vueltas - 20; 
        }else     if (vueltas>=10){
           cambio[1][5]+=1;
           vueltas = vueltas - 10;  
        }else     if (vueltas>=5){
           cambio[1][6]+=1;
           vueltas = vueltas - 5;
        }else     if (vueltas>=2){
           cambio[1][7]+=1;
           vueltas = vueltas - 2;
        }else     if (vueltas>=1){
           cambio[1][8]+=1;
           vueltas = vueltas - 1;
        }else     if (vueltas>=0.5){
           cambio[1][9]+=1;
           vueltas = vueltas - 0.5;
         }else     if (vueltas>=0.2){
           cambio[1][10]+=1;
           vueltas = vueltas - 0.2;
         }else     if (vueltas>=0.1){
           cambio[1][11]+=1;
           vueltas = vueltas - 0.1;
         }else     if (vueltas>=0.05){
           cambio[1][12]+=1;
           vueltas = vueltas - 0.05;
         }else     if (vueltas>=0.02){
           cambio[1][13]+=1;
           vueltas = vueltas - 0.02;
         }else     if (vueltas>=0.01){
           cambio[1][14]+=1;
           vueltas = vueltas - 0.01;
         }
           
       
    
    
    }while(vueltas != 0);
        for (int i = 0; i < 15; i++) {
           devolver +=  "Billetes de "+ cambio[0][i]+" son "+cambio[1][i]+"\n";
        }
        JOptionPane.showMessageDialog(null, devolver);
        
    
}
}
