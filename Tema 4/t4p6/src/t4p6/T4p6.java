/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4p6;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class T4p6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] alfabeto = new char[26];  
        String total = "";
       alfabeto[0]='A';
       alfabeto[1]='B';
       alfabeto[2]='C';
       alfabeto[3]='D';
       alfabeto[4]='E';
       alfabeto[5]='F';
       alfabeto[6]='G';
       alfabeto[7]='H';
       alfabeto[8]='I';
       alfabeto[9]='J';
       alfabeto[10]='K';
       alfabeto[11]='L';
       alfabeto[12]='M';
       alfabeto[13]='N';
       alfabeto[13]='Ñ';
       alfabeto[15]='O';
       alfabeto[16]='P';
       alfabeto[17]='Q';
       alfabeto[18]='R';
       alfabeto[19]='S';
       alfabeto[20]='U';
       alfabeto[21]='V';
       alfabeto[22]='W';
       alfabeto[23]='X';
       alfabeto[24]='Y';
       alfabeto[25]='Z';
        
       int pos[] = new int[26];
       pos[0]=0;
       pos[1]=0;
       pos[2]=0;
       pos[3]=0;
       pos[4]=0;
       pos[5]=0;
       pos[6]=0;
       pos[7]=0;
       pos[8]=0;
       pos[9]=0;
       pos[10]=0;
       pos[11]=0;
       pos[12]=0;
       pos[13]=0;
       pos[13]=0;
       pos[15]=0;
       pos[16]=0;
       pos[17]=0;
       pos[18]=0;
       pos[19]=0;
       pos[20]=0;
       pos[21]=0;
       pos[22]=0;
       pos[23]=0;
       pos[24]=0;
       pos[25]=0;
       
       
       
       
       
       
       
       String frase = JOptionPane.showInputDialog("Introduce la frase").toUpperCase();
        for(int x = 0; x < alfabeto.length; x++){
                for(int i = 0; i < frase.length(); i++){
                if (frase.charAt(i) == alfabeto[x])
                pos[x] += 1;
                
            }
            
                    
                    
                    
                    
             total +=  "Hay "+ pos[x]+" "+alfabeto[x]+"\n"; 

                                
        }
        JOptionPane.showMessageDialog(null, total);
        
    }
    
}
