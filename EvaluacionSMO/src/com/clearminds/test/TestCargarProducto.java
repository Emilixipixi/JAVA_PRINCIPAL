package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

/**
 * Clase de prueba para verificar que se pueden cargar productos en las celdas
 * Carga productos en las 4 celdas y muestra su información
 */
public class TestCargarProducto {
    
    public static void main(String[] args) {
        // Crear y configurar la máquina
        MaquinaDulces maquina = new MaquinaDulces();
        maquina.configurarMaquina("A1", "A2", "B1", "B2");
        
        // Crear producto: Papitas
        Producto producto1 = new Producto("Papitas", 0.85, "KE34");
        // Cargarlo en la celda B1 con stock de 4 unidades
        maquina.cargarProducto(producto1, "B1", 4);
        
        // Crear producto: Doritos
        Producto producto2 = new Producto("Doritos", 0.70, "D456");
        // Cargarlo en la celda A1 con stock de 6 unidades
        maquina.cargarProducto(producto2, "A1", 6);
        
        // Mostrar todos los productos de la máquina
        maquina.mostrarProductos();
    }
}