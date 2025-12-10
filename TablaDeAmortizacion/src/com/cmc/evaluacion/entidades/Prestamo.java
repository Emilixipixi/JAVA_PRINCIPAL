package com.cmc.evaluacion.entidades;

import com.cmc.evaluacion.servicios.Utilitario;

/**
 * Clase Prestamo - Representa un préstamo bancario
 * Esta clase almacena la información básica de un préstamo
 */
public class Prestamo {
    // Atributos de la clase (características del préstamo)
    private double monto;     // El dinero que se pide prestado
    private double interes;   // El porcentaje de interés anual
    private int plazo;        // El número de meses para pagar
    private Cuota[] cuotas;   // Array para guardar todas las cuotas
    
    /**
     * Constructor - Se ejecuta cuando creamos un nuevo Prestamo
     * @param monto - cantidad de dinero del préstamo
     * @param interes - tasa de interés anual (ejemplo: 12 significa 12%)
     * @param plazo - número de meses para pagar
     */
    public Prestamo(double monto, double interes, int plazo) {
        this.monto = monto;
        this.interes = interes;
        this.plazo = plazo;
        // Crear el array de cuotas con el tamaño del plazo
        this.cuotas = new Cuota[plazo];
    }
    
    // Métodos Getters - Permiten OBTENER el valor de los atributos
    
    /**
     * Obtiene el monto del préstamo
     * @return el monto
     */
    public double getMonto() {
        return monto;
    }
    
    /**
     * Obtiene el interés del préstamo
     * @return el interés anual
     */
    public double getInteres() {
        return interes;
    }
    
    /**
     * Obtiene el plazo del préstamo
     * @return el plazo en meses
     */
    public int getPlazo() {
        return plazo;
    }
    
    /**
     * Obtiene el array de cuotas
     * @return el array de cuotas
     */
    public Cuota[] getCuotas() {
        return cuotas;
    }
    
    // Métodos Setters - Permiten MODIFICAR el valor de los atributos
    
    /**
     * Establece el monto del préstamo
     * @param monto - nuevo monto
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    /**
     * Establece el interés del préstamo
     * @param interes - nuevo interés
     */
    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    /**
     * Establece el plazo del préstamo
     * @param plazo - nuevo plazo en meses
     */
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
    
    /**
     * Método mostrarPrestamo - Muestra la información del préstamo
     */
    public void mostrarPrestamo() {
        System.out.println("[monto=" + Utilitario.redondear(monto) + 
                         ", interes=" + Utilitario.redondear(interes) + 
                         ", plazo=" + plazo + "]");
    }
}