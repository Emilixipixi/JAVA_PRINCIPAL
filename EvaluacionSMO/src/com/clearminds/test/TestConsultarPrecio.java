package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

/**
 * Clase de prueba para verificar el método consultarPrecio
 * Consulta el precio de un producto en una celda específica
 */
public class TestConsultarPrecio {
    
    public static void main(String[] args) {
        // Crear y configurar la máquina
        MaquinaDulces maquina = new MaquinaDulces();
        maquina.configurarMaquina("A1", "A2", "B1", "B2");
        
        // Crear y cargar producto: Papitas en B1
        Producto producto = new Producto("Papitas", 0.85, "KE34");
        maquina.cargarProducto(producto, "B1", 4);
        
        // Consultar el precio del producto en la celda B1
        double precio = maquina.consultarPrecio("B1");
        
        // Mostrar el precio
        System.out.println("Precio en B1:" + precio);
    }
}