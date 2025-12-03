package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

/**
 * Clase que representa una máquina expendedora de dulces
 * Contiene 4 celdas y métodos para gestionar productos y ventas
 */
public class MaquinaDulces {
    // Atributos: la máquina tiene 4 celdas y un saldo acumulado
    private Celda celda1;
    private Celda celda2;
    private Celda celda3;
    private Celda celda4;
    private double saldo;  // Dinero acumulado en la máquina
    
    /**
     * Constructor por defecto: inicializa el saldo en 0
     * Las celdas se configuran después con configurarMaquina()
     */
    public MaquinaDulces() {
        this.saldo = 0.0;
    }
    
    /**
     * Método que configura las 4 celdas de la máquina
     * @param codigo1 - código para la celda 1
     * @param codigo2 - código para la celda 2
     * @param codigo3 - código para la celda 3
     * @param codigo4 - código para la celda 4
     */
    public void configurarMaquina(String codigo1, String codigo2, 
                                   String codigo3, String codigo4) {
        // Crear las 4 celdas con sus respectivos códigos
        this.celda1 = new Celda(codigo1);
        this.celda2 = new Celda(codigo2);
        this.celda3 = new Celda(codigo3);
        this.celda4 = new Celda(codigo4);
    }
    
    /**
     * Método que imprime en consola los códigos de las 4 celdas
     */
    public void mostrarConfiguracion() {
        System.out.println("CELDA 1:" + celda1.getCodigo());
        System.out.println("CELDA 2:" + celda2.getCodigo());
        System.out.println("CELDA 3:" + celda3.getCodigo());
        System.out.println("CELDA 4:" + celda4.getCodigo());
    }
    
    /**
     * Método que busca una celda por su código
     * @param codigoCelda - código de la celda a buscar
     * @return la Celda encontrada, o null si no existe
     */
    public Celda buscarCelda(String codigoCelda) {
        // Comparar el código con cada celda
        if (celda1 != null && celda1.getCodigo().equals(codigoCelda)) {
            return celda1;
        }
        if (celda2 != null && celda2.getCodigo().equals(codigoCelda)) {
            return celda2;
        }
        if (celda3 != null && celda3.getCodigo().equals(codigoCelda)) {
            return celda3;
        }
        if (celda4 != null && celda4.getCodigo().equals(codigoCelda)) {
            return celda4;
        }
        // Si no se encontró, retornar null
        return null;
    }
    
    /**
     * Método que carga un producto en una celda específica
     * @param producto - producto a cargar
     * @param codigoCelda - código de la celda donde cargar
     * @param items - cantidad de productos a cargar inicialmente
     */
    public void cargarProducto(Producto producto, String codigoCelda, int items) {
        // Buscar la celda usando el método buscarCelda
        Celda celdaRecuperada = buscarCelda(codigoCelda);
        
        // Si la celda existe, agregar el producto y el stock
        if (celdaRecuperada != null) {
            celdaRecuperada.ingresarProducto(producto, items);
        }
    }
    
    /**
     * Método que muestra todos los productos de todas las celdas
     */
    public void mostrarProductos() {
        // Mostrar información de cada celda
        mostrarInfoCelda(celda1);
        mostrarInfoCelda(celda2);
        mostrarInfoCelda(celda3);
        mostrarInfoCelda(celda4);
    }
    
    /**
     * Método auxiliar que muestra la información de una celda específica
     * @param celda - la celda a mostrar
     */
    private void mostrarInfoCelda(Celda celda) {
        System.out.println("**********CELDA " + celda.getCodigo());
        System.out.println("Stock:" + celda.getStock());
        
        // Verificar si la celda tiene producto
        if (celda.getProducto() != null) {
            System.out.println("Nombre Producto:" + celda.getProducto().getNombre());
            System.out.println("Precio Producto:" + celda.getProducto().getPrecio());
            System.out.println("Código Producto:" + celda.getProducto().getCodigo());
        } else {
            System.out.println("La celda no tiene producto!!!");
        }
    }
    
    /**
     * Método que busca el producto almacenado en una celda
     * @param codigoCelda - código de la celda
     * @return el Producto guardado en esa celda, o null si no existe
     */
    public Producto buscarProductoEnCelda(String codigoCelda) {
        // Buscar la celda
        Celda celda = buscarCelda(codigoCelda);
        
        // Si la celda existe, retornar su producto
        if (celda != null) {
            return celda.getProducto();
        }
        
        // Si no existe la celda, retornar null
        return null;
    }
    
