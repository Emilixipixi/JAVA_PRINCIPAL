package krakedev.entidades;

import java.util.ArrayList;

/**
 * Clase que representa un curso
 * Un curso contiene una lista de estudiantes matriculados
 */
public class Curso {
    // Atributo: lista de estudiantes del curso
    private ArrayList<Estudiante> estudiantes;
    
    // Constructor: crea un curso vacío
    public Curso() {
        this.estudiantes = new ArrayList<Estudiante>();  // Inicializamos la lista vacía
    }
    
    // Métodos getter y setter
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    
    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    /**
     * Método buscarEstudiantePorCedula: busca un estudiante por su cédula
     * Si lo encuentra, retorna el estudiante
     * Si no lo encuentra, retorna null
     */
    public Estudiante buscarEstudiantePorCedula(String cedula) {
        // Recorremos todos los estudiantes del curso
        for (int i = 0; i < estudiantes.size(); i++) {
            Estudiante estudianteActual = estudiantes.get(i);
            
            // Comparamos la cédula
            if (estudianteActual.getCedula().equals(cedula)) {
                // Si encontramos al estudiante, lo retornamos
                return estudianteActual;
            }
        }
        
        // Si llegamos aquí, no lo encontramos, retornamos null
        return null;
    }
    
    /**
     * Método matricularEstudiante: agrega un estudiante al curso
     * Primero verifica que no esté ya matriculado (usando su cédula)
     */
    public void matricularEstudiante(Estudiante estudiante) {
        // Buscamos si ya está matriculado usando el método anterior
        Estudiante estudianteEncontrado = buscarEstudiantePorCedula(estudiante.getCedula());
        
        // Si es null, significa que no está matriculado
        if (estudianteEncontrado == null) {
            // Lo agregamos al curso
            estudiantes.add(estudiante);
            System.out.println("Estudiante " + estudiante.getNombre() + 
                             " matriculado correctamente");
        } else {
            // Si ya existe, mostramos un mensaje
            System.out.println("Error: El estudiante con cédula " + 
                             estudiante.getCedula() + " ya está matriculado");
        }
    }
    
    /**
     * Método calcularPromedioCurso: calcula el promedio general del curso
     * Suma los promedios individuales de cada estudiante y los divide
     * entre el número de estudiantes
     */
    public double calcularPromedioCurso() {
        // Si no hay estudiantes, el promedio es 0
        if (estudiantes.size() == 0) {
            return 0.0;
        }
        
        // Variable para acumular la suma de promedios
        double sumaPromedios = 0.0;
        
        // Recorremos todos los estudiantes
        for (int i = 0; i < estudiantes.size(); i++) {
            Estudiante estudianteActual = estudiantes.get(i);
            
            // Obtenemos el promedio de cada estudiante y lo sumamos
            double promedioEstudiante = estudianteActual.calcularPromedioNotasEstudiante();
            sumaPromedios = sumaPromedios + promedioEstudiante;
        }
        
        // Calculamos el promedio del curso
        double promedioCurso = sumaPromedios / estudiantes.size();
        
        return promedioCurso;
    }
    
    /**
     * Método mostrar: imprime toda la información del curso
     * Muestra la cantidad de estudiantes y la información de cada uno
     */
    public void mostrar() {
        System.out.println("=== INFORMACIÓN DEL CURSO ===");
        System.out.println("Cantidad de estudiantes: " + estudiantes.size());
        System.out.println("Promedio del curso: " + calcularPromedioCurso());
        System.out.println();
        
        // Recorremos y mostramos cada estudiante
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println("--- Estudiante " + (i + 1) + " ---");
            Estudiante estudianteActual = estudiantes.get(i);
            // Usamos el método mostrar de la clase Estudiante
            estudianteActual.mostrar();
            System.out.println();
        }
    }
}