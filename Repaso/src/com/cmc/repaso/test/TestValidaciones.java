package com.cmc.repaso.test;

import  com.cmc.repaso.entidades.Validaciones;
public class TestValidaciones {

	public static void main(String[] args) {
		Validaciones validar = new Validaciones();
        
        System.out.println(validar.validarMonto(100));
        System.out.println(validar.validarMonto(0));
        System.out.println(validar.validarMonto(-50));
    }
}


