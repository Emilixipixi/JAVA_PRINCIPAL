package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;
import java.util.ArrayList;

public class TestBuscarMenores {
    public static void main(String[] args) {
        MaquinaDulces maquina = new MaquinaDulces();
        
        maquina.agregarCelda(new Celda("A1"));
        maquina.agregarCelda(new Celda("A2"));
        maquina.agregarCelda(new Celda("B1"));
        maquina.agregarCelda(new Celda("B2"));
        maquina.agregarCelda(new Celda("C1"));
        maquina.agregarCelda(new Celda("C2"));
        
        Producto producto1 = new Producto("KE34", "Papitas", 0.85);
        Producto producto2 = new Producto("D456", "Doritos", 0.70);
        Producto producto3 = new Producto("PRNGL", "Pringles", 1.50);
        Producto producto4 = new Producto("CHETO", "Cheetos", 0.60);
        Producto producto5 = new Producto("GATR", "Gatorade", 2.54);
        Producto producto6 = new Producto("COCA", "Coca Cola", 0.80);
        
        maquina.cargarProducto(producto1, "A1", 4);
        maquina.cargarProducto(producto2, "A2", 5);
        maquina.cargarProducto(producto3, "B1", 3);
        maquina.cargarProducto(producto4, "B2", 6);
        maquina.cargarProducto(producto5, "C1", 2);
        maquina.cargarProducto(producto6, "C2", 4);
        
        ArrayList<Producto> menores = maquina.buscarMenores(1.00);
        
        System.out.println("Productos con precio menor o igual a 1.00:");
        for (int i = 0; i < menores.size(); i++) {
            Producto p = menores.get(i);
            System.out.println("Nombre: " + p.getNombre() + 
                             " Precio: " + p.getPrecio());
        }
    }
}