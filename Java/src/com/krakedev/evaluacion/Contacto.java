package com.krakedev.evaluacion;

import java.util.ArrayList;

/**
 * Clase que representa un contacto con sus datos personales,
 * dirección y teléfonos
 */
public class Contacto {
    // Atributos básicos del contacto
    private String cedula;
    private String nombre;
    private String apellido;
    private Direccion direccion;
    
    // Lista de teléfonos del contacto
    private ArrayList<Telefono> telefonos;
    
    /**
     * Constructor que recibe cédula, nombre y apellido
     */
    public Contacto(String cedula, String nombre, String apellido) {
        // Asignar los valores recibidos a los atributos
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        
        // Inicializar la lista de teléfonos vacía
        this.telefonos = new ArrayList<Telefono>();
    }
    
    // Getters y Setters
    public String getCedula() {
        return cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public Direccion getDireccion() {
        return direccion;
    }
    
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    public ArrayList<Telefono> getTelefonos() {
        return telefonos;
    }
    
    public void setTelefonos(ArrayList<Telefono> telefonos) {
        this.telefonos = telefonos;
    }
    
    /**
     * Método para agregar un teléfono a la lista
     */
    public void agregarTelefono(Telefono telefono) {
        // Agregar el teléfono recibido a la lista
        telefonos.add(telefono);
    }
    
    /**
     * Método para mostrar todos los teléfonos en estado C (Correcto)
     */
    public void mostrarTelefonos() {
        // Recorrer todos los teléfonos del contacto
        for(int i = 0; i < telefonos.size(); i++) {
            // Obtener el teléfono en la posición i
            Telefono telefono = telefonos.get(i);
            
            // Verificar si el estado es C (Correcto)
            if(telefono.getEstado().equals("C")) {
                // Mostrar la información del teléfono
                System.out.println("Número: " + telefono.getNumero() + 
                                   ", Tipo: " + telefono.getTipo());
            }
        }
    }
    
    /**
     * Método para recuperar todos los teléfonos incorrectos (estado E)
     * @return ArrayList con los teléfonos en estado E
     */
    public ArrayList<Telefono> recuperarIncorrectos() {
        // Crear una nueva lista para almacenar los teléfonos incorrectos
        ArrayList<Telefono> incorrectos = new ArrayList<Telefono>();
        
        // Recorrer todos los teléfonos del contacto
        for(int i = 0; i < telefonos.size(); i++) {
            // Obtener el teléfono en la posición i
            Telefono telefono = telefonos.get(i);
            
            // Verificar si el estado es E (Error)
            if(telefono.getEstado().equals("E")) {
                // Agregar el teléfono a la lista de incorrectos
                incorrectos.add(telefono);
            }
        }
        
        // Retornar la lista de teléfonos incorrectos
        return incorrectos;
    }
    
    /**
     * Método para imprimir la información del contacto
     */
    public void imprimir() {
        // Mostrar información básica
        System.out.println("Cédula: " + cedula);
        System.out.println("Nombre: " + nombre + " " + apellido);
        
        // Verificar si tiene dirección asignada
        if(direccion != null) {
            // Si tiene dirección, mostrarla
            System.out.println("Dirección: " + direccion.getCallePrincipal() + 
                               " y " + direccion.getCalleSecundaria());
        } else {
            // Si no tiene dirección, mostrar "null"
            System.out.println("Dirección: null");
        }
    }
}