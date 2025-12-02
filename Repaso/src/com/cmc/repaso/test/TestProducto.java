package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto p1 = new Producto("Laptop", 500);
        
        System.out.println("Producto: " + p1.nombre);
        System.out.println("Precio: " + p1.precio);
        
        p1.setPrecio(-300);
        System.out.println("Precio despues de setPrecio: " + p1.precio);
        
        double precioConDescuento = p1.calcularPrecioPromo(20);
        System.out.println("Precio con 20% descuento: " + precioConDescuento);

	}

}
