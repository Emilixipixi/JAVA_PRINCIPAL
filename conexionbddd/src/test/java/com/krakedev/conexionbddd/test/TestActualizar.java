package com.krakedev.conexionbddd.test;

import com.krakedev.conexionbddd.entidades.Persona;
import com.krakedev.conexionbddd.servicios.AdminPersonas;

public class TestActualizar {
    
    public static void main(String[] args) {
        
        System.out.println("=== PRUEBA: ACTUALIZAR PERSONA ===\n");
        
        Persona personaActualizada = new Persona();
        personaActualizada.setCedula("1234567890");
        personaActualizada.setNombre("Juan Carlos");
        personaActualizada.setApellido("Pérez García");
        personaActualizada.setEdad(30);
        
        System.out.println("Datos a actualizar:");
        System.out.println(personaActualizada);
        System.out.println();
        
        boolean resultado = AdminPersonas.actualizar(personaActualizada);
        
        System.out.println();
        if (resultado) {
            System.out.println("✓✓✓ ACTUALIZACIÓN EXITOSA ✓✓✓");
        } else {
            System.out.println("✗✗✗ ERROR EN LA ACTUALIZACIÓN ✗✗✗");
        }
        
        System.out.println("\n=== FIN DE LA PRUEBA ===");
    }
}