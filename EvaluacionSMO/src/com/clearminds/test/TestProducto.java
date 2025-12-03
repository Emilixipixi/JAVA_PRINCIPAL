package com.clearminds.test;

import com.clearminds.componentes.Producto;

/**
 * Clase de prueba para verificar que la clase Producto funcione correctamente
 * Prueba el incremento de precios
 */
public class TestProducto {
    
    public static void main(String[] args) {
        // Crear un producto: Papitas a 0.85 con código KE34
        Producto producto = new Producto("Papitas", 0.85, "KE34");
        
        // Mostrar información inicial del producto
        System.out.println("Código:" + producto.getCodigo());
        System.out.println("Nombre:" + producto.getNombre());
        System.out.println("Precio:" + producto.getPrecio());
        System.out.println("*********************************");
        
        // Incrementar el precio en 50% (de 0.85 a 1.275 = 0.85 + 0.425)
        producto.incrementarPrecio(50);
        System.out.println("Nuevo Precio:" + producto.getPrecio());
        
        // Incrementar nuevamente en 100% (duplicar el precio actual)
        // De 1.275 a 2.55 (1.275 + 1.275)
        producto.incrementarPrecio(100);
        System.out.println("Precio incrementado:" + producto.getPrecio());
        
        // Incrementar en 0% (no cambia)
        producto.incrementarPrecio(0);
        System.out.println("Precio incrementado:" + producto.getPrecio());
    }
}