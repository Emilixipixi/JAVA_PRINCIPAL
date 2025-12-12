package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;
import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

// Esta clase es para probar que todo funcione correctamente
public class TestAlarmas {
    
    public static void main(String[] args) {
        // Creamos el administrador de alarmas
        AdminAlarmas admin = new AdminAlarmas();
        
        // Creamos varias alarmas usando las constantes de DiasSemana
        // Formato: new Alarma(día, hora, minuto)
        Alarma alarma1 = new Alarma(DiasSemana.LUNES, 5, 45);
        Alarma alarma2 = new Alarma(DiasSemana.MARTES, 8, 30);
        Alarma alarma3 = new Alarma(DiasSemana.MIERCOLES, 12, 15);
        Alarma alarma4 = new Alarma(DiasSemana.JUEVES, 7, 0);
        Alarma alarma5 = new Alarma(DiasSemana.VIERNES, 18, 20);
        Alarma alarma6 = new Alarma(DiasSemana.SABADO, 9, 5);
        Alarma alarma7 = new Alarma(DiasSemana.DOMINGO, 10, 0);
        
        // Agregamos todas las alarmas al administrador
        admin.agregarAlarma(alarma1);
        admin.agregarAlarma(alarma2);
        admin.agregarAlarma(alarma3);
        admin.agregarAlarma(alarma4);
        admin.agregarAlarma(alarma5);
        admin.agregarAlarma(alarma6);
        admin.agregarAlarma(alarma7);
        
        // Recuperamos la lista de alarmas y la imprimimos
        ArrayList<Alarma> alarmasActuales = admin.getAlarmas();
        
        System.out.println("=== LISTA DE ALARMAS ===");
        System.out.println(alarmasActuales);
    }
}