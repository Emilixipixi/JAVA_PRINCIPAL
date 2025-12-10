package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Prestamo;

/**
 * Clase CalculadoraAmortizacion
 * Esta clase calcula la cuota mensual de un préstamo
 * usando la fórmula de amortización francesa
 * NOTA: Todos los métodos son ESTÁTICOS (static)
 */
public class CalculadoraAmortizacion {
    
    /**
     * Método calcularCuota - Calcula el valor de la cuota mensual
     * Usa la fórmula: Cuota = (Co * i) / (1 - (1+i)^-n)
     * 
     * @param prestamo - el objeto Prestamo con los datos
     * @return el valor de la cuota mensual
     */
    public static double calcularCuota(Prestamo prestamo) {
        // Paso 1: Obtener los datos del préstamo
        double Co = prestamo.getMonto();           // Capital prestado
        double interesAnual = prestamo.getInteres(); // Interés anual (ejemplo: 12)
        int n = prestamo.getPlazo();               // Número de meses
        
        // Paso 2: Convertir el interés anual a interés mensual decimal
        // Si el interés anual es 12%, el mensual es 12/12 = 1%
        // Y en decimal: 1/100 = 0.01
        double i = (interesAnual / 12) / 100;
        
        // Paso 3: Aplicar la fórmula de amortización francesa
        // Numerador: Co * i
        double numerador = Co * i;
        
        // Denominador: 1 - (1+i)^-n
        // Math.pow(base, exponente) calcula potencias
        double denominador = 1 - Math.pow((1 + i), -n);
        
        // Paso 4: Calcular la cuota
        double cuota = numerador / denominador;
        
        // Paso 5: Retornar el resultado
        return cuota;
    }
    
    /**
     * Método generarTabla - Genera la tabla completa de amortización
     * @param prestamo - el objeto Prestamo
     */
    public static void generarTabla(Prestamo prestamo) {
        // PASO 1: Calcular la cuota usando el método que ya tenemos
        double valorCuota = calcularCuota(prestamo);
        
        // PASO 2: Inicializar las cuotas en el arreglo
        // El número de cuotas es igual al plazo
        for (int i = 0; i < prestamo.getPlazo(); i++) {
            // Crear una nueva cuota con su número (i+1 porque empezamos en 1)
            Cuota cuota = new Cuota(i + 1);
            
            // Asignar el valor de la cuota (siempre es el mismo)
            cuota.setCuota(valorCuota);
            
            // Guardar la cuota en el array del préstamo
            prestamo.getCuotas()[i] = cuota;
        }
        
        // PASO 3: Establecer el valor inicial del período en la primera cuota
        // Al inicio, el capital es todo el monto del préstamo
        prestamo.getCuotas()[0].setInicio(prestamo.getMonto());
        
        // PASO 4: Calcular el interés mensual en decimal
        double interesMensual = (prestamo.getInteres() / 12) / 100;
        
        // PASO 5: Iterar sobre todas las cuotas para calcular valores
        for (int i = 0; i < prestamo.getPlazo(); i++) {
            // Obtener la cuota actual
            Cuota cuotaActual = prestamo.getCuotas()[i];
            
            // Calcular el interés (capital al inicio * tasa mensual)
            double interesCalculado = cuotaActual.getInicio() * interesMensual;
            cuotaActual.setInteres(Utilitario.redondear(interesCalculado));
            
            // Calcular el abono al capital (cuota - interés)
            double abonoCapital = cuotaActual.getCuota() - cuotaActual.getInteres();
            cuotaActual.setAbonoCapital(Utilitario.redondear(abonoCapital));
            
            // Calcular el saldo (inicio - abono al capital)
            double saldo = cuotaActual.getInicio() - cuotaActual.getAbonoCapital();
            cuotaActual.setSaldo(Utilitario.redondear(saldo));
            
            // Establecer el capital al inicio para la siguiente cuota
            // (solo si no es la última cuota)
            if (i < prestamo.getPlazo() - 1) {
                prestamo.getCuotas()[i + 1].setInicio(cuotaActual.getSaldo());
            }
        }
        
        // PASO 6: Ajustar la última cuota
        // La última cuota puede tener un saldo diferente de 0 por redondeo
        Cuota ultimaCuota = prestamo.getCuotas()[prestamo.getPlazo() - 1];
        
        // Sumar el saldo pendiente a la última cuota
        double nuevaCuotaFinal = ultimaCuota.getCuota() + ultimaCuota.getSaldo();
        ultimaCuota.setCuota(Utilitario.redondear(nuevaCuotaFinal));
        
        // Recalcular el abono al capital de la última cuota
        double nuevoAbono = ultimaCuota.getCuota() - ultimaCuota.getInteres();
        ultimaCuota.setAbonoCapital(Utilitario.redondear(nuevoAbono));
        
        // Ajustar el saldo a 0
        ultimaCuota.setSaldo(0.0);
    }
    
    /**
     * Método mostrarTabla - Muestra la tabla de amortización en consola
     * @param prestamo - el objeto Prestamo con las cuotas calculadas
     */
    public static void mostrarTabla(Prestamo prestamo) {
        // Mostrar encabezado
        System.out.println("Numero | Cuota | Inicio | Interes | Abono | Saldo");
        System.out.println("------------------------------------------------------");
        
        // Recorrer todas las cuotas y mostrarlas
        for (int i = 0; i < prestamo.getPlazo(); i++) {
            prestamo.getCuotas()[i].mostrarPrestamo();
        }
    }
}