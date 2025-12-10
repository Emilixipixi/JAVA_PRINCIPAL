package com.entidades;

import java.util.ArrayList;

/**
 * Clase que almacena los nombres de los jugadores
 * Contiene un ArrayList con los IDs/nombres de los jugadores
 */
public class Jugadores {
    
    // Atributo privado: lista de jugadores
    private ArrayList<String> jugadores;
    
    // Constructor vacío
    public Jugadores() {
        this.jugadores = new ArrayList<>();
    }
    
    // Getters y Setters
    public ArrayList<String> getJugadores() {
        return jugadores;
    }
    
    public void setJugadores(ArrayList<String> jugadores) {
        this.jugadores = jugadores;
    }
}