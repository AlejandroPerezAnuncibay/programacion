/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class BBDD {
    private Connection con;
     public Connection getCon(){
       return con;
   }
    public void conectar(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        String bd = "personas";
        String url = "jdbc:mysql://localhost:3306/"+bd;
        String login="root";
        String password= "Jm12345";
        con = DriverManager.getConnection(url,login,password);
        
        if(con == null){
        throw new Exception("Problemas con la conexión");}
        
        }catch (Exception e)
        {
        JOptionPane.showMessageDialog(null, e.getMessage());
        }
        JOptionPane.showMessageDialog(null,"Conexion Realizada");
}
    public void desconectar(){
        try
        {
        con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Problemas con la conexión");
        }

}
}

