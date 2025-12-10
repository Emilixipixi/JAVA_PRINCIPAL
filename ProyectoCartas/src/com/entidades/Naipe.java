package com.entidades;

import java.util.ArrayList;

/**
 * Clase que representa un mazo completo de cartas
 * Contiene los 13 números posibles y todas las cartas generadas
 */
public class Naipe {
    
    // Atributos privados
    private ArrayList<Numero> numerosPosibles;  // Lista con los 13 números (A, 2-10, J, Q, K)
    private ArrayList<Carta> cartas;            // Lista con las 52 cartas del mazo
    
    /**
     * Constructor vacío
     * Inicializa numerosPosibles con los 13 números de la baraja
     * y luego crea las 52 cartas combinando números con palos
     */
    public Naipe() {
        // Inicializamos las listas
        this.numerosPosibles = new ArrayList<>();
        this.cartas = new ArrayList<>();
        
        // Agregamos los 13 números al ArrayList numerosPosibles
        // A vale 11, números del 2 al 10 valen su número, J, Q, K valen 10
        numerosPosibles.add(new Numero("A", 11));
        numerosPosibles.add(new Numero("2", 2));
        numerosPosibles.add(new Numero("3", 3));
        numerosPosibles.add(new Numero("4", 4));
        numerosPosibles.add(new Numero("5", 5));
        numerosPosibles.add(new Numero("6", 6));
        numerosPosibles.add(new Numero("7", 7));
        numerosPosibles.add(new Numero("8", 8));
        numerosPosibles.add(new Numero("9", 9));
        numerosPosibles.add(new Numero("10", 10));
        numerosPosibles.add(new Numero("J", 10));
        numerosPosibles.add(new Numero("Q", 10));
        numerosPosibles.add(new Numero("K", 10));
        
        // Creamos un objeto Palos para obtener los 4 palos
        Palos palos = new Palos();
        
        // Usamos un for para combinar cada número con cada palo
        // Esto nos dará las 52 cartas (13 números x 4 palos = 52 cartas)
        for (Numero num : numerosPosibles) {
            // Creamos 4 cartas por cada número (una por cada palo)
            cartas.add(new Carta(num, palos.getCorazonRojo()));
            cartas.add(new Carta(num, palos.getCorazonNegro()));
            cartas.add(new Carta(num, palos.getDiamante()));
            cartas.add(new Carta(num, palos.getTrebol()));
        }
    }
    
    // Getter para obtener las cartas
    // Solo agregamos getCartas, como indica el ejercicio
    public ArrayList<Carta> getCartas() {
        return cartas;
    }
    
    /**
     * Método para barajar las cartas
     * Copia las cartas de un ArrayList a otro en orden aleatorio
     * 
     * LÓGICA:
     * 1. Creamos un ArrayList auxiliar vacío
     * 2. Agregamos un atributo "estado" a cada carta (inicialmente "N" = no barajada)
     * 3. Hacemos 100 iteraciones:
     *    - Obtenemos una posición aleatoria con Random.obtenerPosicion()
     *    - Si la carta en esa posición tiene estado "N", la agregamos al auxiliar
     *      y cambiamos su estado a "C" (copiada)
     *    - Si ya tiene estado "C", no hacemos nada (ya fue barajada)
     * 4. Al final, auxiliar tendrá las 52 cartas en orden aleatorio
     * 5. Retornamos auxiliar
     */
    public ArrayList<Carta> barajar() {
        // Creamos el ArrayList auxiliar donde guardaremos las cartas barajadas
        ArrayList<Carta> auxiliar = new ArrayList<>();
        
        // Agregamos el atributo "estado" a la clase Carta
        // Para simplificar, usaremos un ArrayList paralelo de estados
        ArrayList<String> estados = new ArrayList<>();
        
        // Inicializamos todos los estados en "N" (no barajado)
        for (int i = 0; i < cartas.size(); i++) {
            estados.add("N");
        }
        
        // Hacemos 100 iteraciones para dar oportunidad de barajar todas las cartas
        for (int i = 0; i < 100; i++) {
            // Obtenemos una posición aleatoria entre 0 y 51
            int posicion = Random.obtenerPosicion();
            
            // Verificamos el estado de la carta en esa posición
            if (estados.get(posicion).equals("N")) {
                // Si el estado es "N", agregamos la carta al auxiliar
                auxiliar.add(cartas.get(posicion));
                // Cambiamos el estado a "C" (copiada/barajada)
                estados.set(posicion, "C");
            }
            // Si el estado es "C", no hacemos nada (carta ya fue agregada)
        }
        
        // Después de las 100 iteraciones, es posible que algunas cartas
        // no se hayan agregado. Recorremos el ArrayList y agregamos
        // las que faltan (las que siguen con estado "N")
        for (int i = 0; i < cartas.size(); i++) {
            if (estados.get(i).equals("N")) {
                auxiliar.add(cartas.get(i));
            }
        }
        
        // Retornamos el ArrayList auxiliar con las 52 cartas en orden aleatorio
        return auxiliar;
    }
}