package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

/**
 * Clase de prueba para verificar el método venderConCambio
 * Realiza ventas y calcula el cambio a devolver al cliente
 */
public class TestVenderConCambio {
    
    public static void main(String[] args) {
        // Crear y configurar la máquina
        MaquinaDulces maquina = new MaquinaDulces();
        maquina.configurarMaquina("A1", "A2", "B1", "B2");
        
        // Cargar productos en diferentes celdas
        
        // Producto 1: Papitas ($0.85) en B1 con stock 4
        Producto producto1 = new Producto("Papitas", 0.85, "KE34");
        maquina.cargarProducto(producto1, "B1", 4);
        
        // Producto 2: Doritos ($0.70) en A1 con stock 6
        Producto producto2 = new Producto("Doritos", 0.70, "D456");
        maquina.cargarProducto(producto2, "A1", 6);
        
        // Primera venta: cliente compra Doritos y paga con $1.00
        // Precio: $0.70, Pago: $1.00, Cambio: $0.30
        double cambio1 = maquina.venderConCambio("A1", 1.0);
        System.out.println("Cambio 1: " + cambio1);
        
        // Segunda venta: cliente compra Papitas y paga con $1.00
        // Precio: $0.85, Pago: $1.00, Cambio: $0.15
        double cambio2 = maquina.venderConCambio("B1", 1.0);
        System.out.println("Cambio 2: " + cambio2);
        
        // Mostrar el saldo total acumulado
        // Saldo = $0.70 + $0.85 = $1.55
        System.out.println("Saldo total: " + maquina.getSaldo());
    }
}