package com.clearminds.componentes;

/**
 * Clase que representa un producto en la máquina de dulces
 * Contiene la información básica de cada producto
 */
public class Producto {
    // Atributos del producto
    private String nombre;    // Nombre del producto (ejemplo: "Papitas")
    private double precio;    // Precio en decimales (ejemplo: 0.85)
    private String codigo;    // Código único del producto (ejemplo: "KE34")
    
    /**
     * Constructor: crea un nuevo producto con los datos proporcionados
     * @param nombre - nombre del producto
     * @param precio - precio del producto
     * @param codigo - código único del producto
     */
    public Producto(String nombre, double precio, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }
    
    /**
     * Método que incrementa el precio del producto en un porcentaje
     * @param porcentajeIncremento - porcentaje a incrementar (ejemplo: 10 para 10%)
     * No retorna nada, solo modifica el precio actual
     */
    public void incrementarPrecio(int porcentajeIncremento) {
        // Calcular el incremento: precio actual * (porcentaje / 100)
        double incremento = this.precio * porcentajeIncremento / 100.0;
        // Sumar el incremento al precio actual
        this.precio = this.precio + incremento;
    }
    
    /**
     * Método que disminuye el precio del producto
     * @param descuento - valor a restar del precio actual
     * No retorna nada, solo modifica el precio
     */
    public void disminuirPrecio(double descuento) {
        // Restar el descuento al precio actual
        this.precio = this.precio - descuento;
    }
    
    // Getters y Setters - permiten acceder y modificar los atributos privados
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}