package com.krakedev.evaluacion;

/**
 * Clase que representa un teléfono con validaciones
 * Valida si el número y tipo son correctos
 */
public class Telefono {
    // Atributos de la clase
    private String numero;
    private String tipo;
    private String estado;
    
    /**
     * Constructor que recibe número y tipo
     * Asigna los valores y determina si el teléfono es correcto o tiene error
     */
    public Telefono(String numero, String tipo) {
        // Asignar los valores recibidos a los atributos
        this.numero = numero;
        this.tipo = tipo;
        
        // Validar si el teléfono es correcto
        // Primero verificamos que ni el número ni el tipo sean null
        if(numero == null || tipo == null) {
            // Si alguno es null, el estado es Error
            this.estado = "E";
        } else if(tipo.equalsIgnoreCase("Movil") == false && tipo.equalsIgnoreCase("Convencional") == false) {
            // Si el tipo no es Movil ni Convencional, es error
            this.estado = "E";
        } else if(tipo.equalsIgnoreCase("Movil") && numero.length() == 10) {
            // Si es Movil y tiene 10 caracteres, es Correcto
            this.estado = "C";
        } else if(tipo.equalsIgnoreCase("Convencional") && numero.length() == 7) {
            // Si es Convencional y tiene 7 caracteres, es Correcto
            this.estado = "C";
        } else {
            // En cualquier otro caso, es Error
            this.estado = "E";
        }
    }
    
    // Getters - métodos para obtener los valores de los atributos
    public String getNumero() {
        return numero;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public String getEstado() {
        return estado;
    }
}