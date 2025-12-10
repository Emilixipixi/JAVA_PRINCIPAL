package com.krakedev.evaluacion;

/**
 * Clase que representa una dirección con calle principal y secundaria
 */
public class Direccion {
    // Atributos de la clase
    private String callePrincipal;
    private String calleSecundaria;
    
    /**
     * Constructor que recibe ambas calles
     */
    public Direccion(String callePrincipal, String calleSecundaria) {
        // Asignar los valores recibidos a los atributos
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
    }
    
    // Getters - métodos para obtener los valores
    public String getCallePrincipal() {
        return callePrincipal;
    }
    
    public String getCalleSecundaria() {
        return calleSecundaria;
    }
    
    // Setters - métodos para modificar los valores
    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }
    
    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }
}