package com.entidades;

/**
 * Clase que representa un número de carta
 * Contiene el símbolo (A, 2-10, J, Q, K) y su valor numérico
 */
public class Numero {
    
    // Atributos privados
    private String numeroCarta;  // El símbolo de la carta (A, 2, 3, ..., 10, J, Q, K)
    private int valor;           // El valor numérico de la carta
    
    // Constructor que recibe ambos parámetros
    public Numero(String numeroCarta, int valor) {
        this.numeroCarta = numeroCarta;
        this.valor = valor;
    }
    
    // Getters
    public String getNumeroCarta() {
        return numeroCarta;
    }
    
    public int getValor() {
        return valor;
    }
    
    // Setters
    public void setNumeroCarta(String numeroCarta) {
        this.numeroCarta = numeroCarta;
    }
    
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    /**
     * Método para mostrar la información de la carta
     * Formato: numeroCarta - valor
     * Ejemplo: A-11, Q-10, 4-4
     */
    public void mostrarInfo() {
        System.out.println(numeroCarta + "-" + valor);
    }
}