package com.cmc.repaso.entidades;

public class Item {
	 public String nombre;
	    public int productosActuales;
	    public int productosDevueltos;
	    public int productosVendidos;
	    
	    // Método que muestra en consola los valores de los tres atributos
	    public void imprimir() {
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Productos Actuales: " + productosActuales);
	        System.out.println("Productos Devueltos: " + productosDevueltos);
	        System.out.println("Productos Vendidos: " + productosVendidos);
	    }
	    
	    // Método que registra una venta
	    public void vender(int cantidad) {
	        // Disminuye los productos actuales
	        productosActuales = productosActuales - cantidad;
	        // Incrementa los productos vendidos
	        productosVendidos = productosVendidos + cantidad;
	    }
	    
	    // Método que registra una devolución
	    public void devolver(int cantidad) {
	        // Incrementa los productos actuales
	        productosActuales = productosActuales + cantidad;
	        // Disminuye los productos vendidos
	        productosVendidos = productosVendidos - cantidad;
	        // Incrementa los productos devueltos
	        productosDevueltos = productosDevueltos + cantidad;
	    }

}
