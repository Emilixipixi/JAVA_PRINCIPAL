package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.AdminTelefono;

public class TestTelefono4 {
    public static void main(String[] args) {
        // Crear 4 teléfonos con diferentes operadoras
        Telefono telf1 = new Telefono(1, "claro", "0991234567");
        Telefono telf2 = new Telefono(2, "movi", "0987654321");
        Telefono telf3 = new Telefono(3, "claro", "0995555555");
        Telefono telf4 = new Telefono(4, "claro", "0993333333");
        
        // Crear objeto AdminTelefono
        AdminTelefono at = new AdminTelefono();
        
        // Invocar el método contarClaro e imprimir directamente
        System.out.println("Cantidad de telefonos con operadora claro: " 
            + at.contarClaro(telf1, telf2, telf3, telf4));
    }
}