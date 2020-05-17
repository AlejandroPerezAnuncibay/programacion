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
public class TablaCuentas {
     private Connection con;
    public TablaCuentas (Connection con) {
    this.con=con;
    }

    public Cuenta buscarCuenta(String numero) throws Exception {
     
     String plantilla = "select * from cuentas where numeroCuenta =?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, numero);
       
     // executeQuery NO update
      ResultSet resultado = ps.executeQuery();
      // resultado es una fila o nada..
       if (resultado.next())
       {
           // Crear objeto
           Cuenta c = new Cuenta();
           // resultado.get para coger el contenido de la columna dni
           c.setNumCuenta(resultado.getString("numeroCuenta"));
           c.setDescripcion(resultado.getString("descrip"));
           c.setSaldo(resultado.getFloat("saldo"));
           return c;
          
       }
       else
           // No hay nadie con ese dni
           return null; 
    }
 
}
