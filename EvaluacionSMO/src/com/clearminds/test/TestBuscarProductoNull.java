package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

/**
 * Clase de prueba que genera un NullPointerException intencionalmente
 * Intenta acceder a propiedades de un producto que no existe (es null)
 */
public class TestBuscarProductoNull {
    
    public static void main(String[] args) {
        // Crear y configurar la máquina
        MaquinaDulces maquina = new MaquinaDulces();
        maquina.configurarMaquina("A1", "A2", "B1", "B2");
        
        // Crear y cargar producto solo en B1
        Producto producto = new Producto("Papitas", 0.85, "KE34");
        maquina.cargarProducto(producto, "B1", 4);
        
        // Buscar en la celda A2 que NO tiene producto
        Producto productoEncontrado = maquina.buscarProductoEnCelda("A2");
        
        // Intentar acceder al nombre del producto
        // ERROR: productoEncontrado es null, entonces null.getNombre() lanza excepción
        System.out.println(productoEncontrado.getNombre());
        
        /* EXPLICACIÓN DEL ERROR:
         * La clase TestBuscarProductoNull da NullPointerException en la línea:
         * System.out.println(productoEncontrado.getNombre());
         * 
         * Esto ocurre porque:
         * 1. Buscamos un producto en la celda A2 que no tiene producto cargado
         * 2. El método buscarProductoEnCelda retorna null cuando no hay producto
         * 3. La variable productoEncontrado queda con valor null
         * 4. Intentamos hacer productoEncontrado.getNombre() -> ERROR!
         * 
         * La variable que ocasiona el NullPointer es: productoEncontrado
         */
    }
}