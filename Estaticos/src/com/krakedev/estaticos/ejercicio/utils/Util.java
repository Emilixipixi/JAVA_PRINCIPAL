package com.krakedev.estaticos.ejercicio.utils;

// Esta clase tiene métodos útiles para formatear datos
public class Util {
    
    // Método estático: convierte un número en un String de 2 dígitos
    // Por ejemplo: 5 se convierte en "05", 24 se queda como "24"
    public static String formatearHora(int numero) {
        // Convertimos el número a String
        String valor = numero + "";
        
        // Si el String tiene solo 1 carácter, agregamos un 0 adelante
        if (valor.length() == 1) {
            valor = "0" + valor;
        }
        
        return valor;
    }
    
    // Método estático: convierte un número (0-6) en el nombre del día
    // Por ejemplo: 0 retorna "Lunes", 1 retorna "Martes", etc.
    public static String formatearDia(int numeroDia) {
        String dia = "";
        
        // Usamos un switch para decidir qué día es según el número
        switch (numeroDia) {
            case 0:
                dia = "Lunes";
                break;
            case 1:
                dia = "Martes";
                break;
            case 2:
                dia = "Miércoles";
                break;
            case 3:
                dia = "Jueves";
                break;
            case 4:
                dia = "Viernes";
                break;
            case 5:
                dia = "Sábado";
                break;
            case 6:
                dia = "Domingo";
                break;
            default:
                dia = "Día inválido";
                break;
        }
        
        return dia;
    }
}