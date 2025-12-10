package com.clearminds.maquina;

import java.util.ArrayList;
import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
    private ArrayList<Celda> celdas;
    private double saldo;
    
    public MaquinaDulces() {
        celdas = new ArrayList<Celda>();
        saldo = 0.0;
    }
    
    public void agregarCelda(Celda celda) {
        celdas.add(celda);
    }
    
    public void mostrarConfiguracion() {
        for (int i = 0; i < celdas.size(); i++) {
            Celda celdaActual = celdas.get(i);
            System.out.println("Celda: " + celdaActual.getCodigo());
        }
    }
    
    public Celda buscarCelda(String codigo) {
        Celda celdaEncontrada = null;
        for (int i = 0; i < celdas.size(); i++) {
            Celda celdaActual = celdas.get(i);
            if (celdaActual.getCodigo().equals(codigo)) {
                celdaEncontrada = celdaActual;
                break;
            }
        }
        return celdaEncontrada;
    }
    
    public void cargarProducto(Producto producto, String codigo, int stock) {
        Celda celdaRecuperada = buscarCelda(codigo);
        celdaRecuperada.ingresarProducto(producto, stock);
    }
    
    public void mostrarProductos() {
        for (int i = 0; i < celdas.size(); i++) {
            Celda celdaActual = celdas.get(i);
            Producto productoActual = celdaActual.getProducto();
            if (productoActual != null) {
                System.out.println("Celda:" + celdaActual.getCodigo() + 
                                   " Stock:" + celdaActual.getStock() + 
                                   " Producto:" + productoActual.getNombre() + 
                                   " Precio:" + productoActual.getPrecio());
            } else {
                System.out.println("Celda:" + celdaActual.getCodigo() + 
                                   " Stock:" + celdaActual.getStock() + 
                                   " Sin producto asignado");
            }
        }
        System.out.println("Saldo:" + saldo);
    }
    
    public Producto buscarProductoEnCelda(String codigo) {
        Celda celdaEncontrada = buscarCelda(codigo);
        if (celdaEncontrada != null) {
            return celdaEncontrada.getProducto();
        } else {
            return null;
        }
    }
    
    public double consultarPrecio(String codigo) {
        Producto productoEncontrado = buscarProductoEnCelda(codigo);
        return productoEncontrado.getPrecio();
    }
    
    public Celda buscarCeldaProducto(String codigoProducto) {
        Celda celdaEncontrada = null;
        for (int i = 0; i < celdas.size(); i++) {
            Celda celdaActual = celdas.get(i);
            Producto productoActual = celdaActual.getProducto();
            if (productoActual != null) {
                if (productoActual.getCodigo().equals(codigoProducto)) {
                    celdaEncontrada = celdaActual;
                    break;
                }
            }
        }
        return celdaEncontrada;
    }
    
    public void incrementarProductos(String codigoProducto, int items) {
        Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
        int stockActual = celdaEncontrada.getStock();
        int nuevoStock = stockActual + items;
        celdaEncontrada.setStock(nuevoStock);
    }
    
    public void vender(String codigo) {
        Celda celdaEncontrada = buscarCelda(codigo);
        int stockActual = celdaEncontrada.getStock();
        celdaEncontrada.setStock(stockActual - 1);
        Producto productoVendido = celdaEncontrada.getProducto();
        double precioProducto = productoVendido.getPrecio();
        saldo = saldo + precioProducto;
    }
    
    public double venderConCambio(String codigo, double valorIngresado) {
        Celda celdaEncontrada = buscarCelda(codigo);
        int stockActual = celdaEncontrada.getStock();
        celdaEncontrada.setStock(stockActual - 1);
        Producto productoVendido = celdaEncontrada.getProducto();
        double precioProducto = productoVendido.getPrecio();
        saldo = saldo + precioProducto;
        double cambio = valorIngresado - precioProducto;
        return cambio;
    }
    
    public ArrayList<Producto> buscarMenores(double limite) {
        ArrayList<Producto> productosEncontrados = new ArrayList<Producto>();
        for (int i = 0; i < celdas.size(); i++) {
            Celda celdaActual = celdas.get(i);
            Producto productoActual = celdaActual.getProducto();
            if (productoActual != null) {
                if (productoActual.getPrecio() <= limite) {
                    productosEncontrados.add(productoActual);
                }
            }
        }
        return productosEncontrados;
    }
    
    public ArrayList<Celda> getCeldas() {
        return celdas;
    }
    
    public void setCeldas(ArrayList<Celda> celdas) {
        this.celdas = celdas;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}