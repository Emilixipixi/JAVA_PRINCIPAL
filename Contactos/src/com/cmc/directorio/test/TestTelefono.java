package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {
    public static void main(String[] args) {
        // 1) Crear un objeto Telefono
        Telefono telf = new Telefono(10, "movi", "09941234123");
        
        // 2) Imprimir la información del teléfono
        System.out.println("Informacion del Telefono:");
        System.out.println("Operadora: " + telf.operadora);
        System.out.println("Numero: " + telf.numero);
        System.out.println("Codigo: " + telf.codigo);
        System.out.println("Tiene Whatsapp: " + telf.tieneWhatsapp);
    }
}