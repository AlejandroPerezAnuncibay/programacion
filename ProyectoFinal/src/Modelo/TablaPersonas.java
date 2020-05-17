/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Alejandro
 */
public class TablaPersonas {
     private Connection con;
    public TablaPersonas(Connection con) {
    this.con=con;
    }
    public void Insertar (Persona p) throws Exception{
    //Preparacion de sentencia sql
    String plantilla = "INSERT INTO personas VALUES (?,?,?,?,?,?,?); ";
    
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, p.getDNI());
        ps.setString(2,p.getNombre());
        ps.setString(3,p.getPrimerApe());
        ps.setString(4,p.getSegundoApe());
        ps.setString(5, String.valueOf(p.getFechaNac()));
        ps.setString(6,p.getnTel());
        ps.setString(7, p.getEmail());
      
                  
         int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }

    public Persona buscarPersona(String text) throws Exception {
        String plantilla = "select * from personas where dni =?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, text);
       
     // executeQuery NO update
      ResultSet resultado = ps.executeQuery();
      // resultado es una fila o nada..
       if (resultado.next())
       {
           // Crear objeto
           Persona p = new Persona();
           // resultado.get para coger el contenido de la columna dni
           
           p.setNombre(resultado.getString("nombre"));
           p.setPrimerApe(resultado.getString("primerApe"));
           p.setSegundoApe(resultado.getString("segundoApe"));
           p.setFechaNac(resultado.getString("fechaNac"));
           p.setnTel(resultado.getString("numTel"));
           p.setDNI(resultado.getString("dni"));
           p.setEmail(resultado.getString("email"));
           return p;
       }
       else
           // No hay nadie con ese dni
           return null; 
    }
    
}
