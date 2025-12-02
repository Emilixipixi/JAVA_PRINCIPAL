package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.AdminTelefono;

public class TestTelefono3 {
    public static void main(String[] args) {
        // Crear 3 teléfonos con diferentes operadoras
        Telefono telf1 = new Telefono(1, "movi", "0991234567");
        Telefono telf2 = new Telefono(2, "claro", "0987654321");
        Telefono telf3 = new Telefono(3, "movi", "0995555555");
        
        // Crear objeto AdminTelefono
        AdminTelefono at = new AdminTelefono();
        
        // Invocar el método contarMovi y guardar el resultado
        int cantidadMovi = at.contarMovi(telf1, telf2, telf3);
        
        // Imprimir el resultado
        System.out.println("Cantidad de telefonos con operadora movi: " + cantidadMovi);
    }
}