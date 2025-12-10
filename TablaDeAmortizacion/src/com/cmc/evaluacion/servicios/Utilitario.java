package com.cmc.evaluacion.servicios;

/**
 * Clase Utilitario - Contiene métodos de ayuda (utilidades)
 */
public class Utilitario {
    
    /**
     * Método redondear - Redondea un número a 2 decimales
     * @param valor - el número que queremos redondear
     * @return el valor redondeado a 2 decimales
     */
    public static double redondear(double valor) {
        // Paso 1: Multiplicar por 100 para mover 2 decimales a la izquierda
        // Ejemplo: 444.24393 * 100 = 44424.393
        double valorMultiplicado = valor * 100;
        
        // Paso 2: Redondear al entero más cercano
        // Math.round() redondea al entero más cercano
        // Ejemplo: 44424.393 se redondea a 44424
        long valorRedondeado = Math.round(valorMultiplicado);
        
        // Paso 3: Dividir entre 100 para regresar los decimales
        // Ejemplo: 44424 / 100.0 = 444.24
        double resultado = valorRedondeado / 100.0;
        
        return resultado;
    }
}