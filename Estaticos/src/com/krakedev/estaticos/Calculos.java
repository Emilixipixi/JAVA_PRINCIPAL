package com.krakedev.estaticos;

public class Calculos {
	private final double IVA=12;
	
	public double calculaIva(double monto) {
		
		return monto*IVA/100;
	}
}
