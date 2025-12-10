package com.clearminds.componentes;
/**
 * Clase que representa una celda de la máquina de dulces
 * Cada celda almacena un producto y su stock (cantidad disponible)
 */
public class Celda {
    // Atributos de la clase
    private Producto producto;  // El producto que está en esta celda
    private int stock;          // Cantidad de productos disponibles
    private String codigo;      // Código de la celda (ejemplo: "A1", "B2")
    
    /**
     * Constructor que inicializa una celda con su código
     * @param codigo - código identificador de la celda
     */
    public Celda(String codigo) {
        this.codigo = codigo;
        // Nota: producto queda en null y stock en 0 hasta que se ingrese un producto
    }
    
    /**
     * Método para ingresar un producto a la celda con su stock inicial
     * @param producto - el producto que se va a almacenar
     * @param stock - cantidad inicial de productos
     */
    public void ingresarProducto(Producto producto, int stock) {
        // Asignar el producto a la celda
        this.producto = producto;
        // Asignar el stock inicial
        this.stock = stock;
    }
    
    // Métodos getters y setters para acceder a los atributos privados
    
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