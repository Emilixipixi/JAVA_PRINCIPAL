package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// Crear el primer item
        Item item1 = new Item();
        item1.nombre = "Celular";
        item1.productosActuales = 20;
        item1.productosDevueltos = 0;
        item1.productosVendidos = 0;
        
        // Mostrar valores iniciales
        System.out.println("--- Valores iniciales ---");
        item1.imprimir();
        
        // Vender 5 productos
        System.out.println("\n--- Despues de vender 5 ---");
        item1.vender(5);
        item1.imprimir();
        
        // Devolver 2 productos
        System.out.println("\n--- Despues de devolver 2 ---");
        item1.devolver(2);
        item1.imprimir();
        
        // Crear otro item y probar los métodos
        System.out.println("\n\n--- Segundo Item ---");
        Item item2 = new Item();
        item2.nombre = "Laptop";
        item2.productosActuales = 15;
        item2.productosDevueltos = 0;
        item2.productosVendidos = 0;
        
        System.out.println("--- Valores iniciales ---");
        item2.imprimir();
        
        System.out.println("\n--- Despues de vender 3 ---");
        item2.vender(3);
        item2.imprimir();
        
        System.out.println("\n--- Despues de devolver 1 ---");
        item2.devolver(1);
        item2.imprimir();

	}

}
