package com.cmc.repaso.entidades;

public class Producto {
	public String nombre;
    public double precio;
    
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            this.precio = precio * -1;
        }
    }
    
    public double calcularPrecioPromo(double porcentaje) {
        double descuento = precio * porcentaje / 100;
        double precioFinal = precio - descuento;
        return precioFinal;
    }

}
