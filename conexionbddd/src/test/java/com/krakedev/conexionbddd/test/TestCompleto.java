package com.krakedev.conexionbddd.test;

import com.krakedev.conexionbddd.entidades.Persona;
import com.krakedev.conexionbddd.servicios.AdminPersonas;
import java.util.Scanner;

public class TestCompleto {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int opcion;
        
        do {
            mostrarMenu();
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            
            switch (opcion) {
                case 1:
                    probarInsertar();
                    break;
                case 2:
                    probarActualizar();
                    break;
                case 3:
                    probarEliminar();
                    break;
                case 4:
                    System.out.println("¡Hasta luego! 👋");
                    break;
                default:
                    System.out.println("⚠ Opción inválida. Intenta de nuevo.");
            }
            
            System.out.println("\n" + "=".repeat(50) + "\n");
            
        } while (opcion != 4);
        
        scanner.close();
    }
    
    private static void mostrarMenu() {
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║   SISTEMA DE GESTIÓN DE PERSONAS          ║");
        System.out.println("╚════════════════════════════════════════════╝");
        System.out.println();
        System.out.println("1. Insertar nueva persona");
        System.out.println("2. Actualizar persona existente");
        System.out.println("3. Eliminar persona");
        System.out.println("4. Salir");
        System.out.println();
    }
    
    private static void probarInsertar() {
        System.out.println("--- INSERTAR NUEVA PERSONA ---");
        
        System.out.print("Cédula: ");
        String cedula = scanner.nextLine();
        
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        
        Persona persona = new Persona(cedula, nombre, apellido, edad);
        
        System.out.println("\nInsertando persona...");
        boolean resultado = AdminPersonas.insertar(persona);
        
        if (resultado) {
            System.out.println("✓ Persona insertada correctamente");
            System.out.println("Datos: " + persona);
        } else {
            System.out.println("✗ No se pudo insertar la persona");
        }
    }
    
    private static void probarActualizar() {
        System.out.println("--- ACTUALIZAR PERSONA EXISTENTE ---");
        
        System.out.print("Cédula de la persona a actualizar: ");
        String cedula = scanner.nextLine();
        
        System.out.println("\nIngresa los NUEVOS datos:");
        
        System.out.print("Nuevo nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Nuevo apellido: ");
        String apellido = scanner.nextLine();
        
        System.out.print("Nueva edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        
        Persona persona = new Persona(cedula, nombre, apellido, edad);
        
        System.out.println("\nActualizando persona...");
        boolean resultado = AdminPersonas.actualizar(persona);
        
        if (resultado) {
            System.out.println("✓ Persona actualizada correctamente");
            System.out.println("Nuevos datos: " + persona);
        } else {
            System.out.println("✗ No se pudo actualizar la persona");
            System.out.println("Verifica que la cédula exista en la base de datos");
        }
    }
    
    private static void probarEliminar() {
        System.out.println("--- ELIMINAR PERSONA ---");
        
        System.out.print("Cédula de la persona a eliminar: ");
        String cedula = scanner.nextLine();
        
        System.out.print("\n⚠ ¿Estás seguro? Esta acción NO se puede deshacer (SI/NO): ");
        String confirmacion = scanner.nextLine();
        
        if (confirmacion.equalsIgnoreCase("SI")) {
            System.out.println("\nEliminando persona...");
            boolean resultado = AdminPersonas.eliminar(cedula);
            
            if (resultado) {
                System.out.println("✓ Persona eliminada correctamente");
            } else {
                System.out.println("✗ No se pudo eliminar la persona");
                System.out.println("Verifica que la cédula exista en la base de datos");
            }
        } else {
            System.out.println("⚠ Eliminación cancelada");
        }
    }
}