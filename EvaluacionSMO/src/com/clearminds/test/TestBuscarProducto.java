package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

/**
 * Clase de prueba para verificar buscarProductoEnCelda
 * Busca un producto que existe y uno que no existe en las celdas
 */
public class TestBuscarProducto {
    
    public static void main(String[] args) {
        // Crear y configurar la máquina
        MaquinaDulces maquina = new MaquinaDulces();
        maquina.configurarMaquina("A1", "A2", "B1", "B2");
        
        // Crear y cargar producto: Papitas en B1
        Producto producto = new Producto("Papitas", 0.85, "KE34");
        maquina.cargarProducto(producto, "B1", 4);
        
        // Buscar el producto en la celda B1 (sí existe)
        Producto productoEncontrado = maquina.buscarProductoEnCelda("B1");
        System.out.println("Producto encontrado:" + productoEncontrado.getNombre());
        
        // Buscar en una celda que no tiene producto (A2)
        Producto productoNull = maquina.buscarProductoEnCelda("A2");
        System.out.println("Producto encontrado:" + productoNull);
        // Imprime: null
    }
}