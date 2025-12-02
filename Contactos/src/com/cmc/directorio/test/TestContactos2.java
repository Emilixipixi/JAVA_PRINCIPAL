package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.AdminContactos;

public class TestContactos2 {
    public static void main(String[] args) {
        // Crear dos contactos diferentes con la misma operadora
        Telefono telf1 = new Telefono(1, "claro", "0997778899");
        Contacto contacto1 = new Contacto("Ana", "Martinez", telf1, 55.5);
        
        Telefono telf2 = new Telefono(2, "claro", "0996667788");
        Contacto contacto2 = new Contacto("Luis", "Fernandez", telf2, 75.0);
        
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