    /**
     * Método que consulta el precio de un producto en una celda
     * @param codigoCelda - código de la celda
     * @return el precio del producto, o 0.0 si no hay producto
     */
    public double consultarPrecio(String codigoCelda) {
        // Buscar la celda
        Celda celda = buscarCelda(codigoCelda);
        
        // Si la celda existe y tiene producto, retornar el precio
        if (celda != null && celda.getProducto() != null) {
            return celda.getProducto().getPrecio();
        }
        
        // Si no hay producto, retornar 0
        return 0.0;
    }
    
    /**
     * Método que busca la celda que contiene un producto específico
     * @param codigoProducto - código del producto a buscar
     * @return la Celda que contiene ese producto, o null si no se encuentra
     */
    public Celda buscarCeldaProducto(String codigoProducto) {
        // Revisar cada celda para ver si su producto tiene ese código
        if (celda1 != null && celda1.getProducto() != null && 
            celda1.getProducto().getCodigo().equals(codigoProducto)) {
            return celda1;
        }
        if (celda2 != null && celda2.getProducto() != null && 
            celda2.getProducto().getCodigo().equals(codigoProducto)) {
            return celda2;
        }
        if (celda3 != null && celda3.getProducto() != null && 
            celda3.getProducto().getCodigo().equals(codigoProducto)) {
            return celda3;
        }
        if (celda4 != null && celda4.getProducto() != null && 
            celda4.getProducto().getCodigo().equals(codigoProducto)) {
            return celda4;
        }
        
        // Si no se encontró, retornar null
        return null;
    }
    
    /**
     * Método que incrementa el stock de productos en una celda
     * @param codigoProducto - código del producto
     * @param items - cantidad de items a agregar al stock
     */
    public void incrementarProductos(String codigoProducto, int items) {
        // Buscar la celda que tiene ese producto
        Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
        
        // Si se encontró la celda, incrementar su stock
        if (celdaEncontrada != null) {
            // Obtener el stock actual y sumarle los nuevos items
            int stockActual = celdaEncontrada.getStock();
            celdaEncontrada.setStock(stockActual + items);
        }
    }
    
    /**
     * Método que realiza una venta
     * @param codigoCelda - código de la celda del producto a vender
     * Disminuye el stock en 1, suma el precio al saldo y muestra productos
     */
    public void vender(String codigoCelda) {
        // Buscar la celda
        Celda celda = buscarCelda(codigoCelda);
        
        if (celda != null) {
            // Disminuir el stock en 1
            celda.setStock(celda.getStock() - 1);
            
            // Obtener el precio del producto y sumarlo al saldo
            double precio = celda.getProducto().getPrecio();
            this.saldo = this.saldo + precio;
            
            // Mostrar todos los productos (incluye el saldo actualizado)
            mostrarProductos();
        }
    }
    
    /**
     * Método que realiza una venta con cambio
     * @param codigoCelda - código de la celda del producto
     * @param valorIngresado - dinero que ingresa el cliente
     * @return el cambio a devolver al cliente
     */
    public double venderConCambio(String codigoCelda, double valorIngresado) {
        // Buscar la celda
        Celda celda = buscarCelda(codigoCelda);
        
        if (celda != null && celda.getProducto() != null) {
            // Disminuir el stock en 1
            celda.setStock(celda.getStock() - 1);
            
            // Obtener el precio
            double precio = celda.getProducto().getPrecio();
            
            // Calcular el cambio (lo que sobra)
            double cambio = valorIngresado - precio;
            
            // Sumar el precio (no el valor ingresado) al saldo
            this.saldo = this.saldo + precio;
            
            // Retornar el cambio
            return cambio;
        }
        
        // Si no hay celda o producto, retornar 0
        return 0.0;
    }
    
    // Getters y Setters
    
    public Celda getCelda1() {
        return celda1;
    }
    
    public void setCelda1(Celda celda1) {
        this.celda1 = celda1;
    }
    
    public Celda getCelda2() {
        return celda2;
    }
    
    public void setCelda2(Celda celda2) {
        this.celda2 = celda2;
    }
    
    public Celda getCelda3() {
        return celda3;
    }
    
    public void setCelda3(Celda celda3) {
        this.celda3 = celda3;
    }
    
    public Celda getCelda4() {
        return celda4;
    }
    
    public void setCelda4(Celda celda4) {
        this.celda4 = celda4;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}