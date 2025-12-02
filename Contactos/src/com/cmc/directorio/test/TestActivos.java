package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.AdminContactos;

public class TestActivos {
    public static void main(String[] args) {
        // Crear un contacto que no tenga whatsapp
        Telefono telf = new Telefono(1, "claro", "0993334455");
        Contacto contacto = new Contacto("Carlos", "Rodriguez", telf, 68.0);
        
        // Imprimir datos iniciales para verificar que tieneWhatsapp es false
        System.out.println("--- Datos Iniciales ---");
        System.out.println("Nombre: " + contacto.nombre + " " + contacto.apellido);
        System.out.println("Tiene Whatsapp: " + contacto.telefono.tieneWhatsapp);
        System.out.println("Activo: " + contacto.activo);
        
        // Crear objeto AdminContactos
        AdminContactos admin = new AdminContactos();
        
        // Invocar el método activarUsuario
        admin.activarUsuario(contacto);
        
        // Imprimir datos después de invocar activarUsuario
        System.out.println("\n--- Datos Despues de activarUsuario ---");
        System.out.println("Nombre: " + contacto.nombre + " " + contacto.apellido);
        System.out.println("Tiene Whatsapp: " + contacto.telefono.tieneWhatsapp);
        System.out.println("Activo: " + contacto.activo);
        System.out.println("\nComo no tiene Whatsapp, el usuario NO se activo");
    }
}