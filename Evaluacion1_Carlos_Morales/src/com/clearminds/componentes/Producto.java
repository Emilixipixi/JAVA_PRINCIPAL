package com.clearminds.componentes;

/**
 * Clase que representa un producto de la máquina de dulces
 */
public class Producto {
    // Atributos de la clase
    private String codigo;  // Código del producto (ejemplo: "KE34")
    private String nombre;  // Nombre del producto (ejemplo: "Papitas")
    private double precio;  // Precio del producto (ejemplo: 0.85)
    
    /**
     * Constructor que inicializa un producto con todos sus datos
     * IMPORTANTE: El orden es código, nombre, precio
     * @param codigo - código único del producto
     * @param nombre - nombre del producto
     * @param precio - precio del producto
     */
    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    /**
     * Método que incrementa el precio según un porcentaje
     * @param porcentajeIncremento - porcentaje a incrementar (ejemplo: 10 para 10%)
     */
    public void incrementarPrecio(int porcentajeIncremento) {
        // Calcular el valor del incremento
        // Ejemplo: si precio es 0.85 y porcentaje es 50
        // incremento = 0.85 * (50 / 100.0) = 0.425
        double incremento = this.precio * (porcentajeIncremento / 100.0);
        
        // Sumar el incremento al precio actual
        // Ejemplo: precio = 0.85 + 0.425 = 1.275
        this.precio = this.precio + incremento;
    }
    
    /**
     * Método que disminuye el precio restando un valor de descuento
     * @param descuento - valor a restar del precio actual
     */
    public void disminuirPrecio(double descuento) {
        // Restar el descuento directamente del precio
        // Ejemplo: si precio es 1.275 y descuento es 0.35
        // precio = 1.275 - 0.35 = 0.925
        this.precio = this.precio - descuento;
    }
    
    // Métodos getters y setters para acceder a los atributos privados
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
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
}