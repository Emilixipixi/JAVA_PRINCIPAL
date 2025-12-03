package com.clearminds.componentes;

/**
 * Clase que representa una celda (compartimento) de la máquina de dulces
 * Cada celda tiene un código, contiene un producto y lleva control del stock
 */
public class Celda {
    // Atributos de la celda
    private Producto producto;  // Producto almacenado en esta celda (puede ser null)
    private int stock;          // Cantidad de productos disponibles
    private String codigo;      // Código de la celda (ejemplo: "A1", "B2")
    
    /**
     * Constructor: crea una celda con su código
     * @param codigo - identificador único de la celda
     */
    public Celda(String codigo) {
        this.codigo = codigo;
        // El producto inicia en null (celda vacía)
        // El stock inicia en 0
    }
    
    /**
     * Método que ingresa un producto a la celda
     * @param producto - el producto a almacenar
     * @param stockInicial - cantidad inicial de productos
     * No retorna nada
     */
    public void ingresarProducto(Producto producto, int stockInicial) {
        this.producto = producto;
        this.stock = stockInicial;
    }
    
    // Getters y Setters
    
    public Producto getProducto() {
        return producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    public int getStock() {
        return stock;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}