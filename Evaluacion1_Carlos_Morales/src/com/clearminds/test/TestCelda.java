package com.clearminds.test;

import com.clearminds.componentes.Celda;

public class TestCelda {

	public static void main(String[] args) {
		 // Crear una celda con código "A1"
        Celda celda = new Celda("A1");
        
        // Intentar imprimir el nombre del producto
        System.out.println(celda.getProducto().getNombre());
        
        /*
         * COMENTARIO SOBRE EL NULL POINTER EXCEPTION:
         * 
         * El NullPointerException ocurre en:
         * - Clase: TestCelda
         * - Línea: System.out.println(celda.getProducto().getNombre());
         * - Variable que causa el error: producto (dentro de la celda)
         * 
         * EXPLICACIÓN:
         * Cuando se crea una celda nueva con el constructor Celda("A1"), 
         * el atributo 'producto' de la celda queda en null (no se le asigna ningún valor).
         * 
         * Luego, cuando intentamos hacer celda.getProducto().getNombre():
         * 1. celda.getProducto() retorna null
         * 2. Intentamos llamar .getNombre() sobre null
         * 3. Esto causa el NullPointerException porque no se puede llamar 
         *    un método sobre una variable que es null
         * 
         * SOLUCIÓN:
         * Primero debemos usar el método ingresarProducto() para asignar 
         * un producto a la celda antes de intentar acceder a él.
         */
    }
}