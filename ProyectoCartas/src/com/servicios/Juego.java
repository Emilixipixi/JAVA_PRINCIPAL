package com.servicios;

import com.entidades.Naipe;
import com.entidades.Carta;
import java.util.ArrayList;

/**
 * Clase que maneja la lógica del juego de cartas
 * Reparte cartas a los jugadores y determina el ganador
 */
public class Juego {
    
    // Atributos privados
    private Naipe naipe;  // El mazo de cartas
    private ArrayList<Carta> naipeBarajado;  // El mazo después de barajar
    // ArrayList de ArrayList: cada jugador tiene su propio ArrayList de cartas
    private ArrayList<ArrayList<Carta>> cartasJugadores;
    
    /**
     * Constructor que recibe un ArrayList con los IDs de los jugadores
     * Inicializa el naipe, lo baraja, y crea un ArrayList de cartas
     * vacío para cada jugador
     */
    public Juego(ArrayList<String> idsJugadores) {
        // Creamos e inicializamos el naipe (se crean las 52 cartas)
        this.naipe = new Naipe();
        
        // Barajamos el naipe y guardamos el resultado
        this.naipeBarajado = naipe.barajar();
        
        // Inicializamos el ArrayList de ArrayList de cartas
        this.cartasJugadores = new ArrayList<>();
        
        // Por cada jugador, creamos un ArrayList de Carta vacío
        for (int i = 0; i < idsJugadores.size(); i++) {
            cartasJugadores.add(new ArrayList<Carta>());
        }
    }
    
    // Getter para cartasJugadores
    public ArrayList<ArrayList<Carta>> getCartasJugadores() {
        return cartasJugadores;
    }
    
    /**
     * Método para entregar cartas a los jugadores
     * Reparte las cartas de forma secuencial: primero al jugador 1,
     * luego al 2, etc., hasta que cada uno tenga el número indicado
     * 
     * @param cartasPorJugador Número de cartas que debe recibir cada jugador
     */
    public void entregarCartas(int cartasPorJugador) {
        // Variable para llevar el control de la posición en naipeBarajado
        int posicion = 0;
        
        // Este proceso se repite tantas veces como cartas debe recibir cada jugador
        for (int ronda = 0; ronda < cartasPorJugador; ronda++) {
            // En cada ronda, le damos una carta a cada jugador
            for (int jugador = 0; jugador < cartasJugadores.size(); jugador++) {
                // Obtenemos la carta en la posición actual del naipe barajado
                Carta cartaActual = naipeBarajado.get(posicion);
                
                // Agregamos la carta al ArrayList del jugador actual
                cartasJugadores.get(jugador).add(cartaActual);
                
                // Avanzamos a la siguiente posición del mazo
                posicion++;
            }
        }
    }
    
    /**
     * Método para calcular el total de puntos de un jugador
     * Suma los valores de todas las cartas del jugador
     * 
     * @param idJugador El índice del jugador (0, 1, 2, etc.)
     * @return La suma total de los valores de las cartas del jugador
     */
    public int devolverTotal(int idJugador) {
        // Variable para acumular la suma
        int total = 0;
        
        // Obtenemos el ArrayList de cartas del jugador
        ArrayList<Carta> cartasDelJugador = cartasJugadores.get(idJugador);
        
        // Recorremos todas las cartas del jugador
        for (Carta carta : cartasDelJugador) {
            // Sumamos el valor de cada carta al total
            total += carta.getNumero().getValor();
        }
        
        return total;
    }
    
    /**
     * Método para determinar el ganador del juego
     * El ganador es el jugador con mayor puntaje
     * 
     * @return El ID/nombre del jugador ganador (en formato "jugador X")
     */
    public String determinarGanador() {
        // Variables auxiliares para encontrar al ganador
        int idGanador = 0;          // Índice del jugador ganador (inicialmente el primero)
        int sumaGanador = devolverTotal(0);  // Suma del primer jugador
        
        // Recorremos todos los demás jugadores
        for (int i = 1; i < cartasJugadores.size(); i++) {
            // Calculamos el total del jugador actual
            int totalActual = devolverTotal(i);
            
            // Si este jugador tiene más puntos que el ganador actual
            if (totalActual > sumaGanador) {
                // Este jugador pasa a ser el nuevo ganador
                idGanador = i;
                sumaGanador = totalActual;
            }
        }
        
        // Retornamos el ID del ganador en formato "jugador X"
        // Le sumamos 1 porque los índices empiezan en 0 pero queremos mostrar desde 1
        return "jugador " + (idGanador + 1);
    }
}