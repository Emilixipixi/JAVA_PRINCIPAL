package com.entidades;

/**
 * Clase que representa los palos de una baraja española
 * Cada palo tiene un símbolo asociado (CR, CN, DI, TR)
 */
public class Palos {
    
    // Atributos privados - solo se pueden acceder mediante getters y setters
    private String corazonRojo;   // Corazón Rojo = "CR"
    private String corazonNegro;  // Corazón Negro = "CN"
    private String diamante;      // Diamante = "DI"
    private String trebol;        // Trébol = "TR"
    
    // Constructor vacío - inicializa los valores de los palos
    public Palos() {
        this.corazonRojo = "CR";
        this.corazonNegro = "CN";
        this.diamante = "DI";
        this.trebol = "TR";
    }
    
    // Getters - métodos para obtener los valores de los atributos
    public String getCorazonRojo() {
        return corazonRojo;
    }
    
    public String getCorazonNegro() {
        return corazonNegro;
    }
    
    public String getDiamante() {
        return diamante;
    }
    
    public String getTrebol() {
        return trebol;
    }
    
    // Setters - métodos para modificar los valores de los atributos
    public void setCorazonRojo(String corazonRojo) {
        this.corazonRojo = corazonRojo;
    }
    
    public void setCorazonNegro(String corazonNegro) {
        this.corazonNegro = corazonNegro;
    }
    
    public void setDiamante(String diamante) {
        this.diamante = diamante;
    }
    
    public void setTrebol(String trebol) {
        this.trebol = trebol;
    }
}