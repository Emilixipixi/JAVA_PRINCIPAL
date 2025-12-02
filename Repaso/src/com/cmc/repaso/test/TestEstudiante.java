package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante("Juan");
        e1.calificar(9);
        
        System.out.println("Nombre: " + e1.nombre);
        System.out.println("Nota: " + e1.nota);
        System.out.println("Resultado: " + e1.resultado);

	}

}
