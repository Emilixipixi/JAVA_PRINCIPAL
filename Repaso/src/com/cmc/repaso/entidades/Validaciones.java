package com.cmc.repaso.entidades;

public class Validaciones {
	public boolean validarMonto(double monto) {
        if (monto > 0) {
            return true;
        } else {
            return false;
        }
    }
	

}
