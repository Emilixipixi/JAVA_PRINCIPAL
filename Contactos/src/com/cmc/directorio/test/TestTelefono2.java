package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.AdminTelefono;

public class TestTelefono2 {
    public static void main(String[] args) {
        // 1) Crear un objeto Telefono
        Telefono telf = new Telefono(20, "movi", "098234234");
        
        // 2) Crear un objeto AdminTelefono
        AdminTelefono at = new AdminTelefono();
        
        // 3) Invocar al método activarMensajeria
        at.activarMensajeria(telf);
        
        // 4) Imprimir los datos del teléfono
        System.out.println("Informacion del Telefono:");
        System.out.println("Operadora: " + telf.operadora);
        System.out.println("Numero: " + telf.numero);
        System.out.println("Codigo: " + telf.codigo);
        System.out.println("Tiene Whatsapp: " + telf.tieneWhatsapp); // Ahora debe ser true
    }
}