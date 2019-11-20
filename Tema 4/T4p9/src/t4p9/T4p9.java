/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4p9;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class T4p9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cod[] ={10, 23, 30, 47, 55, 65, 135, 256, 526, 663};
        int uv[]={0,0,0,0,0,0,0,0,0,0};
        pedirdatos(cod,uv);
        
        
        
        
    }

    private static void pedirdatos(int cod[], int uv[]) {
        boolean correcto = false;
        int menor;
        String jauja= "";
        int cont = -1;
        do{
        int ped = Integer.parseInt(JOptionPane.showInputDialog("Introduce el código del producto...\n10\n23\n30\n47\n55\n65\n135\n256\n526\n663"));
        
        
        for (int i = 0; i < cod.length; i++) {
            if(ped == cod[i]){
                uv[i] += Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas unidades ha vendido del producto "+cod[i]+" ?"));
                correcto = true;
            }
            
            
            
        }
        }while(!correcto);
        cont = JOptionPane.showConfirmDialog(null, "¿Quiere introducir otro producto?");
        if (cont == 0)
            pedirdatos(cod, uv);
        else if (cont == 1){
              for(int i=0;i<(cod.length-1);i++){
                     for(int j=i+1;j<cod.length;j++){
                            if(uv[i]>uv[j]){
                               //Intercambiamos valores
                               int variableauxiliar=uv[i];
                               int codauxiliar= cod[i];
                               uv[i]=uv[j];
                               cod[i]=cod[j];
                               cod[j]=codauxiliar;
                               
                               uv[j]=variableauxiliar;
 
                }
            }
        }
              for (int a = cod.length-1; a > 0; a--) {
                  if(uv[a]!=0)
                  jauja += "El articulo "+cod[a]+" ha vendido "+uv[a]+"\n";
                
            }
              JOptionPane.showMessageDialog(null, jauja);
    }
            
       
         
            
        }
            
        
        
    }
    

