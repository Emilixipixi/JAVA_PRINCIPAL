package krakedev.entidades;

import java.util.ArrayList;

/**
 * Clase que representa a un estudiante
 * Cada estudiante tiene información personal y una lista de notas
 */
public class Estudiante {
    // Atributos del estudiante
    private String cedula;
    private String nombre;
    private String apellido;
    private ArrayList<Nota> notas;  // Lista que guarda todas las notas del estudiante
    
    // Constructor: crea un nuevo estudiante
    // Inicializamos el ArrayList para poder usarlo después
    public Estudiante(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = new ArrayList<Nota>();  // Creamos la lista vacía
    }
    
    // Métodos getter y setter
    public String getCedula() {
        return cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public ArrayList<Nota> getNotas() {
        return notas;
    }
    
    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }
    
    /**
     * Método agregarNota: agrega una nueva nota al estudiante
     * Verificaciones:
     * 1. La calificación debe estar entre 0 y 10
     * 2. No debe existir otra nota de la misma materia
     */
    public void agregarNota(Nota nuevaNota) {
        // Primero verificamos que la calificación sea válida (0 a 10)
        if (nuevaNota.getCalificacion() < 0 || nuevaNota.getCalificacion() > 10) {
            System.out.println("Error: La calificación debe estar entre 0 y 10");
            return;  // Salimos del método sin agregar nada
        }
        
        // Verificamos si ya existe una nota de esta materia
        // Recorremos todas las notas del estudiante
        for (int i = 0; i < notas.size(); i++) {
            Nota notaActual = notas.get(i);  // Obtenemos cada nota
            
            // Comparamos el código de la materia
            String codigoExistente = notaActual.getMateria().getCodigo();
            String codigoNuevo = nuevaNota.getMateria().getCodigo();
            
            if (codigoExistente.equals(codigoNuevo)) {
                System.out.println("Error: Ya existe una nota para la materia " + 
                                 nuevaNota.getMateria().getNombre());
                return;  // Salimos sin agregar
            }
        }
        
        // Si llegamos aquí, todo está bien y agregamos la nota
        notas.add(nuevaNota);
        System.out.println("Nota agregada correctamente");
    }
    
    /**
     * Método modificarNota: cambia la calificación de una materia existente
     * Busca la materia por su código y actualiza la calificación
     */
    public void modificarNota(String codigo, double nuevaCalificacion) {
        // Verificamos que la nueva calificación sea válida
        if (nuevaCalificacion < 0 || nuevaCalificacion > 10) {
            System.out.println("Error: La calificación debe estar entre 0 y 10");
            return;
        }
        
        // Buscamos la nota con ese código de materia
        boolean encontrada = false;
        
        for (int i = 0; i < notas.size(); i++) {
            Nota notaActual = notas.get(i);
            String codigoMateria = notaActual.getMateria().getCodigo();
            
            // Si encontramos la materia, modificamos la calificación
            if (codigoMateria.equals(codigo)) {
                notaActual.setCalificacion(nuevaCalificacion);
                System.out.println("Nota modificada correctamente");
                encontrada = true;
                break;  // Salimos del bucle porque ya la encontramos
            }
        }
        
        // Si no la encontramos, mostramos un mensaje
        if (!encontrada) {
            System.out.println("Error: No se encontró una materia con el código " + codigo);
        }
    }
    
    /**
     * Método calcularPromedioNotasEstudiante: calcula el promedio de todas las notas
     * Suma todas las calificaciones y las divide entre el número de materias
     */
    public double calcularPromedioNotasEstudiante() {
        // Si no tiene notas, el promedio es 0
        if (notas.size() == 0) {
            return 0.0;
        }
        
        // Variable para acumular la suma de todas las notas
        double suma = 0.0;
        
        // Recorremos todas las notas y las sumamos
        for (int i = 0; i < notas.size(); i++) {
            Nota notaActual = notas.get(i);
            suma = suma + notaActual.getCalificacion();
        }
        
        // Calculamos el promedio: suma total / cantidad de notas
        double promedio = suma / notas.size();
        
        return promedio;
    }
    
    /**
     * Método mostrar: imprime toda la información del estudiante
     * Incluye sus datos personales y todas sus notas
     */
    public void mostrar() {
        // Imprimimos los datos básicos del estudiante
        System.out.println("Estudiante[cedula=" + cedula + 
                         ", nombre=" + nombre + 
                         ", apellido=" + apellido + "]");
        
        // Imprimimos todas sus notas
        System.out.println("Notas del estudiante:");
        for (int i = 0; i < notas.size(); i++) {
            Nota notaActual = notas.get(i);
            // Usamos el método mostrar de la clase Nota
            notaActual.mostrar();
        }
        
        // Mostramos el promedio
        System.out.println("Promedio: " + calcularPromedioNotasEstudiante());
    }
}