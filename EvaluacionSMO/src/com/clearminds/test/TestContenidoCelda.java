package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

/**
 * Clase de prueba para verificar que una Celda puede contener un Producto
 * Esta vez ingresamos correctamente el producto antes de mostrarlo
 */
public class TestContenidoCelda {
    
    public static void main(String[] args) {
        // Crear una celda con código A1
        Celda celda = new Celda("A1");
        
        // Crear un producto: Papitas a 0.85 con código KE34
        Producto producto = new Producto("Papitas", 0.85, "KE34");
        
        // Ingresar el producto a la celda con stock inicial de 5 unidades
        celda.ingresarProducto(producto, 5);
        
        // Ahora sí podemos mostrar la información sin error
        System.out.println("CELDA:" + celda.getCodigo());
        System.out.println("*************************************");
        System.out.println("Nombre Producto:" + celda.getProducto().getNombre());
        System.out.println("Precio Producto:" + celda.getProducto().getPrecio());
        System.out.println("Código Producto:" + celda.getProducto().getCodigo());
        System.out.println("STOCK:" + celda.getStock());
    }
}