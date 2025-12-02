package com.cmc.directorio.entidades;

// Clase que representa un contacto
public class Contacto {
    // Atributos públicos de la clase
    public String nombre;
    public String apellido;
    public boolean activo;
    public Telefono telefono; // Relación con la clase Telefono
    public double peso;
    
    // Constructor que recibe todos los parámetros excepto activo
    public Contacto(String nombre, String apellido, Telefono telefono, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.peso = peso;
        // El atributo activo no se recibe, queda con su valor por defecto (false)
    }
}