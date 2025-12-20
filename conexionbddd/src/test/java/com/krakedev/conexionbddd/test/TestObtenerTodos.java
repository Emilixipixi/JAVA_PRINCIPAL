package com.krakedev.conexionbddd.test;

import com.krakedev.conexionbddd.entidades.Persona;
import com.krakedev.conexionbddd.servicios.AdminPersonas;
import java.util.ArrayList;

public class TestObtenerTodos {
    
    public static void main(String[] args) {
        
        System.out.println("=== PRUEBA: OBTENER TODAS LAS PERSONAS ===\n");
        
        System.out.println("Consultando base de datos...");
        ArrayList<Persona> personas = AdminPersonas.obtenerTodos();
        
        System.out.println();
        if (personas.size() > 0) {
            System.out.println("✓✓✓ CONSULTA EXITOSA ✓✓✓");
            System.out.println("\nLista de personas:\n");
            
            for (int i = 0; i < personas.size(); i++) {
                System.out.println((i + 1) + ". " + personas.get(i));
            }
        } else {
            System.out.println("⚠⚠⚠ NO HAY PERSONAS REGISTRADAS ⚠⚠⚠");
        }
        
        System.out.println("\n=== FIN DE LA PRUEBA ===");
    }
}