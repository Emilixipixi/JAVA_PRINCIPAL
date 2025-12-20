package com.krakedev.conexionbddd.test;

import com.krakedev.conexionbddd.servicios.AdminPersonas;
import java.util.Scanner;

public class TestEliminar {
    
    public static void main(String[] args) {
        
        System.out.println("=== PRUEBA: ELIMINAR PERSONA ===\n");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa la cédula de la persona a eliminar: ");
        String cedula = scanner.nextLine();
        
        System.out.print("¿Estás seguro de eliminar esta persona? (SI/NO): ");
        String confirmacion = scanner.nextLine();
        
        if (confirmacion.equalsIgnoreCase("SI")) {
            System.out.println("\nIntentando eliminar...");
            boolean resultado = AdminPersonas.eliminar(cedula);
            
            System.out.println();
            if (resultado) {
                System.out.println("✓✓✓ ELIMINACIÓN EXITOSA ✓✓✓");
            } else {
                System.out.println("✗✗✗ ERROR EN LA ELIMINACIÓN ✗✗✗");
                System.out.println("Posibles causas:");
                System.out.println("- La cédula no existe en la base de datos");
                System.out.println("- Error de conexión");
            }
        } else {
            System.out.println("\n⚠ Eliminación cancelada por el usuario");
        }
        
        scanner.close();
        System.out.println("\n=== FIN DE LA PRUEBA ===");
    }
}