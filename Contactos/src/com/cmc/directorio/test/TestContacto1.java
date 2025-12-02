package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.Contacto;

public class TestContacto1 {
    public static void main(String[] args) {
        // Instanciar un teléfono
        Telefono telef = new Telefono(5, "claro", "0998877665");
        
        // Instanciar un contacto
        Contacto c = new Contacto("Juan", "Perez", telef, 70.5);
        
        // Imprimir la información del contacto
        System.out.println("Informacion del Contacto:");
        System.out.println("Nombre: " + c.nombre);
        System.out.println("Apellido: " + c.apellido);
        System.out.println("Peso: " + c.peso);
        System.out.println("Activo: " + c.activo);
        System.out.println("Operadora: " + c.telefono.operadora);
        System.out.println("Numero: " + c.telefono.numero);
    }
}