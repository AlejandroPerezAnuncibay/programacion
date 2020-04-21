/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.*;
import java.util.ArrayList;

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
    String plantilla = "INSERT INTO personas VALUES (?,?,?,?); ";
    
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, p.getNombre());
        ps.setInt(2,p.getEdad());
        ps.setString(3,p.getProfesion());
        ps.setString(4,p.getNumTel());
        
         int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
    public Persona Buscar(String nombre) throws Exception
    {
        
        String plantilla = "select * from personas where nombre = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, nombre);
       
     // executeQuery NO update
      ResultSet resultado = ps.executeQuery();
      // resultado es una fila o nada..
       if (resultado.next())
       {
           // Crear objeto
           Persona p = new Persona();
           // resultado.get para coger el contenido de la columna dni
           p.setNombre(resultado.getString("nombre"));
           p.setEdad(Integer.parseInt(resultado.getString("edad")));
           p.setProfesion(resultado.getString("profesion"));
           p.setNumTel(resultado.getString("telefono"));
           return p;
       }
       else
           // No hay nadie con ese dni
           return null;
    }

    public ArrayList buscarTodo(ArrayList<Persona> listaPersonas) throws Exception {
        
        String plantilla = "select * from personas;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ResultSet resultado = ps.executeQuery();
     
       while(resultado.next())
       {
                Persona p = new Persona();
               
                p.setNombre(resultado.getString("nombre"));
                p.setEdad(Integer.parseInt(resultado.getString("edad")));
                p.setProfesion(resultado.getString("profesion"));
                p.setNumTel(resultado.getString("telefono"));
                
                listaPersonas.add(p);
       }
       return listaPersonas;
    }
}
