package com.clearminds.test;

import com.clearminds.maquina.MaquinaDulces;

/**
 * Clase de prueba para verificar la configuración de la máquina de dulces
 * Prueba que se puedan asignar códigos a las 4 celdas
 */
public class TestConfiguracion {
    
    public static void main(String[] args) {
        // Crear una nueva máquina de dulces
        MaquinaDulces maquina = new MaquinaDulces();
        
        // Configurar la máquina con los códigos de las 4 celdas
        // Celda 1: A1, Celda 2: A2, Celda 3: B1, Celda 4: B2
        maquina.configurarMaquina("A1", "A2", "B1", "B2");
        
        // Mostrar la configuración de las celdas
        maquina.mostrarConfiguracion();
    }
}