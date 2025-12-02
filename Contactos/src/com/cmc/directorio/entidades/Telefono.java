package com.cmc.directorio.entidades;

// Clase que representa un teléfono
public class Telefono {
    // Atributos públicos de la clase
    public String operadora;
    public String numero;
    public int codigo;
    public boolean tieneWhatsapp;
    
    // Constructor que recibe codigo, operadora y numero
    public Telefono(int codigo, String operadora, String numero) {
        this.codigo = codigo;
        this.operadora = operadora;
        this.numero = numero;
        this.tieneWhatsapp = false; // Valor inicial es false
    }
}