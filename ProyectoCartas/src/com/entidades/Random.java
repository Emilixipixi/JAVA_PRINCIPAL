package com.entidades;

/**
 * Clase con método estático para obtener posiciones aleatorias
 * Genera números aleatorios entre 0 y 51 (para acceder a las 52 cartas)
 */
public class Random {
    
    /**
     * Método estático para obtener una posición aleatoria
     * No recibe parámetros y retorna un número entre 0 y 51
     * 
     * Usamos Math.random() que devuelve un número decimal entre 0.0 y 0.999...
     * Lo multiplicamos por 52 para obtener un rango de 0.0 a 51.999...
     * Luego lo convertimos a entero (int) para eliminar los decimales
     * 
     * @return Un número entero aleatorio entre 0 y 51 (incluidos)
     */
    public static int obtenerPosicion() {
        // Math.random() genera un número entre 0.0 (incluido) y 1.0 (excluido)
        // Al multiplicar por 52, obtenemos valores entre 0.0 y 51.999...
        // Al convertir a int, se elimina la parte decimal: (int)51.99 = 51
        int posicionAleatoria = (int) (Math.random() * 52);
        
        return posicionAleatoria;
    }
}