package com.cmc.directorio.entidades;

// Clase para administrar teléfonos
public class AdminTelefono {
    
    // Método que activa whatsapp si la operadora es "movi"
    public void activarMensajeria(Telefono telefono) {
        // Verificar si la operadora es movi
        if (telefono.operadora.equals("movi")) {
            telefono.tieneWhatsapp = true; // Activar whatsapp
        }
    }
    
    // Método que cuenta cuántos teléfonos son de la operadora "movi"
    public int contarMovi(Telefono telf1, Telefono telf2, Telefono telf3) {
        int contador = 0; // Variable para contar
        
        // Revisar cada teléfono
        if (telf1.operadora.equals("movi")) {
            contador++;
        }
        if (telf2.operadora.equals("movi")) {
            contador++;
        }
        if (telf3.operadora.equals("movi")) {
            contador++;
        }
        
        return contador; // Retornar el total
    }
    
    // Método que cuenta cuántos teléfonos son de la operadora "claro"
    public int contarClaro(Telefono telf1, Telefono telf2, Telefono telf3, Telefono telf4) {
        int contador = 0; // Variable para contar
        
        // Revisar cada teléfono
        if (telf1.operadora.equals("claro")) {
            contador++;
        }
        if (telf2.operadora.equals("claro")) {
            contador++;
        }
        if (telf3.operadora.equals("claro")) {
            contador++;
        }
        if (telf4.operadora.equals("claro")) {
            contador++;
        }
        
        return contador; // Retornar el total
    }
}
