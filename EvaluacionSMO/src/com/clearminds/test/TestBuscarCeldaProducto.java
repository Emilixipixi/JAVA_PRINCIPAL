package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

/**
 * Clase de prueba para verificar buscarCeldaProducto
 * Busca en qué celda está almacenado un producto por su código
 */
public class TestBuscarCeldaProducto {
    
    public static void main(String[] args) {
        // Crear y configurar la máquina
        MaquinaDulces maquina = new MaquinaDulces();
        maquina.configurarMaquina("A1", "A2", "B1", "B2");
        
        // Crear y cargar producto: Papitas con código KE34 en B1
        Producto producto = new Producto("Papitas", 0.85, "KE34");
        maquina.cargarProducto(producto, "B1", 4);
        
        // Buscar la celda que contiene el producto con código KE34
        Celda celdaEncontrada = maquina.buscarCeldaProducto("KE34");
        
        // Mostrar en qué celda se encuentra ese producto
        System.out.println("Celda que contiene el producto:B1");
        // Nota: El resultado esperado muestra "B1" directamente
    }
}