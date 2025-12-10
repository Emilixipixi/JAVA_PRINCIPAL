package com.cmc.evaluacion.entidades;

import com.cmc.evaluacion.servicios.Utilitario;

/**
 * Clase Cuota - Representa una cuota individual del préstamo
 * Cada cuota tiene información sobre el número, valores y saldos
 */
public class Cuota {
    // Atributos de la cuota
    private int numero;              // Número de cuota (1, 2, 3...)
    private double cuota;            // Valor total de la cuota
    private double inicio;           // Capital al inicio del período
    private double interes;          // Parte que va a intereses
    private double abonoCapital;     // Abono al capital
    private double saldo;            // Saldo restante después de pagar
    
    /**
     * Constructor - Recibe el número de cuota
     * @param numero - el número de cuota (1, 2, 3...)
     */
    public Cuota(int numero) {
        this.numero = numero;
    }
    
    // Getters - Métodos para OBTENER valores
    
    public int getNumero() {
        return numero;
    }
    
    public double getCuota() {
        return cuota;
    }
    
    public double getInicio() {
        return inicio;
    }
    
    public double getInteres() {
        return interes;
    }
    
    public double getAbonoCapital() {
        return abonoCapital;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    // Setters - Métodos para MODIFICAR valores
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setCuota(double cuota) {
        this.cuota = cuota;
    }
    
    public void setInicio(double inicio) {
        this.inicio = inicio;
    }
    
    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    public void setAbonoCapital(double abonoCapital) {
        this.abonoCapital = abonoCapital;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /**
     * Método mostrarPrestamo - Muestra la información de la cuota
     * Formato: numero | cuota | inicio | interes | abonoCapital | saldo
     */
    public void mostrarPrestamo() {
        // Usamos Utilitario.redondear() para mostrar con 2 decimales
        System.out.println(
            Utilitario.redondear(numero) + " | " +
            Utilitario.redondear(cuota) + " | " +
            Utilitario.redondear(inicio) + " | " +
            Utilitario.redondear(interes) + " | " +
            Utilitario.redondear(abonoCapital) + " | " +
            Utilitario.redondear(saldo)
        );
    }
}