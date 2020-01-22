/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresionesregulares21;
import Clases.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
/**
 *
 * @author 1gdaw05
 */
public class ExpresionesRegulares21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Alumno alu1=  new Alumno();
         alu1.setCod("12345");
         alu1.setCorreoElectronicoEgibide("alejandro.perez@ikasle.egibide.org");
         alu1.setCorreoElectronicoPersonal("alejandroperez@gmail.com");
         alu1.setCurso("141GA");
         alu1.setDomicilio("Calle Arriaga Nº5");
         alu1.setEstadoCivil("Soltero");
         alu1.setFechaNac("13/05/2000");
         alu1.setNumTelefono("666777888");
         alu1.setPaginaWeb("www.jauja.com");
         alu1.setNombre("Josefo");
         
         
         
        Pattern pCod= Pattern.compile("^\\d{5}+");
        Matcher mCod = pCod.matcher(alu1.getCod());
        if(mCod.matches())
            JOptionPane.showMessageDialog(null, "Codigo correcto");
        else 
            JOptionPane.showMessageDialog(null, "Codigo incorrecto");
    
        Pattern pCorEgi= Pattern.compile("^[A-Za-z][A-Za-z.-]+@ikasle.egibide.org+");
        Matcher mCorEgi = pCorEgi.matcher(alu1.getCorreoElectronicoEgibide());
        
        if(mCorEgi.matches())
            JOptionPane.showMessageDialog(null, "Email de egibide correcto");
        else 
            JOptionPane.showMessageDialog(null, "Email de egibide incorrecto");
        
        Pattern pCor = Pattern.compile("^[A-Za-z][A-Za-z.-]+@[a-z]+\\.[a-z]+");
        Matcher mCor = pCor.matcher(alu1.getCorreoElectronicoPersonal());
        if(mCor.matches())
            JOptionPane.showMessageDialog(null, "Email correcto");
        else 
            JOptionPane.showMessageDialog(null, "Email incorrecto");
        
        Pattern pCur = Pattern.compile("^[1-4]{3}[ABCDEFGHIJKLM][ABC]+");
        Matcher mCur = pCur.matcher(alu1.getCurso());
        if(mCur.matches())
            JOptionPane.showMessageDialog(null, "Codigo curso correcto");
        else 
            JOptionPane.showMessageDialog(null, "Codigo curso incorrecto");
        
        Pattern pDom = Pattern.compile("^[A-Z][A-Za-z0-9-º ]+");
        Matcher mDom = pDom.matcher(alu1.getDomicilio());
        if(mDom.matches())
            JOptionPane.showMessageDialog(null, "Domicilio correcto");
        else 
            JOptionPane.showMessageDialog(null, "Domicilio incorrecto");
        
        Pattern pNom = Pattern.compile("^[A-Z][A-Za-z]+");
        Matcher mNom = pNom.matcher(alu1.getNombre());
        if(mNom.matches())
            JOptionPane.showMessageDialog(null, "Nombre correcto");
        else 
            JOptionPane.showMessageDialog(null, "Nombre incorrecto");
        
        Pattern pCiv = Pattern.compile("^Casado|Soltero+");
        Matcher mCiv = pCiv.matcher(alu1.getEstadoCivil());
        
        if(mCiv.matches())
            JOptionPane.showMessageDialog(null, "Estado correcto");
        else 
            JOptionPane.showMessageDialog(null, "Nombre incorrecto");
        
        Pattern pNac = Pattern.compile("(([0][1-9]|[1-2][0-9]|[3][0-1])/([0][1]|[0][3]|[0][5]|[0][7-8]|[1][0]|[1][2]) / ([0-9]{4}))"
                 + "|(([0][1-9]|[1-2][0-9]|[3][0])/([0][4]|[0][6]|[0][5]|[0][9]|[1][1])/([0-9]{4}))"
                 + "|(([0][1-9]|[1-2][0-8])/([0][2])/([0-9]{4}))");
        Matcher mNac = pNac.matcher(alu1.getFechaNac());
        if(mNac.matches())
            JOptionPane.showMessageDialog(null, "Fecha correcta");
        else 
            JOptionPane.showMessageDialog(null, "Fecha incorrecta");
        
        Pattern pNum = Pattern.compile("^6[0-9]{8}");
        Matcher mNum = pNum.matcher(alu1.getNumTelefono());
        
        if(mNum.matches())
            JOptionPane.showMessageDialog(null, "Número de telefono correcto");
        else 
            JOptionPane.showMessageDialog(null, "Número de telefono incorrecto");
        
        Pattern pPag = Pattern.compile("^www.[A-Za-z0-9]+.[a-z]+");
        Matcher mPag = pPag.matcher(alu1.getPaginaWeb());
        if(mPag.matches())
            JOptionPane.showMessageDialog(null, "Página web correcta");
        else 
            JOptionPane.showMessageDialog(null, "Página web incorrecta");
        
        
        
        
        
        
        
        
        
        
        
         
        
        
    
    
    
    }
    
}
