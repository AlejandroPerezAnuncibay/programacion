/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author 1gdaw05
 */
public class Cliente extends Persona {
    
    private int telefono_contacto;

    public Cliente(int telefono_contacto) {
        this.telefono_contacto = telefono_contacto;
    }

    public Cliente(int telefono_contacto, String nombre, int edad) {
        super(nombre, edad);
        this.telefono_contacto = telefono_contacto;
    }

    public int getTelefono_contacto() {
        return telefono_contacto;
    }

    public void setTelefono_contacto(int telefono_contacto) {
        this.telefono_contacto = telefono_contacto;
    }
    @Override
    public String mostrar(){
    return this.getNombre() + " que tiene "+ this.getEdad()+ " su número de telefono es "+ telefono_contacto;
    }
    
}
