package com.krakedev.conexionbddd.test;

import com.krakedev.conexionbddd.entidades.Persona;
import com.krakedev.conexionbddd.servicios.AdminPersonas;
import java.util.Scanner;

public class TestBuscarPorCedula {
    
    public static void main(String[] args) {
        
        System.out.println("=== PRUEBA: BUSCAR PERSONA POR CÉDULA ===\n");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa la cédula a buscar: ");
        String cedula = scanner.nextLine();
        
        System.out.println("\nBuscando persona...");
        Persona persona = AdminPersonas.buscarPorCedula(cedula);
        
        System.out.println();
        if (persona != null) {
            System.out.println("✓✓✓ BÚSQUEDA EXITOSA ✓✓✓");
            System.out.println("\nDatos de la persona:");
            System.out.println(persona);
        } else {
            System.out.println("✗✗✗ NO SE ENCONTRÓ LA PERSONA ✗✗✗");
        }
        
        scanner.close();
        System.out.println("\n=== FIN DE LA PRUEBA ===");
    }
}