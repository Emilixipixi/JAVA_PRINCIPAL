package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Prestamo;
import com.cmc.evaluacion.entidades.Cliente;
import java.util.ArrayList;

/**
 * Clase Banco - Maneja clientes y préstamos
 */
public class Banco {
    // Atributos
    private ArrayList<Prestamo> prestamos;    // Lista de préstamos
    private ArrayList<Cliente> clientes;      // Lista de clientes
    
    /**
     * Constructor - Inicializa las listas vacías
     */
    public Banco() {
        this.prestamos = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }
    
    // Getters
    
    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }
    
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    /**
     * Método buscarCliente - Busca un cliente por su cédula
     * @param cedula - cédula del cliente a buscar
     * @return el Cliente si existe, null si no existe
     */
    public Cliente buscarCliente(String cedula) {
        // Recorrer la lista de clientes
        for (int i = 0; i < clientes.size(); i++) {
            // Obtener el cliente actual
            Cliente cliente = clientes.get(i);
            
            // Comparar la cédula
            if (cliente.getCedula().equals(cedula)) {
                // Si coincide, retornar el cliente
                return cliente;
            }
        }
        
        // Si no se encontró, retornar null
        return null;
    }
    
    /**
     * Método registrarCliente - Registra un nuevo cliente
     * @param cliente - el cliente a registrar
     */
    public void registrarCliente(Cliente cliente) {
        // Verificar si el cliente ya existe
        Cliente clienteExistente = buscarCliente(cliente.getCedula());
        
        // Solo agregar si no existe
        if (clienteExistente == null) {
            clientes.add(cliente);
            System.out.println("Cliente registrado: " + cliente.getNombre() + 
                             " " + cliente.getApellido() + 
                             " [cedula=" + cliente.getCedula() + 
                             ", nombre=" + cliente.getNombre() + 
                             ", apellido=" + cliente.getApellido() + "]");
        } else {
            System.out.println("Cliente ya existe [cedula=" + 
                             cliente.getCedula() + "]");
        }
    }
    
    /**
     * Método asignarPrestamo - Asigna un préstamo a un cliente
     * @param cedula - cédula del cliente
     * @param prestamo - el préstamo a asignar
     */
    public void asignarPrestamo(String cedula, Prestamo prestamo) {
        // Paso 1: Validar si el cliente existe
        Cliente cliente = buscarCliente(cedula);
        
        if (cliente == null) {
            // Si no existe, mostrar mensaje
            System.out.println("no es cliente del banco");
        } else {
            // Si existe, agregar el préstamo
            prestamos.add(prestamo);
            
            System.out.println("Cliente: " + cliente.getNombre() + " " + 
                             cliente.getApellido());
            prestamo.mostrarPrestamo();
        }
    }
    
    /**
     * Método buscarPrestamos - Busca todos los préstamos de un cliente
     * @param cedula - cédula del cliente
     * @return ArrayList con los préstamos del cliente, null si no tiene
     */
    public ArrayList<Prestamo> buscarPrestamos(String cedula) {
        // Primero verificar si el cliente existe
        Cliente cliente = buscarCliente(cedula);
        
        if (cliente == null) {
            // Si no existe, retornar null
            return null;
        }
        
        // Para este ejercicio simplificado, retornamos todos los préstamos
        // En un sistema real, cada préstamo debería tener referencia al cliente
        if (prestamos.isEmpty()) {
            return null;
        }
        
        return prestamos;
    }
}