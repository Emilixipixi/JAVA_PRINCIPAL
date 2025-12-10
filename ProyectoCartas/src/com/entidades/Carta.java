package com.entidades;

/**
 * Clase que representa una carta completa
 * Combina un número (con su valor) y un palo
 */
public class Carta {
    
    // Atributos privados
    private Numero numero;  // Objeto de tipo Numero (contiene numeroCarta y valor)
    private String palo;    // El palo de la carta (CR, CN, DI, TR)
    
    // Constructor que recibe un número y un palo
    public Carta(Numero numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }
    
    // Getters
    public Numero getNumero() {
        return numero;
    }
    
    public String getPalo() {
        return palo;
    }
    
    // Setters
    public void setNumero(Numero numero) {
        this.numero = numero;
    }
    
    public void setPalo(String palo) {
        this.palo = palo;
    }
    
    /**
     * Método para mostrar la información de la carta completa
     * Formato: numeroCarta-palo
     * Ejemplo: A-CR (As de Corazón Rojo), 10-TR (10 de Trébol)
     */
    public void mostrarInfo() {
        System.out.println(numero.getNumeroCarta() + "-" + palo);
    }
}