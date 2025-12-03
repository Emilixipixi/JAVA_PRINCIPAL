package com.clearminds.test;

import com.clearminds.componentes.Celda;

/**
 * Clase de prueba para verificar la clase Celda
 * IMPORTANTE: Esta prueba lanzará una excepción NullPointerException
 * porque intenta acceder a producto.getNombre() cuando producto es null
 */
public class TestCelda {
    
    public static void main(String[] args) {
        // Crear una celda con código A1
        Celda celda = new Celda("A1");
        
        // Intentar mostrar el nombre del producto
        // AQUÍ OCURRE EL ERROR: celda.getProducto() devuelve null
        // y luego intentamos hacer null.getNombre() -> NullPointerException
        System.out.println(celda.getProducto().getNombre());
        
        /* EXPLICACIÓN DEL ERROR:
         * La clase TestCelda lanza NullPointerException en la línea:
         * System.out.println(celda.getProducto().getNombre());
         * 
         * Esto ocurre porque:
         * 1. Creamos una celda nueva con código "A1"
         * 2. En el constructor de Celda, el atributo 'producto' no se inicializa,
         *    por lo tanto queda en null
         * 3. Cuando hacemos celda.getProducto(), obtenemos null
         * 4. Luego intentamos null.getNombre() -> ERROR!
         * 
         * La variable que ocasiona el NullPointer es: producto
         * (el atributo producto de la celda está en null)
         */
    }
}