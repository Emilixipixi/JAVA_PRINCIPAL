package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

/**
 * Clase de prueba para verificar incrementarProductos
 * Incrementa el stock de productos en una celda específica
 */
public class TestIncrementarProductos {
    
    public static void main(String[] args) {
        // Crear y configurar la máquina
        MaquinaDulces maquina = new MaquinaDulces();
        maquina.configurarMaquina("A1", "A2", "B1", "B2");
        
        // Crear y cargar producto: Papitas con código KE34 en B1, stock inicial 4
        Producto producto = new Producto("Papitas", 0.85, "KE34");
        maquina.cargarProducto(producto, "B1", 4);
        
        // Mostrar productos antes del incremento
        System.out.println("***ANTES DEL INCREMENTO***");
        maquina.mostrarProductos();
        
        // Incrementar el stock del producto KE34 en 8 unidades
        // Stock pasa de 4 a 12 (4 + 8)
        maquina.incrementarProductos("KE34", 8);
        
        // Mostrar productos después del incremento
        System.out.println("***DESPUÉS DEL INCREMENTO***");
        maquina.mostrarProductos();
    }
}