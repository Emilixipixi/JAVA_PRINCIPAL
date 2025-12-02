package com.cmc.repaso.entidades;

public class Estudiante {
	public String nombre;
    public double nota;
    public String resultado;
    
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }
    
    public void calificar(double nota) {
        this.nota = nota;
        
        if (nota < 8) {
            resultado = "F";
        } else {
            resultado = "A";
        }
    }

}
