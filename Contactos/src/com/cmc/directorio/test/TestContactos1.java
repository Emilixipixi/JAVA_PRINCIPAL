package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.AdminContactos;

public class TestContactos1 {
    public static void main(String[] args) {
        // Crear dos contactos con sus teléfonos
        Telefono telf1 = new Telefono(1, "movi", "0991112233");
        Contacto contacto1 = new Contacto("Maria", "Lopez", telf1, 65.0);
        
        Telefono telf2 = new Telefono(2, "claro", "0994445566");
        Contacto contacto2 = new Contacto("Pedro", "Garcia", telf2, 80.5);
        
        // Crear objeto AdminContactos
        AdminContactos admin = new AdminContactos();
        
        // Invocar el método buscarMasPesado
        Contacto masPesado = admin.buscarMasPesado(contacto1, contacto2);
        System.out.println("El contacto mas pesado es:");
        System.out.println("Nombre: " + masPesado.nombre + " " + masPesado.apellido);
        System.out.println("Peso: " + masPesado.peso);
        
        // Invocar el método compararOperadoras
        boolean mismaOperadora = admin.compararOperadoras(contacto1, contacto2);
        System.out.println("\nTienen la misma operadora? " + mismaOperadora);
    }
}