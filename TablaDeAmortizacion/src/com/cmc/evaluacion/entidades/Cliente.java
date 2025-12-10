package com.cmc.evaluacion.entidades;

/**
 * Clase Cliente - Representa un cliente del banco
 */
public class Cliente {
    // Atributos del cliente
    private String cedula;    // Cédula o identificación
    private String nombre;    // Nombre del cliente
    private String apellido;  // Apellido del cliente
    
    /**
     * Constructor - Crea un cliente con todos sus datos
     * @param cedula - cédula del cliente
     * @param nombre - nombre del cliente
     * @param apellido - apellido del cliente
     */
    public Cliente(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    // Getters - Métodos para obtener valores
    
    public String getCedula() {
        return cedula;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    // Setters - Métodos para modificar valores
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    /**
     * Método mostrarCliente - Muestra la información del cliente
     */
    public void mostrarCliente() {
        System.out.println("Cliente [cedula=" + cedula + 
                         ", nombre=" + nombre + 
                         ", apellido=" + apellido + "]");
    }
}