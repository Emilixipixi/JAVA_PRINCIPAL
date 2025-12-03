package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

/**
 * Clase de prueba para verificar el método vender
 * Realiza ventas de productos, disminuye stock y acumula saldo
 */
public class TestVender {
    
    public static void main(String[] args) {
        // Crear y configurar la máquina
        MaquinaDulces maquina = new MaquinaDulces();
        maquina.configurarMaquina("A1", "A2", "B1", "B2");
        
        // Cargar productos en diferentes celdas
        
        // Producto 1: Papitas en B1 con stock 4
        Producto producto1 = new Producto("Papitas", 0.85, "KE34");
        maquina.cargarProducto(producto1, "B1", 4);
        
        // Producto 2: Doritos en A1 con stock 6
        Producto producto2 = new Producto("Doritos", 0.70, "D456");
        maquina.cargarProducto(producto2, "A1", 6);
        
        // Realizar una venta del producto en celda A1 (Doritos)
        // Stock de A1 pasa de 6 a 5
        // Saldo de la máquina: 0 + 0.70 = 0.70
        maquina.vender("A1");
        
        // Realizar otra venta del producto en B1 (Papitas)
        // Stock de B1 pasa de 4 a 3
        // Saldo de la máquina: 0.70 + 0.85 = 1.55
        maquina.vender("B1");
        
        // El método vender ya llama a mostrarProductos() internamente
        // Por eso se muestra el estado después de cada venta
    }
}