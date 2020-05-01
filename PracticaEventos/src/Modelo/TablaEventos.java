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
public class TablaEventos {
    private Connection con;
    public TablaEventos(Connection con) {
    this.con=con;
    }
    public void Insertar (eventos e) throws Exception{
    //Preparacion de sentencia sql
    String plantilla = "INSERT INTO eventos VALUES (?,?,?,?,?,?); ";
    
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, e.getNombre());
        ps.setString(2,e.getLugar());
        ps.setString(3,e.getHoraini());
        ps.setString(4,e.getHorafin());
        ps.setString(5, e.getFecha());
        ps.setInt(6,e.getMaxPersonas());
                  
         int n = ps.executeUpdate();
        ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
    /*
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

    
    
*/

    public ArrayList buscarTodo(ArrayList<eventos> listaEventos) throws Exception {
        
     String plantilla = "select * from eventos;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ResultSet resultado = ps.executeQuery();
     
       while(resultado.next())
       {
                eventos e = new eventos();
               
                e.setNombre(resultado.getString("nombre"));
                e.setLugar(resultado.getString("lugar"));
                e.setFecha(resultado.getString("fecha"));
                e.setHoraini(resultado.getString("horaini"));
                e.setHorafin(resultado.getString("horafin"));
                e.setMaxPersonas(Integer.parseInt(resultado.getString("aforo")));
                
                listaEventos.add(e);
       }
       return listaEventos;
    }

    public Boolean eliminarEvento(String evenele) throws Exception {
        String query = "delete from eventos where nombre = ?";
      PreparedStatement preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, evenele);
      // execute the preparedstatement
      preparedStmt.execute();
      return true;
     }
}
