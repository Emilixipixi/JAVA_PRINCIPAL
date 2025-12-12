package com.krakedev.estaticos.ejercicio.entidades;

import com.krakedev.estaticos.ejercicio.utils.Util;

// Esta clase representa una alarma con día, hora y minuto
public class Alarma {
    // Atributos: guardamos el día, hora y minuto de la alarma
    private int dia;
    private int hora;
    private int minuto;
    
    // Constructor: se usa para crear una alarma nueva
    // Recibe 3 números: el día, la hora y el minuto
    public Alarma(int dia, int hora, int minuto) {
        this.dia = dia;
        this.hora = hora;
        this.minuto = minuto;
    }
    
    // Getters: nos permiten obtener los valores
    public int getDia() {
        return dia;
    }
    
    public int getHora() {
        return hora;
    }
    
    public int getMinuto() {
        return minuto;
    }
    
    // Setters: nos permiten cambiar los valores
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public void setHora(int hora) {
        this.hora = hora;
    }
    
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    
    // toString: muestra la información de la alarma de forma bonita
    // Por ejemplo: "Lunes, 05:24"
    @Override
    public String toString() {
        // Usamos los métodos estáticos de la clase Util para dar formato
        String diaFormateado = Util.formatearDia(dia);
        String horaFormateada = Util.formatearHora(hora);
        String minutoFormateado = Util.formatearHora(minuto);
        
        return diaFormateado + ", " + horaFormateada + ":" + minutoFormateado;
    }
}