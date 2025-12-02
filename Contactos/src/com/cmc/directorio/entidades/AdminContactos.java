package com.cmc.directorio.entidades;

// Clase para administrar contactos
public class AdminContactos {
    
    // Método que busca el contacto más pesado entre dos
    public Contacto buscarMasPesado(Contacto c1, Contacto c2) {
        // Comparar el peso de los dos contactos
        if (c1.peso > c2.peso) {
            return c1; // Retornar el primer contacto si es más pesado
        } else {
            return c2; // Retornar el segundo contacto
        }
    }
    
    // Método que compara si dos contactos tienen la misma operadora
    public boolean compararOperadoras(Contacto c1, Contacto c2) {
        // Comparar las operadoras de los teléfonos
        if (c1.telefono.operadora.equals(c2.telefono.operadora)) {
            return true; // Tienen la misma operadora
        } else {
            return false; // Tienen operadoras diferentes
        }
    }
    
    // Método que activa un usuario solo si tiene whatsapp
    public void activarUsuario(Contacto contacto) {
        // Verificar si el contacto tiene whatsapp
        if (contacto.telefono.tieneWhatsapp == true) {
            contacto.activo = true; // Activar el usuario
        }
    }
}