package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.maquina.MaquinaDulces;

/**
 * Clase de prueba para verificar el método buscarCelda
 * Prueba buscar una celda existente y una que no existe
 */
public class TestBusqueda {
    
    public static void main(String[] args) {
        // Crear y configurar la máquina
        MaquinaDulces maquina = new MaquinaDulces();
        maquina.configurarMaquina("A1", "A2", "B1", "B2");
        
        // Buscar la celda A2 (esta sí existe)
        Celda celdaEncontrada = maquina.buscarCelda("A2");
        
        // Mostrar el resultado
        System.out.println("Celda Encontrada: " + celdaEncontrada.getCodigo());
        
        // Buscar una celda que no existe
        Celda celdaNoExiste = maquina.buscarCelda("Z9");
        
        // Esta búsqueda retorna null
        System.out.println("no existe la celda"); 
        // Nota: Si intentáramos hacer celdaNoExiste.getCodigo() 
        // nos daría NullPointerException
    }
}