package com.krakedev.evaluacion;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Clase que representa un directorio de contactos
 * Permite agregar, buscar y gestionar contactos
 */
public class Directorio {
    // Lista de contactos
    private ArrayList<Contacto> contactos;
    
    // Fecha de última modificación
    private Date fechaModificacion;
    
    // Listas para separar contactos correctos e incorrectos
    private ArrayList<Contacto> correctos;
    private ArrayList<Contacto> incorrectos;
    
    /**
     * Constructor que inicializa las listas
     */
    public Directorio() {
        // Inicializar la lista de contactos vacía
        this.contactos = new ArrayList<Contacto>();
        
        // Inicializar las listas de correctos e incorrectos
        this.correctos = new ArrayList<Contacto>();
        this.incorrectos = new ArrayList<Contacto>();
    }
    
    // Getters
    public ArrayList<Contacto> getContactos() {
        return contactos;
    }
    
    public Date getFechaModificacion() {
        return fechaModificacion;
    }
    
    public ArrayList<Contacto> getCorrectos() {
        return correctos;
    }
    
    public ArrayList<Contacto> getIncorrectos() {
        return incorrectos;
    }
    
    /**
     * Método para buscar un contacto por su cédula
     * @param cedula la cédula a buscar
     * @return el Contacto si lo encuentra, null si no existe
     */
    public Contacto buscarPorCedula(String cedula) {
        // Recorrer todos los contactos
        for(int i = 0; i < contactos.size(); i++) {
            // Obtener el contacto en la posición i
            Contacto contacto = contactos.get(i);
            
            // Comparar la cédula del contacto con la cédula buscada
            if(contacto.getCedula().equals(cedula)) {
                // Si coincide, retornar el contacto encontrado
                return contacto;
            }
        }
        
        // Si no se encontró ningún contacto, retornar null
        return null;
    }
    
    /**
     * Método para agregar un contacto al directorio
     * No permite agregar contactos con cédula duplicada
     * @param contacto el contacto a agregar
     * @return true si lo agregó, false si la cédula ya existe
     */
    public boolean agregarContacto(Contacto contacto) {
        // Buscar si ya existe un contacto con esa cédula
        Contacto contactoEncontrado = buscarPorCedula(contacto.getCedula());
        
        // Si ya existe (no es null), no se puede agregar
        if(contactoEncontrado != null) {
            return false;
        }
        
        // Si no existe, agregarlo a la lista
        contactos.add(contacto);
        
        // Actualizar la fecha de última modificación con la fecha actual
        fechaModificacion = new Date();
        
        // Retornar true indicando que se agregó correctamente
        return true;
    }
    
    /**
     * Método para consultar la fecha de última modificación
     * @return String con la fecha en formato yyyy/MM/dd HH:mm:ss
     */
    public String consultarUltimaModificacion() {
        // Crear un formateador de fecha con el formato solicitado
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
        // Convertir la fecha a String usando el formato
        String fechaFormateada = formato.format(fechaModificacion);
        
        // Retornar la fecha formateada
        return fechaFormateada;
    }
    
    /**
     * Método para contar contactos sin dirección asignada
     * @return cantidad de contactos sin dirección
     */
    public int contarPerdidos() {
        // Variable para contar los contactos sin dirección
        int perdidos = 0;
        
        // Recorrer todos los contactos
        for(int i = 0; i < contactos.size(); i++) {
            // Obtener el contacto en la posición i
            Contacto contacto = contactos.get(i);
            
            // Verificar si la dirección es null
            if(contacto.getDireccion() == null) {
                // Incrementar el contador
                perdidos = perdidos + 1;
            }
        }
        
        // Retornar el total de contactos sin dirección
        return perdidos;
    }
    
    /**
     * Método para contar contactos con teléfonos fijos correctos
     * Un teléfono fijo es Convencional y en estado C
     * @return cantidad de contactos con teléfonos fijos correctos
     */
    public int contarFijos() {
        // Variable para contar los contactos con fijos
        int fijos = 0;
        
        // Recorrer todos los contactos
        for(int i = 0; i < contactos.size(); i++) {
            // Obtener el contacto en la posición i
            Contacto contacto = contactos.get(i);
            
            // Obtener la lista de teléfonos del contacto
            ArrayList<Telefono> telefonos = contacto.getTelefonos();
            
            // Recorrer todos los teléfonos del contacto
            for(int j = 0; j < telefonos.size(); j++) {
                // Obtener el teléfono en la posición j
                Telefono telefono = telefonos.get(j);
                
                // Verificar si es Convencional y está en estado C
                if(telefono.getTipo() != null && 
                   telefono.getTipo().equals("Convencional") && 
                   telefono.getEstado().equals("C")) {
                    // Incrementar el contador
                    fijos = fijos + 1;
                    // Salir del ciclo interno para no contar más teléfonos de este contacto
                    break;
                }
            }
        }
        
        // Retornar el total de contactos con fijos
        return fijos;
    }
    
    /**
     * Método para depurar los contactos
     * Separa los contactos con dirección (correctos) de los que no tienen (incorrectos)
     * Luego vacía la lista principal de contactos
     */
    public void depurar() {
        // Recorrer todos los contactos
        for(int i = 0; i < contactos.size(); i++) {
            // Obtener el contacto en la posición i
            Contacto contacto = contactos.get(i);
            
            // Verificar si tiene dirección asignada
            if(contacto.getDireccion() != null) {
                // Si tiene dirección, agregarlo a correctos
                correctos.add(contacto);
            } else {
                // Si no tiene dirección, agregarlo a incorrectos
                incorrectos.add(contacto);
            }
        }
        
        // Vaciar la lista de contactos
        contactos.clear();
    }
}