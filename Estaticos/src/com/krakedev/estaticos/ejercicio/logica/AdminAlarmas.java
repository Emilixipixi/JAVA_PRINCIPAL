package com.krakedev.estaticos.ejercicio.logica;

import java.util.ArrayList;
import com.krakedev.estaticos.ejercicio.entidades.Alarma;

// Esta clase administra una lista de alarmas
public class AdminAlarmas {
    // Atributo: una lista (ArrayList) que guarda varias alarmas
    private ArrayList<Alarma> alarmas;
    
    // Constructor: cuando creamos un AdminAlarmas, iniciamos la lista vacía
    public AdminAlarmas() {
        alarmas = new ArrayList<Alarma>();
    }
    
    // Método para agregar una alarma a la lista
    public void agregarAlarma(Alarma alarma) {
        alarmas.add(alarma);
    }
    
    // Getter: nos permite obtener la lista de alarmas
    // NO hay setter porque no queremos que alguien reemplace toda la lista
    public ArrayList<Alarma> getAlarmas() {
        return alarmas;
    }
}